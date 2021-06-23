// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package cosmos.staking.v1beta1;

/**
 * <pre>
 * ValAddresses defines a repeated set of validator addresses.
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.ValAddresses}
 */
public  final class ValAddresses extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.ValAddresses)
    ValAddressesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValAddresses.newBuilder() to construct.
  private ValAddresses(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValAddresses() {
    addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ValAddresses(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              addresses_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            addresses_.add(s);
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
        addresses_ = addresses_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_ValAddresses_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_ValAddresses_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.staking.v1beta1.ValAddresses.class, cosmos.staking.v1beta1.ValAddresses.Builder.class);
  }

  public static final int ADDRESSES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList addresses_;
  /**
   * <code>repeated string addresses = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getAddressesList() {
    return addresses_;
  }
  /**
   * <code>repeated string addresses = 1;</code>
   */
  public int getAddressesCount() {
    return addresses_.size();
  }
  /**
   * <code>repeated string addresses = 1;</code>
   */
  public java.lang.String getAddresses(int index) {
    return addresses_.get(index);
  }
  /**
   * <code>repeated string addresses = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAddressesBytes(int index) {
    return addresses_.getByteString(index);
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
    for (int i = 0; i < addresses_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addresses_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < addresses_.size(); i++) {
        dataSize += computeStringSizeNoTag(addresses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAddressesList().size();
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
    if (!(obj instanceof cosmos.staking.v1beta1.ValAddresses)) {
      return super.equals(obj);
    }
    cosmos.staking.v1beta1.ValAddresses other = (cosmos.staking.v1beta1.ValAddresses) obj;

    if (!getAddressesList()
        .equals(other.getAddressesList())) return false;
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
    if (getAddressesCount() > 0) {
      hash = (37 * hash) + ADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getAddressesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.staking.v1beta1.ValAddresses parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.ValAddresses parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.ValAddresses parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.ValAddresses parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.ValAddresses parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.ValAddresses parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.ValAddresses parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.ValAddresses parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.ValAddresses parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.ValAddresses parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.ValAddresses parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.ValAddresses parseFrom(
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
  public static Builder newBuilder(cosmos.staking.v1beta1.ValAddresses prototype) {
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
   * ValAddresses defines a repeated set of validator addresses.
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.ValAddresses}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.ValAddresses)
      cosmos.staking.v1beta1.ValAddressesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_ValAddresses_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_ValAddresses_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.staking.v1beta1.ValAddresses.class, cosmos.staking.v1beta1.ValAddresses.Builder.class);
    }

    // Construct using cosmos.staking.v1beta1.ValAddresses.newBuilder()
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
      addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_ValAddresses_descriptor;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.ValAddresses getDefaultInstanceForType() {
      return cosmos.staking.v1beta1.ValAddresses.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.ValAddresses build() {
      cosmos.staking.v1beta1.ValAddresses result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.ValAddresses buildPartial() {
      cosmos.staking.v1beta1.ValAddresses result = new cosmos.staking.v1beta1.ValAddresses(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        addresses_ = addresses_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.addresses_ = addresses_;
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
      if (other instanceof cosmos.staking.v1beta1.ValAddresses) {
        return mergeFrom((cosmos.staking.v1beta1.ValAddresses)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.staking.v1beta1.ValAddresses other) {
      if (other == cosmos.staking.v1beta1.ValAddresses.getDefaultInstance()) return this;
      if (!other.addresses_.isEmpty()) {
        if (addresses_.isEmpty()) {
          addresses_ = other.addresses_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAddressesIsMutable();
          addresses_.addAll(other.addresses_);
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
      cosmos.staking.v1beta1.ValAddresses parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.staking.v1beta1.ValAddresses) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAddressesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        addresses_ = new com.google.protobuf.LazyStringArrayList(addresses_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getAddressesList() {
      return addresses_.getUnmodifiableView();
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public int getAddressesCount() {
      return addresses_.size();
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public java.lang.String getAddresses(int index) {
      return addresses_.get(index);
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAddressesBytes(int index) {
      return addresses_.getByteString(index);
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public Builder setAddresses(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressesIsMutable();
      addresses_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public Builder addAddresses(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressesIsMutable();
      addresses_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public Builder addAllAddresses(
        java.lang.Iterable<java.lang.String> values) {
      ensureAddressesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, addresses_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public Builder clearAddresses() {
      addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public Builder addAddressesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAddressesIsMutable();
      addresses_.add(value);
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.ValAddresses)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.ValAddresses)
  private static final cosmos.staking.v1beta1.ValAddresses DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.staking.v1beta1.ValAddresses();
  }

  public static cosmos.staking.v1beta1.ValAddresses getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValAddresses>
      PARSER = new com.google.protobuf.AbstractParser<ValAddresses>() {
    @java.lang.Override
    public ValAddresses parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ValAddresses(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ValAddresses> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValAddresses> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.staking.v1beta1.ValAddresses getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
