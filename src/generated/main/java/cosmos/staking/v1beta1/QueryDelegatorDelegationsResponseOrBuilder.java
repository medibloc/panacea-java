// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

public interface QueryDelegatorDelegationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * delegation_responses defines all the delegations' info of a delegator.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [(.gogoproto.nullable) = false];</code>
   */
  java.util.List<cosmos.staking.v1beta1.DelegationResponse> 
      getDelegationResponsesList();
  /**
   * <pre>
   * delegation_responses defines all the delegations' info of a delegator.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.staking.v1beta1.DelegationResponse getDelegationResponses(int index);
  /**
   * <pre>
   * delegation_responses defines all the delegations' info of a delegator.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [(.gogoproto.nullable) = false];</code>
   */
  int getDelegationResponsesCount();
  /**
   * <pre>
   * delegation_responses defines all the delegations' info of a delegator.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [(.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends cosmos.staking.v1beta1.DelegationResponseOrBuilder> 
      getDelegationResponsesOrBuilderList();
  /**
   * <pre>
   * delegation_responses defines all the delegations' info of a delegator.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.staking.v1beta1.DelegationResponseOrBuilder getDelegationResponsesOrBuilder(
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
