// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/bank.proto

package cosmos.bank.v1beta1;

public interface SupplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.Supply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<cosmos.base.v1beta1.Coin> 
      getTotalList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  cosmos.base.v1beta1.Coin getTotal(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getTotalCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends cosmos.base.v1beta1.CoinOrBuilder> 
      getTotalOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  cosmos.base.v1beta1.CoinOrBuilder getTotalOrBuilder(
      int index);
}
