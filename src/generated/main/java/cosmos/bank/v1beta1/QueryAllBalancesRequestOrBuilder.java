// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package cosmos.bank.v1beta1;

public interface QueryAllBalancesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.QueryAllBalancesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * address is the address to query balances for.
   * </pre>
   *
   * <code>string address = 1;</code>
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * address is the address to query balances for.
   * </pre>
   *
   * <code>string address = 1;</code>
   */
  com.google.protobuf.ByteString
      getAddressBytes();

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
