// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/genesis.proto

package ibc.core.connection.v1;

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
    internal_static_ibc_core_connection_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_connection_v1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$ibc/core/connection/v1/genesis.proto\022\026" +
      "ibc.core.connection.v1\032\024gogoproto/gogo.p" +
      "roto\032\'ibc/core/connection/v1/connection." +
      "proto\"\220\002\n\014GenesisState\022G\n\013connections\030\001 " +
      "\003(\0132,.ibc.core.connection.v1.IdentifiedC" +
      "onnectionB\004\310\336\037\000\022p\n\027client_connection_pat" +
      "hs\030\002 \003(\0132\'.ibc.core.connection.v1.Connec" +
      "tionPathsB&\310\336\037\000\362\336\037\036yaml:\"client_connecti" +
      "on_paths\"\022E\n\030next_connection_sequence\030\003 " +
      "\001(\004B#\362\336\037\037yaml:\"next_connection_sequence\"" +
      "B?P\001Z;github.com/cosmos/cosmos-sdk/x/ibc" +
      "/core/03-connection/typesb\006proto3"
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
          ibc.core.connection.v1.Connection.getDescriptor(),
        }, assigner);
    internal_static_ibc_core_connection_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_core_connection_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_connection_v1_GenesisState_descriptor,
        new java.lang.String[] { "Connections", "ClientConnectionPaths", "NextConnectionSequence", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    ibc.core.connection.v1.Connection.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
