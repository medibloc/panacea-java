package cosmos.evidence.v1beta1;

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
 * Msg defines the evidence Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: cosmos/evidence/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cosmos.evidence.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.evidence.v1beta1.MsgSubmitEvidence,
      cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse> getSubmitEvidenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitEvidence",
      requestType = cosmos.evidence.v1beta1.MsgSubmitEvidence.class,
      responseType = cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.evidence.v1beta1.MsgSubmitEvidence,
      cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse> getSubmitEvidenceMethod() {
    io.grpc.MethodDescriptor<cosmos.evidence.v1beta1.MsgSubmitEvidence, cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse> getSubmitEvidenceMethod;
    if ((getSubmitEvidenceMethod = MsgGrpc.getSubmitEvidenceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitEvidenceMethod = MsgGrpc.getSubmitEvidenceMethod) == null) {
          MsgGrpc.getSubmitEvidenceMethod = getSubmitEvidenceMethod = 
              io.grpc.MethodDescriptor.<cosmos.evidence.v1beta1.MsgSubmitEvidence, cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.evidence.v1beta1.Msg", "SubmitEvidence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.evidence.v1beta1.MsgSubmitEvidence.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitEvidence"))
                  .build();
          }
        }
     }
     return getSubmitEvidenceMethod;
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
   * Msg defines the evidence Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * SubmitEvidence submits an arbitrary Evidence of misbehavior such as equivocation or
     * counterfactual signing.
     * </pre>
     */
    public void submitEvidence(cosmos.evidence.v1beta1.MsgSubmitEvidence request,
        io.grpc.stub.StreamObserver<cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitEvidenceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubmitEvidenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.evidence.v1beta1.MsgSubmitEvidence,
                cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse>(
                  this, METHODID_SUBMIT_EVIDENCE)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the evidence Msg service.
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
     * SubmitEvidence submits an arbitrary Evidence of misbehavior such as equivocation or
     * counterfactual signing.
     * </pre>
     */
    public void submitEvidence(cosmos.evidence.v1beta1.MsgSubmitEvidence request,
        io.grpc.stub.StreamObserver<cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitEvidenceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the evidence Msg service.
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
     * SubmitEvidence submits an arbitrary Evidence of misbehavior such as equivocation or
     * counterfactual signing.
     * </pre>
     */
    public cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse submitEvidence(cosmos.evidence.v1beta1.MsgSubmitEvidence request) {
      return blockingUnaryCall(
          getChannel(), getSubmitEvidenceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the evidence Msg service.
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
     * SubmitEvidence submits an arbitrary Evidence of misbehavior such as equivocation or
     * counterfactual signing.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse> submitEvidence(
        cosmos.evidence.v1beta1.MsgSubmitEvidence request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitEvidenceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_EVIDENCE = 0;

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
        case METHODID_SUBMIT_EVIDENCE:
          serviceImpl.submitEvidence((cosmos.evidence.v1beta1.MsgSubmitEvidence) request,
              (io.grpc.stub.StreamObserver<cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse>) responseObserver);
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
      return cosmos.evidence.v1beta1.Tx.getDescriptor();
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
              .addMethod(getSubmitEvidenceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
