// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/transfer/v1/genesis.proto

package ibc.applications.transfer.v1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.applications.transfer.v1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string port_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
   */
  java.lang.String getPortId();
  /**
   * <code>string port_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
   */
  com.google.protobuf.ByteString
      getPortIdBytes();

  /**
   * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_traces&#92;"", (.gogoproto.castrepeated) = "Traces"];</code>
   */
  java.util.List<ibc.applications.transfer.v1.DenomTrace> 
      getDenomTracesList();
  /**
   * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_traces&#92;"", (.gogoproto.castrepeated) = "Traces"];</code>
   */
  ibc.applications.transfer.v1.DenomTrace getDenomTraces(int index);
  /**
   * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_traces&#92;"", (.gogoproto.castrepeated) = "Traces"];</code>
   */
  int getDenomTracesCount();
  /**
   * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_traces&#92;"", (.gogoproto.castrepeated) = "Traces"];</code>
   */
  java.util.List<? extends ibc.applications.transfer.v1.DenomTraceOrBuilder> 
      getDenomTracesOrBuilderList();
  /**
   * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_traces&#92;"", (.gogoproto.castrepeated) = "Traces"];</code>
   */
  ibc.applications.transfer.v1.DenomTraceOrBuilder getDenomTracesOrBuilder(
      int index);

  /**
   * <code>.ibc.applications.transfer.v1.Params params = 3 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasParams();
  /**
   * <code>.ibc.applications.transfer.v1.Params params = 3 [(.gogoproto.nullable) = false];</code>
   */
  ibc.applications.transfer.v1.Params getParams();
  /**
   * <code>.ibc.applications.transfer.v1.Params params = 3 [(.gogoproto.nullable) = false];</code>
   */
  ibc.applications.transfer.v1.ParamsOrBuilder getParamsOrBuilder();
}