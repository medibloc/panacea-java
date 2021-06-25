// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/validator.proto

package tendermint.types;

/**
 * Protobuf type {@code tendermint.types.Validator}
 */
public  final class Validator extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.types.Validator)
    ValidatorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Validator.newBuilder() to construct.
  private Validator(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Validator() {
    address_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Validator(
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

            address_ = input.readBytes();
            break;
          }
          case 18: {
            tendermint.crypto.PublicKey.Builder subBuilder = null;
            if (pubKey_ != null) {
              subBuilder = pubKey_.toBuilder();
            }
            pubKey_ = input.readMessage(tendermint.crypto.PublicKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pubKey_);
              pubKey_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            votingPower_ = input.readInt64();
            break;
          }
          case 32: {

            proposerPriority_ = input.readInt64();
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
    return tendermint.types.ValidatorOuterClass.internal_static_tendermint_types_Validator_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tendermint.types.ValidatorOuterClass.internal_static_tendermint_types_Validator_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tendermint.types.Validator.class, tendermint.types.Validator.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString address_;
  /**
   * <code>bytes address = 1;</code>
   */
  public com.google.protobuf.ByteString getAddress() {
    return address_;
  }

  public static final int PUB_KEY_FIELD_NUMBER = 2;
  private tendermint.crypto.PublicKey pubKey_;
  /**
   * <code>.tendermint.crypto.PublicKey pub_key = 2 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasPubKey() {
    return pubKey_ != null;
  }
  /**
   * <code>.tendermint.crypto.PublicKey pub_key = 2 [(.gogoproto.nullable) = false];</code>
   */
  public tendermint.crypto.PublicKey getPubKey() {
    return pubKey_ == null ? tendermint.crypto.PublicKey.getDefaultInstance() : pubKey_;
  }
  /**
   * <code>.tendermint.crypto.PublicKey pub_key = 2 [(.gogoproto.nullable) = false];</code>
   */
  public tendermint.crypto.PublicKeyOrBuilder getPubKeyOrBuilder() {
    return getPubKey();
  }

  public static final int VOTING_POWER_FIELD_NUMBER = 3;
  private long votingPower_;
  /**
   * <code>int64 voting_power = 3;</code>
   */
  public long getVotingPower() {
    return votingPower_;
  }

  public static final int PROPOSER_PRIORITY_FIELD_NUMBER = 4;
  private long proposerPriority_;
  /**
   * <code>int64 proposer_priority = 4;</code>
   */
  public long getProposerPriority() {
    return proposerPriority_;
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
    if (!address_.isEmpty()) {
      output.writeBytes(1, address_);
    }
    if (pubKey_ != null) {
      output.writeMessage(2, getPubKey());
    }
    if (votingPower_ != 0L) {
      output.writeInt64(3, votingPower_);
    }
    if (proposerPriority_ != 0L) {
      output.writeInt64(4, proposerPriority_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!address_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, address_);
    }
    if (pubKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPubKey());
    }
    if (votingPower_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, votingPower_);
    }
    if (proposerPriority_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, proposerPriority_);
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
    if (!(obj instanceof tendermint.types.Validator)) {
      return super.equals(obj);
    }
    tendermint.types.Validator other = (tendermint.types.Validator) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (hasPubKey() != other.hasPubKey()) return false;
    if (hasPubKey()) {
      if (!getPubKey()
          .equals(other.getPubKey())) return false;
    }
    if (getVotingPower()
        != other.getVotingPower()) return false;
    if (getProposerPriority()
        != other.getProposerPriority()) return false;
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    if (hasPubKey()) {
      hash = (37 * hash) + PUB_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getPubKey().hashCode();
    }
    hash = (37 * hash) + VOTING_POWER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVotingPower());
    hash = (37 * hash) + PROPOSER_PRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProposerPriority());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tendermint.types.Validator parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tendermint.types.Validator parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tendermint.types.Validator parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tendermint.types.Validator parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tendermint.types.Validator parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tendermint.types.Validator parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tendermint.types.Validator parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tendermint.types.Validator parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tendermint.types.Validator parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tendermint.types.Validator parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tendermint.types.Validator parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tendermint.types.Validator parseFrom(
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
  public static Builder newBuilder(tendermint.types.Validator prototype) {
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
   * Protobuf type {@code tendermint.types.Validator}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.types.Validator)
      tendermint.types.ValidatorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tendermint.types.ValidatorOuterClass.internal_static_tendermint_types_Validator_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tendermint.types.ValidatorOuterClass.internal_static_tendermint_types_Validator_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tendermint.types.Validator.class, tendermint.types.Validator.Builder.class);
    }

    // Construct using tendermint.types.Validator.newBuilder()
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
      address_ = com.google.protobuf.ByteString.EMPTY;

      if (pubKeyBuilder_ == null) {
        pubKey_ = null;
      } else {
        pubKey_ = null;
        pubKeyBuilder_ = null;
      }
      votingPower_ = 0L;

      proposerPriority_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tendermint.types.ValidatorOuterClass.internal_static_tendermint_types_Validator_descriptor;
    }

    @java.lang.Override
    public tendermint.types.Validator getDefaultInstanceForType() {
      return tendermint.types.Validator.getDefaultInstance();
    }

    @java.lang.Override
    public tendermint.types.Validator build() {
      tendermint.types.Validator result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tendermint.types.Validator buildPartial() {
      tendermint.types.Validator result = new tendermint.types.Validator(this);
      result.address_ = address_;
      if (pubKeyBuilder_ == null) {
        result.pubKey_ = pubKey_;
      } else {
        result.pubKey_ = pubKeyBuilder_.build();
      }
      result.votingPower_ = votingPower_;
      result.proposerPriority_ = proposerPriority_;
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
      if (other instanceof tendermint.types.Validator) {
        return mergeFrom((tendermint.types.Validator)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tendermint.types.Validator other) {
      if (other == tendermint.types.Validator.getDefaultInstance()) return this;
      if (other.getAddress() != com.google.protobuf.ByteString.EMPTY) {
        setAddress(other.getAddress());
      }
      if (other.hasPubKey()) {
        mergePubKey(other.getPubKey());
      }
      if (other.getVotingPower() != 0L) {
        setVotingPower(other.getVotingPower());
      }
      if (other.getProposerPriority() != 0L) {
        setProposerPriority(other.getProposerPriority());
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
      tendermint.types.Validator parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tendermint.types.Validator) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString address_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes address = 1;</code>
     */
    public com.google.protobuf.ByteString getAddress() {
      return address_;
    }
    /**
     * <code>bytes address = 1;</code>
     */
    public Builder setAddress(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      address_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes address = 1;</code>
     */
    public Builder clearAddress() {
      
      address_ = getDefaultInstance().getAddress();
      onChanged();
      return this;
    }

    private tendermint.crypto.PublicKey pubKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        tendermint.crypto.PublicKey, tendermint.crypto.PublicKey.Builder, tendermint.crypto.PublicKeyOrBuilder> pubKeyBuilder_;
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 2 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasPubKey() {
      return pubKeyBuilder_ != null || pubKey_ != null;
    }
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 2 [(.gogoproto.nullable) = false];</code>
     */
    public tendermint.crypto.PublicKey getPubKey() {
      if (pubKeyBuilder_ == null) {
        return pubKey_ == null ? tendermint.crypto.PublicKey.getDefaultInstance() : pubKey_;
      } else {
        return pubKeyBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setPubKey(tendermint.crypto.PublicKey value) {
      if (pubKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pubKey_ = value;
        onChanged();
      } else {
        pubKeyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setPubKey(
        tendermint.crypto.PublicKey.Builder builderForValue) {
      if (pubKeyBuilder_ == null) {
        pubKey_ = builderForValue.build();
        onChanged();
      } else {
        pubKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergePubKey(tendermint.crypto.PublicKey value) {
      if (pubKeyBuilder_ == null) {
        if (pubKey_ != null) {
          pubKey_ =
            tendermint.crypto.PublicKey.newBuilder(pubKey_).mergeFrom(value).buildPartial();
        } else {
          pubKey_ = value;
        }
        onChanged();
      } else {
        pubKeyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearPubKey() {
      if (pubKeyBuilder_ == null) {
        pubKey_ = null;
        onChanged();
      } else {
        pubKey_ = null;
        pubKeyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 2 [(.gogoproto.nullable) = false];</code>
     */
    public tendermint.crypto.PublicKey.Builder getPubKeyBuilder() {
      
      onChanged();
      return getPubKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 2 [(.gogoproto.nullable) = false];</code>
     */
    public tendermint.crypto.PublicKeyOrBuilder getPubKeyOrBuilder() {
      if (pubKeyBuilder_ != null) {
        return pubKeyBuilder_.getMessageOrBuilder();
      } else {
        return pubKey_ == null ?
            tendermint.crypto.PublicKey.getDefaultInstance() : pubKey_;
      }
    }
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 2 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tendermint.crypto.PublicKey, tendermint.crypto.PublicKey.Builder, tendermint.crypto.PublicKeyOrBuilder> 
        getPubKeyFieldBuilder() {
      if (pubKeyBuilder_ == null) {
        pubKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tendermint.crypto.PublicKey, tendermint.crypto.PublicKey.Builder, tendermint.crypto.PublicKeyOrBuilder>(
                getPubKey(),
                getParentForChildren(),
                isClean());
        pubKey_ = null;
      }
      return pubKeyBuilder_;
    }

    private long votingPower_ ;
    /**
     * <code>int64 voting_power = 3;</code>
     */
    public long getVotingPower() {
      return votingPower_;
    }
    /**
     * <code>int64 voting_power = 3;</code>
     */
    public Builder setVotingPower(long value) {
      
      votingPower_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 voting_power = 3;</code>
     */
    public Builder clearVotingPower() {
      
      votingPower_ = 0L;
      onChanged();
      return this;
    }

    private long proposerPriority_ ;
    /**
     * <code>int64 proposer_priority = 4;</code>
     */
    public long getProposerPriority() {
      return proposerPriority_;
    }
    /**
     * <code>int64 proposer_priority = 4;</code>
     */
    public Builder setProposerPriority(long value) {
      
      proposerPriority_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 proposer_priority = 4;</code>
     */
    public Builder clearProposerPriority() {
      
      proposerPriority_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tendermint.types.Validator)
  }

  // @@protoc_insertion_point(class_scope:tendermint.types.Validator)
  private static final tendermint.types.Validator DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tendermint.types.Validator();
  }

  public static tendermint.types.Validator getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Validator>
      PARSER = new com.google.protobuf.AbstractParser<Validator>() {
    @java.lang.Override
    public Validator parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Validator(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Validator> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Validator> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tendermint.types.Validator getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

