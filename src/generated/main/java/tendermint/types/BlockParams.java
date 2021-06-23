// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/params.proto

package tendermint.types;

/**
 * <pre>
 * BlockParams contains limits on the block size.
 * </pre>
 *
 * Protobuf type {@code tendermint.types.BlockParams}
 */
public  final class BlockParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.types.BlockParams)
    BlockParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlockParams.newBuilder() to construct.
  private BlockParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockParams() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlockParams(
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
          case 8: {

            maxBytes_ = input.readInt64();
            break;
          }
          case 16: {

            maxGas_ = input.readInt64();
            break;
          }
          case 24: {

            timeIotaMs_ = input.readInt64();
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
    return tendermint.types.Params.internal_static_tendermint_types_BlockParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tendermint.types.Params.internal_static_tendermint_types_BlockParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tendermint.types.BlockParams.class, tendermint.types.BlockParams.Builder.class);
  }

  public static final int MAX_BYTES_FIELD_NUMBER = 1;
  private long maxBytes_;
  /**
   * <pre>
   * Max block size, in bytes.
   * Note: must be greater than 0
   * </pre>
   *
   * <code>int64 max_bytes = 1;</code>
   */
  public long getMaxBytes() {
    return maxBytes_;
  }

  public static final int MAX_GAS_FIELD_NUMBER = 2;
  private long maxGas_;
  /**
   * <pre>
   * Max gas per block.
   * Note: must be greater or equal to -1
   * </pre>
   *
   * <code>int64 max_gas = 2;</code>
   */
  public long getMaxGas() {
    return maxGas_;
  }

  public static final int TIME_IOTA_MS_FIELD_NUMBER = 3;
  private long timeIotaMs_;
  /**
   * <pre>
   * Minimum time increment between consecutive blocks (in milliseconds) If the
   * block header timestamp is ahead of the system clock, decrease this value.
   * Not exposed to the application.
   * </pre>
   *
   * <code>int64 time_iota_ms = 3;</code>
   */
  public long getTimeIotaMs() {
    return timeIotaMs_;
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
    if (maxBytes_ != 0L) {
      output.writeInt64(1, maxBytes_);
    }
    if (maxGas_ != 0L) {
      output.writeInt64(2, maxGas_);
    }
    if (timeIotaMs_ != 0L) {
      output.writeInt64(3, timeIotaMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, maxBytes_);
    }
    if (maxGas_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, maxGas_);
    }
    if (timeIotaMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, timeIotaMs_);
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
    if (!(obj instanceof tendermint.types.BlockParams)) {
      return super.equals(obj);
    }
    tendermint.types.BlockParams other = (tendermint.types.BlockParams) obj;

    if (getMaxBytes()
        != other.getMaxBytes()) return false;
    if (getMaxGas()
        != other.getMaxGas()) return false;
    if (getTimeIotaMs()
        != other.getTimeIotaMs()) return false;
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
    hash = (37 * hash) + MAX_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxBytes());
    hash = (37 * hash) + MAX_GAS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxGas());
    hash = (37 * hash) + TIME_IOTA_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimeIotaMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tendermint.types.BlockParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tendermint.types.BlockParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tendermint.types.BlockParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tendermint.types.BlockParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tendermint.types.BlockParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tendermint.types.BlockParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tendermint.types.BlockParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tendermint.types.BlockParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tendermint.types.BlockParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tendermint.types.BlockParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tendermint.types.BlockParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tendermint.types.BlockParams parseFrom(
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
  public static Builder newBuilder(tendermint.types.BlockParams prototype) {
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
   * BlockParams contains limits on the block size.
   * </pre>
   *
   * Protobuf type {@code tendermint.types.BlockParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.types.BlockParams)
      tendermint.types.BlockParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tendermint.types.Params.internal_static_tendermint_types_BlockParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tendermint.types.Params.internal_static_tendermint_types_BlockParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tendermint.types.BlockParams.class, tendermint.types.BlockParams.Builder.class);
    }

    // Construct using tendermint.types.BlockParams.newBuilder()
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
      maxBytes_ = 0L;

      maxGas_ = 0L;

      timeIotaMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tendermint.types.Params.internal_static_tendermint_types_BlockParams_descriptor;
    }

    @java.lang.Override
    public tendermint.types.BlockParams getDefaultInstanceForType() {
      return tendermint.types.BlockParams.getDefaultInstance();
    }

    @java.lang.Override
    public tendermint.types.BlockParams build() {
      tendermint.types.BlockParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tendermint.types.BlockParams buildPartial() {
      tendermint.types.BlockParams result = new tendermint.types.BlockParams(this);
      result.maxBytes_ = maxBytes_;
      result.maxGas_ = maxGas_;
      result.timeIotaMs_ = timeIotaMs_;
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
      if (other instanceof tendermint.types.BlockParams) {
        return mergeFrom((tendermint.types.BlockParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tendermint.types.BlockParams other) {
      if (other == tendermint.types.BlockParams.getDefaultInstance()) return this;
      if (other.getMaxBytes() != 0L) {
        setMaxBytes(other.getMaxBytes());
      }
      if (other.getMaxGas() != 0L) {
        setMaxGas(other.getMaxGas());
      }
      if (other.getTimeIotaMs() != 0L) {
        setTimeIotaMs(other.getTimeIotaMs());
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
      tendermint.types.BlockParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tendermint.types.BlockParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long maxBytes_ ;
    /**
     * <pre>
     * Max block size, in bytes.
     * Note: must be greater than 0
     * </pre>
     *
     * <code>int64 max_bytes = 1;</code>
     */
    public long getMaxBytes() {
      return maxBytes_;
    }
    /**
     * <pre>
     * Max block size, in bytes.
     * Note: must be greater than 0
     * </pre>
     *
     * <code>int64 max_bytes = 1;</code>
     */
    public Builder setMaxBytes(long value) {
      
      maxBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Max block size, in bytes.
     * Note: must be greater than 0
     * </pre>
     *
     * <code>int64 max_bytes = 1;</code>
     */
    public Builder clearMaxBytes() {
      
      maxBytes_ = 0L;
      onChanged();
      return this;
    }

    private long maxGas_ ;
    /**
     * <pre>
     * Max gas per block.
     * Note: must be greater or equal to -1
     * </pre>
     *
     * <code>int64 max_gas = 2;</code>
     */
    public long getMaxGas() {
      return maxGas_;
    }
    /**
     * <pre>
     * Max gas per block.
     * Note: must be greater or equal to -1
     * </pre>
     *
     * <code>int64 max_gas = 2;</code>
     */
    public Builder setMaxGas(long value) {
      
      maxGas_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Max gas per block.
     * Note: must be greater or equal to -1
     * </pre>
     *
     * <code>int64 max_gas = 2;</code>
     */
    public Builder clearMaxGas() {
      
      maxGas_ = 0L;
      onChanged();
      return this;
    }

    private long timeIotaMs_ ;
    /**
     * <pre>
     * Minimum time increment between consecutive blocks (in milliseconds) If the
     * block header timestamp is ahead of the system clock, decrease this value.
     * Not exposed to the application.
     * </pre>
     *
     * <code>int64 time_iota_ms = 3;</code>
     */
    public long getTimeIotaMs() {
      return timeIotaMs_;
    }
    /**
     * <pre>
     * Minimum time increment between consecutive blocks (in milliseconds) If the
     * block header timestamp is ahead of the system clock, decrease this value.
     * Not exposed to the application.
     * </pre>
     *
     * <code>int64 time_iota_ms = 3;</code>
     */
    public Builder setTimeIotaMs(long value) {
      
      timeIotaMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum time increment between consecutive blocks (in milliseconds) If the
     * block header timestamp is ahead of the system clock, decrease this value.
     * Not exposed to the application.
     * </pre>
     *
     * <code>int64 time_iota_ms = 3;</code>
     */
    public Builder clearTimeIotaMs() {
      
      timeIotaMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tendermint.types.BlockParams)
  }

  // @@protoc_insertion_point(class_scope:tendermint.types.BlockParams)
  private static final tendermint.types.BlockParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tendermint.types.BlockParams();
  }

  public static tendermint.types.BlockParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockParams>
      PARSER = new com.google.protobuf.AbstractParser<BlockParams>() {
    @java.lang.Override
    public BlockParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlockParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlockParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tendermint.types.BlockParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

