package medibloc.panaceacore.did;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: did/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "medibloc.panaceacore.did.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<medibloc.panaceacore.did.MsgCreateDID,
      medibloc.panaceacore.did.MsgCreateDIDResponse> getCreateDIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDID",
      requestType = medibloc.panaceacore.did.MsgCreateDID.class,
      responseType = medibloc.panaceacore.did.MsgCreateDIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<medibloc.panaceacore.did.MsgCreateDID,
      medibloc.panaceacore.did.MsgCreateDIDResponse> getCreateDIDMethod() {
    io.grpc.MethodDescriptor<medibloc.panaceacore.did.MsgCreateDID, medibloc.panaceacore.did.MsgCreateDIDResponse> getCreateDIDMethod;
    if ((getCreateDIDMethod = MsgGrpc.getCreateDIDMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateDIDMethod = MsgGrpc.getCreateDIDMethod) == null) {
          MsgGrpc.getCreateDIDMethod = getCreateDIDMethod = 
              io.grpc.MethodDescriptor.<medibloc.panaceacore.did.MsgCreateDID, medibloc.panaceacore.did.MsgCreateDIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "medibloc.panaceacore.did.Msg", "CreateDID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.did.MsgCreateDID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.did.MsgCreateDIDResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateDID"))
                  .build();
          }
        }
     }
     return getCreateDIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<medibloc.panaceacore.did.MsgUpdateDID,
      medibloc.panaceacore.did.MsgUpdateDIDResponse> getUpdateDIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDID",
      requestType = medibloc.panaceacore.did.MsgUpdateDID.class,
      responseType = medibloc.panaceacore.did.MsgUpdateDIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<medibloc.panaceacore.did.MsgUpdateDID,
      medibloc.panaceacore.did.MsgUpdateDIDResponse> getUpdateDIDMethod() {
    io.grpc.MethodDescriptor<medibloc.panaceacore.did.MsgUpdateDID, medibloc.panaceacore.did.MsgUpdateDIDResponse> getUpdateDIDMethod;
    if ((getUpdateDIDMethod = MsgGrpc.getUpdateDIDMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateDIDMethod = MsgGrpc.getUpdateDIDMethod) == null) {
          MsgGrpc.getUpdateDIDMethod = getUpdateDIDMethod = 
              io.grpc.MethodDescriptor.<medibloc.panaceacore.did.MsgUpdateDID, medibloc.panaceacore.did.MsgUpdateDIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "medibloc.panaceacore.did.Msg", "UpdateDID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.did.MsgUpdateDID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.did.MsgUpdateDIDResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateDID"))
                  .build();
          }
        }
     }
     return getUpdateDIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<medibloc.panaceacore.did.MsgDeactivateDID,
      medibloc.panaceacore.did.MsgDeactivateDIDResponse> getDeactivateDIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateDID",
      requestType = medibloc.panaceacore.did.MsgDeactivateDID.class,
      responseType = medibloc.panaceacore.did.MsgDeactivateDIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<medibloc.panaceacore.did.MsgDeactivateDID,
      medibloc.panaceacore.did.MsgDeactivateDIDResponse> getDeactivateDIDMethod() {
    io.grpc.MethodDescriptor<medibloc.panaceacore.did.MsgDeactivateDID, medibloc.panaceacore.did.MsgDeactivateDIDResponse> getDeactivateDIDMethod;
    if ((getDeactivateDIDMethod = MsgGrpc.getDeactivateDIDMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeactivateDIDMethod = MsgGrpc.getDeactivateDIDMethod) == null) {
          MsgGrpc.getDeactivateDIDMethod = getDeactivateDIDMethod = 
              io.grpc.MethodDescriptor.<medibloc.panaceacore.did.MsgDeactivateDID, medibloc.panaceacore.did.MsgDeactivateDIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "medibloc.panaceacore.did.Msg", "DeactivateDID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.did.MsgDeactivateDID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.did.MsgDeactivateDIDResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeactivateDID"))
                  .build();
          }
        }
     }
     return getDeactivateDIDMethod;
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
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     */
    public void createDID(medibloc.panaceacore.did.MsgCreateDID request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.did.MsgCreateDIDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDIDMethod(), responseObserver);
    }

    /**
     */
    public void updateDID(medibloc.panaceacore.did.MsgUpdateDID request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.did.MsgUpdateDIDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDIDMethod(), responseObserver);
    }

    /**
     */
    public void deactivateDID(medibloc.panaceacore.did.MsgDeactivateDID request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.did.MsgDeactivateDIDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeactivateDIDMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateDIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                medibloc.panaceacore.did.MsgCreateDID,
                medibloc.panaceacore.did.MsgCreateDIDResponse>(
                  this, METHODID_CREATE_DID)))
          .addMethod(
            getUpdateDIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                medibloc.panaceacore.did.MsgUpdateDID,
                medibloc.panaceacore.did.MsgUpdateDIDResponse>(
                  this, METHODID_UPDATE_DID)))
          .addMethod(
            getDeactivateDIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                medibloc.panaceacore.did.MsgDeactivateDID,
                medibloc.panaceacore.did.MsgDeactivateDIDResponse>(
                  this, METHODID_DEACTIVATE_DID)))
          .build();
    }
  }

  /**
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
     */
    public void createDID(medibloc.panaceacore.did.MsgCreateDID request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.did.MsgCreateDIDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDID(medibloc.panaceacore.did.MsgUpdateDID request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.did.MsgUpdateDIDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deactivateDID(medibloc.panaceacore.did.MsgDeactivateDID request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.did.MsgDeactivateDIDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeactivateDIDMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
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
     */
    public medibloc.panaceacore.did.MsgCreateDIDResponse createDID(medibloc.panaceacore.did.MsgCreateDID request) {
      return blockingUnaryCall(
          getChannel(), getCreateDIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public medibloc.panaceacore.did.MsgUpdateDIDResponse updateDID(medibloc.panaceacore.did.MsgUpdateDID request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public medibloc.panaceacore.did.MsgDeactivateDIDResponse deactivateDID(medibloc.panaceacore.did.MsgDeactivateDID request) {
      return blockingUnaryCall(
          getChannel(), getDeactivateDIDMethod(), getCallOptions(), request);
    }
  }

  /**
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
     */
    public com.google.common.util.concurrent.ListenableFuture<medibloc.panaceacore.did.MsgCreateDIDResponse> createDID(
        medibloc.panaceacore.did.MsgCreateDID request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<medibloc.panaceacore.did.MsgUpdateDIDResponse> updateDID(
        medibloc.panaceacore.did.MsgUpdateDID request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<medibloc.panaceacore.did.MsgDeactivateDIDResponse> deactivateDID(
        medibloc.panaceacore.did.MsgDeactivateDID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeactivateDIDMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DID = 0;
  private static final int METHODID_UPDATE_DID = 1;
  private static final int METHODID_DEACTIVATE_DID = 2;

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
        case METHODID_CREATE_DID:
          serviceImpl.createDID((medibloc.panaceacore.did.MsgCreateDID) request,
              (io.grpc.stub.StreamObserver<medibloc.panaceacore.did.MsgCreateDIDResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DID:
          serviceImpl.updateDID((medibloc.panaceacore.did.MsgUpdateDID) request,
              (io.grpc.stub.StreamObserver<medibloc.panaceacore.did.MsgUpdateDIDResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_DID:
          serviceImpl.deactivateDID((medibloc.panaceacore.did.MsgDeactivateDID) request,
              (io.grpc.stub.StreamObserver<medibloc.panaceacore.did.MsgDeactivateDIDResponse>) responseObserver);
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
      return medibloc.panaceacore.did.Tx.getDescriptor();
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
              .addMethod(getCreateDIDMethod())
              .addMethod(getUpdateDIDMethod())
              .addMethod(getDeactivateDIDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
