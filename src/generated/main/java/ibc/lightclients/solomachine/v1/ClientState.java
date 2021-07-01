// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v1/solomachine.proto

package ibc.lightclients.solomachine.v1;

/**
 * <pre>
 * ClientState defines a solo machine client that tracks the current consensus
 * state and if the client is frozen.
 * </pre>
 *
 * Protobuf type {@code ibc.lightclients.solomachine.v1.ClientState}
 */
public  final class ClientState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.lightclients.solomachine.v1.ClientState)
    ClientStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientState.newBuilder() to construct.
  private ClientState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientState() {
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
          case 8: {

            sequence_ = input.readUInt64();
            break;
          }
          case 16: {

            frozenSequence_ = input.readUInt64();
            break;
          }
          case 26: {
            ibc.lightclients.solomachine.v1.ConsensusState.Builder subBuilder = null;
            if (consensusState_ != null) {
              subBuilder = consensusState_.toBuilder();
            }
            consensusState_ = input.readMessage(ibc.lightclients.solomachine.v1.ConsensusState.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(consensusState_);
              consensusState_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            allowUpdateAfterProposal_ = input.readBool();
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
    return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_ClientState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_ClientState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ibc.lightclients.solomachine.v1.ClientState.class, ibc.lightclients.solomachine.v1.ClientState.Builder.class);
  }

  public static final int SEQUENCE_FIELD_NUMBER = 1;
  private long sequence_;
  /**
   * <pre>
   * latest sequence of the client state
   * </pre>
   *
   * <code>uint64 sequence = 1;</code>
   */
  public long getSequence() {
    return sequence_;
  }

  public static final int FROZEN_SEQUENCE_FIELD_NUMBER = 2;
  private long frozenSequence_;
  /**
   * <pre>
   * frozen sequence of the solo machine
   * </pre>
   *
   * <code>uint64 frozen_sequence = 2 [(.gogoproto.moretags) = "yaml:&#92;"frozen_sequence&#92;""];</code>
   */
  public long getFrozenSequence() {
    return frozenSequence_;
  }

  public static final int CONSENSUS_STATE_FIELD_NUMBER = 3;
  private ibc.lightclients.solomachine.v1.ConsensusState consensusState_;
  /**
   * <code>.ibc.lightclients.solomachine.v1.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   */
  public boolean hasConsensusState() {
    return consensusState_ != null;
  }
  /**
   * <code>.ibc.lightclients.solomachine.v1.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   */
  public ibc.lightclients.solomachine.v1.ConsensusState getConsensusState() {
    return consensusState_ == null ? ibc.lightclients.solomachine.v1.ConsensusState.getDefaultInstance() : consensusState_;
  }
  /**
   * <code>.ibc.lightclients.solomachine.v1.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   */
  public ibc.lightclients.solomachine.v1.ConsensusStateOrBuilder getConsensusStateOrBuilder() {
    return getConsensusState();
  }

  public static final int ALLOW_UPDATE_AFTER_PROPOSAL_FIELD_NUMBER = 4;
  private boolean allowUpdateAfterProposal_;
  /**
   * <pre>
   * when set to true, will allow governance to update a solo machine client.
   * The client will be unfrozen if it is frozen.
   * </pre>
   *
   * <code>bool allow_update_after_proposal = 4 [(.gogoproto.moretags) = "yaml:&#92;"allow_update_after_proposal&#92;""];</code>
   */
  public boolean getAllowUpdateAfterProposal() {
    return allowUpdateAfterProposal_;
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
    if (sequence_ != 0L) {
      output.writeUInt64(1, sequence_);
    }
    if (frozenSequence_ != 0L) {
      output.writeUInt64(2, frozenSequence_);
    }
    if (consensusState_ != null) {
      output.writeMessage(3, getConsensusState());
    }
    if (allowUpdateAfterProposal_ != false) {
      output.writeBool(4, allowUpdateAfterProposal_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, sequence_);
    }
    if (frozenSequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, frozenSequence_);
    }
    if (consensusState_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getConsensusState());
    }
    if (allowUpdateAfterProposal_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, allowUpdateAfterProposal_);
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
    if (!(obj instanceof ibc.lightclients.solomachine.v1.ClientState)) {
      return super.equals(obj);
    }
    ibc.lightclients.solomachine.v1.ClientState other = (ibc.lightclients.solomachine.v1.ClientState) obj;

    if (getSequence()
        != other.getSequence()) return false;
    if (getFrozenSequence()
        != other.getFrozenSequence()) return false;
    if (hasConsensusState() != other.hasConsensusState()) return false;
    if (hasConsensusState()) {
      if (!getConsensusState()
          .equals(other.getConsensusState())) return false;
    }
    if (getAllowUpdateAfterProposal()
        != other.getAllowUpdateAfterProposal()) return false;
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
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    hash = (37 * hash) + FROZEN_SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFrozenSequence());
    if (hasConsensusState()) {
      hash = (37 * hash) + CONSENSUS_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getConsensusState().hashCode();
    }
    hash = (37 * hash) + ALLOW_UPDATE_AFTER_PROPOSAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowUpdateAfterProposal());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ibc.lightclients.solomachine.v1.ClientState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.lightclients.solomachine.v1.ClientState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.ClientState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.lightclients.solomachine.v1.ClientState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.ClientState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.lightclients.solomachine.v1.ClientState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.ClientState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.lightclients.solomachine.v1.ClientState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.ClientState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ibc.lightclients.solomachine.v1.ClientState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.ClientState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.lightclients.solomachine.v1.ClientState parseFrom(
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
  public static Builder newBuilder(ibc.lightclients.solomachine.v1.ClientState prototype) {
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
   * ClientState defines a solo machine client that tracks the current consensus
   * state and if the client is frozen.
   * </pre>
   *
   * Protobuf type {@code ibc.lightclients.solomachine.v1.ClientState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.lightclients.solomachine.v1.ClientState)
      ibc.lightclients.solomachine.v1.ClientStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_ClientState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_ClientState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ibc.lightclients.solomachine.v1.ClientState.class, ibc.lightclients.solomachine.v1.ClientState.Builder.class);
    }

    // Construct using ibc.lightclients.solomachine.v1.ClientState.newBuilder()
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
      sequence_ = 0L;

      frozenSequence_ = 0L;

      if (consensusStateBuilder_ == null) {
        consensusState_ = null;
      } else {
        consensusState_ = null;
        consensusStateBuilder_ = null;
      }
      allowUpdateAfterProposal_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_ClientState_descriptor;
    }

    @java.lang.Override
    public ibc.lightclients.solomachine.v1.ClientState getDefaultInstanceForType() {
      return ibc.lightclients.solomachine.v1.ClientState.getDefaultInstance();
    }

    @java.lang.Override
    public ibc.lightclients.solomachine.v1.ClientState build() {
      ibc.lightclients.solomachine.v1.ClientState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ibc.lightclients.solomachine.v1.ClientState buildPartial() {
      ibc.lightclients.solomachine.v1.ClientState result = new ibc.lightclients.solomachine.v1.ClientState(this);
      result.sequence_ = sequence_;
      result.frozenSequence_ = frozenSequence_;
      if (consensusStateBuilder_ == null) {
        result.consensusState_ = consensusState_;
      } else {
        result.consensusState_ = consensusStateBuilder_.build();
      }
      result.allowUpdateAfterProposal_ = allowUpdateAfterProposal_;
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
      if (other instanceof ibc.lightclients.solomachine.v1.ClientState) {
        return mergeFrom((ibc.lightclients.solomachine.v1.ClientState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ibc.lightclients.solomachine.v1.ClientState other) {
      if (other == ibc.lightclients.solomachine.v1.ClientState.getDefaultInstance()) return this;
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
      }
      if (other.getFrozenSequence() != 0L) {
        setFrozenSequence(other.getFrozenSequence());
      }
      if (other.hasConsensusState()) {
        mergeConsensusState(other.getConsensusState());
      }
      if (other.getAllowUpdateAfterProposal() != false) {
        setAllowUpdateAfterProposal(other.getAllowUpdateAfterProposal());
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
      ibc.lightclients.solomachine.v1.ClientState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ibc.lightclients.solomachine.v1.ClientState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long sequence_ ;
    /**
     * <pre>
     * latest sequence of the client state
     * </pre>
     *
     * <code>uint64 sequence = 1;</code>
     */
    public long getSequence() {
      return sequence_;
    }
    /**
     * <pre>
     * latest sequence of the client state
     * </pre>
     *
     * <code>uint64 sequence = 1;</code>
     */
    public Builder setSequence(long value) {
      
      sequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * latest sequence of the client state
     * </pre>
     *
     * <code>uint64 sequence = 1;</code>
     */
    public Builder clearSequence() {
      
      sequence_ = 0L;
      onChanged();
      return this;
    }

    private long frozenSequence_ ;
    /**
     * <pre>
     * frozen sequence of the solo machine
     * </pre>
     *
     * <code>uint64 frozen_sequence = 2 [(.gogoproto.moretags) = "yaml:&#92;"frozen_sequence&#92;""];</code>
     */
    public long getFrozenSequence() {
      return frozenSequence_;
    }
    /**
     * <pre>
     * frozen sequence of the solo machine
     * </pre>
     *
     * <code>uint64 frozen_sequence = 2 [(.gogoproto.moretags) = "yaml:&#92;"frozen_sequence&#92;""];</code>
     */
    public Builder setFrozenSequence(long value) {
      
      frozenSequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * frozen sequence of the solo machine
     * </pre>
     *
     * <code>uint64 frozen_sequence = 2 [(.gogoproto.moretags) = "yaml:&#92;"frozen_sequence&#92;""];</code>
     */
    public Builder clearFrozenSequence() {
      
      frozenSequence_ = 0L;
      onChanged();
      return this;
    }

    private ibc.lightclients.solomachine.v1.ConsensusState consensusState_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.lightclients.solomachine.v1.ConsensusState, ibc.lightclients.solomachine.v1.ConsensusState.Builder, ibc.lightclients.solomachine.v1.ConsensusStateOrBuilder> consensusStateBuilder_;
    /**
     * <code>.ibc.lightclients.solomachine.v1.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public boolean hasConsensusState() {
      return consensusStateBuilder_ != null || consensusState_ != null;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public ibc.lightclients.solomachine.v1.ConsensusState getConsensusState() {
      if (consensusStateBuilder_ == null) {
        return consensusState_ == null ? ibc.lightclients.solomachine.v1.ConsensusState.getDefaultInstance() : consensusState_;
      } else {
        return consensusStateBuilder_.getMessage();
      }
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public Builder setConsensusState(ibc.lightclients.solomachine.v1.ConsensusState value) {
      if (consensusStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        consensusState_ = value;
        onChanged();
      } else {
        consensusStateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public Builder setConsensusState(
        ibc.lightclients.solomachine.v1.ConsensusState.Builder builderForValue) {
      if (consensusStateBuilder_ == null) {
        consensusState_ = builderForValue.build();
        onChanged();
      } else {
        consensusStateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public Builder mergeConsensusState(ibc.lightclients.solomachine.v1.ConsensusState value) {
      if (consensusStateBuilder_ == null) {
        if (consensusState_ != null) {
          consensusState_ =
            ibc.lightclients.solomachine.v1.ConsensusState.newBuilder(consensusState_).mergeFrom(value).buildPartial();
        } else {
          consensusState_ = value;
        }
        onChanged();
      } else {
        consensusStateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public Builder clearConsensusState() {
      if (consensusStateBuilder_ == null) {
        consensusState_ = null;
        onChanged();
      } else {
        consensusState_ = null;
        consensusStateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public ibc.lightclients.solomachine.v1.ConsensusState.Builder getConsensusStateBuilder() {
      
      onChanged();
      return getConsensusStateFieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public ibc.lightclients.solomachine.v1.ConsensusStateOrBuilder getConsensusStateOrBuilder() {
      if (consensusStateBuilder_ != null) {
        return consensusStateBuilder_.getMessageOrBuilder();
      } else {
        return consensusState_ == null ?
            ibc.lightclients.solomachine.v1.ConsensusState.getDefaultInstance() : consensusState_;
      }
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.lightclients.solomachine.v1.ConsensusState, ibc.lightclients.solomachine.v1.ConsensusState.Builder, ibc.lightclients.solomachine.v1.ConsensusStateOrBuilder> 
        getConsensusStateFieldBuilder() {
      if (consensusStateBuilder_ == null) {
        consensusStateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ibc.lightclients.solomachine.v1.ConsensusState, ibc.lightclients.solomachine.v1.ConsensusState.Builder, ibc.lightclients.solomachine.v1.ConsensusStateOrBuilder>(
                getConsensusState(),
                getParentForChildren(),
                isClean());
        consensusState_ = null;
      }
      return consensusStateBuilder_;
    }

    private boolean allowUpdateAfterProposal_ ;
    /**
     * <pre>
     * when set to true, will allow governance to update a solo machine client.
     * The client will be unfrozen if it is frozen.
     * </pre>
     *
     * <code>bool allow_update_after_proposal = 4 [(.gogoproto.moretags) = "yaml:&#92;"allow_update_after_proposal&#92;""];</code>
     */
    public boolean getAllowUpdateAfterProposal() {
      return allowUpdateAfterProposal_;
    }
    /**
     * <pre>
     * when set to true, will allow governance to update a solo machine client.
     * The client will be unfrozen if it is frozen.
     * </pre>
     *
     * <code>bool allow_update_after_proposal = 4 [(.gogoproto.moretags) = "yaml:&#92;"allow_update_after_proposal&#92;""];</code>
     */
    public Builder setAllowUpdateAfterProposal(boolean value) {
      
      allowUpdateAfterProposal_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * when set to true, will allow governance to update a solo machine client.
     * The client will be unfrozen if it is frozen.
     * </pre>
     *
     * <code>bool allow_update_after_proposal = 4 [(.gogoproto.moretags) = "yaml:&#92;"allow_update_after_proposal&#92;""];</code>
     */
    public Builder clearAllowUpdateAfterProposal() {
      
      allowUpdateAfterProposal_ = false;
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


    // @@protoc_insertion_point(builder_scope:ibc.lightclients.solomachine.v1.ClientState)
  }

  // @@protoc_insertion_point(class_scope:ibc.lightclients.solomachine.v1.ClientState)
  private static final ibc.lightclients.solomachine.v1.ClientState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ibc.lightclients.solomachine.v1.ClientState();
  }

  public static ibc.lightclients.solomachine.v1.ClientState getDefaultInstance() {
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
  public ibc.lightclients.solomachine.v1.ClientState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

