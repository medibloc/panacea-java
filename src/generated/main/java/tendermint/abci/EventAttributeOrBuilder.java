// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

public interface EventAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.abci.EventAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes key = 1;</code>
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>bytes value = 2;</code>
   */
  com.google.protobuf.ByteString getValue();

  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>bool index = 3;</code>
   */
  boolean getIndex();
}