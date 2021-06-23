// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package cosmos.staking.v1beta1;

/**
 * <pre>
 * DVVTriplets defines an array of DVVTriplet objects.
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.DVVTriplets}
 */
public  final class DVVTriplets extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.DVVTriplets)
    DVVTripletsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DVVTriplets.newBuilder() to construct.
  private DVVTriplets(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DVVTriplets() {
    triplets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DVVTriplets(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              triplets_ = new java.util.ArrayList<cosmos.staking.v1beta1.DVVTriplet>();
              mutable_bitField0_ |= 0x00000001;
            }
            triplets_.add(
                input.readMessage(cosmos.staking.v1beta1.DVVTriplet.parser(), extensionRegistry));
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
        triplets_ = java.util.Collections.unmodifiableList(triplets_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DVVTriplets_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DVVTriplets_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.staking.v1beta1.DVVTriplets.class, cosmos.staking.v1beta1.DVVTriplets.Builder.class);
  }

  public static final int TRIPLETS_FIELD_NUMBER = 1;
  private java.util.List<cosmos.staking.v1beta1.DVVTriplet> triplets_;
  /**
   * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
   */
  public java.util.List<cosmos.staking.v1beta1.DVVTriplet> getTripletsList() {
    return triplets_;
  }
  /**
   * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
   */
  public java.util.List<? extends cosmos.staking.v1beta1.DVVTripletOrBuilder> 
      getTripletsOrBuilderList() {
    return triplets_;
  }
  /**
   * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
   */
  public int getTripletsCount() {
    return triplets_.size();
  }
  /**
   * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.staking.v1beta1.DVVTriplet getTriplets(int index) {
    return triplets_.get(index);
  }
  /**
   * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.staking.v1beta1.DVVTripletOrBuilder getTripletsOrBuilder(
      int index) {
    return triplets_.get(index);
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
    for (int i = 0; i < triplets_.size(); i++) {
      output.writeMessage(1, triplets_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < triplets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, triplets_.get(i));
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
    if (!(obj instanceof cosmos.staking.v1beta1.DVVTriplets)) {
      return super.equals(obj);
    }
    cosmos.staking.v1beta1.DVVTriplets other = (cosmos.staking.v1beta1.DVVTriplets) obj;

    if (!getTripletsList()
        .equals(other.getTripletsList())) return false;
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
    if (getTripletsCount() > 0) {
      hash = (37 * hash) + TRIPLETS_FIELD_NUMBER;
      hash = (53 * hash) + getTripletsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.staking.v1beta1.DVVTriplets parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.DVVTriplets parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DVVTriplets parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.DVVTriplets parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DVVTriplets parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.DVVTriplets parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DVVTriplets parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.DVVTriplets parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DVVTriplets parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.DVVTriplets parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DVVTriplets parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.DVVTriplets parseFrom(
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
  public static Builder newBuilder(cosmos.staking.v1beta1.DVVTriplets prototype) {
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
   * DVVTriplets defines an array of DVVTriplet objects.
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.DVVTriplets}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.DVVTriplets)
      cosmos.staking.v1beta1.DVVTripletsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DVVTriplets_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DVVTriplets_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.staking.v1beta1.DVVTriplets.class, cosmos.staking.v1beta1.DVVTriplets.Builder.class);
    }

    // Construct using cosmos.staking.v1beta1.DVVTriplets.newBuilder()
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
        getTripletsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tripletsBuilder_ == null) {
        triplets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tripletsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DVVTriplets_descriptor;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.DVVTriplets getDefaultInstanceForType() {
      return cosmos.staking.v1beta1.DVVTriplets.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.DVVTriplets build() {
      cosmos.staking.v1beta1.DVVTriplets result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.DVVTriplets buildPartial() {
      cosmos.staking.v1beta1.DVVTriplets result = new cosmos.staking.v1beta1.DVVTriplets(this);
      int from_bitField0_ = bitField0_;
      if (tripletsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          triplets_ = java.util.Collections.unmodifiableList(triplets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.triplets_ = triplets_;
      } else {
        result.triplets_ = tripletsBuilder_.build();
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
      if (other instanceof cosmos.staking.v1beta1.DVVTriplets) {
        return mergeFrom((cosmos.staking.v1beta1.DVVTriplets)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.staking.v1beta1.DVVTriplets other) {
      if (other == cosmos.staking.v1beta1.DVVTriplets.getDefaultInstance()) return this;
      if (tripletsBuilder_ == null) {
        if (!other.triplets_.isEmpty()) {
          if (triplets_.isEmpty()) {
            triplets_ = other.triplets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTripletsIsMutable();
            triplets_.addAll(other.triplets_);
          }
          onChanged();
        }
      } else {
        if (!other.triplets_.isEmpty()) {
          if (tripletsBuilder_.isEmpty()) {
            tripletsBuilder_.dispose();
            tripletsBuilder_ = null;
            triplets_ = other.triplets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tripletsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTripletsFieldBuilder() : null;
          } else {
            tripletsBuilder_.addAllMessages(other.triplets_);
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
      cosmos.staking.v1beta1.DVVTriplets parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.staking.v1beta1.DVVTriplets) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<cosmos.staking.v1beta1.DVVTriplet> triplets_ =
      java.util.Collections.emptyList();
    private void ensureTripletsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        triplets_ = new java.util.ArrayList<cosmos.staking.v1beta1.DVVTriplet>(triplets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.staking.v1beta1.DVVTriplet, cosmos.staking.v1beta1.DVVTriplet.Builder, cosmos.staking.v1beta1.DVVTripletOrBuilder> tripletsBuilder_;

    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<cosmos.staking.v1beta1.DVVTriplet> getTripletsList() {
      if (tripletsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(triplets_);
      } else {
        return tripletsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public int getTripletsCount() {
      if (tripletsBuilder_ == null) {
        return triplets_.size();
      } else {
        return tripletsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.DVVTriplet getTriplets(int index) {
      if (tripletsBuilder_ == null) {
        return triplets_.get(index);
      } else {
        return tripletsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setTriplets(
        int index, cosmos.staking.v1beta1.DVVTriplet value) {
      if (tripletsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTripletsIsMutable();
        triplets_.set(index, value);
        onChanged();
      } else {
        tripletsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setTriplets(
        int index, cosmos.staking.v1beta1.DVVTriplet.Builder builderForValue) {
      if (tripletsBuilder_ == null) {
        ensureTripletsIsMutable();
        triplets_.set(index, builderForValue.build());
        onChanged();
      } else {
        tripletsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addTriplets(cosmos.staking.v1beta1.DVVTriplet value) {
      if (tripletsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTripletsIsMutable();
        triplets_.add(value);
        onChanged();
      } else {
        tripletsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addTriplets(
        int index, cosmos.staking.v1beta1.DVVTriplet value) {
      if (tripletsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTripletsIsMutable();
        triplets_.add(index, value);
        onChanged();
      } else {
        tripletsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addTriplets(
        cosmos.staking.v1beta1.DVVTriplet.Builder builderForValue) {
      if (tripletsBuilder_ == null) {
        ensureTripletsIsMutable();
        triplets_.add(builderForValue.build());
        onChanged();
      } else {
        tripletsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addTriplets(
        int index, cosmos.staking.v1beta1.DVVTriplet.Builder builderForValue) {
      if (tripletsBuilder_ == null) {
        ensureTripletsIsMutable();
        triplets_.add(index, builderForValue.build());
        onChanged();
      } else {
        tripletsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addAllTriplets(
        java.lang.Iterable<? extends cosmos.staking.v1beta1.DVVTriplet> values) {
      if (tripletsBuilder_ == null) {
        ensureTripletsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, triplets_);
        onChanged();
      } else {
        tripletsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearTriplets() {
      if (tripletsBuilder_ == null) {
        triplets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tripletsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder removeTriplets(int index) {
      if (tripletsBuilder_ == null) {
        ensureTripletsIsMutable();
        triplets_.remove(index);
        onChanged();
      } else {
        tripletsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.DVVTriplet.Builder getTripletsBuilder(
        int index) {
      return getTripletsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.DVVTripletOrBuilder getTripletsOrBuilder(
        int index) {
      if (tripletsBuilder_ == null) {
        return triplets_.get(index);  } else {
        return tripletsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends cosmos.staking.v1beta1.DVVTripletOrBuilder> 
         getTripletsOrBuilderList() {
      if (tripletsBuilder_ != null) {
        return tripletsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(triplets_);
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.DVVTriplet.Builder addTripletsBuilder() {
      return getTripletsFieldBuilder().addBuilder(
          cosmos.staking.v1beta1.DVVTriplet.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.DVVTriplet.Builder addTripletsBuilder(
        int index) {
      return getTripletsFieldBuilder().addBuilder(
          index, cosmos.staking.v1beta1.DVVTriplet.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DVVTriplet triplets = 1 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<cosmos.staking.v1beta1.DVVTriplet.Builder> 
         getTripletsBuilderList() {
      return getTripletsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.staking.v1beta1.DVVTriplet, cosmos.staking.v1beta1.DVVTriplet.Builder, cosmos.staking.v1beta1.DVVTripletOrBuilder> 
        getTripletsFieldBuilder() {
      if (tripletsBuilder_ == null) {
        tripletsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cosmos.staking.v1beta1.DVVTriplet, cosmos.staking.v1beta1.DVVTriplet.Builder, cosmos.staking.v1beta1.DVVTripletOrBuilder>(
                triplets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        triplets_ = null;
      }
      return tripletsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.DVVTriplets)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.DVVTriplets)
  private static final cosmos.staking.v1beta1.DVVTriplets DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.staking.v1beta1.DVVTriplets();
  }

  public static cosmos.staking.v1beta1.DVVTriplets getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DVVTriplets>
      PARSER = new com.google.protobuf.AbstractParser<DVVTriplets>() {
    @java.lang.Override
    public DVVTriplets parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DVVTriplets(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DVVTriplets> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DVVTriplets> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.staking.v1beta1.DVVTriplets getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
