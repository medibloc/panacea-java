// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/abci/v1beta1/abci.proto

package cosmos.base.abci.v1beta1;

public interface TxResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.abci.v1beta1.TxResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The block height
   * </pre>
   *
   * <code>int64 height = 1;</code>
   */
  long getHeight();

  /**
   * <pre>
   * The transaction hash.
   * </pre>
   *
   * <code>string txhash = 2 [(.gogoproto.customname) = "TxHash"];</code>
   */
  java.lang.String getTxhash();
  /**
   * <pre>
   * The transaction hash.
   * </pre>
   *
   * <code>string txhash = 2 [(.gogoproto.customname) = "TxHash"];</code>
   */
  com.google.protobuf.ByteString
      getTxhashBytes();

  /**
   * <pre>
   * Namespace for the Code
   * </pre>
   *
   * <code>string codespace = 3;</code>
   */
  java.lang.String getCodespace();
  /**
   * <pre>
   * Namespace for the Code
   * </pre>
   *
   * <code>string codespace = 3;</code>
   */
  com.google.protobuf.ByteString
      getCodespaceBytes();

  /**
   * <pre>
   * Response code.
   * </pre>
   *
   * <code>uint32 code = 4;</code>
   */
  int getCode();

  /**
   * <pre>
   * Result bytes, if any.
   * </pre>
   *
   * <code>string data = 5;</code>
   */
  java.lang.String getData();
  /**
   * <pre>
   * Result bytes, if any.
   * </pre>
   *
   * <code>string data = 5;</code>
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <pre>
   * The output of the application's logger (raw string). May be
   * non-deterministic.
   * </pre>
   *
   * <code>string raw_log = 6;</code>
   */
  java.lang.String getRawLog();
  /**
   * <pre>
   * The output of the application's logger (raw string). May be
   * non-deterministic.
   * </pre>
   *
   * <code>string raw_log = 6;</code>
   */
  com.google.protobuf.ByteString
      getRawLogBytes();

  /**
   * <pre>
   * The output of the application's logger (typed). May be non-deterministic.
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.ABCIMessageLog logs = 7 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "ABCIMessageLogs"];</code>
   */
  java.util.List<cosmos.base.abci.v1beta1.ABCIMessageLog> 
      getLogsList();
  /**
   * <pre>
   * The output of the application's logger (typed). May be non-deterministic.
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.ABCIMessageLog logs = 7 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "ABCIMessageLogs"];</code>
   */
  cosmos.base.abci.v1beta1.ABCIMessageLog getLogs(int index);
  /**
   * <pre>
   * The output of the application's logger (typed). May be non-deterministic.
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.ABCIMessageLog logs = 7 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "ABCIMessageLogs"];</code>
   */
  int getLogsCount();
  /**
   * <pre>
   * The output of the application's logger (typed). May be non-deterministic.
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.ABCIMessageLog logs = 7 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "ABCIMessageLogs"];</code>
   */
  java.util.List<? extends cosmos.base.abci.v1beta1.ABCIMessageLogOrBuilder> 
      getLogsOrBuilderList();
  /**
   * <pre>
   * The output of the application's logger (typed). May be non-deterministic.
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.ABCIMessageLog logs = 7 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "ABCIMessageLogs"];</code>
   */
  cosmos.base.abci.v1beta1.ABCIMessageLogOrBuilder getLogsOrBuilder(
      int index);

  /**
   * <pre>
   * Additional information. May be non-deterministic.
   * </pre>
   *
   * <code>string info = 8;</code>
   */
  java.lang.String getInfo();
  /**
   * <pre>
   * Additional information. May be non-deterministic.
   * </pre>
   *
   * <code>string info = 8;</code>
   */
  com.google.protobuf.ByteString
      getInfoBytes();

  /**
   * <pre>
   * Amount of gas requested for transaction.
   * </pre>
   *
   * <code>int64 gas_wanted = 9;</code>
   */
  long getGasWanted();

  /**
   * <pre>
   * Amount of gas consumed by transaction.
   * </pre>
   *
   * <code>int64 gas_used = 10;</code>
   */
  long getGasUsed();

  /**
   * <pre>
   * The request transaction bytes.
   * </pre>
   *
   * <code>.google.protobuf.Any tx = 11;</code>
   */
  boolean hasTx();
  /**
   * <pre>
   * The request transaction bytes.
   * </pre>
   *
   * <code>.google.protobuf.Any tx = 11;</code>
   */
  com.google.protobuf.Any getTx();
  /**
   * <pre>
   * The request transaction bytes.
   * </pre>
   *
   * <code>.google.protobuf.Any tx = 11;</code>
   */
  com.google.protobuf.AnyOrBuilder getTxOrBuilder();

  /**
   * <pre>
   * Time of the previous block. For heights &gt; 1, it's the weighted median of
   * the timestamps of the valid votes in the block.LastCommit. For height == 1,
   * it's genesis time.
   * </pre>
   *
   * <code>string timestamp = 12;</code>
   */
  java.lang.String getTimestamp();
  /**
   * <pre>
   * Time of the previous block. For heights &gt; 1, it's the weighted median of
   * the timestamps of the valid votes in the block.LastCommit. For height == 1,
   * it's genesis time.
   * </pre>
   *
   * <code>string timestamp = 12;</code>
   */
  com.google.protobuf.ByteString
      getTimestampBytes();

  /**
   * <pre>
   * Events defines all the events emitted by processing a transaction. Note,
   * these events include those emitted by processing all the messages and those
   * emitted from the ante handler. Whereas Logs contains the events, with
   * additional metadata, emitted only by processing the messages.
   * Since: cosmos-sdk 0.42.11, 0.44.5, 0.45
   * </pre>
   *
   * <code>repeated .tendermint.abci.Event events = 13 [(.gogoproto.nullable) = false];</code>
   */
  java.util.List<tendermint.abci.Event> 
      getEventsList();
  /**
   * <pre>
   * Events defines all the events emitted by processing a transaction. Note,
   * these events include those emitted by processing all the messages and those
   * emitted from the ante handler. Whereas Logs contains the events, with
   * additional metadata, emitted only by processing the messages.
   * Since: cosmos-sdk 0.42.11, 0.44.5, 0.45
   * </pre>
   *
   * <code>repeated .tendermint.abci.Event events = 13 [(.gogoproto.nullable) = false];</code>
   */
  tendermint.abci.Event getEvents(int index);
  /**
   * <pre>
   * Events defines all the events emitted by processing a transaction. Note,
   * these events include those emitted by processing all the messages and those
   * emitted from the ante handler. Whereas Logs contains the events, with
   * additional metadata, emitted only by processing the messages.
   * Since: cosmos-sdk 0.42.11, 0.44.5, 0.45
   * </pre>
   *
   * <code>repeated .tendermint.abci.Event events = 13 [(.gogoproto.nullable) = false];</code>
   */
  int getEventsCount();
  /**
   * <pre>
   * Events defines all the events emitted by processing a transaction. Note,
   * these events include those emitted by processing all the messages and those
   * emitted from the ante handler. Whereas Logs contains the events, with
   * additional metadata, emitted only by processing the messages.
   * Since: cosmos-sdk 0.42.11, 0.44.5, 0.45
   * </pre>
   *
   * <code>repeated .tendermint.abci.Event events = 13 [(.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends tendermint.abci.EventOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <pre>
   * Events defines all the events emitted by processing a transaction. Note,
   * these events include those emitted by processing all the messages and those
   * emitted from the ante handler. Whereas Logs contains the events, with
   * additional metadata, emitted only by processing the messages.
   * Since: cosmos-sdk 0.42.11, 0.44.5, 0.45
   * </pre>
   *
   * <code>repeated .tendermint.abci.Event events = 13 [(.gogoproto.nullable) = false];</code>
   */
  tendermint.abci.EventOrBuilder getEventsOrBuilder(
      int index);
}
