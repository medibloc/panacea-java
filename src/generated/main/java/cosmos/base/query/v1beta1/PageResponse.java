// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/query/v1beta1/pagination.proto

package cosmos.base.query.v1beta1;

/**
 * <pre>
 * PageResponse is to be embedded in gRPC response messages where the
 * corresponding request message has used PageRequest.
 *  message SomeResponse {
 *          repeated Bar results = 1;
 *          PageResponse page = 2;
 *  }
 * </pre>
 *
 * Protobuf type {@code cosmos.base.query.v1beta1.PageResponse}
 */
public  final class PageResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.base.query.v1beta1.PageResponse)
    PageResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PageResponse.newBuilder() to construct.
  private PageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PageResponse() {
    nextKey_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PageResponse(
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

            nextKey_ = input.readBytes();
            break;
          }
          case 16: {

            total_ = input.readUInt64();
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
    return cosmos.base.query.v1beta1.Pagination.internal_static_cosmos_base_query_v1beta1_PageResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.base.query.v1beta1.Pagination.internal_static_cosmos_base_query_v1beta1_PageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.base.query.v1beta1.PageResponse.class, cosmos.base.query.v1beta1.PageResponse.Builder.class);
  }

  public static final int NEXT_KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString nextKey_;
  /**
   * <pre>
   * next_key is the key to be passed to PageRequest.key to
   * query the next page most efficiently
   * </pre>
   *
   * <code>bytes next_key = 1;</code>
   */
  public com.google.protobuf.ByteString getNextKey() {
    return nextKey_;
  }

  public static final int TOTAL_FIELD_NUMBER = 2;
  private long total_;
  /**
   * <pre>
   * total is total number of results available if PageRequest.count_total
   * was set, its value is undefined otherwise
   * </pre>
   *
   * <code>uint64 total = 2;</code>
   */
  public long getTotal() {
    return total_;
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
    if (!nextKey_.isEmpty()) {
      output.writeBytes(1, nextKey_);
    }
    if (total_ != 0L) {
      output.writeUInt64(2, total_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!nextKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, nextKey_);
    }
    if (total_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, total_);
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
    if (!(obj instanceof cosmos.base.query.v1beta1.PageResponse)) {
      return super.equals(obj);
    }
    cosmos.base.query.v1beta1.PageResponse other = (cosmos.base.query.v1beta1.PageResponse) obj;

    if (!getNextKey()
        .equals(other.getNextKey())) return false;
    if (getTotal()
        != other.getTotal()) return false;
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
    hash = (37 * hash) + NEXT_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getNextKey().hashCode();
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotal());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.base.query.v1beta1.PageResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.query.v1beta1.PageResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.query.v1beta1.PageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.query.v1beta1.PageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.query.v1beta1.PageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.query.v1beta1.PageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.query.v1beta1.PageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.base.query.v1beta1.PageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.base.query.v1beta1.PageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.base.query.v1beta1.PageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.base.query.v1beta1.PageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.base.query.v1beta1.PageResponse parseFrom(
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
  public static Builder newBuilder(cosmos.base.query.v1beta1.PageResponse prototype) {
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
   * PageResponse is to be embedded in gRPC response messages where the
   * corresponding request message has used PageRequest.
   *  message SomeResponse {
   *          repeated Bar results = 1;
   *          PageResponse page = 2;
   *  }
   * </pre>
   *
   * Protobuf type {@code cosmos.base.query.v1beta1.PageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.base.query.v1beta1.PageResponse)
      cosmos.base.query.v1beta1.PageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.base.query.v1beta1.Pagination.internal_static_cosmos_base_query_v1beta1_PageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.base.query.v1beta1.Pagination.internal_static_cosmos_base_query_v1beta1_PageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.base.query.v1beta1.PageResponse.class, cosmos.base.query.v1beta1.PageResponse.Builder.class);
    }

    // Construct using cosmos.base.query.v1beta1.PageResponse.newBuilder()
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
      nextKey_ = com.google.protobuf.ByteString.EMPTY;

      total_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.base.query.v1beta1.Pagination.internal_static_cosmos_base_query_v1beta1_PageResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.base.query.v1beta1.PageResponse getDefaultInstanceForType() {
      return cosmos.base.query.v1beta1.PageResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.base.query.v1beta1.PageResponse build() {
      cosmos.base.query.v1beta1.PageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.base.query.v1beta1.PageResponse buildPartial() {
      cosmos.base.query.v1beta1.PageResponse result = new cosmos.base.query.v1beta1.PageResponse(this);
      result.nextKey_ = nextKey_;
      result.total_ = total_;
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
      if (other instanceof cosmos.base.query.v1beta1.PageResponse) {
        return mergeFrom((cosmos.base.query.v1beta1.PageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.base.query.v1beta1.PageResponse other) {
      if (other == cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) return this;
      if (other.getNextKey() != com.google.protobuf.ByteString.EMPTY) {
        setNextKey(other.getNextKey());
      }
      if (other.getTotal() != 0L) {
        setTotal(other.getTotal());
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
      cosmos.base.query.v1beta1.PageResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.base.query.v1beta1.PageResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString nextKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * next_key is the key to be passed to PageRequest.key to
     * query the next page most efficiently
     * </pre>
     *
     * <code>bytes next_key = 1;</code>
     */
    public com.google.protobuf.ByteString getNextKey() {
      return nextKey_;
    }
    /**
     * <pre>
     * next_key is the key to be passed to PageRequest.key to
     * query the next page most efficiently
     * </pre>
     *
     * <code>bytes next_key = 1;</code>
     */
    public Builder setNextKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next_key is the key to be passed to PageRequest.key to
     * query the next page most efficiently
     * </pre>
     *
     * <code>bytes next_key = 1;</code>
     */
    public Builder clearNextKey() {
      
      nextKey_ = getDefaultInstance().getNextKey();
      onChanged();
      return this;
    }

    private long total_ ;
    /**
     * <pre>
     * total is total number of results available if PageRequest.count_total
     * was set, its value is undefined otherwise
     * </pre>
     *
     * <code>uint64 total = 2;</code>
     */
    public long getTotal() {
      return total_;
    }
    /**
     * <pre>
     * total is total number of results available if PageRequest.count_total
     * was set, its value is undefined otherwise
     * </pre>
     *
     * <code>uint64 total = 2;</code>
     */
    public Builder setTotal(long value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * total is total number of results available if PageRequest.count_total
     * was set, its value is undefined otherwise
     * </pre>
     *
     * <code>uint64 total = 2;</code>
     */
    public Builder clearTotal() {
      
      total_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:cosmos.base.query.v1beta1.PageResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.base.query.v1beta1.PageResponse)
  private static final cosmos.base.query.v1beta1.PageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.base.query.v1beta1.PageResponse();
  }

  public static cosmos.base.query.v1beta1.PageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PageResponse>
      PARSER = new com.google.protobuf.AbstractParser<PageResponse>() {
    @java.lang.Override
    public PageResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PageResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PageResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.base.query.v1beta1.PageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
