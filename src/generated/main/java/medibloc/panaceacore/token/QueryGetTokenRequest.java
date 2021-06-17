// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: token/query.proto

package medibloc.panaceacore.token;

/**
 * <pre>
 * this line is used by starport scaffolding # 3
 * </pre>
 *
 * Protobuf type {@code medibloc.panaceacore.token.QueryGetTokenRequest}
 */
public  final class QueryGetTokenRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:medibloc.panaceacore.token.QueryGetTokenRequest)
    QueryGetTokenRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGetTokenRequest.newBuilder() to construct.
  private QueryGetTokenRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGetTokenRequest() {
    symbol_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryGetTokenRequest(
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

            symbol_ = s;
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
    return medibloc.panaceacore.token.QueryOuterClass.internal_static_medibloc_panaceacore_token_QueryGetTokenRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return medibloc.panaceacore.token.QueryOuterClass.internal_static_medibloc_panaceacore_token_QueryGetTokenRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            medibloc.panaceacore.token.QueryGetTokenRequest.class, medibloc.panaceacore.token.QueryGetTokenRequest.Builder.class);
  }

  public static final int SYMBOL_FIELD_NUMBER = 1;
  private volatile java.lang.Object symbol_;
  /**
   * <code>string symbol = 1;</code>
   */
  public java.lang.String getSymbol() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      symbol_ = s;
      return s;
    }
  }
  /**
   * <code>string symbol = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSymbolBytes() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      symbol_ = b;
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
    if (!getSymbolBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, symbol_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSymbolBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, symbol_);
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
    if (!(obj instanceof medibloc.panaceacore.token.QueryGetTokenRequest)) {
      return super.equals(obj);
    }
    medibloc.panaceacore.token.QueryGetTokenRequest other = (medibloc.panaceacore.token.QueryGetTokenRequest) obj;

    if (!getSymbol()
        .equals(other.getSymbol())) return false;
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
    hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
    hash = (53 * hash) + getSymbol().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static medibloc.panaceacore.token.QueryGetTokenRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static medibloc.panaceacore.token.QueryGetTokenRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static medibloc.panaceacore.token.QueryGetTokenRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static medibloc.panaceacore.token.QueryGetTokenRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static medibloc.panaceacore.token.QueryGetTokenRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static medibloc.panaceacore.token.QueryGetTokenRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static medibloc.panaceacore.token.QueryGetTokenRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static medibloc.panaceacore.token.QueryGetTokenRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static medibloc.panaceacore.token.QueryGetTokenRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static medibloc.panaceacore.token.QueryGetTokenRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static medibloc.panaceacore.token.QueryGetTokenRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static medibloc.panaceacore.token.QueryGetTokenRequest parseFrom(
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
  public static Builder newBuilder(medibloc.panaceacore.token.QueryGetTokenRequest prototype) {
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
   * this line is used by starport scaffolding # 3
   * </pre>
   *
   * Protobuf type {@code medibloc.panaceacore.token.QueryGetTokenRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:medibloc.panaceacore.token.QueryGetTokenRequest)
      medibloc.panaceacore.token.QueryGetTokenRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return medibloc.panaceacore.token.QueryOuterClass.internal_static_medibloc_panaceacore_token_QueryGetTokenRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return medibloc.panaceacore.token.QueryOuterClass.internal_static_medibloc_panaceacore_token_QueryGetTokenRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              medibloc.panaceacore.token.QueryGetTokenRequest.class, medibloc.panaceacore.token.QueryGetTokenRequest.Builder.class);
    }

    // Construct using medibloc.panaceacore.token.QueryGetTokenRequest.newBuilder()
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
      symbol_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return medibloc.panaceacore.token.QueryOuterClass.internal_static_medibloc_panaceacore_token_QueryGetTokenRequest_descriptor;
    }

    @java.lang.Override
    public medibloc.panaceacore.token.QueryGetTokenRequest getDefaultInstanceForType() {
      return medibloc.panaceacore.token.QueryGetTokenRequest.getDefaultInstance();
    }

    @java.lang.Override
    public medibloc.panaceacore.token.QueryGetTokenRequest build() {
      medibloc.panaceacore.token.QueryGetTokenRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public medibloc.panaceacore.token.QueryGetTokenRequest buildPartial() {
      medibloc.panaceacore.token.QueryGetTokenRequest result = new medibloc.panaceacore.token.QueryGetTokenRequest(this);
      result.symbol_ = symbol_;
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
      if (other instanceof medibloc.panaceacore.token.QueryGetTokenRequest) {
        return mergeFrom((medibloc.panaceacore.token.QueryGetTokenRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(medibloc.panaceacore.token.QueryGetTokenRequest other) {
      if (other == medibloc.panaceacore.token.QueryGetTokenRequest.getDefaultInstance()) return this;
      if (!other.getSymbol().isEmpty()) {
        symbol_ = other.symbol_;
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
      medibloc.panaceacore.token.QueryGetTokenRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (medibloc.panaceacore.token.QueryGetTokenRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object symbol_ = "";
    /**
     * <code>string symbol = 1;</code>
     */
    public java.lang.String getSymbol() {
      java.lang.Object ref = symbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        symbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string symbol = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSymbolBytes() {
      java.lang.Object ref = symbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string symbol = 1;</code>
     */
    public Builder setSymbol(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      symbol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 1;</code>
     */
    public Builder clearSymbol() {
      
      symbol_ = getDefaultInstance().getSymbol();
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 1;</code>
     */
    public Builder setSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      symbol_ = value;
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


    // @@protoc_insertion_point(builder_scope:medibloc.panaceacore.token.QueryGetTokenRequest)
  }

  // @@protoc_insertion_point(class_scope:medibloc.panaceacore.token.QueryGetTokenRequest)
  private static final medibloc.panaceacore.token.QueryGetTokenRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new medibloc.panaceacore.token.QueryGetTokenRequest();
  }

  public static medibloc.panaceacore.token.QueryGetTokenRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGetTokenRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryGetTokenRequest>() {
    @java.lang.Override
    public QueryGetTokenRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryGetTokenRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryGetTokenRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGetTokenRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public medibloc.panaceacore.token.QueryGetTokenRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

