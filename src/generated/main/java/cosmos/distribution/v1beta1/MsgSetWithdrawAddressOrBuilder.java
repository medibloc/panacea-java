// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/tx.proto

package cosmos.distribution.v1beta1;

public interface MsgSetWithdrawAddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.MsgSetWithdrawAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   */
  java.lang.String getDelegatorAddress();
  /**
   * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getDelegatorAddressBytes();

  /**
   * <code>string withdraw_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
   */
  java.lang.String getWithdrawAddress();
  /**
   * <code>string withdraw_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getWithdrawAddressBytes();
}