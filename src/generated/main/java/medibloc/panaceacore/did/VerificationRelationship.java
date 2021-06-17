// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: did/did.proto

package medibloc.panaceacore.did;

/**
 * Protobuf type {@code medibloc.panaceacore.did.VerificationRelationship}
 */
public  final class VerificationRelationship extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:medibloc.panaceacore.did.VerificationRelationship)
    VerificationRelationshipOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VerificationRelationship.newBuilder() to construct.
  private VerificationRelationship(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VerificationRelationship() {
    verificationMethodID_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VerificationRelationship(
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

            verificationMethodID_ = s;
            break;
          }
          case 18: {
            medibloc.panaceacore.did.VerificationMethod.Builder subBuilder = null;
            if (dedicatedVerificationMethod_ != null) {
              subBuilder = dedicatedVerificationMethod_.toBuilder();
            }
            dedicatedVerificationMethod_ = input.readMessage(medibloc.panaceacore.did.VerificationMethod.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dedicatedVerificationMethod_);
              dedicatedVerificationMethod_ = subBuilder.buildPartial();
            }

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
    return medibloc.panaceacore.did.Did.internal_static_medibloc_panaceacore_did_VerificationRelationship_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return medibloc.panaceacore.did.Did.internal_static_medibloc_panaceacore_did_VerificationRelationship_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            medibloc.panaceacore.did.VerificationRelationship.class, medibloc.panaceacore.did.VerificationRelationship.Builder.class);
  }

  public static final int VERIFICATIONMETHODID_FIELD_NUMBER = 1;
  private volatile java.lang.Object verificationMethodID_;
  /**
   * <code>string verificationMethodID = 1;</code>
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
   * <code>string verificationMethodID = 1;</code>
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

  public static final int DEDICATEDVERIFICATIONMETHOD_FIELD_NUMBER = 2;
  private medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod_;
  /**
   * <code>.medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod = 2;</code>
   */
  public boolean hasDedicatedVerificationMethod() {
    return dedicatedVerificationMethod_ != null;
  }
  /**
   * <code>.medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod = 2;</code>
   */
  public medibloc.panaceacore.did.VerificationMethod getDedicatedVerificationMethod() {
    return dedicatedVerificationMethod_ == null ? medibloc.panaceacore.did.VerificationMethod.getDefaultInstance() : dedicatedVerificationMethod_;
  }
  /**
   * <code>.medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod = 2;</code>
   */
  public medibloc.panaceacore.did.VerificationMethodOrBuilder getDedicatedVerificationMethodOrBuilder() {
    return getDedicatedVerificationMethod();
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
    if (!getVerificationMethodIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, verificationMethodID_);
    }
    if (dedicatedVerificationMethod_ != null) {
      output.writeMessage(2, getDedicatedVerificationMethod());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVerificationMethodIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, verificationMethodID_);
    }
    if (dedicatedVerificationMethod_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDedicatedVerificationMethod());
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
    if (!(obj instanceof medibloc.panaceacore.did.VerificationRelationship)) {
      return super.equals(obj);
    }
    medibloc.panaceacore.did.VerificationRelationship other = (medibloc.panaceacore.did.VerificationRelationship) obj;

    if (!getVerificationMethodID()
        .equals(other.getVerificationMethodID())) return false;
    if (hasDedicatedVerificationMethod() != other.hasDedicatedVerificationMethod()) return false;
    if (hasDedicatedVerificationMethod()) {
      if (!getDedicatedVerificationMethod()
          .equals(other.getDedicatedVerificationMethod())) return false;
    }
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
    hash = (37 * hash) + VERIFICATIONMETHODID_FIELD_NUMBER;
    hash = (53 * hash) + getVerificationMethodID().hashCode();
    if (hasDedicatedVerificationMethod()) {
      hash = (37 * hash) + DEDICATEDVERIFICATIONMETHOD_FIELD_NUMBER;
      hash = (53 * hash) + getDedicatedVerificationMethod().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static medibloc.panaceacore.did.VerificationRelationship parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static medibloc.panaceacore.did.VerificationRelationship parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static medibloc.panaceacore.did.VerificationRelationship parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static medibloc.panaceacore.did.VerificationRelationship parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static medibloc.panaceacore.did.VerificationRelationship parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static medibloc.panaceacore.did.VerificationRelationship parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static medibloc.panaceacore.did.VerificationRelationship parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static medibloc.panaceacore.did.VerificationRelationship parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static medibloc.panaceacore.did.VerificationRelationship parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static medibloc.panaceacore.did.VerificationRelationship parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static medibloc.panaceacore.did.VerificationRelationship parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static medibloc.panaceacore.did.VerificationRelationship parseFrom(
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
  public static Builder newBuilder(medibloc.panaceacore.did.VerificationRelationship prototype) {
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
   * Protobuf type {@code medibloc.panaceacore.did.VerificationRelationship}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:medibloc.panaceacore.did.VerificationRelationship)
      medibloc.panaceacore.did.VerificationRelationshipOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return medibloc.panaceacore.did.Did.internal_static_medibloc_panaceacore_did_VerificationRelationship_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return medibloc.panaceacore.did.Did.internal_static_medibloc_panaceacore_did_VerificationRelationship_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              medibloc.panaceacore.did.VerificationRelationship.class, medibloc.panaceacore.did.VerificationRelationship.Builder.class);
    }

    // Construct using medibloc.panaceacore.did.VerificationRelationship.newBuilder()
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
      verificationMethodID_ = "";

      if (dedicatedVerificationMethodBuilder_ == null) {
        dedicatedVerificationMethod_ = null;
      } else {
        dedicatedVerificationMethod_ = null;
        dedicatedVerificationMethodBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return medibloc.panaceacore.did.Did.internal_static_medibloc_panaceacore_did_VerificationRelationship_descriptor;
    }

    @java.lang.Override
    public medibloc.panaceacore.did.VerificationRelationship getDefaultInstanceForType() {
      return medibloc.panaceacore.did.VerificationRelationship.getDefaultInstance();
    }

    @java.lang.Override
    public medibloc.panaceacore.did.VerificationRelationship build() {
      medibloc.panaceacore.did.VerificationRelationship result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public medibloc.panaceacore.did.VerificationRelationship buildPartial() {
      medibloc.panaceacore.did.VerificationRelationship result = new medibloc.panaceacore.did.VerificationRelationship(this);
      result.verificationMethodID_ = verificationMethodID_;
      if (dedicatedVerificationMethodBuilder_ == null) {
        result.dedicatedVerificationMethod_ = dedicatedVerificationMethod_;
      } else {
        result.dedicatedVerificationMethod_ = dedicatedVerificationMethodBuilder_.build();
      }
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
      if (other instanceof medibloc.panaceacore.did.VerificationRelationship) {
        return mergeFrom((medibloc.panaceacore.did.VerificationRelationship)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(medibloc.panaceacore.did.VerificationRelationship other) {
      if (other == medibloc.panaceacore.did.VerificationRelationship.getDefaultInstance()) return this;
      if (!other.getVerificationMethodID().isEmpty()) {
        verificationMethodID_ = other.verificationMethodID_;
        onChanged();
      }
      if (other.hasDedicatedVerificationMethod()) {
        mergeDedicatedVerificationMethod(other.getDedicatedVerificationMethod());
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
      medibloc.panaceacore.did.VerificationRelationship parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (medibloc.panaceacore.did.VerificationRelationship) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object verificationMethodID_ = "";
    /**
     * <code>string verificationMethodID = 1;</code>
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
     * <code>string verificationMethodID = 1;</code>
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
     * <code>string verificationMethodID = 1;</code>
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
     * <code>string verificationMethodID = 1;</code>
     */
    public Builder clearVerificationMethodID() {
      
      verificationMethodID_ = getDefaultInstance().getVerificationMethodID();
      onChanged();
      return this;
    }
    /**
     * <code>string verificationMethodID = 1;</code>
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

    private medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod_;
    private com.google.protobuf.SingleFieldBuilderV3<
        medibloc.panaceacore.did.VerificationMethod, medibloc.panaceacore.did.VerificationMethod.Builder, medibloc.panaceacore.did.VerificationMethodOrBuilder> dedicatedVerificationMethodBuilder_;
    /**
     * <code>.medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod = 2;</code>
     */
    public boolean hasDedicatedVerificationMethod() {
      return dedicatedVerificationMethodBuilder_ != null || dedicatedVerificationMethod_ != null;
    }
    /**
     * <code>.medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod = 2;</code>
     */
    public medibloc.panaceacore.did.VerificationMethod getDedicatedVerificationMethod() {
      if (dedicatedVerificationMethodBuilder_ == null) {
        return dedicatedVerificationMethod_ == null ? medibloc.panaceacore.did.VerificationMethod.getDefaultInstance() : dedicatedVerificationMethod_;
      } else {
        return dedicatedVerificationMethodBuilder_.getMessage();
      }
    }
    /**
     * <code>.medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod = 2;</code>
     */
    public Builder setDedicatedVerificationMethod(medibloc.panaceacore.did.VerificationMethod value) {
      if (dedicatedVerificationMethodBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dedicatedVerificationMethod_ = value;
        onChanged();
      } else {
        dedicatedVerificationMethodBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod = 2;</code>
     */
    public Builder setDedicatedVerificationMethod(
        medibloc.panaceacore.did.VerificationMethod.Builder builderForValue) {
      if (dedicatedVerificationMethodBuilder_ == null) {
        dedicatedVerificationMethod_ = builderForValue.build();
        onChanged();
      } else {
        dedicatedVerificationMethodBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod = 2;</code>
     */
    public Builder mergeDedicatedVerificationMethod(medibloc.panaceacore.did.VerificationMethod value) {
      if (dedicatedVerificationMethodBuilder_ == null) {
        if (dedicatedVerificationMethod_ != null) {
          dedicatedVerificationMethod_ =
            medibloc.panaceacore.did.VerificationMethod.newBuilder(dedicatedVerificationMethod_).mergeFrom(value).buildPartial();
        } else {
          dedicatedVerificationMethod_ = value;
        }
        onChanged();
      } else {
        dedicatedVerificationMethodBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod = 2;</code>
     */
    public Builder clearDedicatedVerificationMethod() {
      if (dedicatedVerificationMethodBuilder_ == null) {
        dedicatedVerificationMethod_ = null;
        onChanged();
      } else {
        dedicatedVerificationMethod_ = null;
        dedicatedVerificationMethodBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod = 2;</code>
     */
    public medibloc.panaceacore.did.VerificationMethod.Builder getDedicatedVerificationMethodBuilder() {
      
      onChanged();
      return getDedicatedVerificationMethodFieldBuilder().getBuilder();
    }
    /**
     * <code>.medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod = 2;</code>
     */
    public medibloc.panaceacore.did.VerificationMethodOrBuilder getDedicatedVerificationMethodOrBuilder() {
      if (dedicatedVerificationMethodBuilder_ != null) {
        return dedicatedVerificationMethodBuilder_.getMessageOrBuilder();
      } else {
        return dedicatedVerificationMethod_ == null ?
            medibloc.panaceacore.did.VerificationMethod.getDefaultInstance() : dedicatedVerificationMethod_;
      }
    }
    /**
     * <code>.medibloc.panaceacore.did.VerificationMethod dedicatedVerificationMethod = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        medibloc.panaceacore.did.VerificationMethod, medibloc.panaceacore.did.VerificationMethod.Builder, medibloc.panaceacore.did.VerificationMethodOrBuilder> 
        getDedicatedVerificationMethodFieldBuilder() {
      if (dedicatedVerificationMethodBuilder_ == null) {
        dedicatedVerificationMethodBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            medibloc.panaceacore.did.VerificationMethod, medibloc.panaceacore.did.VerificationMethod.Builder, medibloc.panaceacore.did.VerificationMethodOrBuilder>(
                getDedicatedVerificationMethod(),
                getParentForChildren(),
                isClean());
        dedicatedVerificationMethod_ = null;
      }
      return dedicatedVerificationMethodBuilder_;
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


    // @@protoc_insertion_point(builder_scope:medibloc.panaceacore.did.VerificationRelationship)
  }

  // @@protoc_insertion_point(class_scope:medibloc.panaceacore.did.VerificationRelationship)
  private static final medibloc.panaceacore.did.VerificationRelationship DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new medibloc.panaceacore.did.VerificationRelationship();
  }

  public static medibloc.panaceacore.did.VerificationRelationship getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VerificationRelationship>
      PARSER = new com.google.protobuf.AbstractParser<VerificationRelationship>() {
    @java.lang.Override
    public VerificationRelationship parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VerificationRelationship(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VerificationRelationship> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VerificationRelationship> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public medibloc.panaceacore.did.VerificationRelationship getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

