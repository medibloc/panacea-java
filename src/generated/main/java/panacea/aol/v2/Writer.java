// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/aol/v2/writer.proto

package panacea.aol.v2;

/**
 * <pre>
 * Topic defines a topic type.
 * </pre>
 *
 * Protobuf type {@code panacea.aol.v2.Writer}
 */
public  final class Writer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.aol.v2.Writer)
    WriterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Writer.newBuilder() to construct.
  private Writer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Writer() {
    moniker_ = "";
    description_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Writer(
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

            moniker_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 24: {

            nanoTimestamp_ = input.readInt64();
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
    return panacea.aol.v2.WriterOuterClass.internal_static_panacea_aol_v2_Writer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return panacea.aol.v2.WriterOuterClass.internal_static_panacea_aol_v2_Writer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            panacea.aol.v2.Writer.class, panacea.aol.v2.Writer.Builder.class);
  }

  public static final int MONIKER_FIELD_NUMBER = 1;
  private volatile java.lang.Object moniker_;
  /**
   * <code>string moniker = 1;</code>
   */
  public java.lang.String getMoniker() {
    java.lang.Object ref = moniker_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      moniker_ = s;
      return s;
    }
  }
  /**
   * <code>string moniker = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMonikerBytes() {
    java.lang.Object ref = moniker_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      moniker_ = b;
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

  public static final int NANO_TIMESTAMP_FIELD_NUMBER = 3;
  private long nanoTimestamp_;
  /**
   * <code>int64 nano_timestamp = 3;</code>
   */
  public long getNanoTimestamp() {
    return nanoTimestamp_;
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
    if (!getMonikerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, moniker_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (nanoTimestamp_ != 0L) {
      output.writeInt64(3, nanoTimestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMonikerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, moniker_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (nanoTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, nanoTimestamp_);
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
    if (!(obj instanceof panacea.aol.v2.Writer)) {
      return super.equals(obj);
    }
    panacea.aol.v2.Writer other = (panacea.aol.v2.Writer) obj;

    if (!getMoniker()
        .equals(other.getMoniker())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (getNanoTimestamp()
        != other.getNanoTimestamp()) return false;
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
    hash = (37 * hash) + MONIKER_FIELD_NUMBER;
    hash = (53 * hash) + getMoniker().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + NANO_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNanoTimestamp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static panacea.aol.v2.Writer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.Writer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.Writer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.Writer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.Writer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.Writer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.Writer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.Writer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.aol.v2.Writer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.Writer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.aol.v2.Writer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.Writer parseFrom(
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
  public static Builder newBuilder(panacea.aol.v2.Writer prototype) {
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
   * Topic defines a topic type.
   * </pre>
   *
   * Protobuf type {@code panacea.aol.v2.Writer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.aol.v2.Writer)
      panacea.aol.v2.WriterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return panacea.aol.v2.WriterOuterClass.internal_static_panacea_aol_v2_Writer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return panacea.aol.v2.WriterOuterClass.internal_static_panacea_aol_v2_Writer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              panacea.aol.v2.Writer.class, panacea.aol.v2.Writer.Builder.class);
    }

    // Construct using panacea.aol.v2.Writer.newBuilder()
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
      moniker_ = "";

      description_ = "";

      nanoTimestamp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return panacea.aol.v2.WriterOuterClass.internal_static_panacea_aol_v2_Writer_descriptor;
    }

    @java.lang.Override
    public panacea.aol.v2.Writer getDefaultInstanceForType() {
      return panacea.aol.v2.Writer.getDefaultInstance();
    }

    @java.lang.Override
    public panacea.aol.v2.Writer build() {
      panacea.aol.v2.Writer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public panacea.aol.v2.Writer buildPartial() {
      panacea.aol.v2.Writer result = new panacea.aol.v2.Writer(this);
      result.moniker_ = moniker_;
      result.description_ = description_;
      result.nanoTimestamp_ = nanoTimestamp_;
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
      if (other instanceof panacea.aol.v2.Writer) {
        return mergeFrom((panacea.aol.v2.Writer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(panacea.aol.v2.Writer other) {
      if (other == panacea.aol.v2.Writer.getDefaultInstance()) return this;
      if (!other.getMoniker().isEmpty()) {
        moniker_ = other.moniker_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.getNanoTimestamp() != 0L) {
        setNanoTimestamp(other.getNanoTimestamp());
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
      panacea.aol.v2.Writer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (panacea.aol.v2.Writer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object moniker_ = "";
    /**
     * <code>string moniker = 1;</code>
     */
    public java.lang.String getMoniker() {
      java.lang.Object ref = moniker_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        moniker_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string moniker = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMonikerBytes() {
      java.lang.Object ref = moniker_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        moniker_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string moniker = 1;</code>
     */
    public Builder setMoniker(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      moniker_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string moniker = 1;</code>
     */
    public Builder clearMoniker() {
      
      moniker_ = getDefaultInstance().getMoniker();
      onChanged();
      return this;
    }
    /**
     * <code>string moniker = 1;</code>
     */
    public Builder setMonikerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      moniker_ = value;
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

    private long nanoTimestamp_ ;
    /**
     * <code>int64 nano_timestamp = 3;</code>
     */
    public long getNanoTimestamp() {
      return nanoTimestamp_;
    }
    /**
     * <code>int64 nano_timestamp = 3;</code>
     */
    public Builder setNanoTimestamp(long value) {
      
      nanoTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 nano_timestamp = 3;</code>
     */
    public Builder clearNanoTimestamp() {
      
      nanoTimestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:panacea.aol.v2.Writer)
  }

  // @@protoc_insertion_point(class_scope:panacea.aol.v2.Writer)
  private static final panacea.aol.v2.Writer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new panacea.aol.v2.Writer();
  }

  public static panacea.aol.v2.Writer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Writer>
      PARSER = new com.google.protobuf.AbstractParser<Writer>() {
    @java.lang.Override
    public Writer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Writer(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Writer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Writer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public panacea.aol.v2.Writer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

