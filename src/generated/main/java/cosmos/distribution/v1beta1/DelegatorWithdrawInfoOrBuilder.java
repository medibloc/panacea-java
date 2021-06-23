// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/genesis.proto

package cosmos.distribution.v1beta1;

public interface DelegatorWithdrawInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.DelegatorWithdrawInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * delegator_address is the address of the delegator.
   * </pre>
   *
   * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   */
  java.lang.String getDelegatorAddress();
  /**
   * <pre>
   * delegator_address is the address of the delegator.
   * </pre>
   *
   * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getDelegatorAddressBytes();

  /**
   * <pre>
   * withdraw_address is the address to withdraw the delegation rewards to.
   * </pre>
   *
   * <code>string withdraw_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
   */
  java.lang.String getWithdrawAddress();
  /**
   * <pre>
   * withdraw_address is the address to withdraw the delegation rewards to.
   * </pre>
   *
   * <code>string withdraw_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getWithdrawAddressBytes();
}