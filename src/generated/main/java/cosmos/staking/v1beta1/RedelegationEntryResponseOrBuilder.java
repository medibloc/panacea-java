// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package cosmos.staking.v1beta1;

public interface RedelegationEntryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.RedelegationEntryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.staking.v1beta1.RedelegationEntry redelegation_entry = 1 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasRedelegationEntry();
  /**
   * <code>.cosmos.staking.v1beta1.RedelegationEntry redelegation_entry = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.staking.v1beta1.RedelegationEntry getRedelegationEntry();
  /**
   * <code>.cosmos.staking.v1beta1.RedelegationEntry redelegation_entry = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.staking.v1beta1.RedelegationEntryOrBuilder getRedelegationEntryOrBuilder();

  /**
   * <code>string balance = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   */
  java.lang.String getBalance();
  /**
   * <code>string balance = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   */
  com.google.protobuf.ByteString
      getBalanceBytes();
}