// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package cosmos.gov.v1beta1;

/**
 * <pre>
 * QueryProposalRequest is the request type for the Query/Proposal RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.gov.v1beta1.QueryProposalRequest}
 */
public  final class QueryProposalRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.gov.v1beta1.QueryProposalRequest)
    QueryProposalRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryProposalRequest.newBuilder() to construct.
  private QueryProposalRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryProposalRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryProposalRequest(
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

            proposalId_ = input.readUInt64();
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
    return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryProposalRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryProposalRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.gov.v1beta1.QueryProposalRequest.class, cosmos.gov.v1beta1.QueryProposalRequest.Builder.class);
  }

  public static final int PROPOSAL_ID_FIELD_NUMBER = 1;
  private long proposalId_;
  /**
   * <pre>
   * proposal_id defines the unique id of the proposal.
   * </pre>
   *
   * <code>uint64 proposal_id = 1;</code>
   */
  public long getProposalId() {
    return proposalId_;
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
    if (proposalId_ != 0L) {
      output.writeUInt64(1, proposalId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (proposalId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, proposalId_);
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
    if (!(obj instanceof cosmos.gov.v1beta1.QueryProposalRequest)) {
      return super.equals(obj);
    }
    cosmos.gov.v1beta1.QueryProposalRequest other = (cosmos.gov.v1beta1.QueryProposalRequest) obj;

    if (getProposalId()
        != other.getProposalId()) return false;
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
    hash = (37 * hash) + PROPOSAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProposalId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.gov.v1beta1.QueryProposalRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.gov.v1beta1.QueryProposalRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryProposalRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.gov.v1beta1.QueryProposalRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryProposalRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.gov.v1beta1.QueryProposalRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryProposalRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.gov.v1beta1.QueryProposalRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryProposalRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.gov.v1beta1.QueryProposalRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.gov.v1beta1.QueryProposalRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.gov.v1beta1.QueryProposalRequest parseFrom(
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
  public static Builder newBuilder(cosmos.gov.v1beta1.QueryProposalRequest prototype) {
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
   * QueryProposalRequest is the request type for the Query/Proposal RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.gov.v1beta1.QueryProposalRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.gov.v1beta1.QueryProposalRequest)
      cosmos.gov.v1beta1.QueryProposalRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryProposalRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryProposalRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.gov.v1beta1.QueryProposalRequest.class, cosmos.gov.v1beta1.QueryProposalRequest.Builder.class);
    }

    // Construct using cosmos.gov.v1beta1.QueryProposalRequest.newBuilder()
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
      proposalId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.gov.v1beta1.QueryOuterClass.internal_static_cosmos_gov_v1beta1_QueryProposalRequest_descriptor;
    }

    @java.lang.Override
    public cosmos.gov.v1beta1.QueryProposalRequest getDefaultInstanceForType() {
      return cosmos.gov.v1beta1.QueryProposalRequest.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.gov.v1beta1.QueryProposalRequest build() {
      cosmos.gov.v1beta1.QueryProposalRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.gov.v1beta1.QueryProposalRequest buildPartial() {
      cosmos.gov.v1beta1.QueryProposalRequest result = new cosmos.gov.v1beta1.QueryProposalRequest(this);
      result.proposalId_ = proposalId_;
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
      if (other instanceof cosmos.gov.v1beta1.QueryProposalRequest) {
        return mergeFrom((cosmos.gov.v1beta1.QueryProposalRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.gov.v1beta1.QueryProposalRequest other) {
      if (other == cosmos.gov.v1beta1.QueryProposalRequest.getDefaultInstance()) return this;
      if (other.getProposalId() != 0L) {
        setProposalId(other.getProposalId());
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
      cosmos.gov.v1beta1.QueryProposalRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.gov.v1beta1.QueryProposalRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long proposalId_ ;
    /**
     * <pre>
     * proposal_id defines the unique id of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1;</code>
     */
    public long getProposalId() {
      return proposalId_;
    }
    /**
     * <pre>
     * proposal_id defines the unique id of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1;</code>
     */
    public Builder setProposalId(long value) {
      
      proposalId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * proposal_id defines the unique id of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1;</code>
     */
    public Builder clearProposalId() {
      
      proposalId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:cosmos.gov.v1beta1.QueryProposalRequest)
  }

  // @@protoc_insertion_point(class_scope:cosmos.gov.v1beta1.QueryProposalRequest)
  private static final cosmos.gov.v1beta1.QueryProposalRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.gov.v1beta1.QueryProposalRequest();
  }

  public static cosmos.gov.v1beta1.QueryProposalRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryProposalRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryProposalRequest>() {
    @java.lang.Override
    public QueryProposalRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryProposalRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryProposalRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryProposalRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.gov.v1beta1.QueryProposalRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

