// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/evidence/v1beta1/evidence.proto

package cosmos.evidence.v1beta1;

public final class Evidence {
  private Evidence() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_evidence_v1beta1_Equivocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_evidence_v1beta1_Equivocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&cosmos/evidence/v1beta1/evidence.proto" +
      "\022\027cosmos.evidence.v1beta1\032\024gogoproto/gog" +
      "o.proto\032\037google/protobuf/timestamp.proto" +
      "\"\250\001\n\014Equivocation\022\016\n\006height\030\001 \001(\003\0222\n\004tim" +
      "e\030\002 \001(\0132\032.google.protobuf.TimestampB\010\310\336\037" +
      "\000\220\337\037\001\022\r\n\005power\030\003 \001(\003\0227\n\021consensus_addres" +
      "s\030\004 \001(\tB\034\362\336\037\030yaml:\"consensus_address\":\014\230" +
      "\240\037\000\210\240\037\000\350\240\037\000B5P\001Z-github.com/cosmos/cosmo" +
      "s-sdk/x/evidence/types\250\342\036\001b\006proto3"
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
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_cosmos_evidence_v1beta1_Equivocation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_evidence_v1beta1_Equivocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_evidence_v1beta1_Equivocation_descriptor,
        new java.lang.String[] { "Height", "Time", "Power", "ConsensusAddress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.equal);
    registry.add(com.google.protobuf.GoGoProtos.equalAll);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    registry.add(com.google.protobuf.GoGoProtos.goprotoStringer);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    registry.add(com.google.protobuf.GoGoProtos.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}