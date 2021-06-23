// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v1/solomachine.proto

package ibc.lightclients.solomachine.v1;

/**
 * <pre>
 * ChannelStateData returns the SignBytes data for channel state
 * verification.
 * </pre>
 *
 * Protobuf type {@code ibc.lightclients.solomachine.v1.ChannelStateData}
 */
public  final class ChannelStateData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.lightclients.solomachine.v1.ChannelStateData)
    ChannelStateDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChannelStateData.newBuilder() to construct.
  private ChannelStateData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChannelStateData() {
    path_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChannelStateData(
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

            path_ = input.readBytes();
            break;
          }
          case 18: {
            ibc.core.channel.v1.Channel.Builder subBuilder = null;
            if (channel_ != null) {
              subBuilder = channel_.toBuilder();
            }
            channel_ = input.readMessage(ibc.core.channel.v1.Channel.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(channel_);
              channel_ = subBuilder.buildPartial();
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
    return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_ChannelStateData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_ChannelStateData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ibc.lightclients.solomachine.v1.ChannelStateData.class, ibc.lightclients.solomachine.v1.ChannelStateData.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString path_;
  /**
   * <code>bytes path = 1;</code>
   */
  public com.google.protobuf.ByteString getPath() {
    return path_;
  }

  public static final int CHANNEL_FIELD_NUMBER = 2;
  private ibc.core.channel.v1.Channel channel_;
  /**
   * <code>.ibc.core.channel.v1.Channel channel = 2;</code>
   */
  public boolean hasChannel() {
    return channel_ != null;
  }
  /**
   * <code>.ibc.core.channel.v1.Channel channel = 2;</code>
   */
  public ibc.core.channel.v1.Channel getChannel() {
    return channel_ == null ? ibc.core.channel.v1.Channel.getDefaultInstance() : channel_;
  }
  /**
   * <code>.ibc.core.channel.v1.Channel channel = 2;</code>
   */
  public ibc.core.channel.v1.ChannelOrBuilder getChannelOrBuilder() {
    return getChannel();
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
    if (!path_.isEmpty()) {
      output.writeBytes(1, path_);
    }
    if (channel_ != null) {
      output.writeMessage(2, getChannel());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!path_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, path_);
    }
    if (channel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getChannel());
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
    if (!(obj instanceof ibc.lightclients.solomachine.v1.ChannelStateData)) {
      return super.equals(obj);
    }
    ibc.lightclients.solomachine.v1.ChannelStateData other = (ibc.lightclients.solomachine.v1.ChannelStateData) obj;

    if (!getPath()
        .equals(other.getPath())) return false;
    if (hasChannel() != other.hasChannel()) return false;
    if (hasChannel()) {
      if (!getChannel()
          .equals(other.getChannel())) return false;
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
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    if (hasChannel()) {
      hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
      hash = (53 * hash) + getChannel().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ibc.lightclients.solomachine.v1.ChannelStateData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.lightclients.solomachine.v1.ChannelStateData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.ChannelStateData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.lightclients.solomachine.v1.ChannelStateData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.ChannelStateData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.lightclients.solomachine.v1.ChannelStateData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.ChannelStateData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.lightclients.solomachine.v1.ChannelStateData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.ChannelStateData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ibc.lightclients.solomachine.v1.ChannelStateData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.ChannelStateData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.lightclients.solomachine.v1.ChannelStateData parseFrom(
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
  public static Builder newBuilder(ibc.lightclients.solomachine.v1.ChannelStateData prototype) {
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
   * ChannelStateData returns the SignBytes data for channel state
   * verification.
   * </pre>
   *
   * Protobuf type {@code ibc.lightclients.solomachine.v1.ChannelStateData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.lightclients.solomachine.v1.ChannelStateData)
      ibc.lightclients.solomachine.v1.ChannelStateDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_ChannelStateData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_ChannelStateData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ibc.lightclients.solomachine.v1.ChannelStateData.class, ibc.lightclients.solomachine.v1.ChannelStateData.Builder.class);
    }

    // Construct using ibc.lightclients.solomachine.v1.ChannelStateData.newBuilder()
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
      path_ = com.google.protobuf.ByteString.EMPTY;

      if (channelBuilder_ == null) {
        channel_ = null;
      } else {
        channel_ = null;
        channelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_ChannelStateData_descriptor;
    }

    @java.lang.Override
    public ibc.lightclients.solomachine.v1.ChannelStateData getDefaultInstanceForType() {
      return ibc.lightclients.solomachine.v1.ChannelStateData.getDefaultInstance();
    }

    @java.lang.Override
    public ibc.lightclients.solomachine.v1.ChannelStateData build() {
      ibc.lightclients.solomachine.v1.ChannelStateData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ibc.lightclients.solomachine.v1.ChannelStateData buildPartial() {
      ibc.lightclients.solomachine.v1.ChannelStateData result = new ibc.lightclients.solomachine.v1.ChannelStateData(this);
      result.path_ = path_;
      if (channelBuilder_ == null) {
        result.channel_ = channel_;
      } else {
        result.channel_ = channelBuilder_.build();
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
      if (other instanceof ibc.lightclients.solomachine.v1.ChannelStateData) {
        return mergeFrom((ibc.lightclients.solomachine.v1.ChannelStateData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ibc.lightclients.solomachine.v1.ChannelStateData other) {
      if (other == ibc.lightclients.solomachine.v1.ChannelStateData.getDefaultInstance()) return this;
      if (other.getPath() != com.google.protobuf.ByteString.EMPTY) {
        setPath(other.getPath());
      }
      if (other.hasChannel()) {
        mergeChannel(other.getChannel());
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
      ibc.lightclients.solomachine.v1.ChannelStateData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ibc.lightclients.solomachine.v1.ChannelStateData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString path_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes path = 1;</code>
     */
    public com.google.protobuf.ByteString getPath() {
      return path_;
    }
    /**
     * <code>bytes path = 1;</code>
     */
    public Builder setPath(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes path = 1;</code>
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }

    private ibc.core.channel.v1.Channel channel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.channel.v1.Channel, ibc.core.channel.v1.Channel.Builder, ibc.core.channel.v1.ChannelOrBuilder> channelBuilder_;
    /**
     * <code>.ibc.core.channel.v1.Channel channel = 2;</code>
     */
    public boolean hasChannel() {
      return channelBuilder_ != null || channel_ != null;
    }
    /**
     * <code>.ibc.core.channel.v1.Channel channel = 2;</code>
     */
    public ibc.core.channel.v1.Channel getChannel() {
      if (channelBuilder_ == null) {
        return channel_ == null ? ibc.core.channel.v1.Channel.getDefaultInstance() : channel_;
      } else {
        return channelBuilder_.getMessage();
      }
    }
    /**
     * <code>.ibc.core.channel.v1.Channel channel = 2;</code>
     */
    public Builder setChannel(ibc.core.channel.v1.Channel value) {
      if (channelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        channel_ = value;
        onChanged();
      } else {
        channelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ibc.core.channel.v1.Channel channel = 2;</code>
     */
    public Builder setChannel(
        ibc.core.channel.v1.Channel.Builder builderForValue) {
      if (channelBuilder_ == null) {
        channel_ = builderForValue.build();
        onChanged();
      } else {
        channelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ibc.core.channel.v1.Channel channel = 2;</code>
     */
    public Builder mergeChannel(ibc.core.channel.v1.Channel value) {
      if (channelBuilder_ == null) {
        if (channel_ != null) {
          channel_ =
            ibc.core.channel.v1.Channel.newBuilder(channel_).mergeFrom(value).buildPartial();
        } else {
          channel_ = value;
        }
        onChanged();
      } else {
        channelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ibc.core.channel.v1.Channel channel = 2;</code>
     */
    public Builder clearChannel() {
      if (channelBuilder_ == null) {
        channel_ = null;
        onChanged();
      } else {
        channel_ = null;
        channelBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ibc.core.channel.v1.Channel channel = 2;</code>
     */
    public ibc.core.channel.v1.Channel.Builder getChannelBuilder() {
      
      onChanged();
      return getChannelFieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.core.channel.v1.Channel channel = 2;</code>
     */
    public ibc.core.channel.v1.ChannelOrBuilder getChannelOrBuilder() {
      if (channelBuilder_ != null) {
        return channelBuilder_.getMessageOrBuilder();
      } else {
        return channel_ == null ?
            ibc.core.channel.v1.Channel.getDefaultInstance() : channel_;
      }
    }
    /**
     * <code>.ibc.core.channel.v1.Channel channel = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.channel.v1.Channel, ibc.core.channel.v1.Channel.Builder, ibc.core.channel.v1.ChannelOrBuilder> 
        getChannelFieldBuilder() {
      if (channelBuilder_ == null) {
        channelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ibc.core.channel.v1.Channel, ibc.core.channel.v1.Channel.Builder, ibc.core.channel.v1.ChannelOrBuilder>(
                getChannel(),
                getParentForChildren(),
                isClean());
        channel_ = null;
      }
      return channelBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.lightclients.solomachine.v1.ChannelStateData)
  }

  // @@protoc_insertion_point(class_scope:ibc.lightclients.solomachine.v1.ChannelStateData)
  private static final ibc.lightclients.solomachine.v1.ChannelStateData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ibc.lightclients.solomachine.v1.ChannelStateData();
  }

  public static ibc.lightclients.solomachine.v1.ChannelStateData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChannelStateData>
      PARSER = new com.google.protobuf.AbstractParser<ChannelStateData>() {
    @java.lang.Override
    public ChannelStateData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChannelStateData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChannelStateData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChannelStateData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ibc.lightclients.solomachine.v1.ChannelStateData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
