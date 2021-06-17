// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/query.proto

package ibc.core.client.v1;

public interface QueryConsensusStateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.client.v1.QueryConsensusStateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * consensus state associated with the client identifier at the given height
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 1;</code>
   */
  boolean hasConsensusState();
  /**
   * <pre>
   * consensus state associated with the client identifier at the given height
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 1;</code>
   */
  com.google.protobuf.Any getConsensusState();
  /**
   * <pre>
   * consensus state associated with the client identifier at the given height
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 1;</code>
   */
  com.google.protobuf.AnyOrBuilder getConsensusStateOrBuilder();

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
