// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: did/did.proto

package medibloc.panaceacore.did;

public interface DIDDocumentWithSeqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:medibloc.panaceacore.did.DIDDocumentWithSeq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.medibloc.panaceacore.did.DIDDocument document = 1;</code>
   */
  boolean hasDocument();
  /**
   * <code>.medibloc.panaceacore.did.DIDDocument document = 1;</code>
   */
  medibloc.panaceacore.did.DIDDocument getDocument();
  /**
   * <code>.medibloc.panaceacore.did.DIDDocument document = 1;</code>
   */
  medibloc.panaceacore.did.DIDDocumentOrBuilder getDocumentOrBuilder();

  /**
   * <code>uint64 seq = 2[json_name = "sequence", (.gogoproto.jsontag) = "sequence"];</code>
   */
  long getSeq();
}
