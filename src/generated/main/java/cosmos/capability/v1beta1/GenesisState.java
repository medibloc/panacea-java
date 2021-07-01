// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/capability/v1beta1/genesis.proto

package cosmos.capability.v1beta1;

/**
 * <pre>
 * GenesisState defines the capability module's genesis state.
 * </pre>
 *
 * Protobuf type {@code cosmos.capability.v1beta1.GenesisState}
 */
public  final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.capability.v1beta1.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
    owners_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GenesisState(
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

            index_ = input.readUInt64();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              owners_ = new java.util.ArrayList<cosmos.capability.v1beta1.GenesisOwners>();
              mutable_bitField0_ |= 0x00000002;
            }
            owners_.add(
                input.readMessage(cosmos.capability.v1beta1.GenesisOwners.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        owners_ = java.util.Collections.unmodifiableList(owners_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cosmos.capability.v1beta1.Genesis.internal_static_cosmos_capability_v1beta1_GenesisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.capability.v1beta1.Genesis.internal_static_cosmos_capability_v1beta1_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.capability.v1beta1.GenesisState.class, cosmos.capability.v1beta1.GenesisState.Builder.class);
  }

  private int bitField0_;
  public static final int INDEX_FIELD_NUMBER = 1;
  private long index_;
  /**
   * <pre>
   * index is the capability global index.
   * </pre>
   *
   * <code>uint64 index = 1;</code>
   */
  public long getIndex() {
    return index_;
  }

  public static final int OWNERS_FIELD_NUMBER = 2;
  private java.util.List<cosmos.capability.v1beta1.GenesisOwners> owners_;
  /**
   * <pre>
   * owners represents a map from index to owners of the capability index
   * index key is string to allow amino marshalling.
   * </pre>
   *
   * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
   */
  public java.util.List<cosmos.capability.v1beta1.GenesisOwners> getOwnersList() {
    return owners_;
  }
  /**
   * <pre>
   * owners represents a map from index to owners of the capability index
   * index key is string to allow amino marshalling.
   * </pre>
   *
   * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
   */
  public java.util.List<? extends cosmos.capability.v1beta1.GenesisOwnersOrBuilder> 
      getOwnersOrBuilderList() {
    return owners_;
  }
  /**
   * <pre>
   * owners represents a map from index to owners of the capability index
   * index key is string to allow amino marshalling.
   * </pre>
   *
   * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
   */
  public int getOwnersCount() {
    return owners_.size();
  }
  /**
   * <pre>
   * owners represents a map from index to owners of the capability index
   * index key is string to allow amino marshalling.
   * </pre>
   *
   * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.capability.v1beta1.GenesisOwners getOwners(int index) {
    return owners_.get(index);
  }
  /**
   * <pre>
   * owners represents a map from index to owners of the capability index
   * index key is string to allow amino marshalling.
   * </pre>
   *
   * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.capability.v1beta1.GenesisOwnersOrBuilder getOwnersOrBuilder(
      int index) {
    return owners_.get(index);
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
    if (index_ != 0L) {
      output.writeUInt64(1, index_);
    }
    for (int i = 0; i < owners_.size(); i++) {
      output.writeMessage(2, owners_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (index_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, index_);
    }
    for (int i = 0; i < owners_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, owners_.get(i));
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
    if (!(obj instanceof cosmos.capability.v1beta1.GenesisState)) {
      return super.equals(obj);
    }
    cosmos.capability.v1beta1.GenesisState other = (cosmos.capability.v1beta1.GenesisState) obj;

    if (getIndex()
        != other.getIndex()) return false;
    if (!getOwnersList()
        .equals(other.getOwnersList())) return false;
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
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIndex());
    if (getOwnersCount() > 0) {
      hash = (37 * hash) + OWNERS_FIELD_NUMBER;
      hash = (53 * hash) + getOwnersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.capability.v1beta1.GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.capability.v1beta1.GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.capability.v1beta1.GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.capability.v1beta1.GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.capability.v1beta1.GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.capability.v1beta1.GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.capability.v1beta1.GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.capability.v1beta1.GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.capability.v1beta1.GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.capability.v1beta1.GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.capability.v1beta1.GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.capability.v1beta1.GenesisState parseFrom(
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
  public static Builder newBuilder(cosmos.capability.v1beta1.GenesisState prototype) {
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
   * GenesisState defines the capability module's genesis state.
   * </pre>
   *
   * Protobuf type {@code cosmos.capability.v1beta1.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.capability.v1beta1.GenesisState)
      cosmos.capability.v1beta1.GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.capability.v1beta1.Genesis.internal_static_cosmos_capability_v1beta1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.capability.v1beta1.Genesis.internal_static_cosmos_capability_v1beta1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.capability.v1beta1.GenesisState.class, cosmos.capability.v1beta1.GenesisState.Builder.class);
    }

    // Construct using cosmos.capability.v1beta1.GenesisState.newBuilder()
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
        getOwnersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      index_ = 0L;

      if (ownersBuilder_ == null) {
        owners_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        ownersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.capability.v1beta1.Genesis.internal_static_cosmos_capability_v1beta1_GenesisState_descriptor;
    }

    @java.lang.Override
    public cosmos.capability.v1beta1.GenesisState getDefaultInstanceForType() {
      return cosmos.capability.v1beta1.GenesisState.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.capability.v1beta1.GenesisState build() {
      cosmos.capability.v1beta1.GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.capability.v1beta1.GenesisState buildPartial() {
      cosmos.capability.v1beta1.GenesisState result = new cosmos.capability.v1beta1.GenesisState(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.index_ = index_;
      if (ownersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          owners_ = java.util.Collections.unmodifiableList(owners_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.owners_ = owners_;
      } else {
        result.owners_ = ownersBuilder_.build();
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
      if (other instanceof cosmos.capability.v1beta1.GenesisState) {
        return mergeFrom((cosmos.capability.v1beta1.GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.capability.v1beta1.GenesisState other) {
      if (other == cosmos.capability.v1beta1.GenesisState.getDefaultInstance()) return this;
      if (other.getIndex() != 0L) {
        setIndex(other.getIndex());
      }
      if (ownersBuilder_ == null) {
        if (!other.owners_.isEmpty()) {
          if (owners_.isEmpty()) {
            owners_ = other.owners_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureOwnersIsMutable();
            owners_.addAll(other.owners_);
          }
          onChanged();
        }
      } else {
        if (!other.owners_.isEmpty()) {
          if (ownersBuilder_.isEmpty()) {
            ownersBuilder_.dispose();
            ownersBuilder_ = null;
            owners_ = other.owners_;
            bitField0_ = (bitField0_ & ~0x00000002);
            ownersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOwnersFieldBuilder() : null;
          } else {
            ownersBuilder_.addAllMessages(other.owners_);
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
      cosmos.capability.v1beta1.GenesisState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.capability.v1beta1.GenesisState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long index_ ;
    /**
     * <pre>
     * index is the capability global index.
     * </pre>
     *
     * <code>uint64 index = 1;</code>
     */
    public long getIndex() {
      return index_;
    }
    /**
     * <pre>
     * index is the capability global index.
     * </pre>
     *
     * <code>uint64 index = 1;</code>
     */
    public Builder setIndex(long value) {
      
      index_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * index is the capability global index.
     * </pre>
     *
     * <code>uint64 index = 1;</code>
     */
    public Builder clearIndex() {
      
      index_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<cosmos.capability.v1beta1.GenesisOwners> owners_ =
      java.util.Collections.emptyList();
    private void ensureOwnersIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        owners_ = new java.util.ArrayList<cosmos.capability.v1beta1.GenesisOwners>(owners_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.capability.v1beta1.GenesisOwners, cosmos.capability.v1beta1.GenesisOwners.Builder, cosmos.capability.v1beta1.GenesisOwnersOrBuilder> ownersBuilder_;

    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<cosmos.capability.v1beta1.GenesisOwners> getOwnersList() {
      if (ownersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(owners_);
      } else {
        return ownersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public int getOwnersCount() {
      if (ownersBuilder_ == null) {
        return owners_.size();
      } else {
        return ownersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.capability.v1beta1.GenesisOwners getOwners(int index) {
      if (ownersBuilder_ == null) {
        return owners_.get(index);
      } else {
        return ownersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setOwners(
        int index, cosmos.capability.v1beta1.GenesisOwners value) {
      if (ownersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOwnersIsMutable();
        owners_.set(index, value);
        onChanged();
      } else {
        ownersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setOwners(
        int index, cosmos.capability.v1beta1.GenesisOwners.Builder builderForValue) {
      if (ownersBuilder_ == null) {
        ensureOwnersIsMutable();
        owners_.set(index, builderForValue.build());
        onChanged();
      } else {
        ownersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addOwners(cosmos.capability.v1beta1.GenesisOwners value) {
      if (ownersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOwnersIsMutable();
        owners_.add(value);
        onChanged();
      } else {
        ownersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addOwners(
        int index, cosmos.capability.v1beta1.GenesisOwners value) {
      if (ownersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOwnersIsMutable();
        owners_.add(index, value);
        onChanged();
      } else {
        ownersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addOwners(
        cosmos.capability.v1beta1.GenesisOwners.Builder builderForValue) {
      if (ownersBuilder_ == null) {
        ensureOwnersIsMutable();
        owners_.add(builderForValue.build());
        onChanged();
      } else {
        ownersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addOwners(
        int index, cosmos.capability.v1beta1.GenesisOwners.Builder builderForValue) {
      if (ownersBuilder_ == null) {
        ensureOwnersIsMutable();
        owners_.add(index, builderForValue.build());
        onChanged();
      } else {
        ownersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addAllOwners(
        java.lang.Iterable<? extends cosmos.capability.v1beta1.GenesisOwners> values) {
      if (ownersBuilder_ == null) {
        ensureOwnersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, owners_);
        onChanged();
      } else {
        ownersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearOwners() {
      if (ownersBuilder_ == null) {
        owners_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        ownersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder removeOwners(int index) {
      if (ownersBuilder_ == null) {
        ensureOwnersIsMutable();
        owners_.remove(index);
        onChanged();
      } else {
        ownersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.capability.v1beta1.GenesisOwners.Builder getOwnersBuilder(
        int index) {
      return getOwnersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.capability.v1beta1.GenesisOwnersOrBuilder getOwnersOrBuilder(
        int index) {
      if (ownersBuilder_ == null) {
        return owners_.get(index);  } else {
        return ownersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends cosmos.capability.v1beta1.GenesisOwnersOrBuilder> 
         getOwnersOrBuilderList() {
      if (ownersBuilder_ != null) {
        return ownersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(owners_);
      }
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.capability.v1beta1.GenesisOwners.Builder addOwnersBuilder() {
      return getOwnersFieldBuilder().addBuilder(
          cosmos.capability.v1beta1.GenesisOwners.getDefaultInstance());
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.capability.v1beta1.GenesisOwners.Builder addOwnersBuilder(
        int index) {
      return getOwnersFieldBuilder().addBuilder(
          index, cosmos.capability.v1beta1.GenesisOwners.getDefaultInstance());
    }
    /**
     * <pre>
     * owners represents a map from index to owners of the capability index
     * index key is string to allow amino marshalling.
     * </pre>
     *
     * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<cosmos.capability.v1beta1.GenesisOwners.Builder> 
         getOwnersBuilderList() {
      return getOwnersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.capability.v1beta1.GenesisOwners, cosmos.capability.v1beta1.GenesisOwners.Builder, cosmos.capability.v1beta1.GenesisOwnersOrBuilder> 
        getOwnersFieldBuilder() {
      if (ownersBuilder_ == null) {
        ownersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cosmos.capability.v1beta1.GenesisOwners, cosmos.capability.v1beta1.GenesisOwners.Builder, cosmos.capability.v1beta1.GenesisOwnersOrBuilder>(
                owners_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        owners_ = null;
      }
      return ownersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.capability.v1beta1.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:cosmos.capability.v1beta1.GenesisState)
  private static final cosmos.capability.v1beta1.GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.capability.v1beta1.GenesisState();
  }

  public static cosmos.capability.v1beta1.GenesisState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisState>
      PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
    @java.lang.Override
    public GenesisState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GenesisState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GenesisState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.capability.v1beta1.GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

