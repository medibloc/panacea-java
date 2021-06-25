// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/tendermint/v1beta1/query.proto

package cosmos.base.tendermint.v1beta1;

public interface GetLatestValidatorSetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 block_height = 1;</code>
   */
  long getBlockHeight();

  /**
   * <code>repeated .cosmos.base.tendermint.v1beta1.Validator validators = 2;</code>
   */
  java.util.List<cosmos.base.tendermint.v1beta1.Validator> 
      getValidatorsList();
  /**
   * <code>repeated .cosmos.base.tendermint.v1beta1.Validator validators = 2;</code>
   */
  cosmos.base.tendermint.v1beta1.Validator getValidators(int index);
  /**
   * <code>repeated .cosmos.base.tendermint.v1beta1.Validator validators = 2;</code>
   */
  int getValidatorsCount();
  /**
   * <code>repeated .cosmos.base.tendermint.v1beta1.Validator validators = 2;</code>
   */
  java.util.List<? extends cosmos.base.tendermint.v1beta1.ValidatorOrBuilder> 
      getValidatorsOrBuilderList();
  /**
   * <code>repeated .cosmos.base.tendermint.v1beta1.Validator validators = 2;</code>
   */
  cosmos.base.tendermint.v1beta1.ValidatorOrBuilder getValidatorsOrBuilder(
      int index);

  /**
   * <pre>
   * pagination defines an pagination for the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3;</code>
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines an pagination for the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3;</code>
   */
  cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines an pagination for the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3;</code>
   */
  cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
