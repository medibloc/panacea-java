// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/query.proto

package cosmos.distribution.v1beta1;

/**
 * <pre>
 * QueryDelegationRewardsResponse is the response type for the
 * Query/DelegationRewards RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.distribution.v1beta1.QueryDelegationRewardsResponse}
 */
public  final class QueryDelegationRewardsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.distribution.v1beta1.QueryDelegationRewardsResponse)
    QueryDelegationRewardsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDelegationRewardsResponse.newBuilder() to construct.
  private QueryDelegationRewardsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDelegationRewardsResponse() {
    rewards_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryDelegationRewardsResponse(
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
              rewards_ = new java.util.ArrayList<cosmos.base.v1beta1.DecCoin>();
              mutable_bitField0_ |= 0x00000001;
            }
            rewards_.add(
                input.readMessage(cosmos.base.v1beta1.DecCoin.parser(), extensionRegistry));
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
        rewards_ = java.util.Collections.unmodifiableList(rewards_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cosmos.distribution.v1beta1.QueryOuterClass.internal_static_cosmos_distribution_v1beta1_QueryDelegationRewardsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.distribution.v1beta1.QueryOuterClass.internal_static_cosmos_distribution_v1beta1_QueryDelegationRewardsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.distribution.v1beta1.QueryDelegationRewardsResponse.class, cosmos.distribution.v1beta1.QueryDelegationRewardsResponse.Builder.class);
  }

  public static final int REWARDS_FIELD_NUMBER = 1;
  private java.util.List<cosmos.base.v1beta1.DecCoin> rewards_;
  /**
   * <pre>
   * rewards defines the rewards accrued by a delegation.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  public java.util.List<cosmos.base.v1beta1.DecCoin> getRewardsList() {
    return rewards_;
  }
  /**
   * <pre>
   * rewards defines the rewards accrued by a delegation.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  public java.util.List<? extends cosmos.base.v1beta1.DecCoinOrBuilder> 
      getRewardsOrBuilderList() {
    return rewards_;
  }
  /**
   * <pre>
   * rewards defines the rewards accrued by a delegation.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  public int getRewardsCount() {
    return rewards_.size();
  }
  /**
   * <pre>
   * rewards defines the rewards accrued by a delegation.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  public cosmos.base.v1beta1.DecCoin getRewards(int index) {
    return rewards_.get(index);
  }
  /**
   * <pre>
   * rewards defines the rewards accrued by a delegation.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  public cosmos.base.v1beta1.DecCoinOrBuilder getRewardsOrBuilder(
      int index) {
    return rewards_.get(index);
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
    for (int i = 0; i < rewards_.size(); i++) {
      output.writeMessage(1, rewards_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rewards_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rewards_.get(i));
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
    if (!(obj instanceof cosmos.distribution.v1beta1.QueryDelegationRewardsResponse)) {
      return super.equals(obj);
    }
    cosmos.distribution.v1beta1.QueryDelegationRewardsResponse other = (cosmos.distribution.v1beta1.QueryDelegationRewardsResponse) obj;

    if (!getRewardsList()
        .equals(other.getRewardsList())) return false;
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
    if (getRewardsCount() > 0) {
      hash = (37 * hash) + REWARDS_FIELD_NUMBER;
      hash = (53 * hash) + getRewardsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.distribution.v1beta1.QueryDelegationRewardsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.QueryDelegationRewardsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.QueryDelegationRewardsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.QueryDelegationRewardsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.QueryDelegationRewardsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.QueryDelegationRewardsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.QueryDelegationRewardsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.QueryDelegationRewardsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.QueryDelegationRewardsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.QueryDelegationRewardsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.QueryDelegationRewardsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.QueryDelegationRewardsResponse parseFrom(
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
  public static Builder newBuilder(cosmos.distribution.v1beta1.QueryDelegationRewardsResponse prototype) {
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
   * QueryDelegationRewardsResponse is the response type for the
   * Query/DelegationRewards RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.distribution.v1beta1.QueryDelegationRewardsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.distribution.v1beta1.QueryDelegationRewardsResponse)
      cosmos.distribution.v1beta1.QueryDelegationRewardsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.distribution.v1beta1.QueryOuterClass.internal_static_cosmos_distribution_v1beta1_QueryDelegationRewardsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.distribution.v1beta1.QueryOuterClass.internal_static_cosmos_distribution_v1beta1_QueryDelegationRewardsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.distribution.v1beta1.QueryDelegationRewardsResponse.class, cosmos.distribution.v1beta1.QueryDelegationRewardsResponse.Builder.class);
    }

    // Construct using cosmos.distribution.v1beta1.QueryDelegationRewardsResponse.newBuilder()
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
        getRewardsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (rewardsBuilder_ == null) {
        rewards_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        rewardsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.distribution.v1beta1.QueryOuterClass.internal_static_cosmos_distribution_v1beta1_QueryDelegationRewardsResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.QueryDelegationRewardsResponse getDefaultInstanceForType() {
      return cosmos.distribution.v1beta1.QueryDelegationRewardsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.QueryDelegationRewardsResponse build() {
      cosmos.distribution.v1beta1.QueryDelegationRewardsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.QueryDelegationRewardsResponse buildPartial() {
      cosmos.distribution.v1beta1.QueryDelegationRewardsResponse result = new cosmos.distribution.v1beta1.QueryDelegationRewardsResponse(this);
      int from_bitField0_ = bitField0_;
      if (rewardsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rewards_ = java.util.Collections.unmodifiableList(rewards_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
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
      if (other instanceof cosmos.distribution.v1beta1.QueryDelegationRewardsResponse) {
        return mergeFrom((cosmos.distribution.v1beta1.QueryDelegationRewardsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.distribution.v1beta1.QueryDelegationRewardsResponse other) {
      if (other == cosmos.distribution.v1beta1.QueryDelegationRewardsResponse.getDefaultInstance()) return this;
      if (rewardsBuilder_ == null) {
        if (!other.rewards_.isEmpty()) {
          if (rewards_.isEmpty()) {
            rewards_ = other.rewards_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRewardsIsMutable();
            rewards_.addAll(other.rewards_);
          }
          onChanged();
        }
      } else {
        if (!other.rewards_.isEmpty()) {
          if (rewardsBuilder_.isEmpty()) {
            rewardsBuilder_.dispose();
            rewardsBuilder_ = null;
            rewards_ = other.rewards_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rewardsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRewardsFieldBuilder() : null;
          } else {
            rewardsBuilder_.addAllMessages(other.rewards_);
          }
        }
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
      cosmos.distribution.v1beta1.QueryDelegationRewardsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.distribution.v1beta1.QueryDelegationRewardsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<cosmos.base.v1beta1.DecCoin> rewards_ =
      java.util.Collections.emptyList();
    private void ensureRewardsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rewards_ = new java.util.ArrayList<cosmos.base.v1beta1.DecCoin>(rewards_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.base.v1beta1.DecCoin, cosmos.base.v1beta1.DecCoin.Builder, cosmos.base.v1beta1.DecCoinOrBuilder> rewardsBuilder_;

    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public java.util.List<cosmos.base.v1beta1.DecCoin> getRewardsList() {
      if (rewardsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rewards_);
      } else {
        return rewardsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public int getRewardsCount() {
      if (rewardsBuilder_ == null) {
        return rewards_.size();
      } else {
        return rewardsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public cosmos.base.v1beta1.DecCoin getRewards(int index) {
      if (rewardsBuilder_ == null) {
        return rewards_.get(index);
      } else {
        return rewardsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder setRewards(
        int index, cosmos.base.v1beta1.DecCoin value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRewardsIsMutable();
        rewards_.set(index, value);
        onChanged();
      } else {
        rewardsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder setRewards(
        int index, cosmos.base.v1beta1.DecCoin.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        rewards_.set(index, builderForValue.build());
        onChanged();
      } else {
        rewardsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addRewards(cosmos.base.v1beta1.DecCoin value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRewardsIsMutable();
        rewards_.add(value);
        onChanged();
      } else {
        rewardsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addRewards(
        int index, cosmos.base.v1beta1.DecCoin value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRewardsIsMutable();
        rewards_.add(index, value);
        onChanged();
      } else {
        rewardsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addRewards(
        cosmos.base.v1beta1.DecCoin.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        rewards_.add(builderForValue.build());
        onChanged();
      } else {
        rewardsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addRewards(
        int index, cosmos.base.v1beta1.DecCoin.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        rewards_.add(index, builderForValue.build());
        onChanged();
      } else {
        rewardsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addAllRewards(
        java.lang.Iterable<? extends cosmos.base.v1beta1.DecCoin> values) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rewards_);
        onChanged();
      } else {
        rewardsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder clearRewards() {
      if (rewardsBuilder_ == null) {
        rewards_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rewardsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder removeRewards(int index) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        rewards_.remove(index);
        onChanged();
      } else {
        rewardsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public cosmos.base.v1beta1.DecCoin.Builder getRewardsBuilder(
        int index) {
      return getRewardsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public cosmos.base.v1beta1.DecCoinOrBuilder getRewardsOrBuilder(
        int index) {
      if (rewardsBuilder_ == null) {
        return rewards_.get(index);  } else {
        return rewardsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public java.util.List<? extends cosmos.base.v1beta1.DecCoinOrBuilder> 
         getRewardsOrBuilderList() {
      if (rewardsBuilder_ != null) {
        return rewardsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rewards_);
      }
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public cosmos.base.v1beta1.DecCoin.Builder addRewardsBuilder() {
      return getRewardsFieldBuilder().addBuilder(
          cosmos.base.v1beta1.DecCoin.getDefaultInstance());
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public cosmos.base.v1beta1.DecCoin.Builder addRewardsBuilder(
        int index) {
      return getRewardsFieldBuilder().addBuilder(
          index, cosmos.base.v1beta1.DecCoin.getDefaultInstance());
    }
    /**
     * <pre>
     * rewards defines the rewards accrued by a delegation.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public java.util.List<cosmos.base.v1beta1.DecCoin.Builder> 
         getRewardsBuilderList() {
      return getRewardsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.base.v1beta1.DecCoin, cosmos.base.v1beta1.DecCoin.Builder, cosmos.base.v1beta1.DecCoinOrBuilder> 
        getRewardsFieldBuilder() {
      if (rewardsBuilder_ == null) {
        rewardsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cosmos.base.v1beta1.DecCoin, cosmos.base.v1beta1.DecCoin.Builder, cosmos.base.v1beta1.DecCoinOrBuilder>(
                rewards_,
                ((bitField0_ & 0x00000001) != 0),
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


    // @@protoc_insertion_point(builder_scope:cosmos.distribution.v1beta1.QueryDelegationRewardsResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.distribution.v1beta1.QueryDelegationRewardsResponse)
  private static final cosmos.distribution.v1beta1.QueryDelegationRewardsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.distribution.v1beta1.QueryDelegationRewardsResponse();
  }

  public static cosmos.distribution.v1beta1.QueryDelegationRewardsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDelegationRewardsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDelegationRewardsResponse>() {
    @java.lang.Override
    public QueryDelegationRewardsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryDelegationRewardsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryDelegationRewardsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDelegationRewardsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.distribution.v1beta1.QueryDelegationRewardsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

