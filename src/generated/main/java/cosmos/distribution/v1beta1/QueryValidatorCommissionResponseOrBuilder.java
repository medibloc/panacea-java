// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/query.proto

package cosmos.distribution.v1beta1;

public interface QueryValidatorCommissionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.QueryValidatorCommissionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * commission defines the commision the validator received.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasCommission();
  /**
   * <pre>
   * commission defines the commision the validator received.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.distribution.v1beta1.ValidatorAccumulatedCommission getCommission();
  /**
   * <pre>
   * commission defines the commision the validator received.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionOrBuilder getCommissionOrBuilder();
}