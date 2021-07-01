// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/genesis.proto

package cosmos.distribution.v1beta1;

public final class Genesis {
  private Genesis() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_DelegatorWithdrawInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_DelegatorWithdrawInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewardsRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewardsRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommissionRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommissionRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewardsRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewardsRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewardsRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewardsRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfoRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfoRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEventRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorSlashEventRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)cosmos/distribution/v1beta1/genesis.pr" +
      "oto\022\033cosmos.distribution.v1beta1\032\024gogopr" +
      "oto/gogo.proto\032\036cosmos/base/v1beta1/coin" +
      ".proto\032.cosmos/distribution/v1beta1/dist" +
      "ribution.proto\"\221\001\n\025DelegatorWithdrawInfo" +
      "\0227\n\021delegator_address\030\001 \001(\tB\034\362\336\037\030yaml:\"d" +
      "elegator_address\"\0225\n\020withdraw_address\030\002 " +
      "\001(\tB\033\362\336\037\027yaml:\"withdraw_address\":\010\350\240\037\000\210\240" +
      "\037\000\"\365\001\n!ValidatorOutstandingRewardsRecord" +
      "\0227\n\021validator_address\030\001 \001(\tB\034\362\336\037\030yaml:\"v" +
      "alidator_address\"\022\214\001\n\023outstanding_reward" +
      "s\030\002 \003(\0132\034.cosmos.base.v1beta1.DecCoinBQ\252" +
      "\337\037+github.com/cosmos/cosmos-sdk/types.De" +
      "cCoins\310\336\037\000\362\336\037\032yaml:\"outstanding_rewards\"" +
      ":\010\350\240\037\000\210\240\037\000\"\327\001\n$ValidatorAccumulatedCommi" +
      "ssionRecord\0227\n\021validator_address\030\001 \001(\tB\034" +
      "\362\336\037\030yaml:\"validator_address\"\022l\n\013accumula" +
      "ted\030\002 \001(\0132;.cosmos.distribution.v1beta1." +
      "ValidatorAccumulatedCommissionB\032\310\336\037\000\362\336\037\022" +
      "yaml:\"accumulated\":\010\350\240\037\000\210\240\037\000\"\327\001\n Validat" +
      "orHistoricalRewardsRecord\0227\n\021validator_a" +
      "ddress\030\001 \001(\tB\034\362\336\037\030yaml:\"validator_addres" +
      "s\"\022\016\n\006period\030\002 \001(\004\022`\n\007rewards\030\003 \001(\01327.co" +
      "smos.distribution.v1beta1.ValidatorHisto" +
      "ricalRewardsB\026\310\336\037\000\362\336\037\016yaml:\"rewards\":\010\350\240" +
      "\037\000\210\240\037\000\"\301\001\n\035ValidatorCurrentRewardsRecord" +
      "\0227\n\021validator_address\030\001 \001(\tB\034\362\336\037\030yaml:\"v" +
      "alidator_address\"\022]\n\007rewards\030\002 \001(\01324.cos" +
      "mos.distribution.v1beta1.ValidatorCurren" +
      "tRewardsB\026\310\336\037\000\362\336\037\016yaml:\"rewards\":\010\350\240\037\000\210\240" +
      "\037\000\"\202\002\n\033DelegatorStartingInfoRecord\0227\n\021de" +
      "legator_address\030\001 \001(\tB\034\362\336\037\030yaml:\"delegat" +
      "or_address\"\0227\n\021validator_address\030\002 \001(\tB\034" +
      "\362\336\037\030yaml:\"validator_address\"\022g\n\rstarting" +
      "_info\030\003 \001(\01322.cosmos.distribution.v1beta" +
      "1.DelegatorStartingInfoB\034\310\336\037\000\362\336\037\024yaml:\"s" +
      "tarting_info\":\010\350\240\037\000\210\240\037\000\"\345\001\n\031ValidatorSla" +
      "shEventRecord\0227\n\021validator_address\030\001 \001(\t" +
      "B\034\362\336\037\030yaml:\"validator_address\"\022\016\n\006height" +
      "\030\002 \001(\004\022\016\n\006period\030\003 \001(\004\022e\n\025validator_slas" +
      "h_event\030\004 \001(\01320.cosmos.distribution.v1be" +
      "ta1.ValidatorSlashEventB\024\310\336\037\000\362\336\037\014yaml:\"e" +
      "vent\":\010\350\240\037\000\210\240\037\000\"\261\t\n\014GenesisState\022J\n\006para" +
      "ms\030\001 \001(\0132#.cosmos.distribution.v1beta1.P" +
      "aramsB\025\310\336\037\000\362\336\037\ryaml:\"params\"\022O\n\010fee_pool" +
      "\030\002 \001(\0132$.cosmos.distribution.v1beta1.Fee" +
      "PoolB\027\310\336\037\000\362\336\037\017yaml:\"fee_pool\"\022}\n\030delegat" +
      "or_withdraw_infos\030\003 \003(\01322.cosmos.distrib" +
      "ution.v1beta1.DelegatorWithdrawInfoB\'\310\336\037" +
      "\000\362\336\037\037yaml:\"delegator_withdraw_infos\"\0227\n\021" +
      "previous_proposer\030\004 \001(\tB\034\362\336\037\030yaml:\"previ" +
      "ous_proposer\"\022\177\n\023outstanding_rewards\030\005 \003" +
      "(\0132>.cosmos.distribution.v1beta1.Validat" +
      "orOutstandingRewardsRecordB\"\310\336\037\000\362\336\037\032yaml" +
      ":\"outstanding_rewards\"\022\236\001\n!validator_acc" +
      "umulated_commissions\030\006 \003(\0132A.cosmos.dist" +
      "ribution.v1beta1.ValidatorAccumulatedCom" +
      "missionRecordB0\310\336\037\000\362\336\037(yaml:\"validator_a" +
      "ccumulated_commissions\"\022\220\001\n\034validator_hi" +
      "storical_rewards\030\007 \003(\0132=.cosmos.distribu" +
      "tion.v1beta1.ValidatorHistoricalRewardsR" +
      "ecordB+\310\336\037\000\362\336\037#yaml:\"validator_historica" +
      "l_rewards\"\022\207\001\n\031validator_current_rewards" +
      "\030\010 \003(\0132:.cosmos.distribution.v1beta1.Val" +
      "idatorCurrentRewardsRecordB(\310\336\037\000\362\336\037 yaml" +
      ":\"validator_current_rewards\"\022\203\001\n\030delegat" +
      "or_starting_infos\030\t \003(\01328.cosmos.distrib" +
      "ution.v1beta1.DelegatorStartingInfoRecor" +
      "dB\'\310\336\037\000\362\336\037\037yaml:\"delegator_starting_info" +
      "s\"\022}\n\026validator_slash_events\030\n \003(\01326.cos" +
      "mos.distribution.v1beta1.ValidatorSlashE" +
      "ventRecordB%\310\336\037\000\362\336\037\035yaml:\"validator_slas" +
      "h_events\":\010\350\240\037\000\210\240\037\000B9P\001Z1github.com/cosm" +
      "os/cosmos-sdk/x/distribution/types\250\342\036\001b\006" +
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
          cosmos.base.v1beta1.CoinOuterClass.getDescriptor(),
          cosmos.distribution.v1beta1.Distribution.getDescriptor(),
        }, assigner);
    internal_static_cosmos_distribution_v1beta1_DelegatorWithdrawInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_distribution_v1beta1_DelegatorWithdrawInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_DelegatorWithdrawInfo_descriptor,
        new java.lang.String[] { "DelegatorAddress", "WithdrawAddress", });
    internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewardsRecord_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewardsRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewardsRecord_descriptor,
        new java.lang.String[] { "ValidatorAddress", "OutstandingRewards", });
    internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommissionRecord_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommissionRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommissionRecord_descriptor,
        new java.lang.String[] { "ValidatorAddress", "Accumulated", });
    internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewardsRecord_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewardsRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewardsRecord_descriptor,
        new java.lang.String[] { "ValidatorAddress", "Period", "Rewards", });
    internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewardsRecord_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewardsRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewardsRecord_descriptor,
        new java.lang.String[] { "ValidatorAddress", "Rewards", });
    internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfoRecord_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfoRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfoRecord_descriptor,
        new java.lang.String[] { "DelegatorAddress", "ValidatorAddress", "StartingInfo", });
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEventRecord_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEventRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorSlashEventRecord_descriptor,
        new java.lang.String[] { "ValidatorAddress", "Height", "Period", "ValidatorSlashEvent", });
    internal_static_cosmos_distribution_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_distribution_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "FeePool", "DelegatorWithdrawInfos", "PreviousProposer", "OutstandingRewards", "ValidatorAccumulatedCommissions", "ValidatorHistoricalRewards", "ValidatorCurrentRewards", "DelegatorStartingInfos", "ValidatorSlashEvents", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.castrepeated);
    registry.add(com.google.protobuf.GoGoProtos.equal);
    registry.add(com.google.protobuf.GoGoProtos.equalAll);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    cosmos.base.v1beta1.CoinOuterClass.getDescriptor();
    cosmos.distribution.v1beta1.Distribution.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
