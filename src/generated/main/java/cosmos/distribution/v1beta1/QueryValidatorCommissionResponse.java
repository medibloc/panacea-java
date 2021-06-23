// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/query.proto

package cosmos.distribution.v1beta1;

/**
 * <pre>
 * QueryValidatorCommissionResponse is the response type for the
 * Query/ValidatorCommission RPC method
 * </pre>
 *
 * Protobuf type {@code cosmos.distribution.v1beta1.QueryValidatorCommissionResponse}
 */
public  final class QueryValidatorCommissionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.distribution.v1beta1.QueryValidatorCommissionResponse)
    QueryValidatorCommissionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryValidatorCommissionResponse.newBuilder() to construct.
  private QueryValidatorCommissionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryValidatorCommissionResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryValidatorCommissionResponse(
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
            cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.Builder subBuilder = null;
            if (commission_ != null) {
              subBuilder = commission_.toBuilder();
            }
            commission_ = input.readMessage(cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(commission_);
              commission_ = subBuilder.buildPartial();
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
    return cosmos.distribution.v1beta1.QueryOuterClass.internal_static_cosmos_distribution_v1beta1_QueryValidatorCommissionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.distribution.v1beta1.QueryOuterClass.internal_static_cosmos_distribution_v1beta1_QueryValidatorCommissionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.distribution.v1beta1.QueryValidatorCommissionResponse.class, cosmos.distribution.v1beta1.QueryValidatorCommissionResponse.Builder.class);
  }

  public static final int COMMISSION_FIELD_NUMBER = 1;
  private cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission_;
  /**
   * <pre>
   * commission defines the commision the validator received.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasCommission() {
    return commission_ != null;
  }
  /**
   * <pre>
   * commission defines the commision the validator received.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.distribution.v1beta1.ValidatorAccumulatedCommission getCommission() {
    return commission_ == null ? cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.getDefaultInstance() : commission_;
  }
  /**
   * <pre>
   * commission defines the commision the validator received.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionOrBuilder getCommissionOrBuilder() {
    return getCommission();
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
    if (commission_ != null) {
      output.writeMessage(1, getCommission());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (commission_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommission());
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
    if (!(obj instanceof cosmos.distribution.v1beta1.QueryValidatorCommissionResponse)) {
      return super.equals(obj);
    }
    cosmos.distribution.v1beta1.QueryValidatorCommissionResponse other = (cosmos.distribution.v1beta1.QueryValidatorCommissionResponse) obj;

    if (hasCommission() != other.hasCommission()) return false;
    if (hasCommission()) {
      if (!getCommission()
          .equals(other.getCommission())) return false;
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
    if (hasCommission()) {
      hash = (37 * hash) + COMMISSION_FIELD_NUMBER;
      hash = (53 * hash) + getCommission().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.distribution.v1beta1.QueryValidatorCommissionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.QueryValidatorCommissionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.QueryValidatorCommissionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.QueryValidatorCommissionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.QueryValidatorCommissionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.QueryValidatorCommissionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.QueryValidatorCommissionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.QueryValidatorCommissionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.QueryValidatorCommissionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.QueryValidatorCommissionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.QueryValidatorCommissionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.QueryValidatorCommissionResponse parseFrom(
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
  public static Builder newBuilder(cosmos.distribution.v1beta1.QueryValidatorCommissionResponse prototype) {
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
   * QueryValidatorCommissionResponse is the response type for the
   * Query/ValidatorCommission RPC method
   * </pre>
   *
   * Protobuf type {@code cosmos.distribution.v1beta1.QueryValidatorCommissionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.distribution.v1beta1.QueryValidatorCommissionResponse)
      cosmos.distribution.v1beta1.QueryValidatorCommissionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.distribution.v1beta1.QueryOuterClass.internal_static_cosmos_distribution_v1beta1_QueryValidatorCommissionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.distribution.v1beta1.QueryOuterClass.internal_static_cosmos_distribution_v1beta1_QueryValidatorCommissionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.distribution.v1beta1.QueryValidatorCommissionResponse.class, cosmos.distribution.v1beta1.QueryValidatorCommissionResponse.Builder.class);
    }

    // Construct using cosmos.distribution.v1beta1.QueryValidatorCommissionResponse.newBuilder()
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
      if (commissionBuilder_ == null) {
        commission_ = null;
      } else {
        commission_ = null;
        commissionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.distribution.v1beta1.QueryOuterClass.internal_static_cosmos_distribution_v1beta1_QueryValidatorCommissionResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.QueryValidatorCommissionResponse getDefaultInstanceForType() {
      return cosmos.distribution.v1beta1.QueryValidatorCommissionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.QueryValidatorCommissionResponse build() {
      cosmos.distribution.v1beta1.QueryValidatorCommissionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.QueryValidatorCommissionResponse buildPartial() {
      cosmos.distribution.v1beta1.QueryValidatorCommissionResponse result = new cosmos.distribution.v1beta1.QueryValidatorCommissionResponse(this);
      if (commissionBuilder_ == null) {
        result.commission_ = commission_;
      } else {
        result.commission_ = commissionBuilder_.build();
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
      if (other instanceof cosmos.distribution.v1beta1.QueryValidatorCommissionResponse) {
        return mergeFrom((cosmos.distribution.v1beta1.QueryValidatorCommissionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.distribution.v1beta1.QueryValidatorCommissionResponse other) {
      if (other == cosmos.distribution.v1beta1.QueryValidatorCommissionResponse.getDefaultInstance()) return this;
      if (other.hasCommission()) {
        mergeCommission(other.getCommission());
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
      cosmos.distribution.v1beta1.QueryValidatorCommissionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.distribution.v1beta1.QueryValidatorCommissionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.distribution.v1beta1.ValidatorAccumulatedCommission, cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.Builder, cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionOrBuilder> commissionBuilder_;
    /**
     * <pre>
     * commission defines the commision the validator received.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasCommission() {
      return commissionBuilder_ != null || commission_ != null;
    }
    /**
     * <pre>
     * commission defines the commision the validator received.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.distribution.v1beta1.ValidatorAccumulatedCommission getCommission() {
      if (commissionBuilder_ == null) {
        return commission_ == null ? cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.getDefaultInstance() : commission_;
      } else {
        return commissionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * commission defines the commision the validator received.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setCommission(cosmos.distribution.v1beta1.ValidatorAccumulatedCommission value) {
      if (commissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commission_ = value;
        onChanged();
      } else {
        commissionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * commission defines the commision the validator received.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setCommission(
        cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.Builder builderForValue) {
      if (commissionBuilder_ == null) {
        commission_ = builderForValue.build();
        onChanged();
      } else {
        commissionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * commission defines the commision the validator received.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeCommission(cosmos.distribution.v1beta1.ValidatorAccumulatedCommission value) {
      if (commissionBuilder_ == null) {
        if (commission_ != null) {
          commission_ =
            cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.newBuilder(commission_).mergeFrom(value).buildPartial();
        } else {
          commission_ = value;
        }
        onChanged();
      } else {
        commissionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * commission defines the commision the validator received.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearCommission() {
      if (commissionBuilder_ == null) {
        commission_ = null;
        onChanged();
      } else {
        commission_ = null;
        commissionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * commission defines the commision the validator received.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.Builder getCommissionBuilder() {
      
      onChanged();
      return getCommissionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * commission defines the commision the validator received.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionOrBuilder getCommissionOrBuilder() {
      if (commissionBuilder_ != null) {
        return commissionBuilder_.getMessageOrBuilder();
      } else {
        return commission_ == null ?
            cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.getDefaultInstance() : commission_;
      }
    }
    /**
     * <pre>
     * commission defines the commision the validator received.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission commission = 1 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.distribution.v1beta1.ValidatorAccumulatedCommission, cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.Builder, cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionOrBuilder> 
        getCommissionFieldBuilder() {
      if (commissionBuilder_ == null) {
        commissionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.distribution.v1beta1.ValidatorAccumulatedCommission, cosmos.distribution.v1beta1.ValidatorAccumulatedCommission.Builder, cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionOrBuilder>(
                getCommission(),
                getParentForChildren(),
                isClean());
        commission_ = null;
      }
      return commissionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.distribution.v1beta1.QueryValidatorCommissionResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.distribution.v1beta1.QueryValidatorCommissionResponse)
  private static final cosmos.distribution.v1beta1.QueryValidatorCommissionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.distribution.v1beta1.QueryValidatorCommissionResponse();
  }

  public static cosmos.distribution.v1beta1.QueryValidatorCommissionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryValidatorCommissionResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryValidatorCommissionResponse>() {
    @java.lang.Override
    public QueryValidatorCommissionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryValidatorCommissionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryValidatorCommissionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryValidatorCommissionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.distribution.v1beta1.QueryValidatorCommissionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
