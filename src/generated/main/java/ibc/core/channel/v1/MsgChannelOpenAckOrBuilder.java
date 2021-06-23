// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package ibc.core.channel.v1;

public interface MsgChannelOpenAckOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.MsgChannelOpenAck)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string port_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
   */
  java.lang.String getPortId();
  /**
   * <code>string port_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getPortIdBytes();

  /**
   * <code>string channel_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
   */
  java.lang.String getChannelId();
  /**
   * <code>string channel_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();

  /**
   * <code>string counterparty_channel_id = 3 [(.gogoproto.moretags) = "yaml:&#92;"counterparty_channel_id&#92;""];</code>
   */
  java.lang.String getCounterpartyChannelId();
  /**
   * <code>string counterparty_channel_id = 3 [(.gogoproto.moretags) = "yaml:&#92;"counterparty_channel_id&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getCounterpartyChannelIdBytes();

  /**
   * <code>string counterparty_version = 4 [(.gogoproto.moretags) = "yaml:&#92;"counterparty_version&#92;""];</code>
   */
  java.lang.String getCounterpartyVersion();
  /**
   * <code>string counterparty_version = 4 [(.gogoproto.moretags) = "yaml:&#92;"counterparty_version&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getCounterpartyVersionBytes();

  /**
   * <code>bytes proof_try = 5 [(.gogoproto.moretags) = "yaml:&#92;"proof_try&#92;""];</code>
   */
  com.google.protobuf.ByteString getProofTry();

  /**
   * <code>.ibc.core.client.v1.Height proof_height = 6 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  boolean hasProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 6 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  ibc.core.client.v1.Height getProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 6 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder();

  /**
   * <code>string signer = 7;</code>
   */
  java.lang.String getSigner();
  /**
   * <code>string signer = 7;</code>
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}