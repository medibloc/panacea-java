// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

/**
 * <pre>
 * GetTxsEventRequest is the request type for the Service.TxsByEvents
 * RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.tx.v1beta1.GetTxsEventRequest}
 */
public  final class GetTxsEventRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.tx.v1beta1.GetTxsEventRequest)
    GetTxsEventRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTxsEventRequest.newBuilder() to construct.
  private GetTxsEventRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTxsEventRequest() {
    events_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    orderBy_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTxsEventRequest(
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
              events_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            events_.add(s);
            break;
          }
          case 18: {
            cosmos.base.query.v1beta1.PageRequest.Builder subBuilder = null;
            if (pagination_ != null) {
              subBuilder = pagination_.toBuilder();
            }
            pagination_ = input.readMessage(cosmos.base.query.v1beta1.PageRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pagination_);
              pagination_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            orderBy_ = rawValue;
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
        events_ = events_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cosmos.tx.v1beta1.ServiceOuterClass.internal_static_cosmos_tx_v1beta1_GetTxsEventRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.tx.v1beta1.ServiceOuterClass.internal_static_cosmos_tx_v1beta1_GetTxsEventRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.tx.v1beta1.GetTxsEventRequest.class, cosmos.tx.v1beta1.GetTxsEventRequest.Builder.class);
  }

  private int bitField0_;
  public static final int EVENTS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList events_;
  /**
   * <pre>
   * events is the list of transaction event type.
   * </pre>
   *
   * <code>repeated string events = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getEventsList() {
    return events_;
  }
  /**
   * <pre>
   * events is the list of transaction event type.
   * </pre>
   *
   * <code>repeated string events = 1;</code>
   */
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <pre>
   * events is the list of transaction event type.
   * </pre>
   *
   * <code>repeated string events = 1;</code>
   */
  public java.lang.String getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <pre>
   * events is the list of transaction event type.
   * </pre>
   *
   * <code>repeated string events = 1;</code>
   */
  public com.google.protobuf.ByteString
      getEventsBytes(int index) {
    return events_.getByteString(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private cosmos.base.query.v1beta1.PageRequest pagination_;
  /**
   * <pre>
   * pagination defines an pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
   */
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination defines an pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
   */
  public cosmos.base.query.v1beta1.PageRequest getPagination() {
    return pagination_ == null ? cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination defines an pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
   */
  public cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder() {
    return getPagination();
  }

  public static final int ORDER_BY_FIELD_NUMBER = 3;
  private int orderBy_;
  /**
   * <code>.cosmos.tx.v1beta1.OrderBy order_by = 3;</code>
   */
  public int getOrderByValue() {
    return orderBy_;
  }
  /**
   * <code>.cosmos.tx.v1beta1.OrderBy order_by = 3;</code>
   */
  public cosmos.tx.v1beta1.OrderBy getOrderBy() {
    @SuppressWarnings("deprecation")
    cosmos.tx.v1beta1.OrderBy result = cosmos.tx.v1beta1.OrderBy.valueOf(orderBy_);
    return result == null ? cosmos.tx.v1beta1.OrderBy.UNRECOGNIZED : result;
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
    for (int i = 0; i < events_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, events_.getRaw(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    if (orderBy_ != cosmos.tx.v1beta1.OrderBy.ORDER_BY_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, orderBy_);
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
      for (int i = 0; i < events_.size(); i++) {
        dataSize += computeStringSizeNoTag(events_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEventsList().size();
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
    }
    if (orderBy_ != cosmos.tx.v1beta1.OrderBy.ORDER_BY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, orderBy_);
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
    if (!(obj instanceof cosmos.tx.v1beta1.GetTxsEventRequest)) {
      return super.equals(obj);
    }
    cosmos.tx.v1beta1.GetTxsEventRequest other = (cosmos.tx.v1beta1.GetTxsEventRequest) obj;

    if (!getEventsList()
        .equals(other.getEventsList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
    }
    if (orderBy_ != other.orderBy_) return false;
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
    if (getEventsCount() > 0) {
      hash = (37 * hash) + EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (37 * hash) + ORDER_BY_FIELD_NUMBER;
    hash = (53 * hash) + orderBy_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.tx.v1beta1.GetTxsEventRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.tx.v1beta1.GetTxsEventRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.tx.v1beta1.GetTxsEventRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.tx.v1beta1.GetTxsEventRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.tx.v1beta1.GetTxsEventRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.tx.v1beta1.GetTxsEventRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.tx.v1beta1.GetTxsEventRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.tx.v1beta1.GetTxsEventRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.tx.v1beta1.GetTxsEventRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.tx.v1beta1.GetTxsEventRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.tx.v1beta1.GetTxsEventRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.tx.v1beta1.GetTxsEventRequest parseFrom(
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
  public static Builder newBuilder(cosmos.tx.v1beta1.GetTxsEventRequest prototype) {
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
   * GetTxsEventRequest is the request type for the Service.TxsByEvents
   * RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.tx.v1beta1.GetTxsEventRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.tx.v1beta1.GetTxsEventRequest)
      cosmos.tx.v1beta1.GetTxsEventRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.tx.v1beta1.ServiceOuterClass.internal_static_cosmos_tx_v1beta1_GetTxsEventRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.tx.v1beta1.ServiceOuterClass.internal_static_cosmos_tx_v1beta1_GetTxsEventRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.tx.v1beta1.GetTxsEventRequest.class, cosmos.tx.v1beta1.GetTxsEventRequest.Builder.class);
    }

    // Construct using cosmos.tx.v1beta1.GetTxsEventRequest.newBuilder()
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
      events_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (paginationBuilder_ == null) {
        pagination_ = null;
      } else {
        pagination_ = null;
        paginationBuilder_ = null;
      }
      orderBy_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.tx.v1beta1.ServiceOuterClass.internal_static_cosmos_tx_v1beta1_GetTxsEventRequest_descriptor;
    }

    @java.lang.Override
    public cosmos.tx.v1beta1.GetTxsEventRequest getDefaultInstanceForType() {
      return cosmos.tx.v1beta1.GetTxsEventRequest.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.tx.v1beta1.GetTxsEventRequest build() {
      cosmos.tx.v1beta1.GetTxsEventRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.tx.v1beta1.GetTxsEventRequest buildPartial() {
      cosmos.tx.v1beta1.GetTxsEventRequest result = new cosmos.tx.v1beta1.GetTxsEventRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        events_ = events_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.events_ = events_;
      if (paginationBuilder_ == null) {
        result.pagination_ = pagination_;
      } else {
        result.pagination_ = paginationBuilder_.build();
      }
      result.orderBy_ = orderBy_;
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
      if (other instanceof cosmos.tx.v1beta1.GetTxsEventRequest) {
        return mergeFrom((cosmos.tx.v1beta1.GetTxsEventRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.tx.v1beta1.GetTxsEventRequest other) {
      if (other == cosmos.tx.v1beta1.GetTxsEventRequest.getDefaultInstance()) return this;
      if (!other.events_.isEmpty()) {
        if (events_.isEmpty()) {
          events_ = other.events_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEventsIsMutable();
          events_.addAll(other.events_);
        }
        onChanged();
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
      }
      if (other.orderBy_ != 0) {
        setOrderByValue(other.getOrderByValue());
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
      cosmos.tx.v1beta1.GetTxsEventRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.tx.v1beta1.GetTxsEventRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList events_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        events_ = new com.google.protobuf.LazyStringArrayList(events_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * events is the list of transaction event type.
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getEventsList() {
      return events_.getUnmodifiableView();
    }
    /**
     * <pre>
     * events is the list of transaction event type.
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     */
    public int getEventsCount() {
      return events_.size();
    }
    /**
     * <pre>
     * events is the list of transaction event type.
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     */
    public java.lang.String getEvents(int index) {
      return events_.get(index);
    }
    /**
     * <pre>
     * events is the list of transaction event type.
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEventsBytes(int index) {
      return events_.getByteString(index);
    }
    /**
     * <pre>
     * events is the list of transaction event type.
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     */
    public Builder setEvents(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEventsIsMutable();
      events_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * events is the list of transaction event type.
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     */
    public Builder addEvents(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEventsIsMutable();
      events_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * events is the list of transaction event type.
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     */
    public Builder addAllEvents(
        java.lang.Iterable<java.lang.String> values) {
      ensureEventsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, events_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * events is the list of transaction event type.
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     */
    public Builder clearEvents() {
      events_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * events is the list of transaction event type.
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     */
    public Builder addEventsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureEventsIsMutable();
      events_.add(value);
      onChanged();
      return this;
    }

    private cosmos.base.query.v1beta1.PageRequest pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.query.v1beta1.PageRequest, cosmos.base.query.v1beta1.PageRequest.Builder, cosmos.base.query.v1beta1.PageRequestOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
     */
    public boolean hasPagination() {
      return paginationBuilder_ != null || pagination_ != null;
    }
    /**
     * <pre>
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
     */
    public cosmos.base.query.v1beta1.PageRequest getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
     */
    public Builder setPagination(cosmos.base.query.v1beta1.PageRequest value) {
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
     * <pre>
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
     */
    public Builder setPagination(
        cosmos.base.query.v1beta1.PageRequest.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
        onChanged();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
     */
    public Builder mergePagination(cosmos.base.query.v1beta1.PageRequest value) {
      if (paginationBuilder_ == null) {
        if (pagination_ != null) {
          pagination_ =
            cosmos.base.query.v1beta1.PageRequest.newBuilder(pagination_).mergeFrom(value).buildPartial();
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
     * <pre>
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
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
     * <pre>
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
     */
    public cosmos.base.query.v1beta1.PageRequest.Builder getPaginationBuilder() {
      
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
     */
    public cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.query.v1beta1.PageRequest, cosmos.base.query.v1beta1.PageRequest.Builder, cosmos.base.query.v1beta1.PageRequestOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.base.query.v1beta1.PageRequest, cosmos.base.query.v1beta1.PageRequest.Builder, cosmos.base.query.v1beta1.PageRequestOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
    }

    private int orderBy_ = 0;
    /**
     * <code>.cosmos.tx.v1beta1.OrderBy order_by = 3;</code>
     */
    public int getOrderByValue() {
      return orderBy_;
    }
    /**
     * <code>.cosmos.tx.v1beta1.OrderBy order_by = 3;</code>
     */
    public Builder setOrderByValue(int value) {
      orderBy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.tx.v1beta1.OrderBy order_by = 3;</code>
     */
    public cosmos.tx.v1beta1.OrderBy getOrderBy() {
      @SuppressWarnings("deprecation")
      cosmos.tx.v1beta1.OrderBy result = cosmos.tx.v1beta1.OrderBy.valueOf(orderBy_);
      return result == null ? cosmos.tx.v1beta1.OrderBy.UNRECOGNIZED : result;
    }
    /**
     * <code>.cosmos.tx.v1beta1.OrderBy order_by = 3;</code>
     */
    public Builder setOrderBy(cosmos.tx.v1beta1.OrderBy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      orderBy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.tx.v1beta1.OrderBy order_by = 3;</code>
     */
    public Builder clearOrderBy() {
      
      orderBy_ = 0;
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


    // @@protoc_insertion_point(builder_scope:cosmos.tx.v1beta1.GetTxsEventRequest)
  }

  // @@protoc_insertion_point(class_scope:cosmos.tx.v1beta1.GetTxsEventRequest)
  private static final cosmos.tx.v1beta1.GetTxsEventRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.tx.v1beta1.GetTxsEventRequest();
  }

  public static cosmos.tx.v1beta1.GetTxsEventRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTxsEventRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetTxsEventRequest>() {
    @java.lang.Override
    public GetTxsEventRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTxsEventRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTxsEventRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTxsEventRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.tx.v1beta1.GetTxsEventRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

