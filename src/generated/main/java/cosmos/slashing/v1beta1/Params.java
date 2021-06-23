// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/slashing/v1beta1/slashing.proto

package cosmos.slashing.v1beta1;

/**
 * <pre>
 * Params represents the parameters used for by the slashing module.
 * </pre>
 *
 * Protobuf type {@code cosmos.slashing.v1beta1.Params}
 */
public  final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.slashing.v1beta1.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
    minSignedPerWindow_ = com.google.protobuf.ByteString.EMPTY;
    slashFractionDoubleSign_ = com.google.protobuf.ByteString.EMPTY;
    slashFractionDowntime_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Params(
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

            signedBlocksWindow_ = input.readInt64();
            break;
          }
          case 18: {

            minSignedPerWindow_ = input.readBytes();
            break;
          }
          case 26: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (downtimeJailDuration_ != null) {
              subBuilder = downtimeJailDuration_.toBuilder();
            }
            downtimeJailDuration_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(downtimeJailDuration_);
              downtimeJailDuration_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {

            slashFractionDoubleSign_ = input.readBytes();
            break;
          }
          case 42: {

            slashFractionDowntime_ = input.readBytes();
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
    return cosmos.slashing.v1beta1.Slashing.internal_static_cosmos_slashing_v1beta1_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.slashing.v1beta1.Slashing.internal_static_cosmos_slashing_v1beta1_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.slashing.v1beta1.Params.class, cosmos.slashing.v1beta1.Params.Builder.class);
  }

  public static final int SIGNED_BLOCKS_WINDOW_FIELD_NUMBER = 1;
  private long signedBlocksWindow_;
  /**
   * <code>int64 signed_blocks_window = 1 [(.gogoproto.moretags) = "yaml:&#92;"signed_blocks_window&#92;""];</code>
   */
  public long getSignedBlocksWindow() {
    return signedBlocksWindow_;
  }

  public static final int MIN_SIGNED_PER_WINDOW_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString minSignedPerWindow_;
  /**
   * <code>bytes min_signed_per_window = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"min_signed_per_window&#92;""];</code>
   */
  public com.google.protobuf.ByteString getMinSignedPerWindow() {
    return minSignedPerWindow_;
  }

  public static final int DOWNTIME_JAIL_DURATION_FIELD_NUMBER = 3;
  private com.google.protobuf.Duration downtimeJailDuration_;
  /**
   * <code>.google.protobuf.Duration downtime_jail_duration = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"downtime_jail_duration&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  public boolean hasDowntimeJailDuration() {
    return downtimeJailDuration_ != null;
  }
  /**
   * <code>.google.protobuf.Duration downtime_jail_duration = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"downtime_jail_duration&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  public com.google.protobuf.Duration getDowntimeJailDuration() {
    return downtimeJailDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : downtimeJailDuration_;
  }
  /**
   * <code>.google.protobuf.Duration downtime_jail_duration = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"downtime_jail_duration&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  public com.google.protobuf.DurationOrBuilder getDowntimeJailDurationOrBuilder() {
    return getDowntimeJailDuration();
  }

  public static final int SLASH_FRACTION_DOUBLE_SIGN_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString slashFractionDoubleSign_;
  /**
   * <code>bytes slash_fraction_double_sign = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"slash_fraction_double_sign&#92;""];</code>
   */
  public com.google.protobuf.ByteString getSlashFractionDoubleSign() {
    return slashFractionDoubleSign_;
  }

  public static final int SLASH_FRACTION_DOWNTIME_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString slashFractionDowntime_;
  /**
   * <code>bytes slash_fraction_downtime = 5 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"slash_fraction_downtime&#92;""];</code>
   */
  public com.google.protobuf.ByteString getSlashFractionDowntime() {
    return slashFractionDowntime_;
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
    if (signedBlocksWindow_ != 0L) {
      output.writeInt64(1, signedBlocksWindow_);
    }
    if (!minSignedPerWindow_.isEmpty()) {
      output.writeBytes(2, minSignedPerWindow_);
    }
    if (downtimeJailDuration_ != null) {
      output.writeMessage(3, getDowntimeJailDuration());
    }
    if (!slashFractionDoubleSign_.isEmpty()) {
      output.writeBytes(4, slashFractionDoubleSign_);
    }
    if (!slashFractionDowntime_.isEmpty()) {
      output.writeBytes(5, slashFractionDowntime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (signedBlocksWindow_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, signedBlocksWindow_);
    }
    if (!minSignedPerWindow_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, minSignedPerWindow_);
    }
    if (downtimeJailDuration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDowntimeJailDuration());
    }
    if (!slashFractionDoubleSign_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, slashFractionDoubleSign_);
    }
    if (!slashFractionDowntime_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, slashFractionDowntime_);
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
    if (!(obj instanceof cosmos.slashing.v1beta1.Params)) {
      return super.equals(obj);
    }
    cosmos.slashing.v1beta1.Params other = (cosmos.slashing.v1beta1.Params) obj;

    if (getSignedBlocksWindow()
        != other.getSignedBlocksWindow()) return false;
    if (!getMinSignedPerWindow()
        .equals(other.getMinSignedPerWindow())) return false;
    if (hasDowntimeJailDuration() != other.hasDowntimeJailDuration()) return false;
    if (hasDowntimeJailDuration()) {
      if (!getDowntimeJailDuration()
          .equals(other.getDowntimeJailDuration())) return false;
    }
    if (!getSlashFractionDoubleSign()
        .equals(other.getSlashFractionDoubleSign())) return false;
    if (!getSlashFractionDowntime()
        .equals(other.getSlashFractionDowntime())) return false;
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
    hash = (37 * hash) + SIGNED_BLOCKS_WINDOW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSignedBlocksWindow());
    hash = (37 * hash) + MIN_SIGNED_PER_WINDOW_FIELD_NUMBER;
    hash = (53 * hash) + getMinSignedPerWindow().hashCode();
    if (hasDowntimeJailDuration()) {
      hash = (37 * hash) + DOWNTIME_JAIL_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDowntimeJailDuration().hashCode();
    }
    hash = (37 * hash) + SLASH_FRACTION_DOUBLE_SIGN_FIELD_NUMBER;
    hash = (53 * hash) + getSlashFractionDoubleSign().hashCode();
    hash = (37 * hash) + SLASH_FRACTION_DOWNTIME_FIELD_NUMBER;
    hash = (53 * hash) + getSlashFractionDowntime().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.slashing.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.slashing.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.slashing.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.slashing.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.slashing.v1beta1.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.slashing.v1beta1.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.slashing.v1beta1.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.slashing.v1beta1.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.slashing.v1beta1.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.slashing.v1beta1.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.slashing.v1beta1.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.slashing.v1beta1.Params parseFrom(
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
  public static Builder newBuilder(cosmos.slashing.v1beta1.Params prototype) {
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
   * Params represents the parameters used for by the slashing module.
   * </pre>
   *
   * Protobuf type {@code cosmos.slashing.v1beta1.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.slashing.v1beta1.Params)
      cosmos.slashing.v1beta1.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.slashing.v1beta1.Slashing.internal_static_cosmos_slashing_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.slashing.v1beta1.Slashing.internal_static_cosmos_slashing_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.slashing.v1beta1.Params.class, cosmos.slashing.v1beta1.Params.Builder.class);
    }

    // Construct using cosmos.slashing.v1beta1.Params.newBuilder()
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
      signedBlocksWindow_ = 0L;

      minSignedPerWindow_ = com.google.protobuf.ByteString.EMPTY;

      if (downtimeJailDurationBuilder_ == null) {
        downtimeJailDuration_ = null;
      } else {
        downtimeJailDuration_ = null;
        downtimeJailDurationBuilder_ = null;
      }
      slashFractionDoubleSign_ = com.google.protobuf.ByteString.EMPTY;

      slashFractionDowntime_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.slashing.v1beta1.Slashing.internal_static_cosmos_slashing_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    public cosmos.slashing.v1beta1.Params getDefaultInstanceForType() {
      return cosmos.slashing.v1beta1.Params.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.slashing.v1beta1.Params build() {
      cosmos.slashing.v1beta1.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.slashing.v1beta1.Params buildPartial() {
      cosmos.slashing.v1beta1.Params result = new cosmos.slashing.v1beta1.Params(this);
      result.signedBlocksWindow_ = signedBlocksWindow_;
      result.minSignedPerWindow_ = minSignedPerWindow_;
      if (downtimeJailDurationBuilder_ == null) {
        result.downtimeJailDuration_ = downtimeJailDuration_;
      } else {
        result.downtimeJailDuration_ = downtimeJailDurationBuilder_.build();
      }
      result.slashFractionDoubleSign_ = slashFractionDoubleSign_;
      result.slashFractionDowntime_ = slashFractionDowntime_;
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
      if (other instanceof cosmos.slashing.v1beta1.Params) {
        return mergeFrom((cosmos.slashing.v1beta1.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.slashing.v1beta1.Params other) {
      if (other == cosmos.slashing.v1beta1.Params.getDefaultInstance()) return this;
      if (other.getSignedBlocksWindow() != 0L) {
        setSignedBlocksWindow(other.getSignedBlocksWindow());
      }
      if (other.getMinSignedPerWindow() != com.google.protobuf.ByteString.EMPTY) {
        setMinSignedPerWindow(other.getMinSignedPerWindow());
      }
      if (other.hasDowntimeJailDuration()) {
        mergeDowntimeJailDuration(other.getDowntimeJailDuration());
      }
      if (other.getSlashFractionDoubleSign() != com.google.protobuf.ByteString.EMPTY) {
        setSlashFractionDoubleSign(other.getSlashFractionDoubleSign());
      }
      if (other.getSlashFractionDowntime() != com.google.protobuf.ByteString.EMPTY) {
        setSlashFractionDowntime(other.getSlashFractionDowntime());
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
      cosmos.slashing.v1beta1.Params parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.slashing.v1beta1.Params) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long signedBlocksWindow_ ;
    /**
     * <code>int64 signed_blocks_window = 1 [(.gogoproto.moretags) = "yaml:&#92;"signed_blocks_window&#92;""];</code>
     */
    public long getSignedBlocksWindow() {
      return signedBlocksWindow_;
    }
    /**
     * <code>int64 signed_blocks_window = 1 [(.gogoproto.moretags) = "yaml:&#92;"signed_blocks_window&#92;""];</code>
     */
    public Builder setSignedBlocksWindow(long value) {
      
      signedBlocksWindow_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 signed_blocks_window = 1 [(.gogoproto.moretags) = "yaml:&#92;"signed_blocks_window&#92;""];</code>
     */
    public Builder clearSignedBlocksWindow() {
      
      signedBlocksWindow_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString minSignedPerWindow_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes min_signed_per_window = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"min_signed_per_window&#92;""];</code>
     */
    public com.google.protobuf.ByteString getMinSignedPerWindow() {
      return minSignedPerWindow_;
    }
    /**
     * <code>bytes min_signed_per_window = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"min_signed_per_window&#92;""];</code>
     */
    public Builder setMinSignedPerWindow(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      minSignedPerWindow_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes min_signed_per_window = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"min_signed_per_window&#92;""];</code>
     */
    public Builder clearMinSignedPerWindow() {
      
      minSignedPerWindow_ = getDefaultInstance().getMinSignedPerWindow();
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration downtimeJailDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> downtimeJailDurationBuilder_;
    /**
     * <code>.google.protobuf.Duration downtime_jail_duration = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"downtime_jail_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public boolean hasDowntimeJailDuration() {
      return downtimeJailDurationBuilder_ != null || downtimeJailDuration_ != null;
    }
    /**
     * <code>.google.protobuf.Duration downtime_jail_duration = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"downtime_jail_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.Duration getDowntimeJailDuration() {
      if (downtimeJailDurationBuilder_ == null) {
        return downtimeJailDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : downtimeJailDuration_;
      } else {
        return downtimeJailDurationBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Duration downtime_jail_duration = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"downtime_jail_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder setDowntimeJailDuration(com.google.protobuf.Duration value) {
      if (downtimeJailDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        downtimeJailDuration_ = value;
        onChanged();
      } else {
        downtimeJailDurationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration downtime_jail_duration = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"downtime_jail_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder setDowntimeJailDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (downtimeJailDurationBuilder_ == null) {
        downtimeJailDuration_ = builderForValue.build();
        onChanged();
      } else {
        downtimeJailDurationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration downtime_jail_duration = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"downtime_jail_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder mergeDowntimeJailDuration(com.google.protobuf.Duration value) {
      if (downtimeJailDurationBuilder_ == null) {
        if (downtimeJailDuration_ != null) {
          downtimeJailDuration_ =
            com.google.protobuf.Duration.newBuilder(downtimeJailDuration_).mergeFrom(value).buildPartial();
        } else {
          downtimeJailDuration_ = value;
        }
        onChanged();
      } else {
        downtimeJailDurationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration downtime_jail_duration = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"downtime_jail_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder clearDowntimeJailDuration() {
      if (downtimeJailDurationBuilder_ == null) {
        downtimeJailDuration_ = null;
        onChanged();
      } else {
        downtimeJailDuration_ = null;
        downtimeJailDurationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration downtime_jail_duration = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"downtime_jail_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.Duration.Builder getDowntimeJailDurationBuilder() {
      
      onChanged();
      return getDowntimeJailDurationFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Duration downtime_jail_duration = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"downtime_jail_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.DurationOrBuilder getDowntimeJailDurationOrBuilder() {
      if (downtimeJailDurationBuilder_ != null) {
        return downtimeJailDurationBuilder_.getMessageOrBuilder();
      } else {
        return downtimeJailDuration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : downtimeJailDuration_;
      }
    }
    /**
     * <code>.google.protobuf.Duration downtime_jail_duration = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"downtime_jail_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getDowntimeJailDurationFieldBuilder() {
      if (downtimeJailDurationBuilder_ == null) {
        downtimeJailDurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getDowntimeJailDuration(),
                getParentForChildren(),
                isClean());
        downtimeJailDuration_ = null;
      }
      return downtimeJailDurationBuilder_;
    }

    private com.google.protobuf.ByteString slashFractionDoubleSign_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes slash_fraction_double_sign = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"slash_fraction_double_sign&#92;""];</code>
     */
    public com.google.protobuf.ByteString getSlashFractionDoubleSign() {
      return slashFractionDoubleSign_;
    }
    /**
     * <code>bytes slash_fraction_double_sign = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"slash_fraction_double_sign&#92;""];</code>
     */
    public Builder setSlashFractionDoubleSign(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      slashFractionDoubleSign_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes slash_fraction_double_sign = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"slash_fraction_double_sign&#92;""];</code>
     */
    public Builder clearSlashFractionDoubleSign() {
      
      slashFractionDoubleSign_ = getDefaultInstance().getSlashFractionDoubleSign();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString slashFractionDowntime_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes slash_fraction_downtime = 5 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"slash_fraction_downtime&#92;""];</code>
     */
    public com.google.protobuf.ByteString getSlashFractionDowntime() {
      return slashFractionDowntime_;
    }
    /**
     * <code>bytes slash_fraction_downtime = 5 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"slash_fraction_downtime&#92;""];</code>
     */
    public Builder setSlashFractionDowntime(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      slashFractionDowntime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes slash_fraction_downtime = 5 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"slash_fraction_downtime&#92;""];</code>
     */
    public Builder clearSlashFractionDowntime() {
      
      slashFractionDowntime_ = getDefaultInstance().getSlashFractionDowntime();
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


    // @@protoc_insertion_point(builder_scope:cosmos.slashing.v1beta1.Params)
  }

  // @@protoc_insertion_point(class_scope:cosmos.slashing.v1beta1.Params)
  private static final cosmos.slashing.v1beta1.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.slashing.v1beta1.Params();
  }

  public static cosmos.slashing.v1beta1.Params getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Params>
      PARSER = new com.google.protobuf.AbstractParser<Params>() {
    @java.lang.Override
    public Params parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Params(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Params> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Params> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.slashing.v1beta1.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

