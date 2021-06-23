// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package cosmos.bank.v1beta1;

/**
 * <pre>
 * QuerySupplyOfRequest is the request type for the Query/SupplyOf RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.bank.v1beta1.QuerySupplyOfRequest}
 */
public  final class QuerySupplyOfRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.bank.v1beta1.QuerySupplyOfRequest)
    QuerySupplyOfRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuerySupplyOfRequest.newBuilder() to construct.
  private QuerySupplyOfRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuerySupplyOfRequest() {
    denom_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QuerySupplyOfRequest(
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

            denom_ = s;
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
    return cosmos.bank.v1beta1.QueryOuterClass.internal_static_cosmos_bank_v1beta1_QuerySupplyOfRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.bank.v1beta1.QueryOuterClass.internal_static_cosmos_bank_v1beta1_QuerySupplyOfRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.bank.v1beta1.QuerySupplyOfRequest.class, cosmos.bank.v1beta1.QuerySupplyOfRequest.Builder.class);
  }

  public static final int DENOM_FIELD_NUMBER = 1;
  private volatile java.lang.Object denom_;
  /**
   * <pre>
   * denom is the coin denom to query balances for.
   * </pre>
   *
   * <code>string denom = 1;</code>
   */
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * denom is the coin denom to query balances for.
   * </pre>
   *
   * <code>string denom = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
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
    if (!getDenomBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denom_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDenomBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, denom_);
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
    if (!(obj instanceof cosmos.bank.v1beta1.QuerySupplyOfRequest)) {
      return super.equals(obj);
    }
    cosmos.bank.v1beta1.QuerySupplyOfRequest other = (cosmos.bank.v1beta1.QuerySupplyOfRequest) obj;

    if (!getDenom()
        .equals(other.getDenom())) return false;
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
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.bank.v1beta1.QuerySupplyOfRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.bank.v1beta1.QuerySupplyOfRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QuerySupplyOfRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.bank.v1beta1.QuerySupplyOfRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QuerySupplyOfRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.bank.v1beta1.QuerySupplyOfRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QuerySupplyOfRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.bank.v1beta1.QuerySupplyOfRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QuerySupplyOfRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.bank.v1beta1.QuerySupplyOfRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QuerySupplyOfRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.bank.v1beta1.QuerySupplyOfRequest parseFrom(
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
  public static Builder newBuilder(cosmos.bank.v1beta1.QuerySupplyOfRequest prototype) {
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
   * QuerySupplyOfRequest is the request type for the Query/SupplyOf RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.bank.v1beta1.QuerySupplyOfRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.bank.v1beta1.QuerySupplyOfRequest)
      cosmos.bank.v1beta1.QuerySupplyOfRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.bank.v1beta1.QueryOuterClass.internal_static_cosmos_bank_v1beta1_QuerySupplyOfRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.bank.v1beta1.QueryOuterClass.internal_static_cosmos_bank_v1beta1_QuerySupplyOfRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.bank.v1beta1.QuerySupplyOfRequest.class, cosmos.bank.v1beta1.QuerySupplyOfRequest.Builder.class);
    }

    // Construct using cosmos.bank.v1beta1.QuerySupplyOfRequest.newBuilder()
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
      denom_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.bank.v1beta1.QueryOuterClass.internal_static_cosmos_bank_v1beta1_QuerySupplyOfRequest_descriptor;
    }

    @java.lang.Override
    public cosmos.bank.v1beta1.QuerySupplyOfRequest getDefaultInstanceForType() {
      return cosmos.bank.v1beta1.QuerySupplyOfRequest.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.bank.v1beta1.QuerySupplyOfRequest build() {
      cosmos.bank.v1beta1.QuerySupplyOfRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.bank.v1beta1.QuerySupplyOfRequest buildPartial() {
      cosmos.bank.v1beta1.QuerySupplyOfRequest result = new cosmos.bank.v1beta1.QuerySupplyOfRequest(this);
      result.denom_ = denom_;
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
      if (other instanceof cosmos.bank.v1beta1.QuerySupplyOfRequest) {
        return mergeFrom((cosmos.bank.v1beta1.QuerySupplyOfRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.bank.v1beta1.QuerySupplyOfRequest other) {
      if (other == cosmos.bank.v1beta1.QuerySupplyOfRequest.getDefaultInstance()) return this;
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
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
      cosmos.bank.v1beta1.QuerySupplyOfRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.bank.v1beta1.QuerySupplyOfRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object denom_ = "";
    /**
     * <pre>
     * denom is the coin denom to query balances for.
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * denom is the coin denom to query balances for.
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * denom is the coin denom to query balances for.
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      denom_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * denom is the coin denom to query balances for.
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    public Builder clearDenom() {
      
      denom_ = getDefaultInstance().getDenom();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * denom is the coin denom to query balances for.
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      denom_ = value;
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


    // @@protoc_insertion_point(builder_scope:cosmos.bank.v1beta1.QuerySupplyOfRequest)
  }

  // @@protoc_insertion_point(class_scope:cosmos.bank.v1beta1.QuerySupplyOfRequest)
  private static final cosmos.bank.v1beta1.QuerySupplyOfRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.bank.v1beta1.QuerySupplyOfRequest();
  }

  public static cosmos.bank.v1beta1.QuerySupplyOfRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuerySupplyOfRequest>
      PARSER = new com.google.protobuf.AbstractParser<QuerySupplyOfRequest>() {
    @java.lang.Override
    public QuerySupplyOfRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QuerySupplyOfRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QuerySupplyOfRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuerySupplyOfRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.bank.v1beta1.QuerySupplyOfRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
