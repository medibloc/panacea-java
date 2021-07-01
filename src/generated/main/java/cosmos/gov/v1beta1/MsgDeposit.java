// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/tx.proto

package cosmos.gov.v1beta1;

/**
 * <pre>
 * MsgDeposit defines a message to submit a deposit to an existing proposal.
 * </pre>
 *
 * Protobuf type {@code cosmos.gov.v1beta1.MsgDeposit}
 */
public  final class MsgDeposit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.gov.v1beta1.MsgDeposit)
    MsgDepositOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgDeposit.newBuilder() to construct.
  private MsgDeposit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgDeposit() {
    depositor_ = "";
    amount_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgDeposit(
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

            proposalId_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            depositor_ = s;
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
    return cosmos.gov.v1beta1.Tx.internal_static_cosmos_gov_v1beta1_MsgDeposit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.gov.v1beta1.Tx.internal_static_cosmos_gov_v1beta1_MsgDeposit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.gov.v1beta1.MsgDeposit.class, cosmos.gov.v1beta1.MsgDeposit.Builder.class);
  }

  private int bitField0_;
  public static final int PROPOSAL_ID_FIELD_NUMBER = 1;
  private long proposalId_;
  /**
   * <code>uint64 proposal_id = 1 [(.gogoproto.jsontag) = "proposal_id", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
   */
  public long getProposalId() {
    return proposalId_;
  }

  public static final int DEPOSITOR_FIELD_NUMBER = 2;
  private volatile java.lang.Object depositor_;
  /**
   * <code>string depositor = 2;</code>
   */
  public java.lang.String getDepositor() {
    java.lang.Object ref = depositor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      depositor_ = s;
      return s;
    }
  }
  /**
   * <code>string depositor = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDepositorBytes() {
    java.lang.Object ref = depositor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      depositor_ = b;
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
    if (proposalId_ != 0L) {
      output.writeUInt64(1, proposalId_);
    }
    if (!getDepositorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, depositor_);
    }
    for (int i = 0; i < amount_.size(); i++) {
      output.writeMessage(3, amount_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (proposalId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, proposalId_);
    }
    if (!getDepositorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, depositor_);
    }
    for (int i = 0; i < amount_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, amount_.get(i));
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
    if (!(obj instanceof cosmos.gov.v1beta1.MsgDeposit)) {
      return super.equals(obj);
    }
    cosmos.gov.v1beta1.MsgDeposit other = (cosmos.gov.v1beta1.MsgDeposit) obj;

    if (getProposalId()
        != other.getProposalId()) return false;
    if (!getDepositor()
        .equals(other.getDepositor())) return false;
    if (!getAmountList()
        .equals(other.getAmountList())) return false;
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
    hash = (37 * hash) + PROPOSAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProposalId());
    hash = (37 * hash) + DEPOSITOR_FIELD_NUMBER;
    hash = (53 * hash) + getDepositor().hashCode();
    if (getAmountCount() > 0) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmountList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.gov.v1beta1.MsgDeposit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.gov.v1beta1.MsgDeposit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.MsgDeposit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.gov.v1beta1.MsgDeposit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.MsgDeposit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.gov.v1beta1.MsgDeposit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.MsgDeposit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.gov.v1beta1.MsgDeposit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.MsgDeposit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.gov.v1beta1.MsgDeposit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.MsgDeposit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.gov.v1beta1.MsgDeposit parseFrom(
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
  public static Builder newBuilder(cosmos.gov.v1beta1.MsgDeposit prototype) {
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
   * MsgDeposit defines a message to submit a deposit to an existing proposal.
   * </pre>
   *
   * Protobuf type {@code cosmos.gov.v1beta1.MsgDeposit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.gov.v1beta1.MsgDeposit)
      cosmos.gov.v1beta1.MsgDepositOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.gov.v1beta1.Tx.internal_static_cosmos_gov_v1beta1_MsgDeposit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.gov.v1beta1.Tx.internal_static_cosmos_gov_v1beta1_MsgDeposit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.gov.v1beta1.MsgDeposit.class, cosmos.gov.v1beta1.MsgDeposit.Builder.class);
    }

    // Construct using cosmos.gov.v1beta1.MsgDeposit.newBuilder()
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
      proposalId_ = 0L;

      depositor_ = "";

      if (amountBuilder_ == null) {
        amount_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        amountBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.gov.v1beta1.Tx.internal_static_cosmos_gov_v1beta1_MsgDeposit_descriptor;
    }

    @java.lang.Override
    public cosmos.gov.v1beta1.MsgDeposit getDefaultInstanceForType() {
      return cosmos.gov.v1beta1.MsgDeposit.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.gov.v1beta1.MsgDeposit build() {
      cosmos.gov.v1beta1.MsgDeposit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.gov.v1beta1.MsgDeposit buildPartial() {
      cosmos.gov.v1beta1.MsgDeposit result = new cosmos.gov.v1beta1.MsgDeposit(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.proposalId_ = proposalId_;
      result.depositor_ = depositor_;
      if (amountBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          amount_ = java.util.Collections.unmodifiableList(amount_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.amount_ = amount_;
      } else {
        result.amount_ = amountBuilder_.build();
      }
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
      if (other instanceof cosmos.gov.v1beta1.MsgDeposit) {
        return mergeFrom((cosmos.gov.v1beta1.MsgDeposit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.gov.v1beta1.MsgDeposit other) {
      if (other == cosmos.gov.v1beta1.MsgDeposit.getDefaultInstance()) return this;
      if (other.getProposalId() != 0L) {
        setProposalId(other.getProposalId());
      }
      if (!other.getDepositor().isEmpty()) {
        depositor_ = other.depositor_;
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
      cosmos.gov.v1beta1.MsgDeposit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.gov.v1beta1.MsgDeposit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long proposalId_ ;
    /**
     * <code>uint64 proposal_id = 1 [(.gogoproto.jsontag) = "proposal_id", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
     */
    public long getProposalId() {
      return proposalId_;
    }
    /**
     * <code>uint64 proposal_id = 1 [(.gogoproto.jsontag) = "proposal_id", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
     */
    public Builder setProposalId(long value) {
      
      proposalId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 proposal_id = 1 [(.gogoproto.jsontag) = "proposal_id", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
     */
    public Builder clearProposalId() {
      
      proposalId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object depositor_ = "";
    /**
     * <code>string depositor = 2;</code>
     */
    public java.lang.String getDepositor() {
      java.lang.Object ref = depositor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        depositor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string depositor = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDepositorBytes() {
      java.lang.Object ref = depositor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        depositor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string depositor = 2;</code>
     */
    public Builder setDepositor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      depositor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string depositor = 2;</code>
     */
    public Builder clearDepositor() {
      
      depositor_ = getDefaultInstance().getDepositor();
      onChanged();
      return this;
    }
    /**
     * <code>string depositor = 2;</code>
     */
    public Builder setDepositorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      depositor_ = value;
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


    // @@protoc_insertion_point(builder_scope:cosmos.gov.v1beta1.MsgDeposit)
  }

  // @@protoc_insertion_point(class_scope:cosmos.gov.v1beta1.MsgDeposit)
  private static final cosmos.gov.v1beta1.MsgDeposit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.gov.v1beta1.MsgDeposit();
  }

  public static cosmos.gov.v1beta1.MsgDeposit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgDeposit>
      PARSER = new com.google.protobuf.AbstractParser<MsgDeposit>() {
    @java.lang.Override
    public MsgDeposit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgDeposit(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgDeposit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgDeposit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.gov.v1beta1.MsgDeposit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

