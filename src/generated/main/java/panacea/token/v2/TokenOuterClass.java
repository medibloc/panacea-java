// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/token/v2/token.proto

package panacea.token.v2;

public final class TokenOuterClass {
  private TokenOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_token_v2_Token_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_token_v2_Token_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034panacea/token/v2/token.proto\022\020panacea." +
      "token.v2\032\024gogoproto/gogo.proto\032\036cosmos/b" +
      "ase/v1beta1/coin.proto\"\205\001\n\005Token\022\014\n\004name" +
      "\030\001 \001(\t\022\016\n\006symbol\030\002 \001(\t\0225\n\014total_supply\030\003" +
      " \001(\0132\031.cosmos.base.v1beta1.CoinB\004\310\336\037\000\022\020\n" +
      "\010mintable\030\004 \001(\010\022\025\n\rowner_address\030\005 \001(\tB2" +
      "P\001Z.github.com/medibloc/panacea-core/x/t" +
      "oken/typesb\006proto3"
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
          cosmos.base.v1beta1.CoinOuterClass.getDescriptor(),
        }, assigner);
    internal_static_panacea_token_v2_Token_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_panacea_token_v2_Token_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_token_v2_Token_descriptor,
        new java.lang.String[] { "Name", "Symbol", "TotalSupply", "Mintable", "OwnerAddress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    cosmos.base.v1beta1.CoinOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
