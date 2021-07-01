// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package cosmos.bank.v1beta1;

/**
 * <pre>
 * QueryDenomMetadataResponse is the response type for the Query/DenomMetadata RPC
 * method.
 * </pre>
 *
 * Protobuf type {@code cosmos.bank.v1beta1.QueryDenomMetadataResponse}
 */
public  final class QueryDenomMetadataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.bank.v1beta1.QueryDenomMetadataResponse)
    QueryDenomMetadataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDenomMetadataResponse.newBuilder() to construct.
  private QueryDenomMetadataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDenomMetadataResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryDenomMetadataResponse(
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
            cosmos.bank.v1beta1.Metadata.Builder subBuilder = null;
            if (metadata_ != null) {
              subBuilder = metadata_.toBuilder();
            }
            metadata_ = input.readMessage(cosmos.bank.v1beta1.Metadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metadata_);
              metadata_ = subBuilder.buildPartial();
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
    return cosmos.bank.v1beta1.QueryOuterClass.internal_static_cosmos_bank_v1beta1_QueryDenomMetadataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.bank.v1beta1.QueryOuterClass.internal_static_cosmos_bank_v1beta1_QueryDenomMetadataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.bank.v1beta1.QueryDenomMetadataResponse.class, cosmos.bank.v1beta1.QueryDenomMetadataResponse.Builder.class);
  }

  public static final int METADATA_FIELD_NUMBER = 1;
  private cosmos.bank.v1beta1.Metadata metadata_;
  /**
   * <pre>
   * metadata describes and provides all the client information for the requested token.
   * </pre>
   *
   * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <pre>
   * metadata describes and provides all the client information for the requested token.
   * </pre>
   *
   * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.bank.v1beta1.Metadata getMetadata() {
    return metadata_ == null ? cosmos.bank.v1beta1.Metadata.getDefaultInstance() : metadata_;
  }
  /**
   * <pre>
   * metadata describes and provides all the client information for the requested token.
   * </pre>
   *
   * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.bank.v1beta1.MetadataOrBuilder getMetadataOrBuilder() {
    return getMetadata();
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
    if (metadata_ != null) {
      output.writeMessage(1, getMetadata());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMetadata());
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
    if (!(obj instanceof cosmos.bank.v1beta1.QueryDenomMetadataResponse)) {
      return super.equals(obj);
    }
    cosmos.bank.v1beta1.QueryDenomMetadataResponse other = (cosmos.bank.v1beta1.QueryDenomMetadataResponse) obj;

    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
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
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.bank.v1beta1.QueryDenomMetadataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.bank.v1beta1.QueryDenomMetadataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QueryDenomMetadataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.bank.v1beta1.QueryDenomMetadataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QueryDenomMetadataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.bank.v1beta1.QueryDenomMetadataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QueryDenomMetadataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.bank.v1beta1.QueryDenomMetadataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QueryDenomMetadataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.bank.v1beta1.QueryDenomMetadataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QueryDenomMetadataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.bank.v1beta1.QueryDenomMetadataResponse parseFrom(
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
  public static Builder newBuilder(cosmos.bank.v1beta1.QueryDenomMetadataResponse prototype) {
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
   * QueryDenomMetadataResponse is the response type for the Query/DenomMetadata RPC
   * method.
   * </pre>
   *
   * Protobuf type {@code cosmos.bank.v1beta1.QueryDenomMetadataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.bank.v1beta1.QueryDenomMetadataResponse)
      cosmos.bank.v1beta1.QueryDenomMetadataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.bank.v1beta1.QueryOuterClass.internal_static_cosmos_bank_v1beta1_QueryDenomMetadataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.bank.v1beta1.QueryOuterClass.internal_static_cosmos_bank_v1beta1_QueryDenomMetadataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.bank.v1beta1.QueryDenomMetadataResponse.class, cosmos.bank.v1beta1.QueryDenomMetadataResponse.Builder.class);
    }

    // Construct using cosmos.bank.v1beta1.QueryDenomMetadataResponse.newBuilder()
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
      if (metadataBuilder_ == null) {
        metadata_ = null;
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.bank.v1beta1.QueryOuterClass.internal_static_cosmos_bank_v1beta1_QueryDenomMetadataResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.bank.v1beta1.QueryDenomMetadataResponse getDefaultInstanceForType() {
      return cosmos.bank.v1beta1.QueryDenomMetadataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.bank.v1beta1.QueryDenomMetadataResponse build() {
      cosmos.bank.v1beta1.QueryDenomMetadataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.bank.v1beta1.QueryDenomMetadataResponse buildPartial() {
      cosmos.bank.v1beta1.QueryDenomMetadataResponse result = new cosmos.bank.v1beta1.QueryDenomMetadataResponse(this);
      if (metadataBuilder_ == null) {
        result.metadata_ = metadata_;
      } else {
        result.metadata_ = metadataBuilder_.build();
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
      if (other instanceof cosmos.bank.v1beta1.QueryDenomMetadataResponse) {
        return mergeFrom((cosmos.bank.v1beta1.QueryDenomMetadataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.bank.v1beta1.QueryDenomMetadataResponse other) {
      if (other == cosmos.bank.v1beta1.QueryDenomMetadataResponse.getDefaultInstance()) return this;
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
      cosmos.bank.v1beta1.QueryDenomMetadataResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.bank.v1beta1.QueryDenomMetadataResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private cosmos.bank.v1beta1.Metadata metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.bank.v1beta1.Metadata, cosmos.bank.v1beta1.Metadata.Builder, cosmos.bank.v1beta1.MetadataOrBuilder> metadataBuilder_;
    /**
     * <pre>
     * metadata describes and provides all the client information for the requested token.
     * </pre>
     *
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasMetadata() {
      return metadataBuilder_ != null || metadata_ != null;
    }
    /**
     * <pre>
     * metadata describes and provides all the client information for the requested token.
     * </pre>
     *
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.bank.v1beta1.Metadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? cosmos.bank.v1beta1.Metadata.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * metadata describes and provides all the client information for the requested token.
     * </pre>
     *
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setMetadata(cosmos.bank.v1beta1.Metadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * metadata describes and provides all the client information for the requested token.
     * </pre>
     *
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setMetadata(
        cosmos.bank.v1beta1.Metadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * metadata describes and provides all the client information for the requested token.
     * </pre>
     *
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeMetadata(cosmos.bank.v1beta1.Metadata value) {
      if (metadataBuilder_ == null) {
        if (metadata_ != null) {
          metadata_ =
            cosmos.bank.v1beta1.Metadata.newBuilder(metadata_).mergeFrom(value).buildPartial();
        } else {
          metadata_ = value;
        }
        onChanged();
      } else {
        metadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * metadata describes and provides all the client information for the requested token.
     * </pre>
     *
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        metadata_ = null;
        onChanged();
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * metadata describes and provides all the client information for the requested token.
     * </pre>
     *
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.bank.v1beta1.Metadata.Builder getMetadataBuilder() {
      
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * metadata describes and provides all the client information for the requested token.
     * </pre>
     *
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.bank.v1beta1.MetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            cosmos.bank.v1beta1.Metadata.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <pre>
     * metadata describes and provides all the client information for the requested token.
     * </pre>
     *
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.bank.v1beta1.Metadata, cosmos.bank.v1beta1.Metadata.Builder, cosmos.bank.v1beta1.MetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.bank.v1beta1.Metadata, cosmos.bank.v1beta1.Metadata.Builder, cosmos.bank.v1beta1.MetadataOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.bank.v1beta1.QueryDenomMetadataResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.bank.v1beta1.QueryDenomMetadataResponse)
  private static final cosmos.bank.v1beta1.QueryDenomMetadataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.bank.v1beta1.QueryDenomMetadataResponse();
  }

  public static cosmos.bank.v1beta1.QueryDenomMetadataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDenomMetadataResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDenomMetadataResponse>() {
    @java.lang.Override
    public QueryDenomMetadataResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryDenomMetadataResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryDenomMetadataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDenomMetadataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.bank.v1beta1.QueryDenomMetadataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

