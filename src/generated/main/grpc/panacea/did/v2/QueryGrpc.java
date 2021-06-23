package panacea.did.v2;

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
    comments = "Source: panacea/did/v2/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "panacea.did.v2.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<panacea.did.v2.QueryGetDIDRequest,
      panacea.did.v2.QueryGetDIDResponse> getDIDDocumentWithSeqMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DIDDocumentWithSeq",
      requestType = panacea.did.v2.QueryGetDIDRequest.class,
      responseType = panacea.did.v2.QueryGetDIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<panacea.did.v2.QueryGetDIDRequest,
      panacea.did.v2.QueryGetDIDResponse> getDIDDocumentWithSeqMethod() {
    io.grpc.MethodDescriptor<panacea.did.v2.QueryGetDIDRequest, panacea.did.v2.QueryGetDIDResponse> getDIDDocumentWithSeqMethod;
    if ((getDIDDocumentWithSeqMethod = QueryGrpc.getDIDDocumentWithSeqMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDIDDocumentWithSeqMethod = QueryGrpc.getDIDDocumentWithSeqMethod) == null) {
          QueryGrpc.getDIDDocumentWithSeqMethod = getDIDDocumentWithSeqMethod = 
              io.grpc.MethodDescriptor.<panacea.did.v2.QueryGetDIDRequest, panacea.did.v2.QueryGetDIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "panacea.did.v2.Query", "DIDDocumentWithSeq"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.did.v2.QueryGetDIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  panacea.did.v2.QueryGetDIDResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DIDDocumentWithSeq"))
                  .build();
          }
        }
     }
     return getDIDDocumentWithSeqMethod;
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
    public void dIDDocumentWithSeq(panacea.did.v2.QueryGetDIDRequest request,
        io.grpc.stub.StreamObserver<panacea.did.v2.QueryGetDIDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDIDDocumentWithSeqMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDIDDocumentWithSeqMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                panacea.did.v2.QueryGetDIDRequest,
                panacea.did.v2.QueryGetDIDResponse>(
                  this, METHODID_DIDDOCUMENT_WITH_SEQ)))
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
    public void dIDDocumentWithSeq(panacea.did.v2.QueryGetDIDRequest request,
        io.grpc.stub.StreamObserver<panacea.did.v2.QueryGetDIDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDIDDocumentWithSeqMethod(), getCallOptions()), request, responseObserver);
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
    public panacea.did.v2.QueryGetDIDResponse dIDDocumentWithSeq(panacea.did.v2.QueryGetDIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getDIDDocumentWithSeqMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<panacea.did.v2.QueryGetDIDResponse> dIDDocumentWithSeq(
        panacea.did.v2.QueryGetDIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDIDDocumentWithSeqMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DIDDOCUMENT_WITH_SEQ = 0;

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
        case METHODID_DIDDOCUMENT_WITH_SEQ:
          serviceImpl.dIDDocumentWithSeq((panacea.did.v2.QueryGetDIDRequest) request,
              (io.grpc.stub.StreamObserver<panacea.did.v2.QueryGetDIDResponse>) responseObserver);
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
      return panacea.did.v2.QueryOuterClass.getDescriptor();
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
              .addMethod(getDIDDocumentWithSeqMethod())
              .build();
        }
      }
    }
    return result;
  }
}