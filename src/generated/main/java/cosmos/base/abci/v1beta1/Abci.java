// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/abci/v1beta1/abci.proto

package cosmos.base.abci.v1beta1;

public final class Abci {
  private Abci() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_abci_v1beta1_TxResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_abci_v1beta1_TxResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_abci_v1beta1_ABCIMessageLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_abci_v1beta1_ABCIMessageLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_abci_v1beta1_StringEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_abci_v1beta1_StringEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_abci_v1beta1_Attribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_abci_v1beta1_Attribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_abci_v1beta1_GasInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_abci_v1beta1_GasInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_abci_v1beta1_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_abci_v1beta1_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_abci_v1beta1_SimulationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_abci_v1beta1_SimulationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_abci_v1beta1_MsgData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_abci_v1beta1_MsgData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_abci_v1beta1_TxMsgData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_abci_v1beta1_TxMsgData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_abci_v1beta1_SearchTxsResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_abci_v1beta1_SearchTxsResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#cosmos/base/abci/v1beta1/abci.proto\022\030c" +
      "osmos.base.abci.v1beta1\032\024gogoproto/gogo." +
      "proto\032\033tendermint/abci/types.proto\032\031goog" +
      "le/protobuf/any.proto\"\346\002\n\nTxResponse\022\016\n\006" +
      "height\030\001 \001(\003\022\032\n\006txhash\030\002 \001(\tB\n\342\336\037\006TxHash" +
      "\022\021\n\tcodespace\030\003 \001(\t\022\014\n\004code\030\004 \001(\r\022\014\n\004dat" +
      "a\030\005 \001(\t\022\017\n\007raw_log\030\006 \001(\t\022O\n\004logs\030\007 \003(\0132(" +
      ".cosmos.base.abci.v1beta1.ABCIMessageLog" +
      "B\027\252\337\037\017ABCIMessageLogs\310\336\037\000\022\014\n\004info\030\010 \001(\t\022" +
      "\022\n\ngas_wanted\030\t \001(\003\022\020\n\010gas_used\030\n \001(\003\022 \n" +
      "\002tx\030\013 \001(\0132\024.google.protobuf.Any\022\021\n\ttimes" +
      "tamp\030\014 \001(\t\022,\n\006events\030\r \003(\0132\026.tendermint." +
      "abci.EventB\004\310\336\037\000:\004\210\240\037\000\"\203\001\n\016ABCIMessageLo" +
      "g\022\021\n\tmsg_index\030\001 \001(\r\022\013\n\003log\030\002 \001(\t\022K\n\006eve" +
      "nts\030\003 \003(\0132%.cosmos.base.abci.v1beta1.Str" +
      "ingEventB\024\252\337\037\014StringEvents\310\336\037\000:\004\200\334 \001\"`\n\013" +
      "StringEvent\022\014\n\004type\030\001 \001(\t\022=\n\nattributes\030" +
      "\002 \003(\0132#.cosmos.base.abci.v1beta1.Attribu" +
      "teB\004\310\336\037\000:\004\200\334 \001\"\'\n\tAttribute\022\013\n\003key\030\001 \001(\t" +
      "\022\r\n\005value\030\002 \001(\t\"[\n\007GasInfo\022)\n\ngas_wanted" +
      "\030\001 \001(\004B\025\362\336\037\021yaml:\"gas_wanted\"\022%\n\010gas_use" +
      "d\030\002 \001(\004B\023\362\336\037\017yaml:\"gas_used\"\"W\n\006Result\022\014" +
      "\n\004data\030\001 \001(\014\022\013\n\003log\030\002 \001(\t\022,\n\006events\030\003 \003(" +
      "\0132\026.tendermint.abci.EventB\004\310\336\037\000:\004\210\240\037\000\"\205\001" +
      "\n\022SimulationResponse\022=\n\010gas_info\030\001 \001(\0132!" +
      ".cosmos.base.abci.v1beta1.GasInfoB\010\320\336\037\001\310" +
      "\336\037\000\0220\n\006result\030\002 \001(\0132 .cosmos.base.abci.v" +
      "1beta1.Result\"/\n\007MsgData\022\020\n\010msg_type\030\001 \001" +
      "(\t\022\014\n\004data\030\002 \001(\014:\004\200\334 \001\"B\n\tTxMsgData\022/\n\004d" +
      "ata\030\001 \003(\0132!.cosmos.base.abci.v1beta1.Msg" +
      "Data:\004\200\334 \001\"\231\002\n\017SearchTxsResult\022:\n\013total_" +
      "count\030\001 \001(\004B%\362\336\037\022yaml:\"total_count\"\352\336\037\013t" +
      "otal_count\022\r\n\005count\030\002 \001(\004\022:\n\013page_number" +
      "\030\003 \001(\004B%\362\336\037\022yaml:\"page_number\"\352\336\037\013page_n" +
      "umber\0227\n\npage_total\030\004 \001(\004B#\362\336\037\021yaml:\"pag" +
      "e_total\"\352\336\037\npage_total\022\r\n\005limit\030\005 \001(\004\0221\n" +
      "\003txs\030\006 \003(\0132$.cosmos.base.abci.v1beta1.Tx" +
      "Response:\004\200\334 \001B*P\001Z\"github.com/cosmos/co" +
      "smos-sdk/types\330\341\036\000b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          tendermint.abci.Types.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_cosmos_base_abci_v1beta1_TxResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_base_abci_v1beta1_TxResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_abci_v1beta1_TxResponse_descriptor,
        new java.lang.String[] { "Height", "Txhash", "Codespace", "Code", "Data", "RawLog", "Logs", "Info", "GasWanted", "GasUsed", "Tx", "Timestamp", "Events", });
    internal_static_cosmos_base_abci_v1beta1_ABCIMessageLog_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_base_abci_v1beta1_ABCIMessageLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_abci_v1beta1_ABCIMessageLog_descriptor,
        new java.lang.String[] { "MsgIndex", "Log", "Events", });
    internal_static_cosmos_base_abci_v1beta1_StringEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_base_abci_v1beta1_StringEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_abci_v1beta1_StringEvent_descriptor,
        new java.lang.String[] { "Type", "Attributes", });
    internal_static_cosmos_base_abci_v1beta1_Attribute_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_base_abci_v1beta1_Attribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_abci_v1beta1_Attribute_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_cosmos_base_abci_v1beta1_GasInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_base_abci_v1beta1_GasInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_abci_v1beta1_GasInfo_descriptor,
        new java.lang.String[] { "GasWanted", "GasUsed", });
    internal_static_cosmos_base_abci_v1beta1_Result_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_base_abci_v1beta1_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_abci_v1beta1_Result_descriptor,
        new java.lang.String[] { "Data", "Log", "Events", });
    internal_static_cosmos_base_abci_v1beta1_SimulationResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_base_abci_v1beta1_SimulationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_abci_v1beta1_SimulationResponse_descriptor,
        new java.lang.String[] { "GasInfo", "Result", });
    internal_static_cosmos_base_abci_v1beta1_MsgData_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_base_abci_v1beta1_MsgData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_abci_v1beta1_MsgData_descriptor,
        new java.lang.String[] { "MsgType", "Data", });
    internal_static_cosmos_base_abci_v1beta1_TxMsgData_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_cosmos_base_abci_v1beta1_TxMsgData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_abci_v1beta1_TxMsgData_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_cosmos_base_abci_v1beta1_SearchTxsResult_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_cosmos_base_abci_v1beta1_SearchTxsResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_abci_v1beta1_SearchTxsResult_descriptor,
        new java.lang.String[] { "TotalCount", "Count", "PageNumber", "PageTotal", "Limit", "Txs", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.castrepeated);
    registry.add(com.google.protobuf.GoGoProtos.customname);
    registry.add(com.google.protobuf.GoGoProtos.embed);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    registry.add(com.google.protobuf.GoGoProtos.goprotoStringerAll);
    registry.add(com.google.protobuf.GoGoProtos.jsontag);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    registry.add(com.google.protobuf.GoGoProtos.stringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    tendermint.abci.Types.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
