// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

/**
 * <pre>
 * GetTxRequest is the request type for the Service.GetTx
 * RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.tx.v1beta1.GetTxRequest}
 */
public  final class GetTxRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.tx.v1beta1.GetTxRequest)
    GetTxRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTxRequest.newBuilder() to construct.
  private GetTxRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTxRequest() {
    hash_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTxRequest(
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

            hash_ = s;
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
    return cosmos.tx.v1beta1.ServiceOuterClass.internal_static_cosmos_tx_v1beta1_GetTxRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.tx.v1beta1.ServiceOuterClass.internal_static_cosmos_tx_v1beta1_GetTxRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.tx.v1beta1.GetTxRequest.class, cosmos.tx.v1beta1.GetTxRequest.Builder.class);
  }

  public static final int HASH_FIELD_NUMBER = 1;
  private volatile java.lang.Object hash_;
  /**
   * <pre>
   * hash is the tx hash to query, encoded as a hex string.
   * </pre>
   *
   * <code>string hash = 1;</code>
   */
  public java.lang.String getHash() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hash_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * hash is the tx hash to query, encoded as a hex string.
   * </pre>
   *
   * <code>string hash = 1;</code>
   */
  public com.google.protobuf.ByteString
      getHashBytes() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hash_ = b;
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
    if (!getHashBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hash_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHashBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hash_);
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
    if (!(obj instanceof cosmos.tx.v1beta1.GetTxRequest)) {
      return super.equals(obj);
    }
    cosmos.tx.v1beta1.GetTxRequest other = (cosmos.tx.v1beta1.GetTxRequest) obj;

    if (!getHash()
        .equals(other.getHash())) return false;
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
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.tx.v1beta1.GetTxRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.tx.v1beta1.GetTxRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.tx.v1beta1.GetTxRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.tx.v1beta1.GetTxRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.tx.v1beta1.GetTxRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.tx.v1beta1.GetTxRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.tx.v1beta1.GetTxRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.tx.v1beta1.GetTxRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.tx.v1beta1.GetTxRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.tx.v1beta1.GetTxRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.tx.v1beta1.GetTxRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.tx.v1beta1.GetTxRequest parseFrom(
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
  public static Builder newBuilder(cosmos.tx.v1beta1.GetTxRequest prototype) {
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
   * GetTxRequest is the request type for the Service.GetTx
   * RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.tx.v1beta1.GetTxRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.tx.v1beta1.GetTxRequest)
      cosmos.tx.v1beta1.GetTxRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.tx.v1beta1.ServiceOuterClass.internal_static_cosmos_tx_v1beta1_GetTxRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.tx.v1beta1.ServiceOuterClass.internal_static_cosmos_tx_v1beta1_GetTxRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.tx.v1beta1.GetTxRequest.class, cosmos.tx.v1beta1.GetTxRequest.Builder.class);
    }

    // Construct using cosmos.tx.v1beta1.GetTxRequest.newBuilder()
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
      hash_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.tx.v1beta1.ServiceOuterClass.internal_static_cosmos_tx_v1beta1_GetTxRequest_descriptor;
    }

    @java.lang.Override
    public cosmos.tx.v1beta1.GetTxRequest getDefaultInstanceForType() {
      return cosmos.tx.v1beta1.GetTxRequest.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.tx.v1beta1.GetTxRequest build() {
      cosmos.tx.v1beta1.GetTxRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.tx.v1beta1.GetTxRequest buildPartial() {
      cosmos.tx.v1beta1.GetTxRequest result = new cosmos.tx.v1beta1.GetTxRequest(this);
      result.hash_ = hash_;
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
      if (other instanceof cosmos.tx.v1beta1.GetTxRequest) {
        return mergeFrom((cosmos.tx.v1beta1.GetTxRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.tx.v1beta1.GetTxRequest other) {
      if (other == cosmos.tx.v1beta1.GetTxRequest.getDefaultInstance()) return this;
      if (!other.getHash().isEmpty()) {
        hash_ = other.hash_;
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
      cosmos.tx.v1beta1.GetTxRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.tx.v1beta1.GetTxRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object hash_ = "";
    /**
     * <pre>
     * hash is the tx hash to query, encoded as a hex string.
     * </pre>
     *
     * <code>string hash = 1;</code>
     */
    public java.lang.String getHash() {
      java.lang.Object ref = hash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * hash is the tx hash to query, encoded as a hex string.
     * </pre>
     *
     * <code>string hash = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHashBytes() {
      java.lang.Object ref = hash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * hash is the tx hash to query, encoded as a hex string.
     * </pre>
     *
     * <code>string hash = 1;</code>
     */
    public Builder setHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hash_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * hash is the tx hash to query, encoded as a hex string.
     * </pre>
     *
     * <code>string hash = 1;</code>
     */
    public Builder clearHash() {
      
      hash_ = getDefaultInstance().getHash();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * hash is the tx hash to query, encoded as a hex string.
     * </pre>
     *
     * <code>string hash = 1;</code>
     */
    public Builder setHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hash_ = value;
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


    // @@protoc_insertion_point(builder_scope:cosmos.tx.v1beta1.GetTxRequest)
  }

  // @@protoc_insertion_point(class_scope:cosmos.tx.v1beta1.GetTxRequest)
  private static final cosmos.tx.v1beta1.GetTxRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.tx.v1beta1.GetTxRequest();
  }

  public static cosmos.tx.v1beta1.GetTxRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTxRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetTxRequest>() {
    @java.lang.Override
    public GetTxRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTxRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTxRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTxRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.tx.v1beta1.GetTxRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

