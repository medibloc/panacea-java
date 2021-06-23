// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/query.proto

package ibc.core.channel.v1;

public interface QueryPacketCommitmentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.QueryPacketCommitmentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * packet associated with the request fields
   * </pre>
   *
   * <code>bytes commitment = 1;</code>
   */
  com.google.protobuf.ByteString getCommitment();

  /**
   * <pre>
   * merkle proof of existence
   * </pre>
   *
   * <code>bytes proof = 2;</code>
   */
  com.google.protobuf.ByteString getProof();

  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasProofHeight();
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
   */
  ibc.core.client.v1.Height getProofHeight();
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
   */
  ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder();
}