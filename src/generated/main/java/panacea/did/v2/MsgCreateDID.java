// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/tx.proto

package panacea.did.v2;

/**
 * Protobuf type {@code panacea.did.v2.MsgCreateDID}
 */
public  final class MsgCreateDID extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.did.v2.MsgCreateDID)
    MsgCreateDIDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCreateDID.newBuilder() to construct.
  private MsgCreateDID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCreateDID() {
    dID_ = "";
    verificationMethodID_ = "";
    signature_ = com.google.protobuf.ByteString.EMPTY;
    fromAddress_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgCreateDID(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            dID_ = s;
            break;
          }
          case 18: {
            panacea.did.v2.DIDDocument.Builder subBuilder = null;
            if (document_ != null) {
              subBuilder = document_.toBuilder();
            }
            document_ = input.readMessage(panacea.did.v2.DIDDocument.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(document_);
              document_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            verificationMethodID_ = s;
            break;
          }
          case 34: {

            signature_ = input.readBytes();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            fromAddress_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return panacea.did.v2.Tx.internal_static_panacea_did_v2_MsgCreateDID_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return panacea.did.v2.Tx.internal_static_panacea_did_v2_MsgCreateDID_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            panacea.did.v2.MsgCreateDID.class, panacea.did.v2.MsgCreateDID.Builder.class);
  }

  public static final int DID_FIELD_NUMBER = 1;
  private volatile java.lang.Object dID_;
  /**
   * <code>string DID = 1[json_name = "did", (.gogoproto.jsontag) = "did"];</code>
   */
  public java.lang.String getDID() {
    java.lang.Object ref = dID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dID_ = s;
      return s;
    }
  }
  /**
   * <code>string DID = 1[json_name = "did", (.gogoproto.jsontag) = "did"];</code>
   */
  public com.google.protobuf.ByteString
      getDIDBytes() {
    java.lang.Object ref = dID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOCUMENT_FIELD_NUMBER = 2;
  private panacea.did.v2.DIDDocument document_;
  /**
   * <code>.panacea.did.v2.DIDDocument document = 2;</code>
   */
  public boolean hasDocument() {
    return document_ != null;
  }
  /**
   * <code>.panacea.did.v2.DIDDocument document = 2;</code>
   */
  public panacea.did.v2.DIDDocument getDocument() {
    return document_ == null ? panacea.did.v2.DIDDocument.getDefaultInstance() : document_;
  }
  /**
   * <code>.panacea.did.v2.DIDDocument document = 2;</code>
   */
  public panacea.did.v2.DIDDocumentOrBuilder getDocumentOrBuilder() {
    return getDocument();
  }

  public static final int VERIFICATIONMETHODID_FIELD_NUMBER = 3;
  private volatile java.lang.Object verificationMethodID_;
  /**
   * <code>string verificationMethodID = 3[json_name = "verification_method_id", (.gogoproto.jsontag) = "verification_method_id"];</code>
   */
  public java.lang.String getVerificationMethodID() {
    java.lang.Object ref = verificationMethodID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      verificationMethodID_ = s;
      return s;
    }
  }
  /**
   * <code>string verificationMethodID = 3[json_name = "verification_method_id", (.gogoproto.jsontag) = "verification_method_id"];</code>
   */
  public com.google.protobuf.ByteString
      getVerificationMethodIDBytes() {
    java.lang.Object ref = verificationMethodID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      verificationMethodID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIGNATURE_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString signature_;
  /**
   * <code>bytes signature = 4;</code>
   */
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
  }

  public static final int FROMADDRESS_FIELD_NUMBER = 5;
  private volatile java.lang.Object fromAddress_;
  /**
   * <code>string fromAddress = 5[json_name = "from_address", (.gogoproto.jsontag) = "from_address"];</code>
   */
  public java.lang.String getFromAddress() {
    java.lang.Object ref = fromAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string fromAddress = 5[json_name = "from_address", (.gogoproto.jsontag) = "from_address"];</code>
   */
  public com.google.protobuf.ByteString
      getFromAddressBytes() {
    java.lang.Object ref = fromAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getDIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dID_);
    }
    if (document_ != null) {
      output.writeMessage(2, getDocument());
    }
    if (!getVerificationMethodIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, verificationMethodID_);
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(4, signature_);
    }
    if (!getFromAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, fromAddress_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dID_);
    }
    if (document_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDocument());
    }
    if (!getVerificationMethodIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, verificationMethodID_);
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, signature_);
    }
    if (!getFromAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, fromAddress_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof panacea.did.v2.MsgCreateDID)) {
      return super.equals(obj);
    }
    panacea.did.v2.MsgCreateDID other = (panacea.did.v2.MsgCreateDID) obj;

    if (!getDID()
        .equals(other.getDID())) return false;
    if (hasDocument() != other.hasDocument()) return false;
    if (hasDocument()) {
      if (!getDocument()
          .equals(other.getDocument())) return false;
    }
    if (!getVerificationMethodID()
        .equals(other.getVerificationMethodID())) return false;
    if (!getSignature()
        .equals(other.getSignature())) return false;
    if (!getFromAddress()
        .equals(other.getFromAddress())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DID_FIELD_NUMBER;
    hash = (53 * hash) + getDID().hashCode();
    if (hasDocument()) {
      hash = (37 * hash) + DOCUMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDocument().hashCode();
    }
    hash = (37 * hash) + VERIFICATIONMETHODID_FIELD_NUMBER;
    hash = (53 * hash) + getVerificationMethodID().hashCode();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (37 * hash) + FROMADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getFromAddress().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static panacea.did.v2.MsgCreateDID parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.did.v2.MsgCreateDID parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.did.v2.MsgCreateDID parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.did.v2.MsgCreateDID parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.did.v2.MsgCreateDID parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.did.v2.MsgCreateDID parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.did.v2.MsgCreateDID parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.did.v2.MsgCreateDID parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.did.v2.MsgCreateDID parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static panacea.did.v2.MsgCreateDID parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.did.v2.MsgCreateDID parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.did.v2.MsgCreateDID parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(panacea.did.v2.MsgCreateDID prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code panacea.did.v2.MsgCreateDID}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.did.v2.MsgCreateDID)
      panacea.did.v2.MsgCreateDIDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return panacea.did.v2.Tx.internal_static_panacea_did_v2_MsgCreateDID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return panacea.did.v2.Tx.internal_static_panacea_did_v2_MsgCreateDID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              panacea.did.v2.MsgCreateDID.class, panacea.did.v2.MsgCreateDID.Builder.class);
    }

    // Construct using panacea.did.v2.MsgCreateDID.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      dID_ = "";

      if (documentBuilder_ == null) {
        document_ = null;
      } else {
        document_ = null;
        documentBuilder_ = null;
      }
      verificationMethodID_ = "";

      signature_ = com.google.protobuf.ByteString.EMPTY;

      fromAddress_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return panacea.did.v2.Tx.internal_static_panacea_did_v2_MsgCreateDID_descriptor;
    }

    @java.lang.Override
    public panacea.did.v2.MsgCreateDID getDefaultInstanceForType() {
      return panacea.did.v2.MsgCreateDID.getDefaultInstance();
    }

    @java.lang.Override
    public panacea.did.v2.MsgCreateDID build() {
      panacea.did.v2.MsgCreateDID result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public panacea.did.v2.MsgCreateDID buildPartial() {
      panacea.did.v2.MsgCreateDID result = new panacea.did.v2.MsgCreateDID(this);
      result.dID_ = dID_;
      if (documentBuilder_ == null) {
        result.document_ = document_;
      } else {
        result.document_ = documentBuilder_.build();
      }
      result.verificationMethodID_ = verificationMethodID_;
      result.signature_ = signature_;
      result.fromAddress_ = fromAddress_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof panacea.did.v2.MsgCreateDID) {
        return mergeFrom((panacea.did.v2.MsgCreateDID)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(panacea.did.v2.MsgCreateDID other) {
      if (other == panacea.did.v2.MsgCreateDID.getDefaultInstance()) return this;
      if (!other.getDID().isEmpty()) {
        dID_ = other.dID_;
        onChanged();
      }
      if (other.hasDocument()) {
        mergeDocument(other.getDocument());
      }
      if (!other.getVerificationMethodID().isEmpty()) {
        verificationMethodID_ = other.verificationMethodID_;
        onChanged();
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
      }
      if (!other.getFromAddress().isEmpty()) {
        fromAddress_ = other.fromAddress_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      panacea.did.v2.MsgCreateDID parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (panacea.did.v2.MsgCreateDID) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dID_ = "";
    /**
     * <code>string DID = 1[json_name = "did", (.gogoproto.jsontag) = "did"];</code>
     */
    public java.lang.String getDID() {
      java.lang.Object ref = dID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string DID = 1[json_name = "did", (.gogoproto.jsontag) = "did"];</code>
     */
    public com.google.protobuf.ByteString
        getDIDBytes() {
      java.lang.Object ref = dID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string DID = 1[json_name = "did", (.gogoproto.jsontag) = "did"];</code>
     */
    public Builder setDID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string DID = 1[json_name = "did", (.gogoproto.jsontag) = "did"];</code>
     */
    public Builder clearDID() {
      
      dID_ = getDefaultInstance().getDID();
      onChanged();
      return this;
    }
    /**
     * <code>string DID = 1[json_name = "did", (.gogoproto.jsontag) = "did"];</code>
     */
    public Builder setDIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dID_ = value;
      onChanged();
      return this;
    }

    private panacea.did.v2.DIDDocument document_;
    private com.google.protobuf.SingleFieldBuilderV3<
        panacea.did.v2.DIDDocument, panacea.did.v2.DIDDocument.Builder, panacea.did.v2.DIDDocumentOrBuilder> documentBuilder_;
    /**
     * <code>.panacea.did.v2.DIDDocument document = 2;</code>
     */
    public boolean hasDocument() {
      return documentBuilder_ != null || document_ != null;
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 2;</code>
     */
    public panacea.did.v2.DIDDocument getDocument() {
      if (documentBuilder_ == null) {
        return document_ == null ? panacea.did.v2.DIDDocument.getDefaultInstance() : document_;
      } else {
        return documentBuilder_.getMessage();
      }
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 2;</code>
     */
    public Builder setDocument(panacea.did.v2.DIDDocument value) {
      if (documentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        document_ = value;
        onChanged();
      } else {
        documentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 2;</code>
     */
    public Builder setDocument(
        panacea.did.v2.DIDDocument.Builder builderForValue) {
      if (documentBuilder_ == null) {
        document_ = builderForValue.build();
        onChanged();
      } else {
        documentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 2;</code>
     */
    public Builder mergeDocument(panacea.did.v2.DIDDocument value) {
      if (documentBuilder_ == null) {
        if (document_ != null) {
          document_ =
            panacea.did.v2.DIDDocument.newBuilder(document_).mergeFrom(value).buildPartial();
        } else {
          document_ = value;
        }
        onChanged();
      } else {
        documentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 2;</code>
     */
    public Builder clearDocument() {
      if (documentBuilder_ == null) {
        document_ = null;
        onChanged();
      } else {
        document_ = null;
        documentBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 2;</code>
     */
    public panacea.did.v2.DIDDocument.Builder getDocumentBuilder() {
      
      onChanged();
      return getDocumentFieldBuilder().getBuilder();
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 2;</code>
     */
    public panacea.did.v2.DIDDocumentOrBuilder getDocumentOrBuilder() {
      if (documentBuilder_ != null) {
        return documentBuilder_.getMessageOrBuilder();
      } else {
        return document_ == null ?
            panacea.did.v2.DIDDocument.getDefaultInstance() : document_;
      }
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        panacea.did.v2.DIDDocument, panacea.did.v2.DIDDocument.Builder, panacea.did.v2.DIDDocumentOrBuilder> 
        getDocumentFieldBuilder() {
      if (documentBuilder_ == null) {
        documentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            panacea.did.v2.DIDDocument, panacea.did.v2.DIDDocument.Builder, panacea.did.v2.DIDDocumentOrBuilder>(
                getDocument(),
                getParentForChildren(),
                isClean());
        document_ = null;
      }
      return documentBuilder_;
    }

    private java.lang.Object verificationMethodID_ = "";
    /**
     * <code>string verificationMethodID = 3[json_name = "verification_method_id", (.gogoproto.jsontag) = "verification_method_id"];</code>
     */
    public java.lang.String getVerificationMethodID() {
      java.lang.Object ref = verificationMethodID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        verificationMethodID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string verificationMethodID = 3[json_name = "verification_method_id", (.gogoproto.jsontag) = "verification_method_id"];</code>
     */
    public com.google.protobuf.ByteString
        getVerificationMethodIDBytes() {
      java.lang.Object ref = verificationMethodID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        verificationMethodID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string verificationMethodID = 3[json_name = "verification_method_id", (.gogoproto.jsontag) = "verification_method_id"];</code>
     */
    public Builder setVerificationMethodID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      verificationMethodID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string verificationMethodID = 3[json_name = "verification_method_id", (.gogoproto.jsontag) = "verification_method_id"];</code>
     */
    public Builder clearVerificationMethodID() {
      
      verificationMethodID_ = getDefaultInstance().getVerificationMethodID();
      onChanged();
      return this;
    }
    /**
     * <code>string verificationMethodID = 3[json_name = "verification_method_id", (.gogoproto.jsontag) = "verification_method_id"];</code>
     */
    public Builder setVerificationMethodIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      verificationMethodID_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature = 4;</code>
     */
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes signature = 4;</code>
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      signature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature = 4;</code>
     */
    public Builder clearSignature() {
      
      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
    }

    private java.lang.Object fromAddress_ = "";
    /**
     * <code>string fromAddress = 5[json_name = "from_address", (.gogoproto.jsontag) = "from_address"];</code>
     */
    public java.lang.String getFromAddress() {
      java.lang.Object ref = fromAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fromAddress = 5[json_name = "from_address", (.gogoproto.jsontag) = "from_address"];</code>
     */
    public com.google.protobuf.ByteString
        getFromAddressBytes() {
      java.lang.Object ref = fromAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fromAddress = 5[json_name = "from_address", (.gogoproto.jsontag) = "from_address"];</code>
     */
    public Builder setFromAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fromAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fromAddress = 5[json_name = "from_address", (.gogoproto.jsontag) = "from_address"];</code>
     */
    public Builder clearFromAddress() {
      
      fromAddress_ = getDefaultInstance().getFromAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string fromAddress = 5[json_name = "from_address", (.gogoproto.jsontag) = "from_address"];</code>
     */
    public Builder setFromAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fromAddress_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:panacea.did.v2.MsgCreateDID)
  }

  // @@protoc_insertion_point(class_scope:panacea.did.v2.MsgCreateDID)
  private static final panacea.did.v2.MsgCreateDID DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new panacea.did.v2.MsgCreateDID();
  }

  public static panacea.did.v2.MsgCreateDID getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCreateDID>
      PARSER = new com.google.protobuf.AbstractParser<MsgCreateDID>() {
    @java.lang.Override
    public MsgCreateDID parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgCreateDID(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgCreateDID> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCreateDID> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public panacea.did.v2.MsgCreateDID getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

