// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/auth/v1beta1/query.proto

package cosmos.auth.v1beta1;

public interface QueryAccountResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.auth.v1beta1.QueryAccountResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * account defines the account of the corresponding address.
   * </pre>
   *
   * <code>.google.protobuf.Any account = 1 [(.cosmos_proto.accepts_interface) = "AccountI"];</code>
   */
  boolean hasAccount();
  /**
   * <pre>
   * account defines the account of the corresponding address.
   * </pre>
   *
   * <code>.google.protobuf.Any account = 1 [(.cosmos_proto.accepts_interface) = "AccountI"];</code>
   */
  com.google.protobuf.Any getAccount();
  /**
   * <pre>
   * account defines the account of the corresponding address.
   * </pre>
   *
   * <code>.google.protobuf.Any account = 1 [(.cosmos_proto.accepts_interface) = "AccountI"];</code>
   */
  com.google.protobuf.AnyOrBuilder getAccountOrBuilder();
}
