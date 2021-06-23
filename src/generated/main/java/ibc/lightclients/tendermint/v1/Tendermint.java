// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/tendermint/v1/tendermint.proto

package ibc.lightclients.tendermint.v1;

public final class Tendermint {
  private Tendermint() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_lightclients_tendermint_v1_ClientState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_lightclients_tendermint_v1_ClientState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_lightclients_tendermint_v1_ConsensusState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_lightclients_tendermint_v1_ConsensusState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_lightclients_tendermint_v1_Misbehaviour_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_lightclients_tendermint_v1_Misbehaviour_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_lightclients_tendermint_v1_Header_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_lightclients_tendermint_v1_Header_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_lightclients_tendermint_v1_Fraction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_lightclients_tendermint_v1_Fraction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/ibc/lightclients/tendermint/v1/tenderm" +
      "int.proto\022\036ibc.lightclients.tendermint.v" +
      "1\032 tendermint/types/validator.proto\032\034ten" +
      "dermint/types/types.proto\032\023confio/proofs" +
      ".proto\032\036google/protobuf/duration.proto\032\037" +
      "google/protobuf/timestamp.proto\032\037ibc/cor" +
      "e/client/v1/client.proto\032\'ibc/core/commi" +
      "tment/v1/commitment.proto\032\024gogoproto/gog" +
      "o.proto\"\270\006\n\013ClientState\022\020\n\010chain_id\030\001 \001(" +
      "\t\022Y\n\013trust_level\030\002 \001(\0132(.ibc.lightclient" +
      "s.tendermint.v1.FractionB\032\310\336\037\000\362\336\037\022yaml:\"" +
      "trust_level\"\022V\n\017trusting_period\030\003 \001(\0132\031." +
      "google.protobuf.DurationB\"\310\336\037\000\230\337\037\001\362\336\037\026ya" +
      "ml:\"trusting_period\"\022X\n\020unbonding_period" +
      "\030\004 \001(\0132\031.google.protobuf.DurationB#\310\336\037\000\230" +
      "\337\037\001\362\336\037\027yaml:\"unbonding_period\"\022V\n\017max_cl" +
      "ock_drift\030\005 \001(\0132\031.google.protobuf.Durati" +
      "onB\"\310\336\037\000\230\337\037\001\362\336\037\026yaml:\"max_clock_drift\"\022O" +
      "\n\rfrozen_height\030\006 \001(\0132\032.ibc.core.client." +
      "v1.HeightB\034\310\336\037\000\362\336\037\024yaml:\"frozen_height\"\022" +
      "O\n\rlatest_height\030\007 \001(\0132\032.ibc.core.client" +
      ".v1.HeightB\034\310\336\037\000\362\336\037\024yaml:\"latest_height\"" +
      "\022=\n\013proof_specs\030\010 \003(\0132\020.ics23.ProofSpecB" +
      "\026\362\336\037\022yaml:\"proof_specs\"\022-\n\014upgrade_path\030" +
      "\t \003(\tB\027\362\336\037\023yaml:\"upgrade_path\"\022G\n\031allow_" +
      "update_after_expiry\030\n \001(\010B$\362\336\037 yaml:\"all" +
      "ow_update_after_expiry\"\022S\n\037allow_update_" +
      "after_misbehaviour\030\013 \001(\010B*\362\336\037&yaml:\"allo" +
      "w_update_after_misbehaviour\":\004\210\240\037\000\"\376\001\n\016C" +
      "onsensusState\0227\n\ttimestamp\030\001 \001(\0132\032.googl" +
      "e.protobuf.TimestampB\010\310\336\037\000\220\337\037\001\0226\n\004root\030\002" +
      " \001(\0132\".ibc.core.commitment.v1.MerkleRoot" +
      "B\004\310\336\037\000\022u\n\024next_validators_hash\030\003 \001(\014BW\372\336" +
      "\0374github.com/tendermint/tendermint/libs/" +
      "bytes.HexBytes\362\336\037\033yaml:\"next_validators_" +
      "hash\":\004\210\240\037\000\"\361\001\n\014Misbehaviour\022\'\n\tclient_i" +
      "d\030\001 \001(\tB\024\362\336\037\020yaml:\"client_id\"\022X\n\010header_" +
      "1\030\002 \001(\0132&.ibc.lightclients.tendermint.v1" +
      ".HeaderB\036\342\336\037\007Header1\362\336\037\017yaml:\"header_1\"\022" +
      "X\n\010header_2\030\003 \001(\0132&.ibc.lightclients.ten" +
      "dermint.v1.HeaderB\036\342\336\037\007Header2\362\336\037\017yaml:\"" +
      "header_2\":\004\210\240\037\000\"\334\002\n\006Header\022S\n\rsigned_hea" +
      "der\030\001 \001(\0132\036.tendermint.types.SignedHeade" +
      "rB\034\320\336\037\001\362\336\037\024yaml:\"signed_header\"\022O\n\rvalid" +
      "ator_set\030\002 \001(\0132\036.tendermint.types.Valida" +
      "torSetB\030\362\336\037\024yaml:\"validator_set\"\022Q\n\016trus" +
      "ted_height\030\003 \001(\0132\032.ibc.core.client.v1.He" +
      "ightB\035\310\336\037\000\362\336\037\025yaml:\"trusted_height\"\022Y\n\022t" +
      "rusted_validators\030\004 \001(\0132\036.tendermint.typ" +
      "es.ValidatorSetB\035\362\336\037\031yaml:\"trusted_valid" +
      "ators\"\"2\n\010Fraction\022\021\n\tnumerator\030\001 \001(\004\022\023\n" +
      "\013denominator\030\002 \001(\004BHP\001ZDgithub.com/cosmo" +
      "s/cosmos-sdk/x/ibc/light-clients/07-tend" +
      "ermint/typesb\006proto3"
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
          tendermint.types.ValidatorOuterClass.getDescriptor(),
          tendermint.types.Types.getDescriptor(),
          ics23.Proofs.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          ibc.core.client.v1.Client.getDescriptor(),
          ibc.core.commitment.v1.Commitment.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
        }, assigner);
    internal_static_ibc_lightclients_tendermint_v1_ClientState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_lightclients_tendermint_v1_ClientState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_lightclients_tendermint_v1_ClientState_descriptor,
        new java.lang.String[] { "ChainId", "TrustLevel", "TrustingPeriod", "UnbondingPeriod", "MaxClockDrift", "FrozenHeight", "LatestHeight", "ProofSpecs", "UpgradePath", "AllowUpdateAfterExpiry", "AllowUpdateAfterMisbehaviour", });
    internal_static_ibc_lightclients_tendermint_v1_ConsensusState_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_lightclients_tendermint_v1_ConsensusState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_lightclients_tendermint_v1_ConsensusState_descriptor,
        new java.lang.String[] { "Timestamp", "Root", "NextValidatorsHash", });
    internal_static_ibc_lightclients_tendermint_v1_Misbehaviour_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ibc_lightclients_tendermint_v1_Misbehaviour_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_lightclients_tendermint_v1_Misbehaviour_descriptor,
        new java.lang.String[] { "ClientId", "Header1", "Header2", });
    internal_static_ibc_lightclients_tendermint_v1_Header_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ibc_lightclients_tendermint_v1_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_lightclients_tendermint_v1_Header_descriptor,
        new java.lang.String[] { "SignedHeader", "ValidatorSet", "TrustedHeight", "TrustedValidators", });
    internal_static_ibc_lightclients_tendermint_v1_Fraction_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ibc_lightclients_tendermint_v1_Fraction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_lightclients_tendermint_v1_Fraction_descriptor,
        new java.lang.String[] { "Numerator", "Denominator", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.casttype);
    registry.add(com.google.protobuf.GoGoProtos.customname);
    registry.add(com.google.protobuf.GoGoProtos.embed);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    registry.add(com.google.protobuf.GoGoProtos.stdduration);
    registry.add(com.google.protobuf.GoGoProtos.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    tendermint.types.ValidatorOuterClass.getDescriptor();
    tendermint.types.Types.getDescriptor();
    ics23.Proofs.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    ibc.core.client.v1.Client.getDescriptor();
    ibc.core.commitment.v1.Commitment.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
