// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

public interface QueryDelegatorValidatorsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest)
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
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
   */
  cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
   */
  cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
