package cosmos.gov.v1beta1;

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
 * Query defines the gRPC querier service for gov module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: cosmos/gov/v1beta1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmos.gov.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryProposalRequest,
      cosmos.gov.v1beta1.QueryProposalResponse> getProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Proposal",
      requestType = cosmos.gov.v1beta1.QueryProposalRequest.class,
      responseType = cosmos.gov.v1beta1.QueryProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryProposalRequest,
      cosmos.gov.v1beta1.QueryProposalResponse> getProposalMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryProposalRequest, cosmos.gov.v1beta1.QueryProposalResponse> getProposalMethod;
    if ((getProposalMethod = QueryGrpc.getProposalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProposalMethod = QueryGrpc.getProposalMethod) == null) {
          QueryGrpc.getProposalMethod = getProposalMethod = 
              io.grpc.MethodDescriptor.<cosmos.gov.v1beta1.QueryProposalRequest, cosmos.gov.v1beta1.QueryProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.gov.v1beta1.Query", "Proposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryProposalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Proposal"))
                  .build();
          }
        }
     }
     return getProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryProposalsRequest,
      cosmos.gov.v1beta1.QueryProposalsResponse> getProposalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Proposals",
      requestType = cosmos.gov.v1beta1.QueryProposalsRequest.class,
      responseType = cosmos.gov.v1beta1.QueryProposalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryProposalsRequest,
      cosmos.gov.v1beta1.QueryProposalsResponse> getProposalsMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryProposalsRequest, cosmos.gov.v1beta1.QueryProposalsResponse> getProposalsMethod;
    if ((getProposalsMethod = QueryGrpc.getProposalsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProposalsMethod = QueryGrpc.getProposalsMethod) == null) {
          QueryGrpc.getProposalsMethod = getProposalsMethod = 
              io.grpc.MethodDescriptor.<cosmos.gov.v1beta1.QueryProposalsRequest, cosmos.gov.v1beta1.QueryProposalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.gov.v1beta1.Query", "Proposals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryProposalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryProposalsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Proposals"))
                  .build();
          }
        }
     }
     return getProposalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryVoteRequest,
      cosmos.gov.v1beta1.QueryVoteResponse> getVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Vote",
      requestType = cosmos.gov.v1beta1.QueryVoteRequest.class,
      responseType = cosmos.gov.v1beta1.QueryVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryVoteRequest,
      cosmos.gov.v1beta1.QueryVoteResponse> getVoteMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryVoteRequest, cosmos.gov.v1beta1.QueryVoteResponse> getVoteMethod;
    if ((getVoteMethod = QueryGrpc.getVoteMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVoteMethod = QueryGrpc.getVoteMethod) == null) {
          QueryGrpc.getVoteMethod = getVoteMethod = 
              io.grpc.MethodDescriptor.<cosmos.gov.v1beta1.QueryVoteRequest, cosmos.gov.v1beta1.QueryVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.gov.v1beta1.Query", "Vote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryVoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryVoteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Vote"))
                  .build();
          }
        }
     }
     return getVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryVotesRequest,
      cosmos.gov.v1beta1.QueryVotesResponse> getVotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Votes",
      requestType = cosmos.gov.v1beta1.QueryVotesRequest.class,
      responseType = cosmos.gov.v1beta1.QueryVotesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryVotesRequest,
      cosmos.gov.v1beta1.QueryVotesResponse> getVotesMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryVotesRequest, cosmos.gov.v1beta1.QueryVotesResponse> getVotesMethod;
    if ((getVotesMethod = QueryGrpc.getVotesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVotesMethod = QueryGrpc.getVotesMethod) == null) {
          QueryGrpc.getVotesMethod = getVotesMethod = 
              io.grpc.MethodDescriptor.<cosmos.gov.v1beta1.QueryVotesRequest, cosmos.gov.v1beta1.QueryVotesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.gov.v1beta1.Query", "Votes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryVotesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryVotesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Votes"))
                  .build();
          }
        }
     }
     return getVotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryParamsRequest,
      cosmos.gov.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = cosmos.gov.v1beta1.QueryParamsRequest.class,
      responseType = cosmos.gov.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryParamsRequest,
      cosmos.gov.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryParamsRequest, cosmos.gov.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod = 
              io.grpc.MethodDescriptor.<cosmos.gov.v1beta1.QueryParamsRequest, cosmos.gov.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.gov.v1beta1.Query", "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryParamsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
                  .build();
          }
        }
     }
     return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryDepositRequest,
      cosmos.gov.v1beta1.QueryDepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = cosmos.gov.v1beta1.QueryDepositRequest.class,
      responseType = cosmos.gov.v1beta1.QueryDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryDepositRequest,
      cosmos.gov.v1beta1.QueryDepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryDepositRequest, cosmos.gov.v1beta1.QueryDepositResponse> getDepositMethod;
    if ((getDepositMethod = QueryGrpc.getDepositMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositMethod = QueryGrpc.getDepositMethod) == null) {
          QueryGrpc.getDepositMethod = getDepositMethod = 
              io.grpc.MethodDescriptor.<cosmos.gov.v1beta1.QueryDepositRequest, cosmos.gov.v1beta1.QueryDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.gov.v1beta1.Query", "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryDepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryDepositResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Deposit"))
                  .build();
          }
        }
     }
     return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryDepositsRequest,
      cosmos.gov.v1beta1.QueryDepositsResponse> getDepositsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposits",
      requestType = cosmos.gov.v1beta1.QueryDepositsRequest.class,
      responseType = cosmos.gov.v1beta1.QueryDepositsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryDepositsRequest,
      cosmos.gov.v1beta1.QueryDepositsResponse> getDepositsMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryDepositsRequest, cosmos.gov.v1beta1.QueryDepositsResponse> getDepositsMethod;
    if ((getDepositsMethod = QueryGrpc.getDepositsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositsMethod = QueryGrpc.getDepositsMethod) == null) {
          QueryGrpc.getDepositsMethod = getDepositsMethod = 
              io.grpc.MethodDescriptor.<cosmos.gov.v1beta1.QueryDepositsRequest, cosmos.gov.v1beta1.QueryDepositsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.gov.v1beta1.Query", "Deposits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryDepositsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryDepositsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Deposits"))
                  .build();
          }
        }
     }
     return getDepositsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryTallyResultRequest,
      cosmos.gov.v1beta1.QueryTallyResultResponse> getTallyResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TallyResult",
      requestType = cosmos.gov.v1beta1.QueryTallyResultRequest.class,
      responseType = cosmos.gov.v1beta1.QueryTallyResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryTallyResultRequest,
      cosmos.gov.v1beta1.QueryTallyResultResponse> getTallyResultMethod() {
    io.grpc.MethodDescriptor<cosmos.gov.v1beta1.QueryTallyResultRequest, cosmos.gov.v1beta1.QueryTallyResultResponse> getTallyResultMethod;
    if ((getTallyResultMethod = QueryGrpc.getTallyResultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTallyResultMethod = QueryGrpc.getTallyResultMethod) == null) {
          QueryGrpc.getTallyResultMethod = getTallyResultMethod = 
              io.grpc.MethodDescriptor.<cosmos.gov.v1beta1.QueryTallyResultRequest, cosmos.gov.v1beta1.QueryTallyResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.gov.v1beta1.Query", "TallyResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryTallyResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.gov.v1beta1.QueryTallyResultResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TallyResult"))
                  .build();
          }
        }
     }
     return getTallyResultMethod;
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
   * Query defines the gRPC querier service for gov module
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Proposal queries proposal details based on ProposalID.
     * </pre>
     */
    public void proposal(cosmos.gov.v1beta1.QueryProposalRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryProposalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Proposals queries all proposals based on given status.
     * </pre>
     */
    public void proposals(cosmos.gov.v1beta1.QueryProposalsRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryProposalsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProposalsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Vote queries voted information based on proposalID, voterAddr.
     * </pre>
     */
    public void vote(cosmos.gov.v1beta1.QueryVoteRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryVoteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Votes queries votes of a given proposal.
     * </pre>
     */
    public void votes(cosmos.gov.v1beta1.QueryVotesRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryVotesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVotesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters of the gov module.
     * </pre>
     */
    public void params(cosmos.gov.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deposit queries single deposit information based proposalID, depositAddr.
     * </pre>
     */
    public void deposit(cosmos.gov.v1beta1.QueryDepositRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryDepositResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deposits queries all deposits of a single proposal.
     * </pre>
     */
    public void deposits(cosmos.gov.v1beta1.QueryDepositsRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryDepositsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDepositsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TallyResult queries the tally of a proposal vote.
     * </pre>
     */
    public void tallyResult(cosmos.gov.v1beta1.QueryTallyResultRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryTallyResultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTallyResultMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProposalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.gov.v1beta1.QueryProposalRequest,
                cosmos.gov.v1beta1.QueryProposalResponse>(
                  this, METHODID_PROPOSAL)))
          .addMethod(
            getProposalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.gov.v1beta1.QueryProposalsRequest,
                cosmos.gov.v1beta1.QueryProposalsResponse>(
                  this, METHODID_PROPOSALS)))
          .addMethod(
            getVoteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.gov.v1beta1.QueryVoteRequest,
                cosmos.gov.v1beta1.QueryVoteResponse>(
                  this, METHODID_VOTE)))
          .addMethod(
            getVotesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.gov.v1beta1.QueryVotesRequest,
                cosmos.gov.v1beta1.QueryVotesResponse>(
                  this, METHODID_VOTES)))
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.gov.v1beta1.QueryParamsRequest,
                cosmos.gov.v1beta1.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getDepositMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.gov.v1beta1.QueryDepositRequest,
                cosmos.gov.v1beta1.QueryDepositResponse>(
                  this, METHODID_DEPOSIT)))
          .addMethod(
            getDepositsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.gov.v1beta1.QueryDepositsRequest,
                cosmos.gov.v1beta1.QueryDepositsResponse>(
                  this, METHODID_DEPOSITS)))
          .addMethod(
            getTallyResultMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.gov.v1beta1.QueryTallyResultRequest,
                cosmos.gov.v1beta1.QueryTallyResultResponse>(
                  this, METHODID_TALLY_RESULT)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for gov module
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
     * Proposal queries proposal details based on ProposalID.
     * </pre>
     */
    public void proposal(cosmos.gov.v1beta1.QueryProposalRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryProposalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Proposals queries all proposals based on given status.
     * </pre>
     */
    public void proposals(cosmos.gov.v1beta1.QueryProposalsRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryProposalsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProposalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Vote queries voted information based on proposalID, voterAddr.
     * </pre>
     */
    public void vote(cosmos.gov.v1beta1.QueryVoteRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryVoteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Votes queries votes of a given proposal.
     * </pre>
     */
    public void votes(cosmos.gov.v1beta1.QueryVotesRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryVotesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters of the gov module.
     * </pre>
     */
    public void params(cosmos.gov.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deposit queries single deposit information based proposalID, depositAddr.
     * </pre>
     */
    public void deposit(cosmos.gov.v1beta1.QueryDepositRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryDepositResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deposits queries all deposits of a single proposal.
     * </pre>
     */
    public void deposits(cosmos.gov.v1beta1.QueryDepositsRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryDepositsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDepositsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TallyResult queries the tally of a proposal vote.
     * </pre>
     */
    public void tallyResult(cosmos.gov.v1beta1.QueryTallyResultRequest request,
        io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryTallyResultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTallyResultMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for gov module
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
     * Proposal queries proposal details based on ProposalID.
     * </pre>
     */
    public cosmos.gov.v1beta1.QueryProposalResponse proposal(cosmos.gov.v1beta1.QueryProposalRequest request) {
      return blockingUnaryCall(
          getChannel(), getProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Proposals queries all proposals based on given status.
     * </pre>
     */
    public cosmos.gov.v1beta1.QueryProposalsResponse proposals(cosmos.gov.v1beta1.QueryProposalsRequest request) {
      return blockingUnaryCall(
          getChannel(), getProposalsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Vote queries voted information based on proposalID, voterAddr.
     * </pre>
     */
    public cosmos.gov.v1beta1.QueryVoteResponse vote(cosmos.gov.v1beta1.QueryVoteRequest request) {
      return blockingUnaryCall(
          getChannel(), getVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Votes queries votes of a given proposal.
     * </pre>
     */
    public cosmos.gov.v1beta1.QueryVotesResponse votes(cosmos.gov.v1beta1.QueryVotesRequest request) {
      return blockingUnaryCall(
          getChannel(), getVotesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries all parameters of the gov module.
     * </pre>
     */
    public cosmos.gov.v1beta1.QueryParamsResponse params(cosmos.gov.v1beta1.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deposit queries single deposit information based proposalID, depositAddr.
     * </pre>
     */
    public cosmos.gov.v1beta1.QueryDepositResponse deposit(cosmos.gov.v1beta1.QueryDepositRequest request) {
      return blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deposits queries all deposits of a single proposal.
     * </pre>
     */
    public cosmos.gov.v1beta1.QueryDepositsResponse deposits(cosmos.gov.v1beta1.QueryDepositsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDepositsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TallyResult queries the tally of a proposal vote.
     * </pre>
     */
    public cosmos.gov.v1beta1.QueryTallyResultResponse tallyResult(cosmos.gov.v1beta1.QueryTallyResultRequest request) {
      return blockingUnaryCall(
          getChannel(), getTallyResultMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for gov module
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
     * Proposal queries proposal details based on ProposalID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1beta1.QueryProposalResponse> proposal(
        cosmos.gov.v1beta1.QueryProposalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Proposals queries all proposals based on given status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1beta1.QueryProposalsResponse> proposals(
        cosmos.gov.v1beta1.QueryProposalsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProposalsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Vote queries voted information based on proposalID, voterAddr.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1beta1.QueryVoteResponse> vote(
        cosmos.gov.v1beta1.QueryVoteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Votes queries votes of a given proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1beta1.QueryVotesResponse> votes(
        cosmos.gov.v1beta1.QueryVotesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVotesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries all parameters of the gov module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1beta1.QueryParamsResponse> params(
        cosmos.gov.v1beta1.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deposit queries single deposit information based proposalID, depositAddr.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1beta1.QueryDepositResponse> deposit(
        cosmos.gov.v1beta1.QueryDepositRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deposits queries all deposits of a single proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1beta1.QueryDepositsResponse> deposits(
        cosmos.gov.v1beta1.QueryDepositsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDepositsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TallyResult queries the tally of a proposal vote.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.gov.v1beta1.QueryTallyResultResponse> tallyResult(
        cosmos.gov.v1beta1.QueryTallyResultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTallyResultMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROPOSAL = 0;
  private static final int METHODID_PROPOSALS = 1;
  private static final int METHODID_VOTE = 2;
  private static final int METHODID_VOTES = 3;
  private static final int METHODID_PARAMS = 4;
  private static final int METHODID_DEPOSIT = 5;
  private static final int METHODID_DEPOSITS = 6;
  private static final int METHODID_TALLY_RESULT = 7;

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
        case METHODID_PROPOSAL:
          serviceImpl.proposal((cosmos.gov.v1beta1.QueryProposalRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryProposalResponse>) responseObserver);
          break;
        case METHODID_PROPOSALS:
          serviceImpl.proposals((cosmos.gov.v1beta1.QueryProposalsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryProposalsResponse>) responseObserver);
          break;
        case METHODID_VOTE:
          serviceImpl.vote((cosmos.gov.v1beta1.QueryVoteRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryVoteResponse>) responseObserver);
          break;
        case METHODID_VOTES:
          serviceImpl.votes((cosmos.gov.v1beta1.QueryVotesRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryVotesResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((cosmos.gov.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT:
          serviceImpl.deposit((cosmos.gov.v1beta1.QueryDepositRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryDepositResponse>) responseObserver);
          break;
        case METHODID_DEPOSITS:
          serviceImpl.deposits((cosmos.gov.v1beta1.QueryDepositsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryDepositsResponse>) responseObserver);
          break;
        case METHODID_TALLY_RESULT:
          serviceImpl.tallyResult((cosmos.gov.v1beta1.QueryTallyResultRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.gov.v1beta1.QueryTallyResultResponse>) responseObserver);
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
      return cosmos.gov.v1beta1.QueryOuterClass.getDescriptor();
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
              .addMethod(getProposalMethod())
              .addMethod(getProposalsMethod())
              .addMethod(getVoteMethod())
              .addMethod(getVotesMethod())
              .addMethod(getParamsMethod())
              .addMethod(getDepositMethod())
              .addMethod(getDepositsMethod())
              .addMethod(getTallyResultMethod())
              .build();
        }
      }
    }
    return result;
  }
}
