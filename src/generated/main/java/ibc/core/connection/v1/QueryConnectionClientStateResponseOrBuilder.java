// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/query.proto

package ibc.core.connection.v1;

public interface QueryConnectionClientStateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.connection.v1.QueryConnectionClientStateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * client state associated with the channel
   * </pre>
   *
   * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
   */
  boolean hasIdentifiedClientState();
  /**
   * <pre>
   * client state associated with the channel
   * </pre>
   *
   * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
   */
  ibc.core.client.v1.IdentifiedClientState getIdentifiedClientState();
  /**
   * <pre>
   * client state associated with the channel
   * </pre>
   *
   * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
   */
  ibc.core.client.v1.IdentifiedClientStateOrBuilder getIdentifiedClientStateOrBuilder();

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