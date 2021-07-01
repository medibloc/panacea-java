// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/aol/v2/record.proto

package panacea.aol.v2;

/**
 * Protobuf type {@code panacea.aol.v2.Record}
 */
public  final class Record extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.aol.v2.Record)
    RecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Record.newBuilder() to construct.
  private Record(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Record() {
    key_ = com.google.protobuf.ByteString.EMPTY;
    value_ = com.google.protobuf.ByteString.EMPTY;
    writerAddress_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Record(
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

            key_ = input.readBytes();
            break;
          }
          case 18: {

            value_ = input.readBytes();
            break;
          }
          case 24: {

            nanoTimestamp_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            writerAddress_ = s;
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
    return panacea.aol.v2.RecordOuterClass.internal_static_panacea_aol_v2_Record_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return panacea.aol.v2.RecordOuterClass.internal_static_panacea_aol_v2_Record_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            panacea.aol.v2.Record.class, panacea.aol.v2.Record.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_;
  /**
   * <code>bytes key = 1;</code>
   */
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString value_;
  /**
   * <code>bytes value = 2;</code>
   */
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }

  public static final int NANOTIMESTAMP_FIELD_NUMBER = 3;
  private long nanoTimestamp_;
  /**
   * <code>int64 nanoTimestamp = 3;</code>
   */
  public long getNanoTimestamp() {
    return nanoTimestamp_;
  }

  public static final int WRITERADDRESS_FIELD_NUMBER = 4;
  private volatile java.lang.Object writerAddress_;
  /**
   * <code>string writerAddress = 4;</code>
   */
  public java.lang.String getWriterAddress() {
    java.lang.Object ref = writerAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      writerAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string writerAddress = 4;</code>
   */
  public com.google.protobuf.ByteString
      getWriterAddressBytes() {
    java.lang.Object ref = writerAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      writerAddress_ = b;
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
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (!value_.isEmpty()) {
      output.writeBytes(2, value_);
    }
    if (nanoTimestamp_ != 0L) {
      output.writeInt64(3, nanoTimestamp_);
    }
    if (!getWriterAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, writerAddress_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, key_);
    }
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, value_);
    }
    if (nanoTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, nanoTimestamp_);
    }
    if (!getWriterAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, writerAddress_);
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
    if (!(obj instanceof panacea.aol.v2.Record)) {
      return super.equals(obj);
    }
    panacea.aol.v2.Record other = (panacea.aol.v2.Record) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
    if (getNanoTimestamp()
        != other.getNanoTimestamp()) return false;
    if (!getWriterAddress()
        .equals(other.getWriterAddress())) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + NANOTIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNanoTimestamp());
    hash = (37 * hash) + WRITERADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getWriterAddress().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static panacea.aol.v2.Record parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.Record parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.Record parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.Record parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.Record parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.Record parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.Record parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.Record parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.aol.v2.Record parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.Record parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.aol.v2.Record parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.Record parseFrom(
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
  public static Builder newBuilder(panacea.aol.v2.Record prototype) {
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
   * Protobuf type {@code panacea.aol.v2.Record}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.aol.v2.Record)
      panacea.aol.v2.RecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return panacea.aol.v2.RecordOuterClass.internal_static_panacea_aol_v2_Record_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return panacea.aol.v2.RecordOuterClass.internal_static_panacea_aol_v2_Record_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              panacea.aol.v2.Record.class, panacea.aol.v2.Record.Builder.class);
    }

    // Construct using panacea.aol.v2.Record.newBuilder()
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
      key_ = com.google.protobuf.ByteString.EMPTY;

      value_ = com.google.protobuf.ByteString.EMPTY;

      nanoTimestamp_ = 0L;

      writerAddress_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return panacea.aol.v2.RecordOuterClass.internal_static_panacea_aol_v2_Record_descriptor;
    }

    @java.lang.Override
    public panacea.aol.v2.Record getDefaultInstanceForType() {
      return panacea.aol.v2.Record.getDefaultInstance();
    }

    @java.lang.Override
    public panacea.aol.v2.Record build() {
      panacea.aol.v2.Record result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public panacea.aol.v2.Record buildPartial() {
      panacea.aol.v2.Record result = new panacea.aol.v2.Record(this);
      result.key_ = key_;
      result.value_ = value_;
      result.nanoTimestamp_ = nanoTimestamp_;
      result.writerAddress_ = writerAddress_;
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
      if (other instanceof panacea.aol.v2.Record) {
        return mergeFrom((panacea.aol.v2.Record)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(panacea.aol.v2.Record other) {
      if (other == panacea.aol.v2.Record.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
      }
      if (other.getNanoTimestamp() != 0L) {
        setNanoTimestamp(other.getNanoTimestamp());
      }
      if (!other.getWriterAddress().isEmpty()) {
        writerAddress_ = other.writerAddress_;
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
      panacea.aol.v2.Record parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (panacea.aol.v2.Record) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes key = 1;</code>
     */
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <code>bytes key = 1;</code>
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes key = 1;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes value = 2;</code>
     */
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <code>bytes value = 2;</code>
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes value = 2;</code>
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }

    private long nanoTimestamp_ ;
    /**
     * <code>int64 nanoTimestamp = 3;</code>
     */
    public long getNanoTimestamp() {
      return nanoTimestamp_;
    }
    /**
     * <code>int64 nanoTimestamp = 3;</code>
     */
    public Builder setNanoTimestamp(long value) {
      
      nanoTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 nanoTimestamp = 3;</code>
     */
    public Builder clearNanoTimestamp() {
      
      nanoTimestamp_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object writerAddress_ = "";
    /**
     * <code>string writerAddress = 4;</code>
     */
    public java.lang.String getWriterAddress() {
      java.lang.Object ref = writerAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        writerAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string writerAddress = 4;</code>
     */
    public com.google.protobuf.ByteString
        getWriterAddressBytes() {
      java.lang.Object ref = writerAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        writerAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string writerAddress = 4;</code>
     */
    public Builder setWriterAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      writerAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string writerAddress = 4;</code>
     */
    public Builder clearWriterAddress() {
      
      writerAddress_ = getDefaultInstance().getWriterAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string writerAddress = 4;</code>
     */
    public Builder setWriterAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      writerAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:panacea.aol.v2.Record)
  }

  // @@protoc_insertion_point(class_scope:panacea.aol.v2.Record)
  private static final panacea.aol.v2.Record DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new panacea.aol.v2.Record();
  }

  public static panacea.aol.v2.Record getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Record>
      PARSER = new com.google.protobuf.AbstractParser<Record>() {
    @java.lang.Override
    public Record parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Record(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Record> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Record> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public panacea.aol.v2.Record getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

