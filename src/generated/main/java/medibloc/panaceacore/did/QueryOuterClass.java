// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: did/query.proto

package medibloc.panaceacore.did;

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
    internal_static_medibloc_panaceacore_did_QueryGetDIDRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_medibloc_panaceacore_did_QueryGetDIDRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_medibloc_panaceacore_did_QueryGetDIDResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_medibloc_panaceacore_did_QueryGetDIDResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017did/query.proto\022\030medibloc.panaceacore." +
      "did\032\034google/api/annotations.proto\032*cosmo" +
      "s/base/query/v1beta1/pagination.proto\032\rd" +
      "id/did.proto\"!\n\022QueryGetDIDRequest\022\013\n\003DI" +
      "D\030\001 \001(\t\"_\n\023QueryGetDIDResponse\022H\n\022DIDDoc" +
      "umentWithSeq\030\001 \001(\0132,.medibloc.panaceacor" +
      "e.did.DIDDocumentWithSeq2\237\001\n\005Query\022\225\001\n\022D" +
      "IDDocumentWithSeq\022,.medibloc.panaceacore" +
      ".did.QueryGetDIDRequest\032-.medibloc.panac" +
      "eacore.did.QueryGetDIDResponse\"\"\202\323\344\223\002\034\022\032" +
      "/panacea/did/v2/dids/{DID}B0P\001Z,github.c" +
      "om/medibloc/panacea-core/x/did/typesb\006pr" +
      "oto3"
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
          medibloc.panaceacore.did.Did.getDescriptor(),
        }, assigner);
    internal_static_medibloc_panaceacore_did_QueryGetDIDRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_medibloc_panaceacore_did_QueryGetDIDRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_medibloc_panaceacore_did_QueryGetDIDRequest_descriptor,
        new java.lang.String[] { "DID", });
    internal_static_medibloc_panaceacore_did_QueryGetDIDResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_medibloc_panaceacore_did_QueryGetDIDResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_medibloc_panaceacore_did_QueryGetDIDResponse_descriptor,
        new java.lang.String[] { "DIDDocumentWithSeq", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    cosmos.base.query.v1beta1.Pagination.getDescriptor();
    medibloc.panaceacore.did.Did.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
