// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

public interface QueryDelegatorUnbondingDelegationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [(.gogoproto.nullable) = false];</code>
   */
  java.util.List<cosmos.staking.v1beta1.UnbondingDelegation> 
      getUnbondingResponsesList();
  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.staking.v1beta1.UnbondingDelegation getUnbondingResponses(int index);
  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [(.gogoproto.nullable) = false];</code>
   */
  int getUnbondingResponsesCount();
  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [(.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends cosmos.staking.v1beta1.UnbondingDelegationOrBuilder> 
      getUnbondingResponsesOrBuilderList();
  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.staking.v1beta1.UnbondingDelegationOrBuilder getUnbondingResponsesOrBuilder(
      int index);

  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
