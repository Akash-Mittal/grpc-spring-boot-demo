// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wallet.proto

package com.bp.wallet.proto;

public final class WalletClass {
  private WalletClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_BaseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_BaseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_DepositRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_DepositRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_DepositResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_DepositResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_WithdrawRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_WithdrawRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_WithdrawResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_WithdrawResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_BalanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_BalanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_BalanceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_BalanceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_Balance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_Balance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014wallet.proto\022\006wallet\"d\n\014BaseResponse\022&" +
      "\n\nstatusCode\030\001 \001(\0162\022.wallet.StatusCode\022," +
      "\n\rstatusMessage\030\002 \001(\0162\025.wallet.StatusMes" +
      "sage\"T\n\016DepositRequest\022\016\n\006userID\030\001 \001(\003\022\016" +
      "\n\006amount\030\002 \001(\t\022\"\n\010currency\030\003 \001(\0162\020.walle" +
      "t.CURRENCY\"U\n\017DepositResponse\022\016\n\006userID\030" +
      "\001 \001(\003\022\016\n\006amount\030\002 \001(\t\022\"\n\010currency\030\003 \001(\0162" +
      "\020.wallet.CURRENCY\"U\n\017WithdrawRequest\022\016\n\006" +
      "userID\030\001 \001(\003\022\016\n\006amount\030\002 \001(\t\022\"\n\010currency" +
      "\030\003 \001(\0162\020.wallet.CURRENCY\"G\n\020WithdrawResp" +
      "onse\022\017\n\007balance\030\001 \001(\t\022\"\n\010currency\030\002 \001(\0162" +
      "\020.wallet.CURRENCY\" \n\016BalanceRequest\022\016\n\006u" +
      "serID\030\001 \001(\003\"<\n\017BalanceResponse\022)\n\020remain" +
      "ingBalance\030\001 \003(\0132\017.wallet.Balance\"=\n\007Bal" +
      "ance\022\016\n\006amount\030\001 \001(\t\022\"\n\010currency\030\002 \001(\0162\020" +
      ".wallet.CURRENCY\"\007\n\005Empty*X\n\nStatusCode\022" +
      "\021\n\rBP_WALLET_000\020\000\022\021\n\rBP_WALLET_001\020\001\022\021\n" +
      "\rBP_WALLET_002\020\002\022\021\n\rBP_WALLET_003\020\003*\227\001\n\r" +
      "StatusMessage\022\027\n\023USER_DOES_NOT_EXIST\020\000\022\025" +
      "\n\021INVALID_ARGUMENTS\020\001\022\030\n\024INSUFFICIENT_BA" +
      "LANCE\020\002\022&\n\"AMOUNT_SHOULD_BE_GREATER_THAN" +
      "_ZERO\020\003\022\024\n\020INVALID_CURRENCY\020\004*%\n\010CURRENC" +
      "Y\022\007\n\003USD\020\000\022\007\n\003EUR\020\001\022\007\n\003GBP\020\0022\314\001\n\rWalletS" +
      "ervice\022<\n\007deposit\022\026.wallet.DepositReques" +
      "t\032\027.wallet.DepositResponse\"\000\022?\n\010withdraw" +
      "\022\027.wallet.WithdrawRequest\032\030.wallet.Withd" +
      "rawResponse\"\000\022<\n\007balance\022\026.wallet.Balanc" +
      "eRequest\032\027.wallet.BalanceResponse\"\000B)\n\023c" +
      "om.bp.wallet.protoB\013WalletClassP\001\242\002\002WCb\006" +
      "proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_wallet_BaseResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wallet_BaseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_BaseResponse_descriptor,
        new java.lang.String[] { "StatusCode", "StatusMessage", });
    internal_static_wallet_DepositRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_wallet_DepositRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_DepositRequest_descriptor,
        new java.lang.String[] { "UserID", "Amount", "Currency", });
    internal_static_wallet_DepositResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_wallet_DepositResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_DepositResponse_descriptor,
        new java.lang.String[] { "UserID", "Amount", "Currency", });
    internal_static_wallet_WithdrawRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_wallet_WithdrawRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_WithdrawRequest_descriptor,
        new java.lang.String[] { "UserID", "Amount", "Currency", });
    internal_static_wallet_WithdrawResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_wallet_WithdrawResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_WithdrawResponse_descriptor,
        new java.lang.String[] { "Balance", "Currency", });
    internal_static_wallet_BalanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_wallet_BalanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_BalanceRequest_descriptor,
        new java.lang.String[] { "UserID", });
    internal_static_wallet_BalanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_wallet_BalanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_BalanceResponse_descriptor,
        new java.lang.String[] { "RemainingBalance", });
    internal_static_wallet_Balance_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_wallet_Balance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_Balance_descriptor,
        new java.lang.String[] { "Amount", "Currency", });
    internal_static_wallet_Empty_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_wallet_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}