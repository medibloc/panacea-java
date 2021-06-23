// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/reflection/v1beta1/reflection.proto

package cosmos.base.reflection.v1beta1;

/**
 * <pre>
 * ListImplementationsRequest is the request type of the ListImplementations
 * RPC.
 * </pre>
 *
 * Protobuf type {@code cosmos.base.reflection.v1beta1.ListImplementationsRequest}
 */
public  final class ListImplementationsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.base.reflection.v1beta1.ListImplementationsRequest)
    ListImplementationsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListImplementationsRequest.newBuilder() to construct.
  private ListImplementationsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListImplementationsRequest() {
    interfaceName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListImplementationsRequest(
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

            interfaceName_ = s;
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
    return cosmos.base.reflection.v1beta1.Reflection.internal_static_cosmos_base_reflection_v1beta1_ListImplementationsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.base.reflection.v1beta1.Reflection.internal_static_cosmos_base_reflection_v1beta1_ListImplementationsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.base.reflection.v1beta1.ListImplementationsRequest.class, cosmos.base.reflection.v1beta1.ListImplementationsRequest.Builder.class);
  }

  public static final int INTERFACE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object interfaceName_;
  /**
   * <pre>
   * interface_name defines the interface to query the implementations for.
   * </pre>
   *
   * <code>string interface_name = 1;</code>
   */
  public java.lang.String getInterfaceName() {
    java.lang.Object ref = interfaceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      interfaceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * interface_name defines the interface to query the implementations for.
   * </pre>
   *
   * <code>string interface_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getInterfaceNameBytes() {
    java.lang.Object ref = interfaceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      interfaceName_ = b;
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
    if (!getInterfaceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, interfaceName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInterfaceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, interfaceName_);
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
    if (!(obj instanceof cosmos.base.reflection.v1beta1.ListImplementationsRequest)) {
      return super.equals(obj);
    }
    cosmos.base.reflection.v1beta1.ListImplementationsRequest other = (cosmos.base.reflection.v1beta1.ListImplementationsRequest) obj;

    if (!getInterfaceName()
        .equals(other.getInterfaceName())) return false;
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
    hash = (37 * hash) + INTERFACE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getInterfaceName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.base.reflection.v1beta1.ListImplementationsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.reflection.v1beta1.ListImplementationsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.reflection.v1beta1.ListImplementationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.reflection.v1beta1.ListImplementationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.reflection.v1beta1.ListImplementationsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.reflection.v1beta1.ListImplementationsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.reflection.v1beta1.ListImplementationsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.base.reflection.v1beta1.ListImplementationsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.base.reflection.v1beta1.ListImplementationsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.base.reflection.v1beta1.ListImplementationsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.base.reflection.v1beta1.ListImplementationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.base.reflection.v1beta1.ListImplementationsRequest parseFrom(
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
  public static Builder newBuilder(cosmos.base.reflection.v1beta1.ListImplementationsRequest prototype) {
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
   * ListImplementationsRequest is the request type of the ListImplementations
   * RPC.
   * </pre>
   *
   * Protobuf type {@code cosmos.base.reflection.v1beta1.ListImplementationsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.base.reflection.v1beta1.ListImplementationsRequest)
      cosmos.base.reflection.v1beta1.ListImplementationsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.base.reflection.v1beta1.Reflection.internal_static_cosmos_base_reflection_v1beta1_ListImplementationsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.base.reflection.v1beta1.Reflection.internal_static_cosmos_base_reflection_v1beta1_ListImplementationsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.base.reflection.v1beta1.ListImplementationsRequest.class, cosmos.base.reflection.v1beta1.ListImplementationsRequest.Builder.class);
    }

    // Construct using cosmos.base.reflection.v1beta1.ListImplementationsRequest.newBuilder()
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
      interfaceName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.base.reflection.v1beta1.Reflection.internal_static_cosmos_base_reflection_v1beta1_ListImplementationsRequest_descriptor;
    }

    @java.lang.Override
    public cosmos.base.reflection.v1beta1.ListImplementationsRequest getDefaultInstanceForType() {
      return cosmos.base.reflection.v1beta1.ListImplementationsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.base.reflection.v1beta1.ListImplementationsRequest build() {
      cosmos.base.reflection.v1beta1.ListImplementationsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.base.reflection.v1beta1.ListImplementationsRequest buildPartial() {
      cosmos.base.reflection.v1beta1.ListImplementationsRequest result = new cosmos.base.reflection.v1beta1.ListImplementationsRequest(this);
      result.interfaceName_ = interfaceName_;
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
      if (other instanceof cosmos.base.reflection.v1beta1.ListImplementationsRequest) {
        return mergeFrom((cosmos.base.reflection.v1beta1.ListImplementationsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.base.reflection.v1beta1.ListImplementationsRequest other) {
      if (other == cosmos.base.reflection.v1beta1.ListImplementationsRequest.getDefaultInstance()) return this;
      if (!other.getInterfaceName().isEmpty()) {
        interfaceName_ = other.interfaceName_;
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
      cosmos.base.reflection.v1beta1.ListImplementationsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.base.reflection.v1beta1.ListImplementationsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object interfaceName_ = "";
    /**
     * <pre>
     * interface_name defines the interface to query the implementations for.
     * </pre>
     *
     * <code>string interface_name = 1;</code>
     */
    public java.lang.String getInterfaceName() {
      java.lang.Object ref = interfaceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        interfaceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * interface_name defines the interface to query the implementations for.
     * </pre>
     *
     * <code>string interface_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getInterfaceNameBytes() {
      java.lang.Object ref = interfaceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        interfaceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * interface_name defines the interface to query the implementations for.
     * </pre>
     *
     * <code>string interface_name = 1;</code>
     */
    public Builder setInterfaceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      interfaceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * interface_name defines the interface to query the implementations for.
     * </pre>
     *
     * <code>string interface_name = 1;</code>
     */
    public Builder clearInterfaceName() {
      
      interfaceName_ = getDefaultInstance().getInterfaceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * interface_name defines the interface to query the implementations for.
     * </pre>
     *
     * <code>string interface_name = 1;</code>
     */
    public Builder setInterfaceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      interfaceName_ = value;
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


    // @@protoc_insertion_point(builder_scope:cosmos.base.reflection.v1beta1.ListImplementationsRequest)
  }

  // @@protoc_insertion_point(class_scope:cosmos.base.reflection.v1beta1.ListImplementationsRequest)
  private static final cosmos.base.reflection.v1beta1.ListImplementationsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.base.reflection.v1beta1.ListImplementationsRequest();
  }

  public static cosmos.base.reflection.v1beta1.ListImplementationsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListImplementationsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListImplementationsRequest>() {
    @java.lang.Override
    public ListImplementationsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListImplementationsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListImplementationsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListImplementationsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.base.reflection.v1beta1.ListImplementationsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
