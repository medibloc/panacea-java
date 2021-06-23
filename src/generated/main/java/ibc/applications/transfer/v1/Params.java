// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/transfer/v1/transfer.proto

package ibc.applications.transfer.v1;

/**
 * <pre>
 * Params defines the set of IBC transfer parameters.
 * NOTE: To prevent a single token from being transferred, set the
 * TransfersEnabled parameter to true and then set the bank module's SendEnabled
 * parameter for the denomination to false.
 * </pre>
 *
 * Protobuf type {@code ibc.applications.transfer.v1.Params}
 */
public  final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.applications.transfer.v1.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Params(
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

            sendEnabled_ = input.readBool();
            break;
          }
          case 16: {

            receiveEnabled_ = input.readBool();
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
    return ibc.applications.transfer.v1.Transfer.internal_static_ibc_applications_transfer_v1_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ibc.applications.transfer.v1.Transfer.internal_static_ibc_applications_transfer_v1_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ibc.applications.transfer.v1.Params.class, ibc.applications.transfer.v1.Params.Builder.class);
  }

  public static final int SEND_ENABLED_FIELD_NUMBER = 1;
  private boolean sendEnabled_;
  /**
   * <pre>
   * send_enabled enables or disables all cross-chain token transfers from this
   * chain.
   * </pre>
   *
   * <code>bool send_enabled = 1 [(.gogoproto.moretags) = "yaml:&#92;"send_enabled&#92;""];</code>
   */
  public boolean getSendEnabled() {
    return sendEnabled_;
  }

  public static final int RECEIVE_ENABLED_FIELD_NUMBER = 2;
  private boolean receiveEnabled_;
  /**
   * <pre>
   * receive_enabled enables or disables all cross-chain token transfers to this
   * chain.
   * </pre>
   *
   * <code>bool receive_enabled = 2 [(.gogoproto.moretags) = "yaml:&#92;"receive_enabled&#92;""];</code>
   */
  public boolean getReceiveEnabled() {
    return receiveEnabled_;
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
    if (sendEnabled_ != false) {
      output.writeBool(1, sendEnabled_);
    }
    if (receiveEnabled_ != false) {
      output.writeBool(2, receiveEnabled_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sendEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, sendEnabled_);
    }
    if (receiveEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, receiveEnabled_);
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
    if (!(obj instanceof ibc.applications.transfer.v1.Params)) {
      return super.equals(obj);
    }
    ibc.applications.transfer.v1.Params other = (ibc.applications.transfer.v1.Params) obj;

    if (getSendEnabled()
        != other.getSendEnabled()) return false;
    if (getReceiveEnabled()
        != other.getReceiveEnabled()) return false;
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
    hash = (37 * hash) + SEND_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSendEnabled());
    hash = (37 * hash) + RECEIVE_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReceiveEnabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ibc.applications.transfer.v1.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.applications.transfer.v1.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.applications.transfer.v1.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.applications.transfer.v1.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.applications.transfer.v1.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.applications.transfer.v1.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.applications.transfer.v1.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.applications.transfer.v1.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.applications.transfer.v1.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ibc.applications.transfer.v1.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.applications.transfer.v1.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.applications.transfer.v1.Params parseFrom(
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
  public static Builder newBuilder(ibc.applications.transfer.v1.Params prototype) {
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
   * Params defines the set of IBC transfer parameters.
   * NOTE: To prevent a single token from being transferred, set the
   * TransfersEnabled parameter to true and then set the bank module's SendEnabled
   * parameter for the denomination to false.
   * </pre>
   *
   * Protobuf type {@code ibc.applications.transfer.v1.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.applications.transfer.v1.Params)
      ibc.applications.transfer.v1.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ibc.applications.transfer.v1.Transfer.internal_static_ibc_applications_transfer_v1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ibc.applications.transfer.v1.Transfer.internal_static_ibc_applications_transfer_v1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ibc.applications.transfer.v1.Params.class, ibc.applications.transfer.v1.Params.Builder.class);
    }

    // Construct using ibc.applications.transfer.v1.Params.newBuilder()
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
      sendEnabled_ = false;

      receiveEnabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ibc.applications.transfer.v1.Transfer.internal_static_ibc_applications_transfer_v1_Params_descriptor;
    }

    @java.lang.Override
    public ibc.applications.transfer.v1.Params getDefaultInstanceForType() {
      return ibc.applications.transfer.v1.Params.getDefaultInstance();
    }

    @java.lang.Override
    public ibc.applications.transfer.v1.Params build() {
      ibc.applications.transfer.v1.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ibc.applications.transfer.v1.Params buildPartial() {
      ibc.applications.transfer.v1.Params result = new ibc.applications.transfer.v1.Params(this);
      result.sendEnabled_ = sendEnabled_;
      result.receiveEnabled_ = receiveEnabled_;
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
      if (other instanceof ibc.applications.transfer.v1.Params) {
        return mergeFrom((ibc.applications.transfer.v1.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ibc.applications.transfer.v1.Params other) {
      if (other == ibc.applications.transfer.v1.Params.getDefaultInstance()) return this;
      if (other.getSendEnabled() != false) {
        setSendEnabled(other.getSendEnabled());
      }
      if (other.getReceiveEnabled() != false) {
        setReceiveEnabled(other.getReceiveEnabled());
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
      ibc.applications.transfer.v1.Params parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ibc.applications.transfer.v1.Params) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean sendEnabled_ ;
    /**
     * <pre>
     * send_enabled enables or disables all cross-chain token transfers from this
     * chain.
     * </pre>
     *
     * <code>bool send_enabled = 1 [(.gogoproto.moretags) = "yaml:&#92;"send_enabled&#92;""];</code>
     */
    public boolean getSendEnabled() {
      return sendEnabled_;
    }
    /**
     * <pre>
     * send_enabled enables or disables all cross-chain token transfers from this
     * chain.
     * </pre>
     *
     * <code>bool send_enabled = 1 [(.gogoproto.moretags) = "yaml:&#92;"send_enabled&#92;""];</code>
     */
    public Builder setSendEnabled(boolean value) {
      
      sendEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * send_enabled enables or disables all cross-chain token transfers from this
     * chain.
     * </pre>
     *
     * <code>bool send_enabled = 1 [(.gogoproto.moretags) = "yaml:&#92;"send_enabled&#92;""];</code>
     */
    public Builder clearSendEnabled() {
      
      sendEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean receiveEnabled_ ;
    /**
     * <pre>
     * receive_enabled enables or disables all cross-chain token transfers to this
     * chain.
     * </pre>
     *
     * <code>bool receive_enabled = 2 [(.gogoproto.moretags) = "yaml:&#92;"receive_enabled&#92;""];</code>
     */
    public boolean getReceiveEnabled() {
      return receiveEnabled_;
    }
    /**
     * <pre>
     * receive_enabled enables or disables all cross-chain token transfers to this
     * chain.
     * </pre>
     *
     * <code>bool receive_enabled = 2 [(.gogoproto.moretags) = "yaml:&#92;"receive_enabled&#92;""];</code>
     */
    public Builder setReceiveEnabled(boolean value) {
      
      receiveEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * receive_enabled enables or disables all cross-chain token transfers to this
     * chain.
     * </pre>
     *
     * <code>bool receive_enabled = 2 [(.gogoproto.moretags) = "yaml:&#92;"receive_enabled&#92;""];</code>
     */
    public Builder clearReceiveEnabled() {
      
      receiveEnabled_ = false;
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


    // @@protoc_insertion_point(builder_scope:ibc.applications.transfer.v1.Params)
  }

  // @@protoc_insertion_point(class_scope:ibc.applications.transfer.v1.Params)
  private static final ibc.applications.transfer.v1.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ibc.applications.transfer.v1.Params();
  }

  public static ibc.applications.transfer.v1.Params getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Params>
      PARSER = new com.google.protobuf.AbstractParser<Params>() {
    @java.lang.Override
    public Params parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Params(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Params> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Params> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ibc.applications.transfer.v1.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

