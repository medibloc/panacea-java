// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/tx.proto

package cosmos.distribution.v1beta1;

/**
 * <pre>
 * MsgSetWithdrawAddressResponse defines the Msg/SetWithdrawAddress response type.
 * </pre>
 *
 * Protobuf type {@code cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse}
 */
public  final class MsgSetWithdrawAddressResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse)
    MsgSetWithdrawAddressResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgSetWithdrawAddressResponse.newBuilder() to construct.
  private MsgSetWithdrawAddressResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgSetWithdrawAddressResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgSetWithdrawAddressResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
    return cosmos.distribution.v1beta1.Tx.internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.distribution.v1beta1.Tx.internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse.class, cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse.Builder.class);
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse)) {
      return super.equals(obj);
    }
    cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse other = (cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse parseFrom(
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
  public static Builder newBuilder(cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse prototype) {
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
   * MsgSetWithdrawAddressResponse defines the Msg/SetWithdrawAddress response type.
   * </pre>
   *
   * Protobuf type {@code cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse)
      cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.distribution.v1beta1.Tx.internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.distribution.v1beta1.Tx.internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse.class, cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse.Builder.class);
    }

    // Construct using cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.distribution.v1beta1.Tx.internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse getDefaultInstanceForType() {
      return cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse build() {
      cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse buildPartial() {
      cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse result = new cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse(this);
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
      if (other instanceof cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse) {
        return mergeFrom((cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse other) {
      if (other == cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse.getDefaultInstance()) return this;
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
      cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse)
  private static final cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse();
  }

  public static cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgSetWithdrawAddressResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgSetWithdrawAddressResponse>() {
    @java.lang.Override
    public MsgSetWithdrawAddressResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgSetWithdrawAddressResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgSetWithdrawAddressResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgSetWithdrawAddressResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

