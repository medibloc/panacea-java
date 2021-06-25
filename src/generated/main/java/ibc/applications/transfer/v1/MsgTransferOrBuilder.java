// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/transfer/v1/tx.proto

package ibc.applications.transfer.v1;

public interface MsgTransferOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.applications.transfer.v1.MsgTransfer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the port on which the packet will be sent
   * </pre>
   *
   * <code>string source_port = 1 [(.gogoproto.moretags) = "yaml:&#92;"source_port&#92;""];</code>
   */
  java.lang.String getSourcePort();
  /**
   * <pre>
   * the port on which the packet will be sent
   * </pre>
   *
   * <code>string source_port = 1 [(.gogoproto.moretags) = "yaml:&#92;"source_port&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getSourcePortBytes();

  /**
   * <pre>
   * the channel by which the packet will be sent
   * </pre>
   *
   * <code>string source_channel = 2 [(.gogoproto.moretags) = "yaml:&#92;"source_channel&#92;""];</code>
   */
  java.lang.String getSourceChannel();
  /**
   * <pre>
   * the channel by which the packet will be sent
   * </pre>
   *
   * <code>string source_channel = 2 [(.gogoproto.moretags) = "yaml:&#92;"source_channel&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getSourceChannelBytes();

  /**
   * <pre>
   * the tokens to be transferred
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token = 3 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasToken();
  /**
   * <pre>
   * the tokens to be transferred
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token = 3 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.base.v1beta1.Coin getToken();
  /**
   * <pre>
   * the tokens to be transferred
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token = 3 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.base.v1beta1.CoinOrBuilder getTokenOrBuilder();

  /**
   * <pre>
   * the sender address
   * </pre>
   *
   * <code>string sender = 4;</code>
   */
  java.lang.String getSender();
  /**
   * <pre>
   * the sender address
   * </pre>
   *
   * <code>string sender = 4;</code>
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <pre>
   * the recipient address on the destination chain
   * </pre>
   *
   * <code>string receiver = 5;</code>
   */
  java.lang.String getReceiver();
  /**
   * <pre>
   * the recipient address on the destination chain
   * </pre>
   *
   * <code>string receiver = 5;</code>
   */
  com.google.protobuf.ByteString
      getReceiverBytes();

  /**
   * <pre>
   * Timeout height relative to the current block height.
   * The timeout is disabled when set to 0.
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height timeout_height = 6 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"timeout_height&#92;""];</code>
   */
  boolean hasTimeoutHeight();
  /**
   * <pre>
   * Timeout height relative to the current block height.
   * The timeout is disabled when set to 0.
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height timeout_height = 6 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"timeout_height&#92;""];</code>
   */
  ibc.core.client.v1.Height getTimeoutHeight();
  /**
   * <pre>
   * Timeout height relative to the current block height.
   * The timeout is disabled when set to 0.
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height timeout_height = 6 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"timeout_height&#92;""];</code>
   */
  ibc.core.client.v1.HeightOrBuilder getTimeoutHeightOrBuilder();

  /**
   * <pre>
   * Timeout timestamp (in nanoseconds) relative to the current block timestamp.
   * The timeout is disabled when set to 0.
   * </pre>
   *
   * <code>uint64 timeout_timestamp = 7 [(.gogoproto.moretags) = "yaml:&#92;"timeout_timestamp&#92;""];</code>
   */
  long getTimeoutTimestamp();
}
