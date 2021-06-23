// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

/**
 * <pre>
 * QueryValidatorResponse is response type for the Query/Validator RPC method
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.QueryValidatorResponse}
 */
public  final class QueryValidatorResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.QueryValidatorResponse)
    QueryValidatorResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryValidatorResponse.newBuilder() to construct.
  private QueryValidatorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryValidatorResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryValidatorResponse(
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
            cosmos.staking.v1beta1.Validator.Builder subBuilder = null;
            if (validator_ != null) {
              subBuilder = validator_.toBuilder();
            }
            validator_ = input.readMessage(cosmos.staking.v1beta1.Validator.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(validator_);
              validator_ = subBuilder.buildPartial();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cosmos.staking.v1beta1.QueryOuterClass.internal_static_cosmos_staking_v1beta1_QueryValidatorResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.staking.v1beta1.QueryOuterClass.internal_static_cosmos_staking_v1beta1_QueryValidatorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.staking.v1beta1.QueryValidatorResponse.class, cosmos.staking.v1beta1.QueryValidatorResponse.Builder.class);
  }

  public static final int VALIDATOR_FIELD_NUMBER = 1;
  private cosmos.staking.v1beta1.Validator validator_;
  /**
   * <pre>
   * validator defines the the validator info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Validator validator = 1 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasValidator() {
    return validator_ != null;
  }
  /**
   * <pre>
   * validator defines the the validator info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Validator validator = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.staking.v1beta1.Validator getValidator() {
    return validator_ == null ? cosmos.staking.v1beta1.Validator.getDefaultInstance() : validator_;
  }
  /**
   * <pre>
   * validator defines the the validator info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Validator validator = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.staking.v1beta1.ValidatorOrBuilder getValidatorOrBuilder() {
    return getValidator();
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
    if (validator_ != null) {
      output.writeMessage(1, getValidator());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (validator_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getValidator());
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
    if (!(obj instanceof cosmos.staking.v1beta1.QueryValidatorResponse)) {
      return super.equals(obj);
    }
    cosmos.staking.v1beta1.QueryValidatorResponse other = (cosmos.staking.v1beta1.QueryValidatorResponse) obj;

    if (hasValidator() != other.hasValidator()) return false;
    if (hasValidator()) {
      if (!getValidator()
          .equals(other.getValidator())) return false;
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
    if (hasValidator()) {
      hash = (37 * hash) + VALIDATOR_FIELD_NUMBER;
      hash = (53 * hash) + getValidator().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.staking.v1beta1.QueryValidatorResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.QueryValidatorResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.QueryValidatorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.QueryValidatorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.QueryValidatorResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.staking.v1beta1.QueryValidatorResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.QueryValidatorResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.QueryValidatorResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.QueryValidatorResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.QueryValidatorResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.staking.v1beta1.QueryValidatorResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.staking.v1beta1.QueryValidatorResponse parseFrom(
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
  public static Builder newBuilder(cosmos.staking.v1beta1.QueryValidatorResponse prototype) {
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
   * QueryValidatorResponse is response type for the Query/Validator RPC method
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.QueryValidatorResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.QueryValidatorResponse)
      cosmos.staking.v1beta1.QueryValidatorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.staking.v1beta1.QueryOuterClass.internal_static_cosmos_staking_v1beta1_QueryValidatorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.staking.v1beta1.QueryOuterClass.internal_static_cosmos_staking_v1beta1_QueryValidatorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.staking.v1beta1.QueryValidatorResponse.class, cosmos.staking.v1beta1.QueryValidatorResponse.Builder.class);
    }

    // Construct using cosmos.staking.v1beta1.QueryValidatorResponse.newBuilder()
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
      if (validatorBuilder_ == null) {
        validator_ = null;
      } else {
        validator_ = null;
        validatorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.staking.v1beta1.QueryOuterClass.internal_static_cosmos_staking_v1beta1_QueryValidatorResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.QueryValidatorResponse getDefaultInstanceForType() {
      return cosmos.staking.v1beta1.QueryValidatorResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.QueryValidatorResponse build() {
      cosmos.staking.v1beta1.QueryValidatorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.staking.v1beta1.QueryValidatorResponse buildPartial() {
      cosmos.staking.v1beta1.QueryValidatorResponse result = new cosmos.staking.v1beta1.QueryValidatorResponse(this);
      if (validatorBuilder_ == null) {
        result.validator_ = validator_;
      } else {
        result.validator_ = validatorBuilder_.build();
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
      if (other instanceof cosmos.staking.v1beta1.QueryValidatorResponse) {
        return mergeFrom((cosmos.staking.v1beta1.QueryValidatorResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.staking.v1beta1.QueryValidatorResponse other) {
      if (other == cosmos.staking.v1beta1.QueryValidatorResponse.getDefaultInstance()) return this;
      if (other.hasValidator()) {
        mergeValidator(other.getValidator());
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
      cosmos.staking.v1beta1.QueryValidatorResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.staking.v1beta1.QueryValidatorResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private cosmos.staking.v1beta1.Validator validator_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.staking.v1beta1.Validator, cosmos.staking.v1beta1.Validator.Builder, cosmos.staking.v1beta1.ValidatorOrBuilder> validatorBuilder_;
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasValidator() {
      return validatorBuilder_ != null || validator_ != null;
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.Validator getValidator() {
      if (validatorBuilder_ == null) {
        return validator_ == null ? cosmos.staking.v1beta1.Validator.getDefaultInstance() : validator_;
      } else {
        return validatorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setValidator(cosmos.staking.v1beta1.Validator value) {
      if (validatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        validator_ = value;
        onChanged();
      } else {
        validatorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setValidator(
        cosmos.staking.v1beta1.Validator.Builder builderForValue) {
      if (validatorBuilder_ == null) {
        validator_ = builderForValue.build();
        onChanged();
      } else {
        validatorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeValidator(cosmos.staking.v1beta1.Validator value) {
      if (validatorBuilder_ == null) {
        if (validator_ != null) {
          validator_ =
            cosmos.staking.v1beta1.Validator.newBuilder(validator_).mergeFrom(value).buildPartial();
        } else {
          validator_ = value;
        }
        onChanged();
      } else {
        validatorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearValidator() {
      if (validatorBuilder_ == null) {
        validator_ = null;
        onChanged();
      } else {
        validator_ = null;
        validatorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.Validator.Builder getValidatorBuilder() {
      
      onChanged();
      return getValidatorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.staking.v1beta1.ValidatorOrBuilder getValidatorOrBuilder() {
      if (validatorBuilder_ != null) {
        return validatorBuilder_.getMessageOrBuilder();
      } else {
        return validator_ == null ?
            cosmos.staking.v1beta1.Validator.getDefaultInstance() : validator_;
      }
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.staking.v1beta1.Validator, cosmos.staking.v1beta1.Validator.Builder, cosmos.staking.v1beta1.ValidatorOrBuilder> 
        getValidatorFieldBuilder() {
      if (validatorBuilder_ == null) {
        validatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.staking.v1beta1.Validator, cosmos.staking.v1beta1.Validator.Builder, cosmos.staking.v1beta1.ValidatorOrBuilder>(
                getValidator(),
                getParentForChildren(),
                isClean());
        validator_ = null;
      }
      return validatorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.QueryValidatorResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.QueryValidatorResponse)
  private static final cosmos.staking.v1beta1.QueryValidatorResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.staking.v1beta1.QueryValidatorResponse();
  }

  public static cosmos.staking.v1beta1.QueryValidatorResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryValidatorResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryValidatorResponse>() {
    @java.lang.Override
    public QueryValidatorResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryValidatorResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryValidatorResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryValidatorResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.staking.v1beta1.QueryValidatorResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
