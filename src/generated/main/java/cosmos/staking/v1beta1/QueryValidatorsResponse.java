// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

/**
 * <pre>
 * QueryValidatorsResponse is response type for the Query/Validators RPC method
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.QueryValidatorsResponse}
 */
public  final class QueryValidatorsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.QueryValidatorsResponse)
    QueryValidatorsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryValidatorsResponse.newBuilder() to construct.
  private QueryValidatorsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryValidatorsResponse() {
    validators_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryValidatorsResponse(
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
              validators_ = new java.util.ArrayList<cosmos.staking.v1beta1.Validator>();
              mutable_bitField0_ |= 0x00000001;
            }
            validators_.add(
                input.readMessage(cosmos.staking.v1beta1.Validator.parser(), extensionRegistry));
            break;
          }
          case 18: {
            cosmos.base.query.v1beta1.PageResponse.Builder subBuilder = null;
            if (pagination_ != null) {
              subBuilder = pagination_.toBuilder();
            }
            pagination_ = input.readMessage(cosmos.base.query.v1beta1.PageResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pagination_);
              pagination_ = subBuilder.buildPartial();
            }

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
        validators_ = java.util.Collections.unmodifiableList(validators_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cosmos.staking.v1beta1.QueryOuterClass.internal_static_cosmos_staking_v1beta1_QueryValidatorsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.staking.v1beta1.QueryOuterClass.internal_static_cosmos_staking_v1beta1_QueryValidatorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.staking.v1beta1.QueryValidatorsResponse.class, cosmos.staking.v1beta1.QueryValidatorsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int VALIDATORS_FIELD_NUMBER = 1;
  private java.util.List<cosmos.staking.v1beta1.Validator> validators_;
  /**
   * <pre>
   * validators contains all the queried validators.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
   */
  public java.util.List<cosmos.staking.v1beta1.Validator> getValidatorsList() {
    return validators_;
  }
  /**
   * <pre>
   * validators contains all the queried validators.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
   */
  public java.util.List<? extends cosmos.staking.v1beta1.ValidatorOrBuilder> 
      getValidatorsOrBuilderList() {
    return validators_;
  }
  /**
   * <pre>
   * validators contains all the queried validators.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
   */
  public int getValidatorsCount() {
    return validators_.size();
  }
  /**
   * <pre>
   * validators contains all the queried validators.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.staking.v1beta1.Validator getValidators(int index) {
    return validators_.get(index);
  }
  /**
   * <pre>
   * validators contains all the queried validators.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.staking.v1beta1.ValidatorOrBuilder getValidatorsOrBuilder(
      int index) {
    return validators_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  public cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  public cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
    return getPagination();
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
    for (int i = 0; i < validators_.size(); i++) {
      output.writeMessage(1, validators_.get(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < validators_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, validators_.get(i));
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof cosmos.staking.v1beta1.QueryValidatorsResponse)) {
      return super.equals(obj);
    }
    cosmos.staking.v1beta1.QueryValidatorsResponse other = (cosmos.staking.v1beta1.QueryValidatorsResponse) obj;

    if (!getValidatorsList()
        .equals(other.getValidatorsList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
    }
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
    if (getValidatorsCount() > 0) {
      hash = (37 * hash) + VALIDATORS_FIELD_NUMBER;
      hash = (53 * hash) + getValidatorsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.staking.v1beta1.QueryValidatorsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.QueryValidatorsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.QueryValidatorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.QueryValidatorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.QueryValidatorsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.QueryValidatorsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.QueryValidatorsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.QueryValidatorsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.QueryValidatorsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.QueryValidatorsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.QueryValidatorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.QueryValidatorsResponse parseFrom(
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
  public static Builder newBuilder(cosmos.staking.v1beta1.QueryValidatorsResponse prototype) {
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
   * QueryValidatorsResponse is response type for the Query/Validators RPC method
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.QueryValidatorsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.QueryValidatorsResponse)
      cosmos.staking.v1beta1.QueryValidatorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.staking.v1beta1.QueryOuterClass.internal_static_cosmos_staking_v1beta1_QueryValidatorsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.staking.v1beta1.QueryOuterClass.internal_static_cosmos_staking_v1beta1_QueryValidatorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.staking.v1beta1.QueryValidatorsResponse.class, cosmos.staking.v1beta1.QueryValidatorsResponse.Builder.class);
    }

    // Construct using cosmos.staking.v1beta1.QueryValidatorsResponse.newBuilder()
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
        getValidatorsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (validatorsBuilder_ == null) {
        validators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        validatorsBuilder_.clear();
      }
      if (paginationBuilder_ == null) {
        pagination_ = null;
      } else {
        pagination_ = null;
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.staking.v1beta1.QueryOuterClass.internal_static_cosmos_staking_v1beta1_QueryValidatorsResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.QueryValidatorsResponse getDefaultInstanceForType() {
      return cosmos.staking.v1beta1.QueryValidatorsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.QueryValidatorsResponse build() {
      cosmos.staking.v1beta1.QueryValidatorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.QueryValidatorsResponse buildPartial() {
      cosmos.staking.v1beta1.QueryValidatorsResponse result = new cosmos.staking.v1beta1.QueryValidatorsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (validatorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          validators_ = java.util.Collections.unmodifiableList(validators_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.validators_ = validators_;
      } else {
        result.validators_ = validatorsBuilder_.build();
      }
      if (paginationBuilder_ == null) {
        result.pagination_ = pagination_;
      } else {
        result.pagination_ = paginationBuilder_.build();
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
      if (other instanceof cosmos.staking.v1beta1.QueryValidatorsResponse) {
        return mergeFrom((cosmos.staking.v1beta1.QueryValidatorsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.staking.v1beta1.QueryValidatorsResponse other) {
      if (other == cosmos.staking.v1beta1.QueryValidatorsResponse.getDefaultInstance()) return this;
      if (validatorsBuilder_ == null) {
        if (!other.validators_.isEmpty()) {
          if (validators_.isEmpty()) {
            validators_ = other.validators_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValidatorsIsMutable();
            validators_.addAll(other.validators_);
          }
          onChanged();
        }
      } else {
        if (!other.validators_.isEmpty()) {
          if (validatorsBuilder_.isEmpty()) {
            validatorsBuilder_.dispose();
            validatorsBuilder_ = null;
            validators_ = other.validators_;
            bitField0_ = (bitField0_ & ~0x00000001);
            validatorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValidatorsFieldBuilder() : null;
          } else {
            validatorsBuilder_.addAllMessages(other.validators_);
          }
        }
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
      cosmos.staking.v1beta1.QueryValidatorsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.staking.v1beta1.QueryValidatorsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<cosmos.staking.v1beta1.Validator> validators_ =
      java.util.Collections.emptyList();
    private void ensureValidatorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        validators_ = new java.util.ArrayList<cosmos.staking.v1beta1.Validator>(validators_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.staking.v1beta1.Validator, cosmos.staking.v1beta1.Validator.Builder, cosmos.staking.v1beta1.ValidatorOrBuilder> validatorsBuilder_;

    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<cosmos.staking.v1beta1.Validator> getValidatorsList() {
      if (validatorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(validators_);
      } else {
        return validatorsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public int getValidatorsCount() {
      if (validatorsBuilder_ == null) {
        return validators_.size();
      } else {
        return validatorsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.Validator getValidators(int index) {
      if (validatorsBuilder_ == null) {
        return validators_.get(index);
      } else {
        return validatorsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setValidators(
        int index, cosmos.staking.v1beta1.Validator value) {
      if (validatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValidatorsIsMutable();
        validators_.set(index, value);
        onChanged();
      } else {
        validatorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setValidators(
        int index, cosmos.staking.v1beta1.Validator.Builder builderForValue) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        validators_.set(index, builderForValue.build());
        onChanged();
      } else {
        validatorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addValidators(cosmos.staking.v1beta1.Validator value) {
      if (validatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValidatorsIsMutable();
        validators_.add(value);
        onChanged();
      } else {
        validatorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addValidators(
        int index, cosmos.staking.v1beta1.Validator value) {
      if (validatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValidatorsIsMutable();
        validators_.add(index, value);
        onChanged();
      } else {
        validatorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addValidators(
        cosmos.staking.v1beta1.Validator.Builder builderForValue) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        validators_.add(builderForValue.build());
        onChanged();
      } else {
        validatorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addValidators(
        int index, cosmos.staking.v1beta1.Validator.Builder builderForValue) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        validators_.add(index, builderForValue.build());
        onChanged();
      } else {
        validatorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addAllValidators(
        java.lang.Iterable<? extends cosmos.staking.v1beta1.Validator> values) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, validators_);
        onChanged();
      } else {
        validatorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearValidators() {
      if (validatorsBuilder_ == null) {
        validators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        validatorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder removeValidators(int index) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        validators_.remove(index);
        onChanged();
      } else {
        validatorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.Validator.Builder getValidatorsBuilder(
        int index) {
      return getValidatorsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.ValidatorOrBuilder getValidatorsOrBuilder(
        int index) {
      if (validatorsBuilder_ == null) {
        return validators_.get(index);  } else {
        return validatorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends cosmos.staking.v1beta1.ValidatorOrBuilder> 
         getValidatorsOrBuilderList() {
      if (validatorsBuilder_ != null) {
        return validatorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(validators_);
      }
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.Validator.Builder addValidatorsBuilder() {
      return getValidatorsFieldBuilder().addBuilder(
          cosmos.staking.v1beta1.Validator.getDefaultInstance());
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.Validator.Builder addValidatorsBuilder(
        int index) {
      return getValidatorsFieldBuilder().addBuilder(
          index, cosmos.staking.v1beta1.Validator.getDefaultInstance());
    }
    /**
     * <pre>
     * validators contains all the queried validators.
     * </pre>
     *
     * <code>repeated .cosmos.staking.v1beta1.Validator validators = 1 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<cosmos.staking.v1beta1.Validator.Builder> 
         getValidatorsBuilderList() {
      return getValidatorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.staking.v1beta1.Validator, cosmos.staking.v1beta1.Validator.Builder, cosmos.staking.v1beta1.ValidatorOrBuilder> 
        getValidatorsFieldBuilder() {
      if (validatorsBuilder_ == null) {
        validatorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cosmos.staking.v1beta1.Validator, cosmos.staking.v1beta1.Validator.Builder, cosmos.staking.v1beta1.ValidatorOrBuilder>(
                validators_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        validators_ = null;
      }
      return validatorsBuilder_;
    }

    private cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.query.v1beta1.PageResponse, cosmos.base.query.v1beta1.PageResponse.Builder, cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public boolean hasPagination() {
      return paginationBuilder_ != null || pagination_ != null;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public cosmos.base.query.v1beta1.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public Builder setPagination(cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
        onChanged();
      } else {
        paginationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public Builder setPagination(
        cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
        onChanged();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public Builder mergePagination(cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (pagination_ != null) {
          pagination_ =
            cosmos.base.query.v1beta1.PageResponse.newBuilder(pagination_).mergeFrom(value).buildPartial();
        } else {
          pagination_ = value;
        }
        onChanged();
      } else {
        paginationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public Builder clearPagination() {
      if (paginationBuilder_ == null) {
        pagination_ = null;
        onChanged();
      } else {
        pagination_ = null;
        paginationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.query.v1beta1.PageResponse, cosmos.base.query.v1beta1.PageResponse.Builder, cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.base.query.v1beta1.PageResponse, cosmos.base.query.v1beta1.PageResponse.Builder, cosmos.base.query.v1beta1.PageResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.QueryValidatorsResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.QueryValidatorsResponse)
  private static final cosmos.staking.v1beta1.QueryValidatorsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.staking.v1beta1.QueryValidatorsResponse();
  }

  public static cosmos.staking.v1beta1.QueryValidatorsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryValidatorsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryValidatorsResponse>() {
    @java.lang.Override
    public QueryValidatorsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryValidatorsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryValidatorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryValidatorsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.staking.v1beta1.QueryValidatorsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
