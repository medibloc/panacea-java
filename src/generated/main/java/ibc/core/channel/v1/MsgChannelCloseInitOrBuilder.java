// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package ibc.core.channel.v1;

public interface MsgChannelCloseInitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.MsgChannelCloseInit)
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
   * <code>string signer = 3;</code>
   */
  java.lang.String getSigner();
  /**
   * <code>string signer = 3;</code>
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}
