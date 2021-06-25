// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/gov.proto

package cosmos.gov.v1beta1;

public interface ProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.gov.v1beta1.Proposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 proposal_id = 1 [(.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   */
  long getProposalId();

  /**
   * <code>.google.protobuf.Any content = 2 [(.cosmos_proto.accepts_interface) = "Content"];</code>
   */
  boolean hasContent();
  /**
   * <code>.google.protobuf.Any content = 2 [(.cosmos_proto.accepts_interface) = "Content"];</code>
   */
  com.google.protobuf.Any getContent();
  /**
   * <code>.google.protobuf.Any content = 2 [(.cosmos_proto.accepts_interface) = "Content"];</code>
   */
  com.google.protobuf.AnyOrBuilder getContentOrBuilder();

  /**
   * <code>.cosmos.gov.v1beta1.ProposalStatus status = 3 [(.gogoproto.moretags) = "yaml:&#92;"proposal_status&#92;""];</code>
   */
  int getStatusValue();
  /**
   * <code>.cosmos.gov.v1beta1.ProposalStatus status = 3 [(.gogoproto.moretags) = "yaml:&#92;"proposal_status&#92;""];</code>
   */
  cosmos.gov.v1beta1.ProposalStatus getStatus();

  /**
   * <code>.cosmos.gov.v1beta1.TallyResult final_tally_result = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"final_tally_result&#92;""];</code>
   */
  boolean hasFinalTallyResult();
  /**
   * <code>.cosmos.gov.v1beta1.TallyResult final_tally_result = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"final_tally_result&#92;""];</code>
   */
  cosmos.gov.v1beta1.TallyResult getFinalTallyResult();
  /**
   * <code>.cosmos.gov.v1beta1.TallyResult final_tally_result = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"final_tally_result&#92;""];</code>
   */
  cosmos.gov.v1beta1.TallyResultOrBuilder getFinalTallyResultOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp submit_time = 5 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"submit_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  boolean hasSubmitTime();
  /**
   * <code>.google.protobuf.Timestamp submit_time = 5 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"submit_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.Timestamp getSubmitTime();
  /**
   * <code>.google.protobuf.Timestamp submit_time = 5 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"submit_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp deposit_end_time = 6 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  boolean hasDepositEndTime();
  /**
   * <code>.google.protobuf.Timestamp deposit_end_time = 6 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.Timestamp getDepositEndTime();
  /**
   * <code>.google.protobuf.Timestamp deposit_end_time = 6 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDepositEndTimeOrBuilder();

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total_deposit = 7 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"total_deposit&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<cosmos.base.v1beta1.Coin> 
      getTotalDepositList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total_deposit = 7 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"total_deposit&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  cosmos.base.v1beta1.Coin getTotalDeposit(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total_deposit = 7 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"total_deposit&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getTotalDepositCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total_deposit = 7 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"total_deposit&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends cosmos.base.v1beta1.CoinOrBuilder> 
      getTotalDepositOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total_deposit = 7 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"total_deposit&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  cosmos.base.v1beta1.CoinOrBuilder getTotalDepositOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Timestamp voting_start_time = 8 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"voting_start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  boolean hasVotingStartTime();
  /**
   * <code>.google.protobuf.Timestamp voting_start_time = 8 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"voting_start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.Timestamp getVotingStartTime();
  /**
   * <code>.google.protobuf.Timestamp voting_start_time = 8 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"voting_start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getVotingStartTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp voting_end_time = 9 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"voting_end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  boolean hasVotingEndTime();
  /**
   * <code>.google.protobuf.Timestamp voting_end_time = 9 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"voting_end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.Timestamp getVotingEndTime();
  /**
   * <code>.google.protobuf.Timestamp voting_end_time = 9 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"voting_end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getVotingEndTimeOrBuilder();
}
