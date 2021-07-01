// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/aol/v2/query.proto

package panacea.aol.v2;

/**
 * Protobuf type {@code panacea.aol.v2.QueryListWritersResponse}
 */
public  final class QueryListWritersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.aol.v2.QueryListWritersResponse)
    QueryListWritersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryListWritersResponse.newBuilder() to construct.
  private QueryListWritersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryListWritersResponse() {
    writerAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryListWritersResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              writerAddresses_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            writerAddresses_.add(s);
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
        writerAddresses_ = writerAddresses_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryListWritersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryListWritersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            panacea.aol.v2.QueryListWritersResponse.class, panacea.aol.v2.QueryListWritersResponse.Builder.class);
  }

  private int bitField0_;
  public static final int WRITERADDRESSES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList writerAddresses_;
  /**
   * <code>repeated string writerAddresses = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getWriterAddressesList() {
    return writerAddresses_;
  }
  /**
   * <code>repeated string writerAddresses = 1;</code>
   */
  public int getWriterAddressesCount() {
    return writerAddresses_.size();
  }
  /**
   * <code>repeated string writerAddresses = 1;</code>
   */
  public java.lang.String getWriterAddresses(int index) {
    return writerAddresses_.get(index);
  }
  /**
   * <code>repeated string writerAddresses = 1;</code>
   */
  public com.google.protobuf.ByteString
      getWriterAddressesBytes(int index) {
    return writerAddresses_.getByteString(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  public cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
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
    for (int i = 0; i < writerAddresses_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, writerAddresses_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < writerAddresses_.size(); i++) {
        dataSize += computeStringSizeNoTag(writerAddresses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getWriterAddressesList().size();
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
    if (!(obj instanceof panacea.aol.v2.QueryListWritersResponse)) {
      return super.equals(obj);
    }
    panacea.aol.v2.QueryListWritersResponse other = (panacea.aol.v2.QueryListWritersResponse) obj;

    if (!getWriterAddressesList()
        .equals(other.getWriterAddressesList())) return false;
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
    if (getWriterAddressesCount() > 0) {
      hash = (37 * hash) + WRITERADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getWriterAddressesList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static panacea.aol.v2.QueryListWritersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.QueryListWritersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.QueryListWritersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.QueryListWritersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.QueryListWritersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.QueryListWritersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.QueryListWritersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.QueryListWritersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.aol.v2.QueryListWritersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.QueryListWritersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.aol.v2.QueryListWritersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.QueryListWritersResponse parseFrom(
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
  public static Builder newBuilder(panacea.aol.v2.QueryListWritersResponse prototype) {
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
   * Protobuf type {@code panacea.aol.v2.QueryListWritersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.aol.v2.QueryListWritersResponse)
      panacea.aol.v2.QueryListWritersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryListWritersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryListWritersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              panacea.aol.v2.QueryListWritersResponse.class, panacea.aol.v2.QueryListWritersResponse.Builder.class);
    }

    // Construct using panacea.aol.v2.QueryListWritersResponse.newBuilder()
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
      writerAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
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
      return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryListWritersResponse_descriptor;
    }

    @java.lang.Override
    public panacea.aol.v2.QueryListWritersResponse getDefaultInstanceForType() {
      return panacea.aol.v2.QueryListWritersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public panacea.aol.v2.QueryListWritersResponse build() {
      panacea.aol.v2.QueryListWritersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public panacea.aol.v2.QueryListWritersResponse buildPartial() {
      panacea.aol.v2.QueryListWritersResponse result = new panacea.aol.v2.QueryListWritersResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        writerAddresses_ = writerAddresses_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.writerAddresses_ = writerAddresses_;
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
      if (other instanceof panacea.aol.v2.QueryListWritersResponse) {
        return mergeFrom((panacea.aol.v2.QueryListWritersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(panacea.aol.v2.QueryListWritersResponse other) {
      if (other == panacea.aol.v2.QueryListWritersResponse.getDefaultInstance()) return this;
      if (!other.writerAddresses_.isEmpty()) {
        if (writerAddresses_.isEmpty()) {
          writerAddresses_ = other.writerAddresses_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureWriterAddressesIsMutable();
          writerAddresses_.addAll(other.writerAddresses_);
        }
        onChanged();
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
      panacea.aol.v2.QueryListWritersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (panacea.aol.v2.QueryListWritersResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList writerAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureWriterAddressesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        writerAddresses_ = new com.google.protobuf.LazyStringArrayList(writerAddresses_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string writerAddresses = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getWriterAddressesList() {
      return writerAddresses_.getUnmodifiableView();
    }
    /**
     * <code>repeated string writerAddresses = 1;</code>
     */
    public int getWriterAddressesCount() {
      return writerAddresses_.size();
    }
    /**
     * <code>repeated string writerAddresses = 1;</code>
     */
    public java.lang.String getWriterAddresses(int index) {
      return writerAddresses_.get(index);
    }
    /**
     * <code>repeated string writerAddresses = 1;</code>
     */
    public com.google.protobuf.ByteString
        getWriterAddressesBytes(int index) {
      return writerAddresses_.getByteString(index);
    }
    /**
     * <code>repeated string writerAddresses = 1;</code>
     */
    public Builder setWriterAddresses(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureWriterAddressesIsMutable();
      writerAddresses_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string writerAddresses = 1;</code>
     */
    public Builder addWriterAddresses(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureWriterAddressesIsMutable();
      writerAddresses_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string writerAddresses = 1;</code>
     */
    public Builder addAllWriterAddresses(
        java.lang.Iterable<java.lang.String> values) {
      ensureWriterAddressesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, writerAddresses_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string writerAddresses = 1;</code>
     */
    public Builder clearWriterAddresses() {
      writerAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string writerAddresses = 1;</code>
     */
    public Builder addWriterAddressesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureWriterAddressesIsMutable();
      writerAddresses_.add(value);
      onChanged();
      return this;
    }

    private cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.query.v1beta1.PageResponse, cosmos.base.query.v1beta1.PageResponse.Builder, cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public boolean hasPagination() {
      return paginationBuilder_ != null || pagination_ != null;
    }
    /**
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
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


    // @@protoc_insertion_point(builder_scope:panacea.aol.v2.QueryListWritersResponse)
  }

  // @@protoc_insertion_point(class_scope:panacea.aol.v2.QueryListWritersResponse)
  private static final panacea.aol.v2.QueryListWritersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new panacea.aol.v2.QueryListWritersResponse();
  }

  public static panacea.aol.v2.QueryListWritersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryListWritersResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryListWritersResponse>() {
    @java.lang.Override
    public QueryListWritersResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryListWritersResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryListWritersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryListWritersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public panacea.aol.v2.QueryListWritersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

