// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/distribution.proto

package cosmos.distribution.v1beta1;

public interface ValidatorAccumulatedCommissionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.ValidatorAccumulatedCommission)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  java.util.List<cosmos.base.v1beta1.DecCoin> 
      getCommissionList();
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  cosmos.base.v1beta1.DecCoin getCommission(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  int getCommissionCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  java.util.List<? extends cosmos.base.v1beta1.DecCoinOrBuilder> 
      getCommissionOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  cosmos.base.v1beta1.DecCoinOrBuilder getCommissionOrBuilder(
      int index);
}
