// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v1/solomachine.proto

package ibc.lightclients.solomachine.v1;

/**
 * <pre>
 * SignatureAndData contains a signature and the data signed over to create that
 * signature.
 * </pre>
 *
 * Protobuf type {@code ibc.lightclients.solomachine.v1.SignatureAndData}
 */
public  final class SignatureAndData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.lightclients.solomachine.v1.SignatureAndData)
    SignatureAndDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SignatureAndData.newBuilder() to construct.
  private SignatureAndData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SignatureAndData() {
    signature_ = com.google.protobuf.ByteString.EMPTY;
    dataType_ = 0;
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SignatureAndData(
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

            signature_ = input.readBytes();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            dataType_ = rawValue;
            break;
          }
          case 26: {

            data_ = input.readBytes();
            break;
          }
          case 32: {

            timestamp_ = input.readUInt64();
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
    return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_SignatureAndData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_SignatureAndData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ibc.lightclients.solomachine.v1.SignatureAndData.class, ibc.lightclients.solomachine.v1.SignatureAndData.Builder.class);
  }

  public static final int SIGNATURE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString signature_;
  /**
   * <code>bytes signature = 1;</code>
   */
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
  }

  public static final int DATA_TYPE_FIELD_NUMBER = 2;
  private int dataType_;
  /**
   * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
   */
  public int getDataTypeValue() {
    return dataType_;
  }
  /**
   * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
   */
  public ibc.lightclients.solomachine.v1.DataType getDataType() {
    @SuppressWarnings("deprecation")
    ibc.lightclients.solomachine.v1.DataType result = ibc.lightclients.solomachine.v1.DataType.valueOf(dataType_);
    return result == null ? ibc.lightclients.solomachine.v1.DataType.UNRECOGNIZED : result;
  }

  public static final int DATA_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString data_;
  /**
   * <code>bytes data = 3;</code>
   */
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 4;
  private long timestamp_;
  /**
   * <code>uint64 timestamp = 4;</code>
   */
  public long getTimestamp() {
    return timestamp_;
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
    if (!signature_.isEmpty()) {
      output.writeBytes(1, signature_);
    }
    if (dataType_ != ibc.lightclients.solomachine.v1.DataType.DATA_TYPE_UNINITIALIZED_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, dataType_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(3, data_);
    }
    if (timestamp_ != 0L) {
      output.writeUInt64(4, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, signature_);
    }
    if (dataType_ != ibc.lightclients.solomachine.v1.DataType.DATA_TYPE_UNINITIALIZED_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, dataType_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, data_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, timestamp_);
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
    if (!(obj instanceof ibc.lightclients.solomachine.v1.SignatureAndData)) {
      return super.equals(obj);
    }
    ibc.lightclients.solomachine.v1.SignatureAndData other = (ibc.lightclients.solomachine.v1.SignatureAndData) obj;

    if (!getSignature()
        .equals(other.getSignature())) return false;
    if (dataType_ != other.dataType_) return false;
    if (!getData()
        .equals(other.getData())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
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
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (37 * hash) + DATA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + dataType_;
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.SignatureAndData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ibc.lightclients.solomachine.v1.SignatureAndData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
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
  public static Builder newBuilder(ibc.lightclients.solomachine.v1.SignatureAndData prototype) {
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
   * SignatureAndData contains a signature and the data signed over to create that
   * signature.
   * </pre>
   *
   * Protobuf type {@code ibc.lightclients.solomachine.v1.SignatureAndData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.lightclients.solomachine.v1.SignatureAndData)
      ibc.lightclients.solomachine.v1.SignatureAndDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_SignatureAndData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_SignatureAndData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ibc.lightclients.solomachine.v1.SignatureAndData.class, ibc.lightclients.solomachine.v1.SignatureAndData.Builder.class);
    }

    // Construct using ibc.lightclients.solomachine.v1.SignatureAndData.newBuilder()
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
      signature_ = com.google.protobuf.ByteString.EMPTY;

      dataType_ = 0;

      data_ = com.google.protobuf.ByteString.EMPTY;

      timestamp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ibc.lightclients.solomachine.v1.Solomachine.internal_static_ibc_lightclients_solomachine_v1_SignatureAndData_descriptor;
    }

    @java.lang.Override
    public ibc.lightclients.solomachine.v1.SignatureAndData getDefaultInstanceForType() {
      return ibc.lightclients.solomachine.v1.SignatureAndData.getDefaultInstance();
    }

    @java.lang.Override
    public ibc.lightclients.solomachine.v1.SignatureAndData build() {
      ibc.lightclients.solomachine.v1.SignatureAndData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ibc.lightclients.solomachine.v1.SignatureAndData buildPartial() {
      ibc.lightclients.solomachine.v1.SignatureAndData result = new ibc.lightclients.solomachine.v1.SignatureAndData(this);
      result.signature_ = signature_;
      result.dataType_ = dataType_;
      result.data_ = data_;
      result.timestamp_ = timestamp_;
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
      if (other instanceof ibc.lightclients.solomachine.v1.SignatureAndData) {
        return mergeFrom((ibc.lightclients.solomachine.v1.SignatureAndData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ibc.lightclients.solomachine.v1.SignatureAndData other) {
      if (other == ibc.lightclients.solomachine.v1.SignatureAndData.getDefaultInstance()) return this;
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
      }
      if (other.dataType_ != 0) {
        setDataTypeValue(other.getDataTypeValue());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
      ibc.lightclients.solomachine.v1.SignatureAndData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ibc.lightclients.solomachine.v1.SignatureAndData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature = 1;</code>
     */
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes signature = 1;</code>
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      signature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature = 1;</code>
     */
    public Builder clearSignature() {
      
      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
    }

    private int dataType_ = 0;
    /**
     * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
     */
    public int getDataTypeValue() {
      return dataType_;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
     */
    public Builder setDataTypeValue(int value) {
      dataType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
     */
    public ibc.lightclients.solomachine.v1.DataType getDataType() {
      @SuppressWarnings("deprecation")
      ibc.lightclients.solomachine.v1.DataType result = ibc.lightclients.solomachine.v1.DataType.valueOf(dataType_);
      return result == null ? ibc.lightclients.solomachine.v1.DataType.UNRECOGNIZED : result;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
     */
    public Builder setDataType(ibc.lightclients.solomachine.v1.DataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dataType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
     */
    public Builder clearDataType() {
      
      dataType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes data = 3;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes data = 3;</code>
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes data = 3;</code>
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>uint64 timestamp = 4;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>uint64 timestamp = 4;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 timestamp = 4;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ibc.lightclients.solomachine.v1.SignatureAndData)
  }

  // @@protoc_insertion_point(class_scope:ibc.lightclients.solomachine.v1.SignatureAndData)
  private static final ibc.lightclients.solomachine.v1.SignatureAndData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ibc.lightclients.solomachine.v1.SignatureAndData();
  }

  public static ibc.lightclients.solomachine.v1.SignatureAndData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignatureAndData>
      PARSER = new com.google.protobuf.AbstractParser<SignatureAndData>() {
    @java.lang.Override
    public SignatureAndData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SignatureAndData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SignatureAndData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignatureAndData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ibc.lightclients.solomachine.v1.SignatureAndData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

