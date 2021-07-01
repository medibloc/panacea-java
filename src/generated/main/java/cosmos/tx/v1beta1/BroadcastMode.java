// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

/**
 * <pre>
 * BroadcastMode specifies the broadcast mode for the TxService.Broadcast RPC method.
 * </pre>
 *
 * Protobuf enum {@code cosmos.tx.v1beta1.BroadcastMode}
 */
public enum BroadcastMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * zero-value for mode ordering
   * </pre>
   *
   * <code>BROADCAST_MODE_UNSPECIFIED = 0;</code>
   */
  BROADCAST_MODE_UNSPECIFIED(0),
  /**
   * <pre>
   * BROADCAST_MODE_BLOCK defines a tx broadcasting mode where the client waits for
   * the tx to be committed in a block.
   * </pre>
   *
   * <code>BROADCAST_MODE_BLOCK = 1;</code>
   */
  BROADCAST_MODE_BLOCK(1),
  /**
   * <pre>
   * BROADCAST_MODE_SYNC defines a tx broadcasting mode where the client waits for
   * a CheckTx execution response only.
   * </pre>
   *
   * <code>BROADCAST_MODE_SYNC = 2;</code>
   */
  BROADCAST_MODE_SYNC(2),
  /**
   * <pre>
   * BROADCAST_MODE_ASYNC defines a tx broadcasting mode where the client returns
   * immediately.
   * </pre>
   *
   * <code>BROADCAST_MODE_ASYNC = 3;</code>
   */
  BROADCAST_MODE_ASYNC(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * zero-value for mode ordering
   * </pre>
   *
   * <code>BROADCAST_MODE_UNSPECIFIED = 0;</code>
   */
  public static final int BROADCAST_MODE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * BROADCAST_MODE_BLOCK defines a tx broadcasting mode where the client waits for
   * the tx to be committed in a block.
   * </pre>
   *
   * <code>BROADCAST_MODE_BLOCK = 1;</code>
   */
  public static final int BROADCAST_MODE_BLOCK_VALUE = 1;
  /**
   * <pre>
   * BROADCAST_MODE_SYNC defines a tx broadcasting mode where the client waits for
   * a CheckTx execution response only.
   * </pre>
   *
   * <code>BROADCAST_MODE_SYNC = 2;</code>
   */
  public static final int BROADCAST_MODE_SYNC_VALUE = 2;
  /**
   * <pre>
   * BROADCAST_MODE_ASYNC defines a tx broadcasting mode where the client returns
   * immediately.
   * </pre>
   *
   * <code>BROADCAST_MODE_ASYNC = 3;</code>
   */
  public static final int BROADCAST_MODE_ASYNC_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static BroadcastMode valueOf(int value) {
    return forNumber(value);
  }

  public static BroadcastMode forNumber(int value) {
    switch (value) {
      case 0: return BROADCAST_MODE_UNSPECIFIED;
      case 1: return BROADCAST_MODE_BLOCK;
      case 2: return BROADCAST_MODE_SYNC;
      case 3: return BROADCAST_MODE_ASYNC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BroadcastMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BroadcastMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BroadcastMode>() {
          public BroadcastMode findValueByNumber(int number) {
            return BroadcastMode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return cosmos.tx.v1beta1.ServiceOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final BroadcastMode[] VALUES = values();

  public static BroadcastMode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private BroadcastMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cosmos.tx.v1beta1.BroadcastMode)
}

