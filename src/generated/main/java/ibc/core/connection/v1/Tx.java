// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/tx.proto

package ibc.core.connection.v1;

public final class Tx {
  private Tx() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_connection_v1_MsgConnectionOpenInit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_connection_v1_MsgConnectionOpenInit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_connection_v1_MsgConnectionOpenInitResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_connection_v1_MsgConnectionOpenInitResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_connection_v1_MsgConnectionOpenTry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_connection_v1_MsgConnectionOpenTry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_connection_v1_MsgConnectionOpenTryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_connection_v1_MsgConnectionOpenTryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_connection_v1_MsgConnectionOpenAck_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_connection_v1_MsgConnectionOpenAck_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_connection_v1_MsgConnectionOpenAckResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_connection_v1_MsgConnectionOpenAckResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirmResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirmResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ibc/core/connection/v1/tx.proto\022\026ibc.c" +
      "ore.connection.v1\032\024gogoproto/gogo.proto\032" +
      "\031google/protobuf/any.proto\032\037ibc/core/cli" +
      "ent/v1/client.proto\032\'ibc/core/connection" +
      "/v1/connection.proto\"\375\001\n\025MsgConnectionOp" +
      "enInit\022\'\n\tclient_id\030\001 \001(\tB\024\362\336\037\020yaml:\"cli" +
      "ent_id\"\022@\n\014counterparty\030\002 \001(\0132$.ibc.core" +
      ".connection.v1.CounterpartyB\004\310\336\037\000\0220\n\007ver" +
      "sion\030\003 \001(\0132\037.ibc.core.connection.v1.Vers" +
      "ion\022-\n\014delay_period\030\004 \001(\004B\027\362\336\037\023yaml:\"del" +
      "ay_period\"\022\016\n\006signer\030\005 \001(\t:\010\350\240\037\000\210\240\037\000\"\037\n\035" +
      "MsgConnectionOpenInitResponse\"\351\005\n\024MsgCon" +
      "nectionOpenTry\022\'\n\tclient_id\030\001 \001(\tB\024\362\336\037\020y" +
      "aml:\"client_id\"\022A\n\026previous_connection_i" +
      "d\030\002 \001(\tB!\362\336\037\035yaml:\"previous_connection_i" +
      "d\"\022C\n\014client_state\030\003 \001(\0132\024.google.protob" +
      "uf.AnyB\027\362\336\037\023yaml:\"client_state\"\022@\n\014count" +
      "erparty\030\004 \001(\0132$.ibc.core.connection.v1.C" +
      "ounterpartyB\004\310\336\037\000\022-\n\014delay_period\030\005 \001(\004B" +
      "\027\362\336\037\023yaml:\"delay_period\"\022`\n\025counterparty" +
      "_versions\030\006 \003(\0132\037.ibc.core.connection.v1" +
      ".VersionB \362\336\037\034yaml:\"counterparty_version" +
      "s\"\022M\n\014proof_height\030\007 \001(\0132\032.ibc.core.clie" +
      "nt.v1.HeightB\033\362\336\037\023yaml:\"proof_height\"\310\336\037" +
      "\000\022)\n\nproof_init\030\010 \001(\014B\025\362\336\037\021yaml:\"proof_i" +
      "nit\"\022-\n\014proof_client\030\t \001(\014B\027\362\336\037\023yaml:\"pr" +
      "oof_client\"\0223\n\017proof_consensus\030\n \001(\014B\032\362\336" +
      "\037\026yaml:\"proof_consensus\"\022U\n\020consensus_he" +
      "ight\030\013 \001(\0132\032.ibc.core.client.v1.HeightB\037" +
      "\362\336\037\027yaml:\"consensus_height\"\310\336\037\000\022\016\n\006signe" +
      "r\030\014 \001(\t:\010\350\240\037\000\210\240\037\000\"\036\n\034MsgConnectionOpenTr" +
      "yResponse\"\326\004\n\024MsgConnectionOpenAck\022/\n\rco" +
      "nnection_id\030\001 \001(\tB\030\362\336\037\024yaml:\"connection_" +
      "id\"\022I\n\032counterparty_connection_id\030\002 \001(\tB" +
      "%\362\336\037!yaml:\"counterparty_connection_id\"\0220" +
      "\n\007version\030\003 \001(\0132\037.ibc.core.connection.v1" +
      ".Version\022C\n\014client_state\030\004 \001(\0132\024.google." +
      "protobuf.AnyB\027\362\336\037\023yaml:\"client_state\"\022M\n" +
      "\014proof_height\030\005 \001(\0132\032.ibc.core.client.v1" +
      ".HeightB\033\362\336\037\023yaml:\"proof_height\"\310\336\037\000\022\'\n\t" +
      "proof_try\030\006 \001(\014B\024\362\336\037\020yaml:\"proof_try\"\022-\n" +
      "\014proof_client\030\007 \001(\014B\027\362\336\037\023yaml:\"proof_cli" +
      "ent\"\0223\n\017proof_consensus\030\010 \001(\014B\032\362\336\037\026yaml:" +
      "\"proof_consensus\"\022U\n\020consensus_height\030\t " +
      "\001(\0132\032.ibc.core.client.v1.HeightB\037\362\336\037\027yam" +
      "l:\"consensus_height\"\310\336\037\000\022\016\n\006signer\030\n \001(\t" +
      ":\010\350\240\037\000\210\240\037\000\"\036\n\034MsgConnectionOpenAckRespon" +
      "se\"\335\001\n\030MsgConnectionOpenConfirm\022/\n\rconne" +
      "ction_id\030\001 \001(\tB\030\362\336\037\024yaml:\"connection_id\"" +
      "\022\'\n\tproof_ack\030\002 \001(\014B\024\362\336\037\020yaml:\"proof_ack" +
      "\"\022M\n\014proof_height\030\003 \001(\0132\032.ibc.core.clien" +
      "t.v1.HeightB\033\362\336\037\023yaml:\"proof_height\"\310\336\037\000" +
      "\022\016\n\006signer\030\004 \001(\t:\010\350\240\037\000\210\240\037\000\"\"\n MsgConnect" +
      "ionOpenConfirmResponse2\371\003\n\003Msg\022z\n\022Connec" +
      "tionOpenInit\022-.ibc.core.connection.v1.Ms" +
      "gConnectionOpenInit\0325.ibc.core.connectio" +
      "n.v1.MsgConnectionOpenInitResponse\022w\n\021Co" +
      "nnectionOpenTry\022,.ibc.core.connection.v1" +
      ".MsgConnectionOpenTry\0324.ibc.core.connect" +
      "ion.v1.MsgConnectionOpenTryResponse\022w\n\021C" +
      "onnectionOpenAck\022,.ibc.core.connection.v" +
      "1.MsgConnectionOpenAck\0324.ibc.core.connec" +
      "tion.v1.MsgConnectionOpenAckResponse\022\203\001\n" +
      "\025ConnectionOpenConfirm\0220.ibc.core.connec" +
      "tion.v1.MsgConnectionOpenConfirm\0328.ibc.c" +
      "ore.connection.v1.MsgConnectionOpenConfi" +
      "rmResponseB?P\001Z;github.com/cosmos/cosmos" +
      "-sdk/x/ibc/core/03-connection/typesb\006pro" +
      "to3"
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
          com.google.protobuf.AnyProto.getDescriptor(),
          ibc.core.client.v1.Client.getDescriptor(),
          ibc.core.connection.v1.Connection.getDescriptor(),
        }, assigner);
    internal_static_ibc_core_connection_v1_MsgConnectionOpenInit_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_core_connection_v1_MsgConnectionOpenInit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_connection_v1_MsgConnectionOpenInit_descriptor,
        new java.lang.String[] { "ClientId", "Counterparty", "Version", "DelayPeriod", "Signer", });
    internal_static_ibc_core_connection_v1_MsgConnectionOpenInitResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_core_connection_v1_MsgConnectionOpenInitResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_connection_v1_MsgConnectionOpenInitResponse_descriptor,
        new java.lang.String[] { });
    internal_static_ibc_core_connection_v1_MsgConnectionOpenTry_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ibc_core_connection_v1_MsgConnectionOpenTry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_connection_v1_MsgConnectionOpenTry_descriptor,
        new java.lang.String[] { "ClientId", "PreviousConnectionId", "ClientState", "Counterparty", "DelayPeriod", "CounterpartyVersions", "ProofHeight", "ProofInit", "ProofClient", "ProofConsensus", "ConsensusHeight", "Signer", });
    internal_static_ibc_core_connection_v1_MsgConnectionOpenTryResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ibc_core_connection_v1_MsgConnectionOpenTryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_connection_v1_MsgConnectionOpenTryResponse_descriptor,
        new java.lang.String[] { });
    internal_static_ibc_core_connection_v1_MsgConnectionOpenAck_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ibc_core_connection_v1_MsgConnectionOpenAck_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_connection_v1_MsgConnectionOpenAck_descriptor,
        new java.lang.String[] { "ConnectionId", "CounterpartyConnectionId", "Version", "ClientState", "ProofHeight", "ProofTry", "ProofClient", "ProofConsensus", "ConsensusHeight", "Signer", });
    internal_static_ibc_core_connection_v1_MsgConnectionOpenAckResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ibc_core_connection_v1_MsgConnectionOpenAckResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_connection_v1_MsgConnectionOpenAckResponse_descriptor,
        new java.lang.String[] { });
    internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirm_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirm_descriptor,
        new java.lang.String[] { "ConnectionId", "ProofAck", "ProofHeight", "Signer", });
    internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirmResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirmResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirmResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.equal);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    ibc.core.client.v1.Client.getDescriptor();
    ibc.core.connection.v1.Connection.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}