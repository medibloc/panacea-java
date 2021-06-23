// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/token/v2/tx.proto

package panacea.token.v2;

public interface MsgIssueTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.token.v2.MsgIssueToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string shortSymbol = 2;</code>
   */
  java.lang.String getShortSymbol();
  /**
   * <code>string shortSymbol = 2;</code>
   */
  com.google.protobuf.ByteString
      getShortSymbolBytes();

  /**
   * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasTotalSupplyMicro();
  /**
   * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.base.v1beta1.IntProto getTotalSupplyMicro();
  /**
   * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.base.v1beta1.IntProtoOrBuilder getTotalSupplyMicroOrBuilder();

  /**
   * <code>bool mintable = 4;</code>
   */
  boolean getMintable();

  /**
   * <code>string ownerAddress = 5;</code>
   */
  java.lang.String getOwnerAddress();
  /**
   * <code>string ownerAddress = 5;</code>
   */
  com.google.protobuf.ByteString
      getOwnerAddressBytes();
}