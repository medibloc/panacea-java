package ibc.core.connection.v1;

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
    comments = "Source: ibc/core/connection/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "ibc.core.connection.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryConnectionRequest,
      ibc.core.connection.v1.QueryConnectionResponse> getConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Connection",
      requestType = ibc.core.connection.v1.QueryConnectionRequest.class,
      responseType = ibc.core.connection.v1.QueryConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryConnectionRequest,
      ibc.core.connection.v1.QueryConnectionResponse> getConnectionMethod() {
    io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryConnectionRequest, ibc.core.connection.v1.QueryConnectionResponse> getConnectionMethod;
    if ((getConnectionMethod = QueryGrpc.getConnectionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConnectionMethod = QueryGrpc.getConnectionMethod) == null) {
          QueryGrpc.getConnectionMethod = getConnectionMethod = 
              io.grpc.MethodDescriptor.<ibc.core.connection.v1.QueryConnectionRequest, ibc.core.connection.v1.QueryConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.connection.v1.Query", "Connection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.connection.v1.QueryConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.connection.v1.QueryConnectionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Connection"))
                  .build();
          }
        }
     }
     return getConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryConnectionsRequest,
      ibc.core.connection.v1.QueryConnectionsResponse> getConnectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Connections",
      requestType = ibc.core.connection.v1.QueryConnectionsRequest.class,
      responseType = ibc.core.connection.v1.QueryConnectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryConnectionsRequest,
      ibc.core.connection.v1.QueryConnectionsResponse> getConnectionsMethod() {
    io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryConnectionsRequest, ibc.core.connection.v1.QueryConnectionsResponse> getConnectionsMethod;
    if ((getConnectionsMethod = QueryGrpc.getConnectionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConnectionsMethod = QueryGrpc.getConnectionsMethod) == null) {
          QueryGrpc.getConnectionsMethod = getConnectionsMethod = 
              io.grpc.MethodDescriptor.<ibc.core.connection.v1.QueryConnectionsRequest, ibc.core.connection.v1.QueryConnectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.connection.v1.Query", "Connections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.connection.v1.QueryConnectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.connection.v1.QueryConnectionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Connections"))
                  .build();
          }
        }
     }
     return getConnectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryClientConnectionsRequest,
      ibc.core.connection.v1.QueryClientConnectionsResponse> getClientConnectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientConnections",
      requestType = ibc.core.connection.v1.QueryClientConnectionsRequest.class,
      responseType = ibc.core.connection.v1.QueryClientConnectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryClientConnectionsRequest,
      ibc.core.connection.v1.QueryClientConnectionsResponse> getClientConnectionsMethod() {
    io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryClientConnectionsRequest, ibc.core.connection.v1.QueryClientConnectionsResponse> getClientConnectionsMethod;
    if ((getClientConnectionsMethod = QueryGrpc.getClientConnectionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClientConnectionsMethod = QueryGrpc.getClientConnectionsMethod) == null) {
          QueryGrpc.getClientConnectionsMethod = getClientConnectionsMethod = 
              io.grpc.MethodDescriptor.<ibc.core.connection.v1.QueryClientConnectionsRequest, ibc.core.connection.v1.QueryClientConnectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.connection.v1.Query", "ClientConnections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.connection.v1.QueryClientConnectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.connection.v1.QueryClientConnectionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClientConnections"))
                  .build();
          }
        }
     }
     return getClientConnectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryConnectionClientStateRequest,
      ibc.core.connection.v1.QueryConnectionClientStateResponse> getConnectionClientStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConnectionClientState",
      requestType = ibc.core.connection.v1.QueryConnectionClientStateRequest.class,
      responseType = ibc.core.connection.v1.QueryConnectionClientStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryConnectionClientStateRequest,
      ibc.core.connection.v1.QueryConnectionClientStateResponse> getConnectionClientStateMethod() {
    io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryConnectionClientStateRequest, ibc.core.connection.v1.QueryConnectionClientStateResponse> getConnectionClientStateMethod;
    if ((getConnectionClientStateMethod = QueryGrpc.getConnectionClientStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConnectionClientStateMethod = QueryGrpc.getConnectionClientStateMethod) == null) {
          QueryGrpc.getConnectionClientStateMethod = getConnectionClientStateMethod = 
              io.grpc.MethodDescriptor.<ibc.core.connection.v1.QueryConnectionClientStateRequest, ibc.core.connection.v1.QueryConnectionClientStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.connection.v1.Query", "ConnectionClientState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.connection.v1.QueryConnectionClientStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.connection.v1.QueryConnectionClientStateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ConnectionClientState"))
                  .build();
          }
        }
     }
     return getConnectionClientStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryConnectionConsensusStateRequest,
      ibc.core.connection.v1.QueryConnectionConsensusStateResponse> getConnectionConsensusStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConnectionConsensusState",
      requestType = ibc.core.connection.v1.QueryConnectionConsensusStateRequest.class,
      responseType = ibc.core.connection.v1.QueryConnectionConsensusStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryConnectionConsensusStateRequest,
      ibc.core.connection.v1.QueryConnectionConsensusStateResponse> getConnectionConsensusStateMethod() {
    io.grpc.MethodDescriptor<ibc.core.connection.v1.QueryConnectionConsensusStateRequest, ibc.core.connection.v1.QueryConnectionConsensusStateResponse> getConnectionConsensusStateMethod;
    if ((getConnectionConsensusStateMethod = QueryGrpc.getConnectionConsensusStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConnectionConsensusStateMethod = QueryGrpc.getConnectionConsensusStateMethod) == null) {
          QueryGrpc.getConnectionConsensusStateMethod = getConnectionConsensusStateMethod = 
              io.grpc.MethodDescriptor.<ibc.core.connection.v1.QueryConnectionConsensusStateRequest, ibc.core.connection.v1.QueryConnectionConsensusStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.connection.v1.Query", "ConnectionConsensusState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.connection.v1.QueryConnectionConsensusStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.connection.v1.QueryConnectionConsensusStateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ConnectionConsensusState"))
                  .build();
          }
        }
     }
     return getConnectionConsensusStateMethod;
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
     * Connection queries an IBC connection end.
     * </pre>
     */
    public void connection(ibc.core.connection.v1.QueryConnectionRequest request,
        io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryConnectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Connections queries all the IBC connections of a chain.
     * </pre>
     */
    public void connections(ibc.core.connection.v1.QueryConnectionsRequest request,
        io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryConnectionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClientConnections queries the connection paths associated with a client
     * state.
     * </pre>
     */
    public void clientConnections(ibc.core.connection.v1.QueryClientConnectionsRequest request,
        io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryClientConnectionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClientConnectionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConnectionClientState queries the client state associated with the
     * connection.
     * </pre>
     */
    public void connectionClientState(ibc.core.connection.v1.QueryConnectionClientStateRequest request,
        io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryConnectionClientStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectionClientStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConnectionConsensusState queries the consensus state associated with the
     * connection.
     * </pre>
     */
    public void connectionConsensusState(ibc.core.connection.v1.QueryConnectionConsensusStateRequest request,
        io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryConnectionConsensusStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectionConsensusStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConnectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.connection.v1.QueryConnectionRequest,
                ibc.core.connection.v1.QueryConnectionResponse>(
                  this, METHODID_CONNECTION)))
          .addMethod(
            getConnectionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.connection.v1.QueryConnectionsRequest,
                ibc.core.connection.v1.QueryConnectionsResponse>(
                  this, METHODID_CONNECTIONS)))
          .addMethod(
            getClientConnectionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.connection.v1.QueryClientConnectionsRequest,
                ibc.core.connection.v1.QueryClientConnectionsResponse>(
                  this, METHODID_CLIENT_CONNECTIONS)))
          .addMethod(
            getConnectionClientStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.connection.v1.QueryConnectionClientStateRequest,
                ibc.core.connection.v1.QueryConnectionClientStateResponse>(
                  this, METHODID_CONNECTION_CLIENT_STATE)))
          .addMethod(
            getConnectionConsensusStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.connection.v1.QueryConnectionConsensusStateRequest,
                ibc.core.connection.v1.QueryConnectionConsensusStateResponse>(
                  this, METHODID_CONNECTION_CONSENSUS_STATE)))
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
     * Connection queries an IBC connection end.
     * </pre>
     */
    public void connection(ibc.core.connection.v1.QueryConnectionRequest request,
        io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryConnectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Connections queries all the IBC connections of a chain.
     * </pre>
     */
    public void connections(ibc.core.connection.v1.QueryConnectionsRequest request,
        io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryConnectionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClientConnections queries the connection paths associated with a client
     * state.
     * </pre>
     */
    public void clientConnections(ibc.core.connection.v1.QueryClientConnectionsRequest request,
        io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryClientConnectionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClientConnectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConnectionClientState queries the client state associated with the
     * connection.
     * </pre>
     */
    public void connectionClientState(ibc.core.connection.v1.QueryConnectionClientStateRequest request,
        io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryConnectionClientStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectionClientStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConnectionConsensusState queries the consensus state associated with the
     * connection.
     * </pre>
     */
    public void connectionConsensusState(ibc.core.connection.v1.QueryConnectionConsensusStateRequest request,
        io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryConnectionConsensusStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectionConsensusStateMethod(), getCallOptions()), request, responseObserver);
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
     * Connection queries an IBC connection end.
     * </pre>
     */
    public ibc.core.connection.v1.QueryConnectionResponse connection(ibc.core.connection.v1.QueryConnectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Connections queries all the IBC connections of a chain.
     * </pre>
     */
    public ibc.core.connection.v1.QueryConnectionsResponse connections(ibc.core.connection.v1.QueryConnectionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getConnectionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClientConnections queries the connection paths associated with a client
     * state.
     * </pre>
     */
    public ibc.core.connection.v1.QueryClientConnectionsResponse clientConnections(ibc.core.connection.v1.QueryClientConnectionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getClientConnectionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConnectionClientState queries the client state associated with the
     * connection.
     * </pre>
     */
    public ibc.core.connection.v1.QueryConnectionClientStateResponse connectionClientState(ibc.core.connection.v1.QueryConnectionClientStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getConnectionClientStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConnectionConsensusState queries the consensus state associated with the
     * connection.
     * </pre>
     */
    public ibc.core.connection.v1.QueryConnectionConsensusStateResponse connectionConsensusState(ibc.core.connection.v1.QueryConnectionConsensusStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getConnectionConsensusStateMethod(), getCallOptions(), request);
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
     * Connection queries an IBC connection end.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.connection.v1.QueryConnectionResponse> connection(
        ibc.core.connection.v1.QueryConnectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Connections queries all the IBC connections of a chain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.connection.v1.QueryConnectionsResponse> connections(
        ibc.core.connection.v1.QueryConnectionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClientConnections queries the connection paths associated with a client
     * state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.connection.v1.QueryClientConnectionsResponse> clientConnections(
        ibc.core.connection.v1.QueryClientConnectionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClientConnectionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConnectionClientState queries the client state associated with the
     * connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.connection.v1.QueryConnectionClientStateResponse> connectionClientState(
        ibc.core.connection.v1.QueryConnectionClientStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectionClientStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConnectionConsensusState queries the consensus state associated with the
     * connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.connection.v1.QueryConnectionConsensusStateResponse> connectionConsensusState(
        ibc.core.connection.v1.QueryConnectionConsensusStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectionConsensusStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONNECTION = 0;
  private static final int METHODID_CONNECTIONS = 1;
  private static final int METHODID_CLIENT_CONNECTIONS = 2;
  private static final int METHODID_CONNECTION_CLIENT_STATE = 3;
  private static final int METHODID_CONNECTION_CONSENSUS_STATE = 4;

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
        case METHODID_CONNECTION:
          serviceImpl.connection((ibc.core.connection.v1.QueryConnectionRequest) request,
              (io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryConnectionResponse>) responseObserver);
          break;
        case METHODID_CONNECTIONS:
          serviceImpl.connections((ibc.core.connection.v1.QueryConnectionsRequest) request,
              (io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryConnectionsResponse>) responseObserver);
          break;
        case METHODID_CLIENT_CONNECTIONS:
          serviceImpl.clientConnections((ibc.core.connection.v1.QueryClientConnectionsRequest) request,
              (io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryClientConnectionsResponse>) responseObserver);
          break;
        case METHODID_CONNECTION_CLIENT_STATE:
          serviceImpl.connectionClientState((ibc.core.connection.v1.QueryConnectionClientStateRequest) request,
              (io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryConnectionClientStateResponse>) responseObserver);
          break;
        case METHODID_CONNECTION_CONSENSUS_STATE:
          serviceImpl.connectionConsensusState((ibc.core.connection.v1.QueryConnectionConsensusStateRequest) request,
              (io.grpc.stub.StreamObserver<ibc.core.connection.v1.QueryConnectionConsensusStateResponse>) responseObserver);
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
      return ibc.core.connection.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getConnectionMethod())
              .addMethod(getConnectionsMethod())
              .addMethod(getClientConnectionsMethod())
              .addMethod(getConnectionClientStateMethod())
              .addMethod(getConnectionConsensusStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
