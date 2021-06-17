package tendermint.abci;

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
    comments = "Source: tendermint/abci/types.proto")
public final class ABCIApplicationGrpc {

  private ABCIApplicationGrpc() {}

  public static final String SERVICE_NAME = "tendermint.abci.ABCIApplication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestEcho,
      tendermint.abci.ResponseEcho> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = tendermint.abci.RequestEcho.class,
      responseType = tendermint.abci.ResponseEcho.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestEcho,
      tendermint.abci.ResponseEcho> getEchoMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestEcho, tendermint.abci.ResponseEcho> getEchoMethod;
    if ((getEchoMethod = ABCIApplicationGrpc.getEchoMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getEchoMethod = ABCIApplicationGrpc.getEchoMethod) == null) {
          ABCIApplicationGrpc.getEchoMethod = getEchoMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestEcho, tendermint.abci.ResponseEcho>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestEcho.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseEcho.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Echo"))
                  .build();
          }
        }
     }
     return getEchoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestFlush,
      tendermint.abci.ResponseFlush> getFlushMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Flush",
      requestType = tendermint.abci.RequestFlush.class,
      responseType = tendermint.abci.ResponseFlush.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestFlush,
      tendermint.abci.ResponseFlush> getFlushMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestFlush, tendermint.abci.ResponseFlush> getFlushMethod;
    if ((getFlushMethod = ABCIApplicationGrpc.getFlushMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getFlushMethod = ABCIApplicationGrpc.getFlushMethod) == null) {
          ABCIApplicationGrpc.getFlushMethod = getFlushMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestFlush, tendermint.abci.ResponseFlush>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "Flush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestFlush.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseFlush.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Flush"))
                  .build();
          }
        }
     }
     return getFlushMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestInfo,
      tendermint.abci.ResponseInfo> getInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Info",
      requestType = tendermint.abci.RequestInfo.class,
      responseType = tendermint.abci.ResponseInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestInfo,
      tendermint.abci.ResponseInfo> getInfoMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestInfo, tendermint.abci.ResponseInfo> getInfoMethod;
    if ((getInfoMethod = ABCIApplicationGrpc.getInfoMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getInfoMethod = ABCIApplicationGrpc.getInfoMethod) == null) {
          ABCIApplicationGrpc.getInfoMethod = getInfoMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestInfo, tendermint.abci.ResponseInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "Info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Info"))
                  .build();
          }
        }
     }
     return getInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestSetOption,
      tendermint.abci.ResponseSetOption> getSetOptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOption",
      requestType = tendermint.abci.RequestSetOption.class,
      responseType = tendermint.abci.ResponseSetOption.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestSetOption,
      tendermint.abci.ResponseSetOption> getSetOptionMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestSetOption, tendermint.abci.ResponseSetOption> getSetOptionMethod;
    if ((getSetOptionMethod = ABCIApplicationGrpc.getSetOptionMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getSetOptionMethod = ABCIApplicationGrpc.getSetOptionMethod) == null) {
          ABCIApplicationGrpc.getSetOptionMethod = getSetOptionMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestSetOption, tendermint.abci.ResponseSetOption>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "SetOption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestSetOption.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseSetOption.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("SetOption"))
                  .build();
          }
        }
     }
     return getSetOptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestDeliverTx,
      tendermint.abci.ResponseDeliverTx> getDeliverTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeliverTx",
      requestType = tendermint.abci.RequestDeliverTx.class,
      responseType = tendermint.abci.ResponseDeliverTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestDeliverTx,
      tendermint.abci.ResponseDeliverTx> getDeliverTxMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestDeliverTx, tendermint.abci.ResponseDeliverTx> getDeliverTxMethod;
    if ((getDeliverTxMethod = ABCIApplicationGrpc.getDeliverTxMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getDeliverTxMethod = ABCIApplicationGrpc.getDeliverTxMethod) == null) {
          ABCIApplicationGrpc.getDeliverTxMethod = getDeliverTxMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestDeliverTx, tendermint.abci.ResponseDeliverTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "DeliverTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestDeliverTx.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseDeliverTx.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("DeliverTx"))
                  .build();
          }
        }
     }
     return getDeliverTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestCheckTx,
      tendermint.abci.ResponseCheckTx> getCheckTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckTx",
      requestType = tendermint.abci.RequestCheckTx.class,
      responseType = tendermint.abci.ResponseCheckTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestCheckTx,
      tendermint.abci.ResponseCheckTx> getCheckTxMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestCheckTx, tendermint.abci.ResponseCheckTx> getCheckTxMethod;
    if ((getCheckTxMethod = ABCIApplicationGrpc.getCheckTxMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getCheckTxMethod = ABCIApplicationGrpc.getCheckTxMethod) == null) {
          ABCIApplicationGrpc.getCheckTxMethod = getCheckTxMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestCheckTx, tendermint.abci.ResponseCheckTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "CheckTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestCheckTx.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseCheckTx.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("CheckTx"))
                  .build();
          }
        }
     }
     return getCheckTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestQuery,
      tendermint.abci.ResponseQuery> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = tendermint.abci.RequestQuery.class,
      responseType = tendermint.abci.ResponseQuery.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestQuery,
      tendermint.abci.ResponseQuery> getQueryMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestQuery, tendermint.abci.ResponseQuery> getQueryMethod;
    if ((getQueryMethod = ABCIApplicationGrpc.getQueryMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getQueryMethod = ABCIApplicationGrpc.getQueryMethod) == null) {
          ABCIApplicationGrpc.getQueryMethod = getQueryMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestQuery, tendermint.abci.ResponseQuery>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseQuery.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Query"))
                  .build();
          }
        }
     }
     return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestCommit,
      tendermint.abci.ResponseCommit> getCommitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Commit",
      requestType = tendermint.abci.RequestCommit.class,
      responseType = tendermint.abci.ResponseCommit.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestCommit,
      tendermint.abci.ResponseCommit> getCommitMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestCommit, tendermint.abci.ResponseCommit> getCommitMethod;
    if ((getCommitMethod = ABCIApplicationGrpc.getCommitMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getCommitMethod = ABCIApplicationGrpc.getCommitMethod) == null) {
          ABCIApplicationGrpc.getCommitMethod = getCommitMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestCommit, tendermint.abci.ResponseCommit>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "Commit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestCommit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseCommit.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Commit"))
                  .build();
          }
        }
     }
     return getCommitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestInitChain,
      tendermint.abci.ResponseInitChain> getInitChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitChain",
      requestType = tendermint.abci.RequestInitChain.class,
      responseType = tendermint.abci.ResponseInitChain.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestInitChain,
      tendermint.abci.ResponseInitChain> getInitChainMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestInitChain, tendermint.abci.ResponseInitChain> getInitChainMethod;
    if ((getInitChainMethod = ABCIApplicationGrpc.getInitChainMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getInitChainMethod = ABCIApplicationGrpc.getInitChainMethod) == null) {
          ABCIApplicationGrpc.getInitChainMethod = getInitChainMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestInitChain, tendermint.abci.ResponseInitChain>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "InitChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestInitChain.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseInitChain.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("InitChain"))
                  .build();
          }
        }
     }
     return getInitChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestBeginBlock,
      tendermint.abci.ResponseBeginBlock> getBeginBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeginBlock",
      requestType = tendermint.abci.RequestBeginBlock.class,
      responseType = tendermint.abci.ResponseBeginBlock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestBeginBlock,
      tendermint.abci.ResponseBeginBlock> getBeginBlockMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestBeginBlock, tendermint.abci.ResponseBeginBlock> getBeginBlockMethod;
    if ((getBeginBlockMethod = ABCIApplicationGrpc.getBeginBlockMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getBeginBlockMethod = ABCIApplicationGrpc.getBeginBlockMethod) == null) {
          ABCIApplicationGrpc.getBeginBlockMethod = getBeginBlockMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestBeginBlock, tendermint.abci.ResponseBeginBlock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "BeginBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestBeginBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseBeginBlock.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("BeginBlock"))
                  .build();
          }
        }
     }
     return getBeginBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestEndBlock,
      tendermint.abci.ResponseEndBlock> getEndBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndBlock",
      requestType = tendermint.abci.RequestEndBlock.class,
      responseType = tendermint.abci.ResponseEndBlock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestEndBlock,
      tendermint.abci.ResponseEndBlock> getEndBlockMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestEndBlock, tendermint.abci.ResponseEndBlock> getEndBlockMethod;
    if ((getEndBlockMethod = ABCIApplicationGrpc.getEndBlockMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getEndBlockMethod = ABCIApplicationGrpc.getEndBlockMethod) == null) {
          ABCIApplicationGrpc.getEndBlockMethod = getEndBlockMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestEndBlock, tendermint.abci.ResponseEndBlock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "EndBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestEndBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseEndBlock.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("EndBlock"))
                  .build();
          }
        }
     }
     return getEndBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestListSnapshots,
      tendermint.abci.ResponseListSnapshots> getListSnapshotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSnapshots",
      requestType = tendermint.abci.RequestListSnapshots.class,
      responseType = tendermint.abci.ResponseListSnapshots.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestListSnapshots,
      tendermint.abci.ResponseListSnapshots> getListSnapshotsMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestListSnapshots, tendermint.abci.ResponseListSnapshots> getListSnapshotsMethod;
    if ((getListSnapshotsMethod = ABCIApplicationGrpc.getListSnapshotsMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getListSnapshotsMethod = ABCIApplicationGrpc.getListSnapshotsMethod) == null) {
          ABCIApplicationGrpc.getListSnapshotsMethod = getListSnapshotsMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestListSnapshots, tendermint.abci.ResponseListSnapshots>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "ListSnapshots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestListSnapshots.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseListSnapshots.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("ListSnapshots"))
                  .build();
          }
        }
     }
     return getListSnapshotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestOfferSnapshot,
      tendermint.abci.ResponseOfferSnapshot> getOfferSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OfferSnapshot",
      requestType = tendermint.abci.RequestOfferSnapshot.class,
      responseType = tendermint.abci.ResponseOfferSnapshot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestOfferSnapshot,
      tendermint.abci.ResponseOfferSnapshot> getOfferSnapshotMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestOfferSnapshot, tendermint.abci.ResponseOfferSnapshot> getOfferSnapshotMethod;
    if ((getOfferSnapshotMethod = ABCIApplicationGrpc.getOfferSnapshotMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getOfferSnapshotMethod = ABCIApplicationGrpc.getOfferSnapshotMethod) == null) {
          ABCIApplicationGrpc.getOfferSnapshotMethod = getOfferSnapshotMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestOfferSnapshot, tendermint.abci.ResponseOfferSnapshot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "OfferSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestOfferSnapshot.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseOfferSnapshot.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("OfferSnapshot"))
                  .build();
          }
        }
     }
     return getOfferSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestLoadSnapshotChunk,
      tendermint.abci.ResponseLoadSnapshotChunk> getLoadSnapshotChunkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoadSnapshotChunk",
      requestType = tendermint.abci.RequestLoadSnapshotChunk.class,
      responseType = tendermint.abci.ResponseLoadSnapshotChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestLoadSnapshotChunk,
      tendermint.abci.ResponseLoadSnapshotChunk> getLoadSnapshotChunkMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestLoadSnapshotChunk, tendermint.abci.ResponseLoadSnapshotChunk> getLoadSnapshotChunkMethod;
    if ((getLoadSnapshotChunkMethod = ABCIApplicationGrpc.getLoadSnapshotChunkMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getLoadSnapshotChunkMethod = ABCIApplicationGrpc.getLoadSnapshotChunkMethod) == null) {
          ABCIApplicationGrpc.getLoadSnapshotChunkMethod = getLoadSnapshotChunkMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestLoadSnapshotChunk, tendermint.abci.ResponseLoadSnapshotChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "LoadSnapshotChunk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestLoadSnapshotChunk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseLoadSnapshotChunk.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("LoadSnapshotChunk"))
                  .build();
          }
        }
     }
     return getLoadSnapshotChunkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tendermint.abci.RequestApplySnapshotChunk,
      tendermint.abci.ResponseApplySnapshotChunk> getApplySnapshotChunkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplySnapshotChunk",
      requestType = tendermint.abci.RequestApplySnapshotChunk.class,
      responseType = tendermint.abci.ResponseApplySnapshotChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tendermint.abci.RequestApplySnapshotChunk,
      tendermint.abci.ResponseApplySnapshotChunk> getApplySnapshotChunkMethod() {
    io.grpc.MethodDescriptor<tendermint.abci.RequestApplySnapshotChunk, tendermint.abci.ResponseApplySnapshotChunk> getApplySnapshotChunkMethod;
    if ((getApplySnapshotChunkMethod = ABCIApplicationGrpc.getApplySnapshotChunkMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getApplySnapshotChunkMethod = ABCIApplicationGrpc.getApplySnapshotChunkMethod) == null) {
          ABCIApplicationGrpc.getApplySnapshotChunkMethod = getApplySnapshotChunkMethod = 
              io.grpc.MethodDescriptor.<tendermint.abci.RequestApplySnapshotChunk, tendermint.abci.ResponseApplySnapshotChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tendermint.abci.ABCIApplication", "ApplySnapshotChunk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.RequestApplySnapshotChunk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tendermint.abci.ResponseApplySnapshotChunk.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("ApplySnapshotChunk"))
                  .build();
          }
        }
     }
     return getApplySnapshotChunkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ABCIApplicationStub newStub(io.grpc.Channel channel) {
    return new ABCIApplicationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ABCIApplicationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ABCIApplicationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ABCIApplicationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ABCIApplicationFutureStub(channel);
  }

  /**
   */
  public static abstract class ABCIApplicationImplBase implements io.grpc.BindableService {

    /**
     */
    public void echo(tendermint.abci.RequestEcho request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseEcho> responseObserver) {
      asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    /**
     */
    public void flush(tendermint.abci.RequestFlush request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseFlush> responseObserver) {
      asyncUnimplementedUnaryCall(getFlushMethod(), responseObserver);
    }

    /**
     */
    public void info(tendermint.abci.RequestInfo request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getInfoMethod(), responseObserver);
    }

    /**
     */
    public void setOption(tendermint.abci.RequestSetOption request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseSetOption> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOptionMethod(), responseObserver);
    }

    /**
     */
    public void deliverTx(tendermint.abci.RequestDeliverTx request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseDeliverTx> responseObserver) {
      asyncUnimplementedUnaryCall(getDeliverTxMethod(), responseObserver);
    }

    /**
     */
    public void checkTx(tendermint.abci.RequestCheckTx request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseCheckTx> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckTxMethod(), responseObserver);
    }

    /**
     */
    public void query(tendermint.abci.RequestQuery request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseQuery> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     */
    public void commit(tendermint.abci.RequestCommit request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseCommit> responseObserver) {
      asyncUnimplementedUnaryCall(getCommitMethod(), responseObserver);
    }

    /**
     */
    public void initChain(tendermint.abci.RequestInitChain request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseInitChain> responseObserver) {
      asyncUnimplementedUnaryCall(getInitChainMethod(), responseObserver);
    }

    /**
     */
    public void beginBlock(tendermint.abci.RequestBeginBlock request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseBeginBlock> responseObserver) {
      asyncUnimplementedUnaryCall(getBeginBlockMethod(), responseObserver);
    }

    /**
     */
    public void endBlock(tendermint.abci.RequestEndBlock request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseEndBlock> responseObserver) {
      asyncUnimplementedUnaryCall(getEndBlockMethod(), responseObserver);
    }

    /**
     */
    public void listSnapshots(tendermint.abci.RequestListSnapshots request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseListSnapshots> responseObserver) {
      asyncUnimplementedUnaryCall(getListSnapshotsMethod(), responseObserver);
    }

    /**
     */
    public void offerSnapshot(tendermint.abci.RequestOfferSnapshot request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseOfferSnapshot> responseObserver) {
      asyncUnimplementedUnaryCall(getOfferSnapshotMethod(), responseObserver);
    }

    /**
     */
    public void loadSnapshotChunk(tendermint.abci.RequestLoadSnapshotChunk request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseLoadSnapshotChunk> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadSnapshotChunkMethod(), responseObserver);
    }

    /**
     */
    public void applySnapshotChunk(tendermint.abci.RequestApplySnapshotChunk request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseApplySnapshotChunk> responseObserver) {
      asyncUnimplementedUnaryCall(getApplySnapshotChunkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEchoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestEcho,
                tendermint.abci.ResponseEcho>(
                  this, METHODID_ECHO)))
          .addMethod(
            getFlushMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestFlush,
                tendermint.abci.ResponseFlush>(
                  this, METHODID_FLUSH)))
          .addMethod(
            getInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestInfo,
                tendermint.abci.ResponseInfo>(
                  this, METHODID_INFO)))
          .addMethod(
            getSetOptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestSetOption,
                tendermint.abci.ResponseSetOption>(
                  this, METHODID_SET_OPTION)))
          .addMethod(
            getDeliverTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestDeliverTx,
                tendermint.abci.ResponseDeliverTx>(
                  this, METHODID_DELIVER_TX)))
          .addMethod(
            getCheckTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestCheckTx,
                tendermint.abci.ResponseCheckTx>(
                  this, METHODID_CHECK_TX)))
          .addMethod(
            getQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestQuery,
                tendermint.abci.ResponseQuery>(
                  this, METHODID_QUERY)))
          .addMethod(
            getCommitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestCommit,
                tendermint.abci.ResponseCommit>(
                  this, METHODID_COMMIT)))
          .addMethod(
            getInitChainMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestInitChain,
                tendermint.abci.ResponseInitChain>(
                  this, METHODID_INIT_CHAIN)))
          .addMethod(
            getBeginBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestBeginBlock,
                tendermint.abci.ResponseBeginBlock>(
                  this, METHODID_BEGIN_BLOCK)))
          .addMethod(
            getEndBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestEndBlock,
                tendermint.abci.ResponseEndBlock>(
                  this, METHODID_END_BLOCK)))
          .addMethod(
            getListSnapshotsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestListSnapshots,
                tendermint.abci.ResponseListSnapshots>(
                  this, METHODID_LIST_SNAPSHOTS)))
          .addMethod(
            getOfferSnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestOfferSnapshot,
                tendermint.abci.ResponseOfferSnapshot>(
                  this, METHODID_OFFER_SNAPSHOT)))
          .addMethod(
            getLoadSnapshotChunkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestLoadSnapshotChunk,
                tendermint.abci.ResponseLoadSnapshotChunk>(
                  this, METHODID_LOAD_SNAPSHOT_CHUNK)))
          .addMethod(
            getApplySnapshotChunkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tendermint.abci.RequestApplySnapshotChunk,
                tendermint.abci.ResponseApplySnapshotChunk>(
                  this, METHODID_APPLY_SNAPSHOT_CHUNK)))
          .build();
    }
  }

  /**
   */
  public static final class ABCIApplicationStub extends io.grpc.stub.AbstractStub<ABCIApplicationStub> {
    private ABCIApplicationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ABCIApplicationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABCIApplicationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ABCIApplicationStub(channel, callOptions);
    }

    /**
     */
    public void echo(tendermint.abci.RequestEcho request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseEcho> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void flush(tendermint.abci.RequestFlush request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseFlush> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFlushMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void info(tendermint.abci.RequestInfo request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOption(tendermint.abci.RequestSetOption request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseSetOption> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetOptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deliverTx(tendermint.abci.RequestDeliverTx request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseDeliverTx> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeliverTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkTx(tendermint.abci.RequestCheckTx request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseCheckTx> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void query(tendermint.abci.RequestQuery request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseQuery> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commit(tendermint.abci.RequestCommit request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseCommit> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initChain(tendermint.abci.RequestInitChain request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseInitChain> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void beginBlock(tendermint.abci.RequestBeginBlock request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseBeginBlock> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBeginBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void endBlock(tendermint.abci.RequestEndBlock request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseEndBlock> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEndBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSnapshots(tendermint.abci.RequestListSnapshots request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseListSnapshots> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSnapshotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void offerSnapshot(tendermint.abci.RequestOfferSnapshot request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseOfferSnapshot> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOfferSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadSnapshotChunk(tendermint.abci.RequestLoadSnapshotChunk request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseLoadSnapshotChunk> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadSnapshotChunkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void applySnapshotChunk(tendermint.abci.RequestApplySnapshotChunk request,
        io.grpc.stub.StreamObserver<tendermint.abci.ResponseApplySnapshotChunk> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getApplySnapshotChunkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ABCIApplicationBlockingStub extends io.grpc.stub.AbstractStub<ABCIApplicationBlockingStub> {
    private ABCIApplicationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ABCIApplicationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABCIApplicationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ABCIApplicationBlockingStub(channel, callOptions);
    }

    /**
     */
    public tendermint.abci.ResponseEcho echo(tendermint.abci.RequestEcho request) {
      return blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseFlush flush(tendermint.abci.RequestFlush request) {
      return blockingUnaryCall(
          getChannel(), getFlushMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseInfo info(tendermint.abci.RequestInfo request) {
      return blockingUnaryCall(
          getChannel(), getInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseSetOption setOption(tendermint.abci.RequestSetOption request) {
      return blockingUnaryCall(
          getChannel(), getSetOptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseDeliverTx deliverTx(tendermint.abci.RequestDeliverTx request) {
      return blockingUnaryCall(
          getChannel(), getDeliverTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseCheckTx checkTx(tendermint.abci.RequestCheckTx request) {
      return blockingUnaryCall(
          getChannel(), getCheckTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseQuery query(tendermint.abci.RequestQuery request) {
      return blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseCommit commit(tendermint.abci.RequestCommit request) {
      return blockingUnaryCall(
          getChannel(), getCommitMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseInitChain initChain(tendermint.abci.RequestInitChain request) {
      return blockingUnaryCall(
          getChannel(), getInitChainMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseBeginBlock beginBlock(tendermint.abci.RequestBeginBlock request) {
      return blockingUnaryCall(
          getChannel(), getBeginBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseEndBlock endBlock(tendermint.abci.RequestEndBlock request) {
      return blockingUnaryCall(
          getChannel(), getEndBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseListSnapshots listSnapshots(tendermint.abci.RequestListSnapshots request) {
      return blockingUnaryCall(
          getChannel(), getListSnapshotsMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseOfferSnapshot offerSnapshot(tendermint.abci.RequestOfferSnapshot request) {
      return blockingUnaryCall(
          getChannel(), getOfferSnapshotMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseLoadSnapshotChunk loadSnapshotChunk(tendermint.abci.RequestLoadSnapshotChunk request) {
      return blockingUnaryCall(
          getChannel(), getLoadSnapshotChunkMethod(), getCallOptions(), request);
    }

    /**
     */
    public tendermint.abci.ResponseApplySnapshotChunk applySnapshotChunk(tendermint.abci.RequestApplySnapshotChunk request) {
      return blockingUnaryCall(
          getChannel(), getApplySnapshotChunkMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ABCIApplicationFutureStub extends io.grpc.stub.AbstractStub<ABCIApplicationFutureStub> {
    private ABCIApplicationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ABCIApplicationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABCIApplicationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ABCIApplicationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseEcho> echo(
        tendermint.abci.RequestEcho request) {
      return futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseFlush> flush(
        tendermint.abci.RequestFlush request) {
      return futureUnaryCall(
          getChannel().newCall(getFlushMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseInfo> info(
        tendermint.abci.RequestInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseSetOption> setOption(
        tendermint.abci.RequestSetOption request) {
      return futureUnaryCall(
          getChannel().newCall(getSetOptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseDeliverTx> deliverTx(
        tendermint.abci.RequestDeliverTx request) {
      return futureUnaryCall(
          getChannel().newCall(getDeliverTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseCheckTx> checkTx(
        tendermint.abci.RequestCheckTx request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseQuery> query(
        tendermint.abci.RequestQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseCommit> commit(
        tendermint.abci.RequestCommit request) {
      return futureUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseInitChain> initChain(
        tendermint.abci.RequestInitChain request) {
      return futureUnaryCall(
          getChannel().newCall(getInitChainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseBeginBlock> beginBlock(
        tendermint.abci.RequestBeginBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getBeginBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseEndBlock> endBlock(
        tendermint.abci.RequestEndBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getEndBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseListSnapshots> listSnapshots(
        tendermint.abci.RequestListSnapshots request) {
      return futureUnaryCall(
          getChannel().newCall(getListSnapshotsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseOfferSnapshot> offerSnapshot(
        tendermint.abci.RequestOfferSnapshot request) {
      return futureUnaryCall(
          getChannel().newCall(getOfferSnapshotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseLoadSnapshotChunk> loadSnapshotChunk(
        tendermint.abci.RequestLoadSnapshotChunk request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadSnapshotChunkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tendermint.abci.ResponseApplySnapshotChunk> applySnapshotChunk(
        tendermint.abci.RequestApplySnapshotChunk request) {
      return futureUnaryCall(
          getChannel().newCall(getApplySnapshotChunkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO = 0;
  private static final int METHODID_FLUSH = 1;
  private static final int METHODID_INFO = 2;
  private static final int METHODID_SET_OPTION = 3;
  private static final int METHODID_DELIVER_TX = 4;
  private static final int METHODID_CHECK_TX = 5;
  private static final int METHODID_QUERY = 6;
  private static final int METHODID_COMMIT = 7;
  private static final int METHODID_INIT_CHAIN = 8;
  private static final int METHODID_BEGIN_BLOCK = 9;
  private static final int METHODID_END_BLOCK = 10;
  private static final int METHODID_LIST_SNAPSHOTS = 11;
  private static final int METHODID_OFFER_SNAPSHOT = 12;
  private static final int METHODID_LOAD_SNAPSHOT_CHUNK = 13;
  private static final int METHODID_APPLY_SNAPSHOT_CHUNK = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ABCIApplicationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ABCIApplicationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ECHO:
          serviceImpl.echo((tendermint.abci.RequestEcho) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseEcho>) responseObserver);
          break;
        case METHODID_FLUSH:
          serviceImpl.flush((tendermint.abci.RequestFlush) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseFlush>) responseObserver);
          break;
        case METHODID_INFO:
          serviceImpl.info((tendermint.abci.RequestInfo) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseInfo>) responseObserver);
          break;
        case METHODID_SET_OPTION:
          serviceImpl.setOption((tendermint.abci.RequestSetOption) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseSetOption>) responseObserver);
          break;
        case METHODID_DELIVER_TX:
          serviceImpl.deliverTx((tendermint.abci.RequestDeliverTx) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseDeliverTx>) responseObserver);
          break;
        case METHODID_CHECK_TX:
          serviceImpl.checkTx((tendermint.abci.RequestCheckTx) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseCheckTx>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((tendermint.abci.RequestQuery) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseQuery>) responseObserver);
          break;
        case METHODID_COMMIT:
          serviceImpl.commit((tendermint.abci.RequestCommit) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseCommit>) responseObserver);
          break;
        case METHODID_INIT_CHAIN:
          serviceImpl.initChain((tendermint.abci.RequestInitChain) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseInitChain>) responseObserver);
          break;
        case METHODID_BEGIN_BLOCK:
          serviceImpl.beginBlock((tendermint.abci.RequestBeginBlock) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseBeginBlock>) responseObserver);
          break;
        case METHODID_END_BLOCK:
          serviceImpl.endBlock((tendermint.abci.RequestEndBlock) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseEndBlock>) responseObserver);
          break;
        case METHODID_LIST_SNAPSHOTS:
          serviceImpl.listSnapshots((tendermint.abci.RequestListSnapshots) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseListSnapshots>) responseObserver);
          break;
        case METHODID_OFFER_SNAPSHOT:
          serviceImpl.offerSnapshot((tendermint.abci.RequestOfferSnapshot) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseOfferSnapshot>) responseObserver);
          break;
        case METHODID_LOAD_SNAPSHOT_CHUNK:
          serviceImpl.loadSnapshotChunk((tendermint.abci.RequestLoadSnapshotChunk) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseLoadSnapshotChunk>) responseObserver);
          break;
        case METHODID_APPLY_SNAPSHOT_CHUNK:
          serviceImpl.applySnapshotChunk((tendermint.abci.RequestApplySnapshotChunk) request,
              (io.grpc.stub.StreamObserver<tendermint.abci.ResponseApplySnapshotChunk>) responseObserver);
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

  private static abstract class ABCIApplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ABCIApplicationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tendermint.abci.Types.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ABCIApplication");
    }
  }

  private static final class ABCIApplicationFileDescriptorSupplier
      extends ABCIApplicationBaseDescriptorSupplier {
    ABCIApplicationFileDescriptorSupplier() {}
  }

  private static final class ABCIApplicationMethodDescriptorSupplier
      extends ABCIApplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ABCIApplicationMethodDescriptorSupplier(String methodName) {
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
      synchronized (ABCIApplicationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ABCIApplicationFileDescriptorSupplier())
              .addMethod(getEchoMethod())
              .addMethod(getFlushMethod())
              .addMethod(getInfoMethod())
              .addMethod(getSetOptionMethod())
              .addMethod(getDeliverTxMethod())
              .addMethod(getCheckTxMethod())
              .addMethod(getQueryMethod())
              .addMethod(getCommitMethod())
              .addMethod(getInitChainMethod())
              .addMethod(getBeginBlockMethod())
              .addMethod(getEndBlockMethod())
              .addMethod(getListSnapshotsMethod())
              .addMethod(getOfferSnapshotMethod())
              .addMethod(getLoadSnapshotChunkMethod())
              .addMethod(getApplySnapshotChunkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
