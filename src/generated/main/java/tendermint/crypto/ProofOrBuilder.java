// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/crypto/proof.proto

package tendermint.crypto;

public interface ProofOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.crypto.Proof)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 total = 1;</code>
   */
  long getTotal();

  /**
   * <code>int64 index = 2;</code>
   */
  long getIndex();

  /**
   * <code>bytes leaf_hash = 3;</code>
   */
  com.google.protobuf.ByteString getLeafHash();

  /**
   * <code>repeated bytes aunts = 4;</code>
   */
  java.util.List<com.google.protobuf.ByteString> getAuntsList();
  /**
   * <code>repeated bytes aunts = 4;</code>
   */
  int getAuntsCount();
  /**
   * <code>repeated bytes aunts = 4;</code>
   */
  com.google.protobuf.ByteString getAunts(int index);
}
