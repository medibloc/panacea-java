package org.medibloc.panacea;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;

public class PanaceaApiClientGenerator {
    private static final Converter.Factory converterFactory =
            JacksonConverterFactory.create(
                    new ObjectMapper()
                            .registerModule(new JodaModule())
                            .configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false));

    @SuppressWarnings("unchecked")
    private static final Converter<ResponseBody, PanaceaApiError> errorBodyConverter =
            (Converter<ResponseBody, PanaceaApiError>) converterFactory.responseBodyConverter(
                    PanaceaApiError.class, new Annotation[0], null);

    private static OkHttpClient sharedClient;
    static {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequestsPerHost(500);
        dispatcher.setMaxRequests(500);
        sharedClient = new OkHttpClient.Builder()
            .dispatcher(dispatcher)
            .pingInterval(20, TimeUnit.SECONDS)
            .build();
    }

    public static <S> S createService(Class<S> serviceClass, String baseUrl) {
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(converterFactory);

        retrofitBuilder.client(sharedClient);

        Retrofit retrofit = retrofitBuilder.build();

        return retrofit.create(serviceClass);
    }

    /**
     * Execute a REST call and block until the response is received.
     */
    public static <T> T executeSync(Call<T> call) throws PanaceaApiException {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                try {
                    PanaceaApiError apiError = getPanaceaApiError(response);
                    throw new PanaceaApiException(apiError);
                } catch (IOException e) {
                    throw new PanaceaApiException(response.toString(), e);
                }
            }
        } catch (IOException e) {
            throw new PanaceaApiException(e);
        }
    }

    /**
     * Extracts and converts the response error body into an object.
     */
    public static PanaceaApiError getPanaceaApiError(Response<?> response) throws IOException {
        ResponseBody errorBody = response.errorBody();
        if (errorBody == null) {
            return null;
        } else {
            assert errorBodyConverter != null;
            return errorBodyConverter.convert(errorBody);
        }
     }

    /**
     * Returns the shared OkHttpClient instance.
     */
    public static OkHttpClient getSharedClient() {
        return sharedClient;
    }

    /**
     * Add interceptor to shared client
     */
    public static void addInterceptor(Interceptor interceptor) {
        sharedClient = sharedClient.newBuilder().addInterceptor(interceptor).build();
    }
}
