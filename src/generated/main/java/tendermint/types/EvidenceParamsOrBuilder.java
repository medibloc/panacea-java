// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/params.proto

package tendermint.types;

public interface EvidenceParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.types.EvidenceParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Max age of evidence, in blocks.
   * The basic formula for calculating this is: MaxAgeDuration / {average block
   * time}.
   * </pre>
   *
   * <code>int64 max_age_num_blocks = 1;</code>
   */
  long getMaxAgeNumBlocks();

  /**
   * <pre>
   * Max age of evidence, in time.
   * It should correspond with an app's "unbonding period" or other similar
   * mechanism for handling [Nothing-At-Stake
   * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age_duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   */
  boolean hasMaxAgeDuration();
  /**
   * <pre>
   * Max age of evidence, in time.
   * It should correspond with an app's "unbonding period" or other similar
   * mechanism for handling [Nothing-At-Stake
   * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age_duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.Duration getMaxAgeDuration();
  /**
   * <pre>
   * Max age of evidence, in time.
   * It should correspond with an app's "unbonding period" or other similar
   * mechanism for handling [Nothing-At-Stake
   * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age_duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxAgeDurationOrBuilder();

  /**
   * <pre>
   * This sets the maximum size of total evidence in bytes that can be committed in a single block.
   * and should fall comfortably under the max block bytes.
   * Default is 1048576 or 1MB
   * </pre>
   *
   * <code>int64 max_bytes = 3;</code>
   */
  long getMaxBytes();
}
