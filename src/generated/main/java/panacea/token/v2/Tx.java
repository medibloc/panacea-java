// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/token/v2/tx.proto

package panacea.token.v2;

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
    internal_static_panacea_token_v2_MsgIssueToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_token_v2_MsgIssueToken_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_token_v2_MsgIssueTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_token_v2_MsgIssueTokenResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031panacea/token/v2/tx.proto\022\020panacea.tok" +
      "en.v2\032\024gogoproto/gogo.proto\032\036cosmos/base" +
      "/v1beta1/coin.proto\"\231\001\n\rMsgIssueToken\022\014\n" +
      "\004name\030\001 \001(\t\022\023\n\013shortSymbol\030\002 \001(\t\022=\n\020tota" +
      "lSupplyMicro\030\003 \001(\0132\035.cosmos.base.v1beta1" +
      ".IntProtoB\004\310\336\037\000\022\020\n\010mintable\030\004 \001(\010\022\024\n\014own" +
      "erAddress\030\005 \001(\t\"\027\n\025MsgIssueTokenResponse" +
      "2]\n\003Msg\022V\n\nIssueToken\022\037.panacea.token.v2" +
      ".MsgIssueToken\032\'.panacea.token.v2.MsgIss" +
      "ueTokenResponseB2P\001Z.github.com/medibloc" +
      "/panacea-core/x/token/typesb\006proto3"
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
    internal_static_panacea_token_v2_MsgIssueToken_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_panacea_token_v2_MsgIssueToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_token_v2_MsgIssueToken_descriptor,
        new java.lang.String[] { "Name", "ShortSymbol", "TotalSupplyMicro", "Mintable", "OwnerAddress", });
    internal_static_panacea_token_v2_MsgIssueTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_panacea_token_v2_MsgIssueTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_token_v2_MsgIssueTokenResponse_descriptor,
        new java.lang.String[] { });
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
