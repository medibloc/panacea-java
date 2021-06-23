// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/validator.proto

package tendermint.types;

/**
 * Protobuf type {@code tendermint.types.ValidatorSet}
 */
public  final class ValidatorSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.types.ValidatorSet)
    ValidatorSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidatorSet.newBuilder() to construct.
  private ValidatorSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidatorSet() {
    validators_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ValidatorSet(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              validators_ = new java.util.ArrayList<tendermint.types.Validator>();
              mutable_bitField0_ |= 0x00000001;
            }
            validators_.add(
                input.readMessage(tendermint.types.Validator.parser(), extensionRegistry));
            break;
          }
          case 18: {
            tendermint.types.Validator.Builder subBuilder = null;
            if (proposer_ != null) {
              subBuilder = proposer_.toBuilder();
            }
            proposer_ = input.readMessage(tendermint.types.Validator.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(proposer_);
              proposer_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            totalVotingPower_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        validators_ = java.util.Collections.unmodifiableList(validators_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tendermint.types.ValidatorOuterClass.internal_static_tendermint_types_ValidatorSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tendermint.types.ValidatorOuterClass.internal_static_tendermint_types_ValidatorSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tendermint.types.ValidatorSet.class, tendermint.types.ValidatorSet.Builder.class);
  }

  private int bitField0_;
  public static final int VALIDATORS_FIELD_NUMBER = 1;
  private java.util.List<tendermint.types.Validator> validators_;
  /**
   * <code>repeated .tendermint.types.Validator validators = 1;</code>
   */
  public java.util.List<tendermint.types.Validator> getValidatorsList() {
    return validators_;
  }
  /**
   * <code>repeated .tendermint.types.Validator validators = 1;</code>
   */
  public java.util.List<? extends tendermint.types.ValidatorOrBuilder> 
      getValidatorsOrBuilderList() {
    return validators_;
  }
  /**
   * <code>repeated .tendermint.types.Validator validators = 1;</code>
   */
  public int getValidatorsCount() {
    return validators_.size();
  }
  /**
   * <code>repeated .tendermint.types.Validator validators = 1;</code>
   */
  public tendermint.types.Validator getValidators(int index) {
    return validators_.get(index);
  }
  /**
   * <code>repeated .tendermint.types.Validator validators = 1;</code>
   */
  public tendermint.types.ValidatorOrBuilder getValidatorsOrBuilder(
      int index) {
    return validators_.get(index);
  }

  public static final int PROPOSER_FIELD_NUMBER = 2;
  private tendermint.types.Validator proposer_;
  /**
   * <code>.tendermint.types.Validator proposer = 2;</code>
   */
  public boolean hasProposer() {
    return proposer_ != null;
  }
  /**
   * <code>.tendermint.types.Validator proposer = 2;</code>
   */
  public tendermint.types.Validator getProposer() {
    return proposer_ == null ? tendermint.types.Validator.getDefaultInstance() : proposer_;
  }
  /**
   * <code>.tendermint.types.Validator proposer = 2;</code>
   */
  public tendermint.types.ValidatorOrBuilder getProposerOrBuilder() {
    return getProposer();
  }

  public static final int TOTAL_VOTING_POWER_FIELD_NUMBER = 3;
  private long totalVotingPower_;
  /**
   * <code>int64 total_voting_power = 3;</code>
   */
  public long getTotalVotingPower() {
    return totalVotingPower_;
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
    for (int i = 0; i < validators_.size(); i++) {
      output.writeMessage(1, validators_.get(i));
    }
    if (proposer_ != null) {
      output.writeMessage(2, getProposer());
    }
    if (totalVotingPower_ != 0L) {
      output.writeInt64(3, totalVotingPower_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < validators_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, validators_.get(i));
    }
    if (proposer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProposer());
    }
    if (totalVotingPower_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, totalVotingPower_);
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
    if (!(obj instanceof tendermint.types.ValidatorSet)) {
      return super.equals(obj);
    }
    tendermint.types.ValidatorSet other = (tendermint.types.ValidatorSet) obj;

    if (!getValidatorsList()
        .equals(other.getValidatorsList())) return false;
    if (hasProposer() != other.hasProposer()) return false;
    if (hasProposer()) {
      if (!getProposer()
          .equals(other.getProposer())) return false;
    }
    if (getTotalVotingPower()
        != other.getTotalVotingPower()) return false;
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
    if (getValidatorsCount() > 0) {
      hash = (37 * hash) + VALIDATORS_FIELD_NUMBER;
      hash = (53 * hash) + getValidatorsList().hashCode();
    }
    if (hasProposer()) {
      hash = (37 * hash) + PROPOSER_FIELD_NUMBER;
      hash = (53 * hash) + getProposer().hashCode();
    }
    hash = (37 * hash) + TOTAL_VOTING_POWER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalVotingPower());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tendermint.types.ValidatorSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tendermint.types.ValidatorSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tendermint.types.ValidatorSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tendermint.types.ValidatorSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tendermint.types.ValidatorSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tendermint.types.ValidatorSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tendermint.types.ValidatorSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tendermint.types.ValidatorSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tendermint.types.ValidatorSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tendermint.types.ValidatorSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tendermint.types.ValidatorSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tendermint.types.ValidatorSet parseFrom(
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
  public static Builder newBuilder(tendermint.types.ValidatorSet prototype) {
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
   * Protobuf type {@code tendermint.types.ValidatorSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.types.ValidatorSet)
      tendermint.types.ValidatorSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tendermint.types.ValidatorOuterClass.internal_static_tendermint_types_ValidatorSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tendermint.types.ValidatorOuterClass.internal_static_tendermint_types_ValidatorSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tendermint.types.ValidatorSet.class, tendermint.types.ValidatorSet.Builder.class);
    }

    // Construct using tendermint.types.ValidatorSet.newBuilder()
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
        getValidatorsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (validatorsBuilder_ == null) {
        validators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        validatorsBuilder_.clear();
      }
      if (proposerBuilder_ == null) {
        proposer_ = null;
      } else {
        proposer_ = null;
        proposerBuilder_ = null;
      }
      totalVotingPower_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tendermint.types.ValidatorOuterClass.internal_static_tendermint_types_ValidatorSet_descriptor;
    }

    @java.lang.Override
    public tendermint.types.ValidatorSet getDefaultInstanceForType() {
      return tendermint.types.ValidatorSet.getDefaultInstance();
    }

    @java.lang.Override
    public tendermint.types.ValidatorSet build() {
      tendermint.types.ValidatorSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tendermint.types.ValidatorSet buildPartial() {
      tendermint.types.ValidatorSet result = new tendermint.types.ValidatorSet(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (validatorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          validators_ = java.util.Collections.unmodifiableList(validators_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.validators_ = validators_;
      } else {
        result.validators_ = validatorsBuilder_.build();
      }
      if (proposerBuilder_ == null) {
        result.proposer_ = proposer_;
      } else {
        result.proposer_ = proposerBuilder_.build();
      }
      result.totalVotingPower_ = totalVotingPower_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof tendermint.types.ValidatorSet) {
        return mergeFrom((tendermint.types.ValidatorSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tendermint.types.ValidatorSet other) {
      if (other == tendermint.types.ValidatorSet.getDefaultInstance()) return this;
      if (validatorsBuilder_ == null) {
        if (!other.validators_.isEmpty()) {
          if (validators_.isEmpty()) {
            validators_ = other.validators_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValidatorsIsMutable();
            validators_.addAll(other.validators_);
          }
          onChanged();
        }
      } else {
        if (!other.validators_.isEmpty()) {
          if (validatorsBuilder_.isEmpty()) {
            validatorsBuilder_.dispose();
            validatorsBuilder_ = null;
            validators_ = other.validators_;
            bitField0_ = (bitField0_ & ~0x00000001);
            validatorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValidatorsFieldBuilder() : null;
          } else {
            validatorsBuilder_.addAllMessages(other.validators_);
          }
        }
      }
      if (other.hasProposer()) {
        mergeProposer(other.getProposer());
      }
      if (other.getTotalVotingPower() != 0L) {
        setTotalVotingPower(other.getTotalVotingPower());
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
      tendermint.types.ValidatorSet parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tendermint.types.ValidatorSet) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<tendermint.types.Validator> validators_ =
      java.util.Collections.emptyList();
    private void ensureValidatorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        validators_ = new java.util.ArrayList<tendermint.types.Validator>(validators_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        tendermint.types.Validator, tendermint.types.Validator.Builder, tendermint.types.ValidatorOrBuilder> validatorsBuilder_;

    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public java.util.List<tendermint.types.Validator> getValidatorsList() {
      if (validatorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(validators_);
      } else {
        return validatorsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public int getValidatorsCount() {
      if (validatorsBuilder_ == null) {
        return validators_.size();
      } else {
        return validatorsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public tendermint.types.Validator getValidators(int index) {
      if (validatorsBuilder_ == null) {
        return validators_.get(index);
      } else {
        return validatorsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public Builder setValidators(
        int index, tendermint.types.Validator value) {
      if (validatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValidatorsIsMutable();
        validators_.set(index, value);
        onChanged();
      } else {
        validatorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public Builder setValidators(
        int index, tendermint.types.Validator.Builder builderForValue) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        validators_.set(index, builderForValue.build());
        onChanged();
      } else {
        validatorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public Builder addValidators(tendermint.types.Validator value) {
      if (validatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValidatorsIsMutable();
        validators_.add(value);
        onChanged();
      } else {
        validatorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public Builder addValidators(
        int index, tendermint.types.Validator value) {
      if (validatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValidatorsIsMutable();
        validators_.add(index, value);
        onChanged();
      } else {
        validatorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public Builder addValidators(
        tendermint.types.Validator.Builder builderForValue) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        validators_.add(builderForValue.build());
        onChanged();
      } else {
        validatorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public Builder addValidators(
        int index, tendermint.types.Validator.Builder builderForValue) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        validators_.add(index, builderForValue.build());
        onChanged();
      } else {
        validatorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public Builder addAllValidators(
        java.lang.Iterable<? extends tendermint.types.Validator> values) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, validators_);
        onChanged();
      } else {
        validatorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public Builder clearValidators() {
      if (validatorsBuilder_ == null) {
        validators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        validatorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public Builder removeValidators(int index) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        validators_.remove(index);
        onChanged();
      } else {
        validatorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public tendermint.types.Validator.Builder getValidatorsBuilder(
        int index) {
      return getValidatorsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public tendermint.types.ValidatorOrBuilder getValidatorsOrBuilder(
        int index) {
      if (validatorsBuilder_ == null) {
        return validators_.get(index);  } else {
        return validatorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public java.util.List<? extends tendermint.types.ValidatorOrBuilder> 
         getValidatorsOrBuilderList() {
      if (validatorsBuilder_ != null) {
        return validatorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(validators_);
      }
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public tendermint.types.Validator.Builder addValidatorsBuilder() {
      return getValidatorsFieldBuilder().addBuilder(
          tendermint.types.Validator.getDefaultInstance());
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public tendermint.types.Validator.Builder addValidatorsBuilder(
        int index) {
      return getValidatorsFieldBuilder().addBuilder(
          index, tendermint.types.Validator.getDefaultInstance());
    }
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    public java.util.List<tendermint.types.Validator.Builder> 
         getValidatorsBuilderList() {
      return getValidatorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        tendermint.types.Validator, tendermint.types.Validator.Builder, tendermint.types.ValidatorOrBuilder> 
        getValidatorsFieldBuilder() {
      if (validatorsBuilder_ == null) {
        validatorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            tendermint.types.Validator, tendermint.types.Validator.Builder, tendermint.types.ValidatorOrBuilder>(
                validators_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        validators_ = null;
      }
      return validatorsBuilder_;
    }

    private tendermint.types.Validator proposer_;
    private com.google.protobuf.SingleFieldBuilderV3<
        tendermint.types.Validator, tendermint.types.Validator.Builder, tendermint.types.ValidatorOrBuilder> proposerBuilder_;
    /**
     * <code>.tendermint.types.Validator proposer = 2;</code>
     */
    public boolean hasProposer() {
      return proposerBuilder_ != null || proposer_ != null;
    }
    /**
     * <code>.tendermint.types.Validator proposer = 2;</code>
     */
    public tendermint.types.Validator getProposer() {
      if (proposerBuilder_ == null) {
        return proposer_ == null ? tendermint.types.Validator.getDefaultInstance() : proposer_;
      } else {
        return proposerBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.types.Validator proposer = 2;</code>
     */
    public Builder setProposer(tendermint.types.Validator value) {
      if (proposerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proposer_ = value;
        onChanged();
      } else {
        proposerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tendermint.types.Validator proposer = 2;</code>
     */
    public Builder setProposer(
        tendermint.types.Validator.Builder builderForValue) {
      if (proposerBuilder_ == null) {
        proposer_ = builderForValue.build();
        onChanged();
      } else {
        proposerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tendermint.types.Validator proposer = 2;</code>
     */
    public Builder mergeProposer(tendermint.types.Validator value) {
      if (proposerBuilder_ == null) {
        if (proposer_ != null) {
          proposer_ =
            tendermint.types.Validator.newBuilder(proposer_).mergeFrom(value).buildPartial();
        } else {
          proposer_ = value;
        }
        onChanged();
      } else {
        proposerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tendermint.types.Validator proposer = 2;</code>
     */
    public Builder clearProposer() {
      if (proposerBuilder_ == null) {
        proposer_ = null;
        onChanged();
      } else {
        proposer_ = null;
        proposerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tendermint.types.Validator proposer = 2;</code>
     */
    public tendermint.types.Validator.Builder getProposerBuilder() {
      
      onChanged();
      return getProposerFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.types.Validator proposer = 2;</code>
     */
    public tendermint.types.ValidatorOrBuilder getProposerOrBuilder() {
      if (proposerBuilder_ != null) {
        return proposerBuilder_.getMessageOrBuilder();
      } else {
        return proposer_ == null ?
            tendermint.types.Validator.getDefaultInstance() : proposer_;
      }
    }
    /**
     * <code>.tendermint.types.Validator proposer = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tendermint.types.Validator, tendermint.types.Validator.Builder, tendermint.types.ValidatorOrBuilder> 
        getProposerFieldBuilder() {
      if (proposerBuilder_ == null) {
        proposerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tendermint.types.Validator, tendermint.types.Validator.Builder, tendermint.types.ValidatorOrBuilder>(
                getProposer(),
                getParentForChildren(),
                isClean());
        proposer_ = null;
      }
      return proposerBuilder_;
    }

    private long totalVotingPower_ ;
    /**
     * <code>int64 total_voting_power = 3;</code>
     */
    public long getTotalVotingPower() {
      return totalVotingPower_;
    }
    /**
     * <code>int64 total_voting_power = 3;</code>
     */
    public Builder setTotalVotingPower(long value) {
      
      totalVotingPower_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total_voting_power = 3;</code>
     */
    public Builder clearTotalVotingPower() {
      
      totalVotingPower_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tendermint.types.ValidatorSet)
  }

  // @@protoc_insertion_point(class_scope:tendermint.types.ValidatorSet)
  private static final tendermint.types.ValidatorSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tendermint.types.ValidatorSet();
  }

  public static tendermint.types.ValidatorSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidatorSet>
      PARSER = new com.google.protobuf.AbstractParser<ValidatorSet>() {
    @java.lang.Override
    public ValidatorSet parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ValidatorSet(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ValidatorSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidatorSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tendermint.types.ValidatorSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
