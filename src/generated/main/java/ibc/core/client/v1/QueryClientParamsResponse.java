// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/query.proto

package ibc.core.client.v1;

/**
 * <pre>
 * QueryClientParamsResponse is the response type for the Query/ClientParams RPC method.
 * </pre>
 *
 * Protobuf type {@code ibc.core.client.v1.QueryClientParamsResponse}
 */
public  final class QueryClientParamsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.client.v1.QueryClientParamsResponse)
    QueryClientParamsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryClientParamsResponse.newBuilder() to construct.
  private QueryClientParamsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryClientParamsResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryClientParamsResponse(
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
            ibc.core.client.v1.Params.Builder subBuilder = null;
            if (params_ != null) {
              subBuilder = params_.toBuilder();
            }
            params_ = input.readMessage(ibc.core.client.v1.Params.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(params_);
              params_ = subBuilder.buildPartial();
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
    return ibc.core.client.v1.QueryOuterClass.internal_static_ibc_core_client_v1_QueryClientParamsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ibc.core.client.v1.QueryOuterClass.internal_static_ibc_core_client_v1_QueryClientParamsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ibc.core.client.v1.QueryClientParamsResponse.class, ibc.core.client.v1.QueryClientParamsResponse.Builder.class);
  }

  public static final int PARAMS_FIELD_NUMBER = 1;
  private ibc.core.client.v1.Params params_;
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.ibc.core.client.v1.Params params = 1;</code>
   */
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.ibc.core.client.v1.Params params = 1;</code>
   */
  public ibc.core.client.v1.Params getParams() {
    return params_ == null ? ibc.core.client.v1.Params.getDefaultInstance() : params_;
  }
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.ibc.core.client.v1.Params params = 1;</code>
   */
  public ibc.core.client.v1.ParamsOrBuilder getParamsOrBuilder() {
    return getParams();
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
    if (params_ != null) {
      output.writeMessage(1, getParams());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (params_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getParams());
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
    if (!(obj instanceof ibc.core.client.v1.QueryClientParamsResponse)) {
      return super.equals(obj);
    }
    ibc.core.client.v1.QueryClientParamsResponse other = (ibc.core.client.v1.QueryClientParamsResponse) obj;

    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams()
          .equals(other.getParams())) return false;
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
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ibc.core.client.v1.QueryClientParamsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.client.v1.QueryClientParamsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.client.v1.QueryClientParamsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.client.v1.QueryClientParamsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.client.v1.QueryClientParamsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.client.v1.QueryClientParamsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.client.v1.QueryClientParamsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.core.client.v1.QueryClientParamsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.core.client.v1.QueryClientParamsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ibc.core.client.v1.QueryClientParamsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.core.client.v1.QueryClientParamsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.core.client.v1.QueryClientParamsResponse parseFrom(
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
  public static Builder newBuilder(ibc.core.client.v1.QueryClientParamsResponse prototype) {
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
   * QueryClientParamsResponse is the response type for the Query/ClientParams RPC method.
   * </pre>
   *
   * Protobuf type {@code ibc.core.client.v1.QueryClientParamsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.client.v1.QueryClientParamsResponse)
      ibc.core.client.v1.QueryClientParamsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ibc.core.client.v1.QueryOuterClass.internal_static_ibc_core_client_v1_QueryClientParamsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ibc.core.client.v1.QueryOuterClass.internal_static_ibc_core_client_v1_QueryClientParamsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ibc.core.client.v1.QueryClientParamsResponse.class, ibc.core.client.v1.QueryClientParamsResponse.Builder.class);
    }

    // Construct using ibc.core.client.v1.QueryClientParamsResponse.newBuilder()
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
      if (paramsBuilder_ == null) {
        params_ = null;
      } else {
        params_ = null;
        paramsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ibc.core.client.v1.QueryOuterClass.internal_static_ibc_core_client_v1_QueryClientParamsResponse_descriptor;
    }

    @java.lang.Override
    public ibc.core.client.v1.QueryClientParamsResponse getDefaultInstanceForType() {
      return ibc.core.client.v1.QueryClientParamsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ibc.core.client.v1.QueryClientParamsResponse build() {
      ibc.core.client.v1.QueryClientParamsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ibc.core.client.v1.QueryClientParamsResponse buildPartial() {
      ibc.core.client.v1.QueryClientParamsResponse result = new ibc.core.client.v1.QueryClientParamsResponse(this);
      if (paramsBuilder_ == null) {
        result.params_ = params_;
      } else {
        result.params_ = paramsBuilder_.build();
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
      if (other instanceof ibc.core.client.v1.QueryClientParamsResponse) {
        return mergeFrom((ibc.core.client.v1.QueryClientParamsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ibc.core.client.v1.QueryClientParamsResponse other) {
      if (other == ibc.core.client.v1.QueryClientParamsResponse.getDefaultInstance()) return this;
      if (other.hasParams()) {
        mergeParams(other.getParams());
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
      ibc.core.client.v1.QueryClientParamsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ibc.core.client.v1.QueryClientParamsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ibc.core.client.v1.Params params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.client.v1.Params, ibc.core.client.v1.Params.Builder, ibc.core.client.v1.ParamsOrBuilder> paramsBuilder_;
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1;</code>
     */
    public boolean hasParams() {
      return paramsBuilder_ != null || params_ != null;
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1;</code>
     */
    public ibc.core.client.v1.Params getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? ibc.core.client.v1.Params.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1;</code>
     */
    public Builder setParams(ibc.core.client.v1.Params value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
        onChanged();
      } else {
        paramsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1;</code>
     */
    public Builder setParams(
        ibc.core.client.v1.Params.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
        onChanged();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1;</code>
     */
    public Builder mergeParams(ibc.core.client.v1.Params value) {
      if (paramsBuilder_ == null) {
        if (params_ != null) {
          params_ =
            ibc.core.client.v1.Params.newBuilder(params_).mergeFrom(value).buildPartial();
        } else {
          params_ = value;
        }
        onChanged();
      } else {
        paramsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1;</code>
     */
    public Builder clearParams() {
      if (paramsBuilder_ == null) {
        params_ = null;
        onChanged();
      } else {
        params_ = null;
        paramsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1;</code>
     */
    public ibc.core.client.v1.Params.Builder getParamsBuilder() {
      
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1;</code>
     */
    public ibc.core.client.v1.ParamsOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            ibc.core.client.v1.Params.getDefaultInstance() : params_;
      }
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.client.v1.Params, ibc.core.client.v1.Params.Builder, ibc.core.client.v1.ParamsOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ibc.core.client.v1.Params, ibc.core.client.v1.Params.Builder, ibc.core.client.v1.ParamsOrBuilder>(
                getParams(),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.client.v1.QueryClientParamsResponse)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.client.v1.QueryClientParamsResponse)
  private static final ibc.core.client.v1.QueryClientParamsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ibc.core.client.v1.QueryClientParamsResponse();
  }

  public static ibc.core.client.v1.QueryClientParamsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryClientParamsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryClientParamsResponse>() {
    @java.lang.Override
    public QueryClientParamsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryClientParamsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryClientParamsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryClientParamsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ibc.core.client.v1.QueryClientParamsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
