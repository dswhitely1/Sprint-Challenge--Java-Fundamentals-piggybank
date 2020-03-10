package com.piggybank;

public class Quarter extends Currency {
  public Quarter() {
    super();
  }

  public Quarter(int coin) {
    super(coin);
  }

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