// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/tx.proto

package ibc.core.connection.v1;

/**
 * <pre>
 * MsgConnectionOpenConfirm defines a msg sent by a Relayer to Chain B to
 * acknowledge the change of connection state to OPEN on Chain A.
 * </pre>
 *
 * Protobuf type {@code ibc.core.connection.v1.MsgConnectionOpenConfirm}
 */
public  final class MsgConnectionOpenConfirm extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.connection.v1.MsgConnectionOpenConfirm)
    MsgConnectionOpenConfirmOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgConnectionOpenConfirm.newBuilder() to construct.
  private MsgConnectionOpenConfirm(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgConnectionOpenConfirm() {
    connectionId_ = "";
    proofAck_ = com.google.protobuf.ByteString.EMPTY;
    signer_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgConnectionOpenConfirm(
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

            connectionId_ = s;
            break;
          }
          case 18: {

            proofAck_ = input.readBytes();
            break;
          }
          case 26: {
            ibc.core.client.v1.Height.Builder subBuilder = null;
            if (proofHeight_ != null) {
              subBuilder = proofHeight_.toBuilder();
            }
            proofHeight_ = input.readMessage(ibc.core.client.v1.Height.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(proofHeight_);
              proofHeight_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            signer_ = s;
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
    return ibc.core.connection.v1.Tx.internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirm_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ibc.core.connection.v1.Tx.internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirm_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ibc.core.connection.v1.MsgConnectionOpenConfirm.class, ibc.core.connection.v1.MsgConnectionOpenConfirm.Builder.class);
  }

  public static final int CONNECTION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object connectionId_;
  /**
   * <code>string connection_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
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
   * <code>string connection_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
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

  public static final int PROOF_ACK_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString proofAck_;
  /**
   * <pre>
   * proof for the change of the connection state on Chain A: `INIT -&gt; OPEN`
   * </pre>
   *
   * <code>bytes proof_ack = 2 [(.gogoproto.moretags) = "yaml:&#92;"proof_ack&#92;""];</code>
   */
  public com.google.protobuf.ByteString getProofAck() {
    return proofAck_;
  }

  public static final int PROOF_HEIGHT_FIELD_NUMBER = 3;
  private ibc.core.client.v1.Height proofHeight_;
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  public boolean hasProofHeight() {
    return proofHeight_ != null;
  }
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  public ibc.core.client.v1.Height getProofHeight() {
    return proofHeight_ == null ? ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
  }
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  public ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder() {
    return getProofHeight();
  }

  public static final int SIGNER_FIELD_NUMBER = 4;
  private volatile java.lang.Object signer_;
  /**
   * <code>string signer = 4;</code>
   */
  public java.lang.String getSigner() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signer_ = s;
      return s;
    }
  }
  /**
   * <code>string signer = 4;</code>
   */
  public com.google.protobuf.ByteString
      getSignerBytes() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signer_ = b;
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
    if (!getConnectionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, connectionId_);
    }
    if (!proofAck_.isEmpty()) {
      output.writeBytes(2, proofAck_);
    }
    if (proofHeight_ != null) {
      output.writeMessage(3, getProofHeight());
    }
    if (!getSignerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, signer_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getConnectionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, connectionId_);
    }
    if (!proofAck_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, proofAck_);
    }
    if (proofHeight_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProofHeight());
    }
    if (!getSignerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, signer_);
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
    if (!(obj instanceof ibc.core.connection.v1.MsgConnectionOpenConfirm)) {
      return super.equals(obj);
    }
    ibc.core.connection.v1.MsgConnectionOpenConfirm other = (ibc.core.connection.v1.MsgConnectionOpenConfirm) obj;

    if (!getConnectionId()
        .equals(other.getConnectionId())) return false;
    if (!getProofAck()
        .equals(other.getProofAck())) return false;
    if (hasProofHeight() != other.hasProofHeight()) return false;
    if (hasProofHeight()) {
      if (!getProofHeight()
          .equals(other.getProofHeight())) return false;
    }
    if (!getSigner()
        .equals(other.getSigner())) return false;
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
    hash = (37 * hash) + CONNECTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConnectionId().hashCode();
    hash = (37 * hash) + PROOF_ACK_FIELD_NUMBER;
    hash = (53 * hash) + getProofAck().hashCode();
    if (hasProofHeight()) {
      hash = (37 * hash) + PROOF_HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getProofHeight().hashCode();
    }
    hash = (37 * hash) + SIGNER_FIELD_NUMBER;
    hash = (53 * hash) + getSigner().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ibc.core.connection.v1.MsgConnectionOpenConfirm parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.connection.v1.MsgConnectionOpenConfirm parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.connection.v1.MsgConnectionOpenConfirm parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.connection.v1.MsgConnectionOpenConfirm parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.connection.v1.MsgConnectionOpenConfirm parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.connection.v1.MsgConnectionOpenConfirm parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.connection.v1.MsgConnectionOpenConfirm parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.core.connection.v1.MsgConnectionOpenConfirm parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.core.connection.v1.MsgConnectionOpenConfirm parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ibc.core.connection.v1.MsgConnectionOpenConfirm parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.core.connection.v1.MsgConnectionOpenConfirm parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.core.connection.v1.MsgConnectionOpenConfirm parseFrom(
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
  public static Builder newBuilder(ibc.core.connection.v1.MsgConnectionOpenConfirm prototype) {
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
   * MsgConnectionOpenConfirm defines a msg sent by a Relayer to Chain B to
   * acknowledge the change of connection state to OPEN on Chain A.
   * </pre>
   *
   * Protobuf type {@code ibc.core.connection.v1.MsgConnectionOpenConfirm}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.connection.v1.MsgConnectionOpenConfirm)
      ibc.core.connection.v1.MsgConnectionOpenConfirmOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ibc.core.connection.v1.Tx.internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirm_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ibc.core.connection.v1.Tx.internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirm_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ibc.core.connection.v1.MsgConnectionOpenConfirm.class, ibc.core.connection.v1.MsgConnectionOpenConfirm.Builder.class);
    }

    // Construct using ibc.core.connection.v1.MsgConnectionOpenConfirm.newBuilder()
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
      connectionId_ = "";

      proofAck_ = com.google.protobuf.ByteString.EMPTY;

      if (proofHeightBuilder_ == null) {
        proofHeight_ = null;
      } else {
        proofHeight_ = null;
        proofHeightBuilder_ = null;
      }
      signer_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ibc.core.connection.v1.Tx.internal_static_ibc_core_connection_v1_MsgConnectionOpenConfirm_descriptor;
    }

    @java.lang.Override
    public ibc.core.connection.v1.MsgConnectionOpenConfirm getDefaultInstanceForType() {
      return ibc.core.connection.v1.MsgConnectionOpenConfirm.getDefaultInstance();
    }

    @java.lang.Override
    public ibc.core.connection.v1.MsgConnectionOpenConfirm build() {
      ibc.core.connection.v1.MsgConnectionOpenConfirm result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ibc.core.connection.v1.MsgConnectionOpenConfirm buildPartial() {
      ibc.core.connection.v1.MsgConnectionOpenConfirm result = new ibc.core.connection.v1.MsgConnectionOpenConfirm(this);
      result.connectionId_ = connectionId_;
      result.proofAck_ = proofAck_;
      if (proofHeightBuilder_ == null) {
        result.proofHeight_ = proofHeight_;
      } else {
        result.proofHeight_ = proofHeightBuilder_.build();
      }
      result.signer_ = signer_;
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
      if (other instanceof ibc.core.connection.v1.MsgConnectionOpenConfirm) {
        return mergeFrom((ibc.core.connection.v1.MsgConnectionOpenConfirm)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ibc.core.connection.v1.MsgConnectionOpenConfirm other) {
      if (other == ibc.core.connection.v1.MsgConnectionOpenConfirm.getDefaultInstance()) return this;
      if (!other.getConnectionId().isEmpty()) {
        connectionId_ = other.connectionId_;
        onChanged();
      }
      if (other.getProofAck() != com.google.protobuf.ByteString.EMPTY) {
        setProofAck(other.getProofAck());
      }
      if (other.hasProofHeight()) {
        mergeProofHeight(other.getProofHeight());
      }
      if (!other.getSigner().isEmpty()) {
        signer_ = other.signer_;
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
      ibc.core.connection.v1.MsgConnectionOpenConfirm parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ibc.core.connection.v1.MsgConnectionOpenConfirm) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object connectionId_ = "";
    /**
     * <code>string connection_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
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
     * <code>string connection_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
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
     * <code>string connection_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
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
     * <code>string connection_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
     */
    public Builder clearConnectionId() {
      
      connectionId_ = getDefaultInstance().getConnectionId();
      onChanged();
      return this;
    }
    /**
     * <code>string connection_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
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

    private com.google.protobuf.ByteString proofAck_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * proof for the change of the connection state on Chain A: `INIT -&gt; OPEN`
     * </pre>
     *
     * <code>bytes proof_ack = 2 [(.gogoproto.moretags) = "yaml:&#92;"proof_ack&#92;""];</code>
     */
    public com.google.protobuf.ByteString getProofAck() {
      return proofAck_;
    }
    /**
     * <pre>
     * proof for the change of the connection state on Chain A: `INIT -&gt; OPEN`
     * </pre>
     *
     * <code>bytes proof_ack = 2 [(.gogoproto.moretags) = "yaml:&#92;"proof_ack&#92;""];</code>
     */
    public Builder setProofAck(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      proofAck_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * proof for the change of the connection state on Chain A: `INIT -&gt; OPEN`
     * </pre>
     *
     * <code>bytes proof_ack = 2 [(.gogoproto.moretags) = "yaml:&#92;"proof_ack&#92;""];</code>
     */
    public Builder clearProofAck() {
      
      proofAck_ = getDefaultInstance().getProofAck();
      onChanged();
      return this;
    }

    private ibc.core.client.v1.Height proofHeight_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.client.v1.Height, ibc.core.client.v1.Height.Builder, ibc.core.client.v1.HeightOrBuilder> proofHeightBuilder_;
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public boolean hasProofHeight() {
      return proofHeightBuilder_ != null || proofHeight_ != null;
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public ibc.core.client.v1.Height getProofHeight() {
      if (proofHeightBuilder_ == null) {
        return proofHeight_ == null ? ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
      } else {
        return proofHeightBuilder_.getMessage();
      }
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public Builder setProofHeight(ibc.core.client.v1.Height value) {
      if (proofHeightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proofHeight_ = value;
        onChanged();
      } else {
        proofHeightBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public Builder setProofHeight(
        ibc.core.client.v1.Height.Builder builderForValue) {
      if (proofHeightBuilder_ == null) {
        proofHeight_ = builderForValue.build();
        onChanged();
      } else {
        proofHeightBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public Builder mergeProofHeight(ibc.core.client.v1.Height value) {
      if (proofHeightBuilder_ == null) {
        if (proofHeight_ != null) {
          proofHeight_ =
            ibc.core.client.v1.Height.newBuilder(proofHeight_).mergeFrom(value).buildPartial();
        } else {
          proofHeight_ = value;
        }
        onChanged();
      } else {
        proofHeightBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public Builder clearProofHeight() {
      if (proofHeightBuilder_ == null) {
        proofHeight_ = null;
        onChanged();
      } else {
        proofHeight_ = null;
        proofHeightBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public ibc.core.client.v1.Height.Builder getProofHeightBuilder() {
      
      onChanged();
      return getProofHeightFieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder() {
      if (proofHeightBuilder_ != null) {
        return proofHeightBuilder_.getMessageOrBuilder();
      } else {
        return proofHeight_ == null ?
            ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
      }
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.client.v1.Height, ibc.core.client.v1.Height.Builder, ibc.core.client.v1.HeightOrBuilder> 
        getProofHeightFieldBuilder() {
      if (proofHeightBuilder_ == null) {
        proofHeightBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ibc.core.client.v1.Height, ibc.core.client.v1.Height.Builder, ibc.core.client.v1.HeightOrBuilder>(
                getProofHeight(),
                getParentForChildren(),
                isClean());
        proofHeight_ = null;
      }
      return proofHeightBuilder_;
    }

    private java.lang.Object signer_ = "";
    /**
     * <code>string signer = 4;</code>
     */
    public java.lang.String getSigner() {
      java.lang.Object ref = signer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string signer = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSignerBytes() {
      java.lang.Object ref = signer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string signer = 4;</code>
     */
    public Builder setSigner(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      signer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string signer = 4;</code>
     */
    public Builder clearSigner() {
      
      signer_ = getDefaultInstance().getSigner();
      onChanged();
      return this;
    }
    /**
     * <code>string signer = 4;</code>
     */
    public Builder setSignerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      signer_ = value;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.connection.v1.MsgConnectionOpenConfirm)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.connection.v1.MsgConnectionOpenConfirm)
  private static final ibc.core.connection.v1.MsgConnectionOpenConfirm DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ibc.core.connection.v1.MsgConnectionOpenConfirm();
  }

  public static ibc.core.connection.v1.MsgConnectionOpenConfirm getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgConnectionOpenConfirm>
      PARSER = new com.google.protobuf.AbstractParser<MsgConnectionOpenConfirm>() {
    @java.lang.Override
    public MsgConnectionOpenConfirm parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgConnectionOpenConfirm(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgConnectionOpenConfirm> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgConnectionOpenConfirm> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ibc.core.connection.v1.MsgConnectionOpenConfirm getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

