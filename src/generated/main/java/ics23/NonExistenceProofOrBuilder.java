// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/proofs.proto

package ics23;

public interface NonExistenceProofOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ics23.NonExistenceProof)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * TODO: remove this as unnecessary??? we prove a range
   * </pre>
   *
   * <code>bytes key = 1;</code>
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>.ics23.ExistenceProof left = 2;</code>
   */
  boolean hasLeft();
  /**
   * <code>.ics23.ExistenceProof left = 2;</code>
   */
  ics23.ExistenceProof getLeft();
  /**
   * <code>.ics23.ExistenceProof left = 2;</code>
   */
  ics23.ExistenceProofOrBuilder getLeftOrBuilder();

  /**
   * <code>.ics23.ExistenceProof right = 3;</code>
   */
  boolean hasRight();
  /**
   * <code>.ics23.ExistenceProof right = 3;</code>
   */
  ics23.ExistenceProof getRight();
  /**
   * <code>.ics23.ExistenceProof right = 3;</code>
   */
  ics23.ExistenceProofOrBuilder getRightOrBuilder();
}