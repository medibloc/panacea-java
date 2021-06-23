// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/types.proto

package tendermint.types;

public interface VoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.types.Vote)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tendermint.types.SignedMsgType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>.tendermint.types.SignedMsgType type = 1;</code>
   */
  tendermint.types.SignedMsgType getType();

  /**
   * <code>int64 height = 2;</code>
   */
  long getHeight();

  /**
   * <code>int32 round = 3;</code>
   */
  int getRound();

  /**
   * <pre>
   * zero if vote is nil.
   * </pre>
   *
   * <code>.tendermint.types.BlockID block_id = 4 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
   */
  boolean hasBlockId();
  /**
   * <pre>
   * zero if vote is nil.
   * </pre>
   *
   * <code>.tendermint.types.BlockID block_id = 4 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
   */
  tendermint.types.BlockID getBlockId();
  /**
   * <pre>
   * zero if vote is nil.
   * </pre>
   *
   * <code>.tendermint.types.BlockID block_id = 4 [(.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
   */
  tendermint.types.BlockIDOrBuilder getBlockIdOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp timestamp = 5 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  boolean hasTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 5 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 5 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <code>bytes validator_address = 6;</code>
   */
  com.google.protobuf.ByteString getValidatorAddress();

  /**
   * <code>int32 validator_index = 7;</code>
   */
  int getValidatorIndex();

  /**
   * <code>bytes signature = 8;</code>
   */
  com.google.protobuf.ByteString getSignature();
}
