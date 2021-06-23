// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/store/v1beta1/snapshot.proto

package cosmos.base.store.v1beta1;

/**
 * <pre>
 * SnapshotItem is an item contained in a rootmulti.Store snapshot.
 * </pre>
 *
 * Protobuf type {@code cosmos.base.store.v1beta1.SnapshotItem}
 */
public  final class SnapshotItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.base.store.v1beta1.SnapshotItem)
    SnapshotItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SnapshotItem.newBuilder() to construct.
  private SnapshotItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SnapshotItem() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SnapshotItem(
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
            cosmos.base.store.v1beta1.SnapshotStoreItem.Builder subBuilder = null;
            if (itemCase_ == 1) {
              subBuilder = ((cosmos.base.store.v1beta1.SnapshotStoreItem) item_).toBuilder();
            }
            item_ =
                input.readMessage(cosmos.base.store.v1beta1.SnapshotStoreItem.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((cosmos.base.store.v1beta1.SnapshotStoreItem) item_);
              item_ = subBuilder.buildPartial();
            }
            itemCase_ = 1;
            break;
          }
          case 18: {
            cosmos.base.store.v1beta1.SnapshotIAVLItem.Builder subBuilder = null;
            if (itemCase_ == 2) {
              subBuilder = ((cosmos.base.store.v1beta1.SnapshotIAVLItem) item_).toBuilder();
            }
            item_ =
                input.readMessage(cosmos.base.store.v1beta1.SnapshotIAVLItem.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((cosmos.base.store.v1beta1.SnapshotIAVLItem) item_);
              item_ = subBuilder.buildPartial();
            }
            itemCase_ = 2;
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
    return cosmos.base.store.v1beta1.Snapshot.internal_static_cosmos_base_store_v1beta1_SnapshotItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.base.store.v1beta1.Snapshot.internal_static_cosmos_base_store_v1beta1_SnapshotItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.base.store.v1beta1.SnapshotItem.class, cosmos.base.store.v1beta1.SnapshotItem.Builder.class);
  }

  private int itemCase_ = 0;
  private java.lang.Object item_;
  public enum ItemCase
      implements com.google.protobuf.Internal.EnumLite {
    STORE(1),
    IAVL(2),
    ITEM_NOT_SET(0);
    private final int value;
    private ItemCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ItemCase valueOf(int value) {
      return forNumber(value);
    }

    public static ItemCase forNumber(int value) {
      switch (value) {
        case 1: return STORE;
        case 2: return IAVL;
        case 0: return ITEM_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ItemCase
  getItemCase() {
    return ItemCase.forNumber(
        itemCase_);
  }

  public static final int STORE_FIELD_NUMBER = 1;
  /**
   * <code>.cosmos.base.store.v1beta1.SnapshotStoreItem store = 1;</code>
   */
  public boolean hasStore() {
    return itemCase_ == 1;
  }
  /**
   * <code>.cosmos.base.store.v1beta1.SnapshotStoreItem store = 1;</code>
   */
  public cosmos.base.store.v1beta1.SnapshotStoreItem getStore() {
    if (itemCase_ == 1) {
       return (cosmos.base.store.v1beta1.SnapshotStoreItem) item_;
    }
    return cosmos.base.store.v1beta1.SnapshotStoreItem.getDefaultInstance();
  }
  /**
   * <code>.cosmos.base.store.v1beta1.SnapshotStoreItem store = 1;</code>
   */
  public cosmos.base.store.v1beta1.SnapshotStoreItemOrBuilder getStoreOrBuilder() {
    if (itemCase_ == 1) {
       return (cosmos.base.store.v1beta1.SnapshotStoreItem) item_;
    }
    return cosmos.base.store.v1beta1.SnapshotStoreItem.getDefaultInstance();
  }

  public static final int IAVL_FIELD_NUMBER = 2;
  /**
   * <code>.cosmos.base.store.v1beta1.SnapshotIAVLItem iavl = 2 [(.gogoproto.customname) = "IAVL"];</code>
   */
  public boolean hasIavl() {
    return itemCase_ == 2;
  }
  /**
   * <code>.cosmos.base.store.v1beta1.SnapshotIAVLItem iavl = 2 [(.gogoproto.customname) = "IAVL"];</code>
   */
  public cosmos.base.store.v1beta1.SnapshotIAVLItem getIavl() {
    if (itemCase_ == 2) {
       return (cosmos.base.store.v1beta1.SnapshotIAVLItem) item_;
    }
    return cosmos.base.store.v1beta1.SnapshotIAVLItem.getDefaultInstance();
  }
  /**
   * <code>.cosmos.base.store.v1beta1.SnapshotIAVLItem iavl = 2 [(.gogoproto.customname) = "IAVL"];</code>
   */
  public cosmos.base.store.v1beta1.SnapshotIAVLItemOrBuilder getIavlOrBuilder() {
    if (itemCase_ == 2) {
       return (cosmos.base.store.v1beta1.SnapshotIAVLItem) item_;
    }
    return cosmos.base.store.v1beta1.SnapshotIAVLItem.getDefaultInstance();
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
    if (itemCase_ == 1) {
      output.writeMessage(1, (cosmos.base.store.v1beta1.SnapshotStoreItem) item_);
    }
    if (itemCase_ == 2) {
      output.writeMessage(2, (cosmos.base.store.v1beta1.SnapshotIAVLItem) item_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (itemCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (cosmos.base.store.v1beta1.SnapshotStoreItem) item_);
    }
    if (itemCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (cosmos.base.store.v1beta1.SnapshotIAVLItem) item_);
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
    if (!(obj instanceof cosmos.base.store.v1beta1.SnapshotItem)) {
      return super.equals(obj);
    }
    cosmos.base.store.v1beta1.SnapshotItem other = (cosmos.base.store.v1beta1.SnapshotItem) obj;

    if (!getItemCase().equals(other.getItemCase())) return false;
    switch (itemCase_) {
      case 1:
        if (!getStore()
            .equals(other.getStore())) return false;
        break;
      case 2:
        if (!getIavl()
            .equals(other.getIavl())) return false;
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
    switch (itemCase_) {
      case 1:
        hash = (37 * hash) + STORE_FIELD_NUMBER;
        hash = (53 * hash) + getStore().hashCode();
        break;
      case 2:
        hash = (37 * hash) + IAVL_FIELD_NUMBER;
        hash = (53 * hash) + getIavl().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.base.store.v1beta1.SnapshotItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.store.v1beta1.SnapshotItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.store.v1beta1.SnapshotItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.store.v1beta1.SnapshotItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.store.v1beta1.SnapshotItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.base.store.v1beta1.SnapshotItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.base.store.v1beta1.SnapshotItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.base.store.v1beta1.SnapshotItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.base.store.v1beta1.SnapshotItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.base.store.v1beta1.SnapshotItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.base.store.v1beta1.SnapshotItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.base.store.v1beta1.SnapshotItem parseFrom(
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
  public static Builder newBuilder(cosmos.base.store.v1beta1.SnapshotItem prototype) {
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
   * SnapshotItem is an item contained in a rootmulti.Store snapshot.
   * </pre>
   *
   * Protobuf type {@code cosmos.base.store.v1beta1.SnapshotItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.base.store.v1beta1.SnapshotItem)
      cosmos.base.store.v1beta1.SnapshotItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.base.store.v1beta1.Snapshot.internal_static_cosmos_base_store_v1beta1_SnapshotItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.base.store.v1beta1.Snapshot.internal_static_cosmos_base_store_v1beta1_SnapshotItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.base.store.v1beta1.SnapshotItem.class, cosmos.base.store.v1beta1.SnapshotItem.Builder.class);
    }

    // Construct using cosmos.base.store.v1beta1.SnapshotItem.newBuilder()
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
      itemCase_ = 0;
      item_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.base.store.v1beta1.Snapshot.internal_static_cosmos_base_store_v1beta1_SnapshotItem_descriptor;
    }

    @java.lang.Override
    public cosmos.base.store.v1beta1.SnapshotItem getDefaultInstanceForType() {
      return cosmos.base.store.v1beta1.SnapshotItem.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.base.store.v1beta1.SnapshotItem build() {
      cosmos.base.store.v1beta1.SnapshotItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.base.store.v1beta1.SnapshotItem buildPartial() {
      cosmos.base.store.v1beta1.SnapshotItem result = new cosmos.base.store.v1beta1.SnapshotItem(this);
      if (itemCase_ == 1) {
        if (storeBuilder_ == null) {
          result.item_ = item_;
        } else {
          result.item_ = storeBuilder_.build();
        }
      }
      if (itemCase_ == 2) {
        if (iavlBuilder_ == null) {
          result.item_ = item_;
        } else {
          result.item_ = iavlBuilder_.build();
        }
      }
      result.itemCase_ = itemCase_;
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
      if (other instanceof cosmos.base.store.v1beta1.SnapshotItem) {
        return mergeFrom((cosmos.base.store.v1beta1.SnapshotItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.base.store.v1beta1.SnapshotItem other) {
      if (other == cosmos.base.store.v1beta1.SnapshotItem.getDefaultInstance()) return this;
      switch (other.getItemCase()) {
        case STORE: {
          mergeStore(other.getStore());
          break;
        }
        case IAVL: {
          mergeIavl(other.getIavl());
          break;
        }
        case ITEM_NOT_SET: {
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
      cosmos.base.store.v1beta1.SnapshotItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.base.store.v1beta1.SnapshotItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int itemCase_ = 0;
    private java.lang.Object item_;
    public ItemCase
        getItemCase() {
      return ItemCase.forNumber(
          itemCase_);
    }

    public Builder clearItem() {
      itemCase_ = 0;
      item_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.store.v1beta1.SnapshotStoreItem, cosmos.base.store.v1beta1.SnapshotStoreItem.Builder, cosmos.base.store.v1beta1.SnapshotStoreItemOrBuilder> storeBuilder_;
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotStoreItem store = 1;</code>
     */
    public boolean hasStore() {
      return itemCase_ == 1;
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotStoreItem store = 1;</code>
     */
    public cosmos.base.store.v1beta1.SnapshotStoreItem getStore() {
      if (storeBuilder_ == null) {
        if (itemCase_ == 1) {
          return (cosmos.base.store.v1beta1.SnapshotStoreItem) item_;
        }
        return cosmos.base.store.v1beta1.SnapshotStoreItem.getDefaultInstance();
      } else {
        if (itemCase_ == 1) {
          return storeBuilder_.getMessage();
        }
        return cosmos.base.store.v1beta1.SnapshotStoreItem.getDefaultInstance();
      }
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotStoreItem store = 1;</code>
     */
    public Builder setStore(cosmos.base.store.v1beta1.SnapshotStoreItem value) {
      if (storeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
        onChanged();
      } else {
        storeBuilder_.setMessage(value);
      }
      itemCase_ = 1;
      return this;
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotStoreItem store = 1;</code>
     */
    public Builder setStore(
        cosmos.base.store.v1beta1.SnapshotStoreItem.Builder builderForValue) {
      if (storeBuilder_ == null) {
        item_ = builderForValue.build();
        onChanged();
      } else {
        storeBuilder_.setMessage(builderForValue.build());
      }
      itemCase_ = 1;
      return this;
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotStoreItem store = 1;</code>
     */
    public Builder mergeStore(cosmos.base.store.v1beta1.SnapshotStoreItem value) {
      if (storeBuilder_ == null) {
        if (itemCase_ == 1 &&
            item_ != cosmos.base.store.v1beta1.SnapshotStoreItem.getDefaultInstance()) {
          item_ = cosmos.base.store.v1beta1.SnapshotStoreItem.newBuilder((cosmos.base.store.v1beta1.SnapshotStoreItem) item_)
              .mergeFrom(value).buildPartial();
        } else {
          item_ = value;
        }
        onChanged();
      } else {
        if (itemCase_ == 1) {
          storeBuilder_.mergeFrom(value);
        }
        storeBuilder_.setMessage(value);
      }
      itemCase_ = 1;
      return this;
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotStoreItem store = 1;</code>
     */
    public Builder clearStore() {
      if (storeBuilder_ == null) {
        if (itemCase_ == 1) {
          itemCase_ = 0;
          item_ = null;
          onChanged();
        }
      } else {
        if (itemCase_ == 1) {
          itemCase_ = 0;
          item_ = null;
        }
        storeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotStoreItem store = 1;</code>
     */
    public cosmos.base.store.v1beta1.SnapshotStoreItem.Builder getStoreBuilder() {
      return getStoreFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotStoreItem store = 1;</code>
     */
    public cosmos.base.store.v1beta1.SnapshotStoreItemOrBuilder getStoreOrBuilder() {
      if ((itemCase_ == 1) && (storeBuilder_ != null)) {
        return storeBuilder_.getMessageOrBuilder();
      } else {
        if (itemCase_ == 1) {
          return (cosmos.base.store.v1beta1.SnapshotStoreItem) item_;
        }
        return cosmos.base.store.v1beta1.SnapshotStoreItem.getDefaultInstance();
      }
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotStoreItem store = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.store.v1beta1.SnapshotStoreItem, cosmos.base.store.v1beta1.SnapshotStoreItem.Builder, cosmos.base.store.v1beta1.SnapshotStoreItemOrBuilder> 
        getStoreFieldBuilder() {
      if (storeBuilder_ == null) {
        if (!(itemCase_ == 1)) {
          item_ = cosmos.base.store.v1beta1.SnapshotStoreItem.getDefaultInstance();
        }
        storeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.base.store.v1beta1.SnapshotStoreItem, cosmos.base.store.v1beta1.SnapshotStoreItem.Builder, cosmos.base.store.v1beta1.SnapshotStoreItemOrBuilder>(
                (cosmos.base.store.v1beta1.SnapshotStoreItem) item_,
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      itemCase_ = 1;
      onChanged();;
      return storeBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.store.v1beta1.SnapshotIAVLItem, cosmos.base.store.v1beta1.SnapshotIAVLItem.Builder, cosmos.base.store.v1beta1.SnapshotIAVLItemOrBuilder> iavlBuilder_;
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotIAVLItem iavl = 2 [(.gogoproto.customname) = "IAVL"];</code>
     */
    public boolean hasIavl() {
      return itemCase_ == 2;
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotIAVLItem iavl = 2 [(.gogoproto.customname) = "IAVL"];</code>
     */
    public cosmos.base.store.v1beta1.SnapshotIAVLItem getIavl() {
      if (iavlBuilder_ == null) {
        if (itemCase_ == 2) {
          return (cosmos.base.store.v1beta1.SnapshotIAVLItem) item_;
        }
        return cosmos.base.store.v1beta1.SnapshotIAVLItem.getDefaultInstance();
      } else {
        if (itemCase_ == 2) {
          return iavlBuilder_.getMessage();
        }
        return cosmos.base.store.v1beta1.SnapshotIAVLItem.getDefaultInstance();
      }
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotIAVLItem iavl = 2 [(.gogoproto.customname) = "IAVL"];</code>
     */
    public Builder setIavl(cosmos.base.store.v1beta1.SnapshotIAVLItem value) {
      if (iavlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
        onChanged();
      } else {
        iavlBuilder_.setMessage(value);
      }
      itemCase_ = 2;
      return this;
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotIAVLItem iavl = 2 [(.gogoproto.customname) = "IAVL"];</code>
     */
    public Builder setIavl(
        cosmos.base.store.v1beta1.SnapshotIAVLItem.Builder builderForValue) {
      if (iavlBuilder_ == null) {
        item_ = builderForValue.build();
        onChanged();
      } else {
        iavlBuilder_.setMessage(builderForValue.build());
      }
      itemCase_ = 2;
      return this;
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotIAVLItem iavl = 2 [(.gogoproto.customname) = "IAVL"];</code>
     */
    public Builder mergeIavl(cosmos.base.store.v1beta1.SnapshotIAVLItem value) {
      if (iavlBuilder_ == null) {
        if (itemCase_ == 2 &&
            item_ != cosmos.base.store.v1beta1.SnapshotIAVLItem.getDefaultInstance()) {
          item_ = cosmos.base.store.v1beta1.SnapshotIAVLItem.newBuilder((cosmos.base.store.v1beta1.SnapshotIAVLItem) item_)
              .mergeFrom(value).buildPartial();
        } else {
          item_ = value;
        }
        onChanged();
      } else {
        if (itemCase_ == 2) {
          iavlBuilder_.mergeFrom(value);
        }
        iavlBuilder_.setMessage(value);
      }
      itemCase_ = 2;
      return this;
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotIAVLItem iavl = 2 [(.gogoproto.customname) = "IAVL"];</code>
     */
    public Builder clearIavl() {
      if (iavlBuilder_ == null) {
        if (itemCase_ == 2) {
          itemCase_ = 0;
          item_ = null;
          onChanged();
        }
      } else {
        if (itemCase_ == 2) {
          itemCase_ = 0;
          item_ = null;
        }
        iavlBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotIAVLItem iavl = 2 [(.gogoproto.customname) = "IAVL"];</code>
     */
    public cosmos.base.store.v1beta1.SnapshotIAVLItem.Builder getIavlBuilder() {
      return getIavlFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotIAVLItem iavl = 2 [(.gogoproto.customname) = "IAVL"];</code>
     */
    public cosmos.base.store.v1beta1.SnapshotIAVLItemOrBuilder getIavlOrBuilder() {
      if ((itemCase_ == 2) && (iavlBuilder_ != null)) {
        return iavlBuilder_.getMessageOrBuilder();
      } else {
        if (itemCase_ == 2) {
          return (cosmos.base.store.v1beta1.SnapshotIAVLItem) item_;
        }
        return cosmos.base.store.v1beta1.SnapshotIAVLItem.getDefaultInstance();
      }
    }
    /**
     * <code>.cosmos.base.store.v1beta1.SnapshotIAVLItem iavl = 2 [(.gogoproto.customname) = "IAVL"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.store.v1beta1.SnapshotIAVLItem, cosmos.base.store.v1beta1.SnapshotIAVLItem.Builder, cosmos.base.store.v1beta1.SnapshotIAVLItemOrBuilder> 
        getIavlFieldBuilder() {
      if (iavlBuilder_ == null) {
        if (!(itemCase_ == 2)) {
          item_ = cosmos.base.store.v1beta1.SnapshotIAVLItem.getDefaultInstance();
        }
        iavlBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.base.store.v1beta1.SnapshotIAVLItem, cosmos.base.store.v1beta1.SnapshotIAVLItem.Builder, cosmos.base.store.v1beta1.SnapshotIAVLItemOrBuilder>(
                (cosmos.base.store.v1beta1.SnapshotIAVLItem) item_,
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      itemCase_ = 2;
      onChanged();;
      return iavlBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.base.store.v1beta1.SnapshotItem)
  }

  // @@protoc_insertion_point(class_scope:cosmos.base.store.v1beta1.SnapshotItem)
  private static final cosmos.base.store.v1beta1.SnapshotItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.base.store.v1beta1.SnapshotItem();
  }

  public static cosmos.base.store.v1beta1.SnapshotItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SnapshotItem>
      PARSER = new com.google.protobuf.AbstractParser<SnapshotItem>() {
    @java.lang.Override
    public SnapshotItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SnapshotItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SnapshotItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SnapshotItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.base.store.v1beta1.SnapshotItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

