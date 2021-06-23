// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/upgrade/v1beta1/query.proto

package cosmos.upgrade.v1beta1;

/**
 * <pre>
 * QueryAppliedPlanResponse is the response type for the Query/AppliedPlan RPC
 * method.
 * </pre>
 *
 * Protobuf type {@code cosmos.upgrade.v1beta1.QueryAppliedPlanResponse}
 */
public  final class QueryAppliedPlanResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.upgrade.v1beta1.QueryAppliedPlanResponse)
    QueryAppliedPlanResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAppliedPlanResponse.newBuilder() to construct.
  private QueryAppliedPlanResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAppliedPlanResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryAppliedPlanResponse(
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

            height_ = input.readInt64();
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
    return cosmos.upgrade.v1beta1.QueryOuterClass.internal_static_cosmos_upgrade_v1beta1_QueryAppliedPlanResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.upgrade.v1beta1.QueryOuterClass.internal_static_cosmos_upgrade_v1beta1_QueryAppliedPlanResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.upgrade.v1beta1.QueryAppliedPlanResponse.class, cosmos.upgrade.v1beta1.QueryAppliedPlanResponse.Builder.class);
  }

  public static final int HEIGHT_FIELD_NUMBER = 1;
  private long height_;
  /**
   * <pre>
   * height is the block height at which the plan was applied.
   * </pre>
   *
   * <code>int64 height = 1;</code>
   */
  public long getHeight() {
    return height_;
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
    if (height_ != 0L) {
      output.writeInt64(1, height_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, height_);
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
    if (!(obj instanceof cosmos.upgrade.v1beta1.QueryAppliedPlanResponse)) {
      return super.equals(obj);
    }
    cosmos.upgrade.v1beta1.QueryAppliedPlanResponse other = (cosmos.upgrade.v1beta1.QueryAppliedPlanResponse) obj;

    if (getHeight()
        != other.getHeight()) return false;
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
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.upgrade.v1beta1.QueryAppliedPlanResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.upgrade.v1beta1.QueryAppliedPlanResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.upgrade.v1beta1.QueryAppliedPlanResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.upgrade.v1beta1.QueryAppliedPlanResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.upgrade.v1beta1.QueryAppliedPlanResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.upgrade.v1beta1.QueryAppliedPlanResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.upgrade.v1beta1.QueryAppliedPlanResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.upgrade.v1beta1.QueryAppliedPlanResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.upgrade.v1beta1.QueryAppliedPlanResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.upgrade.v1beta1.QueryAppliedPlanResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.upgrade.v1beta1.QueryAppliedPlanResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.upgrade.v1beta1.QueryAppliedPlanResponse parseFrom(
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
  public static Builder newBuilder(cosmos.upgrade.v1beta1.QueryAppliedPlanResponse prototype) {
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
   * QueryAppliedPlanResponse is the response type for the Query/AppliedPlan RPC
   * method.
   * </pre>
   *
   * Protobuf type {@code cosmos.upgrade.v1beta1.QueryAppliedPlanResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.upgrade.v1beta1.QueryAppliedPlanResponse)
      cosmos.upgrade.v1beta1.QueryAppliedPlanResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.upgrade.v1beta1.QueryOuterClass.internal_static_cosmos_upgrade_v1beta1_QueryAppliedPlanResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.upgrade.v1beta1.QueryOuterClass.internal_static_cosmos_upgrade_v1beta1_QueryAppliedPlanResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.upgrade.v1beta1.QueryAppliedPlanResponse.class, cosmos.upgrade.v1beta1.QueryAppliedPlanResponse.Builder.class);
    }

    // Construct using cosmos.upgrade.v1beta1.QueryAppliedPlanResponse.newBuilder()
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
      height_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.upgrade.v1beta1.QueryOuterClass.internal_static_cosmos_upgrade_v1beta1_QueryAppliedPlanResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.upgrade.v1beta1.QueryAppliedPlanResponse getDefaultInstanceForType() {
      return cosmos.upgrade.v1beta1.QueryAppliedPlanResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.upgrade.v1beta1.QueryAppliedPlanResponse build() {
      cosmos.upgrade.v1beta1.QueryAppliedPlanResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.upgrade.v1beta1.QueryAppliedPlanResponse buildPartial() {
      cosmos.upgrade.v1beta1.QueryAppliedPlanResponse result = new cosmos.upgrade.v1beta1.QueryAppliedPlanResponse(this);
      result.height_ = height_;
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
      if (other instanceof cosmos.upgrade.v1beta1.QueryAppliedPlanResponse) {
        return mergeFrom((cosmos.upgrade.v1beta1.QueryAppliedPlanResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.upgrade.v1beta1.QueryAppliedPlanResponse other) {
      if (other == cosmos.upgrade.v1beta1.QueryAppliedPlanResponse.getDefaultInstance()) return this;
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
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
      cosmos.upgrade.v1beta1.QueryAppliedPlanResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.upgrade.v1beta1.QueryAppliedPlanResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long height_ ;
    /**
     * <pre>
     * height is the block height at which the plan was applied.
     * </pre>
     *
     * <code>int64 height = 1;</code>
     */
    public long getHeight() {
      return height_;
    }
    /**
     * <pre>
     * height is the block height at which the plan was applied.
     * </pre>
     *
     * <code>int64 height = 1;</code>
     */
    public Builder setHeight(long value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * height is the block height at which the plan was applied.
     * </pre>
     *
     * <code>int64 height = 1;</code>
     */
    public Builder clearHeight() {
      
      height_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:cosmos.upgrade.v1beta1.QueryAppliedPlanResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.upgrade.v1beta1.QueryAppliedPlanResponse)
  private static final cosmos.upgrade.v1beta1.QueryAppliedPlanResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.upgrade.v1beta1.QueryAppliedPlanResponse();
  }

  public static cosmos.upgrade.v1beta1.QueryAppliedPlanResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAppliedPlanResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryAppliedPlanResponse>() {
    @java.lang.Override
    public QueryAppliedPlanResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryAppliedPlanResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryAppliedPlanResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAppliedPlanResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.upgrade.v1beta1.QueryAppliedPlanResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
