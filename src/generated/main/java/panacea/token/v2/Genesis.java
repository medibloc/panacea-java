// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/token/v2/genesis.proto

package panacea.token.v2;

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
    internal_static_panacea_token_v2_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_token_v2_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_token_v2_GenesisState_TokensEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_token_v2_GenesisState_TokensEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036panacea/token/v2/genesis.proto\022\020panace" +
      "a.token.v2\032\034panacea/token/v2/token.proto" +
      "\"\222\001\n\014GenesisState\022:\n\006tokens\030\001 \003(\0132*.pana" +
      "cea.token.v2.GenesisState.TokensEntry\032F\n" +
      "\013TokensEntry\022\013\n\003key\030\001 \001(\t\022&\n\005value\030\002 \001(\013" +
      "2\027.panacea.token.v2.Token:\0028\001B2P\001Z.githu" +
      "b.com/medibloc/panacea-core/x/token/type" +
      "sb\006proto3"
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
          panacea.token.v2.TokenOuterClass.getDescriptor(),
        }, assigner);
    internal_static_panacea_token_v2_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_panacea_token_v2_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_token_v2_GenesisState_descriptor,
        new java.lang.String[] { "Tokens", });
    internal_static_panacea_token_v2_GenesisState_TokensEntry_descriptor =
      internal_static_panacea_token_v2_GenesisState_descriptor.getNestedTypes().get(0);
    internal_static_panacea_token_v2_GenesisState_TokensEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_token_v2_GenesisState_TokensEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    panacea.token.v2.TokenOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
