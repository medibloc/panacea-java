// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/proofs.proto

package ics23;

/**
 * <pre>
 *CommitmentProof is either an ExistenceProof or a NonExistenceProof, or a Batch of such messages
 * </pre>
 *
 * Protobuf type {@code ics23.CommitmentProof}
 */
public  final class CommitmentProof extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ics23.CommitmentProof)
    CommitmentProofOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommitmentProof.newBuilder() to construct.
  private CommitmentProof(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommitmentProof() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CommitmentProof(
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
            ics23.ExistenceProof.Builder subBuilder = null;
            if (proofCase_ == 1) {
              subBuilder = ((ics23.ExistenceProof) proof_).toBuilder();
            }
            proof_ =
                input.readMessage(ics23.ExistenceProof.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((ics23.ExistenceProof) proof_);
              proof_ = subBuilder.buildPartial();
            }
            proofCase_ = 1;
            break;
          }
          case 18: {
            ics23.NonExistenceProof.Builder subBuilder = null;
            if (proofCase_ == 2) {
              subBuilder = ((ics23.NonExistenceProof) proof_).toBuilder();
            }
            proof_ =
                input.readMessage(ics23.NonExistenceProof.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((ics23.NonExistenceProof) proof_);
              proof_ = subBuilder.buildPartial();
            }
            proofCase_ = 2;
            break;
          }
          case 26: {
            ics23.BatchProof.Builder subBuilder = null;
            if (proofCase_ == 3) {
              subBuilder = ((ics23.BatchProof) proof_).toBuilder();
            }
            proof_ =
                input.readMessage(ics23.BatchProof.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((ics23.BatchProof) proof_);
              proof_ = subBuilder.buildPartial();
            }
            proofCase_ = 3;
            break;
          }
          case 34: {
            ics23.CompressedBatchProof.Builder subBuilder = null;
            if (proofCase_ == 4) {
              subBuilder = ((ics23.CompressedBatchProof) proof_).toBuilder();
            }
            proof_ =
                input.readMessage(ics23.CompressedBatchProof.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((ics23.CompressedBatchProof) proof_);
              proof_ = subBuilder.buildPartial();
            }
            proofCase_ = 4;
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
    return ics23.Proofs.internal_static_ics23_CommitmentProof_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ics23.Proofs.internal_static_ics23_CommitmentProof_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ics23.CommitmentProof.class, ics23.CommitmentProof.Builder.class);
  }

  private int proofCase_ = 0;
  private java.lang.Object proof_;
  public enum ProofCase
      implements com.google.protobuf.Internal.EnumLite {
    EXIST(1),
    NONEXIST(2),
    BATCH(3),
    COMPRESSED(4),
    PROOF_NOT_SET(0);
    private final int value;
    private ProofCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ProofCase valueOf(int value) {
      return forNumber(value);
    }

    public static ProofCase forNumber(int value) {
      switch (value) {
        case 1: return EXIST;
        case 2: return NONEXIST;
        case 3: return BATCH;
        case 4: return COMPRESSED;
        case 0: return PROOF_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ProofCase
  getProofCase() {
    return ProofCase.forNumber(
        proofCase_);
  }

  public static final int EXIST_FIELD_NUMBER = 1;
  /**
   * <code>.ics23.ExistenceProof exist = 1;</code>
   */
  public boolean hasExist() {
    return proofCase_ == 1;
  }
  /**
   * <code>.ics23.ExistenceProof exist = 1;</code>
   */
  public ics23.ExistenceProof getExist() {
    if (proofCase_ == 1) {
       return (ics23.ExistenceProof) proof_;
    }
    return ics23.ExistenceProof.getDefaultInstance();
  }
  /**
   * <code>.ics23.ExistenceProof exist = 1;</code>
   */
  public ics23.ExistenceProofOrBuilder getExistOrBuilder() {
    if (proofCase_ == 1) {
       return (ics23.ExistenceProof) proof_;
    }
    return ics23.ExistenceProof.getDefaultInstance();
  }

  public static final int NONEXIST_FIELD_NUMBER = 2;
  /**
   * <code>.ics23.NonExistenceProof nonexist = 2;</code>
   */
  public boolean hasNonexist() {
    return proofCase_ == 2;
  }
  /**
   * <code>.ics23.NonExistenceProof nonexist = 2;</code>
   */
  public ics23.NonExistenceProof getNonexist() {
    if (proofCase_ == 2) {
       return (ics23.NonExistenceProof) proof_;
    }
    return ics23.NonExistenceProof.getDefaultInstance();
  }
  /**
   * <code>.ics23.NonExistenceProof nonexist = 2;</code>
   */
  public ics23.NonExistenceProofOrBuilder getNonexistOrBuilder() {
    if (proofCase_ == 2) {
       return (ics23.NonExistenceProof) proof_;
    }
    return ics23.NonExistenceProof.getDefaultInstance();
  }

  public static final int BATCH_FIELD_NUMBER = 3;
  /**
   * <code>.ics23.BatchProof batch = 3;</code>
   */
  public boolean hasBatch() {
    return proofCase_ == 3;
  }
  /**
   * <code>.ics23.BatchProof batch = 3;</code>
   */
  public ics23.BatchProof getBatch() {
    if (proofCase_ == 3) {
       return (ics23.BatchProof) proof_;
    }
    return ics23.BatchProof.getDefaultInstance();
  }
  /**
   * <code>.ics23.BatchProof batch = 3;</code>
   */
  public ics23.BatchProofOrBuilder getBatchOrBuilder() {
    if (proofCase_ == 3) {
       return (ics23.BatchProof) proof_;
    }
    return ics23.BatchProof.getDefaultInstance();
  }

  public static final int COMPRESSED_FIELD_NUMBER = 4;
  /**
   * <code>.ics23.CompressedBatchProof compressed = 4;</code>
   */
  public boolean hasCompressed() {
    return proofCase_ == 4;
  }
  /**
   * <code>.ics23.CompressedBatchProof compressed = 4;</code>
   */
  public ics23.CompressedBatchProof getCompressed() {
    if (proofCase_ == 4) {
       return (ics23.CompressedBatchProof) proof_;
    }
    return ics23.CompressedBatchProof.getDefaultInstance();
  }
  /**
   * <code>.ics23.CompressedBatchProof compressed = 4;</code>
   */
  public ics23.CompressedBatchProofOrBuilder getCompressedOrBuilder() {
    if (proofCase_ == 4) {
       return (ics23.CompressedBatchProof) proof_;
    }
    return ics23.CompressedBatchProof.getDefaultInstance();
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
    if (proofCase_ == 1) {
      output.writeMessage(1, (ics23.ExistenceProof) proof_);
    }
    if (proofCase_ == 2) {
      output.writeMessage(2, (ics23.NonExistenceProof) proof_);
    }
    if (proofCase_ == 3) {
      output.writeMessage(3, (ics23.BatchProof) proof_);
    }
    if (proofCase_ == 4) {
      output.writeMessage(4, (ics23.CompressedBatchProof) proof_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (proofCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (ics23.ExistenceProof) proof_);
    }
    if (proofCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (ics23.NonExistenceProof) proof_);
    }
    if (proofCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (ics23.BatchProof) proof_);
    }
    if (proofCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, (ics23.CompressedBatchProof) proof_);
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
    if (!(obj instanceof ics23.CommitmentProof)) {
      return super.equals(obj);
    }
    ics23.CommitmentProof other = (ics23.CommitmentProof) obj;

    if (!getProofCase().equals(other.getProofCase())) return false;
    switch (proofCase_) {
      case 1:
        if (!getExist()
            .equals(other.getExist())) return false;
        break;
      case 2:
        if (!getNonexist()
            .equals(other.getNonexist())) return false;
        break;
      case 3:
        if (!getBatch()
            .equals(other.getBatch())) return false;
        break;
      case 4:
        if (!getCompressed()
            .equals(other.getCompressed())) return false;
        break;
      case 0:
      default:
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
    switch (proofCase_) {
      case 1:
        hash = (37 * hash) + EXIST_FIELD_NUMBER;
        hash = (53 * hash) + getExist().hashCode();
        break;
      case 2:
        hash = (37 * hash) + NONEXIST_FIELD_NUMBER;
        hash = (53 * hash) + getNonexist().hashCode();
        break;
      case 3:
        hash = (37 * hash) + BATCH_FIELD_NUMBER;
        hash = (53 * hash) + getBatch().hashCode();
        break;
      case 4:
        hash = (37 * hash) + COMPRESSED_FIELD_NUMBER;
        hash = (53 * hash) + getCompressed().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ics23.CommitmentProof parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ics23.CommitmentProof parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ics23.CommitmentProof parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ics23.CommitmentProof parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ics23.CommitmentProof parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ics23.CommitmentProof parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ics23.CommitmentProof parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ics23.CommitmentProof parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ics23.CommitmentProof parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ics23.CommitmentProof parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ics23.CommitmentProof parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ics23.CommitmentProof parseFrom(
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
  public static Builder newBuilder(ics23.CommitmentProof prototype) {
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
   *CommitmentProof is either an ExistenceProof or a NonExistenceProof, or a Batch of such messages
   * </pre>
   *
   * Protobuf type {@code ics23.CommitmentProof}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ics23.CommitmentProof)
      ics23.CommitmentProofOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ics23.Proofs.internal_static_ics23_CommitmentProof_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ics23.Proofs.internal_static_ics23_CommitmentProof_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ics23.CommitmentProof.class, ics23.CommitmentProof.Builder.class);
    }

    // Construct using ics23.CommitmentProof.newBuilder()
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
      proofCase_ = 0;
      proof_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ics23.Proofs.internal_static_ics23_CommitmentProof_descriptor;
    }

    @java.lang.Override
    public ics23.CommitmentProof getDefaultInstanceForType() {
      return ics23.CommitmentProof.getDefaultInstance();
    }

    @java.lang.Override
    public ics23.CommitmentProof build() {
      ics23.CommitmentProof result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ics23.CommitmentProof buildPartial() {
      ics23.CommitmentProof result = new ics23.CommitmentProof(this);
      if (proofCase_ == 1) {
        if (existBuilder_ == null) {
          result.proof_ = proof_;
        } else {
          result.proof_ = existBuilder_.build();
        }
      }
      if (proofCase_ == 2) {
        if (nonexistBuilder_ == null) {
          result.proof_ = proof_;
        } else {
          result.proof_ = nonexistBuilder_.build();
        }
      }
      if (proofCase_ == 3) {
        if (batchBuilder_ == null) {
          result.proof_ = proof_;
        } else {
          result.proof_ = batchBuilder_.build();
        }
      }
      if (proofCase_ == 4) {
        if (compressedBuilder_ == null) {
          result.proof_ = proof_;
        } else {
          result.proof_ = compressedBuilder_.build();
        }
      }
      result.proofCase_ = proofCase_;
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
      if (other instanceof ics23.CommitmentProof) {
        return mergeFrom((ics23.CommitmentProof)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ics23.CommitmentProof other) {
      if (other == ics23.CommitmentProof.getDefaultInstance()) return this;
      switch (other.getProofCase()) {
        case EXIST: {
          mergeExist(other.getExist());
          break;
        }
        case NONEXIST: {
          mergeNonexist(other.getNonexist());
          break;
        }
        case BATCH: {
          mergeBatch(other.getBatch());
          break;
        }
        case COMPRESSED: {
          mergeCompressed(other.getCompressed());
          break;
        }
        case PROOF_NOT_SET: {
          break;
        }
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
      ics23.CommitmentProof parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ics23.CommitmentProof) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int proofCase_ = 0;
    private java.lang.Object proof_;
    public ProofCase
        getProofCase() {
      return ProofCase.forNumber(
          proofCase_);
    }

    public Builder clearProof() {
      proofCase_ = 0;
      proof_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        ics23.ExistenceProof, ics23.ExistenceProof.Builder, ics23.ExistenceProofOrBuilder> existBuilder_;
    /**
     * <code>.ics23.ExistenceProof exist = 1;</code>
     */
    public boolean hasExist() {
      return proofCase_ == 1;
    }
    /**
     * <code>.ics23.ExistenceProof exist = 1;</code>
     */
    public ics23.ExistenceProof getExist() {
      if (existBuilder_ == null) {
        if (proofCase_ == 1) {
          return (ics23.ExistenceProof) proof_;
        }
        return ics23.ExistenceProof.getDefaultInstance();
      } else {
        if (proofCase_ == 1) {
          return existBuilder_.getMessage();
        }
        return ics23.ExistenceProof.getDefaultInstance();
      }
    }
    /**
     * <code>.ics23.ExistenceProof exist = 1;</code>
     */
    public Builder setExist(ics23.ExistenceProof value) {
      if (existBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proof_ = value;
        onChanged();
      } else {
        existBuilder_.setMessage(value);
      }
      proofCase_ = 1;
      return this;
    }
    /**
     * <code>.ics23.ExistenceProof exist = 1;</code>
     */
    public Builder setExist(
        ics23.ExistenceProof.Builder builderForValue) {
      if (existBuilder_ == null) {
        proof_ = builderForValue.build();
        onChanged();
      } else {
        existBuilder_.setMessage(builderForValue.build());
      }
      proofCase_ = 1;
      return this;
    }
    /**
     * <code>.ics23.ExistenceProof exist = 1;</code>
     */
    public Builder mergeExist(ics23.ExistenceProof value) {
      if (existBuilder_ == null) {
        if (proofCase_ == 1 &&
            proof_ != ics23.ExistenceProof.getDefaultInstance()) {
          proof_ = ics23.ExistenceProof.newBuilder((ics23.ExistenceProof) proof_)
              .mergeFrom(value).buildPartial();
        } else {
          proof_ = value;
        }
        onChanged();
      } else {
        if (proofCase_ == 1) {
          existBuilder_.mergeFrom(value);
        }
        existBuilder_.setMessage(value);
      }
      proofCase_ = 1;
      return this;
    }
    /**
     * <code>.ics23.ExistenceProof exist = 1;</code>
     */
    public Builder clearExist() {
      if (existBuilder_ == null) {
        if (proofCase_ == 1) {
          proofCase_ = 0;
          proof_ = null;
          onChanged();
        }
      } else {
        if (proofCase_ == 1) {
          proofCase_ = 0;
          proof_ = null;
        }
        existBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.ics23.ExistenceProof exist = 1;</code>
     */
    public ics23.ExistenceProof.Builder getExistBuilder() {
      return getExistFieldBuilder().getBuilder();
    }
    /**
     * <code>.ics23.ExistenceProof exist = 1;</code>
     */
    public ics23.ExistenceProofOrBuilder getExistOrBuilder() {
      if ((proofCase_ == 1) && (existBuilder_ != null)) {
        return existBuilder_.getMessageOrBuilder();
      } else {
        if (proofCase_ == 1) {
          return (ics23.ExistenceProof) proof_;
        }
        return ics23.ExistenceProof.getDefaultInstance();
      }
    }
    /**
     * <code>.ics23.ExistenceProof exist = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ics23.ExistenceProof, ics23.ExistenceProof.Builder, ics23.ExistenceProofOrBuilder> 
        getExistFieldBuilder() {
      if (existBuilder_ == null) {
        if (!(proofCase_ == 1)) {
          proof_ = ics23.ExistenceProof.getDefaultInstance();
        }
        existBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ics23.ExistenceProof, ics23.ExistenceProof.Builder, ics23.ExistenceProofOrBuilder>(
                (ics23.ExistenceProof) proof_,
                getParentForChildren(),
                isClean());
        proof_ = null;
      }
      proofCase_ = 1;
      onChanged();;
      return existBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        ics23.NonExistenceProof, ics23.NonExistenceProof.Builder, ics23.NonExistenceProofOrBuilder> nonexistBuilder_;
    /**
     * <code>.ics23.NonExistenceProof nonexist = 2;</code>
     */
    public boolean hasNonexist() {
      return proofCase_ == 2;
    }
    /**
     * <code>.ics23.NonExistenceProof nonexist = 2;</code>
     */
    public ics23.NonExistenceProof getNonexist() {
      if (nonexistBuilder_ == null) {
        if (proofCase_ == 2) {
          return (ics23.NonExistenceProof) proof_;
        }
        return ics23.NonExistenceProof.getDefaultInstance();
      } else {
        if (proofCase_ == 2) {
          return nonexistBuilder_.getMessage();
        }
        return ics23.NonExistenceProof.getDefaultInstance();
      }
    }
    /**
     * <code>.ics23.NonExistenceProof nonexist = 2;</code>
     */
    public Builder setNonexist(ics23.NonExistenceProof value) {
      if (nonexistBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proof_ = value;
        onChanged();
      } else {
        nonexistBuilder_.setMessage(value);
      }
      proofCase_ = 2;
      return this;
    }
    /**
     * <code>.ics23.NonExistenceProof nonexist = 2;</code>
     */
    public Builder setNonexist(
        ics23.NonExistenceProof.Builder builderForValue) {
      if (nonexistBuilder_ == null) {
        proof_ = builderForValue.build();
        onChanged();
      } else {
        nonexistBuilder_.setMessage(builderForValue.build());
      }
      proofCase_ = 2;
      return this;
    }
    /**
     * <code>.ics23.NonExistenceProof nonexist = 2;</code>
     */
    public Builder mergeNonexist(ics23.NonExistenceProof value) {
      if (nonexistBuilder_ == null) {
        if (proofCase_ == 2 &&
            proof_ != ics23.NonExistenceProof.getDefaultInstance()) {
          proof_ = ics23.NonExistenceProof.newBuilder((ics23.NonExistenceProof) proof_)
              .mergeFrom(value).buildPartial();
        } else {
          proof_ = value;
        }
        onChanged();
      } else {
        if (proofCase_ == 2) {
          nonexistBuilder_.mergeFrom(value);
        }
        nonexistBuilder_.setMessage(value);
      }
      proofCase_ = 2;
      return this;
    }
    /**
     * <code>.ics23.NonExistenceProof nonexist = 2;</code>
     */
    public Builder clearNonexist() {
      if (nonexistBuilder_ == null) {
        if (proofCase_ == 2) {
          proofCase_ = 0;
          proof_ = null;
          onChanged();
        }
      } else {
        if (proofCase_ == 2) {
          proofCase_ = 0;
          proof_ = null;
        }
        nonexistBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.ics23.NonExistenceProof nonexist = 2;</code>
     */
    public ics23.NonExistenceProof.Builder getNonexistBuilder() {
      return getNonexistFieldBuilder().getBuilder();
    }
    /**
     * <code>.ics23.NonExistenceProof nonexist = 2;</code>
     */
    public ics23.NonExistenceProofOrBuilder getNonexistOrBuilder() {
      if ((proofCase_ == 2) && (nonexistBuilder_ != null)) {
        return nonexistBuilder_.getMessageOrBuilder();
      } else {
        if (proofCase_ == 2) {
          return (ics23.NonExistenceProof) proof_;
        }
        return ics23.NonExistenceProof.getDefaultInstance();
      }
    }
    /**
     * <code>.ics23.NonExistenceProof nonexist = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ics23.NonExistenceProof, ics23.NonExistenceProof.Builder, ics23.NonExistenceProofOrBuilder> 
        getNonexistFieldBuilder() {
      if (nonexistBuilder_ == null) {
        if (!(proofCase_ == 2)) {
          proof_ = ics23.NonExistenceProof.getDefaultInstance();
        }
        nonexistBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ics23.NonExistenceProof, ics23.NonExistenceProof.Builder, ics23.NonExistenceProofOrBuilder>(
                (ics23.NonExistenceProof) proof_,
                getParentForChildren(),
                isClean());
        proof_ = null;
      }
      proofCase_ = 2;
      onChanged();;
      return nonexistBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        ics23.BatchProof, ics23.BatchProof.Builder, ics23.BatchProofOrBuilder> batchBuilder_;
    /**
     * <code>.ics23.BatchProof batch = 3;</code>
     */
    public boolean hasBatch() {
      return proofCase_ == 3;
    }
    /**
     * <code>.ics23.BatchProof batch = 3;</code>
     */
    public ics23.BatchProof getBatch() {
      if (batchBuilder_ == null) {
        if (proofCase_ == 3) {
          return (ics23.BatchProof) proof_;
        }
        return ics23.BatchProof.getDefaultInstance();
      } else {
        if (proofCase_ == 3) {
          return batchBuilder_.getMessage();
        }
        return ics23.BatchProof.getDefaultInstance();
      }
    }
    /**
     * <code>.ics23.BatchProof batch = 3;</code>
     */
    public Builder setBatch(ics23.BatchProof value) {
      if (batchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proof_ = value;
        onChanged();
      } else {
        batchBuilder_.setMessage(value);
      }
      proofCase_ = 3;
      return this;
    }
    /**
     * <code>.ics23.BatchProof batch = 3;</code>
     */
    public Builder setBatch(
        ics23.BatchProof.Builder builderForValue) {
      if (batchBuilder_ == null) {
        proof_ = builderForValue.build();
        onChanged();
      } else {
        batchBuilder_.setMessage(builderForValue.build());
      }
      proofCase_ = 3;
      return this;
    }
    /**
     * <code>.ics23.BatchProof batch = 3;</code>
     */
    public Builder mergeBatch(ics23.BatchProof value) {
      if (batchBuilder_ == null) {
        if (proofCase_ == 3 &&
            proof_ != ics23.BatchProof.getDefaultInstance()) {
          proof_ = ics23.BatchProof.newBuilder((ics23.BatchProof) proof_)
              .mergeFrom(value).buildPartial();
        } else {
          proof_ = value;
        }
        onChanged();
      } else {
        if (proofCase_ == 3) {
          batchBuilder_.mergeFrom(value);
        }
        batchBuilder_.setMessage(value);
      }
      proofCase_ = 3;
      return this;
    }
    /**
     * <code>.ics23.BatchProof batch = 3;</code>
     */
    public Builder clearBatch() {
      if (batchBuilder_ == null) {
        if (proofCase_ == 3) {
          proofCase_ = 0;
          proof_ = null;
          onChanged();
        }
      } else {
        if (proofCase_ == 3) {
          proofCase_ = 0;
          proof_ = null;
        }
        batchBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.ics23.BatchProof batch = 3;</code>
     */
    public ics23.BatchProof.Builder getBatchBuilder() {
      return getBatchFieldBuilder().getBuilder();
    }
    /**
     * <code>.ics23.BatchProof batch = 3;</code>
     */
    public ics23.BatchProofOrBuilder getBatchOrBuilder() {
      if ((proofCase_ == 3) && (batchBuilder_ != null)) {
        return batchBuilder_.getMessageOrBuilder();
      } else {
        if (proofCase_ == 3) {
          return (ics23.BatchProof) proof_;
        }
        return ics23.BatchProof.getDefaultInstance();
      }
    }
    /**
     * <code>.ics23.BatchProof batch = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ics23.BatchProof, ics23.BatchProof.Builder, ics23.BatchProofOrBuilder> 
        getBatchFieldBuilder() {
      if (batchBuilder_ == null) {
        if (!(proofCase_ == 3)) {
          proof_ = ics23.BatchProof.getDefaultInstance();
        }
        batchBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ics23.BatchProof, ics23.BatchProof.Builder, ics23.BatchProofOrBuilder>(
                (ics23.BatchProof) proof_,
                getParentForChildren(),
                isClean());
        proof_ = null;
      }
      proofCase_ = 3;
      onChanged();;
      return batchBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        ics23.CompressedBatchProof, ics23.CompressedBatchProof.Builder, ics23.CompressedBatchProofOrBuilder> compressedBuilder_;
    /**
     * <code>.ics23.CompressedBatchProof compressed = 4;</code>
     */
    public boolean hasCompressed() {
      return proofCase_ == 4;
    }
    /**
     * <code>.ics23.CompressedBatchProof compressed = 4;</code>
     */
    public ics23.CompressedBatchProof getCompressed() {
      if (compressedBuilder_ == null) {
        if (proofCase_ == 4) {
          return (ics23.CompressedBatchProof) proof_;
        }
        return ics23.CompressedBatchProof.getDefaultInstance();
      } else {
        if (proofCase_ == 4) {
          return compressedBuilder_.getMessage();
        }
        return ics23.CompressedBatchProof.getDefaultInstance();
      }
    }
    /**
     * <code>.ics23.CompressedBatchProof compressed = 4;</code>
     */
    public Builder setCompressed(ics23.CompressedBatchProof value) {
      if (compressedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proof_ = value;
        onChanged();
      } else {
        compressedBuilder_.setMessage(value);
      }
      proofCase_ = 4;
      return this;
    }
    /**
     * <code>.ics23.CompressedBatchProof compressed = 4;</code>
     */
    public Builder setCompressed(
        ics23.CompressedBatchProof.Builder builderForValue) {
      if (compressedBuilder_ == null) {
        proof_ = builderForValue.build();
        onChanged();
      } else {
        compressedBuilder_.setMessage(builderForValue.build());
      }
      proofCase_ = 4;
      return this;
    }
    /**
     * <code>.ics23.CompressedBatchProof compressed = 4;</code>
     */
    public Builder mergeCompressed(ics23.CompressedBatchProof value) {
      if (compressedBuilder_ == null) {
        if (proofCase_ == 4 &&
            proof_ != ics23.CompressedBatchProof.getDefaultInstance()) {
          proof_ = ics23.CompressedBatchProof.newBuilder((ics23.CompressedBatchProof) proof_)
              .mergeFrom(value).buildPartial();
        } else {
          proof_ = value;
        }
        onChanged();
      } else {
        if (proofCase_ == 4) {
          compressedBuilder_.mergeFrom(value);
        }
        compressedBuilder_.setMessage(value);
      }
      proofCase_ = 4;
      return this;
    }
    /**
     * <code>.ics23.CompressedBatchProof compressed = 4;</code>
     */
    public Builder clearCompressed() {
      if (compressedBuilder_ == null) {
        if (proofCase_ == 4) {
          proofCase_ = 0;
          proof_ = null;
          onChanged();
        }
      } else {
        if (proofCase_ == 4) {
          proofCase_ = 0;
          proof_ = null;
        }
        compressedBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.ics23.CompressedBatchProof compressed = 4;</code>
     */
    public ics23.CompressedBatchProof.Builder getCompressedBuilder() {
      return getCompressedFieldBuilder().getBuilder();
    }
    /**
     * <code>.ics23.CompressedBatchProof compressed = 4;</code>
     */
    public ics23.CompressedBatchProofOrBuilder getCompressedOrBuilder() {
      if ((proofCase_ == 4) && (compressedBuilder_ != null)) {
        return compressedBuilder_.getMessageOrBuilder();
      } else {
        if (proofCase_ == 4) {
          return (ics23.CompressedBatchProof) proof_;
        }
        return ics23.CompressedBatchProof.getDefaultInstance();
      }
    }
    /**
     * <code>.ics23.CompressedBatchProof compressed = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ics23.CompressedBatchProof, ics23.CompressedBatchProof.Builder, ics23.CompressedBatchProofOrBuilder> 
        getCompressedFieldBuilder() {
      if (compressedBuilder_ == null) {
        if (!(proofCase_ == 4)) {
          proof_ = ics23.CompressedBatchProof.getDefaultInstance();
        }
        compressedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ics23.CompressedBatchProof, ics23.CompressedBatchProof.Builder, ics23.CompressedBatchProofOrBuilder>(
                (ics23.CompressedBatchProof) proof_,
                getParentForChildren(),
                isClean());
        proof_ = null;
      }
      proofCase_ = 4;
      onChanged();;
      return compressedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ics23.CommitmentProof)
  }

  // @@protoc_insertion_point(class_scope:ics23.CommitmentProof)
  private static final ics23.CommitmentProof DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ics23.CommitmentProof();
  }

  public static ics23.CommitmentProof getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitmentProof>
      PARSER = new com.google.protobuf.AbstractParser<CommitmentProof>() {
    @java.lang.Override
    public CommitmentProof parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CommitmentProof(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CommitmentProof> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommitmentProof> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ics23.CommitmentProof getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

