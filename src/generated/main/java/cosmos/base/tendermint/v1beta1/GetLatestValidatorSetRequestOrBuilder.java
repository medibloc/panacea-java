// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/tendermint/v1beta1/query.proto

package cosmos.base.tendermint.v1beta1;

public interface GetLatestValidatorSetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * pagination defines an pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines an pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
   */
  cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <pre>
   * pagination defines an pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
   */
  cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
