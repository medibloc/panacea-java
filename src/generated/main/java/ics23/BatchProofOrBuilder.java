// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/proofs.proto

package ics23;

public interface BatchProofOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ics23.BatchProof)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ics23.BatchEntry entries = 1;</code>
   */
  java.util.List<ics23.BatchEntry> 
      getEntriesList();
  /**
   * <code>repeated .ics23.BatchEntry entries = 1;</code>
   */
  ics23.BatchEntry getEntries(int index);
  /**
   * <code>repeated .ics23.BatchEntry entries = 1;</code>
   */
  int getEntriesCount();
  /**
   * <code>repeated .ics23.BatchEntry entries = 1;</code>
   */
  java.util.List<? extends ics23.BatchEntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <code>repeated .ics23.BatchEntry entries = 1;</code>
   */
  ics23.BatchEntryOrBuilder getEntriesOrBuilder(
      int index);
}