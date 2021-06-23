// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/tx.proto

package panacea.did.v2;

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
    internal_static_panacea_did_v2_MsgCreateDID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_MsgCreateDID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_MsgCreateDIDResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_MsgCreateDIDResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_MsgUpdateDID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_MsgUpdateDID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_MsgUpdateDIDResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_MsgUpdateDIDResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_MsgDeactivateDID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_MsgDeactivateDID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_MsgDeactivateDIDResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_MsgDeactivateDIDResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027panacea/did/v2/tx.proto\022\016panacea.did.v" +
      "2\032\024gogoproto/gogo.proto\032\030panacea/did/v2/" +
      "did.proto\"\362\001\n\014MsgCreateDID\022\031\n\003DID\030\001 \001(\tB" +
      "\007\352\336\037\003didR\003did\022-\n\010document\030\002 \001(\0132\033.panace" +
      "a.did.v2.DIDDocument\022P\n\024verificationMeth" +
      "odID\030\003 \001(\tB\032\352\336\037\026verification_method_idR\026" +
      "verification_method_id\022\021\n\tsignature\030\004 \001(" +
      "\014\0223\n\013fromAddress\030\005 \001(\tB\020\352\336\037\014from_address" +
      "R\014from_address\"\026\n\024MsgCreateDIDResponse\"\362" +
      "\001\n\014MsgUpdateDID\022\031\n\003DID\030\001 \001(\tB\007\352\336\037\003didR\003d" +
      "id\022-\n\010document\030\002 \001(\0132\033.panacea.did.v2.DI" +
      "DDocument\022P\n\024verificationMethodID\030\003 \001(\tB" +
      "\032\352\336\037\026verification_method_idR\026verificatio" +
      "n_method_id\022\021\n\tsignature\030\004 \001(\014\0223\n\013fromAd" +
      "dress\030\005 \001(\tB\020\352\336\037\014from_addressR\014from_addr" +
      "ess\"\026\n\024MsgUpdateDIDResponse\"\307\001\n\020MsgDeact" +
      "ivateDID\022\031\n\003DID\030\001 \001(\tB\007\352\336\037\003didR\003did\022P\n\024v" +
      "erificationMethodID\030\002 \001(\tB\032\352\336\037\026verificat" +
      "ion_method_idR\026verification_method_id\022\021\n" +
      "\tsignature\030\003 \001(\014\0223\n\013fromAddress\030\004 \001(\tB\020\352" +
      "\336\037\014from_addressR\014from_address\"\032\n\030MsgDeac" +
      "tivateDIDResponse2\204\002\n\003Msg\022O\n\tCreateDID\022\034" +
      ".panacea.did.v2.MsgCreateDID\032$.panacea.d" +
      "id.v2.MsgCreateDIDResponse\022O\n\tUpdateDID\022" +
      "\034.panacea.did.v2.MsgUpdateDID\032$.panacea." +
      "did.v2.MsgUpdateDIDResponse\022[\n\rDeactivat" +
      "eDID\022 .panacea.did.v2.MsgDeactivateDID\032(" +
      ".panacea.did.v2.MsgDeactivateDIDResponse" +
      "B0P\001Z,github.com/medibloc/panacea-core/x" +
      "/did/typesb\006proto3"
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
          panacea.did.v2.Did.getDescriptor(),
        }, assigner);
    internal_static_panacea_did_v2_MsgCreateDID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_panacea_did_v2_MsgCreateDID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_MsgCreateDID_descriptor,
        new java.lang.String[] { "DID", "Document", "VerificationMethodID", "Signature", "FromAddress", });
    internal_static_panacea_did_v2_MsgCreateDIDResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_panacea_did_v2_MsgCreateDIDResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_MsgCreateDIDResponse_descriptor,
        new java.lang.String[] { });
    internal_static_panacea_did_v2_MsgUpdateDID_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_panacea_did_v2_MsgUpdateDID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_MsgUpdateDID_descriptor,
        new java.lang.String[] { "DID", "Document", "VerificationMethodID", "Signature", "FromAddress", });
    internal_static_panacea_did_v2_MsgUpdateDIDResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_panacea_did_v2_MsgUpdateDIDResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_MsgUpdateDIDResponse_descriptor,
        new java.lang.String[] { });
    internal_static_panacea_did_v2_MsgDeactivateDID_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_panacea_did_v2_MsgDeactivateDID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_MsgDeactivateDID_descriptor,
        new java.lang.String[] { "DID", "VerificationMethodID", "Signature", "FromAddress", });
    internal_static_panacea_did_v2_MsgDeactivateDIDResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_panacea_did_v2_MsgDeactivateDIDResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_MsgDeactivateDIDResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.jsontag);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    panacea.did.v2.Did.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}