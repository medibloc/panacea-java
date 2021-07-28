// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/mint/v1beta1/query.proto

package cosmos.mint.v1beta1;

/**
 * <pre>
 * QueryInflationResponse is the response type for the Query/Inflation RPC
 * method.
 * </pre>
 *
 * Protobuf type {@code cosmos.mint.v1beta1.QueryInflationResponse}
 */
public  final class QueryInflationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.mint.v1beta1.QueryInflationResponse)
    QueryInflationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryInflationResponse.newBuilder() to construct.
  private QueryInflationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryInflationResponse() {
    inflation_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryInflationResponse(
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

            inflation_ = input.readBytes();
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
    return cosmos.mint.v1beta1.QueryOuterClass.internal_static_cosmos_mint_v1beta1_QueryInflationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.mint.v1beta1.QueryOuterClass.internal_static_cosmos_mint_v1beta1_QueryInflationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.mint.v1beta1.QueryInflationResponse.class, cosmos.mint.v1beta1.QueryInflationResponse.Builder.class);
  }

  public static final int INFLATION_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString inflation_;
  /**
   * <pre>
   * inflation is the current minting inflation value.
   * </pre>
   *
   * <code>bytes inflation = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   */
  public com.google.protobuf.ByteString getInflation() {
    return inflation_;
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
    if (!inflation_.isEmpty()) {
      output.writeBytes(1, inflation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!inflation_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, inflation_);
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
    if (!(obj instanceof cosmos.mint.v1beta1.QueryInflationResponse)) {
      return super.equals(obj);
    }
    cosmos.mint.v1beta1.QueryInflationResponse other = (cosmos.mint.v1beta1.QueryInflationResponse) obj;

    if (!getInflation()
        .equals(other.getInflation())) return false;
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
    hash = (37 * hash) + INFLATION_FIELD_NUMBER;
    hash = (53 * hash) + getInflation().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.mint.v1beta1.QueryInflationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.mint.v1beta1.QueryInflationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.mint.v1beta1.QueryInflationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.mint.v1beta1.QueryInflationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.mint.v1beta1.QueryInflationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.mint.v1beta1.QueryInflationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.mint.v1beta1.QueryInflationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.mint.v1beta1.QueryInflationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.mint.v1beta1.QueryInflationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.mint.v1beta1.QueryInflationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.mint.v1beta1.QueryInflationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.mint.v1beta1.QueryInflationResponse parseFrom(
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
  public static Builder newBuilder(cosmos.mint.v1beta1.QueryInflationResponse prototype) {
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
   * QueryInflationResponse is the response type for the Query/Inflation RPC
   * method.
   * </pre>
   *
   * Protobuf type {@code cosmos.mint.v1beta1.QueryInflationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.mint.v1beta1.QueryInflationResponse)
      cosmos.mint.v1beta1.QueryInflationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.mint.v1beta1.QueryOuterClass.internal_static_cosmos_mint_v1beta1_QueryInflationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.mint.v1beta1.QueryOuterClass.internal_static_cosmos_mint_v1beta1_QueryInflationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.mint.v1beta1.QueryInflationResponse.class, cosmos.mint.v1beta1.QueryInflationResponse.Builder.class);
    }

    // Construct using cosmos.mint.v1beta1.QueryInflationResponse.newBuilder()
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
      inflation_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.mint.v1beta1.QueryOuterClass.internal_static_cosmos_mint_v1beta1_QueryInflationResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.mint.v1beta1.QueryInflationResponse getDefaultInstanceForType() {
      return cosmos.mint.v1beta1.QueryInflationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.mint.v1beta1.QueryInflationResponse build() {
      cosmos.mint.v1beta1.QueryInflationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.mint.v1beta1.QueryInflationResponse buildPartial() {
      cosmos.mint.v1beta1.QueryInflationResponse result = new cosmos.mint.v1beta1.QueryInflationResponse(this);
      result.inflation_ = inflation_;
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
      if (other instanceof cosmos.mint.v1beta1.QueryInflationResponse) {
        return mergeFrom((cosmos.mint.v1beta1.QueryInflationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.mint.v1beta1.QueryInflationResponse other) {
      if (other == cosmos.mint.v1beta1.QueryInflationResponse.getDefaultInstance()) return this;
      if (other.getInflation() != com.google.protobuf.ByteString.EMPTY) {
        setInflation(other.getInflation());
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
      cosmos.mint.v1beta1.QueryInflationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.mint.v1beta1.QueryInflationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString inflation_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * inflation is the current minting inflation value.
     * </pre>
     *
     * <code>bytes inflation = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     */
    public com.google.protobuf.ByteString getInflation() {
      return inflation_;
    }
    /**
     * <pre>
     * inflation is the current minting inflation value.
     * </pre>
     *
     * <code>bytes inflation = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     */
    public Builder setInflation(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      inflation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * inflation is the current minting inflation value.
     * </pre>
     *
     * <code>bytes inflation = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     */
    public Builder clearInflation() {
      
      inflation_ = getDefaultInstance().getInflation();
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


    // @@protoc_insertion_point(builder_scope:cosmos.mint.v1beta1.QueryInflationResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.mint.v1beta1.QueryInflationResponse)
  private static final cosmos.mint.v1beta1.QueryInflationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.mint.v1beta1.QueryInflationResponse();
  }

  public static cosmos.mint.v1beta1.QueryInflationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryInflationResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryInflationResponse>() {
    @java.lang.Override
    public QueryInflationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryInflationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryInflationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryInflationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.mint.v1beta1.QueryInflationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
