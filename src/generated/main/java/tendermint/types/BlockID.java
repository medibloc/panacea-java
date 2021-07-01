// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/types.proto

package tendermint.types;

/**
 * <pre>
 * BlockID
 * </pre>
 *
 * Protobuf type {@code tendermint.types.BlockID}
 */
public  final class BlockID extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.types.BlockID)
    BlockIDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlockID.newBuilder() to construct.
  private BlockID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockID() {
    hash_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlockID(
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

            hash_ = input.readBytes();
            break;
          }
          case 18: {
            tendermint.types.PartSetHeader.Builder subBuilder = null;
            if (partSetHeader_ != null) {
              subBuilder = partSetHeader_.toBuilder();
            }
            partSetHeader_ = input.readMessage(tendermint.types.PartSetHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(partSetHeader_);
              partSetHeader_ = subBuilder.buildPartial();
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
    return tendermint.types.Types.internal_static_tendermint_types_BlockID_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tendermint.types.Types.internal_static_tendermint_types_BlockID_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tendermint.types.BlockID.class, tendermint.types.BlockID.Builder.class);
  }

  public static final int HASH_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString hash_;
  /**
   * <code>bytes hash = 1;</code>
   */
  public com.google.protobuf.ByteString getHash() {
    return hash_;
  }

  public static final int PART_SET_HEADER_FIELD_NUMBER = 2;
  private tendermint.types.PartSetHeader partSetHeader_;
  /**
   * <code>.tendermint.types.PartSetHeader part_set_header = 2 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasPartSetHeader() {
    return partSetHeader_ != null;
  }
  /**
   * <code>.tendermint.types.PartSetHeader part_set_header = 2 [(.gogoproto.nullable) = false];</code>
   */
  public tendermint.types.PartSetHeader getPartSetHeader() {
    return partSetHeader_ == null ? tendermint.types.PartSetHeader.getDefaultInstance() : partSetHeader_;
  }
  /**
   * <code>.tendermint.types.PartSetHeader part_set_header = 2 [(.gogoproto.nullable) = false];</code>
   */
  public tendermint.types.PartSetHeaderOrBuilder getPartSetHeaderOrBuilder() {
    return getPartSetHeader();
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
    if (!hash_.isEmpty()) {
      output.writeBytes(1, hash_);
    }
    if (partSetHeader_ != null) {
      output.writeMessage(2, getPartSetHeader());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!hash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, hash_);
    }
    if (partSetHeader_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPartSetHeader());
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
    if (!(obj instanceof tendermint.types.BlockID)) {
      return super.equals(obj);
    }
    tendermint.types.BlockID other = (tendermint.types.BlockID) obj;

    if (!getHash()
        .equals(other.getHash())) return false;
    if (hasPartSetHeader() != other.hasPartSetHeader()) return false;
    if (hasPartSetHeader()) {
      if (!getPartSetHeader()
          .equals(other.getPartSetHeader())) return false;
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
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    if (hasPartSetHeader()) {
      hash = (37 * hash) + PART_SET_HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getPartSetHeader().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tendermint.types.BlockID parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tendermint.types.BlockID parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tendermint.types.BlockID parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tendermint.types.BlockID parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tendermint.types.BlockID parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tendermint.types.BlockID parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tendermint.types.BlockID parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tendermint.types.BlockID parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tendermint.types.BlockID parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tendermint.types.BlockID parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tendermint.types.BlockID parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tendermint.types.BlockID parseFrom(
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
  public static Builder newBuilder(tendermint.types.BlockID prototype) {
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
   * <pre>
   * BlockID
   * </pre>
   *
   * Protobuf type {@code tendermint.types.BlockID}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.types.BlockID)
      tendermint.types.BlockIDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tendermint.types.Types.internal_static_tendermint_types_BlockID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tendermint.types.Types.internal_static_tendermint_types_BlockID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tendermint.types.BlockID.class, tendermint.types.BlockID.Builder.class);
    }

    // Construct using tendermint.types.BlockID.newBuilder()
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
      hash_ = com.google.protobuf.ByteString.EMPTY;

      if (partSetHeaderBuilder_ == null) {
        partSetHeader_ = null;
      } else {
        partSetHeader_ = null;
        partSetHeaderBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tendermint.types.Types.internal_static_tendermint_types_BlockID_descriptor;
    }

    @java.lang.Override
    public tendermint.types.BlockID getDefaultInstanceForType() {
      return tendermint.types.BlockID.getDefaultInstance();
    }

    @java.lang.Override
    public tendermint.types.BlockID build() {
      tendermint.types.BlockID result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tendermint.types.BlockID buildPartial() {
      tendermint.types.BlockID result = new tendermint.types.BlockID(this);
      result.hash_ = hash_;
      if (partSetHeaderBuilder_ == null) {
        result.partSetHeader_ = partSetHeader_;
      } else {
        result.partSetHeader_ = partSetHeaderBuilder_.build();
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
      if (other instanceof tendermint.types.BlockID) {
        return mergeFrom((tendermint.types.BlockID)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tendermint.types.BlockID other) {
      if (other == tendermint.types.BlockID.getDefaultInstance()) return this;
      if (other.getHash() != com.google.protobuf.ByteString.EMPTY) {
        setHash(other.getHash());
      }
      if (other.hasPartSetHeader()) {
        mergePartSetHeader(other.getPartSetHeader());
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
      tendermint.types.BlockID parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tendermint.types.BlockID) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes hash = 1;</code>
     */
    public com.google.protobuf.ByteString getHash() {
      return hash_;
    }
    /**
     * <code>bytes hash = 1;</code>
     */
    public Builder setHash(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes hash = 1;</code>
     */
    public Builder clearHash() {
      
      hash_ = getDefaultInstance().getHash();
      onChanged();
      return this;
    }

    private tendermint.types.PartSetHeader partSetHeader_;
    private com.google.protobuf.SingleFieldBuilderV3<
        tendermint.types.PartSetHeader, tendermint.types.PartSetHeader.Builder, tendermint.types.PartSetHeaderOrBuilder> partSetHeaderBuilder_;
    /**
     * <code>.tendermint.types.PartSetHeader part_set_header = 2 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasPartSetHeader() {
      return partSetHeaderBuilder_ != null || partSetHeader_ != null;
    }
    /**
     * <code>.tendermint.types.PartSetHeader part_set_header = 2 [(.gogoproto.nullable) = false];</code>
     */
    public tendermint.types.PartSetHeader getPartSetHeader() {
      if (partSetHeaderBuilder_ == null) {
        return partSetHeader_ == null ? tendermint.types.PartSetHeader.getDefaultInstance() : partSetHeader_;
      } else {
        return partSetHeaderBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.types.PartSetHeader part_set_header = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setPartSetHeader(tendermint.types.PartSetHeader value) {
      if (partSetHeaderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partSetHeader_ = value;
        onChanged();
      } else {
        partSetHeaderBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tendermint.types.PartSetHeader part_set_header = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setPartSetHeader(
        tendermint.types.PartSetHeader.Builder builderForValue) {
      if (partSetHeaderBuilder_ == null) {
        partSetHeader_ = builderForValue.build();
        onChanged();
      } else {
        partSetHeaderBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tendermint.types.PartSetHeader part_set_header = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergePartSetHeader(tendermint.types.PartSetHeader value) {
      if (partSetHeaderBuilder_ == null) {
        if (partSetHeader_ != null) {
          partSetHeader_ =
            tendermint.types.PartSetHeader.newBuilder(partSetHeader_).mergeFrom(value).buildPartial();
        } else {
          partSetHeader_ = value;
        }
        onChanged();
      } else {
        partSetHeaderBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tendermint.types.PartSetHeader part_set_header = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearPartSetHeader() {
      if (partSetHeaderBuilder_ == null) {
        partSetHeader_ = null;
        onChanged();
      } else {
        partSetHeader_ = null;
        partSetHeaderBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tendermint.types.PartSetHeader part_set_header = 2 [(.gogoproto.nullable) = false];</code>
     */
    public tendermint.types.PartSetHeader.Builder getPartSetHeaderBuilder() {
      
      onChanged();
      return getPartSetHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.types.PartSetHeader part_set_header = 2 [(.gogoproto.nullable) = false];</code>
     */
    public tendermint.types.PartSetHeaderOrBuilder getPartSetHeaderOrBuilder() {
      if (partSetHeaderBuilder_ != null) {
        return partSetHeaderBuilder_.getMessageOrBuilder();
      } else {
        return partSetHeader_ == null ?
            tendermint.types.PartSetHeader.getDefaultInstance() : partSetHeader_;
      }
    }
    /**
     * <code>.tendermint.types.PartSetHeader part_set_header = 2 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tendermint.types.PartSetHeader, tendermint.types.PartSetHeader.Builder, tendermint.types.PartSetHeaderOrBuilder> 
        getPartSetHeaderFieldBuilder() {
      if (partSetHeaderBuilder_ == null) {
        partSetHeaderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tendermint.types.PartSetHeader, tendermint.types.PartSetHeader.Builder, tendermint.types.PartSetHeaderOrBuilder>(
                getPartSetHeader(),
                getParentForChildren(),
                isClean());
        partSetHeader_ = null;
      }
      return partSetHeaderBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tendermint.types.BlockID)
  }

  // @@protoc_insertion_point(class_scope:tendermint.types.BlockID)
  private static final tendermint.types.BlockID DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tendermint.types.BlockID();
  }

  public static tendermint.types.BlockID getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockID>
      PARSER = new com.google.protobuf.AbstractParser<BlockID>() {
    @java.lang.Override
    public BlockID parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlockID(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlockID> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockID> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tendermint.types.BlockID getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

