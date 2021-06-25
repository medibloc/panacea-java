package panacea.aol.v2;

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
    comments = "Source: panacea/aol/v2/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "panacea.aol.v2.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<panacea.aol.v2.QueryGetTopicRequest,
      panacea.aol.v2.QueryGetTopicResponse> getTopicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Topic",
      requestType = panacea.aol.v2.QueryGetTopicRequest.class,
      responseType = panacea.aol.v2.QueryGetTopicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<panacea.aol.v2.QueryGetTopicRequest,
      panacea.aol.v2.QueryGetTopicResponse> getTopicMethod() {
    io.grpc.MethodDescriptor<panacea.aol.v2.QueryGetTopicRequest, panacea.aol.v2.QueryGetTopicResponse> getTopicMethod;
    if ((getTopicMethod = QueryGrpc.getTopicMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTopicMethod = QueryGrpc.getTopicMethod) == null) {
          QueryGrpc.getTopicMethod = getTopicMethod = 
              io.grpc.MethodDescriptor.<panacea.aol.v2.QueryGetTopicRequest, panacea.aol.v2.QueryGetTopicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "panacea.aol.v2.Query", "Topic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.aol.v2.QueryGetTopicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.aol.v2.QueryGetTopicResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Topic"))
                  .build();
          }
        }
     }
     return getTopicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<panacea.aol.v2.QueryListTopicsRequest,
      panacea.aol.v2.QueryListTopicsResponse> getTopicsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Topics",
      requestType = panacea.aol.v2.QueryListTopicsRequest.class,
      responseType = panacea.aol.v2.QueryListTopicsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<panacea.aol.v2.QueryListTopicsRequest,
      panacea.aol.v2.QueryListTopicsResponse> getTopicsMethod() {
    io.grpc.MethodDescriptor<panacea.aol.v2.QueryListTopicsRequest, panacea.aol.v2.QueryListTopicsResponse> getTopicsMethod;
    if ((getTopicsMethod = QueryGrpc.getTopicsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTopicsMethod = QueryGrpc.getTopicsMethod) == null) {
          QueryGrpc.getTopicsMethod = getTopicsMethod = 
              io.grpc.MethodDescriptor.<panacea.aol.v2.QueryListTopicsRequest, panacea.aol.v2.QueryListTopicsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "panacea.aol.v2.Query", "Topics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.aol.v2.QueryListTopicsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.aol.v2.QueryListTopicsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Topics"))
                  .build();
          }
        }
     }
     return getTopicsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<panacea.aol.v2.QueryGetWriterRequest,
      panacea.aol.v2.QueryGetWriterResponse> getWriterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Writer",
      requestType = panacea.aol.v2.QueryGetWriterRequest.class,
      responseType = panacea.aol.v2.QueryGetWriterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<panacea.aol.v2.QueryGetWriterRequest,
      panacea.aol.v2.QueryGetWriterResponse> getWriterMethod() {
    io.grpc.MethodDescriptor<panacea.aol.v2.QueryGetWriterRequest, panacea.aol.v2.QueryGetWriterResponse> getWriterMethod;
    if ((getWriterMethod = QueryGrpc.getWriterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWriterMethod = QueryGrpc.getWriterMethod) == null) {
          QueryGrpc.getWriterMethod = getWriterMethod = 
              io.grpc.MethodDescriptor.<panacea.aol.v2.QueryGetWriterRequest, panacea.aol.v2.QueryGetWriterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "panacea.aol.v2.Query", "Writer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.aol.v2.QueryGetWriterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.aol.v2.QueryGetWriterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Writer"))
                  .build();
          }
        }
     }
     return getWriterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<panacea.aol.v2.QueryListWritersRequest,
      panacea.aol.v2.QueryListWritersResponse> getWritersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Writers",
      requestType = panacea.aol.v2.QueryListWritersRequest.class,
      responseType = panacea.aol.v2.QueryListWritersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<panacea.aol.v2.QueryListWritersRequest,
      panacea.aol.v2.QueryListWritersResponse> getWritersMethod() {
    io.grpc.MethodDescriptor<panacea.aol.v2.QueryListWritersRequest, panacea.aol.v2.QueryListWritersResponse> getWritersMethod;
    if ((getWritersMethod = QueryGrpc.getWritersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWritersMethod = QueryGrpc.getWritersMethod) == null) {
          QueryGrpc.getWritersMethod = getWritersMethod = 
              io.grpc.MethodDescriptor.<panacea.aol.v2.QueryListWritersRequest, panacea.aol.v2.QueryListWritersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "panacea.aol.v2.Query", "Writers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.aol.v2.QueryListWritersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.aol.v2.QueryListWritersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Writers"))
                  .build();
          }
        }
     }
     return getWritersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<panacea.aol.v2.QueryGetRecordRequest,
      panacea.aol.v2.QueryGetRecordResponse> getRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Record",
      requestType = panacea.aol.v2.QueryGetRecordRequest.class,
      responseType = panacea.aol.v2.QueryGetRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<panacea.aol.v2.QueryGetRecordRequest,
      panacea.aol.v2.QueryGetRecordResponse> getRecordMethod() {
    io.grpc.MethodDescriptor<panacea.aol.v2.QueryGetRecordRequest, panacea.aol.v2.QueryGetRecordResponse> getRecordMethod;
    if ((getRecordMethod = QueryGrpc.getRecordMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRecordMethod = QueryGrpc.getRecordMethod) == null) {
          QueryGrpc.getRecordMethod = getRecordMethod = 
              io.grpc.MethodDescriptor.<panacea.aol.v2.QueryGetRecordRequest, panacea.aol.v2.QueryGetRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "panacea.aol.v2.Query", "Record"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.aol.v2.QueryGetRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.aol.v2.QueryGetRecordResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Record"))
                  .build();
          }
        }
     }
     return getRecordMethod;
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
     */
    public void topic(panacea.aol.v2.QueryGetTopicRequest request,
        io.grpc.stub.StreamObserver<panacea.aol.v2.QueryGetTopicResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTopicMethod(), responseObserver);
    }

    /**
     */
    public void topics(panacea.aol.v2.QueryListTopicsRequest request,
        io.grpc.stub.StreamObserver<panacea.aol.v2.QueryListTopicsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTopicsMethod(), responseObserver);
    }

    /**
     */
    public void writer(panacea.aol.v2.QueryGetWriterRequest request,
        io.grpc.stub.StreamObserver<panacea.aol.v2.QueryGetWriterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWriterMethod(), responseObserver);
    }

    /**
     */
    public void writers(panacea.aol.v2.QueryListWritersRequest request,
        io.grpc.stub.StreamObserver<panacea.aol.v2.QueryListWritersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWritersMethod(), responseObserver);
    }

    /**
     */
    public void record(panacea.aol.v2.QueryGetRecordRequest request,
        io.grpc.stub.StreamObserver<panacea.aol.v2.QueryGetRecordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRecordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTopicMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                panacea.aol.v2.QueryGetTopicRequest,
                panacea.aol.v2.QueryGetTopicResponse>(
                  this, METHODID_TOPIC)))
          .addMethod(
            getTopicsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                panacea.aol.v2.QueryListTopicsRequest,
                panacea.aol.v2.QueryListTopicsResponse>(
                  this, METHODID_TOPICS)))
          .addMethod(
            getWriterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                panacea.aol.v2.QueryGetWriterRequest,
                panacea.aol.v2.QueryGetWriterResponse>(
                  this, METHODID_WRITER)))
          .addMethod(
            getWritersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                panacea.aol.v2.QueryListWritersRequest,
                panacea.aol.v2.QueryListWritersResponse>(
                  this, METHODID_WRITERS)))
          .addMethod(
            getRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                panacea.aol.v2.QueryGetRecordRequest,
                panacea.aol.v2.QueryGetRecordResponse>(
                  this, METHODID_RECORD)))
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
     */
    public void topic(panacea.aol.v2.QueryGetTopicRequest request,
        io.grpc.stub.StreamObserver<panacea.aol.v2.QueryGetTopicResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTopicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void topics(panacea.aol.v2.QueryListTopicsRequest request,
        io.grpc.stub.StreamObserver<panacea.aol.v2.QueryListTopicsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTopicsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void writer(panacea.aol.v2.QueryGetWriterRequest request,
        io.grpc.stub.StreamObserver<panacea.aol.v2.QueryGetWriterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void writers(panacea.aol.v2.QueryListWritersRequest request,
        io.grpc.stub.StreamObserver<panacea.aol.v2.QueryListWritersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWritersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void record(panacea.aol.v2.QueryGetRecordRequest request,
        io.grpc.stub.StreamObserver<panacea.aol.v2.QueryGetRecordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecordMethod(), getCallOptions()), request, responseObserver);
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
     */
    public panacea.aol.v2.QueryGetTopicResponse topic(panacea.aol.v2.QueryGetTopicRequest request) {
      return blockingUnaryCall(
          getChannel(), getTopicMethod(), getCallOptions(), request);
    }

    /**
     */
    public panacea.aol.v2.QueryListTopicsResponse topics(panacea.aol.v2.QueryListTopicsRequest request) {
      return blockingUnaryCall(
          getChannel(), getTopicsMethod(), getCallOptions(), request);
    }

    /**
     */
    public panacea.aol.v2.QueryGetWriterResponse writer(panacea.aol.v2.QueryGetWriterRequest request) {
      return blockingUnaryCall(
          getChannel(), getWriterMethod(), getCallOptions(), request);
    }

    /**
     */
    public panacea.aol.v2.QueryListWritersResponse writers(panacea.aol.v2.QueryListWritersRequest request) {
      return blockingUnaryCall(
          getChannel(), getWritersMethod(), getCallOptions(), request);
    }

    /**
     */
    public panacea.aol.v2.QueryGetRecordResponse record(panacea.aol.v2.QueryGetRecordRequest request) {
      return blockingUnaryCall(
          getChannel(), getRecordMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<panacea.aol.v2.QueryGetTopicResponse> topic(
        panacea.aol.v2.QueryGetTopicRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTopicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<panacea.aol.v2.QueryListTopicsResponse> topics(
        panacea.aol.v2.QueryListTopicsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTopicsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<panacea.aol.v2.QueryGetWriterResponse> writer(
        panacea.aol.v2.QueryGetWriterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWriterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<panacea.aol.v2.QueryListWritersResponse> writers(
        panacea.aol.v2.QueryListWritersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWritersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<panacea.aol.v2.QueryGetRecordResponse> record(
        panacea.aol.v2.QueryGetRecordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRecordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOPIC = 0;
  private static final int METHODID_TOPICS = 1;
  private static final int METHODID_WRITER = 2;
  private static final int METHODID_WRITERS = 3;
  private static final int METHODID_RECORD = 4;

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
        case METHODID_TOPIC:
          serviceImpl.topic((panacea.aol.v2.QueryGetTopicRequest) request,
              (io.grpc.stub.StreamObserver<panacea.aol.v2.QueryGetTopicResponse>) responseObserver);
          break;
        case METHODID_TOPICS:
          serviceImpl.topics((panacea.aol.v2.QueryListTopicsRequest) request,
              (io.grpc.stub.StreamObserver<panacea.aol.v2.QueryListTopicsResponse>) responseObserver);
          break;
        case METHODID_WRITER:
          serviceImpl.writer((panacea.aol.v2.QueryGetWriterRequest) request,
              (io.grpc.stub.StreamObserver<panacea.aol.v2.QueryGetWriterResponse>) responseObserver);
          break;
        case METHODID_WRITERS:
          serviceImpl.writers((panacea.aol.v2.QueryListWritersRequest) request,
              (io.grpc.stub.StreamObserver<panacea.aol.v2.QueryListWritersResponse>) responseObserver);
          break;
        case METHODID_RECORD:
          serviceImpl.record((panacea.aol.v2.QueryGetRecordRequest) request,
              (io.grpc.stub.StreamObserver<panacea.aol.v2.QueryGetRecordResponse>) responseObserver);
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
      return panacea.aol.v2.QueryOuterClass.getDescriptor();
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
              .addMethod(getTopicMethod())
              .addMethod(getTopicsMethod())
              .addMethod(getWriterMethod())
              .addMethod(getWritersMethod())
              .addMethod(getRecordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
