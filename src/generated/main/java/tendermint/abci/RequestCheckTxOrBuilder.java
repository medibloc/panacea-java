// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

public interface RequestCheckTxOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.abci.RequestCheckTx)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes tx = 1;</code>
   */
  com.google.protobuf.ByteString getTx();

  /**
   * <code>.tendermint.abci.CheckTxType type = 2;</code>
   */
  int getTypeValue();
  /**
   * <code>.tendermint.abci.CheckTxType type = 2;</code>
   */
  tendermint.abci.CheckTxType getType();
}
