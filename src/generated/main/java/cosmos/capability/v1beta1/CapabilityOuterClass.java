// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/capability/v1beta1/capability.proto

package cosmos.capability.v1beta1;

public final class CapabilityOuterClass {
  private CapabilityOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_capability_v1beta1_Capability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_capability_v1beta1_Capability_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_capability_v1beta1_Owner_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_capability_v1beta1_Owner_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_capability_v1beta1_CapabilityOwners_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_capability_v1beta1_CapabilityOwners_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*cosmos/capability/v1beta1/capability.p" +
      "roto\022\031cosmos.capability.v1beta1\032\024gogopro" +
      "to/gogo.proto\"3\n\nCapability\022\037\n\005index\030\001 \001" +
      "(\004B\020\362\336\037\014yaml:\"index\":\004\230\240\037\000\"S\n\005Owner\022!\n\006m" +
      "odule\030\001 \001(\tB\021\362\336\037\ryaml:\"module\"\022\035\n\004name\030\002" +
      " \001(\tB\017\362\336\037\013yaml:\"name\":\010\230\240\037\000\210\240\037\000\"J\n\020Capab" +
      "ilityOwners\0226\n\006owners\030\001 \003(\0132 .cosmos.cap" +
      "ability.v1beta1.OwnerB\004\310\336\037\000B3P\001Z/github." +
      "com/cosmos/cosmos-sdk/x/capability/types" +
      "b\006proto3"
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
    internal_static_cosmos_capability_v1beta1_Capability_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_capability_v1beta1_Capability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_capability_v1beta1_Capability_descriptor,
        new java.lang.String[] { "Index", });
    internal_static_cosmos_capability_v1beta1_Owner_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_capability_v1beta1_Owner_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_capability_v1beta1_Owner_descriptor,
        new java.lang.String[] { "Module", "Name", });
    internal_static_cosmos_capability_v1beta1_CapabilityOwners_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_capability_v1beta1_CapabilityOwners_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_capability_v1beta1_CapabilityOwners_descriptor,
        new java.lang.String[] { "Owners", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    registry.add(com.google.protobuf.GoGoProtos.goprotoStringer);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}