// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

public interface QueryDelegationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.QueryDelegationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * delegator_addr defines the delegator address to query for.
   * </pre>
   *
   * <code>string delegator_addr = 1;</code>
   */
  java.lang.String getDelegatorAddr();
  /**
   * <pre>
   * delegator_addr defines the delegator address to query for.
   * </pre>
   *
   * <code>string delegator_addr = 1;</code>
   */
  com.google.protobuf.ByteString
      getDelegatorAddrBytes();

  /**
   * <pre>
   * validator_addr defines the validator address to query for.
   * </pre>
   *
   * <code>string validator_addr = 2;</code>
   */
  java.lang.String getValidatorAddr();
  /**
   * <pre>
   * validator_addr defines the validator address to query for.
   * </pre>
   *
   * <code>string validator_addr = 2;</code>
   */
  com.google.protobuf.ByteString
      getValidatorAddrBytes();
}
