// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/tendermint/v1/tendermint.proto

package ibc.lightclients.tendermint.v1;

public interface ConsensusStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.lightclients.tendermint.v1.ConsensusState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * timestamp that corresponds to the block height in which the ConsensusState
   * was stored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * timestamp that corresponds to the block height in which the ConsensusState
   * was stored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * timestamp that corresponds to the block height in which the ConsensusState
   * was stored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * commitment root (i.e app hash)
   * </pre>
   *
   * <code>.ibc.core.commitment.v1.MerkleRoot root = 2 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasRoot();
  /**
   * <pre>
   * commitment root (i.e app hash)
   * </pre>
   *
   * <code>.ibc.core.commitment.v1.MerkleRoot root = 2 [(.gogoproto.nullable) = false];</code>
   */
  ibc.core.commitment.v1.MerkleRoot getRoot();
  /**
   * <pre>
   * commitment root (i.e app hash)
   * </pre>
   *
   * <code>.ibc.core.commitment.v1.MerkleRoot root = 2 [(.gogoproto.nullable) = false];</code>
   */
  ibc.core.commitment.v1.MerkleRootOrBuilder getRootOrBuilder();

  /**
   * <code>bytes next_validators_hash = 3 [(.gogoproto.moretags) = "yaml:&#92;"next_validators_hash&#92;"", (.gogoproto.casttype) = "github.com/tendermint/tendermint/libs/bytes.HexBytes"];</code>
   */
  com.google.protobuf.ByteString getNextValidatorsHash();
}
