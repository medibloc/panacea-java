// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/did.proto

package panacea.did.v2;

public interface VerificationMethodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.did.v2.VerificationMethod)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ID = 1[json_name = "id", (.gogoproto.jsontag) = "id"];</code>
   */
  java.lang.String getID();
  /**
   * <code>string ID = 1[json_name = "id", (.gogoproto.jsontag) = "id"];</code>
   */
  com.google.protobuf.ByteString
      getIDBytes();

  /**
   * <code>string type = 2;</code>
   */
  java.lang.String getType();
  /**
   * <code>string type = 2;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string controller = 3;</code>
   */
  java.lang.String getController();
  /**
   * <code>string controller = 3;</code>
   */
  com.google.protobuf.ByteString
      getControllerBytes();

  /**
   * <code>string pubKeyBase58 = 4[json_name = "publicKeyBase58", (.gogoproto.jsontag) = "publicKeyBase58"];</code>
   */
  java.lang.String getPubKeyBase58();
  /**
   * <code>string pubKeyBase58 = 4[json_name = "publicKeyBase58", (.gogoproto.jsontag) = "publicKeyBase58"];</code>
   */
  com.google.protobuf.ByteString
      getPubKeyBase58Bytes();
}
