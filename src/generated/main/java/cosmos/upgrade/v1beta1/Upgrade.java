// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/upgrade/v1beta1/upgrade.proto

package cosmos.upgrade.v1beta1;

public final class Upgrade {
  private Upgrade() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_upgrade_v1beta1_Plan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_upgrade_v1beta1_Plan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_upgrade_v1beta1_CancelSoftwareUpgradeProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_upgrade_v1beta1_CancelSoftwareUpgradeProposal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$cosmos/upgrade/v1beta1/upgrade.proto\022\026" +
      "cosmos.upgrade.v1beta1\032\031google/protobuf/" +
      "any.proto\032\024gogoproto/gogo.proto\032\037google/" +
      "protobuf/timestamp.proto\"\303\001\n\004Plan\022\014\n\004nam" +
      "e\030\001 \001(\t\0222\n\004time\030\002 \001(\0132\032.google.protobuf." +
      "TimestampB\010\220\337\037\001\310\336\037\000\022\016\n\006height\030\003 \001(\003\022\014\n\004i" +
      "nfo\030\004 \001(\t\022U\n\025upgraded_client_state\030\005 \001(\013" +
      "2\024.google.protobuf.AnyB \362\336\037\034yaml:\"upgrad" +
      "ed_client_state\":\004\350\240\037\001\"u\n\027SoftwareUpgrad" +
      "eProposal\022\r\n\005title\030\001 \001(\t\022\023\n\013description\030" +
      "\002 \001(\t\0220\n\004plan\030\003 \001(\0132\034.cosmos.upgrade.v1b" +
      "eta1.PlanB\004\310\336\037\000:\004\350\240\037\001\"I\n\035CancelSoftwareU" +
      "pgradeProposal\022\r\n\005title\030\001 \001(\t\022\023\n\013descrip" +
      "tion\030\002 \001(\t:\004\350\240\037\001B8P\001Z,github.com/cosmos/" +
      "cosmos-sdk/x/upgrade/types\330\341\036\000\310\341\036\000b\006prot" +
      "o3"
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
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_cosmos_upgrade_v1beta1_Plan_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_upgrade_v1beta1_Plan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_upgrade_v1beta1_Plan_descriptor,
        new java.lang.String[] { "Name", "Time", "Height", "Info", "UpgradedClientState", });
    internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Plan", });
    internal_static_cosmos_upgrade_v1beta1_CancelSoftwareUpgradeProposal_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_upgrade_v1beta1_CancelSoftwareUpgradeProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_upgrade_v1beta1_CancelSoftwareUpgradeProposal_descriptor,
        new java.lang.String[] { "Title", "Description", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.equal);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf.GoGoProtos.goprotoStringerAll);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    registry.add(com.google.protobuf.GoGoProtos.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}