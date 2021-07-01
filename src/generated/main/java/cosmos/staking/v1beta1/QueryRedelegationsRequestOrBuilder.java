// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

public interface QueryRedelegationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.QueryRedelegationsRequest)
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
   * src_validator_addr defines the validator address to redelegate from.
   * </pre>
   *
   * <code>string src_validator_addr = 2;</code>
   */
  java.lang.String getSrcValidatorAddr();
  /**
   * <pre>
   * src_validator_addr defines the validator address to redelegate from.
   * </pre>
   *
   * <code>string src_validator_addr = 2;</code>
   */
  com.google.protobuf.ByteString
      getSrcValidatorAddrBytes();

  /**
   * <pre>
   * dst_validator_addr defines the validator address to redelegate to.
   * </pre>
   *
   * <code>string dst_validator_addr = 3;</code>
   */
  java.lang.String getDstValidatorAddr();
  /**
   * <pre>
   * dst_validator_addr defines the validator address to redelegate to.
   * </pre>
   *
   * <code>string dst_validator_addr = 3;</code>
   */
  com.google.protobuf.ByteString
      getDstValidatorAddrBytes();

  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4;</code>
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4;</code>
   */
  cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4;</code>
   */
  cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
