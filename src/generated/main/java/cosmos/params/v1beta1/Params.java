// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/params/v1beta1/params.proto

package cosmos.params.v1beta1;

public final class Params {
  private Params() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_params_v1beta1_ParameterChangeProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_params_v1beta1_ParameterChangeProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_params_v1beta1_ParamChange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_params_v1beta1_ParamChange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"cosmos/params/v1beta1/params.proto\022\025co" +
      "smos.params.v1beta1\032\024gogoproto/gogo.prot" +
      "o\"\202\001\n\027ParameterChangeProposal\022\r\n\005title\030\001" +
      " \001(\t\022\023\n\013description\030\002 \001(\t\0229\n\007changes\030\003 \003" +
      "(\0132\".cosmos.params.v1beta1.ParamChangeB\004" +
      "\310\336\037\000:\010\210\240\037\000\230\240\037\000\"A\n\013ParamChange\022\020\n\010subspac" +
      "e\030\001 \001(\t\022\013\n\003key\030\002 \001(\t\022\r\n\005value\030\003 \001(\t:\004\230\240\037" +
      "\000B<P\001Z4github.com/cosmos/cosmos-sdk/x/pa" +
      "rams/types/proposal\250\342\036\001b\006proto3"
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
    internal_static_cosmos_params_v1beta1_ParameterChangeProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_params_v1beta1_ParameterChangeProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_params_v1beta1_ParameterChangeProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Changes", });
    internal_static_cosmos_params_v1beta1_ParamChange_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_params_v1beta1_ParamChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_params_v1beta1_ParamChange_descriptor,
        new java.lang.String[] { "Subspace", "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.equalAll);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    registry.add(com.google.protobuf.GoGoProtos.goprotoStringer);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}