package ibc.core.channel.v1;

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
 * Msg defines the ibc/channel Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: ibc/core/channel/v1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "ibc.core.channel.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelOpenInit,
      ibc.core.channel.v1.MsgChannelOpenInitResponse> getChannelOpenInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelOpenInit",
      requestType = ibc.core.channel.v1.MsgChannelOpenInit.class,
      responseType = ibc.core.channel.v1.MsgChannelOpenInitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelOpenInit,
      ibc.core.channel.v1.MsgChannelOpenInitResponse> getChannelOpenInitMethod() {
    io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelOpenInit, ibc.core.channel.v1.MsgChannelOpenInitResponse> getChannelOpenInitMethod;
    if ((getChannelOpenInitMethod = MsgGrpc.getChannelOpenInitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChannelOpenInitMethod = MsgGrpc.getChannelOpenInitMethod) == null) {
          MsgGrpc.getChannelOpenInitMethod = getChannelOpenInitMethod = 
              io.grpc.MethodDescriptor.<ibc.core.channel.v1.MsgChannelOpenInit, ibc.core.channel.v1.MsgChannelOpenInitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.channel.v1.Msg", "ChannelOpenInit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgChannelOpenInit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgChannelOpenInitResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChannelOpenInit"))
                  .build();
          }
        }
     }
     return getChannelOpenInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelOpenTry,
      ibc.core.channel.v1.MsgChannelOpenTryResponse> getChannelOpenTryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelOpenTry",
      requestType = ibc.core.channel.v1.MsgChannelOpenTry.class,
      responseType = ibc.core.channel.v1.MsgChannelOpenTryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelOpenTry,
      ibc.core.channel.v1.MsgChannelOpenTryResponse> getChannelOpenTryMethod() {
    io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelOpenTry, ibc.core.channel.v1.MsgChannelOpenTryResponse> getChannelOpenTryMethod;
    if ((getChannelOpenTryMethod = MsgGrpc.getChannelOpenTryMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChannelOpenTryMethod = MsgGrpc.getChannelOpenTryMethod) == null) {
          MsgGrpc.getChannelOpenTryMethod = getChannelOpenTryMethod = 
              io.grpc.MethodDescriptor.<ibc.core.channel.v1.MsgChannelOpenTry, ibc.core.channel.v1.MsgChannelOpenTryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.channel.v1.Msg", "ChannelOpenTry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgChannelOpenTry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgChannelOpenTryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChannelOpenTry"))
                  .build();
          }
        }
     }
     return getChannelOpenTryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelOpenAck,
      ibc.core.channel.v1.MsgChannelOpenAckResponse> getChannelOpenAckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelOpenAck",
      requestType = ibc.core.channel.v1.MsgChannelOpenAck.class,
      responseType = ibc.core.channel.v1.MsgChannelOpenAckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelOpenAck,
      ibc.core.channel.v1.MsgChannelOpenAckResponse> getChannelOpenAckMethod() {
    io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelOpenAck, ibc.core.channel.v1.MsgChannelOpenAckResponse> getChannelOpenAckMethod;
    if ((getChannelOpenAckMethod = MsgGrpc.getChannelOpenAckMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChannelOpenAckMethod = MsgGrpc.getChannelOpenAckMethod) == null) {
          MsgGrpc.getChannelOpenAckMethod = getChannelOpenAckMethod = 
              io.grpc.MethodDescriptor.<ibc.core.channel.v1.MsgChannelOpenAck, ibc.core.channel.v1.MsgChannelOpenAckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.channel.v1.Msg", "ChannelOpenAck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgChannelOpenAck.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgChannelOpenAckResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChannelOpenAck"))
                  .build();
          }
        }
     }
     return getChannelOpenAckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelOpenConfirm,
      ibc.core.channel.v1.MsgChannelOpenConfirmResponse> getChannelOpenConfirmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelOpenConfirm",
      requestType = ibc.core.channel.v1.MsgChannelOpenConfirm.class,
      responseType = ibc.core.channel.v1.MsgChannelOpenConfirmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelOpenConfirm,
      ibc.core.channel.v1.MsgChannelOpenConfirmResponse> getChannelOpenConfirmMethod() {
    io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelOpenConfirm, ibc.core.channel.v1.MsgChannelOpenConfirmResponse> getChannelOpenConfirmMethod;
    if ((getChannelOpenConfirmMethod = MsgGrpc.getChannelOpenConfirmMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChannelOpenConfirmMethod = MsgGrpc.getChannelOpenConfirmMethod) == null) {
          MsgGrpc.getChannelOpenConfirmMethod = getChannelOpenConfirmMethod = 
              io.grpc.MethodDescriptor.<ibc.core.channel.v1.MsgChannelOpenConfirm, ibc.core.channel.v1.MsgChannelOpenConfirmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.channel.v1.Msg", "ChannelOpenConfirm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgChannelOpenConfirm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgChannelOpenConfirmResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChannelOpenConfirm"))
                  .build();
          }
        }
     }
     return getChannelOpenConfirmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelCloseInit,
      ibc.core.channel.v1.MsgChannelCloseInitResponse> getChannelCloseInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelCloseInit",
      requestType = ibc.core.channel.v1.MsgChannelCloseInit.class,
      responseType = ibc.core.channel.v1.MsgChannelCloseInitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelCloseInit,
      ibc.core.channel.v1.MsgChannelCloseInitResponse> getChannelCloseInitMethod() {
    io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelCloseInit, ibc.core.channel.v1.MsgChannelCloseInitResponse> getChannelCloseInitMethod;
    if ((getChannelCloseInitMethod = MsgGrpc.getChannelCloseInitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChannelCloseInitMethod = MsgGrpc.getChannelCloseInitMethod) == null) {
          MsgGrpc.getChannelCloseInitMethod = getChannelCloseInitMethod = 
              io.grpc.MethodDescriptor.<ibc.core.channel.v1.MsgChannelCloseInit, ibc.core.channel.v1.MsgChannelCloseInitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.channel.v1.Msg", "ChannelCloseInit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgChannelCloseInit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgChannelCloseInitResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChannelCloseInit"))
                  .build();
          }
        }
     }
     return getChannelCloseInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelCloseConfirm,
      ibc.core.channel.v1.MsgChannelCloseConfirmResponse> getChannelCloseConfirmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelCloseConfirm",
      requestType = ibc.core.channel.v1.MsgChannelCloseConfirm.class,
      responseType = ibc.core.channel.v1.MsgChannelCloseConfirmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelCloseConfirm,
      ibc.core.channel.v1.MsgChannelCloseConfirmResponse> getChannelCloseConfirmMethod() {
    io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgChannelCloseConfirm, ibc.core.channel.v1.MsgChannelCloseConfirmResponse> getChannelCloseConfirmMethod;
    if ((getChannelCloseConfirmMethod = MsgGrpc.getChannelCloseConfirmMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChannelCloseConfirmMethod = MsgGrpc.getChannelCloseConfirmMethod) == null) {
          MsgGrpc.getChannelCloseConfirmMethod = getChannelCloseConfirmMethod = 
              io.grpc.MethodDescriptor.<ibc.core.channel.v1.MsgChannelCloseConfirm, ibc.core.channel.v1.MsgChannelCloseConfirmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.channel.v1.Msg", "ChannelCloseConfirm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgChannelCloseConfirm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgChannelCloseConfirmResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChannelCloseConfirm"))
                  .build();
          }
        }
     }
     return getChannelCloseConfirmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgRecvPacket,
      ibc.core.channel.v1.MsgRecvPacketResponse> getRecvPacketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecvPacket",
      requestType = ibc.core.channel.v1.MsgRecvPacket.class,
      responseType = ibc.core.channel.v1.MsgRecvPacketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgRecvPacket,
      ibc.core.channel.v1.MsgRecvPacketResponse> getRecvPacketMethod() {
    io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgRecvPacket, ibc.core.channel.v1.MsgRecvPacketResponse> getRecvPacketMethod;
    if ((getRecvPacketMethod = MsgGrpc.getRecvPacketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRecvPacketMethod = MsgGrpc.getRecvPacketMethod) == null) {
          MsgGrpc.getRecvPacketMethod = getRecvPacketMethod = 
              io.grpc.MethodDescriptor.<ibc.core.channel.v1.MsgRecvPacket, ibc.core.channel.v1.MsgRecvPacketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.channel.v1.Msg", "RecvPacket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgRecvPacket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgRecvPacketResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RecvPacket"))
                  .build();
          }
        }
     }
     return getRecvPacketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgTimeout,
      ibc.core.channel.v1.MsgTimeoutResponse> getTimeoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Timeout",
      requestType = ibc.core.channel.v1.MsgTimeout.class,
      responseType = ibc.core.channel.v1.MsgTimeoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgTimeout,
      ibc.core.channel.v1.MsgTimeoutResponse> getTimeoutMethod() {
    io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgTimeout, ibc.core.channel.v1.MsgTimeoutResponse> getTimeoutMethod;
    if ((getTimeoutMethod = MsgGrpc.getTimeoutMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTimeoutMethod = MsgGrpc.getTimeoutMethod) == null) {
          MsgGrpc.getTimeoutMethod = getTimeoutMethod = 
              io.grpc.MethodDescriptor.<ibc.core.channel.v1.MsgTimeout, ibc.core.channel.v1.MsgTimeoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.channel.v1.Msg", "Timeout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgTimeout.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgTimeoutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Timeout"))
                  .build();
          }
        }
     }
     return getTimeoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgTimeoutOnClose,
      ibc.core.channel.v1.MsgTimeoutOnCloseResponse> getTimeoutOnCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TimeoutOnClose",
      requestType = ibc.core.channel.v1.MsgTimeoutOnClose.class,
      responseType = ibc.core.channel.v1.MsgTimeoutOnCloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgTimeoutOnClose,
      ibc.core.channel.v1.MsgTimeoutOnCloseResponse> getTimeoutOnCloseMethod() {
    io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgTimeoutOnClose, ibc.core.channel.v1.MsgTimeoutOnCloseResponse> getTimeoutOnCloseMethod;
    if ((getTimeoutOnCloseMethod = MsgGrpc.getTimeoutOnCloseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTimeoutOnCloseMethod = MsgGrpc.getTimeoutOnCloseMethod) == null) {
          MsgGrpc.getTimeoutOnCloseMethod = getTimeoutOnCloseMethod = 
              io.grpc.MethodDescriptor.<ibc.core.channel.v1.MsgTimeoutOnClose, ibc.core.channel.v1.MsgTimeoutOnCloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.channel.v1.Msg", "TimeoutOnClose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgTimeoutOnClose.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgTimeoutOnCloseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TimeoutOnClose"))
                  .build();
          }
        }
     }
     return getTimeoutOnCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgAcknowledgement,
      ibc.core.channel.v1.MsgAcknowledgementResponse> getAcknowledgementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Acknowledgement",
      requestType = ibc.core.channel.v1.MsgAcknowledgement.class,
      responseType = ibc.core.channel.v1.MsgAcknowledgementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgAcknowledgement,
      ibc.core.channel.v1.MsgAcknowledgementResponse> getAcknowledgementMethod() {
    io.grpc.MethodDescriptor<ibc.core.channel.v1.MsgAcknowledgement, ibc.core.channel.v1.MsgAcknowledgementResponse> getAcknowledgementMethod;
    if ((getAcknowledgementMethod = MsgGrpc.getAcknowledgementMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAcknowledgementMethod = MsgGrpc.getAcknowledgementMethod) == null) {
          MsgGrpc.getAcknowledgementMethod = getAcknowledgementMethod = 
              io.grpc.MethodDescriptor.<ibc.core.channel.v1.MsgAcknowledgement, ibc.core.channel.v1.MsgAcknowledgementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ibc.core.channel.v1.Msg", "Acknowledgement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgAcknowledgement.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.core.channel.v1.MsgAcknowledgementResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Acknowledgement"))
                  .build();
          }
        }
     }
     return getAcknowledgementMethod;
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
   * Msg defines the ibc/channel Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ChannelOpenInit defines a rpc handler method for MsgChannelOpenInit.
     * </pre>
     */
    public void channelOpenInit(ibc.core.channel.v1.MsgChannelOpenInit request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelOpenInitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChannelOpenInitMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChannelOpenTry defines a rpc handler method for MsgChannelOpenTry.
     * </pre>
     */
    public void channelOpenTry(ibc.core.channel.v1.MsgChannelOpenTry request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelOpenTryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChannelOpenTryMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChannelOpenAck defines a rpc handler method for MsgChannelOpenAck.
     * </pre>
     */
    public void channelOpenAck(ibc.core.channel.v1.MsgChannelOpenAck request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelOpenAckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChannelOpenAckMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChannelOpenConfirm defines a rpc handler method for MsgChannelOpenConfirm.
     * </pre>
     */
    public void channelOpenConfirm(ibc.core.channel.v1.MsgChannelOpenConfirm request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelOpenConfirmResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChannelOpenConfirmMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChannelCloseInit defines a rpc handler method for MsgChannelCloseInit.
     * </pre>
     */
    public void channelCloseInit(ibc.core.channel.v1.MsgChannelCloseInit request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelCloseInitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChannelCloseInitMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChannelCloseConfirm defines a rpc handler method for MsgChannelCloseConfirm.
     * </pre>
     */
    public void channelCloseConfirm(ibc.core.channel.v1.MsgChannelCloseConfirm request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelCloseConfirmResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChannelCloseConfirmMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public void recvPacket(ibc.core.channel.v1.MsgRecvPacket request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgRecvPacketResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRecvPacketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Timeout defines a rpc handler method for MsgTimeout.
     * </pre>
     */
    public void timeout(ibc.core.channel.v1.MsgTimeout request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgTimeoutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTimeoutMethod(), responseObserver);
    }

    /**
     * <pre>
     * TimeoutOnClose defines a rpc handler method for MsgTimeoutOnClose.
     * </pre>
     */
    public void timeoutOnClose(ibc.core.channel.v1.MsgTimeoutOnClose request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgTimeoutOnCloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTimeoutOnCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public void acknowledgement(ibc.core.channel.v1.MsgAcknowledgement request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgAcknowledgementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAcknowledgementMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getChannelOpenInitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.channel.v1.MsgChannelOpenInit,
                ibc.core.channel.v1.MsgChannelOpenInitResponse>(
                  this, METHODID_CHANNEL_OPEN_INIT)))
          .addMethod(
            getChannelOpenTryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.channel.v1.MsgChannelOpenTry,
                ibc.core.channel.v1.MsgChannelOpenTryResponse>(
                  this, METHODID_CHANNEL_OPEN_TRY)))
          .addMethod(
            getChannelOpenAckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.channel.v1.MsgChannelOpenAck,
                ibc.core.channel.v1.MsgChannelOpenAckResponse>(
                  this, METHODID_CHANNEL_OPEN_ACK)))
          .addMethod(
            getChannelOpenConfirmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.channel.v1.MsgChannelOpenConfirm,
                ibc.core.channel.v1.MsgChannelOpenConfirmResponse>(
                  this, METHODID_CHANNEL_OPEN_CONFIRM)))
          .addMethod(
            getChannelCloseInitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.channel.v1.MsgChannelCloseInit,
                ibc.core.channel.v1.MsgChannelCloseInitResponse>(
                  this, METHODID_CHANNEL_CLOSE_INIT)))
          .addMethod(
            getChannelCloseConfirmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.channel.v1.MsgChannelCloseConfirm,
                ibc.core.channel.v1.MsgChannelCloseConfirmResponse>(
                  this, METHODID_CHANNEL_CLOSE_CONFIRM)))
          .addMethod(
            getRecvPacketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.channel.v1.MsgRecvPacket,
                ibc.core.channel.v1.MsgRecvPacketResponse>(
                  this, METHODID_RECV_PACKET)))
          .addMethod(
            getTimeoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.channel.v1.MsgTimeout,
                ibc.core.channel.v1.MsgTimeoutResponse>(
                  this, METHODID_TIMEOUT)))
          .addMethod(
            getTimeoutOnCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.channel.v1.MsgTimeoutOnClose,
                ibc.core.channel.v1.MsgTimeoutOnCloseResponse>(
                  this, METHODID_TIMEOUT_ON_CLOSE)))
          .addMethod(
            getAcknowledgementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.core.channel.v1.MsgAcknowledgement,
                ibc.core.channel.v1.MsgAcknowledgementResponse>(
                  this, METHODID_ACKNOWLEDGEMENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the ibc/channel Msg service.
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
     * ChannelOpenInit defines a rpc handler method for MsgChannelOpenInit.
     * </pre>
     */
    public void channelOpenInit(ibc.core.channel.v1.MsgChannelOpenInit request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelOpenInitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChannelOpenInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChannelOpenTry defines a rpc handler method for MsgChannelOpenTry.
     * </pre>
     */
    public void channelOpenTry(ibc.core.channel.v1.MsgChannelOpenTry request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelOpenTryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChannelOpenTryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChannelOpenAck defines a rpc handler method for MsgChannelOpenAck.
     * </pre>
     */
    public void channelOpenAck(ibc.core.channel.v1.MsgChannelOpenAck request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelOpenAckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChannelOpenAckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChannelOpenConfirm defines a rpc handler method for MsgChannelOpenConfirm.
     * </pre>
     */
    public void channelOpenConfirm(ibc.core.channel.v1.MsgChannelOpenConfirm request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelOpenConfirmResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChannelOpenConfirmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChannelCloseInit defines a rpc handler method for MsgChannelCloseInit.
     * </pre>
     */
    public void channelCloseInit(ibc.core.channel.v1.MsgChannelCloseInit request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelCloseInitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChannelCloseInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChannelCloseConfirm defines a rpc handler method for MsgChannelCloseConfirm.
     * </pre>
     */
    public void channelCloseConfirm(ibc.core.channel.v1.MsgChannelCloseConfirm request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelCloseConfirmResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChannelCloseConfirmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public void recvPacket(ibc.core.channel.v1.MsgRecvPacket request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgRecvPacketResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecvPacketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Timeout defines a rpc handler method for MsgTimeout.
     * </pre>
     */
    public void timeout(ibc.core.channel.v1.MsgTimeout request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgTimeoutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTimeoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TimeoutOnClose defines a rpc handler method for MsgTimeoutOnClose.
     * </pre>
     */
    public void timeoutOnClose(ibc.core.channel.v1.MsgTimeoutOnClose request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgTimeoutOnCloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTimeoutOnCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public void acknowledgement(ibc.core.channel.v1.MsgAcknowledgement request,
        io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgAcknowledgementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAcknowledgementMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the ibc/channel Msg service.
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
     * ChannelOpenInit defines a rpc handler method for MsgChannelOpenInit.
     * </pre>
     */
    public ibc.core.channel.v1.MsgChannelOpenInitResponse channelOpenInit(ibc.core.channel.v1.MsgChannelOpenInit request) {
      return blockingUnaryCall(
          getChannel(), getChannelOpenInitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChannelOpenTry defines a rpc handler method for MsgChannelOpenTry.
     * </pre>
     */
    public ibc.core.channel.v1.MsgChannelOpenTryResponse channelOpenTry(ibc.core.channel.v1.MsgChannelOpenTry request) {
      return blockingUnaryCall(
          getChannel(), getChannelOpenTryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChannelOpenAck defines a rpc handler method for MsgChannelOpenAck.
     * </pre>
     */
    public ibc.core.channel.v1.MsgChannelOpenAckResponse channelOpenAck(ibc.core.channel.v1.MsgChannelOpenAck request) {
      return blockingUnaryCall(
          getChannel(), getChannelOpenAckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChannelOpenConfirm defines a rpc handler method for MsgChannelOpenConfirm.
     * </pre>
     */
    public ibc.core.channel.v1.MsgChannelOpenConfirmResponse channelOpenConfirm(ibc.core.channel.v1.MsgChannelOpenConfirm request) {
      return blockingUnaryCall(
          getChannel(), getChannelOpenConfirmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChannelCloseInit defines a rpc handler method for MsgChannelCloseInit.
     * </pre>
     */
    public ibc.core.channel.v1.MsgChannelCloseInitResponse channelCloseInit(ibc.core.channel.v1.MsgChannelCloseInit request) {
      return blockingUnaryCall(
          getChannel(), getChannelCloseInitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChannelCloseConfirm defines a rpc handler method for MsgChannelCloseConfirm.
     * </pre>
     */
    public ibc.core.channel.v1.MsgChannelCloseConfirmResponse channelCloseConfirm(ibc.core.channel.v1.MsgChannelCloseConfirm request) {
      return blockingUnaryCall(
          getChannel(), getChannelCloseConfirmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public ibc.core.channel.v1.MsgRecvPacketResponse recvPacket(ibc.core.channel.v1.MsgRecvPacket request) {
      return blockingUnaryCall(
          getChannel(), getRecvPacketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Timeout defines a rpc handler method for MsgTimeout.
     * </pre>
     */
    public ibc.core.channel.v1.MsgTimeoutResponse timeout(ibc.core.channel.v1.MsgTimeout request) {
      return blockingUnaryCall(
          getChannel(), getTimeoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TimeoutOnClose defines a rpc handler method for MsgTimeoutOnClose.
     * </pre>
     */
    public ibc.core.channel.v1.MsgTimeoutOnCloseResponse timeoutOnClose(ibc.core.channel.v1.MsgTimeoutOnClose request) {
      return blockingUnaryCall(
          getChannel(), getTimeoutOnCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public ibc.core.channel.v1.MsgAcknowledgementResponse acknowledgement(ibc.core.channel.v1.MsgAcknowledgement request) {
      return blockingUnaryCall(
          getChannel(), getAcknowledgementMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the ibc/channel Msg service.
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
     * ChannelOpenInit defines a rpc handler method for MsgChannelOpenInit.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.channel.v1.MsgChannelOpenInitResponse> channelOpenInit(
        ibc.core.channel.v1.MsgChannelOpenInit request) {
      return futureUnaryCall(
          getChannel().newCall(getChannelOpenInitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChannelOpenTry defines a rpc handler method for MsgChannelOpenTry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.channel.v1.MsgChannelOpenTryResponse> channelOpenTry(
        ibc.core.channel.v1.MsgChannelOpenTry request) {
      return futureUnaryCall(
          getChannel().newCall(getChannelOpenTryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChannelOpenAck defines a rpc handler method for MsgChannelOpenAck.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.channel.v1.MsgChannelOpenAckResponse> channelOpenAck(
        ibc.core.channel.v1.MsgChannelOpenAck request) {
      return futureUnaryCall(
          getChannel().newCall(getChannelOpenAckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChannelOpenConfirm defines a rpc handler method for MsgChannelOpenConfirm.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.channel.v1.MsgChannelOpenConfirmResponse> channelOpenConfirm(
        ibc.core.channel.v1.MsgChannelOpenConfirm request) {
      return futureUnaryCall(
          getChannel().newCall(getChannelOpenConfirmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChannelCloseInit defines a rpc handler method for MsgChannelCloseInit.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.channel.v1.MsgChannelCloseInitResponse> channelCloseInit(
        ibc.core.channel.v1.MsgChannelCloseInit request) {
      return futureUnaryCall(
          getChannel().newCall(getChannelCloseInitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChannelCloseConfirm defines a rpc handler method for MsgChannelCloseConfirm.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.channel.v1.MsgChannelCloseConfirmResponse> channelCloseConfirm(
        ibc.core.channel.v1.MsgChannelCloseConfirm request) {
      return futureUnaryCall(
          getChannel().newCall(getChannelCloseConfirmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.channel.v1.MsgRecvPacketResponse> recvPacket(
        ibc.core.channel.v1.MsgRecvPacket request) {
      return futureUnaryCall(
          getChannel().newCall(getRecvPacketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Timeout defines a rpc handler method for MsgTimeout.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.channel.v1.MsgTimeoutResponse> timeout(
        ibc.core.channel.v1.MsgTimeout request) {
      return futureUnaryCall(
          getChannel().newCall(getTimeoutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TimeoutOnClose defines a rpc handler method for MsgTimeoutOnClose.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.channel.v1.MsgTimeoutOnCloseResponse> timeoutOnClose(
        ibc.core.channel.v1.MsgTimeoutOnClose request) {
      return futureUnaryCall(
          getChannel().newCall(getTimeoutOnCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.core.channel.v1.MsgAcknowledgementResponse> acknowledgement(
        ibc.core.channel.v1.MsgAcknowledgement request) {
      return futureUnaryCall(
          getChannel().newCall(getAcknowledgementMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHANNEL_OPEN_INIT = 0;
  private static final int METHODID_CHANNEL_OPEN_TRY = 1;
  private static final int METHODID_CHANNEL_OPEN_ACK = 2;
  private static final int METHODID_CHANNEL_OPEN_CONFIRM = 3;
  private static final int METHODID_CHANNEL_CLOSE_INIT = 4;
  private static final int METHODID_CHANNEL_CLOSE_CONFIRM = 5;
  private static final int METHODID_RECV_PACKET = 6;
  private static final int METHODID_TIMEOUT = 7;
  private static final int METHODID_TIMEOUT_ON_CLOSE = 8;
  private static final int METHODID_ACKNOWLEDGEMENT = 9;

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
        case METHODID_CHANNEL_OPEN_INIT:
          serviceImpl.channelOpenInit((ibc.core.channel.v1.MsgChannelOpenInit) request,
              (io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelOpenInitResponse>) responseObserver);
          break;
        case METHODID_CHANNEL_OPEN_TRY:
          serviceImpl.channelOpenTry((ibc.core.channel.v1.MsgChannelOpenTry) request,
              (io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelOpenTryResponse>) responseObserver);
          break;
        case METHODID_CHANNEL_OPEN_ACK:
          serviceImpl.channelOpenAck((ibc.core.channel.v1.MsgChannelOpenAck) request,
              (io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelOpenAckResponse>) responseObserver);
          break;
        case METHODID_CHANNEL_OPEN_CONFIRM:
          serviceImpl.channelOpenConfirm((ibc.core.channel.v1.MsgChannelOpenConfirm) request,
              (io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelOpenConfirmResponse>) responseObserver);
          break;
        case METHODID_CHANNEL_CLOSE_INIT:
          serviceImpl.channelCloseInit((ibc.core.channel.v1.MsgChannelCloseInit) request,
              (io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelCloseInitResponse>) responseObserver);
          break;
        case METHODID_CHANNEL_CLOSE_CONFIRM:
          serviceImpl.channelCloseConfirm((ibc.core.channel.v1.MsgChannelCloseConfirm) request,
              (io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgChannelCloseConfirmResponse>) responseObserver);
          break;
        case METHODID_RECV_PACKET:
          serviceImpl.recvPacket((ibc.core.channel.v1.MsgRecvPacket) request,
              (io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgRecvPacketResponse>) responseObserver);
          break;
        case METHODID_TIMEOUT:
          serviceImpl.timeout((ibc.core.channel.v1.MsgTimeout) request,
              (io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgTimeoutResponse>) responseObserver);
          break;
        case METHODID_TIMEOUT_ON_CLOSE:
          serviceImpl.timeoutOnClose((ibc.core.channel.v1.MsgTimeoutOnClose) request,
              (io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgTimeoutOnCloseResponse>) responseObserver);
          break;
        case METHODID_ACKNOWLEDGEMENT:
          serviceImpl.acknowledgement((ibc.core.channel.v1.MsgAcknowledgement) request,
              (io.grpc.stub.StreamObserver<ibc.core.channel.v1.MsgAcknowledgementResponse>) responseObserver);
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
      return ibc.core.channel.v1.Tx.getDescriptor();
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
              .addMethod(getChannelOpenInitMethod())
              .addMethod(getChannelOpenTryMethod())
              .addMethod(getChannelOpenAckMethod())
              .addMethod(getChannelOpenConfirmMethod())
              .addMethod(getChannelCloseInitMethod())
              .addMethod(getChannelCloseConfirmMethod())
              .addMethod(getRecvPacketMethod())
              .addMethod(getTimeoutMethod())
              .addMethod(getTimeoutOnCloseMethod())
              .addMethod(getAcknowledgementMethod())
              .build();
        }
      }
    }
    return result;
  }
}
