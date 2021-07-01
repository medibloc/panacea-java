// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/tendermint/v1beta1/query.proto

package cosmos.base.tendermint.v1beta1;

/**
 * <pre>
 * GetSyncingResponse is the response type for the Query/GetSyncing RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.base.tendermint.v1beta1.GetSyncingResponse}
 */
public  final class GetSyncingResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.base.tendermint.v1beta1.GetSyncingResponse)
    GetSyncingResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSyncingResponse.newBuilder() to construct.
  private GetSyncingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSyncingResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetSyncingResponse(
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

            syncing_ = input.readBool();
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
    return cosmos.base.tendermint.v1beta1.Query.internal_static_cosmos_base_tendermint_v1beta1_GetSyncingResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.base.tendermint.v1beta1.Query.internal_static_cosmos_base_tendermint_v1beta1_GetSyncingResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.base.tendermint.v1beta1.GetSyncingResponse.class, cosmos.base.tendermint.v1beta1.GetSyncingResponse.Builder.class);
  }

  public static final int SYNCING_FIELD_NUMBER = 1;
  private boolean syncing_;
  /**
   * <code>bool syncing = 1;</code>
   */
  public boolean getSyncing() {
    return syncing_;
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
    if (syncing_ != false) {
      output.writeBool(1, syncing_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (syncing_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, syncing_);
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
    if (!(obj instanceof cosmos.base.tendermint.v1beta1.GetSyncingResponse)) {
      return super.equals(obj);
    }
    cosmos.base.tendermint.v1beta1.GetSyncingResponse other = (cosmos.base.tendermint.v1beta1.GetSyncingResponse) obj;

    if (getSyncing()
        != other.getSyncing()) return false;
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
    hash = (37 * hash) + SYNCING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSyncing());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.base.tendermint.v1beta1.GetSyncingResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.tendermint.v1beta1.GetSyncingResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.tendermint.v1beta1.GetSyncingResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.tendermint.v1beta1.GetSyncingResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.tendermint.v1beta1.GetSyncingResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.tendermint.v1beta1.GetSyncingResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.tendermint.v1beta1.GetSyncingResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.base.tendermint.v1beta1.GetSyncingResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.base.tendermint.v1beta1.GetSyncingResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.base.tendermint.v1beta1.GetSyncingResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.base.tendermint.v1beta1.GetSyncingResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.base.tendermint.v1beta1.GetSyncingResponse parseFrom(
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
  public static Builder newBuilder(cosmos.base.tendermint.v1beta1.GetSyncingResponse prototype) {
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
   * GetSyncingResponse is the response type for the Query/GetSyncing RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.base.tendermint.v1beta1.GetSyncingResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.base.tendermint.v1beta1.GetSyncingResponse)
      cosmos.base.tendermint.v1beta1.GetSyncingResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.base.tendermint.v1beta1.Query.internal_static_cosmos_base_tendermint_v1beta1_GetSyncingResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.base.tendermint.v1beta1.Query.internal_static_cosmos_base_tendermint_v1beta1_GetSyncingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.base.tendermint.v1beta1.GetSyncingResponse.class, cosmos.base.tendermint.v1beta1.GetSyncingResponse.Builder.class);
    }

    // Construct using cosmos.base.tendermint.v1beta1.GetSyncingResponse.newBuilder()
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
      syncing_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.base.tendermint.v1beta1.Query.internal_static_cosmos_base_tendermint_v1beta1_GetSyncingResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.base.tendermint.v1beta1.GetSyncingResponse getDefaultInstanceForType() {
      return cosmos.base.tendermint.v1beta1.GetSyncingResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.base.tendermint.v1beta1.GetSyncingResponse build() {
      cosmos.base.tendermint.v1beta1.GetSyncingResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.base.tendermint.v1beta1.GetSyncingResponse buildPartial() {
      cosmos.base.tendermint.v1beta1.GetSyncingResponse result = new cosmos.base.tendermint.v1beta1.GetSyncingResponse(this);
      result.syncing_ = syncing_;
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
      if (other instanceof cosmos.base.tendermint.v1beta1.GetSyncingResponse) {
        return mergeFrom((cosmos.base.tendermint.v1beta1.GetSyncingResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.base.tendermint.v1beta1.GetSyncingResponse other) {
      if (other == cosmos.base.tendermint.v1beta1.GetSyncingResponse.getDefaultInstance()) return this;
      if (other.getSyncing() != false) {
        setSyncing(other.getSyncing());
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
      cosmos.base.tendermint.v1beta1.GetSyncingResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.base.tendermint.v1beta1.GetSyncingResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean syncing_ ;
    /**
     * <code>bool syncing = 1;</code>
     */
    public boolean getSyncing() {
      return syncing_;
    }
    /**
     * <code>bool syncing = 1;</code>
     */
    public Builder setSyncing(boolean value) {
      
      syncing_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool syncing = 1;</code>
     */
    public Builder clearSyncing() {
      
      syncing_ = false;
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


    // @@protoc_insertion_point(builder_scope:cosmos.base.tendermint.v1beta1.GetSyncingResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.base.tendermint.v1beta1.GetSyncingResponse)
  private static final cosmos.base.tendermint.v1beta1.GetSyncingResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.base.tendermint.v1beta1.GetSyncingResponse();
  }

  public static cosmos.base.tendermint.v1beta1.GetSyncingResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSyncingResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetSyncingResponse>() {
    @java.lang.Override
    public GetSyncingResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetSyncingResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetSyncingResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSyncingResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.base.tendermint.v1beta1.GetSyncingResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

