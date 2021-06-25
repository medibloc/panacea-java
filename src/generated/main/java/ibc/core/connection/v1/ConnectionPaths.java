// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/connection.proto

package ibc.core.connection.v1;

/**
 * <pre>
 * ConnectionPaths define all the connection paths for a given client state.
 * </pre>
 *
 * Protobuf type {@code ibc.core.connection.v1.ConnectionPaths}
 */
public  final class ConnectionPaths extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.connection.v1.ConnectionPaths)
    ConnectionPathsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConnectionPaths.newBuilder() to construct.
  private ConnectionPaths(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConnectionPaths() {
    clientId_ = "";
    paths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConnectionPaths(
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

            clientId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              paths_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            paths_.add(s);
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        paths_ = paths_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ibc.core.connection.v1.Connection.internal_static_ibc_core_connection_v1_ConnectionPaths_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ibc.core.connection.v1.Connection.internal_static_ibc_core_connection_v1_ConnectionPaths_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ibc.core.connection.v1.ConnectionPaths.class, ibc.core.connection.v1.ConnectionPaths.Builder.class);
  }

  private int bitField0_;
  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object clientId_;
  /**
   * <pre>
   * client state unique identifier
   * </pre>
   *
   * <code>string client_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   */
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * client state unique identifier
   * </pre>
   *
   * <code>string client_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   */
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATHS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList paths_;
  /**
   * <pre>
   * list of connection paths
   * </pre>
   *
   * <code>repeated string paths = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getPathsList() {
    return paths_;
  }
  /**
   * <pre>
   * list of connection paths
   * </pre>
   *
   * <code>repeated string paths = 2;</code>
   */
  public int getPathsCount() {
    return paths_.size();
  }
  /**
   * <pre>
   * list of connection paths
   * </pre>
   *
   * <code>repeated string paths = 2;</code>
   */
  public java.lang.String getPaths(int index) {
    return paths_.get(index);
  }
  /**
   * <pre>
   * list of connection paths
   * </pre>
   *
   * <code>repeated string paths = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPathsBytes(int index) {
    return paths_.getByteString(index);
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
    if (!getClientIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientId_);
    }
    for (int i = 0; i < paths_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, paths_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClientIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < paths_.size(); i++) {
        dataSize += computeStringSizeNoTag(paths_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPathsList().size();
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
    if (!(obj instanceof ibc.core.connection.v1.ConnectionPaths)) {
      return super.equals(obj);
    }
    ibc.core.connection.v1.ConnectionPaths other = (ibc.core.connection.v1.ConnectionPaths) obj;

    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (!getPathsList()
        .equals(other.getPathsList())) return false;
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
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    if (getPathsCount() > 0) {
      hash = (37 * hash) + PATHS_FIELD_NUMBER;
      hash = (53 * hash) + getPathsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ibc.core.connection.v1.ConnectionPaths parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.connection.v1.ConnectionPaths parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.connection.v1.ConnectionPaths parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.connection.v1.ConnectionPaths parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.connection.v1.ConnectionPaths parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.connection.v1.ConnectionPaths parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.connection.v1.ConnectionPaths parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.core.connection.v1.ConnectionPaths parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.core.connection.v1.ConnectionPaths parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ibc.core.connection.v1.ConnectionPaths parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.core.connection.v1.ConnectionPaths parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.core.connection.v1.ConnectionPaths parseFrom(
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
  public static Builder newBuilder(ibc.core.connection.v1.ConnectionPaths prototype) {
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
   * ConnectionPaths define all the connection paths for a given client state.
   * </pre>
   *
   * Protobuf type {@code ibc.core.connection.v1.ConnectionPaths}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.connection.v1.ConnectionPaths)
      ibc.core.connection.v1.ConnectionPathsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ibc.core.connection.v1.Connection.internal_static_ibc_core_connection_v1_ConnectionPaths_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ibc.core.connection.v1.Connection.internal_static_ibc_core_connection_v1_ConnectionPaths_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ibc.core.connection.v1.ConnectionPaths.class, ibc.core.connection.v1.ConnectionPaths.Builder.class);
    }

    // Construct using ibc.core.connection.v1.ConnectionPaths.newBuilder()
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
      clientId_ = "";

      paths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ibc.core.connection.v1.Connection.internal_static_ibc_core_connection_v1_ConnectionPaths_descriptor;
    }

    @java.lang.Override
    public ibc.core.connection.v1.ConnectionPaths getDefaultInstanceForType() {
      return ibc.core.connection.v1.ConnectionPaths.getDefaultInstance();
    }

    @java.lang.Override
    public ibc.core.connection.v1.ConnectionPaths build() {
      ibc.core.connection.v1.ConnectionPaths result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ibc.core.connection.v1.ConnectionPaths buildPartial() {
      ibc.core.connection.v1.ConnectionPaths result = new ibc.core.connection.v1.ConnectionPaths(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.clientId_ = clientId_;
      if (((bitField0_ & 0x00000002) != 0)) {
        paths_ = paths_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.paths_ = paths_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof ibc.core.connection.v1.ConnectionPaths) {
        return mergeFrom((ibc.core.connection.v1.ConnectionPaths)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ibc.core.connection.v1.ConnectionPaths other) {
      if (other == ibc.core.connection.v1.ConnectionPaths.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        onChanged();
      }
      if (!other.paths_.isEmpty()) {
        if (paths_.isEmpty()) {
          paths_ = other.paths_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensurePathsIsMutable();
          paths_.addAll(other.paths_);
        }
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
      ibc.core.connection.v1.ConnectionPaths parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ibc.core.connection.v1.ConnectionPaths) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object clientId_ = "";
    /**
     * <pre>
     * client state unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * client state unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * client state unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client state unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     */
    public Builder clearClientId() {
      
      clientId_ = getDefaultInstance().getClientId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client state unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList paths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePathsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        paths_ = new com.google.protobuf.LazyStringArrayList(paths_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getPathsList() {
      return paths_.getUnmodifiableView();
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2;</code>
     */
    public int getPathsCount() {
      return paths_.size();
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2;</code>
     */
    public java.lang.String getPaths(int index) {
      return paths_.get(index);
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPathsBytes(int index) {
      return paths_.getByteString(index);
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2;</code>
     */
    public Builder setPaths(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePathsIsMutable();
      paths_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2;</code>
     */
    public Builder addPaths(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePathsIsMutable();
      paths_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2;</code>
     */
    public Builder addAllPaths(
        java.lang.Iterable<java.lang.String> values) {
      ensurePathsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, paths_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2;</code>
     */
    public Builder clearPaths() {
      paths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2;</code>
     */
    public Builder addPathsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePathsIsMutable();
      paths_.add(value);
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


    // @@protoc_insertion_point(builder_scope:ibc.core.connection.v1.ConnectionPaths)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.connection.v1.ConnectionPaths)
  private static final ibc.core.connection.v1.ConnectionPaths DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ibc.core.connection.v1.ConnectionPaths();
  }

  public static ibc.core.connection.v1.ConnectionPaths getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConnectionPaths>
      PARSER = new com.google.protobuf.AbstractParser<ConnectionPaths>() {
    @java.lang.Override
    public ConnectionPaths parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConnectionPaths(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConnectionPaths> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConnectionPaths> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ibc.core.connection.v1.ConnectionPaths getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

