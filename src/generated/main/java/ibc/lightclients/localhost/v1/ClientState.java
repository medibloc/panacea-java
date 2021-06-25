// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/localhost/v1/localhost.proto

package ibc.lightclients.localhost.v1;

/**
 * <pre>
 * ClientState defines a loopback (localhost) client. It requires (read-only)
 * access to keys outside the client prefix.
 * </pre>
 *
 * Protobuf type {@code ibc.lightclients.localhost.v1.ClientState}
 */
public  final class ClientState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.lightclients.localhost.v1.ClientState)
    ClientStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientState.newBuilder() to construct.
  private ClientState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientState() {
    chainId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientState(
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

            chainId_ = s;
            break;
          }
          case 18: {
            ibc.core.client.v1.Height.Builder subBuilder = null;
            if (height_ != null) {
              subBuilder = height_.toBuilder();
            }
            height_ = input.readMessage(ibc.core.client.v1.Height.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(height_);
              height_ = subBuilder.buildPartial();
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
    return ibc.lightclients.localhost.v1.Localhost.internal_static_ibc_lightclients_localhost_v1_ClientState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ibc.lightclients.localhost.v1.Localhost.internal_static_ibc_lightclients_localhost_v1_ClientState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ibc.lightclients.localhost.v1.ClientState.class, ibc.lightclients.localhost.v1.ClientState.Builder.class);
  }

  public static final int CHAIN_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object chainId_;
  /**
   * <pre>
   * self chain ID
   * </pre>
   *
   * <code>string chain_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
   */
  public java.lang.String getChainId() {
    java.lang.Object ref = chainId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      chainId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * self chain ID
   * </pre>
   *
   * <code>string chain_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
   */
  public com.google.protobuf.ByteString
      getChainIdBytes() {
    java.lang.Object ref = chainId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      chainId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private ibc.core.client.v1.Height height_;
  /**
   * <pre>
   * self latest block height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 2 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasHeight() {
    return height_ != null;
  }
  /**
   * <pre>
   * self latest block height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 2 [(.gogoproto.nullable) = false];</code>
   */
  public ibc.core.client.v1.Height getHeight() {
    return height_ == null ? ibc.core.client.v1.Height.getDefaultInstance() : height_;
  }
  /**
   * <pre>
   * self latest block height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 2 [(.gogoproto.nullable) = false];</code>
   */
  public ibc.core.client.v1.HeightOrBuilder getHeightOrBuilder() {
    return getHeight();
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
    if (!getChainIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, chainId_);
    }
    if (height_ != null) {
      output.writeMessage(2, getHeight());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getChainIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, chainId_);
    }
    if (height_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHeight());
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
    if (!(obj instanceof ibc.lightclients.localhost.v1.ClientState)) {
      return super.equals(obj);
    }
    ibc.lightclients.localhost.v1.ClientState other = (ibc.lightclients.localhost.v1.ClientState) obj;

    if (!getChainId()
        .equals(other.getChainId())) return false;
    if (hasHeight() != other.hasHeight()) return false;
    if (hasHeight()) {
      if (!getHeight()
          .equals(other.getHeight())) return false;
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
    hash = (37 * hash) + CHAIN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChainId().hashCode();
    if (hasHeight()) {
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getHeight().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ibc.lightclients.localhost.v1.ClientState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.lightclients.localhost.v1.ClientState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.lightclients.localhost.v1.ClientState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.lightclients.localhost.v1.ClientState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.lightclients.localhost.v1.ClientState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.lightclients.localhost.v1.ClientState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.lightclients.localhost.v1.ClientState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.lightclients.localhost.v1.ClientState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.lightclients.localhost.v1.ClientState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ibc.lightclients.localhost.v1.ClientState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.lightclients.localhost.v1.ClientState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.lightclients.localhost.v1.ClientState parseFrom(
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
  public static Builder newBuilder(ibc.lightclients.localhost.v1.ClientState prototype) {
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
   * ClientState defines a loopback (localhost) client. It requires (read-only)
   * access to keys outside the client prefix.
   * </pre>
   *
   * Protobuf type {@code ibc.lightclients.localhost.v1.ClientState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.lightclients.localhost.v1.ClientState)
      ibc.lightclients.localhost.v1.ClientStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ibc.lightclients.localhost.v1.Localhost.internal_static_ibc_lightclients_localhost_v1_ClientState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ibc.lightclients.localhost.v1.Localhost.internal_static_ibc_lightclients_localhost_v1_ClientState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ibc.lightclients.localhost.v1.ClientState.class, ibc.lightclients.localhost.v1.ClientState.Builder.class);
    }

    // Construct using ibc.lightclients.localhost.v1.ClientState.newBuilder()
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
      chainId_ = "";

      if (heightBuilder_ == null) {
        height_ = null;
      } else {
        height_ = null;
        heightBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ibc.lightclients.localhost.v1.Localhost.internal_static_ibc_lightclients_localhost_v1_ClientState_descriptor;
    }

    @java.lang.Override
    public ibc.lightclients.localhost.v1.ClientState getDefaultInstanceForType() {
      return ibc.lightclients.localhost.v1.ClientState.getDefaultInstance();
    }

    @java.lang.Override
    public ibc.lightclients.localhost.v1.ClientState build() {
      ibc.lightclients.localhost.v1.ClientState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ibc.lightclients.localhost.v1.ClientState buildPartial() {
      ibc.lightclients.localhost.v1.ClientState result = new ibc.lightclients.localhost.v1.ClientState(this);
      result.chainId_ = chainId_;
      if (heightBuilder_ == null) {
        result.height_ = height_;
      } else {
        result.height_ = heightBuilder_.build();
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
      if (other instanceof ibc.lightclients.localhost.v1.ClientState) {
        return mergeFrom((ibc.lightclients.localhost.v1.ClientState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ibc.lightclients.localhost.v1.ClientState other) {
      if (other == ibc.lightclients.localhost.v1.ClientState.getDefaultInstance()) return this;
      if (!other.getChainId().isEmpty()) {
        chainId_ = other.chainId_;
        onChanged();
      }
      if (other.hasHeight()) {
        mergeHeight(other.getHeight());
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
      ibc.lightclients.localhost.v1.ClientState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ibc.lightclients.localhost.v1.ClientState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object chainId_ = "";
    /**
     * <pre>
     * self chain ID
     * </pre>
     *
     * <code>string chain_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
     */
    public java.lang.String getChainId() {
      java.lang.Object ref = chainId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        chainId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * self chain ID
     * </pre>
     *
     * <code>string chain_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
     */
    public com.google.protobuf.ByteString
        getChainIdBytes() {
      java.lang.Object ref = chainId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        chainId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * self chain ID
     * </pre>
     *
     * <code>string chain_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
     */
    public Builder setChainId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      chainId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * self chain ID
     * </pre>
     *
     * <code>string chain_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
     */
    public Builder clearChainId() {
      
      chainId_ = getDefaultInstance().getChainId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * self chain ID
     * </pre>
     *
     * <code>string chain_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
     */
    public Builder setChainIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      chainId_ = value;
      onChanged();
      return this;
    }

    private ibc.core.client.v1.Height height_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.client.v1.Height, ibc.core.client.v1.Height.Builder, ibc.core.client.v1.HeightOrBuilder> heightBuilder_;
    /**
     * <pre>
     * self latest block height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 2 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasHeight() {
      return heightBuilder_ != null || height_ != null;
    }
    /**
     * <pre>
     * self latest block height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 2 [(.gogoproto.nullable) = false];</code>
     */
    public ibc.core.client.v1.Height getHeight() {
      if (heightBuilder_ == null) {
        return height_ == null ? ibc.core.client.v1.Height.getDefaultInstance() : height_;
      } else {
        return heightBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * self latest block height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setHeight(ibc.core.client.v1.Height value) {
      if (heightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        height_ = value;
        onChanged();
      } else {
        heightBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * self latest block height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setHeight(
        ibc.core.client.v1.Height.Builder builderForValue) {
      if (heightBuilder_ == null) {
        height_ = builderForValue.build();
        onChanged();
      } else {
        heightBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * self latest block height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeHeight(ibc.core.client.v1.Height value) {
      if (heightBuilder_ == null) {
        if (height_ != null) {
          height_ =
            ibc.core.client.v1.Height.newBuilder(height_).mergeFrom(value).buildPartial();
        } else {
          height_ = value;
        }
        onChanged();
      } else {
        heightBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * self latest block height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearHeight() {
      if (heightBuilder_ == null) {
        height_ = null;
        onChanged();
      } else {
        height_ = null;
        heightBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * self latest block height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 2 [(.gogoproto.nullable) = false];</code>
     */
    public ibc.core.client.v1.Height.Builder getHeightBuilder() {
      
      onChanged();
      return getHeightFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * self latest block height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 2 [(.gogoproto.nullable) = false];</code>
     */
    public ibc.core.client.v1.HeightOrBuilder getHeightOrBuilder() {
      if (heightBuilder_ != null) {
        return heightBuilder_.getMessageOrBuilder();
      } else {
        return height_ == null ?
            ibc.core.client.v1.Height.getDefaultInstance() : height_;
      }
    }
    /**
     * <pre>
     * self latest block height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 2 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.client.v1.Height, ibc.core.client.v1.Height.Builder, ibc.core.client.v1.HeightOrBuilder> 
        getHeightFieldBuilder() {
      if (heightBuilder_ == null) {
        heightBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ibc.core.client.v1.Height, ibc.core.client.v1.Height.Builder, ibc.core.client.v1.HeightOrBuilder>(
                getHeight(),
                getParentForChildren(),
                isClean());
        height_ = null;
      }
      return heightBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.lightclients.localhost.v1.ClientState)
  }

  // @@protoc_insertion_point(class_scope:ibc.lightclients.localhost.v1.ClientState)
  private static final ibc.lightclients.localhost.v1.ClientState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ibc.lightclients.localhost.v1.ClientState();
  }

  public static ibc.lightclients.localhost.v1.ClientState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientState>
      PARSER = new com.google.protobuf.AbstractParser<ClientState>() {
    @java.lang.Override
    public ClientState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ibc.lightclients.localhost.v1.ClientState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

