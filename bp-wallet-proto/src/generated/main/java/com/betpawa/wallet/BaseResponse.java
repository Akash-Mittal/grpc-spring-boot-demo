// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.betpawa.wallet;

/**
 * Protobuf type {@code wallet.BaseResponse}
 */
public  final class BaseResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wallet.BaseResponse)
    BaseResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BaseResponse.newBuilder() to construct.
  private BaseResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BaseResponse() {
    statusCode_ = 0;
    statusMessage_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BaseResponse(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            statusCode_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            statusMessage_ = rawValue;
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
    return com.betpawa.wallet.WalletClass.internal_static_wallet_BaseResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.betpawa.wallet.WalletClass.internal_static_wallet_BaseResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.betpawa.wallet.BaseResponse.class, com.betpawa.wallet.BaseResponse.Builder.class);
  }

  public static final int STATUSCODE_FIELD_NUMBER = 1;
  private int statusCode_;
  /**
   * <code>.wallet.StatusCode statusCode = 1;</code>
   */
  public int getStatusCodeValue() {
    return statusCode_;
  }
  /**
   * <code>.wallet.StatusCode statusCode = 1;</code>
   */
  public com.betpawa.wallet.StatusCode getStatusCode() {
    com.betpawa.wallet.StatusCode result = com.betpawa.wallet.StatusCode.valueOf(statusCode_);
    return result == null ? com.betpawa.wallet.StatusCode.UNRECOGNIZED : result;
  }

  public static final int STATUSMESSAGE_FIELD_NUMBER = 2;
  private int statusMessage_;
  /**
   * <code>.wallet.StatusMessage statusMessage = 2;</code>
   */
  public int getStatusMessageValue() {
    return statusMessage_;
  }
  /**
   * <code>.wallet.StatusMessage statusMessage = 2;</code>
   */
  public com.betpawa.wallet.StatusMessage getStatusMessage() {
    com.betpawa.wallet.StatusMessage result = com.betpawa.wallet.StatusMessage.valueOf(statusMessage_);
    return result == null ? com.betpawa.wallet.StatusMessage.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (statusCode_ != com.betpawa.wallet.StatusCode.BP_WALLET_000.getNumber()) {
      output.writeEnum(1, statusCode_);
    }
    if (statusMessage_ != com.betpawa.wallet.StatusMessage.USER_DOES_NOT_EXIST.getNumber()) {
      output.writeEnum(2, statusMessage_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (statusCode_ != com.betpawa.wallet.StatusCode.BP_WALLET_000.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, statusCode_);
    }
    if (statusMessage_ != com.betpawa.wallet.StatusMessage.USER_DOES_NOT_EXIST.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, statusMessage_);
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
    if (!(obj instanceof com.betpawa.wallet.BaseResponse)) {
      return super.equals(obj);
    }
    com.betpawa.wallet.BaseResponse other = (com.betpawa.wallet.BaseResponse) obj;

    boolean result = true;
    result = result && statusCode_ == other.statusCode_;
    result = result && statusMessage_ == other.statusMessage_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUSCODE_FIELD_NUMBER;
    hash = (53 * hash) + statusCode_;
    hash = (37 * hash) + STATUSMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + statusMessage_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.betpawa.wallet.BaseResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.betpawa.wallet.BaseResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.betpawa.wallet.BaseResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.betpawa.wallet.BaseResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.betpawa.wallet.BaseResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.betpawa.wallet.BaseResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.betpawa.wallet.BaseResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.betpawa.wallet.BaseResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.betpawa.wallet.BaseResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.betpawa.wallet.BaseResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.betpawa.wallet.BaseResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.betpawa.wallet.BaseResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.betpawa.wallet.BaseResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code wallet.BaseResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wallet.BaseResponse)
      com.betpawa.wallet.BaseResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.betpawa.wallet.WalletClass.internal_static_wallet_BaseResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.betpawa.wallet.WalletClass.internal_static_wallet_BaseResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.betpawa.wallet.BaseResponse.class, com.betpawa.wallet.BaseResponse.Builder.class);
    }

    // Construct using com.betpawa.wallet.BaseResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      statusCode_ = 0;

      statusMessage_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.betpawa.wallet.WalletClass.internal_static_wallet_BaseResponse_descriptor;
    }

    public com.betpawa.wallet.BaseResponse getDefaultInstanceForType() {
      return com.betpawa.wallet.BaseResponse.getDefaultInstance();
    }

    public com.betpawa.wallet.BaseResponse build() {
      com.betpawa.wallet.BaseResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.betpawa.wallet.BaseResponse buildPartial() {
      com.betpawa.wallet.BaseResponse result = new com.betpawa.wallet.BaseResponse(this);
      result.statusCode_ = statusCode_;
      result.statusMessage_ = statusMessage_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.betpawa.wallet.BaseResponse) {
        return mergeFrom((com.betpawa.wallet.BaseResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.betpawa.wallet.BaseResponse other) {
      if (other == com.betpawa.wallet.BaseResponse.getDefaultInstance()) return this;
      if (other.statusCode_ != 0) {
        setStatusCodeValue(other.getStatusCodeValue());
      }
      if (other.statusMessage_ != 0) {
        setStatusMessageValue(other.getStatusMessageValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.betpawa.wallet.BaseResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.betpawa.wallet.BaseResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int statusCode_ = 0;
    /**
     * <code>.wallet.StatusCode statusCode = 1;</code>
     */
    public int getStatusCodeValue() {
      return statusCode_;
    }
    /**
     * <code>.wallet.StatusCode statusCode = 1;</code>
     */
    public Builder setStatusCodeValue(int value) {
      statusCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.wallet.StatusCode statusCode = 1;</code>
     */
    public com.betpawa.wallet.StatusCode getStatusCode() {
      com.betpawa.wallet.StatusCode result = com.betpawa.wallet.StatusCode.valueOf(statusCode_);
      return result == null ? com.betpawa.wallet.StatusCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.wallet.StatusCode statusCode = 1;</code>
     */
    public Builder setStatusCode(com.betpawa.wallet.StatusCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      statusCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.wallet.StatusCode statusCode = 1;</code>
     */
    public Builder clearStatusCode() {
      
      statusCode_ = 0;
      onChanged();
      return this;
    }

    private int statusMessage_ = 0;
    /**
     * <code>.wallet.StatusMessage statusMessage = 2;</code>
     */
    public int getStatusMessageValue() {
      return statusMessage_;
    }
    /**
     * <code>.wallet.StatusMessage statusMessage = 2;</code>
     */
    public Builder setStatusMessageValue(int value) {
      statusMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.wallet.StatusMessage statusMessage = 2;</code>
     */
    public com.betpawa.wallet.StatusMessage getStatusMessage() {
      com.betpawa.wallet.StatusMessage result = com.betpawa.wallet.StatusMessage.valueOf(statusMessage_);
      return result == null ? com.betpawa.wallet.StatusMessage.UNRECOGNIZED : result;
    }
    /**
     * <code>.wallet.StatusMessage statusMessage = 2;</code>
     */
    public Builder setStatusMessage(com.betpawa.wallet.StatusMessage value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      statusMessage_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.wallet.StatusMessage statusMessage = 2;</code>
     */
    public Builder clearStatusMessage() {
      
      statusMessage_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:wallet.BaseResponse)
  }

  // @@protoc_insertion_point(class_scope:wallet.BaseResponse)
  private static final com.betpawa.wallet.BaseResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.betpawa.wallet.BaseResponse();
  }

  public static com.betpawa.wallet.BaseResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BaseResponse>
      PARSER = new com.google.protobuf.AbstractParser<BaseResponse>() {
    public BaseResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BaseResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BaseResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BaseResponse> getParserForType() {
    return PARSER;
  }

  public com.betpawa.wallet.BaseResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
