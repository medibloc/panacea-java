// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/did.proto

package panacea.did.v2;

public final class Did {
  private Did() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_Strings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_Strings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_DIDDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_DIDDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_VerificationMethod_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_VerificationMethod_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_VerificationRelationship_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_VerificationRelationship_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_Service_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_DIDDocumentWithSeq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_DIDDocumentWithSeq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_DataWithSeq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_DataWithSeq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030panacea/did/v2/did.proto\022\016panacea.did." +
      "v2\032\024gogoproto/gogo.proto\"\031\n\007Strings\022\016\n\006v" +
      "alues\030\001 \003(\t\"\206\007\n\013DIDDocument\022L\n\010contexts\030" +
      "\001 \001(\0132\027.panacea.did.v2.StringsB\027\332\336\037\023JSON" +
      "StringOrStringsR\010@context\022\n\n\002id\030\002 \001(\t\022D\n" +
      "\ncontroller\030\003 \001(\0132\027.panacea.did.v2.Strin" +
      "gsB\027\332\336\037\023JSONStringOrStrings\022T\n\024verificat" +
      "ion_methods\030\004 \003(\0132\".panacea.did.v2.Verif" +
      "icationMethodR\022verificationMethod\022o\n\017aut" +
      "hentications\030\005 \003(\0132(.panacea.did.v2.Veri" +
      "ficationRelationshipB\034\332\336\037\030VerificationRe" +
      "lationshipR\016authentication\022r\n\021assertion_" +
      "methods\030\006 \003(\0132(.panacea.did.v2.Verificat" +
      "ionRelationshipB\034\332\336\037\030VerificationRelatio" +
      "nshipR\017assertionMethod\022l\n\016key_agreements" +
      "\030\007 \003(\0132(.panacea.did.v2.VerificationRela" +
      "tionshipB\034\332\336\037\030VerificationRelationshipR\014" +
      "keyAgreement\022|\n\026capability_invocations\030\010" +
      " \003(\0132(.panacea.did.v2.VerificationRelati" +
      "onshipB\034\332\336\037\030VerificationRelationshipR\024ca" +
      "pabilityInvocation\022|\n\026capability_delegat" +
      "ions\030\t \003(\0132(.panacea.did.v2.Verification" +
      "RelationshipB\034\332\336\037\030VerificationRelationsh" +
      "ipR\024capabilityDelegation\0222\n\010services\030\n \003" +
      "(\0132\027.panacea.did.v2.ServiceR\007service\"n\n\022" +
      "VerificationMethod\022\n\n\002id\030\001 \001(\t\022\014\n\004type\030\002" +
      " \001(\t\022\022\n\ncontroller\030\003 \001(\t\022*\n\021public_key_b" +
      "ase58\030\004 \001(\tR\017publicKeyBase58\"\212\001\n\030Verific" +
      "ationRelationship\022 \n\026verification_method" +
      "_id\030\001 \001(\tH\000\022A\n\023verification_method\030\002 \001(\013" +
      "2\".panacea.did.v2.VerificationMethodH\000B\t" +
      "\n\007content\"N\n\007Service\022\n\n\002id\030\001 \001(\t\022\014\n\004type" +
      "\030\002 \001(\t\022)\n\020service_endpoint\030\003 \001(\tR\017servic" +
      "eEndpoint\"U\n\022DIDDocumentWithSeq\022-\n\010docum" +
      "ent\030\001 \001(\0132\033.panacea.did.v2.DIDDocument\022\020" +
      "\n\010sequence\030\002 \001(\004\"-\n\013DataWithSeq\022\014\n\004data\030" +
      "\001 \001(\014\022\020\n\010sequence\030\002 \001(\004B0P\001Z,github.com/" +
      "medibloc/panacea-core/x/did/typesb\006proto" +
      "3"
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
        }, assigner);
    internal_static_panacea_did_v2_Strings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_panacea_did_v2_Strings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_Strings_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_panacea_did_v2_DIDDocument_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_panacea_did_v2_DIDDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_DIDDocument_descriptor,
        new java.lang.String[] { "Contexts", "Id", "Controller", "VerificationMethods", "Authentications", "AssertionMethods", "KeyAgreements", "CapabilityInvocations", "CapabilityDelegations", "Services", });
    internal_static_panacea_did_v2_VerificationMethod_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_panacea_did_v2_VerificationMethod_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_VerificationMethod_descriptor,
        new java.lang.String[] { "Id", "Type", "Controller", "PublicKeyBase58", });
    internal_static_panacea_did_v2_VerificationRelationship_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_panacea_did_v2_VerificationRelationship_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_VerificationRelationship_descriptor,
        new java.lang.String[] { "VerificationMethodId", "VerificationMethod", "Content", });
    internal_static_panacea_did_v2_Service_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_panacea_did_v2_Service_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_Service_descriptor,
        new java.lang.String[] { "Id", "Type", "ServiceEndpoint", });
    internal_static_panacea_did_v2_DIDDocumentWithSeq_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_panacea_did_v2_DIDDocumentWithSeq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_DIDDocumentWithSeq_descriptor,
        new java.lang.String[] { "Document", "Sequence", });
    internal_static_panacea_did_v2_DataWithSeq_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_panacea_did_v2_DataWithSeq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_DataWithSeq_descriptor,
        new java.lang.String[] { "Data", "Sequence", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.customtype);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
