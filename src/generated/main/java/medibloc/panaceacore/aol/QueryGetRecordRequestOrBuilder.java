// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aol/query.proto

package medibloc.panaceacore.aol;

public interface QueryGetRecordRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:medibloc.panaceacore.aol.QueryGetRecordRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ownerAddress = 1;</code>
   */
  java.lang.String getOwnerAddress();
  /**
   * <code>string ownerAddress = 1;</code>
   */
  com.google.protobuf.ByteString
      getOwnerAddressBytes();

  /**
   * <code>string topicName = 2;</code>
   */
  java.lang.String getTopicName();
  /**
   * <code>string topicName = 2;</code>
   */
  com.google.protobuf.ByteString
      getTopicNameBytes();

  /**
   * <code>uint64 offset = 3;</code>
   */
  long getOffset();
}
