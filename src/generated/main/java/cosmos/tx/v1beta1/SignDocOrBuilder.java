// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/tx.proto

package cosmos.tx.v1beta1;

public interface SignDocOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.tx.v1beta1.SignDoc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * body_bytes is protobuf serialization of a TxBody that matches the
   * representation in TxRaw.
   * </pre>
   *
   * <code>bytes body_bytes = 1;</code>
   */
  com.google.protobuf.ByteString getBodyBytes();

  /**
   * <pre>
   * auth_info_bytes is a protobuf serialization of an AuthInfo that matches the
   * representation in TxRaw.
   * </pre>
   *
   * <code>bytes auth_info_bytes = 2;</code>
   */
  com.google.protobuf.ByteString getAuthInfoBytes();

  /**
   * <pre>
   * chain_id is the unique identifier of the chain this transaction targets.
   * It prevents signed transactions from being used on another chain by an
   * attacker
   * </pre>
   *
   * <code>string chain_id = 3;</code>
   */
  java.lang.String getChainId();
  /**
   * <pre>
   * chain_id is the unique identifier of the chain this transaction targets.
   * It prevents signed transactions from being used on another chain by an
   * attacker
   * </pre>
   *
   * <code>string chain_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <pre>
   * account_number is the account number of the account in state
   * </pre>
   *
   * <code>uint64 account_number = 4;</code>
   */
  long getAccountNumber();
}