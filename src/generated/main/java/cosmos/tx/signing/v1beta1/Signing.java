// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/signing/v1beta1/signing.proto

package cosmos.tx.signing.v1beta1;

public final class Signing {
  private Signing() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptors_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptors_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_Single_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_Single_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_Multi_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_Multi_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'cosmos/tx/signing/v1beta1/signing.prot" +
      "o\022\031cosmos.tx.signing.v1beta1\032-cosmos/cry" +
      "pto/multisig/v1beta1/multisig.proto\032\031goo" +
      "gle/protobuf/any.proto\"Z\n\024SignatureDescr" +
      "iptors\022B\n\nsignatures\030\001 \003(\0132..cosmos.tx.s" +
      "igning.v1beta1.SignatureDescriptor\"\244\004\n\023S" +
      "ignatureDescriptor\022(\n\npublic_key\030\001 \001(\0132\024" +
      ".google.protobuf.Any\022A\n\004data\030\002 \001(\01323.cos" +
      "mos.tx.signing.v1beta1.SignatureDescript" +
      "or.Data\022\020\n\010sequence\030\003 \001(\004\032\215\003\n\004Data\022L\n\006si" +
      "ngle\030\001 \001(\0132:.cosmos.tx.signing.v1beta1.S" +
      "ignatureDescriptor.Data.SingleH\000\022J\n\005mult" +
      "i\030\002 \001(\01329.cosmos.tx.signing.v1beta1.Sign" +
      "atureDescriptor.Data.MultiH\000\032N\n\006Single\0221" +
      "\n\004mode\030\001 \001(\0162#.cosmos.tx.signing.v1beta1" +
      ".SignMode\022\021\n\tsignature\030\002 \001(\014\032\223\001\n\005Multi\022A" +
      "\n\010bitarray\030\001 \001(\0132/.cosmos.crypto.multisi" +
      "g.v1beta1.CompactBitArray\022G\n\nsignatures\030" +
      "\002 \003(\01323.cosmos.tx.signing.v1beta1.Signat" +
      "ureDescriptor.DataB\005\n\003sum*s\n\010SignMode\022\031\n" +
      "\025SIGN_MODE_UNSPECIFIED\020\000\022\024\n\020SIGN_MODE_DI" +
      "RECT\020\001\022\025\n\021SIGN_MODE_TEXTUAL\020\002\022\037\n\033SIGN_MO" +
      "DE_LEGACY_AMINO_JSON\020\177B1P\001Z-github.com/c" +
      "osmos/cosmos-sdk/types/tx/signingb\006proto" +
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
          cosmos.crypto.multisig.v1beta1.Multisig.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptors_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptors_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptors_descriptor,
        new java.lang.String[] { "Signatures", });
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_descriptor,
        new java.lang.String[] { "PublicKey", "Data", "Sequence", });
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_descriptor =
      internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_descriptor.getNestedTypes().get(0);
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_descriptor,
        new java.lang.String[] { "Single", "Multi", "Sum", });
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_Single_descriptor =
      internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_descriptor.getNestedTypes().get(0);
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_Single_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_Single_descriptor,
        new java.lang.String[] { "Mode", "Signature", });
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_Multi_descriptor =
      internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_descriptor.getNestedTypes().get(1);
    internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_Multi_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_signing_v1beta1_SignatureDescriptor_Data_Multi_descriptor,
        new java.lang.String[] { "Bitarray", "Signatures", });
    cosmos.crypto.multisig.v1beta1.Multisig.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}