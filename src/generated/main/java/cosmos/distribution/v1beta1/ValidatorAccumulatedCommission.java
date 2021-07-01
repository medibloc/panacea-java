// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/distribution.proto

package cosmos.distribution.v1beta1;

/**
 * <pre>
 * ValidatorAccumulatedCommission represents accumulated commission
 * for a validator kept as a running counter, can be withdrawn at any time.
 * </pre>
 *
 * Protobuf type {@code cosmos.distribution.v1beta1.ValidatorAccumulatedCommission}
 */
public  final class ValidatorAccumulatedCommission extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.distribution.v1beta1.ValidatorAccumulatedCommission)
    ValidatorAccumulatedCommissionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidatorAccumulatedCommission.newBuilder() to construct.
  private ValidatorAccumulatedCommission(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidatorAccumulatedCommission() {
    commission_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ValidatorAccumulatedCommission(
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
              commission_ = new java.util.ArrayList<cosmos.base.v1beta1.DecCoin>();
              mutable_bitField0_ |= 0x00000001;
            }
            commission_.add(
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
        commission_ = java.util.Collections.unmodifiableList(commission_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cosmos.distribution.v1beta1.Distribution.internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.distribution.v1beta1.Distribution.internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.class, cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.Builder.class);
  }

  public static final int COMMISSION_FIELD_NUMBER = 1;
  private java.util.List<cosmos.base.v1beta1.DecCoin> commission_;
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  public java.util.List<cosmos.base.v1beta1.DecCoin> getCommissionList() {
    return commission_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  public java.util.List<? extends cosmos.base.v1beta1.DecCoinOrBuilder> 
      getCommissionOrBuilderList() {
    return commission_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  public int getCommissionCount() {
    return commission_.size();
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  public cosmos.base.v1beta1.DecCoin getCommission(int index) {
    return commission_.get(index);
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  public cosmos.base.v1beta1.DecCoinOrBuilder getCommissionOrBuilder(
      int index) {
    return commission_.get(index);
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
    for (int i = 0; i < commission_.size(); i++) {
      output.writeMessage(1, commission_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < commission_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, commission_.get(i));
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
    if (!(obj instanceof cosmos.distribution.v1beta1.ValidatorAccumulatedCommission)) {
      return super.equals(obj);
    }
    cosmos.distribution.v1beta1.ValidatorAccumulatedCommission other = (cosmos.distribution.v1beta1.ValidatorAccumulatedCommission) obj;

    if (!getCommissionList()
        .equals(other.getCommissionList())) return false;
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
    if (getCommissionCount() > 0) {
      hash = (37 * hash) + COMMISSION_FIELD_NUMBER;
      hash = (53 * hash) + getCommissionList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.distribution.v1beta1.ValidatorAccumulatedCommission parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.ValidatorAccumulatedCommission parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.ValidatorAccumulatedCommission parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.ValidatorAccumulatedCommission parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.ValidatorAccumulatedCommission parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.ValidatorAccumulatedCommission parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.ValidatorAccumulatedCommission parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.ValidatorAccumulatedCommission parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.ValidatorAccumulatedCommission parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.ValidatorAccumulatedCommission parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.ValidatorAccumulatedCommission parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.ValidatorAccumulatedCommission parseFrom(
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
  public static Builder newBuilder(cosmos.distribution.v1beta1.ValidatorAccumulatedCommission prototype) {
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
   * ValidatorAccumulatedCommission represents accumulated commission
   * for a validator kept as a running counter, can be withdrawn at any time.
   * </pre>
   *
   * Protobuf type {@code cosmos.distribution.v1beta1.ValidatorAccumulatedCommission}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.distribution.v1beta1.ValidatorAccumulatedCommission)
      cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.distribution.v1beta1.Distribution.internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.distribution.v1beta1.Distribution.internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.class, cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.Builder.class);
    }

    // Construct using cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.newBuilder()
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
        getCommissionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (commissionBuilder_ == null) {
        commission_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        commissionBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.distribution.v1beta1.Distribution.internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_descriptor;
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.ValidatorAccumulatedCommission getDefaultInstanceForType() {
      return cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.ValidatorAccumulatedCommission build() {
      cosmos.distribution.v1beta1.ValidatorAccumulatedCommission result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.ValidatorAccumulatedCommission buildPartial() {
      cosmos.distribution.v1beta1.ValidatorAccumulatedCommission result = new cosmos.distribution.v1beta1.ValidatorAccumulatedCommission(this);
      int from_bitField0_ = bitField0_;
      if (commissionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          commission_ = java.util.Collections.unmodifiableList(commission_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.commission_ = commission_;
      } else {
        result.commission_ = commissionBuilder_.build();
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
      if (other instanceof cosmos.distribution.v1beta1.ValidatorAccumulatedCommission) {
        return mergeFrom((cosmos.distribution.v1beta1.ValidatorAccumulatedCommission)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.distribution.v1beta1.ValidatorAccumulatedCommission other) {
      if (other == cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.getDefaultInstance()) return this;
      if (commissionBuilder_ == null) {
        if (!other.commission_.isEmpty()) {
          if (commission_.isEmpty()) {
            commission_ = other.commission_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCommissionIsMutable();
            commission_.addAll(other.commission_);
          }
          onChanged();
        }
      } else {
        if (!other.commission_.isEmpty()) {
          if (commissionBuilder_.isEmpty()) {
            commissionBuilder_.dispose();
            commissionBuilder_ = null;
            commission_ = other.commission_;
            bitField0_ = (bitField0_ & ~0x00000001);
            commissionBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCommissionFieldBuilder() : null;
          } else {
            commissionBuilder_.addAllMessages(other.commission_);
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
      cosmos.distribution.v1beta1.ValidatorAccumulatedCommission parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.distribution.v1beta1.ValidatorAccumulatedCommission) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<cosmos.base.v1beta1.DecCoin> commission_ =
      java.util.Collections.emptyList();
    private void ensureCommissionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        commission_ = new java.util.ArrayList<cosmos.base.v1beta1.DecCoin>(commission_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.base.v1beta1.DecCoin, cosmos.base.v1beta1.DecCoin.Builder, cosmos.base.v1beta1.DecCoinOrBuilder> commissionBuilder_;

    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public java.util.List<cosmos.base.v1beta1.DecCoin> getCommissionList() {
      if (commissionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(commission_);
      } else {
        return commissionBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public int getCommissionCount() {
      if (commissionBuilder_ == null) {
        return commission_.size();
      } else {
        return commissionBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public cosmos.base.v1beta1.DecCoin getCommission(int index) {
      if (commissionBuilder_ == null) {
        return commission_.get(index);
      } else {
        return commissionBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder setCommission(
        int index, cosmos.base.v1beta1.DecCoin value) {
      if (commissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommissionIsMutable();
        commission_.set(index, value);
        onChanged();
      } else {
        commissionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder setCommission(
        int index, cosmos.base.v1beta1.DecCoin.Builder builderForValue) {
      if (commissionBuilder_ == null) {
        ensureCommissionIsMutable();
        commission_.set(index, builderForValue.build());
        onChanged();
      } else {
        commissionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addCommission(cosmos.base.v1beta1.DecCoin value) {
      if (commissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommissionIsMutable();
        commission_.add(value);
        onChanged();
      } else {
        commissionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addCommission(
        int index, cosmos.base.v1beta1.DecCoin value) {
      if (commissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommissionIsMutable();
        commission_.add(index, value);
        onChanged();
      } else {
        commissionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addCommission(
        cosmos.base.v1beta1.DecCoin.Builder builderForValue) {
      if (commissionBuilder_ == null) {
        ensureCommissionIsMutable();
        commission_.add(builderForValue.build());
        onChanged();
      } else {
        commissionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addCommission(
        int index, cosmos.base.v1beta1.DecCoin.Builder builderForValue) {
      if (commissionBuilder_ == null) {
        ensureCommissionIsMutable();
        commission_.add(index, builderForValue.build());
        onChanged();
      } else {
        commissionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addAllCommission(
        java.lang.Iterable<? extends cosmos.base.v1beta1.DecCoin> values) {
      if (commissionBuilder_ == null) {
        ensureCommissionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, commission_);
        onChanged();
      } else {
        commissionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder clearCommission() {
      if (commissionBuilder_ == null) {
        commission_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        commissionBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder removeCommission(int index) {
      if (commissionBuilder_ == null) {
        ensureCommissionIsMutable();
        commission_.remove(index);
        onChanged();
      } else {
        commissionBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public cosmos.base.v1beta1.DecCoin.Builder getCommissionBuilder(
        int index) {
      return getCommissionFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public cosmos.base.v1beta1.DecCoinOrBuilder getCommissionOrBuilder(
        int index) {
      if (commissionBuilder_ == null) {
        return commission_.get(index);  } else {
        return commissionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public java.util.List<? extends cosmos.base.v1beta1.DecCoinOrBuilder> 
         getCommissionOrBuilderList() {
      if (commissionBuilder_ != null) {
        return commissionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(commission_);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public cosmos.base.v1beta1.DecCoin.Builder addCommissionBuilder() {
      return getCommissionFieldBuilder().addBuilder(
          cosmos.base.v1beta1.DecCoin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public cosmos.base.v1beta1.DecCoin.Builder addCommissionBuilder(
        int index) {
      return getCommissionFieldBuilder().addBuilder(
          index, cosmos.base.v1beta1.DecCoin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin commission = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public java.util.List<cosmos.base.v1beta1.DecCoin.Builder> 
         getCommissionBuilderList() {
      return getCommissionFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.base.v1beta1.DecCoin, cosmos.base.v1beta1.DecCoin.Builder, cosmos.base.v1beta1.DecCoinOrBuilder> 
        getCommissionFieldBuilder() {
      if (commissionBuilder_ == null) {
        commissionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cosmos.base.v1beta1.DecCoin, cosmos.base.v1beta1.DecCoin.Builder, cosmos.base.v1beta1.DecCoinOrBuilder>(
                commission_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        commission_ = null;
      }
      return commissionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.distribution.v1beta1.ValidatorAccumulatedCommission)
  }

  // @@protoc_insertion_point(class_scope:cosmos.distribution.v1beta1.ValidatorAccumulatedCommission)
  private static final cosmos.distribution.v1beta1.ValidatorAccumulatedCommission DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.distribution.v1beta1.ValidatorAccumulatedCommission();
  }

  public static cosmos.distribution.v1beta1.ValidatorAccumulatedCommission getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidatorAccumulatedCommission>
      PARSER = new com.google.protobuf.AbstractParser<ValidatorAccumulatedCommission>() {
    @java.lang.Override
    public ValidatorAccumulatedCommission parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ValidatorAccumulatedCommission(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ValidatorAccumulatedCommission> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidatorAccumulatedCommission> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.distribution.v1beta1.ValidatorAccumulatedCommission getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

