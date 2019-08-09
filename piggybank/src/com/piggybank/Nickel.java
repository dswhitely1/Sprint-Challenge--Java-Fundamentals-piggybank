package com.piggybank;

public class Nickel extends Currency {
  @Override
  public double getValue() {
    return this.coin * 0.05;
  }

  @Override
  public String toString() {
    if (this.coin > 1) {
      return this.coin + " Nickles";
    } else {
      return this.coin + " Nickle";
    }
  }
}