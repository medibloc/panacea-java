// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/tx.proto

package cosmos.staking.v1beta1;

public interface MsgEditValidatorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.MsgEditValidator)
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
   * <code>string validator_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
   */
  java.lang.String getValidatorAddress();
  /**
   * <code>string validator_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getValidatorAddressBytes();

  /**
   * <pre>
   * We pass a reference to the new commission rate and min self delegation as
   * it's not mandatory to update. If not updated, the deserialized rate will be
   * zero with no way to distinguish if an update was intended.
   * REF: #2373
   * </pre>
   *
   * <code>string commission_rate = 3 [(.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"commission_rate&#92;""];</code>
   */
  java.lang.String getCommissionRate();
  /**
   * <pre>
   * We pass a reference to the new commission rate and min self delegation as
   * it's not mandatory to update. If not updated, the deserialized rate will be
   * zero with no way to distinguish if an update was intended.
   * REF: #2373
   * </pre>
   *
   * <code>string commission_rate = 3 [(.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"commission_rate&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getCommissionRateBytes();

  /**
   * <code>string min_self_delegation = 4 [(.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_self_delegation&#92;""];</code>
   */
  java.lang.String getMinSelfDelegation();
  /**
   * <code>string min_self_delegation = 4 [(.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_self_delegation&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getMinSelfDelegationBytes();
}
