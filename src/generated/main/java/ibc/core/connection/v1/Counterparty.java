// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/connection.proto

package ibc.core.connection.v1;

/**
 * <pre>
 * Counterparty defines the counterparty chain associated with a connection end.
 * </pre>
 *
 * Protobuf type {@code ibc.core.connection.v1.Counterparty}
 */
public  final class Counterparty extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.connection.v1.Counterparty)
    CounterpartyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Counterparty.newBuilder() to construct.
  private Counterparty(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Counterparty() {
    clientId_ = "";
    connectionId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Counterparty(
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

            connectionId_ = s;
            break;
          }
          case 26: {
            ibc.core.commitment.v1.MerklePrefix.Builder subBuilder = null;
            if (prefix_ != null) {
              subBuilder = prefix_.toBuilder();
            }
            prefix_ = input.readMessage(ibc.core.commitment.v1.MerklePrefix.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(prefix_);
              prefix_ = subBuilder.buildPartial();
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
    return ibc.core.connection.v1.Connection.internal_static_ibc_core_connection_v1_Counterparty_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ibc.core.connection.v1.Connection.internal_static_ibc_core_connection_v1_Counterparty_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ibc.core.connection.v1.Counterparty.class, ibc.core.connection.v1.Counterparty.Builder.class);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object clientId_;
  /**
   * <pre>
   * identifies the client on the counterparty chain associated with a given
   * connection.
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
   * identifies the client on the counterparty chain associated with a given
   * connection.
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

  public static final int CONNECTION_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object connectionId_;
  /**
   * <pre>
   * identifies the connection end on the counterparty chain associated with a
   * given connection.
   * </pre>
   *
   * <code>string connection_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   */
  public java.lang.String getConnectionId() {
    java.lang.Object ref = connectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      connectionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * identifies the connection end on the counterparty chain associated with a
   * given connection.
   * </pre>
   *
   * <code>string connection_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   */
  public com.google.protobuf.ByteString
      getConnectionIdBytes() {
    java.lang.Object ref = connectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      connectionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREFIX_FIELD_NUMBER = 3;
  private ibc.core.commitment.v1.MerklePrefix prefix_;
  /**
   * <pre>
   * commitment merkle prefix of the counterparty chain.
   * </pre>
   *
   * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasPrefix() {
    return prefix_ != null;
  }
  /**
   * <pre>
   * commitment merkle prefix of the counterparty chain.
   * </pre>
   *
   * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [(.gogoproto.nullable) = false];</code>
   */
  public ibc.core.commitment.v1.MerklePrefix getPrefix() {
    return prefix_ == null ? ibc.core.commitment.v1.MerklePrefix.getDefaultInstance() : prefix_;
  }
  /**
   * <pre>
   * commitment merkle prefix of the counterparty chain.
   * </pre>
   *
   * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [(.gogoproto.nullable) = false];</code>
   */
  public ibc.core.commitment.v1.MerklePrefixOrBuilder getPrefixOrBuilder() {
    return getPrefix();
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
    if (!getConnectionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, connectionId_);
    }
    if (prefix_ != null) {
      output.writeMessage(3, getPrefix());
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
    if (!getConnectionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, connectionId_);
    }
    if (prefix_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPrefix());
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
    if (!(obj instanceof ibc.core.connection.v1.Counterparty)) {
      return super.equals(obj);
    }
    ibc.core.connection.v1.Counterparty other = (ibc.core.connection.v1.Counterparty) obj;

    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (!getConnectionId()
        .equals(other.getConnectionId())) return false;
    if (hasPrefix() != other.hasPrefix()) return false;
    if (hasPrefix()) {
      if (!getPrefix()
          .equals(other.getPrefix())) return false;
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
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (37 * hash) + CONNECTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConnectionId().hashCode();
    if (hasPrefix()) {
      hash = (37 * hash) + PREFIX_FIELD_NUMBER;
      hash = (53 * hash) + getPrefix().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ibc.core.connection.v1.Counterparty parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.connection.v1.Counterparty parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.connection.v1.Counterparty parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.connection.v1.Counterparty parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.connection.v1.Counterparty parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.connection.v1.Counterparty parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.connection.v1.Counterparty parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.core.connection.v1.Counterparty parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.core.connection.v1.Counterparty parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ibc.core.connection.v1.Counterparty parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.core.connection.v1.Counterparty parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.core.connection.v1.Counterparty parseFrom(
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
  public static Builder newBuilder(ibc.core.connection.v1.Counterparty prototype) {
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
   * Counterparty defines the counterparty chain associated with a connection end.
   * </pre>
   *
   * Protobuf type {@code ibc.core.connection.v1.Counterparty}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.connection.v1.Counterparty)
      ibc.core.connection.v1.CounterpartyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ibc.core.connection.v1.Connection.internal_static_ibc_core_connection_v1_Counterparty_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ibc.core.connection.v1.Connection.internal_static_ibc_core_connection_v1_Counterparty_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ibc.core.connection.v1.Counterparty.class, ibc.core.connection.v1.Counterparty.Builder.class);
    }

    // Construct using ibc.core.connection.v1.Counterparty.newBuilder()
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

      connectionId_ = "";

      if (prefixBuilder_ == null) {
        prefix_ = null;
      } else {
        prefix_ = null;
        prefixBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ibc.core.connection.v1.Connection.internal_static_ibc_core_connection_v1_Counterparty_descriptor;
    }

    @java.lang.Override
    public ibc.core.connection.v1.Counterparty getDefaultInstanceForType() {
      return ibc.core.connection.v1.Counterparty.getDefaultInstance();
    }

    @java.lang.Override
    public ibc.core.connection.v1.Counterparty build() {
      ibc.core.connection.v1.Counterparty result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ibc.core.connection.v1.Counterparty buildPartial() {
      ibc.core.connection.v1.Counterparty result = new ibc.core.connection.v1.Counterparty(this);
      result.clientId_ = clientId_;
      result.connectionId_ = connectionId_;
      if (prefixBuilder_ == null) {
        result.prefix_ = prefix_;
      } else {
        result.prefix_ = prefixBuilder_.build();
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
      if (other instanceof ibc.core.connection.v1.Counterparty) {
        return mergeFrom((ibc.core.connection.v1.Counterparty)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ibc.core.connection.v1.Counterparty other) {
      if (other == ibc.core.connection.v1.Counterparty.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        onChanged();
      }
      if (!other.getConnectionId().isEmpty()) {
        connectionId_ = other.connectionId_;
        onChanged();
      }
      if (other.hasPrefix()) {
        mergePrefix(other.getPrefix());
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
      ibc.core.connection.v1.Counterparty parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ibc.core.connection.v1.Counterparty) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object clientId_ = "";
    /**
     * <pre>
     * identifies the client on the counterparty chain associated with a given
     * connection.
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
     * identifies the client on the counterparty chain associated with a given
     * connection.
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
     * identifies the client on the counterparty chain associated with a given
     * connection.
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
     * identifies the client on the counterparty chain associated with a given
     * connection.
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
     * identifies the client on the counterparty chain associated with a given
     * connection.
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

    private java.lang.Object connectionId_ = "";
    /**
     * <pre>
     * identifies the connection end on the counterparty chain associated with a
     * given connection.
     * </pre>
     *
     * <code>string connection_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
     */
    public java.lang.String getConnectionId() {
      java.lang.Object ref = connectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        connectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * identifies the connection end on the counterparty chain associated with a
     * given connection.
     * </pre>
     *
     * <code>string connection_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
     */
    public com.google.protobuf.ByteString
        getConnectionIdBytes() {
      java.lang.Object ref = connectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        connectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * identifies the connection end on the counterparty chain associated with a
     * given connection.
     * </pre>
     *
     * <code>string connection_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
     */
    public Builder setConnectionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      connectionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * identifies the connection end on the counterparty chain associated with a
     * given connection.
     * </pre>
     *
     * <code>string connection_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
     */
    public Builder clearConnectionId() {
      
      connectionId_ = getDefaultInstance().getConnectionId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * identifies the connection end on the counterparty chain associated with a
     * given connection.
     * </pre>
     *
     * <code>string connection_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
     */
    public Builder setConnectionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      connectionId_ = value;
      onChanged();
      return this;
    }

    private ibc.core.commitment.v1.MerklePrefix prefix_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.commitment.v1.MerklePrefix, ibc.core.commitment.v1.MerklePrefix.Builder, ibc.core.commitment.v1.MerklePrefixOrBuilder> prefixBuilder_;
    /**
     * <pre>
     * commitment merkle prefix of the counterparty chain.
     * </pre>
     *
     * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasPrefix() {
      return prefixBuilder_ != null || prefix_ != null;
    }
    /**
     * <pre>
     * commitment merkle prefix of the counterparty chain.
     * </pre>
     *
     * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [(.gogoproto.nullable) = false];</code>
     */
    public ibc.core.commitment.v1.MerklePrefix getPrefix() {
      if (prefixBuilder_ == null) {
        return prefix_ == null ? ibc.core.commitment.v1.MerklePrefix.getDefaultInstance() : prefix_;
      } else {
        return prefixBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * commitment merkle prefix of the counterparty chain.
     * </pre>
     *
     * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setPrefix(ibc.core.commitment.v1.MerklePrefix value) {
      if (prefixBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prefix_ = value;
        onChanged();
      } else {
        prefixBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * commitment merkle prefix of the counterparty chain.
     * </pre>
     *
     * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setPrefix(
        ibc.core.commitment.v1.MerklePrefix.Builder builderForValue) {
      if (prefixBuilder_ == null) {
        prefix_ = builderForValue.build();
        onChanged();
      } else {
        prefixBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * commitment merkle prefix of the counterparty chain.
     * </pre>
     *
     * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergePrefix(ibc.core.commitment.v1.MerklePrefix value) {
      if (prefixBuilder_ == null) {
        if (prefix_ != null) {
          prefix_ =
            ibc.core.commitment.v1.MerklePrefix.newBuilder(prefix_).mergeFrom(value).buildPartial();
        } else {
          prefix_ = value;
        }
        onChanged();
      } else {
        prefixBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * commitment merkle prefix of the counterparty chain.
     * </pre>
     *
     * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearPrefix() {
      if (prefixBuilder_ == null) {
        prefix_ = null;
        onChanged();
      } else {
        prefix_ = null;
        prefixBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * commitment merkle prefix of the counterparty chain.
     * </pre>
     *
     * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [(.gogoproto.nullable) = false];</code>
     */
    public ibc.core.commitment.v1.MerklePrefix.Builder getPrefixBuilder() {
      
      onChanged();
      return getPrefixFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * commitment merkle prefix of the counterparty chain.
     * </pre>
     *
     * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [(.gogoproto.nullable) = false];</code>
     */
    public ibc.core.commitment.v1.MerklePrefixOrBuilder getPrefixOrBuilder() {
      if (prefixBuilder_ != null) {
        return prefixBuilder_.getMessageOrBuilder();
      } else {
        return prefix_ == null ?
            ibc.core.commitment.v1.MerklePrefix.getDefaultInstance() : prefix_;
      }
    }
    /**
     * <pre>
     * commitment merkle prefix of the counterparty chain.
     * </pre>
     *
     * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.commitment.v1.MerklePrefix, ibc.core.commitment.v1.MerklePrefix.Builder, ibc.core.commitment.v1.MerklePrefixOrBuilder> 
        getPrefixFieldBuilder() {
      if (prefixBuilder_ == null) {
        prefixBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ibc.core.commitment.v1.MerklePrefix, ibc.core.commitment.v1.MerklePrefix.Builder, ibc.core.commitment.v1.MerklePrefixOrBuilder>(
                getPrefix(),
                getParentForChildren(),
                isClean());
        prefix_ = null;
      }
      return prefixBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.connection.v1.Counterparty)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.connection.v1.Counterparty)
  private static final ibc.core.connection.v1.Counterparty DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ibc.core.connection.v1.Counterparty();
  }

  public static ibc.core.connection.v1.Counterparty getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Counterparty>
      PARSER = new com.google.protobuf.AbstractParser<Counterparty>() {
    @java.lang.Override
    public Counterparty parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Counterparty(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Counterparty> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Counterparty> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ibc.core.connection.v1.Counterparty getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

