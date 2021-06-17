// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package ibc.core.channel.v1;

public interface MsgAcknowledgementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.MsgAcknowledgement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasPacket();
  /**
   * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
   */
  ibc.core.channel.v1.Packet getPacket();
  /**
   * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
   */
  ibc.core.channel.v1.PacketOrBuilder getPacketOrBuilder();

  /**
   * <code>bytes acknowledgement = 2;</code>
   */
  com.google.protobuf.ByteString getAcknowledgement();

  /**
   * <code>bytes proof_acked = 3 [(.gogoproto.moretags) = "yaml:&#92;"proof_acked&#92;""];</code>
   */
  com.google.protobuf.ByteString getProofAcked();

  /**
   * <code>.ibc.core.client.v1.Height proof_height = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  boolean hasProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  ibc.core.client.v1.Height getProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder();

  /**
   * <code>string signer = 5;</code>
   */
  java.lang.String getSigner();
  /**
   * <code>string signer = 5;</code>
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}
