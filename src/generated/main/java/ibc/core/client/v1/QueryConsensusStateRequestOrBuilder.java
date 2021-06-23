// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/query.proto

package ibc.core.client.v1;

public interface QueryConsensusStateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.client.v1.QueryConsensusStateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * client identifier
   * </pre>
   *
   * <code>string client_id = 1;</code>
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * client identifier
   * </pre>
   *
   * <code>string client_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * consensus state revision number
   * </pre>
   *
   * <code>uint64 revision_number = 2;</code>
   */
  long getRevisionNumber();

  /**
   * <pre>
   * consensus state revision height
   * </pre>
   *
   * <code>uint64 revision_height = 3;</code>
   */
  long getRevisionHeight();

  /**
   * <pre>
   * latest_height overrrides the height field and queries the latest stored
   * ConsensusState
   * </pre>
   *
   * <code>bool latest_height = 4;</code>
   */
  boolean getLatestHeight();
}