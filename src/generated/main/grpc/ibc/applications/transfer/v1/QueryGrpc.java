package ibc.applications.transfer.v1;

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
 * Query provides defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: ibc/applications/transfer/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "ibc.applications.transfer.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ibc.applications.transfer.v1.QueryDenomTraceRequest,
      ibc.applications.transfer.v1.QueryDenomTraceResponse> getDenomTraceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomTrace",
      requestType = ibc.applications.transfer.v1.QueryDenomTraceRequest.class,
      responseType = ibc.applications.transfer.v1.QueryDenomTraceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.applications.transfer.v1.QueryDenomTraceRequest,
      ibc.applications.transfer.v1.QueryDenomTraceResponse> getDenomTraceMethod() {
    io.grpc.MethodDescriptor<ibc.applications.transfer.v1.QueryDenomTraceRequest, ibc.applications.transfer.v1.QueryDenomTraceResponse> getDenomTraceMethod;
    if ((getDenomTraceMethod = QueryGrpc.getDenomTraceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomTraceMethod = QueryGrpc.getDenomTraceMethod) == null) {
          QueryGrpc.getDenomTraceMethod = getDenomTraceMethod = 
              io.grpc.MethodDescriptor.<ibc.applications.transfer.v1.QueryDenomTraceRequest, ibc.applications.transfer.v1.QueryDenomTraceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.applications.transfer.v1.Query", "DenomTrace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.transfer.v1.QueryDenomTraceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.transfer.v1.QueryDenomTraceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomTrace"))
                  .build();
          }
        }
     }
     return getDenomTraceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.applications.transfer.v1.QueryDenomTracesRequest,
      ibc.applications.transfer.v1.QueryDenomTracesResponse> getDenomTracesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomTraces",
      requestType = ibc.applications.transfer.v1.QueryDenomTracesRequest.class,
      responseType = ibc.applications.transfer.v1.QueryDenomTracesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.applications.transfer.v1.QueryDenomTracesRequest,
      ibc.applications.transfer.v1.QueryDenomTracesResponse> getDenomTracesMethod() {
    io.grpc.MethodDescriptor<ibc.applications.transfer.v1.QueryDenomTracesRequest, ibc.applications.transfer.v1.QueryDenomTracesResponse> getDenomTracesMethod;
    if ((getDenomTracesMethod = QueryGrpc.getDenomTracesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomTracesMethod = QueryGrpc.getDenomTracesMethod) == null) {
          QueryGrpc.getDenomTracesMethod = getDenomTracesMethod = 
              io.grpc.MethodDescriptor.<ibc.applications.transfer.v1.QueryDenomTracesRequest, ibc.applications.transfer.v1.QueryDenomTracesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.applications.transfer.v1.Query", "DenomTraces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.transfer.v1.QueryDenomTracesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.transfer.v1.QueryDenomTracesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomTraces"))
                  .build();
          }
        }
     }
     return getDenomTracesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.applications.transfer.v1.QueryParamsRequest,
      ibc.applications.transfer.v1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = ibc.applications.transfer.v1.QueryParamsRequest.class,
      responseType = ibc.applications.transfer.v1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.applications.transfer.v1.QueryParamsRequest,
      ibc.applications.transfer.v1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<ibc.applications.transfer.v1.QueryParamsRequest, ibc.applications.transfer.v1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod = 
              io.grpc.MethodDescriptor.<ibc.applications.transfer.v1.QueryParamsRequest, ibc.applications.transfer.v1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.applications.transfer.v1.Query", "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.transfer.v1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.transfer.v1.QueryParamsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
                  .build();
          }
        }
     }
     return getParamsMethod;
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
   * Query provides defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * DenomTrace queries a denomination trace information.
     * </pre>
     */
    public void denomTrace(ibc.applications.transfer.v1.QueryDenomTraceRequest request,
        io.grpc.stub.StreamObserver<ibc.applications.transfer.v1.QueryDenomTraceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDenomTraceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DenomTraces queries all denomination traces.
     * </pre>
     */
    public void denomTraces(ibc.applications.transfer.v1.QueryDenomTracesRequest request,
        io.grpc.stub.StreamObserver<ibc.applications.transfer.v1.QueryDenomTracesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDenomTracesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters of the ibc-transfer module.
     * </pre>
     */
    public void params(ibc.applications.transfer.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<ibc.applications.transfer.v1.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDenomTraceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.applications.transfer.v1.QueryDenomTraceRequest,
                ibc.applications.transfer.v1.QueryDenomTraceResponse>(
                  this, METHODID_DENOM_TRACE)))
          .addMethod(
            getDenomTracesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.applications.transfer.v1.QueryDenomTracesRequest,
                ibc.applications.transfer.v1.QueryDenomTracesResponse>(
                  this, METHODID_DENOM_TRACES)))
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.applications.transfer.v1.QueryParamsRequest,
                ibc.applications.transfer.v1.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service.
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
     * DenomTrace queries a denomination trace information.
     * </pre>
     */
    public void denomTrace(ibc.applications.transfer.v1.QueryDenomTraceRequest request,
        io.grpc.stub.StreamObserver<ibc.applications.transfer.v1.QueryDenomTraceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDenomTraceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DenomTraces queries all denomination traces.
     * </pre>
     */
    public void denomTraces(ibc.applications.transfer.v1.QueryDenomTracesRequest request,
        io.grpc.stub.StreamObserver<ibc.applications.transfer.v1.QueryDenomTracesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDenomTracesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters of the ibc-transfer module.
     * </pre>
     */
    public void params(ibc.applications.transfer.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<ibc.applications.transfer.v1.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service.
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
     * DenomTrace queries a denomination trace information.
     * </pre>
     */
    public ibc.applications.transfer.v1.QueryDenomTraceResponse denomTrace(ibc.applications.transfer.v1.QueryDenomTraceRequest request) {
      return blockingUnaryCall(
          getChannel(), getDenomTraceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DenomTraces queries all denomination traces.
     * </pre>
     */
    public ibc.applications.transfer.v1.QueryDenomTracesResponse denomTraces(ibc.applications.transfer.v1.QueryDenomTracesRequest request) {
      return blockingUnaryCall(
          getChannel(), getDenomTracesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries all parameters of the ibc-transfer module.
     * </pre>
     */
    public ibc.applications.transfer.v1.QueryParamsResponse params(ibc.applications.transfer.v1.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service.
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
     * DenomTrace queries a denomination trace information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.applications.transfer.v1.QueryDenomTraceResponse> denomTrace(
        ibc.applications.transfer.v1.QueryDenomTraceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDenomTraceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DenomTraces queries all denomination traces.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.applications.transfer.v1.QueryDenomTracesResponse> denomTraces(
        ibc.applications.transfer.v1.QueryDenomTracesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDenomTracesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries all parameters of the ibc-transfer module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.applications.transfer.v1.QueryParamsResponse> params(
        ibc.applications.transfer.v1.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DENOM_TRACE = 0;
  private static final int METHODID_DENOM_TRACES = 1;
  private static final int METHODID_PARAMS = 2;

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
        case METHODID_DENOM_TRACE:
          serviceImpl.denomTrace((ibc.applications.transfer.v1.QueryDenomTraceRequest) request,
              (io.grpc.stub.StreamObserver<ibc.applications.transfer.v1.QueryDenomTraceResponse>) responseObserver);
          break;
        case METHODID_DENOM_TRACES:
          serviceImpl.denomTraces((ibc.applications.transfer.v1.QueryDenomTracesRequest) request,
              (io.grpc.stub.StreamObserver<ibc.applications.transfer.v1.QueryDenomTracesResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((ibc.applications.transfer.v1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<ibc.applications.transfer.v1.QueryParamsResponse>) responseObserver);
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
      return ibc.applications.transfer.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getDenomTraceMethod())
              .addMethod(getDenomTracesMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
