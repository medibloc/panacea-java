// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/token/v2/query.proto

package panacea.token.v2;

public final class QueryOuterClass {
  private QueryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_token_v2_QueryGetTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_token_v2_QueryGetTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_token_v2_QueryGetTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_token_v2_QueryGetTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_token_v2_QueryAllTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_token_v2_QueryAllTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_token_v2_QueryAllTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_token_v2_QueryAllTokenResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034panacea/token/v2/query.proto\022\020panacea." +
      "token.v2\032\034google/api/annotations.proto\032*" +
      "cosmos/base/query/v1beta1/pagination.pro" +
      "to\032\034panacea/token/v2/token.proto\"&\n\024Quer" +
      "yGetTokenRequest\022\016\n\006symbol\030\001 \001(\t\"?\n\025Quer" +
      "yGetTokenResponse\022&\n\005Token\030\001 \001(\0132\027.panac" +
      "ea.token.v2.Token\"R\n\024QueryAllTokenReques" +
      "t\022:\n\npagination\030\001 \001(\0132&.cosmos.base.quer" +
      "y.v1beta1.PageRequest\"|\n\025QueryAllTokenRe" +
      "sponse\022&\n\005Token\030\001 \003(\0132\027.panacea.token.v2" +
      ".Token\022;\n\npagination\030\002 \001(\0132\'.cosmos.base" +
      ".query.v1beta1.PageResponse2\214\002\n\005Query\022\203\001" +
      "\n\005Token\022&.panacea.token.v2.QueryGetToken" +
      "Request\032\'.panacea.token.v2.QueryGetToken" +
      "Response\")\202\323\344\223\002#\022!/panacea/token/v2/toke" +
      "ns/{symbol}\022}\n\010TokenAll\022&.panacea.token." +
      "v2.QueryAllTokenRequest\032\'.panacea.token." +
      "v2.QueryAllTokenResponse\" \202\323\344\223\002\032\022\030/panac" +
      "ea/token/v2/tokensB2P\001Z.github.com/medib" +
      "loc/panacea-core/x/token/typesb\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          cosmos.base.query.v1beta1.Pagination.getDescriptor(),
          panacea.token.v2.TokenOuterClass.getDescriptor(),
        }, assigner);
    internal_static_panacea_token_v2_QueryGetTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_panacea_token_v2_QueryGetTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_token_v2_QueryGetTokenRequest_descriptor,
        new java.lang.String[] { "Symbol", });
    internal_static_panacea_token_v2_QueryGetTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_panacea_token_v2_QueryGetTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_token_v2_QueryGetTokenResponse_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_panacea_token_v2_QueryAllTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_panacea_token_v2_QueryAllTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_token_v2_QueryAllTokenRequest_descriptor,
        new java.lang.String[] { "Pagination", });
    internal_static_panacea_token_v2_QueryAllTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_panacea_token_v2_QueryAllTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_token_v2_QueryAllTokenResponse_descriptor,
        new java.lang.String[] { "Token", "Pagination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    cosmos.base.query.v1beta1.Pagination.getDescriptor();
    panacea.token.v2.TokenOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
