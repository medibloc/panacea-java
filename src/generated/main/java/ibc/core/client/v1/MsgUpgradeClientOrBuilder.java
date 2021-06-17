// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/tx.proto

package ibc.core.client.v1;

public interface MsgUpgradeClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.client.v1.MsgUpgradeClient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * client unique identifier
   * </pre>
   *
   * <code>string client_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * client unique identifier
   * </pre>
   *
   * <code>string client_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * upgraded client state
   * </pre>
   *
   * <code>.google.protobuf.Any client_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
   */
  boolean hasClientState();
  /**
   * <pre>
   * upgraded client state
   * </pre>
   *
   * <code>.google.protobuf.Any client_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
   */
  com.google.protobuf.Any getClientState();
  /**
   * <pre>
   * upgraded client state
   * </pre>
   *
   * <code>.google.protobuf.Any client_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
   */
  com.google.protobuf.AnyOrBuilder getClientStateOrBuilder();

  /**
   * <pre>
   * upgraded consensus state, only contains enough information to serve as a basis of trust in update logic
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   */
  boolean hasConsensusState();
  /**
   * <pre>
   * upgraded consensus state, only contains enough information to serve as a basis of trust in update logic
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   */
  com.google.protobuf.Any getConsensusState();
  /**
   * <pre>
   * upgraded consensus state, only contains enough information to serve as a basis of trust in update logic
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   */
  com.google.protobuf.AnyOrBuilder getConsensusStateOrBuilder();

  /**
   * <pre>
   * proof that old chain committed to new client
   * </pre>
   *
   * <code>bytes proof_upgrade_client = 4 [(.gogoproto.moretags) = "yaml:&#92;"proof_upgrade_client&#92;""];</code>
   */
  com.google.protobuf.ByteString getProofUpgradeClient();

  /**
   * <pre>
   * proof that old chain committed to new consensus state
   * </pre>
   *
   * <code>bytes proof_upgrade_consensus_state = 5 [(.gogoproto.moretags) = "yaml:&#92;"proof_upgrade_consensus_state&#92;""];</code>
   */
  com.google.protobuf.ByteString getProofUpgradeConsensusState();

  /**
   * <pre>
   * signer address
   * </pre>
   *
   * <code>string signer = 6;</code>
   */
  java.lang.String getSigner();
  /**
   * <pre>
   * signer address
   * </pre>
   *
   * <code>string signer = 6;</code>
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}
