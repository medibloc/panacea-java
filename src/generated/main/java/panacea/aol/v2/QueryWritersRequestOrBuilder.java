// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/aol/v2/query.proto

package panacea.aol.v2;

public interface QueryWritersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.aol.v2.QueryWritersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string owner_address = 1;</code>
   */
  java.lang.String getOwnerAddress();
  /**
   * <code>string owner_address = 1;</code>
   */
  com.google.protobuf.ByteString
      getOwnerAddressBytes();

  /**
   * <code>string topic_name = 2;</code>
   */
  java.lang.String getTopicName();
  /**
   * <code>string topic_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getTopicNameBytes();

  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3;</code>
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3;</code>
   */
  cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3;</code>
   */
  cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}