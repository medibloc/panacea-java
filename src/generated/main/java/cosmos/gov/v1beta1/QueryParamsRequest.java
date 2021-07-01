// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package cosmos.gov.v1beta1;

/**
 * <pre>
 * QueryParamsRequest is the request type for the Query/Params RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.gov.v1beta1.QueryParamsRequest}
 */
public  final class QueryParamsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.gov.v1beta1.QueryParamsRequest)
    QueryParamsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryParamsRequest.newBuilder() to construct.
  private QueryParamsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryParamsRequest() {
    paramsType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryParamsRequest(
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

            paramsType_ = s;
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
    return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryParamsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryParamsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.gov.v1beta1.QueryParamsRequest.class, cosmos.gov.v1beta1.QueryParamsRequest.Builder.class);
  }

  public static final int PARAMS_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object paramsType_;
  /**
   * <pre>
   * params_type defines which parameters to query for, can be one of "voting",
   * "tallying" or "deposit".
   * </pre>
   *
   * <code>string params_type = 1;</code>
   */
  public java.lang.String getParamsType() {
    java.lang.Object ref = paramsType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      paramsType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * params_type defines which parameters to query for, can be one of "voting",
   * "tallying" or "deposit".
   * </pre>
   *
   * <code>string params_type = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParamsTypeBytes() {
    java.lang.Object ref = paramsType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      paramsType_ = b;
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
    if (!getParamsTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, paramsType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParamsTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, paramsType_);
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
    if (!(obj instanceof cosmos.gov.v1beta1.QueryParamsRequest)) {
      return super.equals(obj);
    }
    cosmos.gov.v1beta1.QueryParamsRequest other = (cosmos.gov.v1beta1.QueryParamsRequest) obj;

    if (!getParamsType()
        .equals(other.getParamsType())) return false;
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
    hash = (37 * hash) + PARAMS_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getParamsType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.gov.v1beta1.QueryParamsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.gov.v1beta1.QueryParamsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryParamsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.gov.v1beta1.QueryParamsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryParamsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.gov.v1beta1.QueryParamsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryParamsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.gov.v1beta1.QueryParamsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryParamsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.gov.v1beta1.QueryParamsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryParamsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.gov.v1beta1.QueryParamsRequest parseFrom(
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
  public static Builder newBuilder(cosmos.gov.v1beta1.QueryParamsRequest prototype) {
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
   * QueryParamsRequest is the request type for the Query/Params RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.gov.v1beta1.QueryParamsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.gov.v1beta1.QueryParamsRequest)
      cosmos.gov.v1beta1.QueryParamsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryParamsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryParamsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.gov.v1beta1.QueryParamsRequest.class, cosmos.gov.v1beta1.QueryParamsRequest.Builder.class);
    }

    // Construct using cosmos.gov.v1beta1.QueryParamsRequest.newBuilder()
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
      paramsType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryParamsRequest_descriptor;
    }

    @java.lang.Override
    public cosmos.gov.v1beta1.QueryParamsRequest getDefaultInstanceForType() {
      return cosmos.gov.v1beta1.QueryParamsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.gov.v1beta1.QueryParamsRequest build() {
      cosmos.gov.v1beta1.QueryParamsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.gov.v1beta1.QueryParamsRequest buildPartial() {
      cosmos.gov.v1beta1.QueryParamsRequest result = new cosmos.gov.v1beta1.QueryParamsRequest(this);
      result.paramsType_ = paramsType_;
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
      if (other instanceof cosmos.gov.v1beta1.QueryParamsRequest) {
        return mergeFrom((cosmos.gov.v1beta1.QueryParamsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.gov.v1beta1.QueryParamsRequest other) {
      if (other == cosmos.gov.v1beta1.QueryParamsRequest.getDefaultInstance()) return this;
      if (!other.getParamsType().isEmpty()) {
        paramsType_ = other.paramsType_;
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
      cosmos.gov.v1beta1.QueryParamsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.gov.v1beta1.QueryParamsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object paramsType_ = "";
    /**
     * <pre>
     * params_type defines which parameters to query for, can be one of "voting",
     * "tallying" or "deposit".
     * </pre>
     *
     * <code>string params_type = 1;</code>
     */
    public java.lang.String getParamsType() {
      java.lang.Object ref = paramsType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        paramsType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * params_type defines which parameters to query for, can be one of "voting",
     * "tallying" or "deposit".
     * </pre>
     *
     * <code>string params_type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParamsTypeBytes() {
      java.lang.Object ref = paramsType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        paramsType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * params_type defines which parameters to query for, can be one of "voting",
     * "tallying" or "deposit".
     * </pre>
     *
     * <code>string params_type = 1;</code>
     */
    public Builder setParamsType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      paramsType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params_type defines which parameters to query for, can be one of "voting",
     * "tallying" or "deposit".
     * </pre>
     *
     * <code>string params_type = 1;</code>
     */
    public Builder clearParamsType() {
      
      paramsType_ = getDefaultInstance().getParamsType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params_type defines which parameters to query for, can be one of "voting",
     * "tallying" or "deposit".
     * </pre>
     *
     * <code>string params_type = 1;</code>
     */
    public Builder setParamsTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      paramsType_ = value;
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


    // @@protoc_insertion_point(builder_scope:cosmos.gov.v1beta1.QueryParamsRequest)
  }

  // @@protoc_insertion_point(class_scope:cosmos.gov.v1beta1.QueryParamsRequest)
  private static final cosmos.gov.v1beta1.QueryParamsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.gov.v1beta1.QueryParamsRequest();
  }

  public static cosmos.gov.v1beta1.QueryParamsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryParamsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryParamsRequest>() {
    @java.lang.Override
    public QueryParamsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryParamsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryParamsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryParamsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.gov.v1beta1.QueryParamsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

