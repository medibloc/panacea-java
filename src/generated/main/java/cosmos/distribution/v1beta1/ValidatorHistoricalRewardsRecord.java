// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/genesis.proto

package cosmos.distribution.v1beta1;

/**
 * <pre>
 * ValidatorHistoricalRewardsRecord is used for import / export via genesis
 * json.
 * </pre>
 *
 * Protobuf type {@code cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord}
 */
public  final class ValidatorHistoricalRewardsRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord)
    ValidatorHistoricalRewardsRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidatorHistoricalRewardsRecord.newBuilder() to construct.
  private ValidatorHistoricalRewardsRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidatorHistoricalRewardsRecord() {
    validatorAddress_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ValidatorHistoricalRewardsRecord(
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

            validatorAddress_ = s;
            break;
          }
          case 16: {

            period_ = input.readUInt64();
            break;
          }
          case 26: {
            cosmos.distribution.v1beta1.ValidatorHistoricalRewards.Builder subBuilder = null;
            if (rewards_ != null) {
              subBuilder = rewards_.toBuilder();
            }
            rewards_ = input.readMessage(cosmos.distribution.v1beta1.ValidatorHistoricalRewards.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rewards_);
              rewards_ = subBuilder.buildPartial();
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
    return cosmos.distribution.v1beta1.Genesis.internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewardsRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.distribution.v1beta1.Genesis.internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewardsRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord.class, cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord.Builder.class);
  }

  public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object validatorAddress_;
  /**
   * <pre>
   * validator_address is the address of the validator.
   * </pre>
   *
   * <code>string validator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
   */
  public java.lang.String getValidatorAddress() {
    java.lang.Object ref = validatorAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      validatorAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * validator_address is the address of the validator.
   * </pre>
   *
   * <code>string validator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
   */
  public com.google.protobuf.ByteString
      getValidatorAddressBytes() {
    java.lang.Object ref = validatorAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      validatorAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERIOD_FIELD_NUMBER = 2;
  private long period_;
  /**
   * <pre>
   * period defines the period the historical rewards apply to.
   * </pre>
   *
   * <code>uint64 period = 2;</code>
   */
  public long getPeriod() {
    return period_;
  }

  public static final int REWARDS_FIELD_NUMBER = 3;
  private cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards_;
  /**
   * <pre>
   * rewards defines the historical rewards of a validator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
   */
  public boolean hasRewards() {
    return rewards_ != null;
  }
  /**
   * <pre>
   * rewards defines the historical rewards of a validator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
   */
  public cosmos.distribution.v1beta1.ValidatorHistoricalRewards getRewards() {
    return rewards_ == null ? cosmos.distribution.v1beta1.ValidatorHistoricalRewards.getDefaultInstance() : rewards_;
  }
  /**
   * <pre>
   * rewards defines the historical rewards of a validator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
   */
  public cosmos.distribution.v1beta1.ValidatorHistoricalRewardsOrBuilder getRewardsOrBuilder() {
    return getRewards();
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
    if (!getValidatorAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, validatorAddress_);
    }
    if (period_ != 0L) {
      output.writeUInt64(2, period_);
    }
    if (rewards_ != null) {
      output.writeMessage(3, getRewards());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getValidatorAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, validatorAddress_);
    }
    if (period_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, period_);
    }
    if (rewards_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRewards());
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
    if (!(obj instanceof cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord)) {
      return super.equals(obj);
    }
    cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord other = (cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord) obj;

    if (!getValidatorAddress()
        .equals(other.getValidatorAddress())) return false;
    if (getPeriod()
        != other.getPeriod()) return false;
    if (hasRewards() != other.hasRewards()) return false;
    if (hasRewards()) {
      if (!getRewards()
          .equals(other.getRewards())) return false;
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
    hash = (37 * hash) + VALIDATOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorAddress().hashCode();
    hash = (37 * hash) + PERIOD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPeriod());
    if (hasRewards()) {
      hash = (37 * hash) + REWARDS_FIELD_NUMBER;
      hash = (53 * hash) + getRewards().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord parseFrom(
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
  public static Builder newBuilder(cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord prototype) {
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
   * ValidatorHistoricalRewardsRecord is used for import / export via genesis
   * json.
   * </pre>
   *
   * Protobuf type {@code cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord)
      cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.distribution.v1beta1.Genesis.internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewardsRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.distribution.v1beta1.Genesis.internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewardsRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord.class, cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord.Builder.class);
    }

    // Construct using cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord.newBuilder()
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
      validatorAddress_ = "";

      period_ = 0L;

      if (rewardsBuilder_ == null) {
        rewards_ = null;
      } else {
        rewards_ = null;
        rewardsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.distribution.v1beta1.Genesis.internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewardsRecord_descriptor;
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord getDefaultInstanceForType() {
      return cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord build() {
      cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord buildPartial() {
      cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord result = new cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord(this);
      result.validatorAddress_ = validatorAddress_;
      result.period_ = period_;
      if (rewardsBuilder_ == null) {
        result.rewards_ = rewards_;
      } else {
        result.rewards_ = rewardsBuilder_.build();
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
      if (other instanceof cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord) {
        return mergeFrom((cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord other) {
      if (other == cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord.getDefaultInstance()) return this;
      if (!other.getValidatorAddress().isEmpty()) {
        validatorAddress_ = other.validatorAddress_;
        onChanged();
      }
      if (other.getPeriod() != 0L) {
        setPeriod(other.getPeriod());
      }
      if (other.hasRewards()) {
        mergeRewards(other.getRewards());
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
      cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object validatorAddress_ = "";
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
     */
    public java.lang.String getValidatorAddress() {
      java.lang.Object ref = validatorAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        validatorAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
     */
    public com.google.protobuf.ByteString
        getValidatorAddressBytes() {
      java.lang.Object ref = validatorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        validatorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
     */
    public Builder setValidatorAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      validatorAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
     */
    public Builder clearValidatorAddress() {
      
      validatorAddress_ = getDefaultInstance().getValidatorAddress();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
     */
    public Builder setValidatorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      validatorAddress_ = value;
      onChanged();
      return this;
    }

    private long period_ ;
    /**
     * <pre>
     * period defines the period the historical rewards apply to.
     * </pre>
     *
     * <code>uint64 period = 2;</code>
     */
    public long getPeriod() {
      return period_;
    }
    /**
     * <pre>
     * period defines the period the historical rewards apply to.
     * </pre>
     *
     * <code>uint64 period = 2;</code>
     */
    public Builder setPeriod(long value) {
      
      period_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * period defines the period the historical rewards apply to.
     * </pre>
     *
     * <code>uint64 period = 2;</code>
     */
    public Builder clearPeriod() {
      
      period_ = 0L;
      onChanged();
      return this;
    }

    private cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.distribution.v1beta1.ValidatorHistoricalRewards, cosmos.distribution.v1beta1.ValidatorHistoricalRewards.Builder, cosmos.distribution.v1beta1.ValidatorHistoricalRewardsOrBuilder> rewardsBuilder_;
    /**
     * <pre>
     * rewards defines the historical rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
     */
    public boolean hasRewards() {
      return rewardsBuilder_ != null || rewards_ != null;
    }
    /**
     * <pre>
     * rewards defines the historical rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
     */
    public cosmos.distribution.v1beta1.ValidatorHistoricalRewards getRewards() {
      if (rewardsBuilder_ == null) {
        return rewards_ == null ? cosmos.distribution.v1beta1.ValidatorHistoricalRewards.getDefaultInstance() : rewards_;
      } else {
        return rewardsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * rewards defines the historical rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
     */
    public Builder setRewards(cosmos.distribution.v1beta1.ValidatorHistoricalRewards value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rewards_ = value;
        onChanged();
      } else {
        rewardsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * rewards defines the historical rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
     */
    public Builder setRewards(
        cosmos.distribution.v1beta1.ValidatorHistoricalRewards.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        rewards_ = builderForValue.build();
        onChanged();
      } else {
        rewardsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * rewards defines the historical rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
     */
    public Builder mergeRewards(cosmos.distribution.v1beta1.ValidatorHistoricalRewards value) {
      if (rewardsBuilder_ == null) {
        if (rewards_ != null) {
          rewards_ =
            cosmos.distribution.v1beta1.ValidatorHistoricalRewards.newBuilder(rewards_).mergeFrom(value).buildPartial();
        } else {
          rewards_ = value;
        }
        onChanged();
      } else {
        rewardsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * rewards defines the historical rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
     */
    public Builder clearRewards() {
      if (rewardsBuilder_ == null) {
        rewards_ = null;
        onChanged();
      } else {
        rewards_ = null;
        rewardsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * rewards defines the historical rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
     */
    public cosmos.distribution.v1beta1.ValidatorHistoricalRewards.Builder getRewardsBuilder() {
      
      onChanged();
      return getRewardsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * rewards defines the historical rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
     */
    public cosmos.distribution.v1beta1.ValidatorHistoricalRewardsOrBuilder getRewardsOrBuilder() {
      if (rewardsBuilder_ != null) {
        return rewardsBuilder_.getMessageOrBuilder();
      } else {
        return rewards_ == null ?
            cosmos.distribution.v1beta1.ValidatorHistoricalRewards.getDefaultInstance() : rewards_;
      }
    }
    /**
     * <pre>
     * rewards defines the historical rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.distribution.v1beta1.ValidatorHistoricalRewards, cosmos.distribution.v1beta1.ValidatorHistoricalRewards.Builder, cosmos.distribution.v1beta1.ValidatorHistoricalRewardsOrBuilder> 
        getRewardsFieldBuilder() {
      if (rewardsBuilder_ == null) {
        rewardsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.distribution.v1beta1.ValidatorHistoricalRewards, cosmos.distribution.v1beta1.ValidatorHistoricalRewards.Builder, cosmos.distribution.v1beta1.ValidatorHistoricalRewardsOrBuilder>(
                getRewards(),
                getParentForChildren(),
                isClean());
        rewards_ = null;
      }
      return rewardsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord)
  }

  // @@protoc_insertion_point(class_scope:cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord)
  private static final cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord();
  }

  public static cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidatorHistoricalRewardsRecord>
      PARSER = new com.google.protobuf.AbstractParser<ValidatorHistoricalRewardsRecord>() {
    @java.lang.Override
    public ValidatorHistoricalRewardsRecord parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ValidatorHistoricalRewardsRecord(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ValidatorHistoricalRewardsRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidatorHistoricalRewardsRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

