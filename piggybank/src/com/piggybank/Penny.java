package com.piggybank;

public class Penny extends Currency {
  @Override
  public double getValue() {
    return this.coin * 0.01;
  }

  @Override
  public String toString() {
    if (this.coin > 1) {
      return this.coin + " Pennies";
    } else {
      return this.coin + " Penny";
    }
  }
}