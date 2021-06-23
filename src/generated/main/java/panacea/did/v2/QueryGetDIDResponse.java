// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/query.proto

package panacea.did.v2;

/**
 * Protobuf type {@code panacea.did.v2.QueryGetDIDResponse}
 */
public  final class QueryGetDIDResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.did.v2.QueryGetDIDResponse)
    QueryGetDIDResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGetDIDResponse.newBuilder() to construct.
  private QueryGetDIDResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGetDIDResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryGetDIDResponse(
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
            panacea.did.v2.DIDDocumentWithSeq.Builder subBuilder = null;
            if (dIDDocumentWithSeq_ != null) {
              subBuilder = dIDDocumentWithSeq_.toBuilder();
            }
            dIDDocumentWithSeq_ = input.readMessage(panacea.did.v2.DIDDocumentWithSeq.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dIDDocumentWithSeq_);
              dIDDocumentWithSeq_ = subBuilder.buildPartial();
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
    return panacea.did.v2.QueryOuterClass.internal_static_panacea_did_v2_QueryGetDIDResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return panacea.did.v2.QueryOuterClass.internal_static_panacea_did_v2_QueryGetDIDResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            panacea.did.v2.QueryGetDIDResponse.class, panacea.did.v2.QueryGetDIDResponse.Builder.class);
  }

  public static final int DIDDOCUMENTWITHSEQ_FIELD_NUMBER = 1;
  private panacea.did.v2.DIDDocumentWithSeq dIDDocumentWithSeq_;
  /**
   * <code>.panacea.did.v2.DIDDocumentWithSeq DIDDocumentWithSeq = 1;</code>
   */
  public boolean hasDIDDocumentWithSeq() {
    return dIDDocumentWithSeq_ != null;
  }
  /**
   * <code>.panacea.did.v2.DIDDocumentWithSeq DIDDocumentWithSeq = 1;</code>
   */
  public panacea.did.v2.DIDDocumentWithSeq getDIDDocumentWithSeq() {
    return dIDDocumentWithSeq_ == null ? panacea.did.v2.DIDDocumentWithSeq.getDefaultInstance() : dIDDocumentWithSeq_;
  }
  /**
   * <code>.panacea.did.v2.DIDDocumentWithSeq DIDDocumentWithSeq = 1;</code>
   */
  public panacea.did.v2.DIDDocumentWithSeqOrBuilder getDIDDocumentWithSeqOrBuilder() {
    return getDIDDocumentWithSeq();
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
    if (dIDDocumentWithSeq_ != null) {
      output.writeMessage(1, getDIDDocumentWithSeq());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dIDDocumentWithSeq_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDIDDocumentWithSeq());
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
    if (!(obj instanceof panacea.did.v2.QueryGetDIDResponse)) {
      return super.equals(obj);
    }
    panacea.did.v2.QueryGetDIDResponse other = (panacea.did.v2.QueryGetDIDResponse) obj;

    if (hasDIDDocumentWithSeq() != other.hasDIDDocumentWithSeq()) return false;
    if (hasDIDDocumentWithSeq()) {
      if (!getDIDDocumentWithSeq()
          .equals(other.getDIDDocumentWithSeq())) return false;
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
    if (hasDIDDocumentWithSeq()) {
      hash = (37 * hash) + DIDDOCUMENTWITHSEQ_FIELD_NUMBER;
      hash = (53 * hash) + getDIDDocumentWithSeq().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static panacea.did.v2.QueryGetDIDResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.did.v2.QueryGetDIDResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.did.v2.QueryGetDIDResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.did.v2.QueryGetDIDResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.did.v2.QueryGetDIDResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.did.v2.QueryGetDIDResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.did.v2.QueryGetDIDResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.did.v2.QueryGetDIDResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.did.v2.QueryGetDIDResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static panacea.did.v2.QueryGetDIDResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.did.v2.QueryGetDIDResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.did.v2.QueryGetDIDResponse parseFrom(
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
  public static Builder newBuilder(panacea.did.v2.QueryGetDIDResponse prototype) {
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
   * Protobuf type {@code panacea.did.v2.QueryGetDIDResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.did.v2.QueryGetDIDResponse)
      panacea.did.v2.QueryGetDIDResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return panacea.did.v2.QueryOuterClass.internal_static_panacea_did_v2_QueryGetDIDResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return panacea.did.v2.QueryOuterClass.internal_static_panacea_did_v2_QueryGetDIDResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              panacea.did.v2.QueryGetDIDResponse.class, panacea.did.v2.QueryGetDIDResponse.Builder.class);
    }

    // Construct using panacea.did.v2.QueryGetDIDResponse.newBuilder()
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
      if (dIDDocumentWithSeqBuilder_ == null) {
        dIDDocumentWithSeq_ = null;
      } else {
        dIDDocumentWithSeq_ = null;
        dIDDocumentWithSeqBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return panacea.did.v2.QueryOuterClass.internal_static_panacea_did_v2_QueryGetDIDResponse_descriptor;
    }

    @java.lang.Override
    public panacea.did.v2.QueryGetDIDResponse getDefaultInstanceForType() {
      return panacea.did.v2.QueryGetDIDResponse.getDefaultInstance();
    }

    @java.lang.Override
    public panacea.did.v2.QueryGetDIDResponse build() {
      panacea.did.v2.QueryGetDIDResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public panacea.did.v2.QueryGetDIDResponse buildPartial() {
      panacea.did.v2.QueryGetDIDResponse result = new panacea.did.v2.QueryGetDIDResponse(this);
      if (dIDDocumentWithSeqBuilder_ == null) {
        result.dIDDocumentWithSeq_ = dIDDocumentWithSeq_;
      } else {
        result.dIDDocumentWithSeq_ = dIDDocumentWithSeqBuilder_.build();
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
      if (other instanceof panacea.did.v2.QueryGetDIDResponse) {
        return mergeFrom((panacea.did.v2.QueryGetDIDResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(panacea.did.v2.QueryGetDIDResponse other) {
      if (other == panacea.did.v2.QueryGetDIDResponse.getDefaultInstance()) return this;
      if (other.hasDIDDocumentWithSeq()) {
        mergeDIDDocumentWithSeq(other.getDIDDocumentWithSeq());
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
      panacea.did.v2.QueryGetDIDResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (panacea.did.v2.QueryGetDIDResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private panacea.did.v2.DIDDocumentWithSeq dIDDocumentWithSeq_;
    private com.google.protobuf.SingleFieldBuilderV3<
        panacea.did.v2.DIDDocumentWithSeq, panacea.did.v2.DIDDocumentWithSeq.Builder, panacea.did.v2.DIDDocumentWithSeqOrBuilder> dIDDocumentWithSeqBuilder_;
    /**
     * <code>.panacea.did.v2.DIDDocumentWithSeq DIDDocumentWithSeq = 1;</code>
     */
    public boolean hasDIDDocumentWithSeq() {
      return dIDDocumentWithSeqBuilder_ != null || dIDDocumentWithSeq_ != null;
    }
    /**
     * <code>.panacea.did.v2.DIDDocumentWithSeq DIDDocumentWithSeq = 1;</code>
     */
    public panacea.did.v2.DIDDocumentWithSeq getDIDDocumentWithSeq() {
      if (dIDDocumentWithSeqBuilder_ == null) {
        return dIDDocumentWithSeq_ == null ? panacea.did.v2.DIDDocumentWithSeq.getDefaultInstance() : dIDDocumentWithSeq_;
      } else {
        return dIDDocumentWithSeqBuilder_.getMessage();
      }
    }
    /**
     * <code>.panacea.did.v2.DIDDocumentWithSeq DIDDocumentWithSeq = 1;</code>
     */
    public Builder setDIDDocumentWithSeq(panacea.did.v2.DIDDocumentWithSeq value) {
      if (dIDDocumentWithSeqBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dIDDocumentWithSeq_ = value;
        onChanged();
      } else {
        dIDDocumentWithSeqBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.panacea.did.v2.DIDDocumentWithSeq DIDDocumentWithSeq = 1;</code>
     */
    public Builder setDIDDocumentWithSeq(
        panacea.did.v2.DIDDocumentWithSeq.Builder builderForValue) {
      if (dIDDocumentWithSeqBuilder_ == null) {
        dIDDocumentWithSeq_ = builderForValue.build();
        onChanged();
      } else {
        dIDDocumentWithSeqBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.panacea.did.v2.DIDDocumentWithSeq DIDDocumentWithSeq = 1;</code>
     */
    public Builder mergeDIDDocumentWithSeq(panacea.did.v2.DIDDocumentWithSeq value) {
      if (dIDDocumentWithSeqBuilder_ == null) {
        if (dIDDocumentWithSeq_ != null) {
          dIDDocumentWithSeq_ =
            panacea.did.v2.DIDDocumentWithSeq.newBuilder(dIDDocumentWithSeq_).mergeFrom(value).buildPartial();
        } else {
          dIDDocumentWithSeq_ = value;
        }
        onChanged();
      } else {
        dIDDocumentWithSeqBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.panacea.did.v2.DIDDocumentWithSeq DIDDocumentWithSeq = 1;</code>
     */
    public Builder clearDIDDocumentWithSeq() {
      if (dIDDocumentWithSeqBuilder_ == null) {
        dIDDocumentWithSeq_ = null;
        onChanged();
      } else {
        dIDDocumentWithSeq_ = null;
        dIDDocumentWithSeqBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.panacea.did.v2.DIDDocumentWithSeq DIDDocumentWithSeq = 1;</code>
     */
    public panacea.did.v2.DIDDocumentWithSeq.Builder getDIDDocumentWithSeqBuilder() {
      
      onChanged();
      return getDIDDocumentWithSeqFieldBuilder().getBuilder();
    }
    /**
     * <code>.panacea.did.v2.DIDDocumentWithSeq DIDDocumentWithSeq = 1;</code>
     */
    public panacea.did.v2.DIDDocumentWithSeqOrBuilder getDIDDocumentWithSeqOrBuilder() {
      if (dIDDocumentWithSeqBuilder_ != null) {
        return dIDDocumentWithSeqBuilder_.getMessageOrBuilder();
      } else {
        return dIDDocumentWithSeq_ == null ?
            panacea.did.v2.DIDDocumentWithSeq.getDefaultInstance() : dIDDocumentWithSeq_;
      }
    }
    /**
     * <code>.panacea.did.v2.DIDDocumentWithSeq DIDDocumentWithSeq = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        panacea.did.v2.DIDDocumentWithSeq, panacea.did.v2.DIDDocumentWithSeq.Builder, panacea.did.v2.DIDDocumentWithSeqOrBuilder> 
        getDIDDocumentWithSeqFieldBuilder() {
      if (dIDDocumentWithSeqBuilder_ == null) {
        dIDDocumentWithSeqBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            panacea.did.v2.DIDDocumentWithSeq, panacea.did.v2.DIDDocumentWithSeq.Builder, panacea.did.v2.DIDDocumentWithSeqOrBuilder>(
                getDIDDocumentWithSeq(),
                getParentForChildren(),
                isClean());
        dIDDocumentWithSeq_ = null;
      }
      return dIDDocumentWithSeqBuilder_;
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


    // @@protoc_insertion_point(builder_scope:panacea.did.v2.QueryGetDIDResponse)
  }

  // @@protoc_insertion_point(class_scope:panacea.did.v2.QueryGetDIDResponse)
  private static final panacea.did.v2.QueryGetDIDResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new panacea.did.v2.QueryGetDIDResponse();
  }

  public static panacea.did.v2.QueryGetDIDResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGetDIDResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryGetDIDResponse>() {
    @java.lang.Override
    public QueryGetDIDResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryGetDIDResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryGetDIDResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGetDIDResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public panacea.did.v2.QueryGetDIDResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
