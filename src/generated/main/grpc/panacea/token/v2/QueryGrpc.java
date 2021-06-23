package panacea.token.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: panacea/token/v2/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "panacea.token.v2.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<panacea.token.v2.QueryGetTokenRequest,
      panacea.token.v2.QueryGetTokenResponse> getTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Token",
      requestType = panacea.token.v2.QueryGetTokenRequest.class,
      responseType = panacea.token.v2.QueryGetTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<panacea.token.v2.QueryGetTokenRequest,
      panacea.token.v2.QueryGetTokenResponse> getTokenMethod() {
    io.grpc.MethodDescriptor<panacea.token.v2.QueryGetTokenRequest, panacea.token.v2.QueryGetTokenResponse> getTokenMethod;
    if ((getTokenMethod = QueryGrpc.getTokenMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTokenMethod = QueryGrpc.getTokenMethod) == null) {
          QueryGrpc.getTokenMethod = getTokenMethod = 
              io.grpc.MethodDescriptor.<panacea.token.v2.QueryGetTokenRequest, panacea.token.v2.QueryGetTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "panacea.token.v2.Query", "Token"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.token.v2.QueryGetTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.token.v2.QueryGetTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Token"))
                  .build();
          }
        }
     }
     return getTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<panacea.token.v2.QueryAllTokenRequest,
      panacea.token.v2.QueryAllTokenResponse> getTokenAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TokenAll",
      requestType = panacea.token.v2.QueryAllTokenRequest.class,
      responseType = panacea.token.v2.QueryAllTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<panacea.token.v2.QueryAllTokenRequest,
      panacea.token.v2.QueryAllTokenResponse> getTokenAllMethod() {
    io.grpc.MethodDescriptor<panacea.token.v2.QueryAllTokenRequest, panacea.token.v2.QueryAllTokenResponse> getTokenAllMethod;
    if ((getTokenAllMethod = QueryGrpc.getTokenAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTokenAllMethod = QueryGrpc.getTokenAllMethod) == null) {
          QueryGrpc.getTokenAllMethod = getTokenAllMethod = 
              io.grpc.MethodDescriptor.<panacea.token.v2.QueryAllTokenRequest, panacea.token.v2.QueryAllTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "panacea.token.v2.Query", "TokenAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.token.v2.QueryAllTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.token.v2.QueryAllTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TokenAll"))
                  .build();
          }
        }
     }
     return getTokenAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    return new QueryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueryFutureStub(channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * this line is used by starport scaffolding # 2
     * </pre>
     */
    public void token(panacea.token.v2.QueryGetTokenRequest request,
        io.grpc.stub.StreamObserver<panacea.token.v2.QueryGetTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTokenMethod(), responseObserver);
    }

    /**
     */
    public void tokenAll(panacea.token.v2.QueryAllTokenRequest request,
        io.grpc.stub.StreamObserver<panacea.token.v2.QueryAllTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTokenAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                panacea.token.v2.QueryGetTokenRequest,
                panacea.token.v2.QueryGetTokenResponse>(
                  this, METHODID_TOKEN)))
          .addMethod(
            getTokenAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                panacea.token.v2.QueryAllTokenRequest,
                panacea.token.v2.QueryAllTokenResponse>(
                  this, METHODID_TOKEN_ALL)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryStub extends io.grpc.stub.AbstractStub<QueryStub> {
    private QueryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # 2
     * </pre>
     */
    public void token(panacea.token.v2.QueryGetTokenRequest request,
        io.grpc.stub.StreamObserver<panacea.token.v2.QueryGetTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tokenAll(panacea.token.v2.QueryAllTokenRequest request,
        io.grpc.stub.StreamObserver<panacea.token.v2.QueryAllTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTokenAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryBlockingStub extends io.grpc.stub.AbstractStub<QueryBlockingStub> {
    private QueryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # 2
     * </pre>
     */
    public panacea.token.v2.QueryGetTokenResponse token(panacea.token.v2.QueryGetTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public panacea.token.v2.QueryAllTokenResponse tokenAll(panacea.token.v2.QueryAllTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getTokenAllMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryFutureStub extends io.grpc.stub.AbstractStub<QueryFutureStub> {
    private QueryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # 2
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<panacea.token.v2.QueryGetTokenResponse> token(
        panacea.token.v2.QueryGetTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<panacea.token.v2.QueryAllTokenResponse> tokenAll(
        panacea.token.v2.QueryAllTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTokenAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOKEN = 0;
  private static final int METHODID_TOKEN_ALL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TOKEN:
          serviceImpl.token((panacea.token.v2.QueryGetTokenRequest) request,
              (io.grpc.stub.StreamObserver<panacea.token.v2.QueryGetTokenResponse>) responseObserver);
          break;
        case METHODID_TOKEN_ALL:
          serviceImpl.tokenAll((panacea.token.v2.QueryAllTokenRequest) request,
              (io.grpc.stub.StreamObserver<panacea.token.v2.QueryAllTokenResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return panacea.token.v2.QueryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getTokenMethod())
              .addMethod(getTokenAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}