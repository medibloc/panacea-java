package medibloc.panaceacore.aol;

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
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: aol/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "medibloc.panaceacore.aol.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<medibloc.panaceacore.aol.MsgCreateTopic,
      medibloc.panaceacore.aol.MsgCreateTopicResponse> getCreateTopicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTopic",
      requestType = medibloc.panaceacore.aol.MsgCreateTopic.class,
      responseType = medibloc.panaceacore.aol.MsgCreateTopicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<medibloc.panaceacore.aol.MsgCreateTopic,
      medibloc.panaceacore.aol.MsgCreateTopicResponse> getCreateTopicMethod() {
    io.grpc.MethodDescriptor<medibloc.panaceacore.aol.MsgCreateTopic, medibloc.panaceacore.aol.MsgCreateTopicResponse> getCreateTopicMethod;
    if ((getCreateTopicMethod = MsgGrpc.getCreateTopicMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateTopicMethod = MsgGrpc.getCreateTopicMethod) == null) {
          MsgGrpc.getCreateTopicMethod = getCreateTopicMethod = 
              io.grpc.MethodDescriptor.<medibloc.panaceacore.aol.MsgCreateTopic, medibloc.panaceacore.aol.MsgCreateTopicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "medibloc.panaceacore.aol.Msg", "CreateTopic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.aol.MsgCreateTopic.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.aol.MsgCreateTopicResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateTopic"))
                  .build();
          }
        }
     }
     return getCreateTopicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<medibloc.panaceacore.aol.MsgAddWriter,
      medibloc.panaceacore.aol.MsgAddWriterResponse> getAddWriterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddWriter",
      requestType = medibloc.panaceacore.aol.MsgAddWriter.class,
      responseType = medibloc.panaceacore.aol.MsgAddWriterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<medibloc.panaceacore.aol.MsgAddWriter,
      medibloc.panaceacore.aol.MsgAddWriterResponse> getAddWriterMethod() {
    io.grpc.MethodDescriptor<medibloc.panaceacore.aol.MsgAddWriter, medibloc.panaceacore.aol.MsgAddWriterResponse> getAddWriterMethod;
    if ((getAddWriterMethod = MsgGrpc.getAddWriterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddWriterMethod = MsgGrpc.getAddWriterMethod) == null) {
          MsgGrpc.getAddWriterMethod = getAddWriterMethod = 
              io.grpc.MethodDescriptor.<medibloc.panaceacore.aol.MsgAddWriter, medibloc.panaceacore.aol.MsgAddWriterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "medibloc.panaceacore.aol.Msg", "AddWriter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.aol.MsgAddWriter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.aol.MsgAddWriterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddWriter"))
                  .build();
          }
        }
     }
     return getAddWriterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<medibloc.panaceacore.aol.MsgDeleteWriter,
      medibloc.panaceacore.aol.MsgDeleteWriterResponse> getDeleteWriterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWriter",
      requestType = medibloc.panaceacore.aol.MsgDeleteWriter.class,
      responseType = medibloc.panaceacore.aol.MsgDeleteWriterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<medibloc.panaceacore.aol.MsgDeleteWriter,
      medibloc.panaceacore.aol.MsgDeleteWriterResponse> getDeleteWriterMethod() {
    io.grpc.MethodDescriptor<medibloc.panaceacore.aol.MsgDeleteWriter, medibloc.panaceacore.aol.MsgDeleteWriterResponse> getDeleteWriterMethod;
    if ((getDeleteWriterMethod = MsgGrpc.getDeleteWriterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteWriterMethod = MsgGrpc.getDeleteWriterMethod) == null) {
          MsgGrpc.getDeleteWriterMethod = getDeleteWriterMethod = 
              io.grpc.MethodDescriptor.<medibloc.panaceacore.aol.MsgDeleteWriter, medibloc.panaceacore.aol.MsgDeleteWriterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "medibloc.panaceacore.aol.Msg", "DeleteWriter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.aol.MsgDeleteWriter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.aol.MsgDeleteWriterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteWriter"))
                  .build();
          }
        }
     }
     return getDeleteWriterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<medibloc.panaceacore.aol.MsgAddRecord,
      medibloc.panaceacore.aol.MsgAddRecordResponse> getAddRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRecord",
      requestType = medibloc.panaceacore.aol.MsgAddRecord.class,
      responseType = medibloc.panaceacore.aol.MsgAddRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<medibloc.panaceacore.aol.MsgAddRecord,
      medibloc.panaceacore.aol.MsgAddRecordResponse> getAddRecordMethod() {
    io.grpc.MethodDescriptor<medibloc.panaceacore.aol.MsgAddRecord, medibloc.panaceacore.aol.MsgAddRecordResponse> getAddRecordMethod;
    if ((getAddRecordMethod = MsgGrpc.getAddRecordMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRecordMethod = MsgGrpc.getAddRecordMethod) == null) {
          MsgGrpc.getAddRecordMethod = getAddRecordMethod = 
              io.grpc.MethodDescriptor.<medibloc.panaceacore.aol.MsgAddRecord, medibloc.panaceacore.aol.MsgAddRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "medibloc.panaceacore.aol.Msg", "AddRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.aol.MsgAddRecord.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  medibloc.panaceacore.aol.MsgAddRecordResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddRecord"))
                  .build();
          }
        }
     }
     return getAddRecordMethod;
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
   * Msg defines the Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTopic(medibloc.panaceacore.aol.MsgCreateTopic request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.aol.MsgCreateTopicResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTopicMethod(), responseObserver);
    }

    /**
     */
    public void addWriter(medibloc.panaceacore.aol.MsgAddWriter request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.aol.MsgAddWriterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddWriterMethod(), responseObserver);
    }

    /**
     */
    public void deleteWriter(medibloc.panaceacore.aol.MsgDeleteWriter request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.aol.MsgDeleteWriterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteWriterMethod(), responseObserver);
    }

    /**
     */
    public void addRecord(medibloc.panaceacore.aol.MsgAddRecord request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.aol.MsgAddRecordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRecordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTopicMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                medibloc.panaceacore.aol.MsgCreateTopic,
                medibloc.panaceacore.aol.MsgCreateTopicResponse>(
                  this, METHODID_CREATE_TOPIC)))
          .addMethod(
            getAddWriterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                medibloc.panaceacore.aol.MsgAddWriter,
                medibloc.panaceacore.aol.MsgAddWriterResponse>(
                  this, METHODID_ADD_WRITER)))
          .addMethod(
            getDeleteWriterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                medibloc.panaceacore.aol.MsgDeleteWriter,
                medibloc.panaceacore.aol.MsgDeleteWriterResponse>(
                  this, METHODID_DELETE_WRITER)))
          .addMethod(
            getAddRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                medibloc.panaceacore.aol.MsgAddRecord,
                medibloc.panaceacore.aol.MsgAddRecordResponse>(
                  this, METHODID_ADD_RECORD)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the Msg service.
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
     */
    public void createTopic(medibloc.panaceacore.aol.MsgCreateTopic request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.aol.MsgCreateTopicResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTopicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addWriter(medibloc.panaceacore.aol.MsgAddWriter request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.aol.MsgAddWriterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddWriterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteWriter(medibloc.panaceacore.aol.MsgDeleteWriter request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.aol.MsgDeleteWriterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteWriterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRecord(medibloc.panaceacore.aol.MsgAddRecord request,
        io.grpc.stub.StreamObserver<medibloc.panaceacore.aol.MsgAddRecordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRecordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the Msg service.
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
     */
    public medibloc.panaceacore.aol.MsgCreateTopicResponse createTopic(medibloc.panaceacore.aol.MsgCreateTopic request) {
      return blockingUnaryCall(
          getChannel(), getCreateTopicMethod(), getCallOptions(), request);
    }

    /**
     */
    public medibloc.panaceacore.aol.MsgAddWriterResponse addWriter(medibloc.panaceacore.aol.MsgAddWriter request) {
      return blockingUnaryCall(
          getChannel(), getAddWriterMethod(), getCallOptions(), request);
    }

    /**
     */
    public medibloc.panaceacore.aol.MsgDeleteWriterResponse deleteWriter(medibloc.panaceacore.aol.MsgDeleteWriter request) {
      return blockingUnaryCall(
          getChannel(), getDeleteWriterMethod(), getCallOptions(), request);
    }

    /**
     */
    public medibloc.panaceacore.aol.MsgAddRecordResponse addRecord(medibloc.panaceacore.aol.MsgAddRecord request) {
      return blockingUnaryCall(
          getChannel(), getAddRecordMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the Msg service.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<medibloc.panaceacore.aol.MsgCreateTopicResponse> createTopic(
        medibloc.panaceacore.aol.MsgCreateTopic request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTopicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<medibloc.panaceacore.aol.MsgAddWriterResponse> addWriter(
        medibloc.panaceacore.aol.MsgAddWriter request) {
      return futureUnaryCall(
          getChannel().newCall(getAddWriterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<medibloc.panaceacore.aol.MsgDeleteWriterResponse> deleteWriter(
        medibloc.panaceacore.aol.MsgDeleteWriter request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteWriterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<medibloc.panaceacore.aol.MsgAddRecordResponse> addRecord(
        medibloc.panaceacore.aol.MsgAddRecord request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRecordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TOPIC = 0;
  private static final int METHODID_ADD_WRITER = 1;
  private static final int METHODID_DELETE_WRITER = 2;
  private static final int METHODID_ADD_RECORD = 3;

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
        case METHODID_CREATE_TOPIC:
          serviceImpl.createTopic((medibloc.panaceacore.aol.MsgCreateTopic) request,
              (io.grpc.stub.StreamObserver<medibloc.panaceacore.aol.MsgCreateTopicResponse>) responseObserver);
          break;
        case METHODID_ADD_WRITER:
          serviceImpl.addWriter((medibloc.panaceacore.aol.MsgAddWriter) request,
              (io.grpc.stub.StreamObserver<medibloc.panaceacore.aol.MsgAddWriterResponse>) responseObserver);
          break;
        case METHODID_DELETE_WRITER:
          serviceImpl.deleteWriter((medibloc.panaceacore.aol.MsgDeleteWriter) request,
              (io.grpc.stub.StreamObserver<medibloc.panaceacore.aol.MsgDeleteWriterResponse>) responseObserver);
          break;
        case METHODID_ADD_RECORD:
          serviceImpl.addRecord((medibloc.panaceacore.aol.MsgAddRecord) request,
              (io.grpc.stub.StreamObserver<medibloc.panaceacore.aol.MsgAddRecordResponse>) responseObserver);
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
      return medibloc.panaceacore.aol.Tx.getDescriptor();
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
              .addMethod(getCreateTopicMethod())
              .addMethod(getAddWriterMethod())
              .addMethod(getDeleteWriterMethod())
              .addMethod(getAddRecordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
