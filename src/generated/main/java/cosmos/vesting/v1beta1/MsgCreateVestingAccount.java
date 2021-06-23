// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/vesting/v1beta1/tx.proto

package cosmos.vesting.v1beta1;

/**
 * <pre>
 * MsgCreateVestingAccount defines a message that enables creating a vesting
 * account.
 * </pre>
 *
 * Protobuf type {@code cosmos.vesting.v1beta1.MsgCreateVestingAccount}
 */
public  final class MsgCreateVestingAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.vesting.v1beta1.MsgCreateVestingAccount)
    MsgCreateVestingAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCreateVestingAccount.newBuilder() to construct.
  private MsgCreateVestingAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCreateVestingAccount() {
    fromAddress_ = "";
    toAddress_ = "";
    amount_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgCreateVestingAccount(
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

            fromAddress_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            toAddress_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              amount_ = new java.util.ArrayList<cosmos.base.v1beta1.Coin>();
              mutable_bitField0_ |= 0x00000004;
            }
            amount_.add(
                input.readMessage(cosmos.base.v1beta1.Coin.parser(), extensionRegistry));
            break;
          }
          case 32: {

            endTime_ = input.readInt64();
            break;
          }
          case 40: {

            delayed_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        amount_ = java.util.Collections.unmodifiableList(amount_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cosmos.vesting.v1beta1.Tx.internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.vesting.v1beta1.Tx.internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.vesting.v1beta1.MsgCreateVestingAccount.class, cosmos.vesting.v1beta1.MsgCreateVestingAccount.Builder.class);
  }

  private int bitField0_;
  public static final int FROM_ADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object fromAddress_;
  /**
   * <code>string from_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"from_address&#92;""];</code>
   */
  public java.lang.String getFromAddress() {
    java.lang.Object ref = fromAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string from_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"from_address&#92;""];</code>
   */
  public com.google.protobuf.ByteString
      getFromAddressBytes() {
    java.lang.Object ref = fromAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_ADDRESS_FIELD_NUMBER = 2;
  private volatile java.lang.Object toAddress_;
  /**
   * <code>string to_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"to_address&#92;""];</code>
   */
  public java.lang.String getToAddress() {
    java.lang.Object ref = toAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string to_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"to_address&#92;""];</code>
   */
  public com.google.protobuf.ByteString
      getToAddressBytes() {
    java.lang.Object ref = toAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private java.util.List<cosmos.base.v1beta1.Coin> amount_;
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  public java.util.List<cosmos.base.v1beta1.Coin> getAmountList() {
    return amount_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  public java.util.List<? extends cosmos.base.v1beta1.CoinOrBuilder> 
      getAmountOrBuilderList() {
    return amount_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  public int getAmountCount() {
    return amount_.size();
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  public cosmos.base.v1beta1.Coin getAmount(int index) {
    return amount_.get(index);
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  public cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder(
      int index) {
    return amount_.get(index);
  }

  public static final int END_TIME_FIELD_NUMBER = 4;
  private long endTime_;
  /**
   * <code>int64 end_time = 4 [(.gogoproto.moretags) = "yaml:&#92;"end_time&#92;""];</code>
   */
  public long getEndTime() {
    return endTime_;
  }

  public static final int DELAYED_FIELD_NUMBER = 5;
  private boolean delayed_;
  /**
   * <code>bool delayed = 5;</code>
   */
  public boolean getDelayed() {
    return delayed_;
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
    if (!getFromAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fromAddress_);
    }
    if (!getToAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, toAddress_);
    }
    for (int i = 0; i < amount_.size(); i++) {
      output.writeMessage(3, amount_.get(i));
    }
    if (endTime_ != 0L) {
      output.writeInt64(4, endTime_);
    }
    if (delayed_ != false) {
      output.writeBool(5, delayed_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFromAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fromAddress_);
    }
    if (!getToAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, toAddress_);
    }
    for (int i = 0; i < amount_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, amount_.get(i));
    }
    if (endTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, endTime_);
    }
    if (delayed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, delayed_);
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
    if (!(obj instanceof cosmos.vesting.v1beta1.MsgCreateVestingAccount)) {
      return super.equals(obj);
    }
    cosmos.vesting.v1beta1.MsgCreateVestingAccount other = (cosmos.vesting.v1beta1.MsgCreateVestingAccount) obj;

    if (!getFromAddress()
        .equals(other.getFromAddress())) return false;
    if (!getToAddress()
        .equals(other.getToAddress())) return false;
    if (!getAmountList()
        .equals(other.getAmountList())) return false;
    if (getEndTime()
        != other.getEndTime()) return false;
    if (getDelayed()
        != other.getDelayed()) return false;
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
    hash = (37 * hash) + FROM_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getFromAddress().hashCode();
    hash = (37 * hash) + TO_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getToAddress().hashCode();
    if (getAmountCount() > 0) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmountList().hashCode();
    }
    hash = (37 * hash) + END_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndTime());
    hash = (37 * hash) + DELAYED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDelayed());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.vesting.v1beta1.MsgCreateVestingAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.vesting.v1beta1.MsgCreateVestingAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.vesting.v1beta1.MsgCreateVestingAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.vesting.v1beta1.MsgCreateVestingAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.vesting.v1beta1.MsgCreateVestingAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.vesting.v1beta1.MsgCreateVestingAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.vesting.v1beta1.MsgCreateVestingAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.vesting.v1beta1.MsgCreateVestingAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.vesting.v1beta1.MsgCreateVestingAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.vesting.v1beta1.MsgCreateVestingAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.vesting.v1beta1.MsgCreateVestingAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.vesting.v1beta1.MsgCreateVestingAccount parseFrom(
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
  public static Builder newBuilder(cosmos.vesting.v1beta1.MsgCreateVestingAccount prototype) {
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
   * MsgCreateVestingAccount defines a message that enables creating a vesting
   * account.
   * </pre>
   *
   * Protobuf type {@code cosmos.vesting.v1beta1.MsgCreateVestingAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.vesting.v1beta1.MsgCreateVestingAccount)
      cosmos.vesting.v1beta1.MsgCreateVestingAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.vesting.v1beta1.Tx.internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.vesting.v1beta1.Tx.internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.vesting.v1beta1.MsgCreateVestingAccount.class, cosmos.vesting.v1beta1.MsgCreateVestingAccount.Builder.class);
    }

    // Construct using cosmos.vesting.v1beta1.MsgCreateVestingAccount.newBuilder()
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
        getAmountFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      fromAddress_ = "";

      toAddress_ = "";

      if (amountBuilder_ == null) {
        amount_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        amountBuilder_.clear();
      }
      endTime_ = 0L;

      delayed_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.vesting.v1beta1.Tx.internal_static_cosmos_vesting_v1beta1_MsgCreateVestingAccount_descriptor;
    }

    @java.lang.Override
    public cosmos.vesting.v1beta1.MsgCreateVestingAccount getDefaultInstanceForType() {
      return cosmos.vesting.v1beta1.MsgCreateVestingAccount.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.vesting.v1beta1.MsgCreateVestingAccount build() {
      cosmos.vesting.v1beta1.MsgCreateVestingAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.vesting.v1beta1.MsgCreateVestingAccount buildPartial() {
      cosmos.vesting.v1beta1.MsgCreateVestingAccount result = new cosmos.vesting.v1beta1.MsgCreateVestingAccount(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.fromAddress_ = fromAddress_;
      result.toAddress_ = toAddress_;
      if (amountBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          amount_ = java.util.Collections.unmodifiableList(amount_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.amount_ = amount_;
      } else {
        result.amount_ = amountBuilder_.build();
      }
      result.endTime_ = endTime_;
      result.delayed_ = delayed_;
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
      if (other instanceof cosmos.vesting.v1beta1.MsgCreateVestingAccount) {
        return mergeFrom((cosmos.vesting.v1beta1.MsgCreateVestingAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.vesting.v1beta1.MsgCreateVestingAccount other) {
      if (other == cosmos.vesting.v1beta1.MsgCreateVestingAccount.getDefaultInstance()) return this;
      if (!other.getFromAddress().isEmpty()) {
        fromAddress_ = other.fromAddress_;
        onChanged();
      }
      if (!other.getToAddress().isEmpty()) {
        toAddress_ = other.toAddress_;
        onChanged();
      }
      if (amountBuilder_ == null) {
        if (!other.amount_.isEmpty()) {
          if (amount_.isEmpty()) {
            amount_ = other.amount_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureAmountIsMutable();
            amount_.addAll(other.amount_);
          }
          onChanged();
        }
      } else {
        if (!other.amount_.isEmpty()) {
          if (amountBuilder_.isEmpty()) {
            amountBuilder_.dispose();
            amountBuilder_ = null;
            amount_ = other.amount_;
            bitField0_ = (bitField0_ & ~0x00000004);
            amountBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAmountFieldBuilder() : null;
          } else {
            amountBuilder_.addAllMessages(other.amount_);
          }
        }
      }
      if (other.getEndTime() != 0L) {
        setEndTime(other.getEndTime());
      }
      if (other.getDelayed() != false) {
        setDelayed(other.getDelayed());
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
      cosmos.vesting.v1beta1.MsgCreateVestingAccount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.vesting.v1beta1.MsgCreateVestingAccount) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object fromAddress_ = "";
    /**
     * <code>string from_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"from_address&#92;""];</code>
     */
    public java.lang.String getFromAddress() {
      java.lang.Object ref = fromAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"from_address&#92;""];</code>
     */
    public com.google.protobuf.ByteString
        getFromAddressBytes() {
      java.lang.Object ref = fromAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"from_address&#92;""];</code>
     */
    public Builder setFromAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fromAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string from_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"from_address&#92;""];</code>
     */
    public Builder clearFromAddress() {
      
      fromAddress_ = getDefaultInstance().getFromAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string from_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"from_address&#92;""];</code>
     */
    public Builder setFromAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fromAddress_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object toAddress_ = "";
    /**
     * <code>string to_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"to_address&#92;""];</code>
     */
    public java.lang.String getToAddress() {
      java.lang.Object ref = toAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string to_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"to_address&#92;""];</code>
     */
    public com.google.protobuf.ByteString
        getToAddressBytes() {
      java.lang.Object ref = toAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string to_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"to_address&#92;""];</code>
     */
    public Builder setToAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      toAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string to_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"to_address&#92;""];</code>
     */
    public Builder clearToAddress() {
      
      toAddress_ = getDefaultInstance().getToAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string to_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"to_address&#92;""];</code>
     */
    public Builder setToAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      toAddress_ = value;
      onChanged();
      return this;
    }

    private java.util.List<cosmos.base.v1beta1.Coin> amount_ =
      java.util.Collections.emptyList();
    private void ensureAmountIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        amount_ = new java.util.ArrayList<cosmos.base.v1beta1.Coin>(amount_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.base.v1beta1.Coin, cosmos.base.v1beta1.Coin.Builder, cosmos.base.v1beta1.CoinOrBuilder> amountBuilder_;

    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<cosmos.base.v1beta1.Coin> getAmountList() {
      if (amountBuilder_ == null) {
        return java.util.Collections.unmodifiableList(amount_);
      } else {
        return amountBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public int getAmountCount() {
      if (amountBuilder_ == null) {
        return amount_.size();
      } else {
        return amountBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public cosmos.base.v1beta1.Coin getAmount(int index) {
      if (amountBuilder_ == null) {
        return amount_.get(index);
      } else {
        return amountBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setAmount(
        int index, cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAmountIsMutable();
        amount_.set(index, value);
        onChanged();
      } else {
        amountBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setAmount(
        int index, cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (amountBuilder_ == null) {
        ensureAmountIsMutable();
        amount_.set(index, builderForValue.build());
        onChanged();
      } else {
        amountBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAmount(cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAmountIsMutable();
        amount_.add(value);
        onChanged();
      } else {
        amountBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAmount(
        int index, cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAmountIsMutable();
        amount_.add(index, value);
        onChanged();
      } else {
        amountBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAmount(
        cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (amountBuilder_ == null) {
        ensureAmountIsMutable();
        amount_.add(builderForValue.build());
        onChanged();
      } else {
        amountBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAmount(
        int index, cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (amountBuilder_ == null) {
        ensureAmountIsMutable();
        amount_.add(index, builderForValue.build());
        onChanged();
      } else {
        amountBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAllAmount(
        java.lang.Iterable<? extends cosmos.base.v1beta1.Coin> values) {
      if (amountBuilder_ == null) {
        ensureAmountIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, amount_);
        onChanged();
      } else {
        amountBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder clearAmount() {
      if (amountBuilder_ == null) {
        amount_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        amountBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder removeAmount(int index) {
      if (amountBuilder_ == null) {
        ensureAmountIsMutable();
        amount_.remove(index);
        onChanged();
      } else {
        amountBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public cosmos.base.v1beta1.Coin.Builder getAmountBuilder(
        int index) {
      return getAmountFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder(
        int index) {
      if (amountBuilder_ == null) {
        return amount_.get(index);  } else {
        return amountBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<? extends cosmos.base.v1beta1.CoinOrBuilder> 
         getAmountOrBuilderList() {
      if (amountBuilder_ != null) {
        return amountBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(amount_);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public cosmos.base.v1beta1.Coin.Builder addAmountBuilder() {
      return getAmountFieldBuilder().addBuilder(
          cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public cosmos.base.v1beta1.Coin.Builder addAmountBuilder(
        int index) {
      return getAmountFieldBuilder().addBuilder(
          index, cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<cosmos.base.v1beta1.Coin.Builder> 
         getAmountBuilderList() {
      return getAmountFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.base.v1beta1.Coin, cosmos.base.v1beta1.Coin.Builder, cosmos.base.v1beta1.CoinOrBuilder> 
        getAmountFieldBuilder() {
      if (amountBuilder_ == null) {
        amountBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cosmos.base.v1beta1.Coin, cosmos.base.v1beta1.Coin.Builder, cosmos.base.v1beta1.CoinOrBuilder>(
                amount_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        amount_ = null;
      }
      return amountBuilder_;
    }

    private long endTime_ ;
    /**
     * <code>int64 end_time = 4 [(.gogoproto.moretags) = "yaml:&#92;"end_time&#92;""];</code>
     */
    public long getEndTime() {
      return endTime_;
    }
    /**
     * <code>int64 end_time = 4 [(.gogoproto.moretags) = "yaml:&#92;"end_time&#92;""];</code>
     */
    public Builder setEndTime(long value) {
      
      endTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 end_time = 4 [(.gogoproto.moretags) = "yaml:&#92;"end_time&#92;""];</code>
     */
    public Builder clearEndTime() {
      
      endTime_ = 0L;
      onChanged();
      return this;
    }

    private boolean delayed_ ;
    /**
     * <code>bool delayed = 5;</code>
     */
    public boolean getDelayed() {
      return delayed_;
    }
    /**
     * <code>bool delayed = 5;</code>
     */
    public Builder setDelayed(boolean value) {
      
      delayed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool delayed = 5;</code>
     */
    public Builder clearDelayed() {
      
      delayed_ = false;
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


    // @@protoc_insertion_point(builder_scope:cosmos.vesting.v1beta1.MsgCreateVestingAccount)
  }

  // @@protoc_insertion_point(class_scope:cosmos.vesting.v1beta1.MsgCreateVestingAccount)
  private static final cosmos.vesting.v1beta1.MsgCreateVestingAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.vesting.v1beta1.MsgCreateVestingAccount();
  }

  public static cosmos.vesting.v1beta1.MsgCreateVestingAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCreateVestingAccount>
      PARSER = new com.google.protobuf.AbstractParser<MsgCreateVestingAccount>() {
    @java.lang.Override
    public MsgCreateVestingAccount parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgCreateVestingAccount(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgCreateVestingAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCreateVestingAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.vesting.v1beta1.MsgCreateVestingAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
