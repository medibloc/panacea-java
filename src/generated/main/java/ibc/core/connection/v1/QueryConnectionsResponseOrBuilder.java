// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/query.proto

package ibc.core.connection.v1;

public interface QueryConnectionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.connection.v1.QueryConnectionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of stored connections of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.IdentifiedConnection connections = 1;</code>
   */
  java.util.List<ibc.core.connection.v1.IdentifiedConnection> 
      getConnectionsList();
  /**
   * <pre>
   * list of stored connections of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.IdentifiedConnection connections = 1;</code>
   */
  ibc.core.connection.v1.IdentifiedConnection getConnections(int index);
  /**
   * <pre>
   * list of stored connections of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.IdentifiedConnection connections = 1;</code>
   */
  int getConnectionsCount();
  /**
   * <pre>
   * list of stored connections of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.IdentifiedConnection connections = 1;</code>
   */
  java.util.List<? extends ibc.core.connection.v1.IdentifiedConnectionOrBuilder> 
      getConnectionsOrBuilderList();
  /**
   * <pre>
   * list of stored connections of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.IdentifiedConnection connections = 1;</code>
   */
  ibc.core.connection.v1.IdentifiedConnectionOrBuilder getConnectionsOrBuilder(
      int index);

  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();

  /**
   * <pre>
   * query block height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 3 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasHeight();
  /**
   * <pre>
   * query block height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 3 [(.gogoproto.nullable) = false];</code>
   */
  ibc.core.client.v1.Height getHeight();
  /**
   * <pre>
   * query block height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 3 [(.gogoproto.nullable) = false];</code>
   */
  ibc.core.client.v1.HeightOrBuilder getHeightOrBuilder();
}
