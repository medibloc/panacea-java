// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/types/v1/genesis.proto

package ibc.core.types.v1;

public final class Genesis {
  private Genesis() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_types_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_types_v1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ibc/core/types/v1/genesis.proto\022\021ibc.c" +
      "ore.types.v1\032\024gogoproto/gogo.proto\032 ibc/" +
      "core/client/v1/genesis.proto\032$ibc/core/c" +
      "onnection/v1/genesis.proto\032!ibc/core/cha" +
      "nnel/v1/genesis.proto\"\250\002\n\014GenesisState\022W" +
      "\n\016client_genesis\030\001 \001(\0132 .ibc.core.client" +
      ".v1.GenesisStateB\035\310\336\037\000\362\336\037\025yaml:\"client_g" +
      "enesis\"\022c\n\022connection_genesis\030\002 \001(\0132$.ib" +
      "c.core.connection.v1.GenesisStateB!\310\336\037\000\362" +
      "\336\037\031yaml:\"connection_genesis\"\022Z\n\017channel_" +
      "genesis\030\003 \001(\0132!.ibc.core.channel.v1.Gene" +
      "sisStateB\036\310\336\037\000\362\336\037\026yaml:\"channel_genesis\"" +
      "B1P\001Z-github.com/cosmos/cosmos-sdk/x/ibc" +
      "/core/typesb\006proto3"
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
          ibc.core.client.v1.Genesis.getDescriptor(),
          ibc.core.connection.v1.Genesis.getDescriptor(),
          ibc.core.channel.v1.Genesis.getDescriptor(),
        }, assigner);
    internal_static_ibc_core_types_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_core_types_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_types_v1_GenesisState_descriptor,
        new java.lang.String[] { "ClientGenesis", "ConnectionGenesis", "ChannelGenesis", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    ibc.core.client.v1.Genesis.getDescriptor();
    ibc.core.connection.v1.Genesis.getDescriptor();
    ibc.core.channel.v1.Genesis.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
