package cosmos.base.tendermint.v1beta1;

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
 * Service defines the gRPC querier service for tendermint queries.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: cosmos/base/tendermint/v1beta1/query.proto")
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final String SERVICE_NAME = "cosmos.base.tendermint.v1beta1.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetNodeInfoRequest,
      cosmos.base.tendermint.v1beta1.GetNodeInfoResponse> getGetNodeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNodeInfo",
      requestType = cosmos.base.tendermint.v1beta1.GetNodeInfoRequest.class,
      responseType = cosmos.base.tendermint.v1beta1.GetNodeInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetNodeInfoRequest,
      cosmos.base.tendermint.v1beta1.GetNodeInfoResponse> getGetNodeInfoMethod() {
    io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetNodeInfoRequest, cosmos.base.tendermint.v1beta1.GetNodeInfoResponse> getGetNodeInfoMethod;
    if ((getGetNodeInfoMethod = ServiceGrpc.getGetNodeInfoMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetNodeInfoMethod = ServiceGrpc.getGetNodeInfoMethod) == null) {
          ServiceGrpc.getGetNodeInfoMethod = getGetNodeInfoMethod = 
              io.grpc.MethodDescriptor.<cosmos.base.tendermint.v1beta1.GetNodeInfoRequest, cosmos.base.tendermint.v1beta1.GetNodeInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.base.tendermint.v1beta1.Service", "GetNodeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.base.tendermint.v1beta1.GetNodeInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.base.tendermint.v1beta1.GetNodeInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetNodeInfo"))
                  .build();
          }
        }
     }
     return getGetNodeInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetSyncingRequest,
      cosmos.base.tendermint.v1beta1.GetSyncingResponse> getGetSyncingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSyncing",
      requestType = cosmos.base.tendermint.v1beta1.GetSyncingRequest.class,
      responseType = cosmos.base.tendermint.v1beta1.GetSyncingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetSyncingRequest,
      cosmos.base.tendermint.v1beta1.GetSyncingResponse> getGetSyncingMethod() {
    io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetSyncingRequest, cosmos.base.tendermint.v1beta1.GetSyncingResponse> getGetSyncingMethod;
    if ((getGetSyncingMethod = ServiceGrpc.getGetSyncingMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetSyncingMethod = ServiceGrpc.getGetSyncingMethod) == null) {
          ServiceGrpc.getGetSyncingMethod = getGetSyncingMethod = 
              io.grpc.MethodDescriptor.<cosmos.base.tendermint.v1beta1.GetSyncingRequest, cosmos.base.tendermint.v1beta1.GetSyncingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.base.tendermint.v1beta1.Service", "GetSyncing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.base.tendermint.v1beta1.GetSyncingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.base.tendermint.v1beta1.GetSyncingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetSyncing"))
                  .build();
          }
        }
     }
     return getGetSyncingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetLatestBlockRequest,
      cosmos.base.tendermint.v1beta1.GetLatestBlockResponse> getGetLatestBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestBlock",
      requestType = cosmos.base.tendermint.v1beta1.GetLatestBlockRequest.class,
      responseType = cosmos.base.tendermint.v1beta1.GetLatestBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetLatestBlockRequest,
      cosmos.base.tendermint.v1beta1.GetLatestBlockResponse> getGetLatestBlockMethod() {
    io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetLatestBlockRequest, cosmos.base.tendermint.v1beta1.GetLatestBlockResponse> getGetLatestBlockMethod;
    if ((getGetLatestBlockMethod = ServiceGrpc.getGetLatestBlockMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetLatestBlockMethod = ServiceGrpc.getGetLatestBlockMethod) == null) {
          ServiceGrpc.getGetLatestBlockMethod = getGetLatestBlockMethod = 
              io.grpc.MethodDescriptor.<cosmos.base.tendermint.v1beta1.GetLatestBlockRequest, cosmos.base.tendermint.v1beta1.GetLatestBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.base.tendermint.v1beta1.Service", "GetLatestBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.base.tendermint.v1beta1.GetLatestBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.base.tendermint.v1beta1.GetLatestBlockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetLatestBlock"))
                  .build();
          }
        }
     }
     return getGetLatestBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetBlockByHeightRequest,
      cosmos.base.tendermint.v1beta1.GetBlockByHeightResponse> getGetBlockByHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByHeight",
      requestType = cosmos.base.tendermint.v1beta1.GetBlockByHeightRequest.class,
      responseType = cosmos.base.tendermint.v1beta1.GetBlockByHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetBlockByHeightRequest,
      cosmos.base.tendermint.v1beta1.GetBlockByHeightResponse> getGetBlockByHeightMethod() {
    io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetBlockByHeightRequest, cosmos.base.tendermint.v1beta1.GetBlockByHeightResponse> getGetBlockByHeightMethod;
    if ((getGetBlockByHeightMethod = ServiceGrpc.getGetBlockByHeightMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetBlockByHeightMethod = ServiceGrpc.getGetBlockByHeightMethod) == null) {
          ServiceGrpc.getGetBlockByHeightMethod = getGetBlockByHeightMethod = 
              io.grpc.MethodDescriptor.<cosmos.base.tendermint.v1beta1.GetBlockByHeightRequest, cosmos.base.tendermint.v1beta1.GetBlockByHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.base.tendermint.v1beta1.Service", "GetBlockByHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.base.tendermint.v1beta1.GetBlockByHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.base.tendermint.v1beta1.GetBlockByHeightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetBlockByHeight"))
                  .build();
          }
        }
     }
     return getGetBlockByHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest,
      cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse> getGetLatestValidatorSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestValidatorSet",
      requestType = cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest.class,
      responseType = cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest,
      cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse> getGetLatestValidatorSetMethod() {
    io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest, cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse> getGetLatestValidatorSetMethod;
    if ((getGetLatestValidatorSetMethod = ServiceGrpc.getGetLatestValidatorSetMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetLatestValidatorSetMethod = ServiceGrpc.getGetLatestValidatorSetMethod) == null) {
          ServiceGrpc.getGetLatestValidatorSetMethod = getGetLatestValidatorSetMethod = 
              io.grpc.MethodDescriptor.<cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest, cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.base.tendermint.v1beta1.Service", "GetLatestValidatorSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetLatestValidatorSet"))
                  .build();
          }
        }
     }
     return getGetLatestValidatorSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequest,
      cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse> getGetValidatorSetByHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetValidatorSetByHeight",
      requestType = cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequest.class,
      responseType = cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequest,
      cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse> getGetValidatorSetByHeightMethod() {
    io.grpc.MethodDescriptor<cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequest, cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse> getGetValidatorSetByHeightMethod;
    if ((getGetValidatorSetByHeightMethod = ServiceGrpc.getGetValidatorSetByHeightMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetValidatorSetByHeightMethod = ServiceGrpc.getGetValidatorSetByHeightMethod) == null) {
          ServiceGrpc.getGetValidatorSetByHeightMethod = getGetValidatorSetByHeightMethod = 
              io.grpc.MethodDescriptor.<cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequest, cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.base.tendermint.v1beta1.Service", "GetValidatorSetByHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetValidatorSetByHeight"))
                  .build();
          }
        }
     }
     return getGetValidatorSetByHeightMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceStub newStub(io.grpc.Channel channel) {
    return new ServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service defines the gRPC querier service for tendermint queries.
   * </pre>
   */
  public static abstract class ServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetNodeInfo queries the current node info.
     * </pre>
     */
    public void getNodeInfo(cosmos.base.tendermint.v1beta1.GetNodeInfoRequest request,
        io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetNodeInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNodeInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSyncing queries node syncing.
     * </pre>
     */
    public void getSyncing(cosmos.base.tendermint.v1beta1.GetSyncingRequest request,
        io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetSyncingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSyncingMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLatestBlock returns the latest block.
     * </pre>
     */
    public void getLatestBlock(cosmos.base.tendermint.v1beta1.GetLatestBlockRequest request,
        io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetLatestBlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLatestBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBlockByHeight queries block for given height.
     * </pre>
     */
    public void getBlockByHeight(cosmos.base.tendermint.v1beta1.GetBlockByHeightRequest request,
        io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetBlockByHeightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByHeightMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLatestValidatorSet queries latest validator-set.
     * </pre>
     */
    public void getLatestValidatorSet(cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest request,
        io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLatestValidatorSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetValidatorSetByHeight queries validator-set at a given height.
     * </pre>
     */
    public void getValidatorSetByHeight(cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequest request,
        io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetValidatorSetByHeightMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNodeInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.base.tendermint.v1beta1.GetNodeInfoRequest,
                cosmos.base.tendermint.v1beta1.GetNodeInfoResponse>(
                  this, METHODID_GET_NODE_INFO)))
          .addMethod(
            getGetSyncingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.base.tendermint.v1beta1.GetSyncingRequest,
                cosmos.base.tendermint.v1beta1.GetSyncingResponse>(
                  this, METHODID_GET_SYNCING)))
          .addMethod(
            getGetLatestBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.base.tendermint.v1beta1.GetLatestBlockRequest,
                cosmos.base.tendermint.v1beta1.GetLatestBlockResponse>(
                  this, METHODID_GET_LATEST_BLOCK)))
          .addMethod(
            getGetBlockByHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.base.tendermint.v1beta1.GetBlockByHeightRequest,
                cosmos.base.tendermint.v1beta1.GetBlockByHeightResponse>(
                  this, METHODID_GET_BLOCK_BY_HEIGHT)))
          .addMethod(
            getGetLatestValidatorSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest,
                cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse>(
                  this, METHODID_GET_LATEST_VALIDATOR_SET)))
          .addMethod(
            getGetValidatorSetByHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequest,
                cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse>(
                  this, METHODID_GET_VALIDATOR_SET_BY_HEIGHT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service defines the gRPC querier service for tendermint queries.
   * </pre>
   */
  public static final class ServiceStub extends io.grpc.stub.AbstractStub<ServiceStub> {
    private ServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetNodeInfo queries the current node info.
     * </pre>
     */
    public void getNodeInfo(cosmos.base.tendermint.v1beta1.GetNodeInfoRequest request,
        io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetNodeInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSyncing queries node syncing.
     * </pre>
     */
    public void getSyncing(cosmos.base.tendermint.v1beta1.GetSyncingRequest request,
        io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetSyncingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSyncingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLatestBlock returns the latest block.
     * </pre>
     */
    public void getLatestBlock(cosmos.base.tendermint.v1beta1.GetLatestBlockRequest request,
        io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetLatestBlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLatestBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBlockByHeight queries block for given height.
     * </pre>
     */
    public void getBlockByHeight(cosmos.base.tendermint.v1beta1.GetBlockByHeightRequest request,
        io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetBlockByHeightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLatestValidatorSet queries latest validator-set.
     * </pre>
     */
    public void getLatestValidatorSet(cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest request,
        io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLatestValidatorSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetValidatorSetByHeight queries validator-set at a given height.
     * </pre>
     */
    public void getValidatorSetByHeight(cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequest request,
        io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetValidatorSetByHeightMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service defines the gRPC querier service for tendermint queries.
   * </pre>
   */
  public static final class ServiceBlockingStub extends io.grpc.stub.AbstractStub<ServiceBlockingStub> {
    private ServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetNodeInfo queries the current node info.
     * </pre>
     */
    public cosmos.base.tendermint.v1beta1.GetNodeInfoResponse getNodeInfo(cosmos.base.tendermint.v1beta1.GetNodeInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNodeInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSyncing queries node syncing.
     * </pre>
     */
    public cosmos.base.tendermint.v1beta1.GetSyncingResponse getSyncing(cosmos.base.tendermint.v1beta1.GetSyncingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSyncingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLatestBlock returns the latest block.
     * </pre>
     */
    public cosmos.base.tendermint.v1beta1.GetLatestBlockResponse getLatestBlock(cosmos.base.tendermint.v1beta1.GetLatestBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLatestBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBlockByHeight queries block for given height.
     * </pre>
     */
    public cosmos.base.tendermint.v1beta1.GetBlockByHeightResponse getBlockByHeight(cosmos.base.tendermint.v1beta1.GetBlockByHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByHeightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLatestValidatorSet queries latest validator-set.
     * </pre>
     */
    public cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse getLatestValidatorSet(cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLatestValidatorSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetValidatorSetByHeight queries validator-set at a given height.
     * </pre>
     */
    public cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse getValidatorSetByHeight(cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetValidatorSetByHeightMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service defines the gRPC querier service for tendermint queries.
   * </pre>
   */
  public static final class ServiceFutureStub extends io.grpc.stub.AbstractStub<ServiceFutureStub> {
    private ServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetNodeInfo queries the current node info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.base.tendermint.v1beta1.GetNodeInfoResponse> getNodeInfo(
        cosmos.base.tendermint.v1beta1.GetNodeInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSyncing queries node syncing.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.base.tendermint.v1beta1.GetSyncingResponse> getSyncing(
        cosmos.base.tendermint.v1beta1.GetSyncingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSyncingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLatestBlock returns the latest block.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.base.tendermint.v1beta1.GetLatestBlockResponse> getLatestBlock(
        cosmos.base.tendermint.v1beta1.GetLatestBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLatestBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBlockByHeight queries block for given height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.base.tendermint.v1beta1.GetBlockByHeightResponse> getBlockByHeight(
        cosmos.base.tendermint.v1beta1.GetBlockByHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByHeightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLatestValidatorSet queries latest validator-set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse> getLatestValidatorSet(
        cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLatestValidatorSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetValidatorSetByHeight queries validator-set at a given height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse> getValidatorSetByHeight(
        cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetValidatorSetByHeightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NODE_INFO = 0;
  private static final int METHODID_GET_SYNCING = 1;
  private static final int METHODID_GET_LATEST_BLOCK = 2;
  private static final int METHODID_GET_BLOCK_BY_HEIGHT = 3;
  private static final int METHODID_GET_LATEST_VALIDATOR_SET = 4;
  private static final int METHODID_GET_VALIDATOR_SET_BY_HEIGHT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NODE_INFO:
          serviceImpl.getNodeInfo((cosmos.base.tendermint.v1beta1.GetNodeInfoRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetNodeInfoResponse>) responseObserver);
          break;
        case METHODID_GET_SYNCING:
          serviceImpl.getSyncing((cosmos.base.tendermint.v1beta1.GetSyncingRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetSyncingResponse>) responseObserver);
          break;
        case METHODID_GET_LATEST_BLOCK:
          serviceImpl.getLatestBlock((cosmos.base.tendermint.v1beta1.GetLatestBlockRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetLatestBlockResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_HEIGHT:
          serviceImpl.getBlockByHeight((cosmos.base.tendermint.v1beta1.GetBlockByHeightRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetBlockByHeightResponse>) responseObserver);
          break;
        case METHODID_GET_LATEST_VALIDATOR_SET:
          serviceImpl.getLatestValidatorSet((cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse>) responseObserver);
          break;
        case METHODID_GET_VALIDATOR_SET_BY_HEIGHT:
          serviceImpl.getValidatorSetByHeight((cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse>) responseObserver);
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

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cosmos.base.tendermint.v1beta1.Query.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service");
    }
  }

  private static final class ServiceFileDescriptorSupplier
      extends ServiceBaseDescriptorSupplier {
    ServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceMethodDescriptorSupplier
      extends ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceFileDescriptorSupplier())
              .addMethod(getGetNodeInfoMethod())
              .addMethod(getGetSyncingMethod())
              .addMethod(getGetLatestBlockMethod())
              .addMethod(getGetBlockByHeightMethod())
              .addMethod(getGetLatestValidatorSetMethod())
              .addMethod(getGetValidatorSetByHeightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
