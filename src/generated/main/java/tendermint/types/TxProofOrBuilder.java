// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/types.proto

package tendermint.types;

public interface TxProofOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.types.TxProof)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes root_hash = 1;</code>
   */
  com.google.protobuf.ByteString getRootHash();

  /**
   * <code>bytes data = 2;</code>
   */
  com.google.protobuf.ByteString getData();

  /**
   * <code>.tendermint.crypto.Proof proof = 3;</code>
   */
  boolean hasProof();
  /**
   * <code>.tendermint.crypto.Proof proof = 3;</code>
   */
  tendermint.crypto.Proof getProof();
  /**
   * <code>.tendermint.crypto.Proof proof = 3;</code>
   */
  tendermint.crypto.ProofOrBuilder getProofOrBuilder();
}
