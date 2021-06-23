// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package cosmos.staking.v1beta1;

/**
 * <pre>
 * DelegationResponse is equivalent to Delegation except that it contains a
 * balance in addition to shares which is more suitable for client responses.
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.DelegationResponse}
 */
public  final class DelegationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.DelegationResponse)
    DelegationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DelegationResponse.newBuilder() to construct.
  private DelegationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DelegationResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DelegationResponse(
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
            cosmos.staking.v1beta1.Delegation.Builder subBuilder = null;
            if (delegation_ != null) {
              subBuilder = delegation_.toBuilder();
            }
            delegation_ = input.readMessage(cosmos.staking.v1beta1.Delegation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(delegation_);
              delegation_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            cosmos.base.v1beta1.Coin.Builder subBuilder = null;
            if (balance_ != null) {
              subBuilder = balance_.toBuilder();
            }
            balance_ = input.readMessage(cosmos.base.v1beta1.Coin.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(balance_);
              balance_ = subBuilder.buildPartial();
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
    return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DelegationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DelegationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.staking.v1beta1.DelegationResponse.class, cosmos.staking.v1beta1.DelegationResponse.Builder.class);
  }

  public static final int DELEGATION_FIELD_NUMBER = 1;
  private cosmos.staking.v1beta1.Delegation delegation_;
  /**
   * <code>.cosmos.staking.v1beta1.Delegation delegation = 1 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasDelegation() {
    return delegation_ != null;
  }
  /**
   * <code>.cosmos.staking.v1beta1.Delegation delegation = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.staking.v1beta1.Delegation getDelegation() {
    return delegation_ == null ? cosmos.staking.v1beta1.Delegation.getDefaultInstance() : delegation_;
  }
  /**
   * <code>.cosmos.staking.v1beta1.Delegation delegation = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.staking.v1beta1.DelegationOrBuilder getDelegationOrBuilder() {
    return getDelegation();
  }

  public static final int BALANCE_FIELD_NUMBER = 2;
  private cosmos.base.v1beta1.Coin balance_;
  /**
   * <code>.cosmos.base.v1beta1.Coin balance = 2 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasBalance() {
    return balance_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin balance = 2 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.base.v1beta1.Coin getBalance() {
    return balance_ == null ? cosmos.base.v1beta1.Coin.getDefaultInstance() : balance_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin balance = 2 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.base.v1beta1.CoinOrBuilder getBalanceOrBuilder() {
    return getBalance();
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
    if (delegation_ != null) {
      output.writeMessage(1, getDelegation());
    }
    if (balance_ != null) {
      output.writeMessage(2, getBalance());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (delegation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDelegation());
    }
    if (balance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBalance());
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
    if (!(obj instanceof cosmos.staking.v1beta1.DelegationResponse)) {
      return super.equals(obj);
    }
    cosmos.staking.v1beta1.DelegationResponse other = (cosmos.staking.v1beta1.DelegationResponse) obj;

    if (hasDelegation() != other.hasDelegation()) return false;
    if (hasDelegation()) {
      if (!getDelegation()
          .equals(other.getDelegation())) return false;
    }
    if (hasBalance() != other.hasBalance()) return false;
    if (hasBalance()) {
      if (!getBalance()
          .equals(other.getBalance())) return false;
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
    if (hasDelegation()) {
      hash = (37 * hash) + DELEGATION_FIELD_NUMBER;
      hash = (53 * hash) + getDelegation().hashCode();
    }
    if (hasBalance()) {
      hash = (37 * hash) + BALANCE_FIELD_NUMBER;
      hash = (53 * hash) + getBalance().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.staking.v1beta1.DelegationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.DelegationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DelegationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.DelegationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DelegationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.DelegationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DelegationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.DelegationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DelegationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.DelegationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DelegationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.DelegationResponse parseFrom(
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
  public static Builder newBuilder(cosmos.staking.v1beta1.DelegationResponse prototype) {
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
   * DelegationResponse is equivalent to Delegation except that it contains a
   * balance in addition to shares which is more suitable for client responses.
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.DelegationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.DelegationResponse)
      cosmos.staking.v1beta1.DelegationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DelegationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DelegationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.staking.v1beta1.DelegationResponse.class, cosmos.staking.v1beta1.DelegationResponse.Builder.class);
    }

    // Construct using cosmos.staking.v1beta1.DelegationResponse.newBuilder()
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
      if (delegationBuilder_ == null) {
        delegation_ = null;
      } else {
        delegation_ = null;
        delegationBuilder_ = null;
      }
      if (balanceBuilder_ == null) {
        balance_ = null;
      } else {
        balance_ = null;
        balanceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DelegationResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.DelegationResponse getDefaultInstanceForType() {
      return cosmos.staking.v1beta1.DelegationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.DelegationResponse build() {
      cosmos.staking.v1beta1.DelegationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.DelegationResponse buildPartial() {
      cosmos.staking.v1beta1.DelegationResponse result = new cosmos.staking.v1beta1.DelegationResponse(this);
      if (delegationBuilder_ == null) {
        result.delegation_ = delegation_;
      } else {
        result.delegation_ = delegationBuilder_.build();
      }
      if (balanceBuilder_ == null) {
        result.balance_ = balance_;
      } else {
        result.balance_ = balanceBuilder_.build();
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
      if (other instanceof cosmos.staking.v1beta1.DelegationResponse) {
        return mergeFrom((cosmos.staking.v1beta1.DelegationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.staking.v1beta1.DelegationResponse other) {
      if (other == cosmos.staking.v1beta1.DelegationResponse.getDefaultInstance()) return this;
      if (other.hasDelegation()) {
        mergeDelegation(other.getDelegation());
      }
      if (other.hasBalance()) {
        mergeBalance(other.getBalance());
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
      cosmos.staking.v1beta1.DelegationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.staking.v1beta1.DelegationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private cosmos.staking.v1beta1.Delegation delegation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.staking.v1beta1.Delegation, cosmos.staking.v1beta1.Delegation.Builder, cosmos.staking.v1beta1.DelegationOrBuilder> delegationBuilder_;
    /**
     * <code>.cosmos.staking.v1beta1.Delegation delegation = 1 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasDelegation() {
      return delegationBuilder_ != null || delegation_ != null;
    }
    /**
     * <code>.cosmos.staking.v1beta1.Delegation delegation = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.Delegation getDelegation() {
      if (delegationBuilder_ == null) {
        return delegation_ == null ? cosmos.staking.v1beta1.Delegation.getDefaultInstance() : delegation_;
      } else {
        return delegationBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.staking.v1beta1.Delegation delegation = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setDelegation(cosmos.staking.v1beta1.Delegation value) {
      if (delegationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        delegation_ = value;
        onChanged();
      } else {
        delegationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.staking.v1beta1.Delegation delegation = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setDelegation(
        cosmos.staking.v1beta1.Delegation.Builder builderForValue) {
      if (delegationBuilder_ == null) {
        delegation_ = builderForValue.build();
        onChanged();
      } else {
        delegationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cosmos.staking.v1beta1.Delegation delegation = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeDelegation(cosmos.staking.v1beta1.Delegation value) {
      if (delegationBuilder_ == null) {
        if (delegation_ != null) {
          delegation_ =
            cosmos.staking.v1beta1.Delegation.newBuilder(delegation_).mergeFrom(value).buildPartial();
        } else {
          delegation_ = value;
        }
        onChanged();
      } else {
        delegationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.staking.v1beta1.Delegation delegation = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearDelegation() {
      if (delegationBuilder_ == null) {
        delegation_ = null;
        onChanged();
      } else {
        delegation_ = null;
        delegationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cosmos.staking.v1beta1.Delegation delegation = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.Delegation.Builder getDelegationBuilder() {
      
      onChanged();
      return getDelegationFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.staking.v1beta1.Delegation delegation = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.DelegationOrBuilder getDelegationOrBuilder() {
      if (delegationBuilder_ != null) {
        return delegationBuilder_.getMessageOrBuilder();
      } else {
        return delegation_ == null ?
            cosmos.staking.v1beta1.Delegation.getDefaultInstance() : delegation_;
      }
    }
    /**
     * <code>.cosmos.staking.v1beta1.Delegation delegation = 1 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.staking.v1beta1.Delegation, cosmos.staking.v1beta1.Delegation.Builder, cosmos.staking.v1beta1.DelegationOrBuilder> 
        getDelegationFieldBuilder() {
      if (delegationBuilder_ == null) {
        delegationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.staking.v1beta1.Delegation, cosmos.staking.v1beta1.Delegation.Builder, cosmos.staking.v1beta1.DelegationOrBuilder>(
                getDelegation(),
                getParentForChildren(),
                isClean());
        delegation_ = null;
      }
      return delegationBuilder_;
    }

    private cosmos.base.v1beta1.Coin balance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.v1beta1.Coin, cosmos.base.v1beta1.Coin.Builder, cosmos.base.v1beta1.CoinOrBuilder> balanceBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin balance = 2 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasBalance() {
      return balanceBuilder_ != null || balance_ != null;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin balance = 2 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.base.v1beta1.Coin getBalance() {
      if (balanceBuilder_ == null) {
        return balance_ == null ? cosmos.base.v1beta1.Coin.getDefaultInstance() : balance_;
      } else {
        return balanceBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin balance = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setBalance(cosmos.base.v1beta1.Coin value) {
      if (balanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        balance_ = value;
        onChanged();
      } else {
        balanceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin balance = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setBalance(
        cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (balanceBuilder_ == null) {
        balance_ = builderForValue.build();
        onChanged();
      } else {
        balanceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin balance = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeBalance(cosmos.base.v1beta1.Coin value) {
      if (balanceBuilder_ == null) {
        if (balance_ != null) {
          balance_ =
            cosmos.base.v1beta1.Coin.newBuilder(balance_).mergeFrom(value).buildPartial();
        } else {
          balance_ = value;
        }
        onChanged();
      } else {
        balanceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin balance = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearBalance() {
      if (balanceBuilder_ == null) {
        balance_ = null;
        onChanged();
      } else {
        balance_ = null;
        balanceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin balance = 2 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.base.v1beta1.Coin.Builder getBalanceBuilder() {
      
      onChanged();
      return getBalanceFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin balance = 2 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.base.v1beta1.CoinOrBuilder getBalanceOrBuilder() {
      if (balanceBuilder_ != null) {
        return balanceBuilder_.getMessageOrBuilder();
      } else {
        return balance_ == null ?
            cosmos.base.v1beta1.Coin.getDefaultInstance() : balance_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin balance = 2 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.v1beta1.Coin, cosmos.base.v1beta1.Coin.Builder, cosmos.base.v1beta1.CoinOrBuilder> 
        getBalanceFieldBuilder() {
      if (balanceBuilder_ == null) {
        balanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.base.v1beta1.Coin, cosmos.base.v1beta1.Coin.Builder, cosmos.base.v1beta1.CoinOrBuilder>(
                getBalance(),
                getParentForChildren(),
                isClean());
        balance_ = null;
      }
      return balanceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.DelegationResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.DelegationResponse)
  private static final cosmos.staking.v1beta1.DelegationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.staking.v1beta1.DelegationResponse();
  }

  public static cosmos.staking.v1beta1.DelegationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DelegationResponse>
      PARSER = new com.google.protobuf.AbstractParser<DelegationResponse>() {
    @java.lang.Override
    public DelegationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DelegationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DelegationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DelegationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.staking.v1beta1.DelegationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
