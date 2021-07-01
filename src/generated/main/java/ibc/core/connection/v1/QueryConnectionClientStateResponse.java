// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/query.proto

package ibc.core.connection.v1;

/**
 * <pre>
 * QueryConnectionClientStateResponse is the response type for the
 * Query/ConnectionClientState RPC method
 * </pre>
 *
 * Protobuf type {@code ibc.core.connection.v1.QueryConnectionClientStateResponse}
 */
public  final class QueryConnectionClientStateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.connection.v1.QueryConnectionClientStateResponse)
    QueryConnectionClientStateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryConnectionClientStateResponse.newBuilder() to construct.
  private QueryConnectionClientStateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryConnectionClientStateResponse() {
    proof_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryConnectionClientStateResponse(
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
            ibc.core.client.v1.IdentifiedClientState.Builder subBuilder = null;
            if (identifiedClientState_ != null) {
              subBuilder = identifiedClientState_.toBuilder();
            }
            identifiedClientState_ = input.readMessage(ibc.core.client.v1.IdentifiedClientState.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(identifiedClientState_);
              identifiedClientState_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            proof_ = input.readBytes();
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
    return ibc.core.connection.v1.QueryOuterClass.internal_static_ibc_core_connection_v1_QueryConnectionClientStateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ibc.core.connection.v1.QueryOuterClass.internal_static_ibc_core_connection_v1_QueryConnectionClientStateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ibc.core.connection.v1.QueryConnectionClientStateResponse.class, ibc.core.connection.v1.QueryConnectionClientStateResponse.Builder.class);
  }

  public static final int IDENTIFIED_CLIENT_STATE_FIELD_NUMBER = 1;
  private ibc.core.client.v1.IdentifiedClientState identifiedClientState_;
  /**
   * <pre>
   * client state associated with the channel
   * </pre>
   *
   * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
   */
  public boolean hasIdentifiedClientState() {
    return identifiedClientState_ != null;
  }
  /**
   * <pre>
   * client state associated with the channel
   * </pre>
   *
   * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
   */
  public ibc.core.client.v1.IdentifiedClientState getIdentifiedClientState() {
    return identifiedClientState_ == null ? ibc.core.client.v1.IdentifiedClientState.getDefaultInstance() : identifiedClientState_;
  }
  /**
   * <pre>
   * client state associated with the channel
   * </pre>
   *
   * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
   */
  public ibc.core.client.v1.IdentifiedClientStateOrBuilder getIdentifiedClientStateOrBuilder() {
    return getIdentifiedClientState();
  }

  public static final int PROOF_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString proof_;
  /**
   * <pre>
   * merkle proof of existence
   * </pre>
   *
   * <code>bytes proof = 2;</code>
   */
  public com.google.protobuf.ByteString getProof() {
    return proof_;
  }

  public static final int PROOF_HEIGHT_FIELD_NUMBER = 3;
  private ibc.core.client.v1.Height proofHeight_;
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasProofHeight() {
    return proofHeight_ != null;
  }
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
   */
  public ibc.core.client.v1.Height getProofHeight() {
    return proofHeight_ == null ? ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
  }
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
   */
  public ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder() {
    return getProofHeight();
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
    if (identifiedClientState_ != null) {
      output.writeMessage(1, getIdentifiedClientState());
    }
    if (!proof_.isEmpty()) {
      output.writeBytes(2, proof_);
    }
    if (proofHeight_ != null) {
      output.writeMessage(3, getProofHeight());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (identifiedClientState_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIdentifiedClientState());
    }
    if (!proof_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, proof_);
    }
    if (proofHeight_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProofHeight());
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
    if (!(obj instanceof ibc.core.connection.v1.QueryConnectionClientStateResponse)) {
      return super.equals(obj);
    }
    ibc.core.connection.v1.QueryConnectionClientStateResponse other = (ibc.core.connection.v1.QueryConnectionClientStateResponse) obj;

    if (hasIdentifiedClientState() != other.hasIdentifiedClientState()) return false;
    if (hasIdentifiedClientState()) {
      if (!getIdentifiedClientState()
          .equals(other.getIdentifiedClientState())) return false;
    }
    if (!getProof()
        .equals(other.getProof())) return false;
    if (hasProofHeight() != other.hasProofHeight()) return false;
    if (hasProofHeight()) {
      if (!getProofHeight()
          .equals(other.getProofHeight())) return false;
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
    if (hasIdentifiedClientState()) {
      hash = (37 * hash) + IDENTIFIED_CLIENT_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getIdentifiedClientState().hashCode();
    }
    hash = (37 * hash) + PROOF_FIELD_NUMBER;
    hash = (53 * hash) + getProof().hashCode();
    if (hasProofHeight()) {
      hash = (37 * hash) + PROOF_HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getProofHeight().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ibc.core.connection.v1.QueryConnectionClientStateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.connection.v1.QueryConnectionClientStateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.connection.v1.QueryConnectionClientStateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.connection.v1.QueryConnectionClientStateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.connection.v1.QueryConnectionClientStateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.connection.v1.QueryConnectionClientStateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.connection.v1.QueryConnectionClientStateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.core.connection.v1.QueryConnectionClientStateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.core.connection.v1.QueryConnectionClientStateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ibc.core.connection.v1.QueryConnectionClientStateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.core.connection.v1.QueryConnectionClientStateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.core.connection.v1.QueryConnectionClientStateResponse parseFrom(
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
  public static Builder newBuilder(ibc.core.connection.v1.QueryConnectionClientStateResponse prototype) {
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
   * QueryConnectionClientStateResponse is the response type for the
   * Query/ConnectionClientState RPC method
   * </pre>
   *
   * Protobuf type {@code ibc.core.connection.v1.QueryConnectionClientStateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.connection.v1.QueryConnectionClientStateResponse)
      ibc.core.connection.v1.QueryConnectionClientStateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ibc.core.connection.v1.QueryOuterClass.internal_static_ibc_core_connection_v1_QueryConnectionClientStateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ibc.core.connection.v1.QueryOuterClass.internal_static_ibc_core_connection_v1_QueryConnectionClientStateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ibc.core.connection.v1.QueryConnectionClientStateResponse.class, ibc.core.connection.v1.QueryConnectionClientStateResponse.Builder.class);
    }

    // Construct using ibc.core.connection.v1.QueryConnectionClientStateResponse.newBuilder()
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
      if (identifiedClientStateBuilder_ == null) {
        identifiedClientState_ = null;
      } else {
        identifiedClientState_ = null;
        identifiedClientStateBuilder_ = null;
      }
      proof_ = com.google.protobuf.ByteString.EMPTY;

      if (proofHeightBuilder_ == null) {
        proofHeight_ = null;
      } else {
        proofHeight_ = null;
        proofHeightBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ibc.core.connection.v1.QueryOuterClass.internal_static_ibc_core_connection_v1_QueryConnectionClientStateResponse_descriptor;
    }

    @java.lang.Override
    public ibc.core.connection.v1.QueryConnectionClientStateResponse getDefaultInstanceForType() {
      return ibc.core.connection.v1.QueryConnectionClientStateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ibc.core.connection.v1.QueryConnectionClientStateResponse build() {
      ibc.core.connection.v1.QueryConnectionClientStateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ibc.core.connection.v1.QueryConnectionClientStateResponse buildPartial() {
      ibc.core.connection.v1.QueryConnectionClientStateResponse result = new ibc.core.connection.v1.QueryConnectionClientStateResponse(this);
      if (identifiedClientStateBuilder_ == null) {
        result.identifiedClientState_ = identifiedClientState_;
      } else {
        result.identifiedClientState_ = identifiedClientStateBuilder_.build();
      }
      result.proof_ = proof_;
      if (proofHeightBuilder_ == null) {
        result.proofHeight_ = proofHeight_;
      } else {
        result.proofHeight_ = proofHeightBuilder_.build();
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
      if (other instanceof ibc.core.connection.v1.QueryConnectionClientStateResponse) {
        return mergeFrom((ibc.core.connection.v1.QueryConnectionClientStateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ibc.core.connection.v1.QueryConnectionClientStateResponse other) {
      if (other == ibc.core.connection.v1.QueryConnectionClientStateResponse.getDefaultInstance()) return this;
      if (other.hasIdentifiedClientState()) {
        mergeIdentifiedClientState(other.getIdentifiedClientState());
      }
      if (other.getProof() != com.google.protobuf.ByteString.EMPTY) {
        setProof(other.getProof());
      }
      if (other.hasProofHeight()) {
        mergeProofHeight(other.getProofHeight());
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
      ibc.core.connection.v1.QueryConnectionClientStateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ibc.core.connection.v1.QueryConnectionClientStateResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ibc.core.client.v1.IdentifiedClientState identifiedClientState_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.client.v1.IdentifiedClientState, ibc.core.client.v1.IdentifiedClientState.Builder, ibc.core.client.v1.IdentifiedClientStateOrBuilder> identifiedClientStateBuilder_;
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
     */
    public boolean hasIdentifiedClientState() {
      return identifiedClientStateBuilder_ != null || identifiedClientState_ != null;
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
     */
    public ibc.core.client.v1.IdentifiedClientState getIdentifiedClientState() {
      if (identifiedClientStateBuilder_ == null) {
        return identifiedClientState_ == null ? ibc.core.client.v1.IdentifiedClientState.getDefaultInstance() : identifiedClientState_;
      } else {
        return identifiedClientStateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
     */
    public Builder setIdentifiedClientState(ibc.core.client.v1.IdentifiedClientState value) {
      if (identifiedClientStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        identifiedClientState_ = value;
        onChanged();
      } else {
        identifiedClientStateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
     */
    public Builder setIdentifiedClientState(
        ibc.core.client.v1.IdentifiedClientState.Builder builderForValue) {
      if (identifiedClientStateBuilder_ == null) {
        identifiedClientState_ = builderForValue.build();
        onChanged();
      } else {
        identifiedClientStateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
     */
    public Builder mergeIdentifiedClientState(ibc.core.client.v1.IdentifiedClientState value) {
      if (identifiedClientStateBuilder_ == null) {
        if (identifiedClientState_ != null) {
          identifiedClientState_ =
            ibc.core.client.v1.IdentifiedClientState.newBuilder(identifiedClientState_).mergeFrom(value).buildPartial();
        } else {
          identifiedClientState_ = value;
        }
        onChanged();
      } else {
        identifiedClientStateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
     */
    public Builder clearIdentifiedClientState() {
      if (identifiedClientStateBuilder_ == null) {
        identifiedClientState_ = null;
        onChanged();
      } else {
        identifiedClientState_ = null;
        identifiedClientStateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
     */
    public ibc.core.client.v1.IdentifiedClientState.Builder getIdentifiedClientStateBuilder() {
      
      onChanged();
      return getIdentifiedClientStateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
     */
    public ibc.core.client.v1.IdentifiedClientStateOrBuilder getIdentifiedClientStateOrBuilder() {
      if (identifiedClientStateBuilder_ != null) {
        return identifiedClientStateBuilder_.getMessageOrBuilder();
      } else {
        return identifiedClientState_ == null ?
            ibc.core.client.v1.IdentifiedClientState.getDefaultInstance() : identifiedClientState_;
      }
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.client.v1.IdentifiedClientState, ibc.core.client.v1.IdentifiedClientState.Builder, ibc.core.client.v1.IdentifiedClientStateOrBuilder> 
        getIdentifiedClientStateFieldBuilder() {
      if (identifiedClientStateBuilder_ == null) {
        identifiedClientStateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ibc.core.client.v1.IdentifiedClientState, ibc.core.client.v1.IdentifiedClientState.Builder, ibc.core.client.v1.IdentifiedClientStateOrBuilder>(
                getIdentifiedClientState(),
                getParentForChildren(),
                isClean());
        identifiedClientState_ = null;
      }
      return identifiedClientStateBuilder_;
    }

    private com.google.protobuf.ByteString proof_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2;</code>
     */
    public com.google.protobuf.ByteString getProof() {
      return proof_;
    }
    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2;</code>
     */
    public Builder setProof(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      proof_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2;</code>
     */
    public Builder clearProof() {
      
      proof_ = getDefaultInstance().getProof();
      onChanged();
      return this;
    }

    private ibc.core.client.v1.Height proofHeight_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.client.v1.Height, ibc.core.client.v1.Height.Builder, ibc.core.client.v1.HeightOrBuilder> proofHeightBuilder_;
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasProofHeight() {
      return proofHeightBuilder_ != null || proofHeight_ != null;
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
     */
    public ibc.core.client.v1.Height getProofHeight() {
      if (proofHeightBuilder_ == null) {
        return proofHeight_ == null ? ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
      } else {
        return proofHeightBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
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
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
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
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
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
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
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
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
     */
    public ibc.core.client.v1.Height.Builder getProofHeightBuilder() {
      
      onChanged();
      return getProofHeightFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
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
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
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


    // @@protoc_insertion_point(builder_scope:ibc.core.connection.v1.QueryConnectionClientStateResponse)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.connection.v1.QueryConnectionClientStateResponse)
  private static final ibc.core.connection.v1.QueryConnectionClientStateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ibc.core.connection.v1.QueryConnectionClientStateResponse();
  }

  public static ibc.core.connection.v1.QueryConnectionClientStateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryConnectionClientStateResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryConnectionClientStateResponse>() {
    @java.lang.Override
    public QueryConnectionClientStateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryConnectionClientStateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryConnectionClientStateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryConnectionClientStateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ibc.core.connection.v1.QueryConnectionClientStateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

