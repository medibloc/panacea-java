// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/vesting/v1beta1/vesting.proto

package cosmos.vesting.v1beta1;

public interface PeriodicVestingAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.vesting.v1beta1.PeriodicVestingAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [(.gogoproto.embed) = true];</code>
   */
  boolean hasBaseVestingAccount();
  /**
   * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [(.gogoproto.embed) = true];</code>
   */
  cosmos.vesting.v1beta1.BaseVestingAccount getBaseVestingAccount();
  /**
   * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [(.gogoproto.embed) = true];</code>
   */
  cosmos.vesting.v1beta1.BaseVestingAccountOrBuilder getBaseVestingAccountOrBuilder();

  /**
   * <code>int64 start_time = 2 [(.gogoproto.moretags) = "yaml:&#92;"start_time&#92;""];</code>
   */
  long getStartTime();

  /**
   * <code>repeated .cosmos.vesting.v1beta1.Period vesting_periods = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_periods&#92;""];</code>
   */
  java.util.List<cosmos.vesting.v1beta1.Period> 
      getVestingPeriodsList();
  /**
   * <code>repeated .cosmos.vesting.v1beta1.Period vesting_periods = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_periods&#92;""];</code>
   */
  cosmos.vesting.v1beta1.Period getVestingPeriods(int index);
  /**
   * <code>repeated .cosmos.vesting.v1beta1.Period vesting_periods = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_periods&#92;""];</code>
   */
  int getVestingPeriodsCount();
  /**
   * <code>repeated .cosmos.vesting.v1beta1.Period vesting_periods = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_periods&#92;""];</code>
   */
  java.util.List<? extends cosmos.vesting.v1beta1.PeriodOrBuilder> 
      getVestingPeriodsOrBuilderList();
  /**
   * <code>repeated .cosmos.vesting.v1beta1.Period vesting_periods = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_periods&#92;""];</code>
   */
  cosmos.vesting.v1beta1.PeriodOrBuilder getVestingPeriodsOrBuilder(
      int index);
}
