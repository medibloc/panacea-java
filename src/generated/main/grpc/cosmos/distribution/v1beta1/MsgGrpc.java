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
 * Msg defines the distribution Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: cosmos/distribution/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cosmos.distribution.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.MsgSetWithdrawAddress,
      cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse> getSetWithdrawAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetWithdrawAddress",
      requestType = cosmos.distribution.v1beta1.MsgSetWithdrawAddress.class,
      responseType = cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.MsgSetWithdrawAddress,
      cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse> getSetWithdrawAddressMethod() {
    io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.MsgSetWithdrawAddress, cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse> getSetWithdrawAddressMethod;
    if ((getSetWithdrawAddressMethod = MsgGrpc.getSetWithdrawAddressMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetWithdrawAddressMethod = MsgGrpc.getSetWithdrawAddressMethod) == null) {
          MsgGrpc.getSetWithdrawAddressMethod = getSetWithdrawAddressMethod = 
              io.grpc.MethodDescriptor.<cosmos.distribution.v1beta1.MsgSetWithdrawAddress, cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.distribution.v1beta1.Msg", "SetWithdrawAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.MsgSetWithdrawAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetWithdrawAddress"))
                  .build();
          }
        }
     }
     return getSetWithdrawAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward,
      cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse> getWithdrawDelegatorRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawDelegatorReward",
      requestType = cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward.class,
      responseType = cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward,
      cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse> getWithdrawDelegatorRewardMethod() {
    io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward, cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse> getWithdrawDelegatorRewardMethod;
    if ((getWithdrawDelegatorRewardMethod = MsgGrpc.getWithdrawDelegatorRewardMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawDelegatorRewardMethod = MsgGrpc.getWithdrawDelegatorRewardMethod) == null) {
          MsgGrpc.getWithdrawDelegatorRewardMethod = getWithdrawDelegatorRewardMethod = 
              io.grpc.MethodDescriptor.<cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward, cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.distribution.v1beta1.Msg", "WithdrawDelegatorReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawDelegatorReward"))
                  .build();
          }
        }
     }
     return getWithdrawDelegatorRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission,
      cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse> getWithdrawValidatorCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawValidatorCommission",
      requestType = cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission.class,
      responseType = cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission,
      cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse> getWithdrawValidatorCommissionMethod() {
    io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission, cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse> getWithdrawValidatorCommissionMethod;
    if ((getWithdrawValidatorCommissionMethod = MsgGrpc.getWithdrawValidatorCommissionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawValidatorCommissionMethod = MsgGrpc.getWithdrawValidatorCommissionMethod) == null) {
          MsgGrpc.getWithdrawValidatorCommissionMethod = getWithdrawValidatorCommissionMethod = 
              io.grpc.MethodDescriptor.<cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission, cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.distribution.v1beta1.Msg", "WithdrawValidatorCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawValidatorCommission"))
                  .build();
          }
        }
     }
     return getWithdrawValidatorCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.MsgFundCommunityPool,
      cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse> getFundCommunityPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FundCommunityPool",
      requestType = cosmos.distribution.v1beta1.MsgFundCommunityPool.class,
      responseType = cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.MsgFundCommunityPool,
      cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse> getFundCommunityPoolMethod() {
    io.grpc.MethodDescriptor<cosmos.distribution.v1beta1.MsgFundCommunityPool, cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse> getFundCommunityPoolMethod;
    if ((getFundCommunityPoolMethod = MsgGrpc.getFundCommunityPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFundCommunityPoolMethod = MsgGrpc.getFundCommunityPoolMethod) == null) {
          MsgGrpc.getFundCommunityPoolMethod = getFundCommunityPoolMethod = 
              io.grpc.MethodDescriptor.<cosmos.distribution.v1beta1.MsgFundCommunityPool, cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.distribution.v1beta1.Msg", "FundCommunityPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.MsgFundCommunityPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("FundCommunityPool"))
                  .build();
          }
        }
     }
     return getFundCommunityPoolMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    return new MsgStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MsgBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MsgFutureStub(channel);
  }

  /**
   * <pre>
   * Msg defines the distribution Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * SetWithdrawAddress defines a method to change the withdraw address
     * for a delegator (or validator self-delegation).
     * </pre>
     */
    public void setWithdrawAddress(cosmos.distribution.v1beta1.MsgSetWithdrawAddress request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetWithdrawAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawDelegatorReward defines a method to withdraw rewards of delegator
     * from a single validator.
     * </pre>
     */
    public void withdrawDelegatorReward(cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawDelegatorRewardMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawValidatorCommission defines a method to withdraw the
     * full commission to the validator address.
     * </pre>
     */
    public void withdrawValidatorCommission(cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawValidatorCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * FundCommunityPool defines a method to allow an account to directly
     * fund the community pool.
     * </pre>
     */
    public void fundCommunityPool(cosmos.distribution.v1beta1.MsgFundCommunityPool request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFundCommunityPoolMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetWithdrawAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.distribution.v1beta1.MsgSetWithdrawAddress,
                cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse>(
                  this, METHODID_SET_WITHDRAW_ADDRESS)))
          .addMethod(
            getWithdrawDelegatorRewardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward,
                cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse>(
                  this, METHODID_WITHDRAW_DELEGATOR_REWARD)))
          .addMethod(
            getWithdrawValidatorCommissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission,
                cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse>(
                  this, METHODID_WITHDRAW_VALIDATOR_COMMISSION)))
          .addMethod(
            getFundCommunityPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.distribution.v1beta1.MsgFundCommunityPool,
                cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse>(
                  this, METHODID_FUND_COMMUNITY_POOL)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the distribution Msg service.
   * </pre>
   */
  public static final class MsgStub extends io.grpc.stub.AbstractStub<MsgStub> {
    private MsgStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MsgStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method to change the withdraw address
     * for a delegator (or validator self-delegation).
     * </pre>
     */
    public void setWithdrawAddress(cosmos.distribution.v1beta1.MsgSetWithdrawAddress request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetWithdrawAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawDelegatorReward defines a method to withdraw rewards of delegator
     * from a single validator.
     * </pre>
     */
    public void withdrawDelegatorReward(cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawDelegatorRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawValidatorCommission defines a method to withdraw the
     * full commission to the validator address.
     * </pre>
     */
    public void withdrawValidatorCommission(cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawValidatorCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FundCommunityPool defines a method to allow an account to directly
     * fund the community pool.
     * </pre>
     */
    public void fundCommunityPool(cosmos.distribution.v1beta1.MsgFundCommunityPool request,
        io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFundCommunityPoolMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the distribution Msg service.
   * </pre>
   */
  public static final class MsgBlockingStub extends io.grpc.stub.AbstractStub<MsgBlockingStub> {
    private MsgBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MsgBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method to change the withdraw address
     * for a delegator (or validator self-delegation).
     * </pre>
     */
    public cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse setWithdrawAddress(cosmos.distribution.v1beta1.MsgSetWithdrawAddress request) {
      return blockingUnaryCall(
          getChannel(), getSetWithdrawAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawDelegatorReward defines a method to withdraw rewards of delegator
     * from a single validator.
     * </pre>
     */
    public cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse withdrawDelegatorReward(cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawDelegatorRewardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawValidatorCommission defines a method to withdraw the
     * full commission to the validator address.
     * </pre>
     */
    public cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse withdrawValidatorCommission(cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawValidatorCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FundCommunityPool defines a method to allow an account to directly
     * fund the community pool.
     * </pre>
     */
    public cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse fundCommunityPool(cosmos.distribution.v1beta1.MsgFundCommunityPool request) {
      return blockingUnaryCall(
          getChannel(), getFundCommunityPoolMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the distribution Msg service.
   * </pre>
   */
  public static final class MsgFutureStub extends io.grpc.stub.AbstractStub<MsgFutureStub> {
    private MsgFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MsgFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method to change the withdraw address
     * for a delegator (or validator self-delegation).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse> setWithdrawAddress(
        cosmos.distribution.v1beta1.MsgSetWithdrawAddress request) {
      return futureUnaryCall(
          getChannel().newCall(getSetWithdrawAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawDelegatorReward defines a method to withdraw rewards of delegator
     * from a single validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse> withdrawDelegatorReward(
        cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawDelegatorRewardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawValidatorCommission defines a method to withdraw the
     * full commission to the validator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse> withdrawValidatorCommission(
        cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawValidatorCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FundCommunityPool defines a method to allow an account to directly
     * fund the community pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse> fundCommunityPool(
        cosmos.distribution.v1beta1.MsgFundCommunityPool request) {
      return futureUnaryCall(
          getChannel().newCall(getFundCommunityPoolMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_WITHDRAW_ADDRESS = 0;
  private static final int METHODID_WITHDRAW_DELEGATOR_REWARD = 1;
  private static final int METHODID_WITHDRAW_VALIDATOR_COMMISSION = 2;
  private static final int METHODID_FUND_COMMUNITY_POOL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MsgImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MsgImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_WITHDRAW_ADDRESS:
          serviceImpl.setWithdrawAddress((cosmos.distribution.v1beta1.MsgSetWithdrawAddress) request,
              (io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_DELEGATOR_REWARD:
          serviceImpl.withdrawDelegatorReward((cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward) request,
              (io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_VALIDATOR_COMMISSION:
          serviceImpl.withdrawValidatorCommission((cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission) request,
              (io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse>) responseObserver);
          break;
        case METHODID_FUND_COMMUNITY_POOL:
          serviceImpl.fundCommunityPool((cosmos.distribution.v1beta1.MsgFundCommunityPool) request,
              (io.grpc.stub.StreamObserver<cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse>) responseObserver);
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

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cosmos.distribution.v1beta1.Tx.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getSetWithdrawAddressMethod())
              .addMethod(getWithdrawDelegatorRewardMethod())
              .addMethod(getWithdrawValidatorCommissionMethod())
              .addMethod(getFundCommunityPoolMethod())
              .build();
        }
      }
    }
    return result;
  }
}
