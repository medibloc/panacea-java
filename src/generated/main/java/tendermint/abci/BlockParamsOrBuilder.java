// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

public interface BlockParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.abci.BlockParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Note: must be greater than 0
   * </pre>
   *
   * <code>int64 max_bytes = 1;</code>
   */
  long getMaxBytes();

  /**
   * <pre>
   * Note: must be greater or equal to -1
   * </pre>
   *
   * <code>int64 max_gas = 2;</code>
   */
  long getMaxGas();
}
