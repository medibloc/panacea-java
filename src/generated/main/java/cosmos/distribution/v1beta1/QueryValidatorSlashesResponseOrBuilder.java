// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/query.proto

package cosmos.distribution.v1beta1;

public interface QueryValidatorSlashesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.QueryValidatorSlashesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * slashes defines the slashes the validator received.
   * </pre>
   *
   * <code>repeated .cosmos.distribution.v1beta1.ValidatorSlashEvent slashes = 1 [(.gogoproto.nullable) = false];</code>
   */
  java.util.List<cosmos.distribution.v1beta1.ValidatorSlashEvent> 
      getSlashesList();
  /**
   * <pre>
   * slashes defines the slashes the validator received.
   * </pre>
   *
   * <code>repeated .cosmos.distribution.v1beta1.ValidatorSlashEvent slashes = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.distribution.v1beta1.ValidatorSlashEvent getSlashes(int index);
  /**
   * <pre>
   * slashes defines the slashes the validator received.
   * </pre>
   *
   * <code>repeated .cosmos.distribution.v1beta1.ValidatorSlashEvent slashes = 1 [(.gogoproto.nullable) = false];</code>
   */
  int getSlashesCount();
  /**
   * <pre>
   * slashes defines the slashes the validator received.
   * </pre>
   *
   * <code>repeated .cosmos.distribution.v1beta1.ValidatorSlashEvent slashes = 1 [(.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends cosmos.distribution.v1beta1.ValidatorSlashEventOrBuilder> 
      getSlashesOrBuilderList();
  /**
   * <pre>
   * slashes defines the slashes the validator received.
   * </pre>
   *
   * <code>repeated .cosmos.distribution.v1beta1.ValidatorSlashEvent slashes = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.distribution.v1beta1.ValidatorSlashEventOrBuilder getSlashesOrBuilder(
      int index);

  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
