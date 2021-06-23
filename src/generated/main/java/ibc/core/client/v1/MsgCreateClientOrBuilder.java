// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/tx.proto

package ibc.core.client.v1;

public interface MsgCreateClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.client.v1.MsgCreateClient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * light client state
   * </pre>
   *
   * <code>.google.protobuf.Any client_state = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
   */
  boolean hasClientState();
  /**
   * <pre>
   * light client state
   * </pre>
   *
   * <code>.google.protobuf.Any client_state = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
   */
  com.google.protobuf.Any getClientState();
  /**
   * <pre>
   * light client state
   * </pre>
   *
   * <code>.google.protobuf.Any client_state = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
   */
  com.google.protobuf.AnyOrBuilder getClientStateOrBuilder();

  /**
   * <pre>
   * consensus state associated with the client that corresponds to a given
   * height.
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   */
  boolean hasConsensusState();
  /**
   * <pre>
   * consensus state associated with the client that corresponds to a given
   * height.
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   */
  com.google.protobuf.Any getConsensusState();
  /**
   * <pre>
   * consensus state associated with the client that corresponds to a given
   * height.
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   */
  com.google.protobuf.AnyOrBuilder getConsensusStateOrBuilder();

  /**
   * <pre>
   * signer address
   * </pre>
   *
   * <code>string signer = 3;</code>
   */
  java.lang.String getSigner();
  /**
   * <pre>
   * signer address
   * </pre>
   *
   * <code>string signer = 3;</code>
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}