// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/upgrade/v1beta1/upgrade.proto

package cosmos.upgrade.v1beta1;

/**
 * <pre>
 * SoftwareUpgradeProposal is a gov Content type for initiating a software
 * upgrade.
 * </pre>
 *
 * Protobuf type {@code cosmos.upgrade.v1beta1.SoftwareUpgradeProposal}
 */
public  final class SoftwareUpgradeProposal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.upgrade.v1beta1.SoftwareUpgradeProposal)
    SoftwareUpgradeProposalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SoftwareUpgradeProposal.newBuilder() to construct.
  private SoftwareUpgradeProposal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SoftwareUpgradeProposal() {
    title_ = "";
    description_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SoftwareUpgradeProposal(
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

            title_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 26: {
            cosmos.upgrade.v1beta1.Plan.Builder subBuilder = null;
            if (plan_ != null) {
              subBuilder = plan_.toBuilder();
            }
            plan_ = input.readMessage(cosmos.upgrade.v1beta1.Plan.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(plan_);
              plan_ = subBuilder.buildPartial();
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
    return cosmos.upgrade.v1beta1.Upgrade.internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.upgrade.v1beta1.Upgrade.internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.class, cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 1;</code>
   */
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 2;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAN_FIELD_NUMBER = 3;
  private cosmos.upgrade.v1beta1.Plan plan_;
  /**
   * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasPlan() {
    return plan_ != null;
  }
  /**
   * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.upgrade.v1beta1.Plan getPlan() {
    return plan_ == null ? cosmos.upgrade.v1beta1.Plan.getDefaultInstance() : plan_;
  }
  /**
   * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [(.gogoproto.nullable) = false];</code>
   */
  public cosmos.upgrade.v1beta1.PlanOrBuilder getPlanOrBuilder() {
    return getPlan();
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
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (plan_ != null) {
      output.writeMessage(3, getPlan());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (plan_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPlan());
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
    if (!(obj instanceof cosmos.upgrade.v1beta1.SoftwareUpgradeProposal)) {
      return super.equals(obj);
    }
    cosmos.upgrade.v1beta1.SoftwareUpgradeProposal other = (cosmos.upgrade.v1beta1.SoftwareUpgradeProposal) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (hasPlan() != other.hasPlan()) return false;
    if (hasPlan()) {
      if (!getPlan()
          .equals(other.getPlan())) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (hasPlan()) {
      hash = (37 * hash) + PLAN_FIELD_NUMBER;
      hash = (53 * hash) + getPlan().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parseFrom(
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
  public static Builder newBuilder(cosmos.upgrade.v1beta1.SoftwareUpgradeProposal prototype) {
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
   * SoftwareUpgradeProposal is a gov Content type for initiating a software
   * upgrade.
   * </pre>
   *
   * Protobuf type {@code cosmos.upgrade.v1beta1.SoftwareUpgradeProposal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.upgrade.v1beta1.SoftwareUpgradeProposal)
      cosmos.upgrade.v1beta1.SoftwareUpgradeProposalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.upgrade.v1beta1.Upgrade.internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.upgrade.v1beta1.Upgrade.internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.class, cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.Builder.class);
    }

    // Construct using cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.newBuilder()
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
      title_ = "";

      description_ = "";

      if (planBuilder_ == null) {
        plan_ = null;
      } else {
        plan_ = null;
        planBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.upgrade.v1beta1.Upgrade.internal_static_cosmos_upgrade_v1beta1_SoftwareUpgradeProposal_descriptor;
    }

    @java.lang.Override
    public cosmos.upgrade.v1beta1.SoftwareUpgradeProposal getDefaultInstanceForType() {
      return cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.upgrade.v1beta1.SoftwareUpgradeProposal build() {
      cosmos.upgrade.v1beta1.SoftwareUpgradeProposal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.upgrade.v1beta1.SoftwareUpgradeProposal buildPartial() {
      cosmos.upgrade.v1beta1.SoftwareUpgradeProposal result = new cosmos.upgrade.v1beta1.SoftwareUpgradeProposal(this);
      result.title_ = title_;
      result.description_ = description_;
      if (planBuilder_ == null) {
        result.plan_ = plan_;
      } else {
        result.plan_ = planBuilder_.build();
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
      if (other instanceof cosmos.upgrade.v1beta1.SoftwareUpgradeProposal) {
        return mergeFrom((cosmos.upgrade.v1beta1.SoftwareUpgradeProposal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.upgrade.v1beta1.SoftwareUpgradeProposal other) {
      if (other == cosmos.upgrade.v1beta1.SoftwareUpgradeProposal.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.hasPlan()) {
        mergePlan(other.getPlan());
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
      cosmos.upgrade.v1beta1.SoftwareUpgradeProposal parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.upgrade.v1beta1.SoftwareUpgradeProposal) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 1;</code>
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 2;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 2;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private cosmos.upgrade.v1beta1.Plan plan_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.upgrade.v1beta1.Plan, cosmos.upgrade.v1beta1.Plan.Builder, cosmos.upgrade.v1beta1.PlanOrBuilder> planBuilder_;
    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasPlan() {
      return planBuilder_ != null || plan_ != null;
    }
    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.upgrade.v1beta1.Plan getPlan() {
      if (planBuilder_ == null) {
        return plan_ == null ? cosmos.upgrade.v1beta1.Plan.getDefaultInstance() : plan_;
      } else {
        return planBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setPlan(cosmos.upgrade.v1beta1.Plan value) {
      if (planBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        plan_ = value;
        onChanged();
      } else {
        planBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setPlan(
        cosmos.upgrade.v1beta1.Plan.Builder builderForValue) {
      if (planBuilder_ == null) {
        plan_ = builderForValue.build();
        onChanged();
      } else {
        planBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergePlan(cosmos.upgrade.v1beta1.Plan value) {
      if (planBuilder_ == null) {
        if (plan_ != null) {
          plan_ =
            cosmos.upgrade.v1beta1.Plan.newBuilder(plan_).mergeFrom(value).buildPartial();
        } else {
          plan_ = value;
        }
        onChanged();
      } else {
        planBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearPlan() {
      if (planBuilder_ == null) {
        plan_ = null;
        onChanged();
      } else {
        plan_ = null;
        planBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.upgrade.v1beta1.Plan.Builder getPlanBuilder() {
      
      onChanged();
      return getPlanFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.upgrade.v1beta1.PlanOrBuilder getPlanOrBuilder() {
      if (planBuilder_ != null) {
        return planBuilder_.getMessageOrBuilder();
      } else {
        return plan_ == null ?
            cosmos.upgrade.v1beta1.Plan.getDefaultInstance() : plan_;
      }
    }
    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.upgrade.v1beta1.Plan, cosmos.upgrade.v1beta1.Plan.Builder, cosmos.upgrade.v1beta1.PlanOrBuilder> 
        getPlanFieldBuilder() {
      if (planBuilder_ == null) {
        planBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.upgrade.v1beta1.Plan, cosmos.upgrade.v1beta1.Plan.Builder, cosmos.upgrade.v1beta1.PlanOrBuilder>(
                getPlan(),
                getParentForChildren(),
                isClean());
        plan_ = null;
      }
      return planBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.upgrade.v1beta1.SoftwareUpgradeProposal)
  }

  // @@protoc_insertion_point(class_scope:cosmos.upgrade.v1beta1.SoftwareUpgradeProposal)
  private static final cosmos.upgrade.v1beta1.SoftwareUpgradeProposal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.upgrade.v1beta1.SoftwareUpgradeProposal();
  }

  public static cosmos.upgrade.v1beta1.SoftwareUpgradeProposal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SoftwareUpgradeProposal>
      PARSER = new com.google.protobuf.AbstractParser<SoftwareUpgradeProposal>() {
    @java.lang.Override
    public SoftwareUpgradeProposal parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SoftwareUpgradeProposal(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SoftwareUpgradeProposal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SoftwareUpgradeProposal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.upgrade.v1beta1.SoftwareUpgradeProposal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
