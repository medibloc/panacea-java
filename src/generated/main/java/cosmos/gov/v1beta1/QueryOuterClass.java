// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package cosmos.gov.v1beta1;

public final class QueryOuterClass {
  private QueryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryProposalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryProposalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryProposalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryProposalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryProposalsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryProposalsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryVoteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryVoteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryVoteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryVoteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryVotesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryVotesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryVotesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryVotesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryDepositRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryDepositRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryDepositResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryDepositResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryDepositsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryDepositsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryDepositsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryDepositsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryTallyResultRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryTallyResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036cosmos/gov/v1beta1/query.proto\022\022cosmos" +
      ".gov.v1beta1\032*cosmos/base/query/v1beta1/" +
      "pagination.proto\032\024gogoproto/gogo.proto\032\034" +
      "google/api/annotations.proto\032\034cosmos/gov" +
      "/v1beta1/gov.proto\"+\n\024QueryProposalReque" +
      "st\022\023\n\013proposal_id\030\001 \001(\004\"M\n\025QueryProposal" +
      "Response\0224\n\010proposal\030\001 \001(\0132\034.cosmos.gov." +
      "v1beta1.ProposalB\004\310\336\037\000\"\274\001\n\025QueryProposal" +
      "sRequest\022;\n\017proposal_status\030\001 \001(\0162\".cosm" +
      "os.gov.v1beta1.ProposalStatus\022\r\n\005voter\030\002" +
      " \001(\t\022\021\n\tdepositor\030\003 \001(\t\022:\n\npagination\030\004 " +
      "\001(\0132&.cosmos.base.query.v1beta1.PageRequ" +
      "est:\010\350\240\037\000\210\240\037\000\"\214\001\n\026QueryProposalsResponse" +
      "\0225\n\tproposals\030\001 \003(\0132\034.cosmos.gov.v1beta1" +
      ".ProposalB\004\310\336\037\000\022;\n\npagination\030\002 \001(\0132\'.co" +
      "smos.base.query.v1beta1.PageResponse\"@\n\020" +
      "QueryVoteRequest\022\023\n\013proposal_id\030\001 \001(\004\022\r\n" +
      "\005voter\030\002 \001(\t:\010\350\240\037\000\210\240\037\000\"A\n\021QueryVoteRespo" +
      "nse\022,\n\004vote\030\001 \001(\0132\030.cosmos.gov.v1beta1.V" +
      "oteB\004\310\336\037\000\"d\n\021QueryVotesRequest\022\023\n\013propos" +
      "al_id\030\001 \001(\004\022:\n\npagination\030\002 \001(\0132&.cosmos" +
      ".base.query.v1beta1.PageRequest\"\200\001\n\022Quer" +
      "yVotesResponse\022-\n\005votes\030\001 \003(\0132\030.cosmos.g" +
      "ov.v1beta1.VoteB\004\310\336\037\000\022;\n\npagination\030\002 \001(" +
      "\0132\'.cosmos.base.query.v1beta1.PageRespon" +
      "se\")\n\022QueryParamsRequest\022\023\n\013params_type\030" +
      "\001 \001(\t\"\322\001\n\023QueryParamsResponse\022=\n\rvoting_" +
      "params\030\001 \001(\0132 .cosmos.gov.v1beta1.Voting" +
      "ParamsB\004\310\336\037\000\022?\n\016deposit_params\030\002 \001(\0132!.c" +
      "osmos.gov.v1beta1.DepositParamsB\004\310\336\037\000\022;\n" +
      "\014tally_params\030\003 \001(\0132\037.cosmos.gov.v1beta1" +
      ".TallyParamsB\004\310\336\037\000\"G\n\023QueryDepositReques" +
      "t\022\023\n\013proposal_id\030\001 \001(\004\022\021\n\tdepositor\030\002 \001(" +
      "\t:\010\210\240\037\000\350\240\037\000\"J\n\024QueryDepositResponse\0222\n\007d" +
      "eposit\030\001 \001(\0132\033.cosmos.gov.v1beta1.Deposi" +
      "tB\004\310\336\037\000\"g\n\024QueryDepositsRequest\022\023\n\013propo" +
      "sal_id\030\001 \001(\004\022:\n\npagination\030\002 \001(\0132&.cosmo" +
      "s.base.query.v1beta1.PageRequest\"\211\001\n\025Que" +
      "ryDepositsResponse\0223\n\010deposits\030\001 \003(\0132\033.c" +
      "osmos.gov.v1beta1.DepositB\004\310\336\037\000\022;\n\npagin" +
      "ation\030\002 \001(\0132\'.cosmos.base.query.v1beta1." +
      "PageResponse\".\n\027QueryTallyResultRequest\022" +
      "\023\n\013proposal_id\030\001 \001(\004\"P\n\030QueryTallyResult" +
      "Response\0224\n\005tally\030\001 \001(\0132\037.cosmos.gov.v1b" +
      "eta1.TallyResultB\004\310\336\037\0002\324\t\n\005Query\022\224\001\n\010Pro" +
      "posal\022(.cosmos.gov.v1beta1.QueryProposal" +
      "Request\032).cosmos.gov.v1beta1.QueryPropos" +
      "alResponse\"3\202\323\344\223\002-\022+/cosmos/gov/v1beta1/" +
      "proposals/{proposal_id}\022\211\001\n\tProposals\022)." +
      "cosmos.gov.v1beta1.QueryProposalsRequest" +
      "\032*.cosmos.gov.v1beta1.QueryProposalsResp" +
      "onse\"%\202\323\344\223\002\037\022\035/cosmos/gov/v1beta1/propos" +
      "als\022\226\001\n\004Vote\022$.cosmos.gov.v1beta1.QueryV" +
      "oteRequest\032%.cosmos.gov.v1beta1.QueryVot" +
      "eResponse\"A\202\323\344\223\002;\0229/cosmos/gov/v1beta1/p" +
      "roposals/{proposal_id}/votes/{voter}\022\221\001\n" +
      "\005Votes\022%.cosmos.gov.v1beta1.QueryVotesRe" +
      "quest\032&.cosmos.gov.v1beta1.QueryVotesRes" +
      "ponse\"9\202\323\344\223\0023\0221/cosmos/gov/v1beta1/propo" +
      "sals/{proposal_id}/votes\022\213\001\n\006Params\022&.co" +
      "smos.gov.v1beta1.QueryParamsRequest\032\'.co" +
      "smos.gov.v1beta1.QueryParamsResponse\"0\202\323" +
      "\344\223\002*\022(/cosmos/gov/v1beta1/params/{params" +
      "_type}\022\246\001\n\007Deposit\022\'.cosmos.gov.v1beta1." +
      "QueryDepositRequest\032(.cosmos.gov.v1beta1" +
      ".QueryDepositResponse\"H\202\323\344\223\002B\022@/cosmos/g" +
      "ov/v1beta1/proposals/{proposal_id}/depos" +
      "its/{depositor}\022\235\001\n\010Deposits\022(.cosmos.go" +
      "v.v1beta1.QueryDepositsRequest\032).cosmos." +
      "gov.v1beta1.QueryDepositsResponse\"<\202\323\344\223\002" +
      "6\0224/cosmos/gov/v1beta1/proposals/{propos" +
      "al_id}/deposits\022\243\001\n\013TallyResult\022+.cosmos" +
      ".gov.v1beta1.QueryTallyResultRequest\032,.c" +
      "osmos.gov.v1beta1.QueryTallyResultRespon" +
      "se\"9\202\323\344\223\0023\0221/cosmos/gov/v1beta1/proposal" +
      "s/{proposal_id}/tallyB,P\001Z(github.com/co" +
      "smos/cosmos-sdk/x/gov/typesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cosmos.base.query.v1beta1.Pagination.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          cosmos.gov.v1beta1.Gov.getDescriptor(),
        }, assigner);
    internal_static_cosmos_gov_v1beta1_QueryProposalRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_gov_v1beta1_QueryProposalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryProposalRequest_descriptor,
        new java.lang.String[] { "ProposalId", });
    internal_static_cosmos_gov_v1beta1_QueryProposalResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_gov_v1beta1_QueryProposalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryProposalResponse_descriptor,
        new java.lang.String[] { "Proposal", });
    internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_descriptor,
        new java.lang.String[] { "ProposalStatus", "Voter", "Depositor", "Pagination", });
    internal_static_cosmos_gov_v1beta1_QueryProposalsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_gov_v1beta1_QueryProposalsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryProposalsResponse_descriptor,
        new java.lang.String[] { "Proposals", "Pagination", });
    internal_static_cosmos_gov_v1beta1_QueryVoteRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_gov_v1beta1_QueryVoteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryVoteRequest_descriptor,
        new java.lang.String[] { "ProposalId", "Voter", });
    internal_static_cosmos_gov_v1beta1_QueryVoteResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_gov_v1beta1_QueryVoteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryVoteResponse_descriptor,
        new java.lang.String[] { "Vote", });
    internal_static_cosmos_gov_v1beta1_QueryVotesRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_gov_v1beta1_QueryVotesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryVotesRequest_descriptor,
        new java.lang.String[] { "ProposalId", "Pagination", });
    internal_static_cosmos_gov_v1beta1_QueryVotesResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_gov_v1beta1_QueryVotesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryVotesResponse_descriptor,
        new java.lang.String[] { "Votes", "Pagination", });
    internal_static_cosmos_gov_v1beta1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_cosmos_gov_v1beta1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryParamsRequest_descriptor,
        new java.lang.String[] { "ParamsType", });
    internal_static_cosmos_gov_v1beta1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_cosmos_gov_v1beta1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "VotingParams", "DepositParams", "TallyParams", });
    internal_static_cosmos_gov_v1beta1_QueryDepositRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_cosmos_gov_v1beta1_QueryDepositRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryDepositRequest_descriptor,
        new java.lang.String[] { "ProposalId", "Depositor", });
    internal_static_cosmos_gov_v1beta1_QueryDepositResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_cosmos_gov_v1beta1_QueryDepositResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryDepositResponse_descriptor,
        new java.lang.String[] { "Deposit", });
    internal_static_cosmos_gov_v1beta1_QueryDepositsRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_cosmos_gov_v1beta1_QueryDepositsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryDepositsRequest_descriptor,
        new java.lang.String[] { "ProposalId", "Pagination", });
    internal_static_cosmos_gov_v1beta1_QueryDepositsResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_cosmos_gov_v1beta1_QueryDepositsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryDepositsResponse_descriptor,
        new java.lang.String[] { "Deposits", "Pagination", });
    internal_static_cosmos_gov_v1beta1_QueryTallyResultRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_cosmos_gov_v1beta1_QueryTallyResultRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryTallyResultRequest_descriptor,
        new java.lang.String[] { "ProposalId", });
    internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_descriptor,
        new java.lang.String[] { "Tally", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.equal);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    cosmos.base.query.v1beta1.Pagination.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    cosmos.gov.v1beta1.Gov.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
