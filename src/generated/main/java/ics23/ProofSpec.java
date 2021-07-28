// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/proofs.proto

package ics23;

/**
 * <pre>
 **
 *ProofSpec defines what the expected parameters are for a given proof type.
 *This can be stored in the client and used to validate any incoming proofs.
 *verify(ProofSpec, Proof) -&gt; Proof | Error
 *As demonstrated in tests, if we don't fix the algorithm used to calculate the
 *LeafHash for a given tree, there are many possible key-value pairs that can
 *generate a given hash (by interpretting the preimage differently).
 *We need this for proper security, requires client knows a priori what
 *tree format server uses. But not in code, rather a configuration object.
 * </pre>
 *
 * Protobuf type {@code ics23.ProofSpec}
 */
public  final class ProofSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ics23.ProofSpec)
    ProofSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProofSpec.newBuilder() to construct.
  private ProofSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProofSpec() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProofSpec(
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
            ics23.LeafOp.Builder subBuilder = null;
            if (leafSpec_ != null) {
              subBuilder = leafSpec_.toBuilder();
            }
            leafSpec_ = input.readMessage(ics23.LeafOp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(leafSpec_);
              leafSpec_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            ics23.InnerSpec.Builder subBuilder = null;
            if (innerSpec_ != null) {
              subBuilder = innerSpec_.toBuilder();
            }
            innerSpec_ = input.readMessage(ics23.InnerSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(innerSpec_);
              innerSpec_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            maxDepth_ = input.readInt32();
            break;
          }
          case 32: {

            minDepth_ = input.readInt32();
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
    return ics23.Proofs.internal_static_ics23_ProofSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ics23.Proofs.internal_static_ics23_ProofSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ics23.ProofSpec.class, ics23.ProofSpec.Builder.class);
  }

  public static final int LEAF_SPEC_FIELD_NUMBER = 1;
  private ics23.LeafOp leafSpec_;
  /**
   * <pre>
   * any field in the ExistenceProof must be the same as in this spec.
   * except Prefix, which is just the first bytes of prefix (spec can be longer)
   * </pre>
   *
   * <code>.ics23.LeafOp leaf_spec = 1;</code>
   */
  public boolean hasLeafSpec() {
    return leafSpec_ != null;
  }
  /**
   * <pre>
   * any field in the ExistenceProof must be the same as in this spec.
   * except Prefix, which is just the first bytes of prefix (spec can be longer)
   * </pre>
   *
   * <code>.ics23.LeafOp leaf_spec = 1;</code>
   */
  public ics23.LeafOp getLeafSpec() {
    return leafSpec_ == null ? ics23.LeafOp.getDefaultInstance() : leafSpec_;
  }
  /**
   * <pre>
   * any field in the ExistenceProof must be the same as in this spec.
   * except Prefix, which is just the first bytes of prefix (spec can be longer)
   * </pre>
   *
   * <code>.ics23.LeafOp leaf_spec = 1;</code>
   */
  public ics23.LeafOpOrBuilder getLeafSpecOrBuilder() {
    return getLeafSpec();
  }

  public static final int INNER_SPEC_FIELD_NUMBER = 2;
  private ics23.InnerSpec innerSpec_;
  /**
   * <code>.ics23.InnerSpec inner_spec = 2;</code>
   */
  public boolean hasInnerSpec() {
    return innerSpec_ != null;
  }
  /**
   * <code>.ics23.InnerSpec inner_spec = 2;</code>
   */
  public ics23.InnerSpec getInnerSpec() {
    return innerSpec_ == null ? ics23.InnerSpec.getDefaultInstance() : innerSpec_;
  }
  /**
   * <code>.ics23.InnerSpec inner_spec = 2;</code>
   */
  public ics23.InnerSpecOrBuilder getInnerSpecOrBuilder() {
    return getInnerSpec();
  }

  public static final int MAX_DEPTH_FIELD_NUMBER = 3;
  private int maxDepth_;
  /**
   * <pre>
   * max_depth (if &gt; 0) is the maximum number of InnerOps allowed (mainly for fixed-depth tries)
   * </pre>
   *
   * <code>int32 max_depth = 3;</code>
   */
  public int getMaxDepth() {
    return maxDepth_;
  }

  public static final int MIN_DEPTH_FIELD_NUMBER = 4;
  private int minDepth_;
  /**
   * <pre>
   * min_depth (if &gt; 0) is the minimum number of InnerOps allowed (mainly for fixed-depth tries)
   * </pre>
   *
   * <code>int32 min_depth = 4;</code>
   */
  public int getMinDepth() {
    return minDepth_;
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
    if (leafSpec_ != null) {
      output.writeMessage(1, getLeafSpec());
    }
    if (innerSpec_ != null) {
      output.writeMessage(2, getInnerSpec());
    }
    if (maxDepth_ != 0) {
      output.writeInt32(3, maxDepth_);
    }
    if (minDepth_ != 0) {
      output.writeInt32(4, minDepth_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (leafSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLeafSpec());
    }
    if (innerSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInnerSpec());
    }
    if (maxDepth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxDepth_);
    }
    if (minDepth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, minDepth_);
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
    if (!(obj instanceof ics23.ProofSpec)) {
      return super.equals(obj);
    }
    ics23.ProofSpec other = (ics23.ProofSpec) obj;

    if (hasLeafSpec() != other.hasLeafSpec()) return false;
    if (hasLeafSpec()) {
      if (!getLeafSpec()
          .equals(other.getLeafSpec())) return false;
    }
    if (hasInnerSpec() != other.hasInnerSpec()) return false;
    if (hasInnerSpec()) {
      if (!getInnerSpec()
          .equals(other.getInnerSpec())) return false;
    }
    if (getMaxDepth()
        != other.getMaxDepth()) return false;
    if (getMinDepth()
        != other.getMinDepth()) return false;
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
    if (hasLeafSpec()) {
      hash = (37 * hash) + LEAF_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getLeafSpec().hashCode();
    }
    if (hasInnerSpec()) {
      hash = (37 * hash) + INNER_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getInnerSpec().hashCode();
    }
    hash = (37 * hash) + MAX_DEPTH_FIELD_NUMBER;
    hash = (53 * hash) + getMaxDepth();
    hash = (37 * hash) + MIN_DEPTH_FIELD_NUMBER;
    hash = (53 * hash) + getMinDepth();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ics23.ProofSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ics23.ProofSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ics23.ProofSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ics23.ProofSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ics23.ProofSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ics23.ProofSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ics23.ProofSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ics23.ProofSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ics23.ProofSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ics23.ProofSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ics23.ProofSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ics23.ProofSpec parseFrom(
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
  public static Builder newBuilder(ics23.ProofSpec prototype) {
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
   **
   *ProofSpec defines what the expected parameters are for a given proof type.
   *This can be stored in the client and used to validate any incoming proofs.
   *verify(ProofSpec, Proof) -&gt; Proof | Error
   *As demonstrated in tests, if we don't fix the algorithm used to calculate the
   *LeafHash for a given tree, there are many possible key-value pairs that can
   *generate a given hash (by interpretting the preimage differently).
   *We need this for proper security, requires client knows a priori what
   *tree format server uses. But not in code, rather a configuration object.
   * </pre>
   *
   * Protobuf type {@code ics23.ProofSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ics23.ProofSpec)
      ics23.ProofSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ics23.Proofs.internal_static_ics23_ProofSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ics23.Proofs.internal_static_ics23_ProofSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ics23.ProofSpec.class, ics23.ProofSpec.Builder.class);
    }

    // Construct using ics23.ProofSpec.newBuilder()
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
      if (leafSpecBuilder_ == null) {
        leafSpec_ = null;
      } else {
        leafSpec_ = null;
        leafSpecBuilder_ = null;
      }
      if (innerSpecBuilder_ == null) {
        innerSpec_ = null;
      } else {
        innerSpec_ = null;
        innerSpecBuilder_ = null;
      }
      maxDepth_ = 0;

      minDepth_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ics23.Proofs.internal_static_ics23_ProofSpec_descriptor;
    }

    @java.lang.Override
    public ics23.ProofSpec getDefaultInstanceForType() {
      return ics23.ProofSpec.getDefaultInstance();
    }

    @java.lang.Override
    public ics23.ProofSpec build() {
      ics23.ProofSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ics23.ProofSpec buildPartial() {
      ics23.ProofSpec result = new ics23.ProofSpec(this);
      if (leafSpecBuilder_ == null) {
        result.leafSpec_ = leafSpec_;
      } else {
        result.leafSpec_ = leafSpecBuilder_.build();
      }
      if (innerSpecBuilder_ == null) {
        result.innerSpec_ = innerSpec_;
      } else {
        result.innerSpec_ = innerSpecBuilder_.build();
      }
      result.maxDepth_ = maxDepth_;
      result.minDepth_ = minDepth_;
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
      if (other instanceof ics23.ProofSpec) {
        return mergeFrom((ics23.ProofSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ics23.ProofSpec other) {
      if (other == ics23.ProofSpec.getDefaultInstance()) return this;
      if (other.hasLeafSpec()) {
        mergeLeafSpec(other.getLeafSpec());
      }
      if (other.hasInnerSpec()) {
        mergeInnerSpec(other.getInnerSpec());
      }
      if (other.getMaxDepth() != 0) {
        setMaxDepth(other.getMaxDepth());
      }
      if (other.getMinDepth() != 0) {
        setMinDepth(other.getMinDepth());
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
      ics23.ProofSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ics23.ProofSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ics23.LeafOp leafSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ics23.LeafOp, ics23.LeafOp.Builder, ics23.LeafOpOrBuilder> leafSpecBuilder_;
    /**
     * <pre>
     * any field in the ExistenceProof must be the same as in this spec.
     * except Prefix, which is just the first bytes of prefix (spec can be longer)
     * </pre>
     *
     * <code>.ics23.LeafOp leaf_spec = 1;</code>
     */
    public boolean hasLeafSpec() {
      return leafSpecBuilder_ != null || leafSpec_ != null;
    }
    /**
     * <pre>
     * any field in the ExistenceProof must be the same as in this spec.
     * except Prefix, which is just the first bytes of prefix (spec can be longer)
     * </pre>
     *
     * <code>.ics23.LeafOp leaf_spec = 1;</code>
     */
    public ics23.LeafOp getLeafSpec() {
      if (leafSpecBuilder_ == null) {
        return leafSpec_ == null ? ics23.LeafOp.getDefaultInstance() : leafSpec_;
      } else {
        return leafSpecBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * any field in the ExistenceProof must be the same as in this spec.
     * except Prefix, which is just the first bytes of prefix (spec can be longer)
     * </pre>
     *
     * <code>.ics23.LeafOp leaf_spec = 1;</code>
     */
    public Builder setLeafSpec(ics23.LeafOp value) {
      if (leafSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        leafSpec_ = value;
        onChanged();
      } else {
        leafSpecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * any field in the ExistenceProof must be the same as in this spec.
     * except Prefix, which is just the first bytes of prefix (spec can be longer)
     * </pre>
     *
     * <code>.ics23.LeafOp leaf_spec = 1;</code>
     */
    public Builder setLeafSpec(
        ics23.LeafOp.Builder builderForValue) {
      if (leafSpecBuilder_ == null) {
        leafSpec_ = builderForValue.build();
        onChanged();
      } else {
        leafSpecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * any field in the ExistenceProof must be the same as in this spec.
     * except Prefix, which is just the first bytes of prefix (spec can be longer)
     * </pre>
     *
     * <code>.ics23.LeafOp leaf_spec = 1;</code>
     */
    public Builder mergeLeafSpec(ics23.LeafOp value) {
      if (leafSpecBuilder_ == null) {
        if (leafSpec_ != null) {
          leafSpec_ =
            ics23.LeafOp.newBuilder(leafSpec_).mergeFrom(value).buildPartial();
        } else {
          leafSpec_ = value;
        }
        onChanged();
      } else {
        leafSpecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * any field in the ExistenceProof must be the same as in this spec.
     * except Prefix, which is just the first bytes of prefix (spec can be longer)
     * </pre>
     *
     * <code>.ics23.LeafOp leaf_spec = 1;</code>
     */
    public Builder clearLeafSpec() {
      if (leafSpecBuilder_ == null) {
        leafSpec_ = null;
        onChanged();
      } else {
        leafSpec_ = null;
        leafSpecBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * any field in the ExistenceProof must be the same as in this spec.
     * except Prefix, which is just the first bytes of prefix (spec can be longer)
     * </pre>
     *
     * <code>.ics23.LeafOp leaf_spec = 1;</code>
     */
    public ics23.LeafOp.Builder getLeafSpecBuilder() {
      
      onChanged();
      return getLeafSpecFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * any field in the ExistenceProof must be the same as in this spec.
     * except Prefix, which is just the first bytes of prefix (spec can be longer)
     * </pre>
     *
     * <code>.ics23.LeafOp leaf_spec = 1;</code>
     */
    public ics23.LeafOpOrBuilder getLeafSpecOrBuilder() {
      if (leafSpecBuilder_ != null) {
        return leafSpecBuilder_.getMessageOrBuilder();
      } else {
        return leafSpec_ == null ?
            ics23.LeafOp.getDefaultInstance() : leafSpec_;
      }
    }
    /**
     * <pre>
     * any field in the ExistenceProof must be the same as in this spec.
     * except Prefix, which is just the first bytes of prefix (spec can be longer)
     * </pre>
     *
     * <code>.ics23.LeafOp leaf_spec = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ics23.LeafOp, ics23.LeafOp.Builder, ics23.LeafOpOrBuilder> 
        getLeafSpecFieldBuilder() {
      if (leafSpecBuilder_ == null) {
        leafSpecBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ics23.LeafOp, ics23.LeafOp.Builder, ics23.LeafOpOrBuilder>(
                getLeafSpec(),
                getParentForChildren(),
                isClean());
        leafSpec_ = null;
      }
      return leafSpecBuilder_;
    }

    private ics23.InnerSpec innerSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ics23.InnerSpec, ics23.InnerSpec.Builder, ics23.InnerSpecOrBuilder> innerSpecBuilder_;
    /**
     * <code>.ics23.InnerSpec inner_spec = 2;</code>
     */
    public boolean hasInnerSpec() {
      return innerSpecBuilder_ != null || innerSpec_ != null;
    }
    /**
     * <code>.ics23.InnerSpec inner_spec = 2;</code>
     */
    public ics23.InnerSpec getInnerSpec() {
      if (innerSpecBuilder_ == null) {
        return innerSpec_ == null ? ics23.InnerSpec.getDefaultInstance() : innerSpec_;
      } else {
        return innerSpecBuilder_.getMessage();
      }
    }
    /**
     * <code>.ics23.InnerSpec inner_spec = 2;</code>
     */
    public Builder setInnerSpec(ics23.InnerSpec value) {
      if (innerSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        innerSpec_ = value;
        onChanged();
      } else {
        innerSpecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ics23.InnerSpec inner_spec = 2;</code>
     */
    public Builder setInnerSpec(
        ics23.InnerSpec.Builder builderForValue) {
      if (innerSpecBuilder_ == null) {
        innerSpec_ = builderForValue.build();
        onChanged();
      } else {
        innerSpecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ics23.InnerSpec inner_spec = 2;</code>
     */
    public Builder mergeInnerSpec(ics23.InnerSpec value) {
      if (innerSpecBuilder_ == null) {
        if (innerSpec_ != null) {
          innerSpec_ =
            ics23.InnerSpec.newBuilder(innerSpec_).mergeFrom(value).buildPartial();
        } else {
          innerSpec_ = value;
        }
        onChanged();
      } else {
        innerSpecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ics23.InnerSpec inner_spec = 2;</code>
     */
    public Builder clearInnerSpec() {
      if (innerSpecBuilder_ == null) {
        innerSpec_ = null;
        onChanged();
      } else {
        innerSpec_ = null;
        innerSpecBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ics23.InnerSpec inner_spec = 2;</code>
     */
    public ics23.InnerSpec.Builder getInnerSpecBuilder() {
      
      onChanged();
      return getInnerSpecFieldBuilder().getBuilder();
    }
    /**
     * <code>.ics23.InnerSpec inner_spec = 2;</code>
     */
    public ics23.InnerSpecOrBuilder getInnerSpecOrBuilder() {
      if (innerSpecBuilder_ != null) {
        return innerSpecBuilder_.getMessageOrBuilder();
      } else {
        return innerSpec_ == null ?
            ics23.InnerSpec.getDefaultInstance() : innerSpec_;
      }
    }
    /**
     * <code>.ics23.InnerSpec inner_spec = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ics23.InnerSpec, ics23.InnerSpec.Builder, ics23.InnerSpecOrBuilder> 
        getInnerSpecFieldBuilder() {
      if (innerSpecBuilder_ == null) {
        innerSpecBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ics23.InnerSpec, ics23.InnerSpec.Builder, ics23.InnerSpecOrBuilder>(
                getInnerSpec(),
                getParentForChildren(),
                isClean());
        innerSpec_ = null;
      }
      return innerSpecBuilder_;
    }

    private int maxDepth_ ;
    /**
     * <pre>
     * max_depth (if &gt; 0) is the maximum number of InnerOps allowed (mainly for fixed-depth tries)
     * </pre>
     *
     * <code>int32 max_depth = 3;</code>
     */
    public int getMaxDepth() {
      return maxDepth_;
    }
    /**
     * <pre>
     * max_depth (if &gt; 0) is the maximum number of InnerOps allowed (mainly for fixed-depth tries)
     * </pre>
     *
     * <code>int32 max_depth = 3;</code>
     */
    public Builder setMaxDepth(int value) {
      
      maxDepth_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * max_depth (if &gt; 0) is the maximum number of InnerOps allowed (mainly for fixed-depth tries)
     * </pre>
     *
     * <code>int32 max_depth = 3;</code>
     */
    public Builder clearMaxDepth() {
      
      maxDepth_ = 0;
      onChanged();
      return this;
    }

    private int minDepth_ ;
    /**
     * <pre>
     * min_depth (if &gt; 0) is the minimum number of InnerOps allowed (mainly for fixed-depth tries)
     * </pre>
     *
     * <code>int32 min_depth = 4;</code>
     */
    public int getMinDepth() {
      return minDepth_;
    }
    /**
     * <pre>
     * min_depth (if &gt; 0) is the minimum number of InnerOps allowed (mainly for fixed-depth tries)
     * </pre>
     *
     * <code>int32 min_depth = 4;</code>
     */
    public Builder setMinDepth(int value) {
      
      minDepth_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * min_depth (if &gt; 0) is the minimum number of InnerOps allowed (mainly for fixed-depth tries)
     * </pre>
     *
     * <code>int32 min_depth = 4;</code>
     */
    public Builder clearMinDepth() {
      
      minDepth_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ics23.ProofSpec)
  }

  // @@protoc_insertion_point(class_scope:ics23.ProofSpec)
  private static final ics23.ProofSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ics23.ProofSpec();
  }

  public static ics23.ProofSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProofSpec>
      PARSER = new com.google.protobuf.AbstractParser<ProofSpec>() {
    @java.lang.Override
    public ProofSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProofSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProofSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProofSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ics23.ProofSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

