// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.betpawa.wallet;

public interface WithdrawResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wallet.WithdrawResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float amountToWithDraw = 1;</code>
   */
  float getAmountToWithDraw();

  /**
   * <code>float balance = 2;</code>
   */
  float getBalance();

  /**
   * <code>.wallet.CURRENCY currency = 3;</code>
   */
  int getCurrencyValue();
  /**
   * <code>.wallet.CURRENCY currency = 3;</code>
   */
  com.betpawa.wallet.CURRENCY getCurrency();
}