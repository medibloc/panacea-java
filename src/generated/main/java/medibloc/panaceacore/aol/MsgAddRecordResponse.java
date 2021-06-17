// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aol/tx.proto

package medibloc.panaceacore.aol;

/**
 * Protobuf type {@code medibloc.panaceacore.aol.MsgAddRecordResponse}
 */
public  final class MsgAddRecordResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:medibloc.panaceacore.aol.MsgAddRecordResponse)
    MsgAddRecordResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgAddRecordResponse.newBuilder() to construct.
  private MsgAddRecordResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgAddRecordResponse() {
    ownerAddress_ = "";
    topicName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgAddRecordResponse(
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

            ownerAddress_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            topicName_ = s;
            break;
          }
          case 24: {

            offset_ = input.readUInt64();
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
    return medibloc.panaceacore.aol.Tx.internal_static_medibloc_panaceacore_aol_MsgAddRecordResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return medibloc.panaceacore.aol.Tx.internal_static_medibloc_panaceacore_aol_MsgAddRecordResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            medibloc.panaceacore.aol.MsgAddRecordResponse.class, medibloc.panaceacore.aol.MsgAddRecordResponse.Builder.class);
  }

  public static final int OWNERADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object ownerAddress_;
  /**
   * <code>string ownerAddress = 1;</code>
   */
  public java.lang.String getOwnerAddress() {
    java.lang.Object ref = ownerAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ownerAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string ownerAddress = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOwnerAddressBytes() {
    java.lang.Object ref = ownerAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ownerAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOPICNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object topicName_;
  /**
   * <code>string topicName = 2;</code>
   */
  public java.lang.String getTopicName() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topicName_ = s;
      return s;
    }
  }
  /**
   * <code>string topicName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTopicNameBytes() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topicName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OFFSET_FIELD_NUMBER = 3;
  private long offset_;
  /**
   * <code>uint64 offset = 3;</code>
   */
  public long getOffset() {
    return offset_;
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
    if (!getOwnerAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ownerAddress_);
    }
    if (!getTopicNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, topicName_);
    }
    if (offset_ != 0L) {
      output.writeUInt64(3, offset_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOwnerAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ownerAddress_);
    }
    if (!getTopicNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, topicName_);
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, offset_);
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
    if (!(obj instanceof medibloc.panaceacore.aol.MsgAddRecordResponse)) {
      return super.equals(obj);
    }
    medibloc.panaceacore.aol.MsgAddRecordResponse other = (medibloc.panaceacore.aol.MsgAddRecordResponse) obj;

    if (!getOwnerAddress()
        .equals(other.getOwnerAddress())) return false;
    if (!getTopicName()
        .equals(other.getTopicName())) return false;
    if (getOffset()
        != other.getOffset()) return false;
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
    hash = (37 * hash) + OWNERADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getOwnerAddress().hashCode();
    hash = (37 * hash) + TOPICNAME_FIELD_NUMBER;
    hash = (53 * hash) + getTopicName().hashCode();
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOffset());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static medibloc.panaceacore.aol.MsgAddRecordResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static medibloc.panaceacore.aol.MsgAddRecordResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static medibloc.panaceacore.aol.MsgAddRecordResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static medibloc.panaceacore.aol.MsgAddRecordResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static medibloc.panaceacore.aol.MsgAddRecordResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static medibloc.panaceacore.aol.MsgAddRecordResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static medibloc.panaceacore.aol.MsgAddRecordResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static medibloc.panaceacore.aol.MsgAddRecordResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static medibloc.panaceacore.aol.MsgAddRecordResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static medibloc.panaceacore.aol.MsgAddRecordResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static medibloc.panaceacore.aol.MsgAddRecordResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static medibloc.panaceacore.aol.MsgAddRecordResponse parseFrom(
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
  public static Builder newBuilder(medibloc.panaceacore.aol.MsgAddRecordResponse prototype) {
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
   * Protobuf type {@code medibloc.panaceacore.aol.MsgAddRecordResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:medibloc.panaceacore.aol.MsgAddRecordResponse)
      medibloc.panaceacore.aol.MsgAddRecordResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return medibloc.panaceacore.aol.Tx.internal_static_medibloc_panaceacore_aol_MsgAddRecordResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return medibloc.panaceacore.aol.Tx.internal_static_medibloc_panaceacore_aol_MsgAddRecordResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              medibloc.panaceacore.aol.MsgAddRecordResponse.class, medibloc.panaceacore.aol.MsgAddRecordResponse.Builder.class);
    }

    // Construct using medibloc.panaceacore.aol.MsgAddRecordResponse.newBuilder()
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
      ownerAddress_ = "";

      topicName_ = "";

      offset_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return medibloc.panaceacore.aol.Tx.internal_static_medibloc_panaceacore_aol_MsgAddRecordResponse_descriptor;
    }

    @java.lang.Override
    public medibloc.panaceacore.aol.MsgAddRecordResponse getDefaultInstanceForType() {
      return medibloc.panaceacore.aol.MsgAddRecordResponse.getDefaultInstance();
    }

    @java.lang.Override
    public medibloc.panaceacore.aol.MsgAddRecordResponse build() {
      medibloc.panaceacore.aol.MsgAddRecordResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public medibloc.panaceacore.aol.MsgAddRecordResponse buildPartial() {
      medibloc.panaceacore.aol.MsgAddRecordResponse result = new medibloc.panaceacore.aol.MsgAddRecordResponse(this);
      result.ownerAddress_ = ownerAddress_;
      result.topicName_ = topicName_;
      result.offset_ = offset_;
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
      if (other instanceof medibloc.panaceacore.aol.MsgAddRecordResponse) {
        return mergeFrom((medibloc.panaceacore.aol.MsgAddRecordResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(medibloc.panaceacore.aol.MsgAddRecordResponse other) {
      if (other == medibloc.panaceacore.aol.MsgAddRecordResponse.getDefaultInstance()) return this;
      if (!other.getOwnerAddress().isEmpty()) {
        ownerAddress_ = other.ownerAddress_;
        onChanged();
      }
      if (!other.getTopicName().isEmpty()) {
        topicName_ = other.topicName_;
        onChanged();
      }
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
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
      medibloc.panaceacore.aol.MsgAddRecordResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (medibloc.panaceacore.aol.MsgAddRecordResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ownerAddress_ = "";
    /**
     * <code>string ownerAddress = 1;</code>
     */
    public java.lang.String getOwnerAddress() {
      java.lang.Object ref = ownerAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ownerAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ownerAddress = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOwnerAddressBytes() {
      java.lang.Object ref = ownerAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ownerAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ownerAddress = 1;</code>
     */
    public Builder setOwnerAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ownerAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ownerAddress = 1;</code>
     */
    public Builder clearOwnerAddress() {
      
      ownerAddress_ = getDefaultInstance().getOwnerAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string ownerAddress = 1;</code>
     */
    public Builder setOwnerAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ownerAddress_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object topicName_ = "";
    /**
     * <code>string topicName = 2;</code>
     */
    public java.lang.String getTopicName() {
      java.lang.Object ref = topicName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topicName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string topicName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTopicNameBytes() {
      java.lang.Object ref = topicName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topicName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string topicName = 2;</code>
     */
    public Builder setTopicName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topicName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string topicName = 2;</code>
     */
    public Builder clearTopicName() {
      
      topicName_ = getDefaultInstance().getTopicName();
      onChanged();
      return this;
    }
    /**
     * <code>string topicName = 2;</code>
     */
    public Builder setTopicNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topicName_ = value;
      onChanged();
      return this;
    }

    private long offset_ ;
    /**
     * <code>uint64 offset = 3;</code>
     */
    public long getOffset() {
      return offset_;
    }
    /**
     * <code>uint64 offset = 3;</code>
     */
    public Builder setOffset(long value) {
      
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 offset = 3;</code>
     */
    public Builder clearOffset() {
      
      offset_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:medibloc.panaceacore.aol.MsgAddRecordResponse)
  }

  // @@protoc_insertion_point(class_scope:medibloc.panaceacore.aol.MsgAddRecordResponse)
  private static final medibloc.panaceacore.aol.MsgAddRecordResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new medibloc.panaceacore.aol.MsgAddRecordResponse();
  }

  public static medibloc.panaceacore.aol.MsgAddRecordResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgAddRecordResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgAddRecordResponse>() {
    @java.lang.Override
    public MsgAddRecordResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgAddRecordResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgAddRecordResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgAddRecordResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public medibloc.panaceacore.aol.MsgAddRecordResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

