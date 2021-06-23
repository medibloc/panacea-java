// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/crisis/v1beta1/tx.proto

package cosmos.crisis.v1beta1;

/**
 * <pre>
 * MsgVerifyInvariantResponse defines the Msg/VerifyInvariant response type.
 * </pre>
 *
 * Protobuf type {@code cosmos.crisis.v1beta1.MsgVerifyInvariantResponse}
 */
public  final class MsgVerifyInvariantResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.crisis.v1beta1.MsgVerifyInvariantResponse)
    MsgVerifyInvariantResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgVerifyInvariantResponse.newBuilder() to construct.
  private MsgVerifyInvariantResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgVerifyInvariantResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgVerifyInvariantResponse(
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
    return cosmos.crisis.v1beta1.Tx.internal_static_cosmos_crisis_v1beta1_MsgVerifyInvariantResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.crisis.v1beta1.Tx.internal_static_cosmos_crisis_v1beta1_MsgVerifyInvariantResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.crisis.v1beta1.MsgVerifyInvariantResponse.class, cosmos.crisis.v1beta1.MsgVerifyInvariantResponse.Builder.class);
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
    if (!(obj instanceof cosmos.crisis.v1beta1.MsgVerifyInvariantResponse)) {
      return super.equals(obj);
    }
    cosmos.crisis.v1beta1.MsgVerifyInvariantResponse other = (cosmos.crisis.v1beta1.MsgVerifyInvariantResponse) obj;

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

  public static cosmos.crisis.v1beta1.MsgVerifyInvariantResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.crisis.v1beta1.MsgVerifyInvariantResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.crisis.v1beta1.MsgVerifyInvariantResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.crisis.v1beta1.MsgVerifyInvariantResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.crisis.v1beta1.MsgVerifyInvariantResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.crisis.v1beta1.MsgVerifyInvariantResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.crisis.v1beta1.MsgVerifyInvariantResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.crisis.v1beta1.MsgVerifyInvariantResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.crisis.v1beta1.MsgVerifyInvariantResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.crisis.v1beta1.MsgVerifyInvariantResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.crisis.v1beta1.MsgVerifyInvariantResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.crisis.v1beta1.MsgVerifyInvariantResponse parseFrom(
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
  public static Builder newBuilder(cosmos.crisis.v1beta1.MsgVerifyInvariantResponse prototype) {
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
   * MsgVerifyInvariantResponse defines the Msg/VerifyInvariant response type.
   * </pre>
   *
   * Protobuf type {@code cosmos.crisis.v1beta1.MsgVerifyInvariantResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.crisis.v1beta1.MsgVerifyInvariantResponse)
      cosmos.crisis.v1beta1.MsgVerifyInvariantResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.crisis.v1beta1.Tx.internal_static_cosmos_crisis_v1beta1_MsgVerifyInvariantResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.crisis.v1beta1.Tx.internal_static_cosmos_crisis_v1beta1_MsgVerifyInvariantResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.crisis.v1beta1.MsgVerifyInvariantResponse.class, cosmos.crisis.v1beta1.MsgVerifyInvariantResponse.Builder.class);
    }

    // Construct using cosmos.crisis.v1beta1.MsgVerifyInvariantResponse.newBuilder()
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
      return cosmos.crisis.v1beta1.Tx.internal_static_cosmos_crisis_v1beta1_MsgVerifyInvariantResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.crisis.v1beta1.MsgVerifyInvariantResponse getDefaultInstanceForType() {
      return cosmos.crisis.v1beta1.MsgVerifyInvariantResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.crisis.v1beta1.MsgVerifyInvariantResponse build() {
      cosmos.crisis.v1beta1.MsgVerifyInvariantResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.crisis.v1beta1.MsgVerifyInvariantResponse buildPartial() {
      cosmos.crisis.v1beta1.MsgVerifyInvariantResponse result = new cosmos.crisis.v1beta1.MsgVerifyInvariantResponse(this);
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
      if (other instanceof cosmos.crisis.v1beta1.MsgVerifyInvariantResponse) {
        return mergeFrom((cosmos.crisis.v1beta1.MsgVerifyInvariantResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.crisis.v1beta1.MsgVerifyInvariantResponse other) {
      if (other == cosmos.crisis.v1beta1.MsgVerifyInvariantResponse.getDefaultInstance()) return this;
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
      cosmos.crisis.v1beta1.MsgVerifyInvariantResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.crisis.v1beta1.MsgVerifyInvariantResponse) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:cosmos.crisis.v1beta1.MsgVerifyInvariantResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.crisis.v1beta1.MsgVerifyInvariantResponse)
  private static final cosmos.crisis.v1beta1.MsgVerifyInvariantResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.crisis.v1beta1.MsgVerifyInvariantResponse();
  }

  public static cosmos.crisis.v1beta1.MsgVerifyInvariantResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgVerifyInvariantResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgVerifyInvariantResponse>() {
    @java.lang.Override
    public MsgVerifyInvariantResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgVerifyInvariantResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgVerifyInvariantResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgVerifyInvariantResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.crisis.v1beta1.MsgVerifyInvariantResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
