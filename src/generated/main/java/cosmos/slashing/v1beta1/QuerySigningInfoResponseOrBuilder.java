// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/slashing/v1beta1/query.proto

package cosmos.slashing.v1beta1;

public interface QuerySigningInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.slashing.v1beta1.QuerySigningInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * val_signing_info is the signing info of requested val cons address
   * </pre>
   *
   * <code>.cosmos.slashing.v1beta1.ValidatorSigningInfo val_signing_info = 1 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasValSigningInfo();
  /**
   * <pre>
   * val_signing_info is the signing info of requested val cons address
   * </pre>
   *
   * <code>.cosmos.slashing.v1beta1.ValidatorSigningInfo val_signing_info = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.slashing.v1beta1.ValidatorSigningInfo getValSigningInfo();
  /**
   * <pre>
   * val_signing_info is the signing info of requested val cons address
   * </pre>
   *
   * <code>.cosmos.slashing.v1beta1.ValidatorSigningInfo val_signing_info = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.slashing.v1beta1.ValidatorSigningInfoOrBuilder getValSigningInfoOrBuilder();
}
