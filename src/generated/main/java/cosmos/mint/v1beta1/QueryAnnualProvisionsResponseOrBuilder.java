// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/mint/v1beta1/query.proto

package cosmos.mint.v1beta1;

public interface QueryAnnualProvisionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.mint.v1beta1.QueryAnnualProvisionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * annual_provisions is the current minting annual provisions value.
   * </pre>
   *
   * <code>bytes annual_provisions = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   */
  com.google.protobuf.ByteString getAnnualProvisions();
}