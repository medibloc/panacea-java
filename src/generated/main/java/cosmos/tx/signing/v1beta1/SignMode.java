// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/signing/v1beta1/signing.proto

package cosmos.tx.signing.v1beta1;

/**
 * <pre>
 * SignMode represents a signing mode with its own security guarantees.
 * </pre>
 *
 * Protobuf enum {@code cosmos.tx.signing.v1beta1.SignMode}
 */
public enum SignMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * SIGN_MODE_UNSPECIFIED specifies an unknown signing mode and will be
   * rejected
   * </pre>
   *
   * <code>SIGN_MODE_UNSPECIFIED = 0;</code>
   */
  SIGN_MODE_UNSPECIFIED(0),
  /**
   * <pre>
   * SIGN_MODE_DIRECT specifies a signing mode which uses SignDoc and is
   * verified with raw bytes from Tx
   * </pre>
   *
   * <code>SIGN_MODE_DIRECT = 1;</code>
   */
  SIGN_MODE_DIRECT(1),
  /**
   * <pre>
   * SIGN_MODE_TEXTUAL is a future signing mode that will verify some
   * human-readable textual representation on top of the binary representation
   * from SIGN_MODE_DIRECT
   * </pre>
   *
   * <code>SIGN_MODE_TEXTUAL = 2;</code>
   */
  SIGN_MODE_TEXTUAL(2),
  /**
   * <pre>
   * SIGN_MODE_LEGACY_AMINO_JSON is a backwards compatibility mode which uses
   * Amino JSON and will be removed in the future
   * </pre>
   *
   * <code>SIGN_MODE_LEGACY_AMINO_JSON = 127;</code>
   */
  SIGN_MODE_LEGACY_AMINO_JSON(127),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * SIGN_MODE_UNSPECIFIED specifies an unknown signing mode and will be
   * rejected
   * </pre>
   *
   * <code>SIGN_MODE_UNSPECIFIED = 0;</code>
   */
  public static final int SIGN_MODE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * SIGN_MODE_DIRECT specifies a signing mode which uses SignDoc and is
   * verified with raw bytes from Tx
   * </pre>
   *
   * <code>SIGN_MODE_DIRECT = 1;</code>
   */
  public static final int SIGN_MODE_DIRECT_VALUE = 1;
  /**
   * <pre>
   * SIGN_MODE_TEXTUAL is a future signing mode that will verify some
   * human-readable textual representation on top of the binary representation
   * from SIGN_MODE_DIRECT
   * </pre>
   *
   * <code>SIGN_MODE_TEXTUAL = 2;</code>
   */
  public static final int SIGN_MODE_TEXTUAL_VALUE = 2;
  /**
   * <pre>
   * SIGN_MODE_LEGACY_AMINO_JSON is a backwards compatibility mode which uses
   * Amino JSON and will be removed in the future
   * </pre>
   *
   * <code>SIGN_MODE_LEGACY_AMINO_JSON = 127;</code>
   */
  public static final int SIGN_MODE_LEGACY_AMINO_JSON_VALUE = 127;


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
  public static SignMode valueOf(int value) {
    return forNumber(value);
  }

  public static SignMode forNumber(int value) {
    switch (value) {
      case 0: return SIGN_MODE_UNSPECIFIED;
      case 1: return SIGN_MODE_DIRECT;
      case 2: return SIGN_MODE_TEXTUAL;
      case 127: return SIGN_MODE_LEGACY_AMINO_JSON;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SignMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SignMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SignMode>() {
          public SignMode findValueByNumber(int number) {
            return SignMode.forNumber(number);
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
    return cosmos.tx.signing.v1beta1.Signing.getDescriptor().getEnumTypes().get(0);
  }

  private static final SignMode[] VALUES = values();

  public static SignMode valueOf(
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

  private SignMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cosmos.tx.signing.v1beta1.SignMode)
}
