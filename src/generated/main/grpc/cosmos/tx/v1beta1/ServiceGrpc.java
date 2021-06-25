package cosmos.tx.v1beta1;

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
 * Service defines a gRPC service for interacting with transactions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: cosmos/tx/v1beta1/service.proto")
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final String SERVICE_NAME = "cosmos.tx.v1beta1.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.tx.v1beta1.SimulateRequest,
      cosmos.tx.v1beta1.SimulateResponse> getSimulateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Simulate",
      requestType = cosmos.tx.v1beta1.SimulateRequest.class,
      responseType = cosmos.tx.v1beta1.SimulateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.tx.v1beta1.SimulateRequest,
      cosmos.tx.v1beta1.SimulateResponse> getSimulateMethod() {
    io.grpc.MethodDescriptor<cosmos.tx.v1beta1.SimulateRequest, cosmos.tx.v1beta1.SimulateResponse> getSimulateMethod;
    if ((getSimulateMethod = ServiceGrpc.getSimulateMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getSimulateMethod = ServiceGrpc.getSimulateMethod) == null) {
          ServiceGrpc.getSimulateMethod = getSimulateMethod = 
              io.grpc.MethodDescriptor.<cosmos.tx.v1beta1.SimulateRequest, cosmos.tx.v1beta1.SimulateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.tx.v1beta1.Service", "Simulate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.tx.v1beta1.SimulateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.tx.v1beta1.SimulateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Simulate"))
                  .build();
          }
        }
     }
     return getSimulateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.tx.v1beta1.GetTxRequest,
      cosmos.tx.v1beta1.GetTxResponse> getGetTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTx",
      requestType = cosmos.tx.v1beta1.GetTxRequest.class,
      responseType = cosmos.tx.v1beta1.GetTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.tx.v1beta1.GetTxRequest,
      cosmos.tx.v1beta1.GetTxResponse> getGetTxMethod() {
    io.grpc.MethodDescriptor<cosmos.tx.v1beta1.GetTxRequest, cosmos.tx.v1beta1.GetTxResponse> getGetTxMethod;
    if ((getGetTxMethod = ServiceGrpc.getGetTxMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetTxMethod = ServiceGrpc.getGetTxMethod) == null) {
          ServiceGrpc.getGetTxMethod = getGetTxMethod = 
              io.grpc.MethodDescriptor.<cosmos.tx.v1beta1.GetTxRequest, cosmos.tx.v1beta1.GetTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.tx.v1beta1.Service", "GetTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.tx.v1beta1.GetTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.tx.v1beta1.GetTxResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetTx"))
                  .build();
          }
        }
     }
     return getGetTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.tx.v1beta1.BroadcastTxRequest,
      cosmos.tx.v1beta1.BroadcastTxResponse> getBroadcastTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BroadcastTx",
      requestType = cosmos.tx.v1beta1.BroadcastTxRequest.class,
      responseType = cosmos.tx.v1beta1.BroadcastTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.tx.v1beta1.BroadcastTxRequest,
      cosmos.tx.v1beta1.BroadcastTxResponse> getBroadcastTxMethod() {
    io.grpc.MethodDescriptor<cosmos.tx.v1beta1.BroadcastTxRequest, cosmos.tx.v1beta1.BroadcastTxResponse> getBroadcastTxMethod;
    if ((getBroadcastTxMethod = ServiceGrpc.getBroadcastTxMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getBroadcastTxMethod = ServiceGrpc.getBroadcastTxMethod) == null) {
          ServiceGrpc.getBroadcastTxMethod = getBroadcastTxMethod = 
              io.grpc.MethodDescriptor.<cosmos.tx.v1beta1.BroadcastTxRequest, cosmos.tx.v1beta1.BroadcastTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.tx.v1beta1.Service", "BroadcastTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.tx.v1beta1.BroadcastTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.tx.v1beta1.BroadcastTxResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("BroadcastTx"))
                  .build();
          }
        }
     }
     return getBroadcastTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.tx.v1beta1.GetTxsEventRequest,
      cosmos.tx.v1beta1.GetTxsEventResponse> getGetTxsEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTxsEvent",
      requestType = cosmos.tx.v1beta1.GetTxsEventRequest.class,
      responseType = cosmos.tx.v1beta1.GetTxsEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.tx.v1beta1.GetTxsEventRequest,
      cosmos.tx.v1beta1.GetTxsEventResponse> getGetTxsEventMethod() {
    io.grpc.MethodDescriptor<cosmos.tx.v1beta1.GetTxsEventRequest, cosmos.tx.v1beta1.GetTxsEventResponse> getGetTxsEventMethod;
    if ((getGetTxsEventMethod = ServiceGrpc.getGetTxsEventMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetTxsEventMethod = ServiceGrpc.getGetTxsEventMethod) == null) {
          ServiceGrpc.getGetTxsEventMethod = getGetTxsEventMethod = 
              io.grpc.MethodDescriptor.<cosmos.tx.v1beta1.GetTxsEventRequest, cosmos.tx.v1beta1.GetTxsEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.tx.v1beta1.Service", "GetTxsEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.tx.v1beta1.GetTxsEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.tx.v1beta1.GetTxsEventResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetTxsEvent"))
                  .build();
          }
        }
     }
     return getGetTxsEventMethod;
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
   * Service defines a gRPC service for interacting with transactions.
   * </pre>
   */
  public static abstract class ServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Simulate simulates executing a transaction for estimating gas usage.
     * </pre>
     */
    public void simulate(cosmos.tx.v1beta1.SimulateRequest request,
        io.grpc.stub.StreamObserver<cosmos.tx.v1beta1.SimulateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSimulateMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTx fetches a tx by hash.
     * </pre>
     */
    public void getTx(cosmos.tx.v1beta1.GetTxRequest request,
        io.grpc.stub.StreamObserver<cosmos.tx.v1beta1.GetTxResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTxMethod(), responseObserver);
    }

    /**
     * <pre>
     * BroadcastTx broadcast transaction.
     * </pre>
     */
    public void broadcastTx(cosmos.tx.v1beta1.BroadcastTxRequest request,
        io.grpc.stub.StreamObserver<cosmos.tx.v1beta1.BroadcastTxResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBroadcastTxMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTxsEvent fetches txs by event.
     * </pre>
     */
    public void getTxsEvent(cosmos.tx.v1beta1.GetTxsEventRequest request,
        io.grpc.stub.StreamObserver<cosmos.tx.v1beta1.GetTxsEventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTxsEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSimulateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.tx.v1beta1.SimulateRequest,
                cosmos.tx.v1beta1.SimulateResponse>(
                  this, METHODID_SIMULATE)))
          .addMethod(
            getGetTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.tx.v1beta1.GetTxRequest,
                cosmos.tx.v1beta1.GetTxResponse>(
                  this, METHODID_GET_TX)))
          .addMethod(
            getBroadcastTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.tx.v1beta1.BroadcastTxRequest,
                cosmos.tx.v1beta1.BroadcastTxResponse>(
                  this, METHODID_BROADCAST_TX)))
          .addMethod(
            getGetTxsEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.tx.v1beta1.GetTxsEventRequest,
                cosmos.tx.v1beta1.GetTxsEventResponse>(
                  this, METHODID_GET_TXS_EVENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service defines a gRPC service for interacting with transactions.
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
     * Simulate simulates executing a transaction for estimating gas usage.
     * </pre>
     */
    public void simulate(cosmos.tx.v1beta1.SimulateRequest request,
        io.grpc.stub.StreamObserver<cosmos.tx.v1beta1.SimulateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSimulateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTx fetches a tx by hash.
     * </pre>
     */
    public void getTx(cosmos.tx.v1beta1.GetTxRequest request,
        io.grpc.stub.StreamObserver<cosmos.tx.v1beta1.GetTxResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BroadcastTx broadcast transaction.
     * </pre>
     */
    public void broadcastTx(cosmos.tx.v1beta1.BroadcastTxRequest request,
        io.grpc.stub.StreamObserver<cosmos.tx.v1beta1.BroadcastTxResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBroadcastTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTxsEvent fetches txs by event.
     * </pre>
     */
    public void getTxsEvent(cosmos.tx.v1beta1.GetTxsEventRequest request,
        io.grpc.stub.StreamObserver<cosmos.tx.v1beta1.GetTxsEventResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTxsEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service defines a gRPC service for interacting with transactions.
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
     * Simulate simulates executing a transaction for estimating gas usage.
     * </pre>
     */
    public cosmos.tx.v1beta1.SimulateResponse simulate(cosmos.tx.v1beta1.SimulateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSimulateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTx fetches a tx by hash.
     * </pre>
     */
    public cosmos.tx.v1beta1.GetTxResponse getTx(cosmos.tx.v1beta1.GetTxRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BroadcastTx broadcast transaction.
     * </pre>
     */
    public cosmos.tx.v1beta1.BroadcastTxResponse broadcastTx(cosmos.tx.v1beta1.BroadcastTxRequest request) {
      return blockingUnaryCall(
          getChannel(), getBroadcastTxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTxsEvent fetches txs by event.
     * </pre>
     */
    public cosmos.tx.v1beta1.GetTxsEventResponse getTxsEvent(cosmos.tx.v1beta1.GetTxsEventRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTxsEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service defines a gRPC service for interacting with transactions.
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
     * Simulate simulates executing a transaction for estimating gas usage.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.tx.v1beta1.SimulateResponse> simulate(
        cosmos.tx.v1beta1.SimulateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSimulateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTx fetches a tx by hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.tx.v1beta1.GetTxResponse> getTx(
        cosmos.tx.v1beta1.GetTxRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BroadcastTx broadcast transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.tx.v1beta1.BroadcastTxResponse> broadcastTx(
        cosmos.tx.v1beta1.BroadcastTxRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBroadcastTxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTxsEvent fetches txs by event.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.tx.v1beta1.GetTxsEventResponse> getTxsEvent(
        cosmos.tx.v1beta1.GetTxsEventRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTxsEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIMULATE = 0;
  private static final int METHODID_GET_TX = 1;
  private static final int METHODID_BROADCAST_TX = 2;
  private static final int METHODID_GET_TXS_EVENT = 3;

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
        case METHODID_SIMULATE:
          serviceImpl.simulate((cosmos.tx.v1beta1.SimulateRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.tx.v1beta1.SimulateResponse>) responseObserver);
          break;
        case METHODID_GET_TX:
          serviceImpl.getTx((cosmos.tx.v1beta1.GetTxRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.tx.v1beta1.GetTxResponse>) responseObserver);
          break;
        case METHODID_BROADCAST_TX:
          serviceImpl.broadcastTx((cosmos.tx.v1beta1.BroadcastTxRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.tx.v1beta1.BroadcastTxResponse>) responseObserver);
          break;
        case METHODID_GET_TXS_EVENT:
          serviceImpl.getTxsEvent((cosmos.tx.v1beta1.GetTxsEventRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.tx.v1beta1.GetTxsEventResponse>) responseObserver);
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
      return cosmos.tx.v1beta1.ServiceOuterClass.getDescriptor();
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
              .addMethod(getSimulateMethod())
              .addMethod(getGetTxMethod())
              .addMethod(getBroadcastTxMethod())
              .addMethod(getGetTxsEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
