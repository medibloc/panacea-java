// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/crypto/proof.proto

package tendermint.crypto;

public interface ProofOpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.crypto.ProofOp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string type = 1;</code>
   */
  java.lang.String getType();
  /**
   * <code>string type = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>bytes key = 2;</code>
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>bytes data = 3;</code>
   */
  com.google.protobuf.ByteString getData();
}