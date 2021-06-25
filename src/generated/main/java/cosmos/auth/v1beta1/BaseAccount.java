// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/auth/v1beta1/auth.proto

package cosmos.auth.v1beta1;

/**
 * <pre>
 * BaseAccount defines a base account type. It contains all the necessary fields
 * for basic account functionality. Any custom account type should extend this
 * type for additional functionality (e.g. vesting).
 * </pre>
 *
 * Protobuf type {@code cosmos.auth.v1beta1.BaseAccount}
 */
public  final class BaseAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.auth.v1beta1.BaseAccount)
    BaseAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BaseAccount.newBuilder() to construct.
  private BaseAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BaseAccount() {
    address_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BaseAccount(
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

            address_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Any.Builder subBuilder = null;
            if (pubKey_ != null) {
              subBuilder = pubKey_.toBuilder();
            }
            pubKey_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pubKey_);
              pubKey_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            accountNumber_ = input.readUInt64();
            break;
          }
          case 32: {

            sequence_ = input.readUInt64();
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
    return cosmos.auth.v1beta1.Auth.internal_static_cosmos_auth_v1beta1_BaseAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.auth.v1beta1.Auth.internal_static_cosmos_auth_v1beta1_BaseAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.auth.v1beta1.BaseAccount.class, cosmos.auth.v1beta1.BaseAccount.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object address_;
  /**
   * <code>string address = 1;</code>
   */
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUB_KEY_FIELD_NUMBER = 2;
  private com.google.protobuf.Any pubKey_;
  /**
   * <code>.google.protobuf.Any pub_key = 2 [(.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
   */
  public boolean hasPubKey() {
    return pubKey_ != null;
  }
  /**
   * <code>.google.protobuf.Any pub_key = 2 [(.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
   */
  public com.google.protobuf.Any getPubKey() {
    return pubKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : pubKey_;
  }
  /**
   * <code>.google.protobuf.Any pub_key = 2 [(.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
   */
  public com.google.protobuf.AnyOrBuilder getPubKeyOrBuilder() {
    return getPubKey();
  }

  public static final int ACCOUNT_NUMBER_FIELD_NUMBER = 3;
  private long accountNumber_;
  /**
   * <code>uint64 account_number = 3 [(.gogoproto.moretags) = "yaml:&#92;"account_number&#92;""];</code>
   */
  public long getAccountNumber() {
    return accountNumber_;
  }

  public static final int SEQUENCE_FIELD_NUMBER = 4;
  private long sequence_;
  /**
   * <code>uint64 sequence = 4;</code>
   */
  public long getSequence() {
    return sequence_;
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
    if (!getAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
    }
    if (pubKey_ != null) {
      output.writeMessage(2, getPubKey());
    }
    if (accountNumber_ != 0L) {
      output.writeUInt64(3, accountNumber_);
    }
    if (sequence_ != 0L) {
      output.writeUInt64(4, sequence_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
    }
    if (pubKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPubKey());
    }
    if (accountNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, accountNumber_);
    }
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, sequence_);
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
    if (!(obj instanceof cosmos.auth.v1beta1.BaseAccount)) {
      return super.equals(obj);
    }
    cosmos.auth.v1beta1.BaseAccount other = (cosmos.auth.v1beta1.BaseAccount) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (hasPubKey() != other.hasPubKey()) return false;
    if (hasPubKey()) {
      if (!getPubKey()
          .equals(other.getPubKey())) return false;
    }
    if (getAccountNumber()
        != other.getAccountNumber()) return false;
    if (getSequence()
        != other.getSequence()) return false;
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
    hash = (37 * hash) + ACCOUNT_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAccountNumber());
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.auth.v1beta1.BaseAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.auth.v1beta1.BaseAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.auth.v1beta1.BaseAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.auth.v1beta1.BaseAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.auth.v1beta1.BaseAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.auth.v1beta1.BaseAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.auth.v1beta1.BaseAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.auth.v1beta1.BaseAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.auth.v1beta1.BaseAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.auth.v1beta1.BaseAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.auth.v1beta1.BaseAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.auth.v1beta1.BaseAccount parseFrom(
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
  public static Builder newBuilder(cosmos.auth.v1beta1.BaseAccount prototype) {
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
   * BaseAccount defines a base account type. It contains all the necessary fields
   * for basic account functionality. Any custom account type should extend this
   * type for additional functionality (e.g. vesting).
   * </pre>
   *
   * Protobuf type {@code cosmos.auth.v1beta1.BaseAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.auth.v1beta1.BaseAccount)
      cosmos.auth.v1beta1.BaseAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.auth.v1beta1.Auth.internal_static_cosmos_auth_v1beta1_BaseAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.auth.v1beta1.Auth.internal_static_cosmos_auth_v1beta1_BaseAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.auth.v1beta1.BaseAccount.class, cosmos.auth.v1beta1.BaseAccount.Builder.class);
    }

    // Construct using cosmos.auth.v1beta1.BaseAccount.newBuilder()
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
      address_ = "";

      if (pubKeyBuilder_ == null) {
        pubKey_ = null;
      } else {
        pubKey_ = null;
        pubKeyBuilder_ = null;
      }
      accountNumber_ = 0L;

      sequence_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.auth.v1beta1.Auth.internal_static_cosmos_auth_v1beta1_BaseAccount_descriptor;
    }

    @java.lang.Override
    public cosmos.auth.v1beta1.BaseAccount getDefaultInstanceForType() {
      return cosmos.auth.v1beta1.BaseAccount.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.auth.v1beta1.BaseAccount build() {
      cosmos.auth.v1beta1.BaseAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.auth.v1beta1.BaseAccount buildPartial() {
      cosmos.auth.v1beta1.BaseAccount result = new cosmos.auth.v1beta1.BaseAccount(this);
      result.address_ = address_;
      if (pubKeyBuilder_ == null) {
        result.pubKey_ = pubKey_;
      } else {
        result.pubKey_ = pubKeyBuilder_.build();
      }
      result.accountNumber_ = accountNumber_;
      result.sequence_ = sequence_;
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
      if (other instanceof cosmos.auth.v1beta1.BaseAccount) {
        return mergeFrom((cosmos.auth.v1beta1.BaseAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.auth.v1beta1.BaseAccount other) {
      if (other == cosmos.auth.v1beta1.BaseAccount.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        onChanged();
      }
      if (other.hasPubKey()) {
        mergePubKey(other.getPubKey());
      }
      if (other.getAccountNumber() != 0L) {
        setAccountNumber(other.getAccountNumber());
      }
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
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
      cosmos.auth.v1beta1.BaseAccount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.auth.v1beta1.BaseAccount) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 1;</code>
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 1;</code>
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      address_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1;</code>
     */
    public Builder clearAddress() {
      
      address_ = getDefaultInstance().getAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1;</code>
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      address_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any pubKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> pubKeyBuilder_;
    /**
     * <code>.google.protobuf.Any pub_key = 2 [(.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    public boolean hasPubKey() {
      return pubKeyBuilder_ != null || pubKey_ != null;
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2 [(.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    public com.google.protobuf.Any getPubKey() {
      if (pubKeyBuilder_ == null) {
        return pubKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : pubKey_;
      } else {
        return pubKeyBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2 [(.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    public Builder setPubKey(com.google.protobuf.Any value) {
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
     * <code>.google.protobuf.Any pub_key = 2 [(.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    public Builder setPubKey(
        com.google.protobuf.Any.Builder builderForValue) {
      if (pubKeyBuilder_ == null) {
        pubKey_ = builderForValue.build();
        onChanged();
      } else {
        pubKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2 [(.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    public Builder mergePubKey(com.google.protobuf.Any value) {
      if (pubKeyBuilder_ == null) {
        if (pubKey_ != null) {
          pubKey_ =
            com.google.protobuf.Any.newBuilder(pubKey_).mergeFrom(value).buildPartial();
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
     * <code>.google.protobuf.Any pub_key = 2 [(.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
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
     * <code>.google.protobuf.Any pub_key = 2 [(.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    public com.google.protobuf.Any.Builder getPubKeyBuilder() {
      
      onChanged();
      return getPubKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2 [(.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    public com.google.protobuf.AnyOrBuilder getPubKeyOrBuilder() {
      if (pubKeyBuilder_ != null) {
        return pubKeyBuilder_.getMessageOrBuilder();
      } else {
        return pubKey_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : pubKey_;
      }
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2 [(.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getPubKeyFieldBuilder() {
      if (pubKeyBuilder_ == null) {
        pubKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getPubKey(),
                getParentForChildren(),
                isClean());
        pubKey_ = null;
      }
      return pubKeyBuilder_;
    }

    private long accountNumber_ ;
    /**
     * <code>uint64 account_number = 3 [(.gogoproto.moretags) = "yaml:&#92;"account_number&#92;""];</code>
     */
    public long getAccountNumber() {
      return accountNumber_;
    }
    /**
     * <code>uint64 account_number = 3 [(.gogoproto.moretags) = "yaml:&#92;"account_number&#92;""];</code>
     */
    public Builder setAccountNumber(long value) {
      
      accountNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 account_number = 3 [(.gogoproto.moretags) = "yaml:&#92;"account_number&#92;""];</code>
     */
    public Builder clearAccountNumber() {
      
      accountNumber_ = 0L;
      onChanged();
      return this;
    }

    private long sequence_ ;
    /**
     * <code>uint64 sequence = 4;</code>
     */
    public long getSequence() {
      return sequence_;
    }
    /**
     * <code>uint64 sequence = 4;</code>
     */
    public Builder setSequence(long value) {
      
      sequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 sequence = 4;</code>
     */
    public Builder clearSequence() {
      
      sequence_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:cosmos.auth.v1beta1.BaseAccount)
  }

  // @@protoc_insertion_point(class_scope:cosmos.auth.v1beta1.BaseAccount)
  private static final cosmos.auth.v1beta1.BaseAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.auth.v1beta1.BaseAccount();
  }

  public static cosmos.auth.v1beta1.BaseAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BaseAccount>
      PARSER = new com.google.protobuf.AbstractParser<BaseAccount>() {
    @java.lang.Override
    public BaseAccount parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BaseAccount(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BaseAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BaseAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.auth.v1beta1.BaseAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

