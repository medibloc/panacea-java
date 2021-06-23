// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/bank.proto

package cosmos.bank.v1beta1;

/**
 * <pre>
 * DenomUnit represents a struct that describes a given
 * denomination unit of the basic token.
 * </pre>
 *
 * Protobuf type {@code cosmos.bank.v1beta1.DenomUnit}
 */
public  final class DenomUnit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.bank.v1beta1.DenomUnit)
    DenomUnitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DenomUnit.newBuilder() to construct.
  private DenomUnit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DenomUnit() {
    denom_ = "";
    aliases_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DenomUnit(
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

            denom_ = s;
            break;
          }
          case 16: {

            exponent_ = input.readUInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              aliases_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            aliases_.add(s);
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
        aliases_ = aliases_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cosmos.bank.v1beta1.Bank.internal_static_cosmos_bank_v1beta1_DenomUnit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.bank.v1beta1.Bank.internal_static_cosmos_bank_v1beta1_DenomUnit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.bank.v1beta1.DenomUnit.class, cosmos.bank.v1beta1.DenomUnit.Builder.class);
  }

  private int bitField0_;
  public static final int DENOM_FIELD_NUMBER = 1;
  private volatile java.lang.Object denom_;
  /**
   * <pre>
   * denom represents the string name of the given denom unit (e.g uatom).
   * </pre>
   *
   * <code>string denom = 1;</code>
   */
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * denom represents the string name of the given denom unit (e.g uatom).
   * </pre>
   *
   * <code>string denom = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPONENT_FIELD_NUMBER = 2;
  private int exponent_;
  /**
   * <pre>
   * exponent represents power of 10 exponent that one must
   * raise the base_denom to in order to equal the given DenomUnit's denom
   * 1 denom = 1^exponent base_denom
   * (e.g. with a base_denom of uatom, one can create a DenomUnit of 'atom' with
   * exponent = 6, thus: 1 atom = 10^6 uatom).
   * </pre>
   *
   * <code>uint32 exponent = 2;</code>
   */
  public int getExponent() {
    return exponent_;
  }

  public static final int ALIASES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList aliases_;
  /**
   * <pre>
   * aliases is a list of string aliases for the given denom
   * </pre>
   *
   * <code>repeated string aliases = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getAliasesList() {
    return aliases_;
  }
  /**
   * <pre>
   * aliases is a list of string aliases for the given denom
   * </pre>
   *
   * <code>repeated string aliases = 3;</code>
   */
  public int getAliasesCount() {
    return aliases_.size();
  }
  /**
   * <pre>
   * aliases is a list of string aliases for the given denom
   * </pre>
   *
   * <code>repeated string aliases = 3;</code>
   */
  public java.lang.String getAliases(int index) {
    return aliases_.get(index);
  }
  /**
   * <pre>
   * aliases is a list of string aliases for the given denom
   * </pre>
   *
   * <code>repeated string aliases = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAliasesBytes(int index) {
    return aliases_.getByteString(index);
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
    if (!getDenomBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denom_);
    }
    if (exponent_ != 0) {
      output.writeUInt32(2, exponent_);
    }
    for (int i = 0; i < aliases_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, aliases_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDenomBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, denom_);
    }
    if (exponent_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, exponent_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < aliases_.size(); i++) {
        dataSize += computeStringSizeNoTag(aliases_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAliasesList().size();
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
    if (!(obj instanceof cosmos.bank.v1beta1.DenomUnit)) {
      return super.equals(obj);
    }
    cosmos.bank.v1beta1.DenomUnit other = (cosmos.bank.v1beta1.DenomUnit) obj;

    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (getExponent()
        != other.getExponent()) return false;
    if (!getAliasesList()
        .equals(other.getAliasesList())) return false;
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
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + EXPONENT_FIELD_NUMBER;
    hash = (53 * hash) + getExponent();
    if (getAliasesCount() > 0) {
      hash = (37 * hash) + ALIASES_FIELD_NUMBER;
      hash = (53 * hash) + getAliasesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.bank.v1beta1.DenomUnit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.bank.v1beta1.DenomUnit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.DenomUnit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.bank.v1beta1.DenomUnit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.DenomUnit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.bank.v1beta1.DenomUnit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.DenomUnit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.bank.v1beta1.DenomUnit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.DenomUnit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.bank.v1beta1.DenomUnit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.DenomUnit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.bank.v1beta1.DenomUnit parseFrom(
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
  public static Builder newBuilder(cosmos.bank.v1beta1.DenomUnit prototype) {
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
   * DenomUnit represents a struct that describes a given
   * denomination unit of the basic token.
   * </pre>
   *
   * Protobuf type {@code cosmos.bank.v1beta1.DenomUnit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.bank.v1beta1.DenomUnit)
      cosmos.bank.v1beta1.DenomUnitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.bank.v1beta1.Bank.internal_static_cosmos_bank_v1beta1_DenomUnit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.bank.v1beta1.Bank.internal_static_cosmos_bank_v1beta1_DenomUnit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.bank.v1beta1.DenomUnit.class, cosmos.bank.v1beta1.DenomUnit.Builder.class);
    }

    // Construct using cosmos.bank.v1beta1.DenomUnit.newBuilder()
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
      denom_ = "";

      exponent_ = 0;

      aliases_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.bank.v1beta1.Bank.internal_static_cosmos_bank_v1beta1_DenomUnit_descriptor;
    }

    @java.lang.Override
    public cosmos.bank.v1beta1.DenomUnit getDefaultInstanceForType() {
      return cosmos.bank.v1beta1.DenomUnit.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.bank.v1beta1.DenomUnit build() {
      cosmos.bank.v1beta1.DenomUnit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.bank.v1beta1.DenomUnit buildPartial() {
      cosmos.bank.v1beta1.DenomUnit result = new cosmos.bank.v1beta1.DenomUnit(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.denom_ = denom_;
      result.exponent_ = exponent_;
      if (((bitField0_ & 0x00000004) != 0)) {
        aliases_ = aliases_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.aliases_ = aliases_;
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
      if (other instanceof cosmos.bank.v1beta1.DenomUnit) {
        return mergeFrom((cosmos.bank.v1beta1.DenomUnit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.bank.v1beta1.DenomUnit other) {
      if (other == cosmos.bank.v1beta1.DenomUnit.getDefaultInstance()) return this;
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        onChanged();
      }
      if (other.getExponent() != 0) {
        setExponent(other.getExponent());
      }
      if (!other.aliases_.isEmpty()) {
        if (aliases_.isEmpty()) {
          aliases_ = other.aliases_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureAliasesIsMutable();
          aliases_.addAll(other.aliases_);
        }
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
      cosmos.bank.v1beta1.DenomUnit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.bank.v1beta1.DenomUnit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object denom_ = "";
    /**
     * <pre>
     * denom represents the string name of the given denom unit (e.g uatom).
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * denom represents the string name of the given denom unit (e.g uatom).
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * denom represents the string name of the given denom unit (e.g uatom).
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      denom_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * denom represents the string name of the given denom unit (e.g uatom).
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    public Builder clearDenom() {
      
      denom_ = getDefaultInstance().getDenom();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * denom represents the string name of the given denom unit (e.g uatom).
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      denom_ = value;
      onChanged();
      return this;
    }

    private int exponent_ ;
    /**
     * <pre>
     * exponent represents power of 10 exponent that one must
     * raise the base_denom to in order to equal the given DenomUnit's denom
     * 1 denom = 1^exponent base_denom
     * (e.g. with a base_denom of uatom, one can create a DenomUnit of 'atom' with
     * exponent = 6, thus: 1 atom = 10^6 uatom).
     * </pre>
     *
     * <code>uint32 exponent = 2;</code>
     */
    public int getExponent() {
      return exponent_;
    }
    /**
     * <pre>
     * exponent represents power of 10 exponent that one must
     * raise the base_denom to in order to equal the given DenomUnit's denom
     * 1 denom = 1^exponent base_denom
     * (e.g. with a base_denom of uatom, one can create a DenomUnit of 'atom' with
     * exponent = 6, thus: 1 atom = 10^6 uatom).
     * </pre>
     *
     * <code>uint32 exponent = 2;</code>
     */
    public Builder setExponent(int value) {
      
      exponent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * exponent represents power of 10 exponent that one must
     * raise the base_denom to in order to equal the given DenomUnit's denom
     * 1 denom = 1^exponent base_denom
     * (e.g. with a base_denom of uatom, one can create a DenomUnit of 'atom' with
     * exponent = 6, thus: 1 atom = 10^6 uatom).
     * </pre>
     *
     * <code>uint32 exponent = 2;</code>
     */
    public Builder clearExponent() {
      
      exponent_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList aliases_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAliasesIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        aliases_ = new com.google.protobuf.LazyStringArrayList(aliases_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * aliases is a list of string aliases for the given denom
     * </pre>
     *
     * <code>repeated string aliases = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getAliasesList() {
      return aliases_.getUnmodifiableView();
    }
    /**
     * <pre>
     * aliases is a list of string aliases for the given denom
     * </pre>
     *
     * <code>repeated string aliases = 3;</code>
     */
    public int getAliasesCount() {
      return aliases_.size();
    }
    /**
     * <pre>
     * aliases is a list of string aliases for the given denom
     * </pre>
     *
     * <code>repeated string aliases = 3;</code>
     */
    public java.lang.String getAliases(int index) {
      return aliases_.get(index);
    }
    /**
     * <pre>
     * aliases is a list of string aliases for the given denom
     * </pre>
     *
     * <code>repeated string aliases = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAliasesBytes(int index) {
      return aliases_.getByteString(index);
    }
    /**
     * <pre>
     * aliases is a list of string aliases for the given denom
     * </pre>
     *
     * <code>repeated string aliases = 3;</code>
     */
    public Builder setAliases(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAliasesIsMutable();
      aliases_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * aliases is a list of string aliases for the given denom
     * </pre>
     *
     * <code>repeated string aliases = 3;</code>
     */
    public Builder addAliases(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAliasesIsMutable();
      aliases_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * aliases is a list of string aliases for the given denom
     * </pre>
     *
     * <code>repeated string aliases = 3;</code>
     */
    public Builder addAllAliases(
        java.lang.Iterable<java.lang.String> values) {
      ensureAliasesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, aliases_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * aliases is a list of string aliases for the given denom
     * </pre>
     *
     * <code>repeated string aliases = 3;</code>
     */
    public Builder clearAliases() {
      aliases_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * aliases is a list of string aliases for the given denom
     * </pre>
     *
     * <code>repeated string aliases = 3;</code>
     */
    public Builder addAliasesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAliasesIsMutable();
      aliases_.add(value);
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


    // @@protoc_insertion_point(builder_scope:cosmos.bank.v1beta1.DenomUnit)
  }

  // @@protoc_insertion_point(class_scope:cosmos.bank.v1beta1.DenomUnit)
  private static final cosmos.bank.v1beta1.DenomUnit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.bank.v1beta1.DenomUnit();
  }

  public static cosmos.bank.v1beta1.DenomUnit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DenomUnit>
      PARSER = new com.google.protobuf.AbstractParser<DenomUnit>() {
    @java.lang.Override
    public DenomUnit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DenomUnit(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DenomUnit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DenomUnit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.bank.v1beta1.DenomUnit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
