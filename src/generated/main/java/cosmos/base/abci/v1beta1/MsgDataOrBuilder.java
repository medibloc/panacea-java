// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/abci/v1beta1/abci.proto

package cosmos.base.abci.v1beta1;

public interface MsgDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.abci.v1beta1.MsgData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string msg_type = 1;</code>
   */
  java.lang.String getMsgType();
  /**
   * <code>string msg_type = 1;</code>
   */
  com.google.protobuf.ByteString
      getMsgTypeBytes();

  /**
   * <code>bytes data = 2;</code>
   */
  com.google.protobuf.ByteString getData();
}