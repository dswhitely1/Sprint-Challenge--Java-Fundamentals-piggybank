package com.piggybank;

public class Dollar extends Currency {
  @Override
  public double getValue() {
    return this.coin * 1.0;
  }

  @Override
  public String toString() {
    return "$" + this.coin;
  }
}