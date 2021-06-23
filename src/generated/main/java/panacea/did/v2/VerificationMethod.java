// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/did.proto

package panacea.did.v2;

/**
 * Protobuf type {@code panacea.did.v2.VerificationMethod}
 */
public  final class VerificationMethod extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.did.v2.VerificationMethod)
    VerificationMethodOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VerificationMethod.newBuilder() to construct.
  private VerificationMethod(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VerificationMethod() {
    iD_ = "";
    type_ = "";
    controller_ = "";
    pubKeyBase58_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VerificationMethod(
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

            iD_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            controller_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            pubKeyBase58_ = s;
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
    return panacea.did.v2.Did.internal_static_panacea_did_v2_VerificationMethod_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return panacea.did.v2.Did.internal_static_panacea_did_v2_VerificationMethod_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            panacea.did.v2.VerificationMethod.class, panacea.did.v2.VerificationMethod.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object iD_;
  /**
   * <code>string ID = 1[json_name = "id", (.gogoproto.jsontag) = "id"];</code>
   */
  public java.lang.String getID() {
    java.lang.Object ref = iD_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iD_ = s;
      return s;
    }
  }
  /**
   * <code>string ID = 1[json_name = "id", (.gogoproto.jsontag) = "id"];</code>
   */
  public com.google.protobuf.ByteString
      getIDBytes() {
    java.lang.Object ref = iD_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iD_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 2;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTROLLER_FIELD_NUMBER = 3;
  private volatile java.lang.Object controller_;
  /**
   * <code>string controller = 3;</code>
   */
  public java.lang.String getController() {
    java.lang.Object ref = controller_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      controller_ = s;
      return s;
    }
  }
  /**
   * <code>string controller = 3;</code>
   */
  public com.google.protobuf.ByteString
      getControllerBytes() {
    java.lang.Object ref = controller_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      controller_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBKEYBASE58_FIELD_NUMBER = 4;
  private volatile java.lang.Object pubKeyBase58_;
  /**
   * <code>string pubKeyBase58 = 4[json_name = "publicKeyBase58", (.gogoproto.jsontag) = "publicKeyBase58"];</code>
   */
  public java.lang.String getPubKeyBase58() {
    java.lang.Object ref = pubKeyBase58_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pubKeyBase58_ = s;
      return s;
    }
  }
  /**
   * <code>string pubKeyBase58 = 4[json_name = "publicKeyBase58", (.gogoproto.jsontag) = "publicKeyBase58"];</code>
   */
  public com.google.protobuf.ByteString
      getPubKeyBase58Bytes() {
    java.lang.Object ref = pubKeyBase58_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pubKeyBase58_ = b;
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
    if (!getIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, iD_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    if (!getControllerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, controller_);
    }
    if (!getPubKeyBase58Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pubKeyBase58_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, iD_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    if (!getControllerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, controller_);
    }
    if (!getPubKeyBase58Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pubKeyBase58_);
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
    if (!(obj instanceof panacea.did.v2.VerificationMethod)) {
      return super.equals(obj);
    }
    panacea.did.v2.VerificationMethod other = (panacea.did.v2.VerificationMethod) obj;

    if (!getID()
        .equals(other.getID())) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (!getController()
        .equals(other.getController())) return false;
    if (!getPubKeyBase58()
        .equals(other.getPubKeyBase58())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getID().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + CONTROLLER_FIELD_NUMBER;
    hash = (53 * hash) + getController().hashCode();
    hash = (37 * hash) + PUBKEYBASE58_FIELD_NUMBER;
    hash = (53 * hash) + getPubKeyBase58().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static panacea.did.v2.VerificationMethod parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.did.v2.VerificationMethod parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.did.v2.VerificationMethod parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.did.v2.VerificationMethod parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.did.v2.VerificationMethod parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.did.v2.VerificationMethod parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.did.v2.VerificationMethod parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.did.v2.VerificationMethod parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.did.v2.VerificationMethod parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static panacea.did.v2.VerificationMethod parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.did.v2.VerificationMethod parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.did.v2.VerificationMethod parseFrom(
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
  public static Builder newBuilder(panacea.did.v2.VerificationMethod prototype) {
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
   * Protobuf type {@code panacea.did.v2.VerificationMethod}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.did.v2.VerificationMethod)
      panacea.did.v2.VerificationMethodOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return panacea.did.v2.Did.internal_static_panacea_did_v2_VerificationMethod_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return panacea.did.v2.Did.internal_static_panacea_did_v2_VerificationMethod_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              panacea.did.v2.VerificationMethod.class, panacea.did.v2.VerificationMethod.Builder.class);
    }

    // Construct using panacea.did.v2.VerificationMethod.newBuilder()
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
      iD_ = "";

      type_ = "";

      controller_ = "";

      pubKeyBase58_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return panacea.did.v2.Did.internal_static_panacea_did_v2_VerificationMethod_descriptor;
    }

    @java.lang.Override
    public panacea.did.v2.VerificationMethod getDefaultInstanceForType() {
      return panacea.did.v2.VerificationMethod.getDefaultInstance();
    }

    @java.lang.Override
    public panacea.did.v2.VerificationMethod build() {
      panacea.did.v2.VerificationMethod result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public panacea.did.v2.VerificationMethod buildPartial() {
      panacea.did.v2.VerificationMethod result = new panacea.did.v2.VerificationMethod(this);
      result.iD_ = iD_;
      result.type_ = type_;
      result.controller_ = controller_;
      result.pubKeyBase58_ = pubKeyBase58_;
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
      if (other instanceof panacea.did.v2.VerificationMethod) {
        return mergeFrom((panacea.did.v2.VerificationMethod)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(panacea.did.v2.VerificationMethod other) {
      if (other == panacea.did.v2.VerificationMethod.getDefaultInstance()) return this;
      if (!other.getID().isEmpty()) {
        iD_ = other.iD_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getController().isEmpty()) {
        controller_ = other.controller_;
        onChanged();
      }
      if (!other.getPubKeyBase58().isEmpty()) {
        pubKeyBase58_ = other.pubKeyBase58_;
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
      panacea.did.v2.VerificationMethod parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (panacea.did.v2.VerificationMethod) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object iD_ = "";
    /**
     * <code>string ID = 1[json_name = "id", (.gogoproto.jsontag) = "id"];</code>
     */
    public java.lang.String getID() {
      java.lang.Object ref = iD_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iD_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ID = 1[json_name = "id", (.gogoproto.jsontag) = "id"];</code>
     */
    public com.google.protobuf.ByteString
        getIDBytes() {
      java.lang.Object ref = iD_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iD_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ID = 1[json_name = "id", (.gogoproto.jsontag) = "id"];</code>
     */
    public Builder setID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      iD_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ID = 1[json_name = "id", (.gogoproto.jsontag) = "id"];</code>
     */
    public Builder clearID() {
      
      iD_ = getDefaultInstance().getID();
      onChanged();
      return this;
    }
    /**
     * <code>string ID = 1[json_name = "id", (.gogoproto.jsontag) = "id"];</code>
     */
    public Builder setIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      iD_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 2;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object controller_ = "";
    /**
     * <code>string controller = 3;</code>
     */
    public java.lang.String getController() {
      java.lang.Object ref = controller_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        controller_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string controller = 3;</code>
     */
    public com.google.protobuf.ByteString
        getControllerBytes() {
      java.lang.Object ref = controller_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        controller_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string controller = 3;</code>
     */
    public Builder setController(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      controller_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string controller = 3;</code>
     */
    public Builder clearController() {
      
      controller_ = getDefaultInstance().getController();
      onChanged();
      return this;
    }
    /**
     * <code>string controller = 3;</code>
     */
    public Builder setControllerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      controller_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pubKeyBase58_ = "";
    /**
     * <code>string pubKeyBase58 = 4[json_name = "publicKeyBase58", (.gogoproto.jsontag) = "publicKeyBase58"];</code>
     */
    public java.lang.String getPubKeyBase58() {
      java.lang.Object ref = pubKeyBase58_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pubKeyBase58_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pubKeyBase58 = 4[json_name = "publicKeyBase58", (.gogoproto.jsontag) = "publicKeyBase58"];</code>
     */
    public com.google.protobuf.ByteString
        getPubKeyBase58Bytes() {
      java.lang.Object ref = pubKeyBase58_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pubKeyBase58_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pubKeyBase58 = 4[json_name = "publicKeyBase58", (.gogoproto.jsontag) = "publicKeyBase58"];</code>
     */
    public Builder setPubKeyBase58(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pubKeyBase58_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pubKeyBase58 = 4[json_name = "publicKeyBase58", (.gogoproto.jsontag) = "publicKeyBase58"];</code>
     */
    public Builder clearPubKeyBase58() {
      
      pubKeyBase58_ = getDefaultInstance().getPubKeyBase58();
      onChanged();
      return this;
    }
    /**
     * <code>string pubKeyBase58 = 4[json_name = "publicKeyBase58", (.gogoproto.jsontag) = "publicKeyBase58"];</code>
     */
    public Builder setPubKeyBase58Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pubKeyBase58_ = value;
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


    // @@protoc_insertion_point(builder_scope:panacea.did.v2.VerificationMethod)
  }

  // @@protoc_insertion_point(class_scope:panacea.did.v2.VerificationMethod)
  private static final panacea.did.v2.VerificationMethod DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new panacea.did.v2.VerificationMethod();
  }

  public static panacea.did.v2.VerificationMethod getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VerificationMethod>
      PARSER = new com.google.protobuf.AbstractParser<VerificationMethod>() {
    @java.lang.Override
    public VerificationMethod parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VerificationMethod(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VerificationMethod> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VerificationMethod> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public panacea.did.v2.VerificationMethod getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

