// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: token/tx.proto

package medibloc.panaceacore.token;

/**
 * <pre>
 * this line is used by starport scaffolding # proto/tx/message
 * </pre>
 *
 * Protobuf type {@code medibloc.panaceacore.token.MsgIssueToken}
 */
public  final class MsgIssueToken extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:medibloc.panaceacore.token.MsgIssueToken)
    MsgIssueTokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgIssueToken.newBuilder() to construct.
  private MsgIssueToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgIssueToken() {
    name_ = "";
    shortSymbol_ = "";
    ownerAddress_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgIssueToken(
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

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            shortSymbol_ = s;
            break;
          }
          case 26: {
            cosmos.base.v1beta1.IntProto.Builder subBuilder = null;
            if (totalSupplyMicro_ != null) {
              subBuilder = totalSupplyMicro_.toBuilder();
            }
            totalSupplyMicro_ = input.readMessage(cosmos.base.v1beta1.IntProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(totalSupplyMicro_);
              totalSupplyMicro_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            mintable_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            ownerAddress_ = s;
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
    return medibloc.panaceacore.token.Tx.internal_static_medibloc_panaceacore_token_MsgIssueToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return medibloc.panaceacore.token.Tx.internal_static_medibloc_panaceacore_token_MsgIssueToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            medibloc.panaceacore.token.MsgIssueToken.class, medibloc.panaceacore.token.MsgIssueToken.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHORTSYMBOL_FIELD_NUMBER = 2;
  private volatile java.lang.Object shortSymbol_;
  /**
   * <code>string shortSymbol = 2;</code>
   */
  public java.lang.String getShortSymbol() {
    java.lang.Object ref = shortSymbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shortSymbol_ = s;
      return s;
    }
  }
  /**
   * <code>string shortSymbol = 2;</code>
   */
  public com.google.protobuf.ByteString
      getShortSymbolBytes() {
    java.lang.Object ref = shortSymbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shortSymbol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTALSUPPLYMICRO_FIELD_NUMBER = 3;
  private cosmos.base.v1beta1.IntProto totalSupplyMicro_;
  /**
   * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasTotalSupplyMicro() {
    return totalSupplyMicro_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.base.v1beta1.IntProto getTotalSupplyMicro() {
    return totalSupplyMicro_ == null ? cosmos.base.v1beta1.IntProto.getDefaultInstance() : totalSupplyMicro_;
  }
  /**
   * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.base.v1beta1.IntProtoOrBuilder getTotalSupplyMicroOrBuilder() {
    return getTotalSupplyMicro();
  }

  public static final int MINTABLE_FIELD_NUMBER = 4;
  private boolean mintable_;
  /**
   * <code>bool mintable = 4;</code>
   */
  public boolean getMintable() {
    return mintable_;
  }

  public static final int OWNERADDRESS_FIELD_NUMBER = 5;
  private volatile java.lang.Object ownerAddress_;
  /**
   * <code>string ownerAddress = 5;</code>
   */
  public java.lang.String getOwnerAddress() {
    java.lang.Object ref = ownerAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ownerAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string ownerAddress = 5;</code>
   */
  public com.google.protobuf.ByteString
      getOwnerAddressBytes() {
    java.lang.Object ref = ownerAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ownerAddress_ = b;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getShortSymbolBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, shortSymbol_);
    }
    if (totalSupplyMicro_ != null) {
      output.writeMessage(3, getTotalSupplyMicro());
    }
    if (mintable_ != false) {
      output.writeBool(4, mintable_);
    }
    if (!getOwnerAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, ownerAddress_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getShortSymbolBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, shortSymbol_);
    }
    if (totalSupplyMicro_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTotalSupplyMicro());
    }
    if (mintable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, mintable_);
    }
    if (!getOwnerAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, ownerAddress_);
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
    if (!(obj instanceof medibloc.panaceacore.token.MsgIssueToken)) {
      return super.equals(obj);
    }
    medibloc.panaceacore.token.MsgIssueToken other = (medibloc.panaceacore.token.MsgIssueToken) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getShortSymbol()
        .equals(other.getShortSymbol())) return false;
    if (hasTotalSupplyMicro() != other.hasTotalSupplyMicro()) return false;
    if (hasTotalSupplyMicro()) {
      if (!getTotalSupplyMicro()
          .equals(other.getTotalSupplyMicro())) return false;
    }
    if (getMintable()
        != other.getMintable()) return false;
    if (!getOwnerAddress()
        .equals(other.getOwnerAddress())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SHORTSYMBOL_FIELD_NUMBER;
    hash = (53 * hash) + getShortSymbol().hashCode();
    if (hasTotalSupplyMicro()) {
      hash = (37 * hash) + TOTALSUPPLYMICRO_FIELD_NUMBER;
      hash = (53 * hash) + getTotalSupplyMicro().hashCode();
    }
    hash = (37 * hash) + MINTABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMintable());
    hash = (37 * hash) + OWNERADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getOwnerAddress().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static medibloc.panaceacore.token.MsgIssueToken parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static medibloc.panaceacore.token.MsgIssueToken parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static medibloc.panaceacore.token.MsgIssueToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static medibloc.panaceacore.token.MsgIssueToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static medibloc.panaceacore.token.MsgIssueToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static medibloc.panaceacore.token.MsgIssueToken parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static medibloc.panaceacore.token.MsgIssueToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static medibloc.panaceacore.token.MsgIssueToken parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static medibloc.panaceacore.token.MsgIssueToken parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static medibloc.panaceacore.token.MsgIssueToken parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static medibloc.panaceacore.token.MsgIssueToken parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static medibloc.panaceacore.token.MsgIssueToken parseFrom(
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
  public static Builder newBuilder(medibloc.panaceacore.token.MsgIssueToken prototype) {
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
   * this line is used by starport scaffolding # proto/tx/message
   * </pre>
   *
   * Protobuf type {@code medibloc.panaceacore.token.MsgIssueToken}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:medibloc.panaceacore.token.MsgIssueToken)
      medibloc.panaceacore.token.MsgIssueTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return medibloc.panaceacore.token.Tx.internal_static_medibloc_panaceacore_token_MsgIssueToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return medibloc.panaceacore.token.Tx.internal_static_medibloc_panaceacore_token_MsgIssueToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              medibloc.panaceacore.token.MsgIssueToken.class, medibloc.panaceacore.token.MsgIssueToken.Builder.class);
    }

    // Construct using medibloc.panaceacore.token.MsgIssueToken.newBuilder()
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
      name_ = "";

      shortSymbol_ = "";

      if (totalSupplyMicroBuilder_ == null) {
        totalSupplyMicro_ = null;
      } else {
        totalSupplyMicro_ = null;
        totalSupplyMicroBuilder_ = null;
      }
      mintable_ = false;

      ownerAddress_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return medibloc.panaceacore.token.Tx.internal_static_medibloc_panaceacore_token_MsgIssueToken_descriptor;
    }

    @java.lang.Override
    public medibloc.panaceacore.token.MsgIssueToken getDefaultInstanceForType() {
      return medibloc.panaceacore.token.MsgIssueToken.getDefaultInstance();
    }

    @java.lang.Override
    public medibloc.panaceacore.token.MsgIssueToken build() {
      medibloc.panaceacore.token.MsgIssueToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public medibloc.panaceacore.token.MsgIssueToken buildPartial() {
      medibloc.panaceacore.token.MsgIssueToken result = new medibloc.panaceacore.token.MsgIssueToken(this);
      result.name_ = name_;
      result.shortSymbol_ = shortSymbol_;
      if (totalSupplyMicroBuilder_ == null) {
        result.totalSupplyMicro_ = totalSupplyMicro_;
      } else {
        result.totalSupplyMicro_ = totalSupplyMicroBuilder_.build();
      }
      result.mintable_ = mintable_;
      result.ownerAddress_ = ownerAddress_;
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
      if (other instanceof medibloc.panaceacore.token.MsgIssueToken) {
        return mergeFrom((medibloc.panaceacore.token.MsgIssueToken)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(medibloc.panaceacore.token.MsgIssueToken other) {
      if (other == medibloc.panaceacore.token.MsgIssueToken.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getShortSymbol().isEmpty()) {
        shortSymbol_ = other.shortSymbol_;
        onChanged();
      }
      if (other.hasTotalSupplyMicro()) {
        mergeTotalSupplyMicro(other.getTotalSupplyMicro());
      }
      if (other.getMintable() != false) {
        setMintable(other.getMintable());
      }
      if (!other.getOwnerAddress().isEmpty()) {
        ownerAddress_ = other.ownerAddress_;
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
      medibloc.panaceacore.token.MsgIssueToken parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (medibloc.panaceacore.token.MsgIssueToken) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object shortSymbol_ = "";
    /**
     * <code>string shortSymbol = 2;</code>
     */
    public java.lang.String getShortSymbol() {
      java.lang.Object ref = shortSymbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shortSymbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string shortSymbol = 2;</code>
     */
    public com.google.protobuf.ByteString
        getShortSymbolBytes() {
      java.lang.Object ref = shortSymbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shortSymbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string shortSymbol = 2;</code>
     */
    public Builder setShortSymbol(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      shortSymbol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string shortSymbol = 2;</code>
     */
    public Builder clearShortSymbol() {
      
      shortSymbol_ = getDefaultInstance().getShortSymbol();
      onChanged();
      return this;
    }
    /**
     * <code>string shortSymbol = 2;</code>
     */
    public Builder setShortSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      shortSymbol_ = value;
      onChanged();
      return this;
    }

    private cosmos.base.v1beta1.IntProto totalSupplyMicro_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.v1beta1.IntProto, cosmos.base.v1beta1.IntProto.Builder, cosmos.base.v1beta1.IntProtoOrBuilder> totalSupplyMicroBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasTotalSupplyMicro() {
      return totalSupplyMicroBuilder_ != null || totalSupplyMicro_ != null;
    }
    /**
     * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.base.v1beta1.IntProto getTotalSupplyMicro() {
      if (totalSupplyMicroBuilder_ == null) {
        return totalSupplyMicro_ == null ? cosmos.base.v1beta1.IntProto.getDefaultInstance() : totalSupplyMicro_;
      } else {
        return totalSupplyMicroBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setTotalSupplyMicro(cosmos.base.v1beta1.IntProto value) {
      if (totalSupplyMicroBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        totalSupplyMicro_ = value;
        onChanged();
      } else {
        totalSupplyMicroBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setTotalSupplyMicro(
        cosmos.base.v1beta1.IntProto.Builder builderForValue) {
      if (totalSupplyMicroBuilder_ == null) {
        totalSupplyMicro_ = builderForValue.build();
        onChanged();
      } else {
        totalSupplyMicroBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeTotalSupplyMicro(cosmos.base.v1beta1.IntProto value) {
      if (totalSupplyMicroBuilder_ == null) {
        if (totalSupplyMicro_ != null) {
          totalSupplyMicro_ =
            cosmos.base.v1beta1.IntProto.newBuilder(totalSupplyMicro_).mergeFrom(value).buildPartial();
        } else {
          totalSupplyMicro_ = value;
        }
        onChanged();
      } else {
        totalSupplyMicroBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearTotalSupplyMicro() {
      if (totalSupplyMicroBuilder_ == null) {
        totalSupplyMicro_ = null;
        onChanged();
      } else {
        totalSupplyMicro_ = null;
        totalSupplyMicroBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.base.v1beta1.IntProto.Builder getTotalSupplyMicroBuilder() {
      
      onChanged();
      return getTotalSupplyMicroFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.base.v1beta1.IntProtoOrBuilder getTotalSupplyMicroOrBuilder() {
      if (totalSupplyMicroBuilder_ != null) {
        return totalSupplyMicroBuilder_.getMessageOrBuilder();
      } else {
        return totalSupplyMicro_ == null ?
            cosmos.base.v1beta1.IntProto.getDefaultInstance() : totalSupplyMicro_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.IntProto totalSupplyMicro = 3 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.v1beta1.IntProto, cosmos.base.v1beta1.IntProto.Builder, cosmos.base.v1beta1.IntProtoOrBuilder> 
        getTotalSupplyMicroFieldBuilder() {
      if (totalSupplyMicroBuilder_ == null) {
        totalSupplyMicroBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.base.v1beta1.IntProto, cosmos.base.v1beta1.IntProto.Builder, cosmos.base.v1beta1.IntProtoOrBuilder>(
                getTotalSupplyMicro(),
                getParentForChildren(),
                isClean());
        totalSupplyMicro_ = null;
      }
      return totalSupplyMicroBuilder_;
    }

    private boolean mintable_ ;
    /**
     * <code>bool mintable = 4;</code>
     */
    public boolean getMintable() {
      return mintable_;
    }
    /**
     * <code>bool mintable = 4;</code>
     */
    public Builder setMintable(boolean value) {
      
      mintable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mintable = 4;</code>
     */
    public Builder clearMintable() {
      
      mintable_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object ownerAddress_ = "";
    /**
     * <code>string ownerAddress = 5;</code>
     */
    public java.lang.String getOwnerAddress() {
      java.lang.Object ref = ownerAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ownerAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ownerAddress = 5;</code>
     */
    public com.google.protobuf.ByteString
        getOwnerAddressBytes() {
      java.lang.Object ref = ownerAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ownerAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ownerAddress = 5;</code>
     */
    public Builder setOwnerAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ownerAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ownerAddress = 5;</code>
     */
    public Builder clearOwnerAddress() {
      
      ownerAddress_ = getDefaultInstance().getOwnerAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string ownerAddress = 5;</code>
     */
    public Builder setOwnerAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ownerAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:medibloc.panaceacore.token.MsgIssueToken)
  }

  // @@protoc_insertion_point(class_scope:medibloc.panaceacore.token.MsgIssueToken)
  private static final medibloc.panaceacore.token.MsgIssueToken DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new medibloc.panaceacore.token.MsgIssueToken();
  }

  public static medibloc.panaceacore.token.MsgIssueToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgIssueToken>
      PARSER = new com.google.protobuf.AbstractParser<MsgIssueToken>() {
    @java.lang.Override
    public MsgIssueToken parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgIssueToken(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgIssueToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgIssueToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public medibloc.panaceacore.token.MsgIssueToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

