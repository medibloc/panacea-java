// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/v1beta1/coin.proto

package cosmos.base.v1beta1;

public final class CoinOuterClass {
  private CoinOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_v1beta1_Coin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_v1beta1_Coin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_v1beta1_DecCoin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_v1beta1_DecCoin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_v1beta1_IntProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_v1beta1_IntProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_v1beta1_DecProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_v1beta1_DecProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036cosmos/base/v1beta1/coin.proto\022\023cosmos" +
      ".base.v1beta1\032\024gogoproto/gogo.proto\"8\n\004C" +
      "oin\022\r\n\005denom\030\001 \001(\t\022\033\n\006amount\030\002 \001(\tB\013\332\336\037\003" +
      "Int\310\336\037\000:\004\350\240\037\001\";\n\007DecCoin\022\r\n\005denom\030\001 \001(\t\022" +
      "\033\n\006amount\030\002 \001(\tB\013\332\336\037\003Dec\310\336\037\000:\004\350\240\037\001\"$\n\010In" +
      "tProto\022\030\n\003int\030\001 \001(\tB\013\332\336\037\003Int\310\336\037\000\"$\n\010DecP" +
      "roto\022\030\n\003dec\030\001 \001(\tB\013\332\336\037\003Dec\310\336\037\000B.P\001Z\"gith" +
      "ub.com/cosmos/cosmos-sdk/types\330\341\036\000\200\342\036\000b\006" +
      "proto3"
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
    internal_static_cosmos_base_v1beta1_Coin_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_base_v1beta1_Coin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_v1beta1_Coin_descriptor,
        new java.lang.String[] { "Denom", "Amount", });
    internal_static_cosmos_base_v1beta1_DecCoin_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_base_v1beta1_DecCoin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_v1beta1_DecCoin_descriptor,
        new java.lang.String[] { "Denom", "Amount", });
    internal_static_cosmos_base_v1beta1_IntProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_base_v1beta1_IntProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_v1beta1_IntProto_descriptor,
        new java.lang.String[] { "Int", });
    internal_static_cosmos_base_v1beta1_DecProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_base_v1beta1_DecProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_v1beta1_DecProto_descriptor,
        new java.lang.String[] { "Dec", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.customtype);
    registry.add(com.google.protobuf.GoGoProtos.equal);
    registry.add(com.google.protobuf.GoGoProtos.goprotoStringerAll);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    registry.add(com.google.protobuf.GoGoProtos.stringerAll);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}