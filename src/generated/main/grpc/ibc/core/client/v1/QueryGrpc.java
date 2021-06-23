package ibc.core.client.v1;

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
 * Query provides defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: ibc/core/client/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "ibc.core.client.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ibc.core.client.v1.QueryClientStateRequest,
      ibc.core.client.v1.QueryClientStateResponse> getClientStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientState",
      requestType = ibc.core.client.v1.QueryClientStateRequest.class,
      responseType = ibc.core.client.v1.QueryClientStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.client.v1.QueryClientStateRequest,
      ibc.core.client.v1.QueryClientStateResponse> getClientStateMethod() {
    io.grpc.MethodDescriptor<ibc.core.client.v1.QueryClientStateRequest, ibc.core.client.v1.QueryClientStateResponse> getClientStateMethod;
    if ((getClientStateMethod = QueryGrpc.getClientStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClientStateMethod = QueryGrpc.getClientStateMethod) == null) {
          QueryGrpc.getClientStateMethod = getClientStateMethod = 
              io.grpc.MethodDescriptor.<ibc.core.client.v1.QueryClientStateRequest, ibc.core.client.v1.QueryClientStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.client.v1.Query", "ClientState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.client.v1.QueryClientStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.client.v1.QueryClientStateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClientState"))
                  .build();
          }
        }
     }
     return getClientStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.client.v1.QueryClientStatesRequest,
      ibc.core.client.v1.QueryClientStatesResponse> getClientStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientStates",
      requestType = ibc.core.client.v1.QueryClientStatesRequest.class,
      responseType = ibc.core.client.v1.QueryClientStatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.client.v1.QueryClientStatesRequest,
      ibc.core.client.v1.QueryClientStatesResponse> getClientStatesMethod() {
    io.grpc.MethodDescriptor<ibc.core.client.v1.QueryClientStatesRequest, ibc.core.client.v1.QueryClientStatesResponse> getClientStatesMethod;
    if ((getClientStatesMethod = QueryGrpc.getClientStatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClientStatesMethod = QueryGrpc.getClientStatesMethod) == null) {
          QueryGrpc.getClientStatesMethod = getClientStatesMethod = 
              io.grpc.MethodDescriptor.<ibc.core.client.v1.QueryClientStatesRequest, ibc.core.client.v1.QueryClientStatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.client.v1.Query", "ClientStates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.client.v1.QueryClientStatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.client.v1.QueryClientStatesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClientStates"))
                  .build();
          }
        }
     }
     return getClientStatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.client.v1.QueryConsensusStateRequest,
      ibc.core.client.v1.QueryConsensusStateResponse> getConsensusStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConsensusState",
      requestType = ibc.core.client.v1.QueryConsensusStateRequest.class,
      responseType = ibc.core.client.v1.QueryConsensusStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.client.v1.QueryConsensusStateRequest,
      ibc.core.client.v1.QueryConsensusStateResponse> getConsensusStateMethod() {
    io.grpc.MethodDescriptor<ibc.core.client.v1.QueryConsensusStateRequest, ibc.core.client.v1.QueryConsensusStateResponse> getConsensusStateMethod;
    if ((getConsensusStateMethod = QueryGrpc.getConsensusStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConsensusStateMethod = QueryGrpc.getConsensusStateMethod) == null) {
          QueryGrpc.getConsensusStateMethod = getConsensusStateMethod = 
              io.grpc.MethodDescriptor.<ibc.core.client.v1.QueryConsensusStateRequest, ibc.core.client.v1.QueryConsensusStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.client.v1.Query", "ConsensusState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.client.v1.QueryConsensusStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.client.v1.QueryConsensusStateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ConsensusState"))
                  .build();
          }
        }
     }
     return getConsensusStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.client.v1.QueryConsensusStatesRequest,
      ibc.core.client.v1.QueryConsensusStatesResponse> getConsensusStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConsensusStates",
      requestType = ibc.core.client.v1.QueryConsensusStatesRequest.class,
      responseType = ibc.core.client.v1.QueryConsensusStatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.client.v1.QueryConsensusStatesRequest,
      ibc.core.client.v1.QueryConsensusStatesResponse> getConsensusStatesMethod() {
    io.grpc.MethodDescriptor<ibc.core.client.v1.QueryConsensusStatesRequest, ibc.core.client.v1.QueryConsensusStatesResponse> getConsensusStatesMethod;
    if ((getConsensusStatesMethod = QueryGrpc.getConsensusStatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConsensusStatesMethod = QueryGrpc.getConsensusStatesMethod) == null) {
          QueryGrpc.getConsensusStatesMethod = getConsensusStatesMethod = 
              io.grpc.MethodDescriptor.<ibc.core.client.v1.QueryConsensusStatesRequest, ibc.core.client.v1.QueryConsensusStatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.client.v1.Query", "ConsensusStates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.client.v1.QueryConsensusStatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.client.v1.QueryConsensusStatesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ConsensusStates"))
                  .build();
          }
        }
     }
     return getConsensusStatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.client.v1.QueryClientParamsRequest,
      ibc.core.client.v1.QueryClientParamsResponse> getClientParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientParams",
      requestType = ibc.core.client.v1.QueryClientParamsRequest.class,
      responseType = ibc.core.client.v1.QueryClientParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.client.v1.QueryClientParamsRequest,
      ibc.core.client.v1.QueryClientParamsResponse> getClientParamsMethod() {
    io.grpc.MethodDescriptor<ibc.core.client.v1.QueryClientParamsRequest, ibc.core.client.v1.QueryClientParamsResponse> getClientParamsMethod;
    if ((getClientParamsMethod = QueryGrpc.getClientParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClientParamsMethod = QueryGrpc.getClientParamsMethod) == null) {
          QueryGrpc.getClientParamsMethod = getClientParamsMethod = 
              io.grpc.MethodDescriptor.<ibc.core.client.v1.QueryClientParamsRequest, ibc.core.client.v1.QueryClientParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.client.v1.Query", "ClientParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.client.v1.QueryClientParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.client.v1.QueryClientParamsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClientParams"))
                  .build();
          }
        }
     }
     return getClientParamsMethod;
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
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ClientState queries an IBC light client.
     * </pre>
     */
    public void clientState(ibc.core.client.v1.QueryClientStateRequest request,
        io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryClientStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClientStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClientStates queries all the IBC light clients of a chain.
     * </pre>
     */
    public void clientStates(ibc.core.client.v1.QueryClientStatesRequest request,
        io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryClientStatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClientStatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConsensusState queries a consensus state associated with a client state at
     * a given height.
     * </pre>
     */
    public void consensusState(ibc.core.client.v1.QueryConsensusStateRequest request,
        io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryConsensusStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConsensusStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConsensusStates queries all the consensus state associated with a given
     * client.
     * </pre>
     */
    public void consensusStates(ibc.core.client.v1.QueryConsensusStatesRequest request,
        io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryConsensusStatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConsensusStatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClientParams queries all parameters of the ibc client.
     * </pre>
     */
    public void clientParams(ibc.core.client.v1.QueryClientParamsRequest request,
        io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryClientParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClientParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClientStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.client.v1.QueryClientStateRequest,
                ibc.core.client.v1.QueryClientStateResponse>(
                  this, METHODID_CLIENT_STATE)))
          .addMethod(
            getClientStatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.client.v1.QueryClientStatesRequest,
                ibc.core.client.v1.QueryClientStatesResponse>(
                  this, METHODID_CLIENT_STATES)))
          .addMethod(
            getConsensusStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.client.v1.QueryConsensusStateRequest,
                ibc.core.client.v1.QueryConsensusStateResponse>(
                  this, METHODID_CONSENSUS_STATE)))
          .addMethod(
            getConsensusStatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.client.v1.QueryConsensusStatesRequest,
                ibc.core.client.v1.QueryConsensusStatesResponse>(
                  this, METHODID_CONSENSUS_STATES)))
          .addMethod(
            getClientParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.client.v1.QueryClientParamsRequest,
                ibc.core.client.v1.QueryClientParamsResponse>(
                  this, METHODID_CLIENT_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service
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
     * ClientState queries an IBC light client.
     * </pre>
     */
    public void clientState(ibc.core.client.v1.QueryClientStateRequest request,
        io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryClientStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClientStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClientStates queries all the IBC light clients of a chain.
     * </pre>
     */
    public void clientStates(ibc.core.client.v1.QueryClientStatesRequest request,
        io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryClientStatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClientStatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConsensusState queries a consensus state associated with a client state at
     * a given height.
     * </pre>
     */
    public void consensusState(ibc.core.client.v1.QueryConsensusStateRequest request,
        io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryConsensusStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConsensusStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConsensusStates queries all the consensus state associated with a given
     * client.
     * </pre>
     */
    public void consensusStates(ibc.core.client.v1.QueryConsensusStatesRequest request,
        io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryConsensusStatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConsensusStatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClientParams queries all parameters of the ibc client.
     * </pre>
     */
    public void clientParams(ibc.core.client.v1.QueryClientParamsRequest request,
        io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryClientParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClientParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service
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
     * ClientState queries an IBC light client.
     * </pre>
     */
    public ibc.core.client.v1.QueryClientStateResponse clientState(ibc.core.client.v1.QueryClientStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getClientStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClientStates queries all the IBC light clients of a chain.
     * </pre>
     */
    public ibc.core.client.v1.QueryClientStatesResponse clientStates(ibc.core.client.v1.QueryClientStatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getClientStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConsensusState queries a consensus state associated with a client state at
     * a given height.
     * </pre>
     */
    public ibc.core.client.v1.QueryConsensusStateResponse consensusState(ibc.core.client.v1.QueryConsensusStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getConsensusStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConsensusStates queries all the consensus state associated with a given
     * client.
     * </pre>
     */
    public ibc.core.client.v1.QueryConsensusStatesResponse consensusStates(ibc.core.client.v1.QueryConsensusStatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getConsensusStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClientParams queries all parameters of the ibc client.
     * </pre>
     */
    public ibc.core.client.v1.QueryClientParamsResponse clientParams(ibc.core.client.v1.QueryClientParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getClientParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service
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
     * ClientState queries an IBC light client.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.client.v1.QueryClientStateResponse> clientState(
        ibc.core.client.v1.QueryClientStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClientStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClientStates queries all the IBC light clients of a chain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.client.v1.QueryClientStatesResponse> clientStates(
        ibc.core.client.v1.QueryClientStatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClientStatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConsensusState queries a consensus state associated with a client state at
     * a given height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.client.v1.QueryConsensusStateResponse> consensusState(
        ibc.core.client.v1.QueryConsensusStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConsensusStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConsensusStates queries all the consensus state associated with a given
     * client.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.client.v1.QueryConsensusStatesResponse> consensusStates(
        ibc.core.client.v1.QueryConsensusStatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConsensusStatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClientParams queries all parameters of the ibc client.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.client.v1.QueryClientParamsResponse> clientParams(
        ibc.core.client.v1.QueryClientParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClientParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLIENT_STATE = 0;
  private static final int METHODID_CLIENT_STATES = 1;
  private static final int METHODID_CONSENSUS_STATE = 2;
  private static final int METHODID_CONSENSUS_STATES = 3;
  private static final int METHODID_CLIENT_PARAMS = 4;

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
        case METHODID_CLIENT_STATE:
          serviceImpl.clientState((ibc.core.client.v1.QueryClientStateRequest) request,
              (io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryClientStateResponse>) responseObserver);
          break;
        case METHODID_CLIENT_STATES:
          serviceImpl.clientStates((ibc.core.client.v1.QueryClientStatesRequest) request,
              (io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryClientStatesResponse>) responseObserver);
          break;
        case METHODID_CONSENSUS_STATE:
          serviceImpl.consensusState((ibc.core.client.v1.QueryConsensusStateRequest) request,
              (io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryConsensusStateResponse>) responseObserver);
          break;
        case METHODID_CONSENSUS_STATES:
          serviceImpl.consensusStates((ibc.core.client.v1.QueryConsensusStatesRequest) request,
              (io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryConsensusStatesResponse>) responseObserver);
          break;
        case METHODID_CLIENT_PARAMS:
          serviceImpl.clientParams((ibc.core.client.v1.QueryClientParamsRequest) request,
              (io.grpc.stub.StreamObserver<ibc.core.client.v1.QueryClientParamsResponse>) responseObserver);
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
      return ibc.core.client.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getClientStateMethod())
              .addMethod(getClientStatesMethod())
              .addMethod(getConsensusStateMethod())
              .addMethod(getConsensusStatesMethod())
              .addMethod(getClientParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
