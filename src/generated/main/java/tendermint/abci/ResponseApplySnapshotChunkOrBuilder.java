// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

public interface ResponseApplySnapshotChunkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.abci.ResponseApplySnapshotChunk)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tendermint.abci.ResponseApplySnapshotChunk.Result result = 1;</code>
   */
  int getResultValue();
  /**
   * <code>.tendermint.abci.ResponseApplySnapshotChunk.Result result = 1;</code>
   */
  tendermint.abci.ResponseApplySnapshotChunk.Result getResult();

  /**
   * <pre>
   * Chunks to refetch and reapply
   * </pre>
   *
   * <code>repeated uint32 refetch_chunks = 2;</code>
   */
  java.util.List<java.lang.Integer> getRefetchChunksList();
  /**
   * <pre>
   * Chunks to refetch and reapply
   * </pre>
   *
   * <code>repeated uint32 refetch_chunks = 2;</code>
   */
  int getRefetchChunksCount();
  /**
   * <pre>
   * Chunks to refetch and reapply
   * </pre>
   *
   * <code>repeated uint32 refetch_chunks = 2;</code>
   */
  int getRefetchChunks(int index);

  /**
   * <pre>
   * Chunk senders to reject and ban
   * </pre>
   *
   * <code>repeated string reject_senders = 3;</code>
   */
  java.util.List<java.lang.String>
      getRejectSendersList();
  /**
   * <pre>
   * Chunk senders to reject and ban
   * </pre>
   *
   * <code>repeated string reject_senders = 3;</code>
   */
  int getRejectSendersCount();
  /**
   * <pre>
   * Chunk senders to reject and ban
   * </pre>
   *
   * <code>repeated string reject_senders = 3;</code>
   */
  java.lang.String getRejectSenders(int index);
  /**
   * <pre>
   * Chunk senders to reject and ban
   * </pre>
   *
   * <code>repeated string reject_senders = 3;</code>
   */
  com.google.protobuf.ByteString
      getRejectSendersBytes(int index);
}
