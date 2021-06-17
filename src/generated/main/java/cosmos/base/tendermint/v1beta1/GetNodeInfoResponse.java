// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/tendermint/v1beta1/query.proto

package cosmos.base.tendermint.v1beta1;

/**
 * <pre>
 * GetNodeInfoResponse is the request type for the Query/GetNodeInfo RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.base.tendermint.v1beta1.GetNodeInfoResponse}
 */
public  final class GetNodeInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.base.tendermint.v1beta1.GetNodeInfoResponse)
    GetNodeInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetNodeInfoResponse.newBuilder() to construct.
  private GetNodeInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetNodeInfoResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetNodeInfoResponse(
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
            tendermint.p2p.DefaultNodeInfo.Builder subBuilder = null;
            if (defaultNodeInfo_ != null) {
              subBuilder = defaultNodeInfo_.toBuilder();
            }
            defaultNodeInfo_ = input.readMessage(tendermint.p2p.DefaultNodeInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(defaultNodeInfo_);
              defaultNodeInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            cosmos.base.tendermint.v1beta1.VersionInfo.Builder subBuilder = null;
            if (applicationVersion_ != null) {
              subBuilder = applicationVersion_.toBuilder();
            }
            applicationVersion_ = input.readMessage(cosmos.base.tendermint.v1beta1.VersionInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(applicationVersion_);
              applicationVersion_ = subBuilder.buildPartial();
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
    return cosmos.base.tendermint.v1beta1.Query.internal_static_cosmos_base_tendermint_v1beta1_GetNodeInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.base.tendermint.v1beta1.Query.internal_static_cosmos_base_tendermint_v1beta1_GetNodeInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.base.tendermint.v1beta1.GetNodeInfoResponse.class, cosmos.base.tendermint.v1beta1.GetNodeInfoResponse.Builder.class);
  }

  public static final int DEFAULT_NODE_INFO_FIELD_NUMBER = 1;
  private tendermint.p2p.DefaultNodeInfo defaultNodeInfo_;
  /**
   * <code>.tendermint.p2p.DefaultNodeInfo default_node_info = 1;</code>
   */
  public boolean hasDefaultNodeInfo() {
    return defaultNodeInfo_ != null;
  }
  /**
   * <code>.tendermint.p2p.DefaultNodeInfo default_node_info = 1;</code>
   */
  public tendermint.p2p.DefaultNodeInfo getDefaultNodeInfo() {
    return defaultNodeInfo_ == null ? tendermint.p2p.DefaultNodeInfo.getDefaultInstance() : defaultNodeInfo_;
  }
  /**
   * <code>.tendermint.p2p.DefaultNodeInfo default_node_info = 1;</code>
   */
  public tendermint.p2p.DefaultNodeInfoOrBuilder getDefaultNodeInfoOrBuilder() {
    return getDefaultNodeInfo();
  }

  public static final int APPLICATION_VERSION_FIELD_NUMBER = 2;
  private cosmos.base.tendermint.v1beta1.VersionInfo applicationVersion_;
  /**
   * <code>.cosmos.base.tendermint.v1beta1.VersionInfo application_version = 2;</code>
   */
  public boolean hasApplicationVersion() {
    return applicationVersion_ != null;
  }
  /**
   * <code>.cosmos.base.tendermint.v1beta1.VersionInfo application_version = 2;</code>
   */
  public cosmos.base.tendermint.v1beta1.VersionInfo getApplicationVersion() {
    return applicationVersion_ == null ? cosmos.base.tendermint.v1beta1.VersionInfo.getDefaultInstance() : applicationVersion_;
  }
  /**
   * <code>.cosmos.base.tendermint.v1beta1.VersionInfo application_version = 2;</code>
   */
  public cosmos.base.tendermint.v1beta1.VersionInfoOrBuilder getApplicationVersionOrBuilder() {
    return getApplicationVersion();
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
    if (defaultNodeInfo_ != null) {
      output.writeMessage(1, getDefaultNodeInfo());
    }
    if (applicationVersion_ != null) {
      output.writeMessage(2, getApplicationVersion());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (defaultNodeInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDefaultNodeInfo());
    }
    if (applicationVersion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getApplicationVersion());
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
    if (!(obj instanceof cosmos.base.tendermint.v1beta1.GetNodeInfoResponse)) {
      return super.equals(obj);
    }
    cosmos.base.tendermint.v1beta1.GetNodeInfoResponse other = (cosmos.base.tendermint.v1beta1.GetNodeInfoResponse) obj;

    if (hasDefaultNodeInfo() != other.hasDefaultNodeInfo()) return false;
    if (hasDefaultNodeInfo()) {
      if (!getDefaultNodeInfo()
          .equals(other.getDefaultNodeInfo())) return false;
    }
    if (hasApplicationVersion() != other.hasApplicationVersion()) return false;
    if (hasApplicationVersion()) {
      if (!getApplicationVersion()
          .equals(other.getApplicationVersion())) return false;
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
    if (hasDefaultNodeInfo()) {
      hash = (37 * hash) + DEFAULT_NODE_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultNodeInfo().hashCode();
    }
    if (hasApplicationVersion()) {
      hash = (37 * hash) + APPLICATION_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getApplicationVersion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.base.tendermint.v1beta1.GetNodeInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.tendermint.v1beta1.GetNodeInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.tendermint.v1beta1.GetNodeInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.tendermint.v1beta1.GetNodeInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.tendermint.v1beta1.GetNodeInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.tendermint.v1beta1.GetNodeInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.tendermint.v1beta1.GetNodeInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.base.tendermint.v1beta1.GetNodeInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.base.tendermint.v1beta1.GetNodeInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.base.tendermint.v1beta1.GetNodeInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.base.tendermint.v1beta1.GetNodeInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.base.tendermint.v1beta1.GetNodeInfoResponse parseFrom(
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
  public static Builder newBuilder(cosmos.base.tendermint.v1beta1.GetNodeInfoResponse prototype) {
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
   * GetNodeInfoResponse is the request type for the Query/GetNodeInfo RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.base.tendermint.v1beta1.GetNodeInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.base.tendermint.v1beta1.GetNodeInfoResponse)
      cosmos.base.tendermint.v1beta1.GetNodeInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.base.tendermint.v1beta1.Query.internal_static_cosmos_base_tendermint_v1beta1_GetNodeInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.base.tendermint.v1beta1.Query.internal_static_cosmos_base_tendermint_v1beta1_GetNodeInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.base.tendermint.v1beta1.GetNodeInfoResponse.class, cosmos.base.tendermint.v1beta1.GetNodeInfoResponse.Builder.class);
    }

    // Construct using cosmos.base.tendermint.v1beta1.GetNodeInfoResponse.newBuilder()
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
      if (defaultNodeInfoBuilder_ == null) {
        defaultNodeInfo_ = null;
      } else {
        defaultNodeInfo_ = null;
        defaultNodeInfoBuilder_ = null;
      }
      if (applicationVersionBuilder_ == null) {
        applicationVersion_ = null;
      } else {
        applicationVersion_ = null;
        applicationVersionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.base.tendermint.v1beta1.Query.internal_static_cosmos_base_tendermint_v1beta1_GetNodeInfoResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.base.tendermint.v1beta1.GetNodeInfoResponse getDefaultInstanceForType() {
      return cosmos.base.tendermint.v1beta1.GetNodeInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.base.tendermint.v1beta1.GetNodeInfoResponse build() {
      cosmos.base.tendermint.v1beta1.GetNodeInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.base.tendermint.v1beta1.GetNodeInfoResponse buildPartial() {
      cosmos.base.tendermint.v1beta1.GetNodeInfoResponse result = new cosmos.base.tendermint.v1beta1.GetNodeInfoResponse(this);
      if (defaultNodeInfoBuilder_ == null) {
        result.defaultNodeInfo_ = defaultNodeInfo_;
      } else {
        result.defaultNodeInfo_ = defaultNodeInfoBuilder_.build();
      }
      if (applicationVersionBuilder_ == null) {
        result.applicationVersion_ = applicationVersion_;
      } else {
        result.applicationVersion_ = applicationVersionBuilder_.build();
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
      if (other instanceof cosmos.base.tendermint.v1beta1.GetNodeInfoResponse) {
        return mergeFrom((cosmos.base.tendermint.v1beta1.GetNodeInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.base.tendermint.v1beta1.GetNodeInfoResponse other) {
      if (other == cosmos.base.tendermint.v1beta1.GetNodeInfoResponse.getDefaultInstance()) return this;
      if (other.hasDefaultNodeInfo()) {
        mergeDefaultNodeInfo(other.getDefaultNodeInfo());
      }
      if (other.hasApplicationVersion()) {
        mergeApplicationVersion(other.getApplicationVersion());
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
      cosmos.base.tendermint.v1beta1.GetNodeInfoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.base.tendermint.v1beta1.GetNodeInfoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private tendermint.p2p.DefaultNodeInfo defaultNodeInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        tendermint.p2p.DefaultNodeInfo, tendermint.p2p.DefaultNodeInfo.Builder, tendermint.p2p.DefaultNodeInfoOrBuilder> defaultNodeInfoBuilder_;
    /**
     * <code>.tendermint.p2p.DefaultNodeInfo default_node_info = 1;</code>
     */
    public boolean hasDefaultNodeInfo() {
      return defaultNodeInfoBuilder_ != null || defaultNodeInfo_ != null;
    }
    /**
     * <code>.tendermint.p2p.DefaultNodeInfo default_node_info = 1;</code>
     */
    public tendermint.p2p.DefaultNodeInfo getDefaultNodeInfo() {
      if (defaultNodeInfoBuilder_ == null) {
        return defaultNodeInfo_ == null ? tendermint.p2p.DefaultNodeInfo.getDefaultInstance() : defaultNodeInfo_;
      } else {
        return defaultNodeInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.p2p.DefaultNodeInfo default_node_info = 1;</code>
     */
    public Builder setDefaultNodeInfo(tendermint.p2p.DefaultNodeInfo value) {
      if (defaultNodeInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        defaultNodeInfo_ = value;
        onChanged();
      } else {
        defaultNodeInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tendermint.p2p.DefaultNodeInfo default_node_info = 1;</code>
     */
    public Builder setDefaultNodeInfo(
        tendermint.p2p.DefaultNodeInfo.Builder builderForValue) {
      if (defaultNodeInfoBuilder_ == null) {
        defaultNodeInfo_ = builderForValue.build();
        onChanged();
      } else {
        defaultNodeInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tendermint.p2p.DefaultNodeInfo default_node_info = 1;</code>
     */
    public Builder mergeDefaultNodeInfo(tendermint.p2p.DefaultNodeInfo value) {
      if (defaultNodeInfoBuilder_ == null) {
        if (defaultNodeInfo_ != null) {
          defaultNodeInfo_ =
            tendermint.p2p.DefaultNodeInfo.newBuilder(defaultNodeInfo_).mergeFrom(value).buildPartial();
        } else {
          defaultNodeInfo_ = value;
        }
        onChanged();
      } else {
        defaultNodeInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tendermint.p2p.DefaultNodeInfo default_node_info = 1;</code>
     */
    public Builder clearDefaultNodeInfo() {
      if (defaultNodeInfoBuilder_ == null) {
        defaultNodeInfo_ = null;
        onChanged();
      } else {
        defaultNodeInfo_ = null;
        defaultNodeInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tendermint.p2p.DefaultNodeInfo default_node_info = 1;</code>
     */
    public tendermint.p2p.DefaultNodeInfo.Builder getDefaultNodeInfoBuilder() {
      
      onChanged();
      return getDefaultNodeInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.p2p.DefaultNodeInfo default_node_info = 1;</code>
     */
    public tendermint.p2p.DefaultNodeInfoOrBuilder getDefaultNodeInfoOrBuilder() {
      if (defaultNodeInfoBuilder_ != null) {
        return defaultNodeInfoBuilder_.getMessageOrBuilder();
      } else {
        return defaultNodeInfo_ == null ?
            tendermint.p2p.DefaultNodeInfo.getDefaultInstance() : defaultNodeInfo_;
      }
    }
    /**
     * <code>.tendermint.p2p.DefaultNodeInfo default_node_info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tendermint.p2p.DefaultNodeInfo, tendermint.p2p.DefaultNodeInfo.Builder, tendermint.p2p.DefaultNodeInfoOrBuilder> 
        getDefaultNodeInfoFieldBuilder() {
      if (defaultNodeInfoBuilder_ == null) {
        defaultNodeInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tendermint.p2p.DefaultNodeInfo, tendermint.p2p.DefaultNodeInfo.Builder, tendermint.p2p.DefaultNodeInfoOrBuilder>(
                getDefaultNodeInfo(),
                getParentForChildren(),
                isClean());
        defaultNodeInfo_ = null;
      }
      return defaultNodeInfoBuilder_;
    }

    private cosmos.base.tendermint.v1beta1.VersionInfo applicationVersion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.tendermint.v1beta1.VersionInfo, cosmos.base.tendermint.v1beta1.VersionInfo.Builder, cosmos.base.tendermint.v1beta1.VersionInfoOrBuilder> applicationVersionBuilder_;
    /**
     * <code>.cosmos.base.tendermint.v1beta1.VersionInfo application_version = 2;</code>
     */
    public boolean hasApplicationVersion() {
      return applicationVersionBuilder_ != null || applicationVersion_ != null;
    }
    /**
     * <code>.cosmos.base.tendermint.v1beta1.VersionInfo application_version = 2;</code>
     */
    public cosmos.base.tendermint.v1beta1.VersionInfo getApplicationVersion() {
      if (applicationVersionBuilder_ == null) {
        return applicationVersion_ == null ? cosmos.base.tendermint.v1beta1.VersionInfo.getDefaultInstance() : applicationVersion_;
      } else {
        return applicationVersionBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.tendermint.v1beta1.VersionInfo application_version = 2;</code>
     */
    public Builder setApplicationVersion(cosmos.base.tendermint.v1beta1.VersionInfo value) {
      if (applicationVersionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        applicationVersion_ = value;
        onChanged();
      } else {
        applicationVersionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.base.tendermint.v1beta1.VersionInfo application_version = 2;</code>
     */
    public Builder setApplicationVersion(
        cosmos.base.tendermint.v1beta1.VersionInfo.Builder builderForValue) {
      if (applicationVersionBuilder_ == null) {
        applicationVersion_ = builderForValue.build();
        onChanged();
      } else {
        applicationVersionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cosmos.base.tendermint.v1beta1.VersionInfo application_version = 2;</code>
     */
    public Builder mergeApplicationVersion(cosmos.base.tendermint.v1beta1.VersionInfo value) {
      if (applicationVersionBuilder_ == null) {
        if (applicationVersion_ != null) {
          applicationVersion_ =
            cosmos.base.tendermint.v1beta1.VersionInfo.newBuilder(applicationVersion_).mergeFrom(value).buildPartial();
        } else {
          applicationVersion_ = value;
        }
        onChanged();
      } else {
        applicationVersionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.base.tendermint.v1beta1.VersionInfo application_version = 2;</code>
     */
    public Builder clearApplicationVersion() {
      if (applicationVersionBuilder_ == null) {
        applicationVersion_ = null;
        onChanged();
      } else {
        applicationVersion_ = null;
        applicationVersionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cosmos.base.tendermint.v1beta1.VersionInfo application_version = 2;</code>
     */
    public cosmos.base.tendermint.v1beta1.VersionInfo.Builder getApplicationVersionBuilder() {
      
      onChanged();
      return getApplicationVersionFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.tendermint.v1beta1.VersionInfo application_version = 2;</code>
     */
    public cosmos.base.tendermint.v1beta1.VersionInfoOrBuilder getApplicationVersionOrBuilder() {
      if (applicationVersionBuilder_ != null) {
        return applicationVersionBuilder_.getMessageOrBuilder();
      } else {
        return applicationVersion_ == null ?
            cosmos.base.tendermint.v1beta1.VersionInfo.getDefaultInstance() : applicationVersion_;
      }
    }
    /**
     * <code>.cosmos.base.tendermint.v1beta1.VersionInfo application_version = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.tendermint.v1beta1.VersionInfo, cosmos.base.tendermint.v1beta1.VersionInfo.Builder, cosmos.base.tendermint.v1beta1.VersionInfoOrBuilder> 
        getApplicationVersionFieldBuilder() {
      if (applicationVersionBuilder_ == null) {
        applicationVersionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.base.tendermint.v1beta1.VersionInfo, cosmos.base.tendermint.v1beta1.VersionInfo.Builder, cosmos.base.tendermint.v1beta1.VersionInfoOrBuilder>(
                getApplicationVersion(),
                getParentForChildren(),
                isClean());
        applicationVersion_ = null;
      }
      return applicationVersionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.base.tendermint.v1beta1.GetNodeInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.base.tendermint.v1beta1.GetNodeInfoResponse)
  private static final cosmos.base.tendermint.v1beta1.GetNodeInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.base.tendermint.v1beta1.GetNodeInfoResponse();
  }

  public static cosmos.base.tendermint.v1beta1.GetNodeInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNodeInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetNodeInfoResponse>() {
    @java.lang.Override
    public GetNodeInfoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetNodeInfoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetNodeInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNodeInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.base.tendermint.v1beta1.GetNodeInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

