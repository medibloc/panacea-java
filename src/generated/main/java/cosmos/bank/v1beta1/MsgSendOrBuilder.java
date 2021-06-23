// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/tx.proto

package cosmos.bank.v1beta1;

public interface MsgSendOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.MsgSend)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string from_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"from_address&#92;""];</code>
   */
  java.lang.String getFromAddress();
  /**
   * <code>string from_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"from_address&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getFromAddressBytes();

  /**
   * <code>string to_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"to_address&#92;""];</code>
   */
  java.lang.String getToAddress();
  /**
   * <code>string to_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"to_address&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getToAddressBytes();

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<cosmos.base.v1beta1.Coin> 
      getAmountList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  cosmos.base.v1beta1.Coin getAmount(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getAmountCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends cosmos.base.v1beta1.CoinOrBuilder> 
      getAmountOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder(
      int index);
}
