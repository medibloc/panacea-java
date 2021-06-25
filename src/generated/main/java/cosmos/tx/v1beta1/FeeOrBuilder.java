// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/tx.proto

package cosmos.tx.v1beta1;

public interface FeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.tx.v1beta1.Fee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * amount is the amount of coins to be paid as a fee
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<cosmos.base.v1beta1.Coin> 
      getAmountList();
  /**
   * <pre>
   * amount is the amount of coins to be paid as a fee
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  cosmos.base.v1beta1.Coin getAmount(int index);
  /**
   * <pre>
   * amount is the amount of coins to be paid as a fee
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getAmountCount();
  /**
   * <pre>
   * amount is the amount of coins to be paid as a fee
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends cosmos.base.v1beta1.CoinOrBuilder> 
      getAmountOrBuilderList();
  /**
   * <pre>
   * amount is the amount of coins to be paid as a fee
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder(
      int index);

  /**
   * <pre>
   * gas_limit is the maximum gas that can be used in transaction processing
   * before an out of gas error occurs
   * </pre>
   *
   * <code>uint64 gas_limit = 2;</code>
   */
  long getGasLimit();

  /**
   * <pre>
   * if unset, the first signer is responsible for paying the fees. If set, the specified account must pay the fees.
   * the payer must be a tx signer (and thus have signed this field in AuthInfo).
   * setting this field does *not* change the ordering of required signers for the transaction.
   * </pre>
   *
   * <code>string payer = 3;</code>
   */
  java.lang.String getPayer();
  /**
   * <pre>
   * if unset, the first signer is responsible for paying the fees. If set, the specified account must pay the fees.
   * the payer must be a tx signer (and thus have signed this field in AuthInfo).
   * setting this field does *not* change the ordering of required signers for the transaction.
   * </pre>
   *
   * <code>string payer = 3;</code>
   */
  com.google.protobuf.ByteString
      getPayerBytes();

  /**
   * <pre>
   * if set, the fee payer (either the first signer or the value of the payer field) requests that a fee grant be used
   * to pay fees instead of the fee payer's own balance. If an appropriate fee grant does not exist or the chain does
   * not support fee grants, this will fail
   * </pre>
   *
   * <code>string granter = 4;</code>
   */
  java.lang.String getGranter();
  /**
   * <pre>
   * if set, the fee payer (either the first signer or the value of the payer field) requests that a fee grant be used
   * to pay fees instead of the fee payer's own balance. If an appropriate fee grant does not exist or the chain does
   * not support fee grants, this will fail
   * </pre>
   *
   * <code>string granter = 4;</code>
   */
  com.google.protobuf.ByteString
      getGranterBytes();
}
