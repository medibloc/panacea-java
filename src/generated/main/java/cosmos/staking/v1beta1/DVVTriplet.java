// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package cosmos.staking.v1beta1;

/**
 * <pre>
 * DVVTriplet is struct that just has a delegator-validator-validator triplet
 * with no other data. It is intended to be used as a marshalable pointer. For
 * example, a DVVTriplet can be used to construct the key to getting a
 * Redelegation from state.
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.DVVTriplet}
 */
public  final class DVVTriplet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.DVVTriplet)
    DVVTripletOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DVVTriplet.newBuilder() to construct.
  private DVVTriplet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DVVTriplet() {
    delegatorAddress_ = "";
    validatorSrcAddress_ = "";
    validatorDstAddress_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DVVTriplet(
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

            delegatorAddress_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            validatorSrcAddress_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            validatorDstAddress_ = s;
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
    return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DVVTriplet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DVVTriplet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.staking.v1beta1.DVVTriplet.class, cosmos.staking.v1beta1.DVVTriplet.Builder.class);
  }

  public static final int DELEGATOR_ADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object delegatorAddress_;
  /**
   * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   */
  public java.lang.String getDelegatorAddress() {
    java.lang.Object ref = delegatorAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      delegatorAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   */
  public com.google.protobuf.ByteString
      getDelegatorAddressBytes() {
    java.lang.Object ref = delegatorAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      delegatorAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATOR_SRC_ADDRESS_FIELD_NUMBER = 2;
  private volatile java.lang.Object validatorSrcAddress_;
  /**
   * <code>string validator_src_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"validator_src_address&#92;""];</code>
   */
  public java.lang.String getValidatorSrcAddress() {
    java.lang.Object ref = validatorSrcAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      validatorSrcAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string validator_src_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"validator_src_address&#92;""];</code>
   */
  public com.google.protobuf.ByteString
      getValidatorSrcAddressBytes() {
    java.lang.Object ref = validatorSrcAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      validatorSrcAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATOR_DST_ADDRESS_FIELD_NUMBER = 3;
  private volatile java.lang.Object validatorDstAddress_;
  /**
   * <code>string validator_dst_address = 3 [(.gogoproto.moretags) = "yaml:&#92;"validator_dst_address&#92;""];</code>
   */
  public java.lang.String getValidatorDstAddress() {
    java.lang.Object ref = validatorDstAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      validatorDstAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string validator_dst_address = 3 [(.gogoproto.moretags) = "yaml:&#92;"validator_dst_address&#92;""];</code>
   */
  public com.google.protobuf.ByteString
      getValidatorDstAddressBytes() {
    java.lang.Object ref = validatorDstAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      validatorDstAddress_ = b;
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
    if (!getDelegatorAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, delegatorAddress_);
    }
    if (!getValidatorSrcAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, validatorSrcAddress_);
    }
    if (!getValidatorDstAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, validatorDstAddress_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDelegatorAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, delegatorAddress_);
    }
    if (!getValidatorSrcAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, validatorSrcAddress_);
    }
    if (!getValidatorDstAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, validatorDstAddress_);
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
    if (!(obj instanceof cosmos.staking.v1beta1.DVVTriplet)) {
      return super.equals(obj);
    }
    cosmos.staking.v1beta1.DVVTriplet other = (cosmos.staking.v1beta1.DVVTriplet) obj;

    if (!getDelegatorAddress()
        .equals(other.getDelegatorAddress())) return false;
    if (!getValidatorSrcAddress()
        .equals(other.getValidatorSrcAddress())) return false;
    if (!getValidatorDstAddress()
        .equals(other.getValidatorDstAddress())) return false;
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
    hash = (37 * hash) + DELEGATOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getDelegatorAddress().hashCode();
    hash = (37 * hash) + VALIDATOR_SRC_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorSrcAddress().hashCode();
    hash = (37 * hash) + VALIDATOR_DST_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorDstAddress().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.staking.v1beta1.DVVTriplet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.DVVTriplet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DVVTriplet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.DVVTriplet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DVVTriplet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.DVVTriplet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DVVTriplet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.DVVTriplet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DVVTriplet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.DVVTriplet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.DVVTriplet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.DVVTriplet parseFrom(
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
  public static Builder newBuilder(cosmos.staking.v1beta1.DVVTriplet prototype) {
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
   * DVVTriplet is struct that just has a delegator-validator-validator triplet
   * with no other data. It is intended to be used as a marshalable pointer. For
   * example, a DVVTriplet can be used to construct the key to getting a
   * Redelegation from state.
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.DVVTriplet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.DVVTriplet)
      cosmos.staking.v1beta1.DVVTripletOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DVVTriplet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DVVTriplet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.staking.v1beta1.DVVTriplet.class, cosmos.staking.v1beta1.DVVTriplet.Builder.class);
    }

    // Construct using cosmos.staking.v1beta1.DVVTriplet.newBuilder()
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
      delegatorAddress_ = "";

      validatorSrcAddress_ = "";

      validatorDstAddress_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.staking.v1beta1.Staking.internal_static_cosmos_staking_v1beta1_DVVTriplet_descriptor;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.DVVTriplet getDefaultInstanceForType() {
      return cosmos.staking.v1beta1.DVVTriplet.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.DVVTriplet build() {
      cosmos.staking.v1beta1.DVVTriplet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.DVVTriplet buildPartial() {
      cosmos.staking.v1beta1.DVVTriplet result = new cosmos.staking.v1beta1.DVVTriplet(this);
      result.delegatorAddress_ = delegatorAddress_;
      result.validatorSrcAddress_ = validatorSrcAddress_;
      result.validatorDstAddress_ = validatorDstAddress_;
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
      if (other instanceof cosmos.staking.v1beta1.DVVTriplet) {
        return mergeFrom((cosmos.staking.v1beta1.DVVTriplet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.staking.v1beta1.DVVTriplet other) {
      if (other == cosmos.staking.v1beta1.DVVTriplet.getDefaultInstance()) return this;
      if (!other.getDelegatorAddress().isEmpty()) {
        delegatorAddress_ = other.delegatorAddress_;
        onChanged();
      }
      if (!other.getValidatorSrcAddress().isEmpty()) {
        validatorSrcAddress_ = other.validatorSrcAddress_;
        onChanged();
      }
      if (!other.getValidatorDstAddress().isEmpty()) {
        validatorDstAddress_ = other.validatorDstAddress_;
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
      cosmos.staking.v1beta1.DVVTriplet parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.staking.v1beta1.DVVTriplet) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object delegatorAddress_ = "";
    /**
     * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     */
    public java.lang.String getDelegatorAddress() {
      java.lang.Object ref = delegatorAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delegatorAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     */
    public com.google.protobuf.ByteString
        getDelegatorAddressBytes() {
      java.lang.Object ref = delegatorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        delegatorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     */
    public Builder setDelegatorAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      delegatorAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     */
    public Builder clearDelegatorAddress() {
      
      delegatorAddress_ = getDefaultInstance().getDelegatorAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     */
    public Builder setDelegatorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      delegatorAddress_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object validatorSrcAddress_ = "";
    /**
     * <code>string validator_src_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"validator_src_address&#92;""];</code>
     */
    public java.lang.String getValidatorSrcAddress() {
      java.lang.Object ref = validatorSrcAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        validatorSrcAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string validator_src_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"validator_src_address&#92;""];</code>
     */
    public com.google.protobuf.ByteString
        getValidatorSrcAddressBytes() {
      java.lang.Object ref = validatorSrcAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        validatorSrcAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string validator_src_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"validator_src_address&#92;""];</code>
     */
    public Builder setValidatorSrcAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      validatorSrcAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string validator_src_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"validator_src_address&#92;""];</code>
     */
    public Builder clearValidatorSrcAddress() {
      
      validatorSrcAddress_ = getDefaultInstance().getValidatorSrcAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string validator_src_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"validator_src_address&#92;""];</code>
     */
    public Builder setValidatorSrcAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      validatorSrcAddress_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object validatorDstAddress_ = "";
    /**
     * <code>string validator_dst_address = 3 [(.gogoproto.moretags) = "yaml:&#92;"validator_dst_address&#92;""];</code>
     */
    public java.lang.String getValidatorDstAddress() {
      java.lang.Object ref = validatorDstAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        validatorDstAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string validator_dst_address = 3 [(.gogoproto.moretags) = "yaml:&#92;"validator_dst_address&#92;""];</code>
     */
    public com.google.protobuf.ByteString
        getValidatorDstAddressBytes() {
      java.lang.Object ref = validatorDstAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        validatorDstAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string validator_dst_address = 3 [(.gogoproto.moretags) = "yaml:&#92;"validator_dst_address&#92;""];</code>
     */
    public Builder setValidatorDstAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      validatorDstAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string validator_dst_address = 3 [(.gogoproto.moretags) = "yaml:&#92;"validator_dst_address&#92;""];</code>
     */
    public Builder clearValidatorDstAddress() {
      
      validatorDstAddress_ = getDefaultInstance().getValidatorDstAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string validator_dst_address = 3 [(.gogoproto.moretags) = "yaml:&#92;"validator_dst_address&#92;""];</code>
     */
    public Builder setValidatorDstAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      validatorDstAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.DVVTriplet)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.DVVTriplet)
  private static final cosmos.staking.v1beta1.DVVTriplet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.staking.v1beta1.DVVTriplet();
  }

  public static cosmos.staking.v1beta1.DVVTriplet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DVVTriplet>
      PARSER = new com.google.protobuf.AbstractParser<DVVTriplet>() {
    @java.lang.Override
    public DVVTriplet parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DVVTriplet(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DVVTriplet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DVVTriplet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.staking.v1beta1.DVVTriplet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
