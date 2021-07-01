// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/abci/v1beta1/abci.proto

package cosmos.base.abci.v1beta1;

/**
 * <pre>
 * SearchTxsResult defines a structure for querying txs pageable
 * </pre>
 *
 * Protobuf type {@code cosmos.base.abci.v1beta1.SearchTxsResult}
 */
public  final class SearchTxsResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.base.abci.v1beta1.SearchTxsResult)
    SearchTxsResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchTxsResult.newBuilder() to construct.
  private SearchTxsResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchTxsResult() {
    txs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchTxsResult(
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
          case 8: {

            totalCount_ = input.readUInt64();
            break;
          }
          case 16: {

            count_ = input.readUInt64();
            break;
          }
          case 24: {

            pageNumber_ = input.readUInt64();
            break;
          }
          case 32: {

            pageTotal_ = input.readUInt64();
            break;
          }
          case 40: {

            limit_ = input.readUInt64();
            break;
          }
          case 50: {
            if (!((mutable_bitField0_ & 0x00000020) != 0)) {
              txs_ = new java.util.ArrayList<cosmos.base.abci.v1beta1.TxResponse>();
              mutable_bitField0_ |= 0x00000020;
            }
            txs_.add(
                input.readMessage(cosmos.base.abci.v1beta1.TxResponse.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000020) != 0)) {
        txs_ = java.util.Collections.unmodifiableList(txs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cosmos.base.abci.v1beta1.Abci.internal_static_cosmos_base_abci_v1beta1_SearchTxsResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.base.abci.v1beta1.Abci.internal_static_cosmos_base_abci_v1beta1_SearchTxsResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.base.abci.v1beta1.SearchTxsResult.class, cosmos.base.abci.v1beta1.SearchTxsResult.Builder.class);
  }

  private int bitField0_;
  public static final int TOTAL_COUNT_FIELD_NUMBER = 1;
  private long totalCount_;
  /**
   * <pre>
   * Count of all txs
   * </pre>
   *
   * <code>uint64 total_count = 1 [(.gogoproto.jsontag) = "total_count", (.gogoproto.moretags) = "yaml:&#92;"total_count&#92;""];</code>
   */
  public long getTotalCount() {
    return totalCount_;
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private long count_;
  /**
   * <pre>
   * Count of txs in current page
   * </pre>
   *
   * <code>uint64 count = 2;</code>
   */
  public long getCount() {
    return count_;
  }

  public static final int PAGE_NUMBER_FIELD_NUMBER = 3;
  private long pageNumber_;
  /**
   * <pre>
   * Index of current page, start from 1
   * </pre>
   *
   * <code>uint64 page_number = 3 [(.gogoproto.jsontag) = "page_number", (.gogoproto.moretags) = "yaml:&#92;"page_number&#92;""];</code>
   */
  public long getPageNumber() {
    return pageNumber_;
  }

  public static final int PAGE_TOTAL_FIELD_NUMBER = 4;
  private long pageTotal_;
  /**
   * <pre>
   * Count of total pages
   * </pre>
   *
   * <code>uint64 page_total = 4 [(.gogoproto.jsontag) = "page_total", (.gogoproto.moretags) = "yaml:&#92;"page_total&#92;""];</code>
   */
  public long getPageTotal() {
    return pageTotal_;
  }

  public static final int LIMIT_FIELD_NUMBER = 5;
  private long limit_;
  /**
   * <pre>
   * Max count txs per page
   * </pre>
   *
   * <code>uint64 limit = 5;</code>
   */
  public long getLimit() {
    return limit_;
  }

  public static final int TXS_FIELD_NUMBER = 6;
  private java.util.List<cosmos.base.abci.v1beta1.TxResponse> txs_;
  /**
   * <pre>
   * List of txs in current page
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
   */
  public java.util.List<cosmos.base.abci.v1beta1.TxResponse> getTxsList() {
    return txs_;
  }
  /**
   * <pre>
   * List of txs in current page
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
   */
  public java.util.List<? extends cosmos.base.abci.v1beta1.TxResponseOrBuilder> 
      getTxsOrBuilderList() {
    return txs_;
  }
  /**
   * <pre>
   * List of txs in current page
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
   */
  public int getTxsCount() {
    return txs_.size();
  }
  /**
   * <pre>
   * List of txs in current page
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
   */
  public cosmos.base.abci.v1beta1.TxResponse getTxs(int index) {
    return txs_.get(index);
  }
  /**
   * <pre>
   * List of txs in current page
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
   */
  public cosmos.base.abci.v1beta1.TxResponseOrBuilder getTxsOrBuilder(
      int index) {
    return txs_.get(index);
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
    if (totalCount_ != 0L) {
      output.writeUInt64(1, totalCount_);
    }
    if (count_ != 0L) {
      output.writeUInt64(2, count_);
    }
    if (pageNumber_ != 0L) {
      output.writeUInt64(3, pageNumber_);
    }
    if (pageTotal_ != 0L) {
      output.writeUInt64(4, pageTotal_);
    }
    if (limit_ != 0L) {
      output.writeUInt64(5, limit_);
    }
    for (int i = 0; i < txs_.size(); i++) {
      output.writeMessage(6, txs_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, totalCount_);
    }
    if (count_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, count_);
    }
    if (pageNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, pageNumber_);
    }
    if (pageTotal_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, pageTotal_);
    }
    if (limit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, limit_);
    }
    for (int i = 0; i < txs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, txs_.get(i));
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
    if (!(obj instanceof cosmos.base.abci.v1beta1.SearchTxsResult)) {
      return super.equals(obj);
    }
    cosmos.base.abci.v1beta1.SearchTxsResult other = (cosmos.base.abci.v1beta1.SearchTxsResult) obj;

    if (getTotalCount()
        != other.getTotalCount()) return false;
    if (getCount()
        != other.getCount()) return false;
    if (getPageNumber()
        != other.getPageNumber()) return false;
    if (getPageTotal()
        != other.getPageTotal()) return false;
    if (getLimit()
        != other.getLimit()) return false;
    if (!getTxsList()
        .equals(other.getTxsList())) return false;
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
    hash = (37 * hash) + TOTAL_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalCount());
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCount());
    hash = (37 * hash) + PAGE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageNumber());
    hash = (37 * hash) + PAGE_TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageTotal());
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLimit());
    if (getTxsCount() > 0) {
      hash = (37 * hash) + TXS_FIELD_NUMBER;
      hash = (53 * hash) + getTxsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.base.abci.v1beta1.SearchTxsResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.abci.v1beta1.SearchTxsResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.abci.v1beta1.SearchTxsResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.abci.v1beta1.SearchTxsResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.abci.v1beta1.SearchTxsResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.abci.v1beta1.SearchTxsResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.abci.v1beta1.SearchTxsResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.base.abci.v1beta1.SearchTxsResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.base.abci.v1beta1.SearchTxsResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.base.abci.v1beta1.SearchTxsResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.base.abci.v1beta1.SearchTxsResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.base.abci.v1beta1.SearchTxsResult parseFrom(
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
  public static Builder newBuilder(cosmos.base.abci.v1beta1.SearchTxsResult prototype) {
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
   * SearchTxsResult defines a structure for querying txs pageable
   * </pre>
   *
   * Protobuf type {@code cosmos.base.abci.v1beta1.SearchTxsResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.base.abci.v1beta1.SearchTxsResult)
      cosmos.base.abci.v1beta1.SearchTxsResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.base.abci.v1beta1.Abci.internal_static_cosmos_base_abci_v1beta1_SearchTxsResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.base.abci.v1beta1.Abci.internal_static_cosmos_base_abci_v1beta1_SearchTxsResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.base.abci.v1beta1.SearchTxsResult.class, cosmos.base.abci.v1beta1.SearchTxsResult.Builder.class);
    }

    // Construct using cosmos.base.abci.v1beta1.SearchTxsResult.newBuilder()
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
        getTxsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      totalCount_ = 0L;

      count_ = 0L;

      pageNumber_ = 0L;

      pageTotal_ = 0L;

      limit_ = 0L;

      if (txsBuilder_ == null) {
        txs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
      } else {
        txsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.base.abci.v1beta1.Abci.internal_static_cosmos_base_abci_v1beta1_SearchTxsResult_descriptor;
    }

    @java.lang.Override
    public cosmos.base.abci.v1beta1.SearchTxsResult getDefaultInstanceForType() {
      return cosmos.base.abci.v1beta1.SearchTxsResult.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.base.abci.v1beta1.SearchTxsResult build() {
      cosmos.base.abci.v1beta1.SearchTxsResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.base.abci.v1beta1.SearchTxsResult buildPartial() {
      cosmos.base.abci.v1beta1.SearchTxsResult result = new cosmos.base.abci.v1beta1.SearchTxsResult(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.totalCount_ = totalCount_;
      result.count_ = count_;
      result.pageNumber_ = pageNumber_;
      result.pageTotal_ = pageTotal_;
      result.limit_ = limit_;
      if (txsBuilder_ == null) {
        if (((bitField0_ & 0x00000020) != 0)) {
          txs_ = java.util.Collections.unmodifiableList(txs_);
          bitField0_ = (bitField0_ & ~0x00000020);
        }
        result.txs_ = txs_;
      } else {
        result.txs_ = txsBuilder_.build();
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
      if (other instanceof cosmos.base.abci.v1beta1.SearchTxsResult) {
        return mergeFrom((cosmos.base.abci.v1beta1.SearchTxsResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.base.abci.v1beta1.SearchTxsResult other) {
      if (other == cosmos.base.abci.v1beta1.SearchTxsResult.getDefaultInstance()) return this;
      if (other.getTotalCount() != 0L) {
        setTotalCount(other.getTotalCount());
      }
      if (other.getCount() != 0L) {
        setCount(other.getCount());
      }
      if (other.getPageNumber() != 0L) {
        setPageNumber(other.getPageNumber());
      }
      if (other.getPageTotal() != 0L) {
        setPageTotal(other.getPageTotal());
      }
      if (other.getLimit() != 0L) {
        setLimit(other.getLimit());
      }
      if (txsBuilder_ == null) {
        if (!other.txs_.isEmpty()) {
          if (txs_.isEmpty()) {
            txs_ = other.txs_;
            bitField0_ = (bitField0_ & ~0x00000020);
          } else {
            ensureTxsIsMutable();
            txs_.addAll(other.txs_);
          }
          onChanged();
        }
      } else {
        if (!other.txs_.isEmpty()) {
          if (txsBuilder_.isEmpty()) {
            txsBuilder_.dispose();
            txsBuilder_ = null;
            txs_ = other.txs_;
            bitField0_ = (bitField0_ & ~0x00000020);
            txsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTxsFieldBuilder() : null;
          } else {
            txsBuilder_.addAllMessages(other.txs_);
          }
        }
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
      cosmos.base.abci.v1beta1.SearchTxsResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.base.abci.v1beta1.SearchTxsResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long totalCount_ ;
    /**
     * <pre>
     * Count of all txs
     * </pre>
     *
     * <code>uint64 total_count = 1 [(.gogoproto.jsontag) = "total_count", (.gogoproto.moretags) = "yaml:&#92;"total_count&#92;""];</code>
     */
    public long getTotalCount() {
      return totalCount_;
    }
    /**
     * <pre>
     * Count of all txs
     * </pre>
     *
     * <code>uint64 total_count = 1 [(.gogoproto.jsontag) = "total_count", (.gogoproto.moretags) = "yaml:&#92;"total_count&#92;""];</code>
     */
    public Builder setTotalCount(long value) {
      
      totalCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of all txs
     * </pre>
     *
     * <code>uint64 total_count = 1 [(.gogoproto.jsontag) = "total_count", (.gogoproto.moretags) = "yaml:&#92;"total_count&#92;""];</code>
     */
    public Builder clearTotalCount() {
      
      totalCount_ = 0L;
      onChanged();
      return this;
    }

    private long count_ ;
    /**
     * <pre>
     * Count of txs in current page
     * </pre>
     *
     * <code>uint64 count = 2;</code>
     */
    public long getCount() {
      return count_;
    }
    /**
     * <pre>
     * Count of txs in current page
     * </pre>
     *
     * <code>uint64 count = 2;</code>
     */
    public Builder setCount(long value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of txs in current page
     * </pre>
     *
     * <code>uint64 count = 2;</code>
     */
    public Builder clearCount() {
      
      count_ = 0L;
      onChanged();
      return this;
    }

    private long pageNumber_ ;
    /**
     * <pre>
     * Index of current page, start from 1
     * </pre>
     *
     * <code>uint64 page_number = 3 [(.gogoproto.jsontag) = "page_number", (.gogoproto.moretags) = "yaml:&#92;"page_number&#92;""];</code>
     */
    public long getPageNumber() {
      return pageNumber_;
    }
    /**
     * <pre>
     * Index of current page, start from 1
     * </pre>
     *
     * <code>uint64 page_number = 3 [(.gogoproto.jsontag) = "page_number", (.gogoproto.moretags) = "yaml:&#92;"page_number&#92;""];</code>
     */
    public Builder setPageNumber(long value) {
      
      pageNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Index of current page, start from 1
     * </pre>
     *
     * <code>uint64 page_number = 3 [(.gogoproto.jsontag) = "page_number", (.gogoproto.moretags) = "yaml:&#92;"page_number&#92;""];</code>
     */
    public Builder clearPageNumber() {
      
      pageNumber_ = 0L;
      onChanged();
      return this;
    }

    private long pageTotal_ ;
    /**
     * <pre>
     * Count of total pages
     * </pre>
     *
     * <code>uint64 page_total = 4 [(.gogoproto.jsontag) = "page_total", (.gogoproto.moretags) = "yaml:&#92;"page_total&#92;""];</code>
     */
    public long getPageTotal() {
      return pageTotal_;
    }
    /**
     * <pre>
     * Count of total pages
     * </pre>
     *
     * <code>uint64 page_total = 4 [(.gogoproto.jsontag) = "page_total", (.gogoproto.moretags) = "yaml:&#92;"page_total&#92;""];</code>
     */
    public Builder setPageTotal(long value) {
      
      pageTotal_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of total pages
     * </pre>
     *
     * <code>uint64 page_total = 4 [(.gogoproto.jsontag) = "page_total", (.gogoproto.moretags) = "yaml:&#92;"page_total&#92;""];</code>
     */
    public Builder clearPageTotal() {
      
      pageTotal_ = 0L;
      onChanged();
      return this;
    }

    private long limit_ ;
    /**
     * <pre>
     * Max count txs per page
     * </pre>
     *
     * <code>uint64 limit = 5;</code>
     */
    public long getLimit() {
      return limit_;
    }
    /**
     * <pre>
     * Max count txs per page
     * </pre>
     *
     * <code>uint64 limit = 5;</code>
     */
    public Builder setLimit(long value) {
      
      limit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Max count txs per page
     * </pre>
     *
     * <code>uint64 limit = 5;</code>
     */
    public Builder clearLimit() {
      
      limit_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<cosmos.base.abci.v1beta1.TxResponse> txs_ =
      java.util.Collections.emptyList();
    private void ensureTxsIsMutable() {
      if (!((bitField0_ & 0x00000020) != 0)) {
        txs_ = new java.util.ArrayList<cosmos.base.abci.v1beta1.TxResponse>(txs_);
        bitField0_ |= 0x00000020;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.base.abci.v1beta1.TxResponse, cosmos.base.abci.v1beta1.TxResponse.Builder, cosmos.base.abci.v1beta1.TxResponseOrBuilder> txsBuilder_;

    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public java.util.List<cosmos.base.abci.v1beta1.TxResponse> getTxsList() {
      if (txsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(txs_);
      } else {
        return txsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public int getTxsCount() {
      if (txsBuilder_ == null) {
        return txs_.size();
      } else {
        return txsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public cosmos.base.abci.v1beta1.TxResponse getTxs(int index) {
      if (txsBuilder_ == null) {
        return txs_.get(index);
      } else {
        return txsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public Builder setTxs(
        int index, cosmos.base.abci.v1beta1.TxResponse value) {
      if (txsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTxsIsMutable();
        txs_.set(index, value);
        onChanged();
      } else {
        txsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public Builder setTxs(
        int index, cosmos.base.abci.v1beta1.TxResponse.Builder builderForValue) {
      if (txsBuilder_ == null) {
        ensureTxsIsMutable();
        txs_.set(index, builderForValue.build());
        onChanged();
      } else {
        txsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public Builder addTxs(cosmos.base.abci.v1beta1.TxResponse value) {
      if (txsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTxsIsMutable();
        txs_.add(value);
        onChanged();
      } else {
        txsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public Builder addTxs(
        int index, cosmos.base.abci.v1beta1.TxResponse value) {
      if (txsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTxsIsMutable();
        txs_.add(index, value);
        onChanged();
      } else {
        txsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public Builder addTxs(
        cosmos.base.abci.v1beta1.TxResponse.Builder builderForValue) {
      if (txsBuilder_ == null) {
        ensureTxsIsMutable();
        txs_.add(builderForValue.build());
        onChanged();
      } else {
        txsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public Builder addTxs(
        int index, cosmos.base.abci.v1beta1.TxResponse.Builder builderForValue) {
      if (txsBuilder_ == null) {
        ensureTxsIsMutable();
        txs_.add(index, builderForValue.build());
        onChanged();
      } else {
        txsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public Builder addAllTxs(
        java.lang.Iterable<? extends cosmos.base.abci.v1beta1.TxResponse> values) {
      if (txsBuilder_ == null) {
        ensureTxsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, txs_);
        onChanged();
      } else {
        txsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public Builder clearTxs() {
      if (txsBuilder_ == null) {
        txs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
      } else {
        txsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public Builder removeTxs(int index) {
      if (txsBuilder_ == null) {
        ensureTxsIsMutable();
        txs_.remove(index);
        onChanged();
      } else {
        txsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public cosmos.base.abci.v1beta1.TxResponse.Builder getTxsBuilder(
        int index) {
      return getTxsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public cosmos.base.abci.v1beta1.TxResponseOrBuilder getTxsOrBuilder(
        int index) {
      if (txsBuilder_ == null) {
        return txs_.get(index);  } else {
        return txsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public java.util.List<? extends cosmos.base.abci.v1beta1.TxResponseOrBuilder> 
         getTxsOrBuilderList() {
      if (txsBuilder_ != null) {
        return txsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(txs_);
      }
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public cosmos.base.abci.v1beta1.TxResponse.Builder addTxsBuilder() {
      return getTxsFieldBuilder().addBuilder(
          cosmos.base.abci.v1beta1.TxResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public cosmos.base.abci.v1beta1.TxResponse.Builder addTxsBuilder(
        int index) {
      return getTxsFieldBuilder().addBuilder(
          index, cosmos.base.abci.v1beta1.TxResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6;</code>
     */
    public java.util.List<cosmos.base.abci.v1beta1.TxResponse.Builder> 
         getTxsBuilderList() {
      return getTxsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cosmos.base.abci.v1beta1.TxResponse, cosmos.base.abci.v1beta1.TxResponse.Builder, cosmos.base.abci.v1beta1.TxResponseOrBuilder> 
        getTxsFieldBuilder() {
      if (txsBuilder_ == null) {
        txsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cosmos.base.abci.v1beta1.TxResponse, cosmos.base.abci.v1beta1.TxResponse.Builder, cosmos.base.abci.v1beta1.TxResponseOrBuilder>(
                txs_,
                ((bitField0_ & 0x00000020) != 0),
                getParentForChildren(),
                isClean());
        txs_ = null;
      }
      return txsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.base.abci.v1beta1.SearchTxsResult)
  }

  // @@protoc_insertion_point(class_scope:cosmos.base.abci.v1beta1.SearchTxsResult)
  private static final cosmos.base.abci.v1beta1.SearchTxsResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.base.abci.v1beta1.SearchTxsResult();
  }

  public static cosmos.base.abci.v1beta1.SearchTxsResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchTxsResult>
      PARSER = new com.google.protobuf.AbstractParser<SearchTxsResult>() {
    @java.lang.Override
    public SearchTxsResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchTxsResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchTxsResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchTxsResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.base.abci.v1beta1.SearchTxsResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

