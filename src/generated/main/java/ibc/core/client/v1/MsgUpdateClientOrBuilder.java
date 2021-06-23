// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/tx.proto

package ibc.core.client.v1;

public interface MsgUpdateClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.client.v1.MsgUpdateClient)
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
   * header to update the light client
   * </pre>
   *
   * <code>.google.protobuf.Any header = 2;</code>
   */
  boolean hasHeader();
  /**
   * <pre>
   * header to update the light client
   * </pre>
   *
   * <code>.google.protobuf.Any header = 2;</code>
   */
  com.google.protobuf.Any getHeader();
  /**
   * <pre>
   * header to update the light client
   * </pre>
   *
   * <code>.google.protobuf.Any header = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getHeaderOrBuilder();

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