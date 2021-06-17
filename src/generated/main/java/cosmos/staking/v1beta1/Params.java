// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package cosmos.staking.v1beta1;

/**
 * <pre>
 * Params defines the parameters for the staking module.
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.Params}
 */
public  final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
    bondDenom_ = "";
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
          case 10: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (unbondingTime_ != null) {
              subBuilder = unbondingTime_.toBuilder();
            }
            unbondingTime_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(unbondingTime_);
              unbondingTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            maxValidators_ = input.readUInt32();
            break;
          }
          case 24: {

            maxEntries_ = input.readUInt32();
            break;
          }
          case 32: {

            historicalEntries_ = input.readUInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            bondDenom_ = s;
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
    return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.staking.v1beta1.Params.class, cosmos.staking.v1beta1.Params.Builder.class);
  }

  public static final int UNBONDING_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration unbondingTime_;
  /**
   * <pre>
   * unbonding_time is the time duration of unbonding.
   * </pre>
   *
   * <code>.google.protobuf.Duration unbonding_time = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_time&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  public boolean hasUnbondingTime() {
    return unbondingTime_ != null;
  }
  /**
   * <pre>
   * unbonding_time is the time duration of unbonding.
   * </pre>
   *
   * <code>.google.protobuf.Duration unbonding_time = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_time&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  public com.google.protobuf.Duration getUnbondingTime() {
    return unbondingTime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : unbondingTime_;
  }
  /**
   * <pre>
   * unbonding_time is the time duration of unbonding.
   * </pre>
   *
   * <code>.google.protobuf.Duration unbonding_time = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_time&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  public com.google.protobuf.DurationOrBuilder getUnbondingTimeOrBuilder() {
    return getUnbondingTime();
  }

  public static final int MAX_VALIDATORS_FIELD_NUMBER = 2;
  private int maxValidators_;
  /**
   * <pre>
   * max_validators is the maximum number of validators.
   * </pre>
   *
   * <code>uint32 max_validators = 2 [(.gogoproto.moretags) = "yaml:&#92;"max_validators&#92;""];</code>
   */
  public int getMaxValidators() {
    return maxValidators_;
  }

  public static final int MAX_ENTRIES_FIELD_NUMBER = 3;
  private int maxEntries_;
  /**
   * <pre>
   * max_entries is the max entries for either unbonding delegation or redelegation (per pair/trio).
   * </pre>
   *
   * <code>uint32 max_entries = 3 [(.gogoproto.moretags) = "yaml:&#92;"max_entries&#92;""];</code>
   */
  public int getMaxEntries() {
    return maxEntries_;
  }

  public static final int HISTORICAL_ENTRIES_FIELD_NUMBER = 4;
  private int historicalEntries_;
  /**
   * <pre>
   * historical_entries is the number of historical entries to persist.
   * </pre>
   *
   * <code>uint32 historical_entries = 4 [(.gogoproto.moretags) = "yaml:&#92;"historical_entries&#92;""];</code>
   */
  public int getHistoricalEntries() {
    return historicalEntries_;
  }

  public static final int BOND_DENOM_FIELD_NUMBER = 5;
  private volatile java.lang.Object bondDenom_;
  /**
   * <pre>
   * bond_denom defines the bondable coin denomination.
   * </pre>
   *
   * <code>string bond_denom = 5 [(.gogoproto.moretags) = "yaml:&#92;"bond_denom&#92;""];</code>
   */
  public java.lang.String getBondDenom() {
    java.lang.Object ref = bondDenom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bondDenom_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * bond_denom defines the bondable coin denomination.
   * </pre>
   *
   * <code>string bond_denom = 5 [(.gogoproto.moretags) = "yaml:&#92;"bond_denom&#92;""];</code>
   */
  public com.google.protobuf.ByteString
      getBondDenomBytes() {
    java.lang.Object ref = bondDenom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bondDenom_ = b;
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
    if (unbondingTime_ != null) {
      output.writeMessage(1, getUnbondingTime());
    }
    if (maxValidators_ != 0) {
      output.writeUInt32(2, maxValidators_);
    }
    if (maxEntries_ != 0) {
      output.writeUInt32(3, maxEntries_);
    }
    if (historicalEntries_ != 0) {
      output.writeUInt32(4, historicalEntries_);
    }
    if (!getBondDenomBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, bondDenom_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (unbondingTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUnbondingTime());
    }
    if (maxValidators_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, maxValidators_);
    }
    if (maxEntries_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, maxEntries_);
    }
    if (historicalEntries_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, historicalEntries_);
    }
    if (!getBondDenomBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, bondDenom_);
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
    if (!(obj instanceof cosmos.staking.v1beta1.Params)) {
      return super.equals(obj);
    }
    cosmos.staking.v1beta1.Params other = (cosmos.staking.v1beta1.Params) obj;

    if (hasUnbondingTime() != other.hasUnbondingTime()) return false;
    if (hasUnbondingTime()) {
      if (!getUnbondingTime()
          .equals(other.getUnbondingTime())) return false;
    }
    if (getMaxValidators()
        != other.getMaxValidators()) return false;
    if (getMaxEntries()
        != other.getMaxEntries()) return false;
    if (getHistoricalEntries()
        != other.getHistoricalEntries()) return false;
    if (!getBondDenom()
        .equals(other.getBondDenom())) return false;
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
    if (hasUnbondingTime()) {
      hash = (37 * hash) + UNBONDING_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUnbondingTime().hashCode();
    }
    hash = (37 * hash) + MAX_VALIDATORS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxValidators();
    hash = (37 * hash) + MAX_ENTRIES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxEntries();
    hash = (37 * hash) + HISTORICAL_ENTRIES_FIELD_NUMBER;
    hash = (53 * hash) + getHistoricalEntries();
    hash = (37 * hash) + BOND_DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getBondDenom().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.staking.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.Params parseFrom(
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
  public static Builder newBuilder(cosmos.staking.v1beta1.Params prototype) {
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
   * Params defines the parameters for the staking module.
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.Params)
      cosmos.staking.v1beta1.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.staking.v1beta1.Params.class, cosmos.staking.v1beta1.Params.Builder.class);
    }

    // Construct using cosmos.staking.v1beta1.Params.newBuilder()
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
      if (unbondingTimeBuilder_ == null) {
        unbondingTime_ = null;
      } else {
        unbondingTime_ = null;
        unbondingTimeBuilder_ = null;
      }
      maxValidators_ = 0;

      maxEntries_ = 0;

      historicalEntries_ = 0;

      bondDenom_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.Params getDefaultInstanceForType() {
      return cosmos.staking.v1beta1.Params.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.Params build() {
      cosmos.staking.v1beta1.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.Params buildPartial() {
      cosmos.staking.v1beta1.Params result = new cosmos.staking.v1beta1.Params(this);
      if (unbondingTimeBuilder_ == null) {
        result.unbondingTime_ = unbondingTime_;
      } else {
        result.unbondingTime_ = unbondingTimeBuilder_.build();
      }
      result.maxValidators_ = maxValidators_;
      result.maxEntries_ = maxEntries_;
      result.historicalEntries_ = historicalEntries_;
      result.bondDenom_ = bondDenom_;
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
      if (other instanceof cosmos.staking.v1beta1.Params) {
        return mergeFrom((cosmos.staking.v1beta1.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.staking.v1beta1.Params other) {
      if (other == cosmos.staking.v1beta1.Params.getDefaultInstance()) return this;
      if (other.hasUnbondingTime()) {
        mergeUnbondingTime(other.getUnbondingTime());
      }
      if (other.getMaxValidators() != 0) {
        setMaxValidators(other.getMaxValidators());
      }
      if (other.getMaxEntries() != 0) {
        setMaxEntries(other.getMaxEntries());
      }
      if (other.getHistoricalEntries() != 0) {
        setHistoricalEntries(other.getHistoricalEntries());
      }
      if (!other.getBondDenom().isEmpty()) {
        bondDenom_ = other.bondDenom_;
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
      cosmos.staking.v1beta1.Params parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.staking.v1beta1.Params) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Duration unbondingTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> unbondingTimeBuilder_;
    /**
     * <pre>
     * unbonding_time is the time duration of unbonding.
     * </pre>
     *
     * <code>.google.protobuf.Duration unbonding_time = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_time&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public boolean hasUnbondingTime() {
      return unbondingTimeBuilder_ != null || unbondingTime_ != null;
    }
    /**
     * <pre>
     * unbonding_time is the time duration of unbonding.
     * </pre>
     *
     * <code>.google.protobuf.Duration unbonding_time = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_time&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.Duration getUnbondingTime() {
      if (unbondingTimeBuilder_ == null) {
        return unbondingTime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : unbondingTime_;
      } else {
        return unbondingTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * unbonding_time is the time duration of unbonding.
     * </pre>
     *
     * <code>.google.protobuf.Duration unbonding_time = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_time&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder setUnbondingTime(com.google.protobuf.Duration value) {
      if (unbondingTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        unbondingTime_ = value;
        onChanged();
      } else {
        unbondingTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * unbonding_time is the time duration of unbonding.
     * </pre>
     *
     * <code>.google.protobuf.Duration unbonding_time = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_time&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder setUnbondingTime(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (unbondingTimeBuilder_ == null) {
        unbondingTime_ = builderForValue.build();
        onChanged();
      } else {
        unbondingTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * unbonding_time is the time duration of unbonding.
     * </pre>
     *
     * <code>.google.protobuf.Duration unbonding_time = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_time&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder mergeUnbondingTime(com.google.protobuf.Duration value) {
      if (unbondingTimeBuilder_ == null) {
        if (unbondingTime_ != null) {
          unbondingTime_ =
            com.google.protobuf.Duration.newBuilder(unbondingTime_).mergeFrom(value).buildPartial();
        } else {
          unbondingTime_ = value;
        }
        onChanged();
      } else {
        unbondingTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * unbonding_time is the time duration of unbonding.
     * </pre>
     *
     * <code>.google.protobuf.Duration unbonding_time = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_time&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder clearUnbondingTime() {
      if (unbondingTimeBuilder_ == null) {
        unbondingTime_ = null;
        onChanged();
      } else {
        unbondingTime_ = null;
        unbondingTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * unbonding_time is the time duration of unbonding.
     * </pre>
     *
     * <code>.google.protobuf.Duration unbonding_time = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_time&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.Duration.Builder getUnbondingTimeBuilder() {
      
      onChanged();
      return getUnbondingTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * unbonding_time is the time duration of unbonding.
     * </pre>
     *
     * <code>.google.protobuf.Duration unbonding_time = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_time&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.DurationOrBuilder getUnbondingTimeOrBuilder() {
      if (unbondingTimeBuilder_ != null) {
        return unbondingTimeBuilder_.getMessageOrBuilder();
      } else {
        return unbondingTime_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : unbondingTime_;
      }
    }
    /**
     * <pre>
     * unbonding_time is the time duration of unbonding.
     * </pre>
     *
     * <code>.google.protobuf.Duration unbonding_time = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_time&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getUnbondingTimeFieldBuilder() {
      if (unbondingTimeBuilder_ == null) {
        unbondingTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getUnbondingTime(),
                getParentForChildren(),
                isClean());
        unbondingTime_ = null;
      }
      return unbondingTimeBuilder_;
    }

    private int maxValidators_ ;
    /**
     * <pre>
     * max_validators is the maximum number of validators.
     * </pre>
     *
     * <code>uint32 max_validators = 2 [(.gogoproto.moretags) = "yaml:&#92;"max_validators&#92;""];</code>
     */
    public int getMaxValidators() {
      return maxValidators_;
    }
    /**
     * <pre>
     * max_validators is the maximum number of validators.
     * </pre>
     *
     * <code>uint32 max_validators = 2 [(.gogoproto.moretags) = "yaml:&#92;"max_validators&#92;""];</code>
     */
    public Builder setMaxValidators(int value) {
      
      maxValidators_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * max_validators is the maximum number of validators.
     * </pre>
     *
     * <code>uint32 max_validators = 2 [(.gogoproto.moretags) = "yaml:&#92;"max_validators&#92;""];</code>
     */
    public Builder clearMaxValidators() {
      
      maxValidators_ = 0;
      onChanged();
      return this;
    }

    private int maxEntries_ ;
    /**
     * <pre>
     * max_entries is the max entries for either unbonding delegation or redelegation (per pair/trio).
     * </pre>
     *
     * <code>uint32 max_entries = 3 [(.gogoproto.moretags) = "yaml:&#92;"max_entries&#92;""];</code>
     */
    public int getMaxEntries() {
      return maxEntries_;
    }
    /**
     * <pre>
     * max_entries is the max entries for either unbonding delegation or redelegation (per pair/trio).
     * </pre>
     *
     * <code>uint32 max_entries = 3 [(.gogoproto.moretags) = "yaml:&#92;"max_entries&#92;""];</code>
     */
    public Builder setMaxEntries(int value) {
      
      maxEntries_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * max_entries is the max entries for either unbonding delegation or redelegation (per pair/trio).
     * </pre>
     *
     * <code>uint32 max_entries = 3 [(.gogoproto.moretags) = "yaml:&#92;"max_entries&#92;""];</code>
     */
    public Builder clearMaxEntries() {
      
      maxEntries_ = 0;
      onChanged();
      return this;
    }

    private int historicalEntries_ ;
    /**
     * <pre>
     * historical_entries is the number of historical entries to persist.
     * </pre>
     *
     * <code>uint32 historical_entries = 4 [(.gogoproto.moretags) = "yaml:&#92;"historical_entries&#92;""];</code>
     */
    public int getHistoricalEntries() {
      return historicalEntries_;
    }
    /**
     * <pre>
     * historical_entries is the number of historical entries to persist.
     * </pre>
     *
     * <code>uint32 historical_entries = 4 [(.gogoproto.moretags) = "yaml:&#92;"historical_entries&#92;""];</code>
     */
    public Builder setHistoricalEntries(int value) {
      
      historicalEntries_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * historical_entries is the number of historical entries to persist.
     * </pre>
     *
     * <code>uint32 historical_entries = 4 [(.gogoproto.moretags) = "yaml:&#92;"historical_entries&#92;""];</code>
     */
    public Builder clearHistoricalEntries() {
      
      historicalEntries_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object bondDenom_ = "";
    /**
     * <pre>
     * bond_denom defines the bondable coin denomination.
     * </pre>
     *
     * <code>string bond_denom = 5 [(.gogoproto.moretags) = "yaml:&#92;"bond_denom&#92;""];</code>
     */
    public java.lang.String getBondDenom() {
      java.lang.Object ref = bondDenom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bondDenom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * bond_denom defines the bondable coin denomination.
     * </pre>
     *
     * <code>string bond_denom = 5 [(.gogoproto.moretags) = "yaml:&#92;"bond_denom&#92;""];</code>
     */
    public com.google.protobuf.ByteString
        getBondDenomBytes() {
      java.lang.Object ref = bondDenom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bondDenom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * bond_denom defines the bondable coin denomination.
     * </pre>
     *
     * <code>string bond_denom = 5 [(.gogoproto.moretags) = "yaml:&#92;"bond_denom&#92;""];</code>
     */
    public Builder setBondDenom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bondDenom_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bond_denom defines the bondable coin denomination.
     * </pre>
     *
     * <code>string bond_denom = 5 [(.gogoproto.moretags) = "yaml:&#92;"bond_denom&#92;""];</code>
     */
    public Builder clearBondDenom() {
      
      bondDenom_ = getDefaultInstance().getBondDenom();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bond_denom defines the bondable coin denomination.
     * </pre>
     *
     * <code>string bond_denom = 5 [(.gogoproto.moretags) = "yaml:&#92;"bond_denom&#92;""];</code>
     */
    public Builder setBondDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bondDenom_ = value;
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.Params)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.Params)
  private static final cosmos.staking.v1beta1.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.staking.v1beta1.Params();
  }

  public static cosmos.staking.v1beta1.Params getDefaultInstance() {
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
  public cosmos.staking.v1beta1.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

