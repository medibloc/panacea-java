// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/tx.proto

package ibc.core.connection.v1;

public interface MsgConnectionOpenTryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.connection.v1.MsgConnectionOpenTry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string client_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * in the case of crossing hello's, when both chains call OpenInit, we need the connection identifier
   * of the previous connection in state INIT
   * </pre>
   *
   * <code>string previous_connection_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"previous_connection_id&#92;""];</code>
   */
  java.lang.String getPreviousConnectionId();
  /**
   * <pre>
   * in the case of crossing hello's, when both chains call OpenInit, we need the connection identifier
   * of the previous connection in state INIT
   * </pre>
   *
   * <code>string previous_connection_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"previous_connection_id&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getPreviousConnectionIdBytes();

  /**
   * <code>.google.protobuf.Any client_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
   */
  boolean hasClientState();
  /**
   * <code>.google.protobuf.Any client_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
   */
  com.google.protobuf.Any getClientState();
  /**
   * <code>.google.protobuf.Any client_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
   */
  com.google.protobuf.AnyOrBuilder getClientStateOrBuilder();

  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 4 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasCounterparty();
  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 4 [(.gogoproto.nullable) = false];</code>
   */
  ibc.core.connection.v1.Counterparty getCounterparty();
  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 4 [(.gogoproto.nullable) = false];</code>
   */
  ibc.core.connection.v1.CounterpartyOrBuilder getCounterpartyOrBuilder();

  /**
   * <code>uint64 delay_period = 5 [(.gogoproto.moretags) = "yaml:&#92;"delay_period&#92;""];</code>
   */
  long getDelayPeriod();

  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [(.gogoproto.moretags) = "yaml:&#92;"counterparty_versions&#92;""];</code>
   */
  java.util.List<ibc.core.connection.v1.Version> 
      getCounterpartyVersionsList();
  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [(.gogoproto.moretags) = "yaml:&#92;"counterparty_versions&#92;""];</code>
   */
  ibc.core.connection.v1.Version getCounterpartyVersions(int index);
  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [(.gogoproto.moretags) = "yaml:&#92;"counterparty_versions&#92;""];</code>
   */
  int getCounterpartyVersionsCount();
  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [(.gogoproto.moretags) = "yaml:&#92;"counterparty_versions&#92;""];</code>
   */
  java.util.List<? extends ibc.core.connection.v1.VersionOrBuilder> 
      getCounterpartyVersionsOrBuilderList();
  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [(.gogoproto.moretags) = "yaml:&#92;"counterparty_versions&#92;""];</code>
   */
  ibc.core.connection.v1.VersionOrBuilder getCounterpartyVersionsOrBuilder(
      int index);

  /**
   * <code>.ibc.core.client.v1.Height proof_height = 7 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  boolean hasProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 7 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  ibc.core.client.v1.Height getProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 7 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder();

  /**
   * <pre>
   * proof of the initialization the connection on Chain A: `UNITIALIZED -&gt;
   * INIT`
   * </pre>
   *
   * <code>bytes proof_init = 8 [(.gogoproto.moretags) = "yaml:&#92;"proof_init&#92;""];</code>
   */
  com.google.protobuf.ByteString getProofInit();

  /**
   * <pre>
   * proof of client state included in message
   * </pre>
   *
   * <code>bytes proof_client = 9 [(.gogoproto.moretags) = "yaml:&#92;"proof_client&#92;""];</code>
   */
  com.google.protobuf.ByteString getProofClient();

  /**
   * <pre>
   * proof of client consensus state
   * </pre>
   *
   * <code>bytes proof_consensus = 10 [(.gogoproto.moretags) = "yaml:&#92;"proof_consensus&#92;""];</code>
   */
  com.google.protobuf.ByteString getProofConsensus();

  /**
   * <code>.ibc.core.client.v1.Height consensus_height = 11 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"consensus_height&#92;""];</code>
   */
  boolean hasConsensusHeight();
  /**
   * <code>.ibc.core.client.v1.Height consensus_height = 11 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"consensus_height&#92;""];</code>
   */
  ibc.core.client.v1.Height getConsensusHeight();
  /**
   * <code>.ibc.core.client.v1.Height consensus_height = 11 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"consensus_height&#92;""];</code>
   */
  ibc.core.client.v1.HeightOrBuilder getConsensusHeightOrBuilder();

  /**
   * <code>string signer = 12;</code>
   */
  java.lang.String getSigner();
  /**
   * <code>string signer = 12;</code>
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}