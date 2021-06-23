// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/query.proto

package ibc.core.channel.v1;

public interface QueryPacketCommitmentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.QueryPacketCommitmentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ibc.core.channel.v1.PacketState commitments = 1;</code>
   */
  java.util.List<ibc.core.channel.v1.PacketState> 
      getCommitmentsList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState commitments = 1;</code>
   */
  ibc.core.channel.v1.PacketState getCommitments(int index);
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState commitments = 1;</code>
   */
  int getCommitmentsCount();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState commitments = 1;</code>
   */
  java.util.List<? extends ibc.core.channel.v1.PacketStateOrBuilder> 
      getCommitmentsOrBuilderList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState commitments = 1;</code>
   */
  ibc.core.channel.v1.PacketStateOrBuilder getCommitmentsOrBuilder(
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