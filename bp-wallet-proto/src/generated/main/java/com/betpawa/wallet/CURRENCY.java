// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.betpawa.wallet;

/**
 * Protobuf enum {@code wallet.CURRENCY}
 */
public enum CURRENCY
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>USD = 0;</code>
   */
  USD(0),
  /**
   * <code>EUR = 1;</code>
   */
  EUR(1),
  /**
   * <code>GBP = 2;</code>
   */
  GBP(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>USD = 0;</code>
   */
  public static final int USD_VALUE = 0;
  /**
   * <code>EUR = 1;</code>
   */
  public static final int EUR_VALUE = 1;
  /**
   * <code>GBP = 2;</code>
   */
  public static final int GBP_VALUE = 2;


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
  public static CURRENCY valueOf(int value) {
    return forNumber(value);
  }

  public static CURRENCY forNumber(int value) {
    switch (value) {
      case 0: return USD;
      case 1: return EUR;
      case 2: return GBP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CURRENCY>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CURRENCY> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CURRENCY>() {
          public CURRENCY findValueByNumber(int number) {
            return CURRENCY.forNumber(number);
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
    return com.betpawa.wallet.WalletClass.getDescriptor().getEnumTypes().get(2);
  }

  private static final CURRENCY[] VALUES = values();

  public static CURRENCY valueOf(
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

  private CURRENCY(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:wallet.CURRENCY)
}

