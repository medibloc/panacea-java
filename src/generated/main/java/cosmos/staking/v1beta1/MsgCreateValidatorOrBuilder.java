// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/tx.proto

package cosmos.staking.v1beta1;

public interface MsgCreateValidatorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.MsgCreateValidator)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.staking.v1beta1.Description description = 1 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasDescription();
  /**
   * <code>.cosmos.staking.v1beta1.Description description = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.staking.v1beta1.Description getDescription();
  /**
   * <code>.cosmos.staking.v1beta1.Description description = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.staking.v1beta1.DescriptionOrBuilder getDescriptionOrBuilder();

  /**
   * <code>.cosmos.staking.v1beta1.CommissionRates commission = 2 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasCommission();
  /**
   * <code>.cosmos.staking.v1beta1.CommissionRates commission = 2 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.staking.v1beta1.CommissionRates getCommission();
  /**
   * <code>.cosmos.staking.v1beta1.CommissionRates commission = 2 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.staking.v1beta1.CommissionRatesOrBuilder getCommissionOrBuilder();

  /**
   * <code>string min_self_delegation = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_self_delegation&#92;""];</code>
   */
  java.lang.String getMinSelfDelegation();
  /**
   * <code>string min_self_delegation = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_self_delegation&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getMinSelfDelegationBytes();

  /**
   * <code>string delegator_address = 4 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   */
  java.lang.String getDelegatorAddress();
  /**
   * <code>string delegator_address = 4 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getDelegatorAddressBytes();

  /**
   * <code>string validator_address = 5 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
   */
  java.lang.String getValidatorAddress();
  /**
   * <code>string validator_address = 5 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getValidatorAddressBytes();

  /**
   * <code>.google.protobuf.Any pubkey = 6 [(.cosmos_proto.accepts_interface) = "cosmos.crypto.PubKey"];</code>
   */
  boolean hasPubkey();
  /**
   * <code>.google.protobuf.Any pubkey = 6 [(.cosmos_proto.accepts_interface) = "cosmos.crypto.PubKey"];</code>
   */
  com.google.protobuf.Any getPubkey();
  /**
   * <code>.google.protobuf.Any pubkey = 6 [(.cosmos_proto.accepts_interface) = "cosmos.crypto.PubKey"];</code>
   */
  com.google.protobuf.AnyOrBuilder getPubkeyOrBuilder();

  /**
   * <code>.cosmos.base.v1beta1.Coin value = 7 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasValue();
  /**
   * <code>.cosmos.base.v1beta1.Coin value = 7 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.base.v1beta1.Coin getValue();
  /**
   * <code>.cosmos.base.v1beta1.Coin value = 7 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.base.v1beta1.CoinOrBuilder getValueOrBuilder();
}
