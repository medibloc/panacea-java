// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/aol/v2/writer.proto

package panacea.aol.v2;

public final class WriterOuterClass {
  private WriterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_aol_v2_Writer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_aol_v2_Writer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033panacea/aol/v2/writer.proto\022\016panacea.a" +
      "ol.v2\032\024gogoproto/gogo.proto\"E\n\006Writer\022\017\n" +
      "\007moniker\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022\025\n\rn" +
      "anoTimestamp\030\003 \001(\003B0P\001Z,github.com/medib" +
      "loc/panacea-core/x/aol/typesb\006proto3"
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
    internal_static_panacea_aol_v2_Writer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_panacea_aol_v2_Writer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_aol_v2_Writer_descriptor,
        new java.lang.String[] { "Moniker", "Description", "NanoTimestamp", });
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
