package com.piggybank;

public class Quarter extends Currency {
  @Override
  public double getValue() {
    return this.coin * 0.25;
  }

  @Override
  public String toString() {
    if (this.coin > 1) {
      return this.coin + " Quarters";
    } else {
      return this.coin + " Quarter";
    }
  }
}