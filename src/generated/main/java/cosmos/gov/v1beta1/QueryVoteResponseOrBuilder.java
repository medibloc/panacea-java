// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package cosmos.gov.v1beta1;

public interface QueryVoteResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.gov.v1beta1.QueryVoteResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * vote defined the queried vote.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.Vote vote = 1 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasVote();
  /**
   * <pre>
   * vote defined the queried vote.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.Vote vote = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.gov.v1beta1.Vote getVote();
  /**
   * <pre>
   * vote defined the queried vote.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.Vote vote = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.gov.v1beta1.VoteOrBuilder getVoteOrBuilder();
}