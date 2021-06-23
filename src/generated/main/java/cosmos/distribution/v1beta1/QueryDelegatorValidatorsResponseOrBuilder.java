// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/query.proto

package cosmos.distribution.v1beta1;

public interface QueryDelegatorValidatorsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * validators defines the validators a delegator is delegating for.
   * </pre>
   *
   * <code>repeated string validators = 1;</code>
   */
  java.util.List<java.lang.String>
      getValidatorsList();
  /**
   * <pre>
   * validators defines the validators a delegator is delegating for.
   * </pre>
   *
   * <code>repeated string validators = 1;</code>
   */
  int getValidatorsCount();
  /**
   * <pre>
   * validators defines the validators a delegator is delegating for.
   * </pre>
   *
   * <code>repeated string validators = 1;</code>
   */
  java.lang.String getValidators(int index);
  /**
   * <pre>
   * validators defines the validators a delegator is delegating for.
   * </pre>
   *
   * <code>repeated string validators = 1;</code>
   */
  com.google.protobuf.ByteString
      getValidatorsBytes(int index);
}