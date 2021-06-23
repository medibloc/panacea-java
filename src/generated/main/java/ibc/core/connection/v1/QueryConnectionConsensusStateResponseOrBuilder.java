// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/query.proto

package ibc.core.connection.v1;

public interface QueryConnectionConsensusStateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.connection.v1.QueryConnectionConsensusStateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * consensus state associated with the channel
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 1;</code>
   */
  boolean hasConsensusState();
  /**
   * <pre>
   * consensus state associated with the channel
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 1;</code>
   */
  com.google.protobuf.Any getConsensusState();
  /**
   * <pre>
   * consensus state associated with the channel
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 1;</code>
   */
  com.google.protobuf.AnyOrBuilder getConsensusStateOrBuilder();

  /**
   * <pre>
   * client ID associated with the consensus state
   * </pre>
   *
   * <code>string client_id = 2;</code>
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * client ID associated with the consensus state
   * </pre>
   *
   * <code>string client_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * merkle proof of existence
   * </pre>
   *
   * <code>bytes proof = 3;</code>
   */
  com.google.protobuf.ByteString getProof();

  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 4 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasProofHeight();
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 4 [(.gogoproto.nullable) = false];</code>
   */
  ibc.core.client.v1.Height getProofHeight();
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 4 [(.gogoproto.nullable) = false];</code>
   */
  ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder();
}