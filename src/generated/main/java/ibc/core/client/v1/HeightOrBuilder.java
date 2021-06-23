// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/client.proto

package ibc.core.client.v1;

public interface HeightOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.client.v1.Height)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the revision that the client is currently on
   * </pre>
   *
   * <code>uint64 revision_number = 1 [(.gogoproto.moretags) = "yaml:&#92;"revision_number&#92;""];</code>
   */
  long getRevisionNumber();

  /**
   * <pre>
   * the height within the given revision
   * </pre>
   *
   * <code>uint64 revision_height = 2 [(.gogoproto.moretags) = "yaml:&#92;"revision_height&#92;""];</code>
   */
  long getRevisionHeight();
}