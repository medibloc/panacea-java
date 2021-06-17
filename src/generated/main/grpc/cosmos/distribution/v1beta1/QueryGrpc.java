package cosmos.distribution.v1beta1;

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
 * Query defines the gRPC querier service for distribution module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: cosmos/distribution/v1beta1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmos.distribution.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryParamsRequest,
      cosmos.distribution.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = cosmos.distribution.v1beta1.QueryParamsRequest.class,
      responseType = cosmos.distribution.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryParamsRequest,
      cosmos.distribution.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryParamsRequest, cosmos.distribution.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod = 
              io.grpc.MethodDescriptor.<cosmos.distribution.v1beta1.QueryParamsRequest, cosmos.distribution.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.distribution.v1beta1.Query", "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryParamsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
                  .build();
          }
        }
     }
     return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest,
      cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse> getValidatorOutstandingRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorOutstandingRewards",
      requestType = cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest.class,
      responseType = cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest,
      cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse> getValidatorOutstandingRewardsMethod() {
    io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest, cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse> getValidatorOutstandingRewardsMethod;
    if ((getValidatorOutstandingRewardsMethod = QueryGrpc.getValidatorOutstandingRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorOutstandingRewardsMethod = QueryGrpc.getValidatorOutstandingRewardsMethod) == null) {
          QueryGrpc.getValidatorOutstandingRewardsMethod = getValidatorOutstandingRewardsMethod = 
              io.grpc.MethodDescriptor.<cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest, cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.distribution.v1beta1.Query", "ValidatorOutstandingRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorOutstandingRewards"))
                  .build();
          }
        }
     }
     return getValidatorOutstandingRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryValidatorCommissionRequest,
      cosmos.distribution.v1beta1.QueryValidatorCommissionResponse> getValidatorCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorCommission",
      requestType = cosmos.distribution.v1beta1.QueryValidatorCommissionRequest.class,
      responseType = cosmos.distribution.v1beta1.QueryValidatorCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryValidatorCommissionRequest,
      cosmos.distribution.v1beta1.QueryValidatorCommissionResponse> getValidatorCommissionMethod() {
    io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryValidatorCommissionRequest, cosmos.distribution.v1beta1.QueryValidatorCommissionResponse> getValidatorCommissionMethod;
    if ((getValidatorCommissionMethod = QueryGrpc.getValidatorCommissionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorCommissionMethod = QueryGrpc.getValidatorCommissionMethod) == null) {
          QueryGrpc.getValidatorCommissionMethod = getValidatorCommissionMethod = 
              io.grpc.MethodDescriptor.<cosmos.distribution.v1beta1.QueryValidatorCommissionRequest, cosmos.distribution.v1beta1.QueryValidatorCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.distribution.v1beta1.Query", "ValidatorCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryValidatorCommissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryValidatorCommissionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorCommission"))
                  .build();
          }
        }
     }
     return getValidatorCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryValidatorSlashesRequest,
      cosmos.distribution.v1beta1.QueryValidatorSlashesResponse> getValidatorSlashesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorSlashes",
      requestType = cosmos.distribution.v1beta1.QueryValidatorSlashesRequest.class,
      responseType = cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryValidatorSlashesRequest,
      cosmos.distribution.v1beta1.QueryValidatorSlashesResponse> getValidatorSlashesMethod() {
    io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryValidatorSlashesRequest, cosmos.distribution.v1beta1.QueryValidatorSlashesResponse> getValidatorSlashesMethod;
    if ((getValidatorSlashesMethod = QueryGrpc.getValidatorSlashesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorSlashesMethod = QueryGrpc.getValidatorSlashesMethod) == null) {
          QueryGrpc.getValidatorSlashesMethod = getValidatorSlashesMethod = 
              io.grpc.MethodDescriptor.<cosmos.distribution.v1beta1.QueryValidatorSlashesRequest, cosmos.distribution.v1beta1.QueryValidatorSlashesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.distribution.v1beta1.Query", "ValidatorSlashes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryValidatorSlashesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorSlashes"))
                  .build();
          }
        }
     }
     return getValidatorSlashesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryDelegationRewardsRequest,
      cosmos.distribution.v1beta1.QueryDelegationRewardsResponse> getDelegationRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegationRewards",
      requestType = cosmos.distribution.v1beta1.QueryDelegationRewardsRequest.class,
      responseType = cosmos.distribution.v1beta1.QueryDelegationRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryDelegationRewardsRequest,
      cosmos.distribution.v1beta1.QueryDelegationRewardsResponse> getDelegationRewardsMethod() {
    io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryDelegationRewardsRequest, cosmos.distribution.v1beta1.QueryDelegationRewardsResponse> getDelegationRewardsMethod;
    if ((getDelegationRewardsMethod = QueryGrpc.getDelegationRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegationRewardsMethod = QueryGrpc.getDelegationRewardsMethod) == null) {
          QueryGrpc.getDelegationRewardsMethod = getDelegationRewardsMethod = 
              io.grpc.MethodDescriptor.<cosmos.distribution.v1beta1.QueryDelegationRewardsRequest, cosmos.distribution.v1beta1.QueryDelegationRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.distribution.v1beta1.Query", "DelegationRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryDelegationRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryDelegationRewardsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegationRewards"))
                  .build();
          }
        }
     }
     return getDelegationRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryDelegationTotalRewardsRequest,
      cosmos.distribution.v1beta1.QueryDelegationTotalRewardsResponse> getDelegationTotalRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegationTotalRewards",
      requestType = cosmos.distribution.v1beta1.QueryDelegationTotalRewardsRequest.class,
      responseType = cosmos.distribution.v1beta1.QueryDelegationTotalRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryDelegationTotalRewardsRequest,
      cosmos.distribution.v1beta1.QueryDelegationTotalRewardsResponse> getDelegationTotalRewardsMethod() {
    io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryDelegationTotalRewardsRequest, cosmos.distribution.v1beta1.QueryDelegationTotalRewardsResponse> getDelegationTotalRewardsMethod;
    if ((getDelegationTotalRewardsMethod = QueryGrpc.getDelegationTotalRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegationTotalRewardsMethod = QueryGrpc.getDelegationTotalRewardsMethod) == null) {
          QueryGrpc.getDelegationTotalRewardsMethod = getDelegationTotalRewardsMethod = 
              io.grpc.MethodDescriptor.<cosmos.distribution.v1beta1.QueryDelegationTotalRewardsRequest, cosmos.distribution.v1beta1.QueryDelegationTotalRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.distribution.v1beta1.Query", "DelegationTotalRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryDelegationTotalRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryDelegationTotalRewardsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegationTotalRewards"))
                  .build();
          }
        }
     }
     return getDelegationTotalRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryDelegatorValidatorsRequest,
      cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse> getDelegatorValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorValidators",
      requestType = cosmos.distribution.v1beta1.QueryDelegatorValidatorsRequest.class,
      responseType = cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryDelegatorValidatorsRequest,
      cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse> getDelegatorValidatorsMethod() {
    io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryDelegatorValidatorsRequest, cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse> getDelegatorValidatorsMethod;
    if ((getDelegatorValidatorsMethod = QueryGrpc.getDelegatorValidatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorValidatorsMethod = QueryGrpc.getDelegatorValidatorsMethod) == null) {
          QueryGrpc.getDelegatorValidatorsMethod = getDelegatorValidatorsMethod = 
              io.grpc.MethodDescriptor.<cosmos.distribution.v1beta1.QueryDelegatorValidatorsRequest, cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.distribution.v1beta1.Query", "DelegatorValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryDelegatorValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorValidators"))
                  .build();
          }
        }
     }
     return getDelegatorValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequest,
      cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse> getDelegatorWithdrawAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorWithdrawAddress",
      requestType = cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequest.class,
      responseType = cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequest,
      cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse> getDelegatorWithdrawAddressMethod() {
    io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequest, cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse> getDelegatorWithdrawAddressMethod;
    if ((getDelegatorWithdrawAddressMethod = QueryGrpc.getDelegatorWithdrawAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorWithdrawAddressMethod = QueryGrpc.getDelegatorWithdrawAddressMethod) == null) {
          QueryGrpc.getDelegatorWithdrawAddressMethod = getDelegatorWithdrawAddressMethod = 
              io.grpc.MethodDescriptor.<cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequest, cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.distribution.v1beta1.Query", "DelegatorWithdrawAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorWithdrawAddress"))
                  .build();
          }
        }
     }
     return getDelegatorWithdrawAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryCommunityPoolRequest,
      cosmos.distribution.v1beta1.QueryCommunityPoolResponse> getCommunityPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommunityPool",
      requestType = cosmos.distribution.v1beta1.QueryCommunityPoolRequest.class,
      responseType = cosmos.distribution.v1beta1.QueryCommunityPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryCommunityPoolRequest,
      cosmos.distribution.v1beta1.QueryCommunityPoolResponse> getCommunityPoolMethod() {
    io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.QueryCommunityPoolRequest, cosmos.distribution.v1beta1.QueryCommunityPoolResponse> getCommunityPoolMethod;
    if ((getCommunityPoolMethod = QueryGrpc.getCommunityPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCommunityPoolMethod = QueryGrpc.getCommunityPoolMethod) == null) {
          QueryGrpc.getCommunityPoolMethod = getCommunityPoolMethod = 
              io.grpc.MethodDescriptor.<cosmos.distribution.v1beta1.QueryCommunityPoolRequest, cosmos.distribution.v1beta1.QueryCommunityPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.distribution.v1beta1.Query", "CommunityPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryCommunityPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.QueryCommunityPoolResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CommunityPool"))
                  .build();
          }
        }
     }
     return getCommunityPoolMethod;
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
   * Query defines the gRPC querier service for distribution module.
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Params queries params of the distribution module.
     * </pre>
     */
    public void params(cosmos.distribution.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorOutstandingRewards queries rewards of a validator address.
     * </pre>
     */
    public void validatorOutstandingRewards(cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidatorOutstandingRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorCommission queries accumulated commission for a validator.
     * </pre>
     */
    public void validatorCommission(cosmos.distribution.v1beta1.QueryValidatorCommissionRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryValidatorCommissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidatorCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorSlashes queries slash events of a validator.
     * </pre>
     */
    public void validatorSlashes(cosmos.distribution.v1beta1.QueryValidatorSlashesRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryValidatorSlashesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidatorSlashesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegationRewards queries the total rewards accrued by a delegation.
     * </pre>
     */
    public void delegationRewards(cosmos.distribution.v1beta1.QueryDelegationRewardsRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryDelegationRewardsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegationRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegationTotalRewards queries the total rewards accrued by a each
     * validator.
     * </pre>
     */
    public void delegationTotalRewards(cosmos.distribution.v1beta1.QueryDelegationTotalRewardsRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryDelegationTotalRewardsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegationTotalRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorValidators queries the validators of a delegator.
     * </pre>
     */
    public void delegatorValidators(cosmos.distribution.v1beta1.QueryDelegatorValidatorsRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegatorValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorWithdrawAddress queries withdraw address of a delegator.
     * </pre>
     */
    public void delegatorWithdrawAddress(cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegatorWithdrawAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * CommunityPool queries the community pool coins.
     * </pre>
     */
    public void communityPool(cosmos.distribution.v1beta1.QueryCommunityPoolRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryCommunityPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCommunityPoolMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.distribution.v1beta1.QueryParamsRequest,
                cosmos.distribution.v1beta1.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getValidatorOutstandingRewardsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest,
                cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse>(
                  this, METHODID_VALIDATOR_OUTSTANDING_REWARDS)))
          .addMethod(
            getValidatorCommissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.distribution.v1beta1.QueryValidatorCommissionRequest,
                cosmos.distribution.v1beta1.QueryValidatorCommissionResponse>(
                  this, METHODID_VALIDATOR_COMMISSION)))
          .addMethod(
            getValidatorSlashesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.distribution.v1beta1.QueryValidatorSlashesRequest,
                cosmos.distribution.v1beta1.QueryValidatorSlashesResponse>(
                  this, METHODID_VALIDATOR_SLASHES)))
          .addMethod(
            getDelegationRewardsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.distribution.v1beta1.QueryDelegationRewardsRequest,
                cosmos.distribution.v1beta1.QueryDelegationRewardsResponse>(
                  this, METHODID_DELEGATION_REWARDS)))
          .addMethod(
            getDelegationTotalRewardsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.distribution.v1beta1.QueryDelegationTotalRewardsRequest,
                cosmos.distribution.v1beta1.QueryDelegationTotalRewardsResponse>(
                  this, METHODID_DELEGATION_TOTAL_REWARDS)))
          .addMethod(
            getDelegatorValidatorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.distribution.v1beta1.QueryDelegatorValidatorsRequest,
                cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse>(
                  this, METHODID_DELEGATOR_VALIDATORS)))
          .addMethod(
            getDelegatorWithdrawAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequest,
                cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse>(
                  this, METHODID_DELEGATOR_WITHDRAW_ADDRESS)))
          .addMethod(
            getCommunityPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.distribution.v1beta1.QueryCommunityPoolRequest,
                cosmos.distribution.v1beta1.QueryCommunityPoolResponse>(
                  this, METHODID_COMMUNITY_POOL)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for distribution module.
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
     * Params queries params of the distribution module.
     * </pre>
     */
    public void params(cosmos.distribution.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorOutstandingRewards queries rewards of a validator address.
     * </pre>
     */
    public void validatorOutstandingRewards(cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidatorOutstandingRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorCommission queries accumulated commission for a validator.
     * </pre>
     */
    public void validatorCommission(cosmos.distribution.v1beta1.QueryValidatorCommissionRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryValidatorCommissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidatorCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorSlashes queries slash events of a validator.
     * </pre>
     */
    public void validatorSlashes(cosmos.distribution.v1beta1.QueryValidatorSlashesRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryValidatorSlashesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidatorSlashesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegationRewards queries the total rewards accrued by a delegation.
     * </pre>
     */
    public void delegationRewards(cosmos.distribution.v1beta1.QueryDelegationRewardsRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryDelegationRewardsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegationRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegationTotalRewards queries the total rewards accrued by a each
     * validator.
     * </pre>
     */
    public void delegationTotalRewards(cosmos.distribution.v1beta1.QueryDelegationTotalRewardsRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryDelegationTotalRewardsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegationTotalRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorValidators queries the validators of a delegator.
     * </pre>
     */
    public void delegatorValidators(cosmos.distribution.v1beta1.QueryDelegatorValidatorsRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegatorValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorWithdrawAddress queries withdraw address of a delegator.
     * </pre>
     */
    public void delegatorWithdrawAddress(cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegatorWithdrawAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CommunityPool queries the community pool coins.
     * </pre>
     */
    public void communityPool(cosmos.distribution.v1beta1.QueryCommunityPoolRequest request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryCommunityPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommunityPoolMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for distribution module.
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
     * Params queries params of the distribution module.
     * </pre>
     */
    public cosmos.distribution.v1beta1.QueryParamsResponse params(cosmos.distribution.v1beta1.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorOutstandingRewards queries rewards of a validator address.
     * </pre>
     */
    public cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse validatorOutstandingRewards(cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidatorOutstandingRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorCommission queries accumulated commission for a validator.
     * </pre>
     */
    public cosmos.distribution.v1beta1.QueryValidatorCommissionResponse validatorCommission(cosmos.distribution.v1beta1.QueryValidatorCommissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidatorCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorSlashes queries slash events of a validator.
     * </pre>
     */
    public cosmos.distribution.v1beta1.QueryValidatorSlashesResponse validatorSlashes(cosmos.distribution.v1beta1.QueryValidatorSlashesRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidatorSlashesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegationRewards queries the total rewards accrued by a delegation.
     * </pre>
     */
    public cosmos.distribution.v1beta1.QueryDelegationRewardsResponse delegationRewards(cosmos.distribution.v1beta1.QueryDelegationRewardsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegationRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegationTotalRewards queries the total rewards accrued by a each
     * validator.
     * </pre>
     */
    public cosmos.distribution.v1beta1.QueryDelegationTotalRewardsResponse delegationTotalRewards(cosmos.distribution.v1beta1.QueryDelegationTotalRewardsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegationTotalRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorValidators queries the validators of a delegator.
     * </pre>
     */
    public cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse delegatorValidators(cosmos.distribution.v1beta1.QueryDelegatorValidatorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegatorValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorWithdrawAddress queries withdraw address of a delegator.
     * </pre>
     */
    public cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse delegatorWithdrawAddress(cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegatorWithdrawAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CommunityPool queries the community pool coins.
     * </pre>
     */
    public cosmos.distribution.v1beta1.QueryCommunityPoolResponse communityPool(cosmos.distribution.v1beta1.QueryCommunityPoolRequest request) {
      return blockingUnaryCall(
          getChannel(), getCommunityPoolMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for distribution module.
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
     * Params queries params of the distribution module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.distribution.v1beta1.QueryParamsResponse> params(
        cosmos.distribution.v1beta1.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorOutstandingRewards queries rewards of a validator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse> validatorOutstandingRewards(
        cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidatorOutstandingRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorCommission queries accumulated commission for a validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.distribution.v1beta1.QueryValidatorCommissionResponse> validatorCommission(
        cosmos.distribution.v1beta1.QueryValidatorCommissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidatorCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorSlashes queries slash events of a validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.distribution.v1beta1.QueryValidatorSlashesResponse> validatorSlashes(
        cosmos.distribution.v1beta1.QueryValidatorSlashesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidatorSlashesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegationRewards queries the total rewards accrued by a delegation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.distribution.v1beta1.QueryDelegationRewardsResponse> delegationRewards(
        cosmos.distribution.v1beta1.QueryDelegationRewardsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegationRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegationTotalRewards queries the total rewards accrued by a each
     * validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.distribution.v1beta1.QueryDelegationTotalRewardsResponse> delegationTotalRewards(
        cosmos.distribution.v1beta1.QueryDelegationTotalRewardsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegationTotalRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorValidators queries the validators of a delegator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse> delegatorValidators(
        cosmos.distribution.v1beta1.QueryDelegatorValidatorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegatorValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorWithdrawAddress queries withdraw address of a delegator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse> delegatorWithdrawAddress(
        cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegatorWithdrawAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CommunityPool queries the community pool coins.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.distribution.v1beta1.QueryCommunityPoolResponse> communityPool(
        cosmos.distribution.v1beta1.QueryCommunityPoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCommunityPoolMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_VALIDATOR_OUTSTANDING_REWARDS = 1;
  private static final int METHODID_VALIDATOR_COMMISSION = 2;
  private static final int METHODID_VALIDATOR_SLASHES = 3;
  private static final int METHODID_DELEGATION_REWARDS = 4;
  private static final int METHODID_DELEGATION_TOTAL_REWARDS = 5;
  private static final int METHODID_DELEGATOR_VALIDATORS = 6;
  private static final int METHODID_DELEGATOR_WITHDRAW_ADDRESS = 7;
  private static final int METHODID_COMMUNITY_POOL = 8;

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
        case METHODID_PARAMS:
          serviceImpl.params((cosmos.distribution.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_OUTSTANDING_REWARDS:
          serviceImpl.validatorOutstandingRewards((cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_COMMISSION:
          serviceImpl.validatorCommission((cosmos.distribution.v1beta1.QueryValidatorCommissionRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryValidatorCommissionResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_SLASHES:
          serviceImpl.validatorSlashes((cosmos.distribution.v1beta1.QueryValidatorSlashesRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryValidatorSlashesResponse>) responseObserver);
          break;
        case METHODID_DELEGATION_REWARDS:
          serviceImpl.delegationRewards((cosmos.distribution.v1beta1.QueryDelegationRewardsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryDelegationRewardsResponse>) responseObserver);
          break;
        case METHODID_DELEGATION_TOTAL_REWARDS:
          serviceImpl.delegationTotalRewards((cosmos.distribution.v1beta1.QueryDelegationTotalRewardsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryDelegationTotalRewardsResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_VALIDATORS:
          serviceImpl.delegatorValidators((cosmos.distribution.v1beta1.QueryDelegatorValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_WITHDRAW_ADDRESS:
          serviceImpl.delegatorWithdrawAddress((cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse>) responseObserver);
          break;
        case METHODID_COMMUNITY_POOL:
          serviceImpl.communityPool((cosmos.distribution.v1beta1.QueryCommunityPoolRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.QueryCommunityPoolResponse>) responseObserver);
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
      return cosmos.distribution.v1beta1.QueryOuterClass.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getValidatorOutstandingRewardsMethod())
              .addMethod(getValidatorCommissionMethod())
              .addMethod(getValidatorSlashesMethod())
              .addMethod(getDelegationRewardsMethod())
              .addMethod(getDelegationTotalRewardsMethod())
              .addMethod(getDelegatorValidatorsMethod())
              .addMethod(getDelegatorWithdrawAddressMethod())
              .addMethod(getCommunityPoolMethod())
              .build();
        }
      }
    }
    return result;
  }
}
