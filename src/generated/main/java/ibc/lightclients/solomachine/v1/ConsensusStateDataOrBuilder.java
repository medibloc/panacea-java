// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v1/solomachine.proto

package ibc.lightclients.solomachine.v1;

public interface ConsensusStateDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.lightclients.solomachine.v1.ConsensusStateData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes path = 1;</code>
   */
  com.google.protobuf.ByteString getPath();

  /**
   * <code>.google.protobuf.Any consensus_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   */
  boolean hasConsensusState();
  /**
   * <code>.google.protobuf.Any consensus_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   */
  com.google.protobuf.Any getConsensusState();
  /**
   * <code>.google.protobuf.Any consensus_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   */
  com.google.protobuf.AnyOrBuilder getConsensusStateOrBuilder();
}
