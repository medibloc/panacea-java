// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package cosmos.staking.v1beta1;

/**
 * <pre>
 * UnbondingDelegationEntry defines an unbonding object with relevant metadata.
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.UnbondingDelegationEntry}
 */
public  final class UnbondingDelegationEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.UnbondingDelegationEntry)
    UnbondingDelegationEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnbondingDelegationEntry.newBuilder() to construct.
  private UnbondingDelegationEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnbondingDelegationEntry() {
    initialBalance_ = "";
    balance_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UnbondingDelegationEntry(
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

            creationHeight_ = input.readInt64();
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (completionTime_ != null) {
              subBuilder = completionTime_.toBuilder();
            }
            completionTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(completionTime_);
              completionTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            initialBalance_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            balance_ = s;
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
    return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_UnbondingDelegationEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_UnbondingDelegationEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.staking.v1beta1.UnbondingDelegationEntry.class, cosmos.staking.v1beta1.UnbondingDelegationEntry.Builder.class);
  }

  public static final int CREATION_HEIGHT_FIELD_NUMBER = 1;
  private long creationHeight_;
  /**
   * <pre>
   * creation_height is the height which the unbonding took place.
   * </pre>
   *
   * <code>int64 creation_height = 1 [(.gogoproto.moretags) = "yaml:&#92;"creation_height&#92;""];</code>
   */
  public long getCreationHeight() {
    return creationHeight_;
  }

  public static final int COMPLETION_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp completionTime_;
  /**
   * <pre>
   * completion_time is the unix time for unbonding completion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completion_time = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"completion_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  public boolean hasCompletionTime() {
    return completionTime_ != null;
  }
  /**
   * <pre>
   * completion_time is the unix time for unbonding completion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completion_time = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"completion_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  public com.google.protobuf.Timestamp getCompletionTime() {
    return completionTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : completionTime_;
  }
  /**
   * <pre>
   * completion_time is the unix time for unbonding completion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completion_time = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"completion_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  public com.google.protobuf.TimestampOrBuilder getCompletionTimeOrBuilder() {
    return getCompletionTime();
  }

  public static final int INITIAL_BALANCE_FIELD_NUMBER = 3;
  private volatile java.lang.Object initialBalance_;
  /**
   * <pre>
   * initial_balance defines the tokens initially scheduled to receive at completion.
   * </pre>
   *
   * <code>string initial_balance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"initial_balance&#92;""];</code>
   */
  public java.lang.String getInitialBalance() {
    java.lang.Object ref = initialBalance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      initialBalance_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * initial_balance defines the tokens initially scheduled to receive at completion.
   * </pre>
   *
   * <code>string initial_balance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"initial_balance&#92;""];</code>
   */
  public com.google.protobuf.ByteString
      getInitialBalanceBytes() {
    java.lang.Object ref = initialBalance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      initialBalance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BALANCE_FIELD_NUMBER = 4;
  private volatile java.lang.Object balance_;
  /**
   * <pre>
   * balance defines the tokens to receive at completion.
   * </pre>
   *
   * <code>string balance = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   */
  public java.lang.String getBalance() {
    java.lang.Object ref = balance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      balance_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * balance defines the tokens to receive at completion.
   * </pre>
   *
   * <code>string balance = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   */
  public com.google.protobuf.ByteString
      getBalanceBytes() {
    java.lang.Object ref = balance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      balance_ = b;
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
    if (creationHeight_ != 0L) {
      output.writeInt64(1, creationHeight_);
    }
    if (completionTime_ != null) {
      output.writeMessage(2, getCompletionTime());
    }
    if (!getInitialBalanceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, initialBalance_);
    }
    if (!getBalanceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, balance_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (creationHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, creationHeight_);
    }
    if (completionTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCompletionTime());
    }
    if (!getInitialBalanceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, initialBalance_);
    }
    if (!getBalanceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, balance_);
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
    if (!(obj instanceof cosmos.staking.v1beta1.UnbondingDelegationEntry)) {
      return super.equals(obj);
    }
    cosmos.staking.v1beta1.UnbondingDelegationEntry other = (cosmos.staking.v1beta1.UnbondingDelegationEntry) obj;

    if (getCreationHeight()
        != other.getCreationHeight()) return false;
    if (hasCompletionTime() != other.hasCompletionTime()) return false;
    if (hasCompletionTime()) {
      if (!getCompletionTime()
          .equals(other.getCompletionTime())) return false;
    }
    if (!getInitialBalance()
        .equals(other.getInitialBalance())) return false;
    if (!getBalance()
        .equals(other.getBalance())) return false;
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
    hash = (37 * hash) + CREATION_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreationHeight());
    if (hasCompletionTime()) {
      hash = (37 * hash) + COMPLETION_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCompletionTime().hashCode();
    }
    hash = (37 * hash) + INITIAL_BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getInitialBalance().hashCode();
    hash = (37 * hash) + BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getBalance().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.staking.v1beta1.UnbondingDelegationEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.UnbondingDelegationEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.UnbondingDelegationEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.UnbondingDelegationEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.UnbondingDelegationEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.UnbondingDelegationEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.UnbondingDelegationEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.UnbondingDelegationEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.UnbondingDelegationEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.UnbondingDelegationEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.UnbondingDelegationEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.UnbondingDelegationEntry parseFrom(
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
  public static Builder newBuilder(cosmos.staking.v1beta1.UnbondingDelegationEntry prototype) {
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
   * UnbondingDelegationEntry defines an unbonding object with relevant metadata.
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.UnbondingDelegationEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.UnbondingDelegationEntry)
      cosmos.staking.v1beta1.UnbondingDelegationEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_UnbondingDelegationEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_UnbondingDelegationEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.staking.v1beta1.UnbondingDelegationEntry.class, cosmos.staking.v1beta1.UnbondingDelegationEntry.Builder.class);
    }

    // Construct using cosmos.staking.v1beta1.UnbondingDelegationEntry.newBuilder()
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
      creationHeight_ = 0L;

      if (completionTimeBuilder_ == null) {
        completionTime_ = null;
      } else {
        completionTime_ = null;
        completionTimeBuilder_ = null;
      }
      initialBalance_ = "";

      balance_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_UnbondingDelegationEntry_descriptor;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.UnbondingDelegationEntry getDefaultInstanceForType() {
      return cosmos.staking.v1beta1.UnbondingDelegationEntry.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.UnbondingDelegationEntry build() {
      cosmos.staking.v1beta1.UnbondingDelegationEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.UnbondingDelegationEntry buildPartial() {
      cosmos.staking.v1beta1.UnbondingDelegationEntry result = new cosmos.staking.v1beta1.UnbondingDelegationEntry(this);
      result.creationHeight_ = creationHeight_;
      if (completionTimeBuilder_ == null) {
        result.completionTime_ = completionTime_;
      } else {
        result.completionTime_ = completionTimeBuilder_.build();
      }
      result.initialBalance_ = initialBalance_;
      result.balance_ = balance_;
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
      if (other instanceof cosmos.staking.v1beta1.UnbondingDelegationEntry) {
        return mergeFrom((cosmos.staking.v1beta1.UnbondingDelegationEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.staking.v1beta1.UnbondingDelegationEntry other) {
      if (other == cosmos.staking.v1beta1.UnbondingDelegationEntry.getDefaultInstance()) return this;
      if (other.getCreationHeight() != 0L) {
        setCreationHeight(other.getCreationHeight());
      }
      if (other.hasCompletionTime()) {
        mergeCompletionTime(other.getCompletionTime());
      }
      if (!other.getInitialBalance().isEmpty()) {
        initialBalance_ = other.initialBalance_;
        onChanged();
      }
      if (!other.getBalance().isEmpty()) {
        balance_ = other.balance_;
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
      cosmos.staking.v1beta1.UnbondingDelegationEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.staking.v1beta1.UnbondingDelegationEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long creationHeight_ ;
    /**
     * <pre>
     * creation_height is the height which the unbonding took place.
     * </pre>
     *
     * <code>int64 creation_height = 1 [(.gogoproto.moretags) = "yaml:&#92;"creation_height&#92;""];</code>
     */
    public long getCreationHeight() {
      return creationHeight_;
    }
    /**
     * <pre>
     * creation_height is the height which the unbonding took place.
     * </pre>
     *
     * <code>int64 creation_height = 1 [(.gogoproto.moretags) = "yaml:&#92;"creation_height&#92;""];</code>
     */
    public Builder setCreationHeight(long value) {
      
      creationHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * creation_height is the height which the unbonding took place.
     * </pre>
     *
     * <code>int64 creation_height = 1 [(.gogoproto.moretags) = "yaml:&#92;"creation_height&#92;""];</code>
     */
    public Builder clearCreationHeight() {
      
      creationHeight_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp completionTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> completionTimeBuilder_;
    /**
     * <pre>
     * completion_time is the unix time for unbonding completion.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"completion_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public boolean hasCompletionTime() {
      return completionTimeBuilder_ != null || completionTime_ != null;
    }
    /**
     * <pre>
     * completion_time is the unix time for unbonding completion.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"completion_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp getCompletionTime() {
      if (completionTimeBuilder_ == null) {
        return completionTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : completionTime_;
      } else {
        return completionTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * completion_time is the unix time for unbonding completion.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"completion_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder setCompletionTime(com.google.protobuf.Timestamp value) {
      if (completionTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        completionTime_ = value;
        onChanged();
      } else {
        completionTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * completion_time is the unix time for unbonding completion.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"completion_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder setCompletionTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (completionTimeBuilder_ == null) {
        completionTime_ = builderForValue.build();
        onChanged();
      } else {
        completionTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * completion_time is the unix time for unbonding completion.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"completion_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergeCompletionTime(com.google.protobuf.Timestamp value) {
      if (completionTimeBuilder_ == null) {
        if (completionTime_ != null) {
          completionTime_ =
            com.google.protobuf.Timestamp.newBuilder(completionTime_).mergeFrom(value).buildPartial();
        } else {
          completionTime_ = value;
        }
        onChanged();
      } else {
        completionTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * completion_time is the unix time for unbonding completion.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"completion_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearCompletionTime() {
      if (completionTimeBuilder_ == null) {
        completionTime_ = null;
        onChanged();
      } else {
        completionTime_ = null;
        completionTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * completion_time is the unix time for unbonding completion.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"completion_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getCompletionTimeBuilder() {
      
      onChanged();
      return getCompletionTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * completion_time is the unix time for unbonding completion.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"completion_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCompletionTimeOrBuilder() {
      if (completionTimeBuilder_ != null) {
        return completionTimeBuilder_.getMessageOrBuilder();
      } else {
        return completionTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : completionTime_;
      }
    }
    /**
     * <pre>
     * completion_time is the unix time for unbonding completion.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"completion_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCompletionTimeFieldBuilder() {
      if (completionTimeBuilder_ == null) {
        completionTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCompletionTime(),
                getParentForChildren(),
                isClean());
        completionTime_ = null;
      }
      return completionTimeBuilder_;
    }

    private java.lang.Object initialBalance_ = "";
    /**
     * <pre>
     * initial_balance defines the tokens initially scheduled to receive at completion.
     * </pre>
     *
     * <code>string initial_balance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"initial_balance&#92;""];</code>
     */
    public java.lang.String getInitialBalance() {
      java.lang.Object ref = initialBalance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        initialBalance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * initial_balance defines the tokens initially scheduled to receive at completion.
     * </pre>
     *
     * <code>string initial_balance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"initial_balance&#92;""];</code>
     */
    public com.google.protobuf.ByteString
        getInitialBalanceBytes() {
      java.lang.Object ref = initialBalance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        initialBalance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * initial_balance defines the tokens initially scheduled to receive at completion.
     * </pre>
     *
     * <code>string initial_balance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"initial_balance&#92;""];</code>
     */
    public Builder setInitialBalance(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      initialBalance_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * initial_balance defines the tokens initially scheduled to receive at completion.
     * </pre>
     *
     * <code>string initial_balance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"initial_balance&#92;""];</code>
     */
    public Builder clearInitialBalance() {
      
      initialBalance_ = getDefaultInstance().getInitialBalance();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * initial_balance defines the tokens initially scheduled to receive at completion.
     * </pre>
     *
     * <code>string initial_balance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"initial_balance&#92;""];</code>
     */
    public Builder setInitialBalanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      initialBalance_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object balance_ = "";
    /**
     * <pre>
     * balance defines the tokens to receive at completion.
     * </pre>
     *
     * <code>string balance = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     */
    public java.lang.String getBalance() {
      java.lang.Object ref = balance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        balance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * balance defines the tokens to receive at completion.
     * </pre>
     *
     * <code>string balance = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     */
    public com.google.protobuf.ByteString
        getBalanceBytes() {
      java.lang.Object ref = balance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        balance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * balance defines the tokens to receive at completion.
     * </pre>
     *
     * <code>string balance = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     */
    public Builder setBalance(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      balance_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * balance defines the tokens to receive at completion.
     * </pre>
     *
     * <code>string balance = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     */
    public Builder clearBalance() {
      
      balance_ = getDefaultInstance().getBalance();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * balance defines the tokens to receive at completion.
     * </pre>
     *
     * <code>string balance = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     */
    public Builder setBalanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      balance_ = value;
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.UnbondingDelegationEntry)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.UnbondingDelegationEntry)
  private static final cosmos.staking.v1beta1.UnbondingDelegationEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.staking.v1beta1.UnbondingDelegationEntry();
  }

  public static cosmos.staking.v1beta1.UnbondingDelegationEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnbondingDelegationEntry>
      PARSER = new com.google.protobuf.AbstractParser<UnbondingDelegationEntry>() {
    @java.lang.Override
    public UnbondingDelegationEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UnbondingDelegationEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UnbondingDelegationEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnbondingDelegationEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.staking.v1beta1.UnbondingDelegationEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

