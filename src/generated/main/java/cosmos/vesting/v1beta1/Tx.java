// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/vesting/v1beta1/tx.proto

package cosmos.vesting.v1beta1;

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
    internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccountResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037cosmos/vesting/v1beta1/tx.proto\022\026cosmo" +
      "s.vesting.v1beta1\032\024gogoproto/gogo.proto\032" +
      "\036cosmos/base/v1beta1/coin.proto\"\216\002\n\027MsgC" +
      "reateVestingAccount\022-\n\014from_address\030\001 \001(" +
      "\tB\027\362\336\037\023yaml:\"from_address\"\022)\n\nto_address" +
      "\030\002 \001(\tB\025\362\336\037\021yaml:\"to_address\"\022[\n\006amount\030" +
      "\003 \003(\0132\031.cosmos.base.v1beta1.CoinB0\310\336\037\000\252\337" +
      "\037(github.com/cosmos/cosmos-sdk/types.Coi" +
      "ns\022%\n\010end_time\030\004 \001(\003B\023\362\336\037\017yaml:\"end_time" +
      "\"\022\017\n\007delayed\030\005 \001(\010:\004\350\240\037\001\"!\n\037MsgCreateVes" +
      "tingAccountResponse2\210\001\n\003Msg\022\200\001\n\024CreateVe" +
      "stingAccount\022/.cosmos.vesting.v1beta1.Ms" +
      "gCreateVestingAccount\0327.cosmos.vesting.v" +
      "1beta1.MsgCreateVestingAccountResponseB5" +
      "P\001Z1github.com/cosmos/cosmos-sdk/x/auth/" +
      "vesting/typesb\006proto3"
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
    internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccount_descriptor,
        new java.lang.String[] { "FromAddress", "ToAddress", "Amount", "EndTime", "Delayed", });
    internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccountResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.castrepeated);
    registry.add(com.google.protobuf.GoGoProtos.equal);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    cosmos.base.v1beta1.CoinOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}