// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package cosmos.gov.v1beta1;

/**
 * <pre>
 * QueryDepositResponse is the response type for the Query/Deposit RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.gov.v1beta1.QueryDepositResponse}
 */
public  final class QueryDepositResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.gov.v1beta1.QueryDepositResponse)
    QueryDepositResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDepositResponse.newBuilder() to construct.
  private QueryDepositResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDepositResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryDepositResponse(
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
            cosmos.gov.v1beta1.Deposit.Builder subBuilder = null;
            if (deposit_ != null) {
              subBuilder = deposit_.toBuilder();
            }
            deposit_ = input.readMessage(cosmos.gov.v1beta1.Deposit.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(deposit_);
              deposit_ = subBuilder.buildPartial();
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
    return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryDepositResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryDepositResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.gov.v1beta1.QueryDepositResponse.class, cosmos.gov.v1beta1.QueryDepositResponse.Builder.class);
  }

  public static final int DEPOSIT_FIELD_NUMBER = 1;
  private cosmos.gov.v1beta1.Deposit deposit_;
  /**
   * <pre>
   * deposit defines the requested deposit.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasDeposit() {
    return deposit_ != null;
  }
  /**
   * <pre>
   * deposit defines the requested deposit.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.gov.v1beta1.Deposit getDeposit() {
    return deposit_ == null ? cosmos.gov.v1beta1.Deposit.getDefaultInstance() : deposit_;
  }
  /**
   * <pre>
   * deposit defines the requested deposit.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.gov.v1beta1.DepositOrBuilder getDepositOrBuilder() {
    return getDeposit();
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
    if (deposit_ != null) {
      output.writeMessage(1, getDeposit());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deposit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDeposit());
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
    if (!(obj instanceof cosmos.gov.v1beta1.QueryDepositResponse)) {
      return super.equals(obj);
    }
    cosmos.gov.v1beta1.QueryDepositResponse other = (cosmos.gov.v1beta1.QueryDepositResponse) obj;

    if (hasDeposit() != other.hasDeposit()) return false;
    if (hasDeposit()) {
      if (!getDeposit()
          .equals(other.getDeposit())) return false;
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
    if (hasDeposit()) {
      hash = (37 * hash) + DEPOSIT_FIELD_NUMBER;
      hash = (53 * hash) + getDeposit().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.gov.v1beta1.QueryDepositResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.gov.v1beta1.QueryDepositResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryDepositResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.gov.v1beta1.QueryDepositResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryDepositResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.gov.v1beta1.QueryDepositResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryDepositResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.gov.v1beta1.QueryDepositResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryDepositResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.gov.v1beta1.QueryDepositResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryDepositResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.gov.v1beta1.QueryDepositResponse parseFrom(
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
  public static Builder newBuilder(cosmos.gov.v1beta1.QueryDepositResponse prototype) {
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
   * QueryDepositResponse is the response type for the Query/Deposit RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.gov.v1beta1.QueryDepositResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.gov.v1beta1.QueryDepositResponse)
      cosmos.gov.v1beta1.QueryDepositResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryDepositResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryDepositResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.gov.v1beta1.QueryDepositResponse.class, cosmos.gov.v1beta1.QueryDepositResponse.Builder.class);
    }

    // Construct using cosmos.gov.v1beta1.QueryDepositResponse.newBuilder()
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
      if (depositBuilder_ == null) {
        deposit_ = null;
      } else {
        deposit_ = null;
        depositBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryDepositResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.gov.v1beta1.QueryDepositResponse getDefaultInstanceForType() {
      return cosmos.gov.v1beta1.QueryDepositResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.gov.v1beta1.QueryDepositResponse build() {
      cosmos.gov.v1beta1.QueryDepositResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.gov.v1beta1.QueryDepositResponse buildPartial() {
      cosmos.gov.v1beta1.QueryDepositResponse result = new cosmos.gov.v1beta1.QueryDepositResponse(this);
      if (depositBuilder_ == null) {
        result.deposit_ = deposit_;
      } else {
        result.deposit_ = depositBuilder_.build();
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
      if (other instanceof cosmos.gov.v1beta1.QueryDepositResponse) {
        return mergeFrom((cosmos.gov.v1beta1.QueryDepositResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.gov.v1beta1.QueryDepositResponse other) {
      if (other == cosmos.gov.v1beta1.QueryDepositResponse.getDefaultInstance()) return this;
      if (other.hasDeposit()) {
        mergeDeposit(other.getDeposit());
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
      cosmos.gov.v1beta1.QueryDepositResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.gov.v1beta1.QueryDepositResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private cosmos.gov.v1beta1.Deposit deposit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.gov.v1beta1.Deposit, cosmos.gov.v1beta1.Deposit.Builder, cosmos.gov.v1beta1.DepositOrBuilder> depositBuilder_;
    /**
     * <pre>
     * deposit defines the requested deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasDeposit() {
      return depositBuilder_ != null || deposit_ != null;
    }
    /**
     * <pre>
     * deposit defines the requested deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.gov.v1beta1.Deposit getDeposit() {
      if (depositBuilder_ == null) {
        return deposit_ == null ? cosmos.gov.v1beta1.Deposit.getDefaultInstance() : deposit_;
      } else {
        return depositBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * deposit defines the requested deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setDeposit(cosmos.gov.v1beta1.Deposit value) {
      if (depositBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deposit_ = value;
        onChanged();
      } else {
        depositBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * deposit defines the requested deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setDeposit(
        cosmos.gov.v1beta1.Deposit.Builder builderForValue) {
      if (depositBuilder_ == null) {
        deposit_ = builderForValue.build();
        onChanged();
      } else {
        depositBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * deposit defines the requested deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeDeposit(cosmos.gov.v1beta1.Deposit value) {
      if (depositBuilder_ == null) {
        if (deposit_ != null) {
          deposit_ =
            cosmos.gov.v1beta1.Deposit.newBuilder(deposit_).mergeFrom(value).buildPartial();
        } else {
          deposit_ = value;
        }
        onChanged();
      } else {
        depositBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * deposit defines the requested deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearDeposit() {
      if (depositBuilder_ == null) {
        deposit_ = null;
        onChanged();
      } else {
        deposit_ = null;
        depositBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * deposit defines the requested deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.gov.v1beta1.Deposit.Builder getDepositBuilder() {
      
      onChanged();
      return getDepositFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * deposit defines the requested deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.gov.v1beta1.DepositOrBuilder getDepositOrBuilder() {
      if (depositBuilder_ != null) {
        return depositBuilder_.getMessageOrBuilder();
      } else {
        return deposit_ == null ?
            cosmos.gov.v1beta1.Deposit.getDefaultInstance() : deposit_;
      }
    }
    /**
     * <pre>
     * deposit defines the requested deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.gov.v1beta1.Deposit, cosmos.gov.v1beta1.Deposit.Builder, cosmos.gov.v1beta1.DepositOrBuilder> 
        getDepositFieldBuilder() {
      if (depositBuilder_ == null) {
        depositBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.gov.v1beta1.Deposit, cosmos.gov.v1beta1.Deposit.Builder, cosmos.gov.v1beta1.DepositOrBuilder>(
                getDeposit(),
                getParentForChildren(),
                isClean());
        deposit_ = null;
      }
      return depositBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.gov.v1beta1.QueryDepositResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.gov.v1beta1.QueryDepositResponse)
  private static final cosmos.gov.v1beta1.QueryDepositResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.gov.v1beta1.QueryDepositResponse();
  }

  public static cosmos.gov.v1beta1.QueryDepositResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDepositResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDepositResponse>() {
    @java.lang.Override
    public QueryDepositResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryDepositResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryDepositResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDepositResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.gov.v1beta1.QueryDepositResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

