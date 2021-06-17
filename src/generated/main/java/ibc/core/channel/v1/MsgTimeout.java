// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package ibc.core.channel.v1;

/**
 * <pre>
 * MsgTimeout receives timed-out packet
 * </pre>
 *
 * Protobuf type {@code ibc.core.channel.v1.MsgTimeout}
 */
public  final class MsgTimeout extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.channel.v1.MsgTimeout)
    MsgTimeoutOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgTimeout.newBuilder() to construct.
  private MsgTimeout(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgTimeout() {
    proofUnreceived_ = com.google.protobuf.ByteString.EMPTY;
    signer_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgTimeout(
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
            ibc.core.channel.v1.Packet.Builder subBuilder = null;
            if (packet_ != null) {
              subBuilder = packet_.toBuilder();
            }
            packet_ = input.readMessage(ibc.core.channel.v1.Packet.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(packet_);
              packet_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            proofUnreceived_ = input.readBytes();
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
          case 32: {

            nextSequenceRecv_ = input.readUInt64();
            break;
          }
          case 42: {
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
    return ibc.core.channel.v1.Tx.internal_static_ibc_core_channel_v1_MsgTimeout_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ibc.core.channel.v1.Tx.internal_static_ibc_core_channel_v1_MsgTimeout_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ibc.core.channel.v1.MsgTimeout.class, ibc.core.channel.v1.MsgTimeout.Builder.class);
  }

  public static final int PACKET_FIELD_NUMBER = 1;
  private ibc.core.channel.v1.Packet packet_;
  /**
   * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasPacket() {
    return packet_ != null;
  }
  /**
   * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
   */
  public ibc.core.channel.v1.Packet getPacket() {
    return packet_ == null ? ibc.core.channel.v1.Packet.getDefaultInstance() : packet_;
  }
  /**
   * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
   */
  public ibc.core.channel.v1.PacketOrBuilder getPacketOrBuilder() {
    return getPacket();
  }

  public static final int PROOF_UNRECEIVED_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString proofUnreceived_;
  /**
   * <code>bytes proof_unreceived = 2 [(.gogoproto.moretags) = "yaml:&#92;"proof_unreceived&#92;""];</code>
   */
  public com.google.protobuf.ByteString getProofUnreceived() {
    return proofUnreceived_;
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

  public static final int NEXT_SEQUENCE_RECV_FIELD_NUMBER = 4;
  private long nextSequenceRecv_;
  /**
   * <code>uint64 next_sequence_recv = 4 [(.gogoproto.moretags) = "yaml:&#92;"next_sequence_recv&#92;""];</code>
   */
  public long getNextSequenceRecv() {
    return nextSequenceRecv_;
  }

  public static final int SIGNER_FIELD_NUMBER = 5;
  private volatile java.lang.Object signer_;
  /**
   * <code>string signer = 5;</code>
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
   * <code>string signer = 5;</code>
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
    if (packet_ != null) {
      output.writeMessage(1, getPacket());
    }
    if (!proofUnreceived_.isEmpty()) {
      output.writeBytes(2, proofUnreceived_);
    }
    if (proofHeight_ != null) {
      output.writeMessage(3, getProofHeight());
    }
    if (nextSequenceRecv_ != 0L) {
      output.writeUInt64(4, nextSequenceRecv_);
    }
    if (!getSignerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, signer_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (packet_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPacket());
    }
    if (!proofUnreceived_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, proofUnreceived_);
    }
    if (proofHeight_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProofHeight());
    }
    if (nextSequenceRecv_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, nextSequenceRecv_);
    }
    if (!getSignerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, signer_);
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
    if (!(obj instanceof ibc.core.channel.v1.MsgTimeout)) {
      return super.equals(obj);
    }
    ibc.core.channel.v1.MsgTimeout other = (ibc.core.channel.v1.MsgTimeout) obj;

    if (hasPacket() != other.hasPacket()) return false;
    if (hasPacket()) {
      if (!getPacket()
          .equals(other.getPacket())) return false;
    }
    if (!getProofUnreceived()
        .equals(other.getProofUnreceived())) return false;
    if (hasProofHeight() != other.hasProofHeight()) return false;
    if (hasProofHeight()) {
      if (!getProofHeight()
          .equals(other.getProofHeight())) return false;
    }
    if (getNextSequenceRecv()
        != other.getNextSequenceRecv()) return false;
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
    if (hasPacket()) {
      hash = (37 * hash) + PACKET_FIELD_NUMBER;
      hash = (53 * hash) + getPacket().hashCode();
    }
    hash = (37 * hash) + PROOF_UNRECEIVED_FIELD_NUMBER;
    hash = (53 * hash) + getProofUnreceived().hashCode();
    if (hasProofHeight()) {
      hash = (37 * hash) + PROOF_HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getProofHeight().hashCode();
    }
    hash = (37 * hash) + NEXT_SEQUENCE_RECV_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNextSequenceRecv());
    hash = (37 * hash) + SIGNER_FIELD_NUMBER;
    hash = (53 * hash) + getSigner().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ibc.core.channel.v1.MsgTimeout parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.channel.v1.MsgTimeout parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.channel.v1.MsgTimeout parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.channel.v1.MsgTimeout parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.channel.v1.MsgTimeout parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.core.channel.v1.MsgTimeout parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.core.channel.v1.MsgTimeout parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.core.channel.v1.MsgTimeout parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.core.channel.v1.MsgTimeout parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ibc.core.channel.v1.MsgTimeout parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.core.channel.v1.MsgTimeout parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.core.channel.v1.MsgTimeout parseFrom(
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
  public static Builder newBuilder(ibc.core.channel.v1.MsgTimeout prototype) {
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
   * MsgTimeout receives timed-out packet
   * </pre>
   *
   * Protobuf type {@code ibc.core.channel.v1.MsgTimeout}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.channel.v1.MsgTimeout)
      ibc.core.channel.v1.MsgTimeoutOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ibc.core.channel.v1.Tx.internal_static_ibc_core_channel_v1_MsgTimeout_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ibc.core.channel.v1.Tx.internal_static_ibc_core_channel_v1_MsgTimeout_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ibc.core.channel.v1.MsgTimeout.class, ibc.core.channel.v1.MsgTimeout.Builder.class);
    }

    // Construct using ibc.core.channel.v1.MsgTimeout.newBuilder()
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
      if (packetBuilder_ == null) {
        packet_ = null;
      } else {
        packet_ = null;
        packetBuilder_ = null;
      }
      proofUnreceived_ = com.google.protobuf.ByteString.EMPTY;

      if (proofHeightBuilder_ == null) {
        proofHeight_ = null;
      } else {
        proofHeight_ = null;
        proofHeightBuilder_ = null;
      }
      nextSequenceRecv_ = 0L;

      signer_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ibc.core.channel.v1.Tx.internal_static_ibc_core_channel_v1_MsgTimeout_descriptor;
    }

    @java.lang.Override
    public ibc.core.channel.v1.MsgTimeout getDefaultInstanceForType() {
      return ibc.core.channel.v1.MsgTimeout.getDefaultInstance();
    }

    @java.lang.Override
    public ibc.core.channel.v1.MsgTimeout build() {
      ibc.core.channel.v1.MsgTimeout result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ibc.core.channel.v1.MsgTimeout buildPartial() {
      ibc.core.channel.v1.MsgTimeout result = new ibc.core.channel.v1.MsgTimeout(this);
      if (packetBuilder_ == null) {
        result.packet_ = packet_;
      } else {
        result.packet_ = packetBuilder_.build();
      }
      result.proofUnreceived_ = proofUnreceived_;
      if (proofHeightBuilder_ == null) {
        result.proofHeight_ = proofHeight_;
      } else {
        result.proofHeight_ = proofHeightBuilder_.build();
      }
      result.nextSequenceRecv_ = nextSequenceRecv_;
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
      if (other instanceof ibc.core.channel.v1.MsgTimeout) {
        return mergeFrom((ibc.core.channel.v1.MsgTimeout)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ibc.core.channel.v1.MsgTimeout other) {
      if (other == ibc.core.channel.v1.MsgTimeout.getDefaultInstance()) return this;
      if (other.hasPacket()) {
        mergePacket(other.getPacket());
      }
      if (other.getProofUnreceived() != com.google.protobuf.ByteString.EMPTY) {
        setProofUnreceived(other.getProofUnreceived());
      }
      if (other.hasProofHeight()) {
        mergeProofHeight(other.getProofHeight());
      }
      if (other.getNextSequenceRecv() != 0L) {
        setNextSequenceRecv(other.getNextSequenceRecv());
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
      ibc.core.channel.v1.MsgTimeout parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ibc.core.channel.v1.MsgTimeout) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ibc.core.channel.v1.Packet packet_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.channel.v1.Packet, ibc.core.channel.v1.Packet.Builder, ibc.core.channel.v1.PacketOrBuilder> packetBuilder_;
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasPacket() {
      return packetBuilder_ != null || packet_ != null;
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
     */
    public ibc.core.channel.v1.Packet getPacket() {
      if (packetBuilder_ == null) {
        return packet_ == null ? ibc.core.channel.v1.Packet.getDefaultInstance() : packet_;
      } else {
        return packetBuilder_.getMessage();
      }
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setPacket(ibc.core.channel.v1.Packet value) {
      if (packetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        packet_ = value;
        onChanged();
      } else {
        packetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setPacket(
        ibc.core.channel.v1.Packet.Builder builderForValue) {
      if (packetBuilder_ == null) {
        packet_ = builderForValue.build();
        onChanged();
      } else {
        packetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergePacket(ibc.core.channel.v1.Packet value) {
      if (packetBuilder_ == null) {
        if (packet_ != null) {
          packet_ =
            ibc.core.channel.v1.Packet.newBuilder(packet_).mergeFrom(value).buildPartial();
        } else {
          packet_ = value;
        }
        onChanged();
      } else {
        packetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearPacket() {
      if (packetBuilder_ == null) {
        packet_ = null;
        onChanged();
      } else {
        packet_ = null;
        packetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
     */
    public ibc.core.channel.v1.Packet.Builder getPacketBuilder() {
      
      onChanged();
      return getPacketFieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
     */
    public ibc.core.channel.v1.PacketOrBuilder getPacketOrBuilder() {
      if (packetBuilder_ != null) {
        return packetBuilder_.getMessageOrBuilder();
      } else {
        return packet_ == null ?
            ibc.core.channel.v1.Packet.getDefaultInstance() : packet_;
      }
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ibc.core.channel.v1.Packet, ibc.core.channel.v1.Packet.Builder, ibc.core.channel.v1.PacketOrBuilder> 
        getPacketFieldBuilder() {
      if (packetBuilder_ == null) {
        packetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ibc.core.channel.v1.Packet, ibc.core.channel.v1.Packet.Builder, ibc.core.channel.v1.PacketOrBuilder>(
                getPacket(),
                getParentForChildren(),
                isClean());
        packet_ = null;
      }
      return packetBuilder_;
    }

    private com.google.protobuf.ByteString proofUnreceived_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes proof_unreceived = 2 [(.gogoproto.moretags) = "yaml:&#92;"proof_unreceived&#92;""];</code>
     */
    public com.google.protobuf.ByteString getProofUnreceived() {
      return proofUnreceived_;
    }
    /**
     * <code>bytes proof_unreceived = 2 [(.gogoproto.moretags) = "yaml:&#92;"proof_unreceived&#92;""];</code>
     */
    public Builder setProofUnreceived(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      proofUnreceived_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes proof_unreceived = 2 [(.gogoproto.moretags) = "yaml:&#92;"proof_unreceived&#92;""];</code>
     */
    public Builder clearProofUnreceived() {
      
      proofUnreceived_ = getDefaultInstance().getProofUnreceived();
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

    private long nextSequenceRecv_ ;
    /**
     * <code>uint64 next_sequence_recv = 4 [(.gogoproto.moretags) = "yaml:&#92;"next_sequence_recv&#92;""];</code>
     */
    public long getNextSequenceRecv() {
      return nextSequenceRecv_;
    }
    /**
     * <code>uint64 next_sequence_recv = 4 [(.gogoproto.moretags) = "yaml:&#92;"next_sequence_recv&#92;""];</code>
     */
    public Builder setNextSequenceRecv(long value) {
      
      nextSequenceRecv_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 next_sequence_recv = 4 [(.gogoproto.moretags) = "yaml:&#92;"next_sequence_recv&#92;""];</code>
     */
    public Builder clearNextSequenceRecv() {
      
      nextSequenceRecv_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object signer_ = "";
    /**
     * <code>string signer = 5;</code>
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
     * <code>string signer = 5;</code>
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
     * <code>string signer = 5;</code>
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
     * <code>string signer = 5;</code>
     */
    public Builder clearSigner() {
      
      signer_ = getDefaultInstance().getSigner();
      onChanged();
      return this;
    }
    /**
     * <code>string signer = 5;</code>
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


    // @@protoc_insertion_point(builder_scope:ibc.core.channel.v1.MsgTimeout)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.channel.v1.MsgTimeout)
  private static final ibc.core.channel.v1.MsgTimeout DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ibc.core.channel.v1.MsgTimeout();
  }

  public static ibc.core.channel.v1.MsgTimeout getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgTimeout>
      PARSER = new com.google.protobuf.AbstractParser<MsgTimeout>() {
    @java.lang.Override
    public MsgTimeout parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgTimeout(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgTimeout> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgTimeout> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ibc.core.channel.v1.MsgTimeout getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

