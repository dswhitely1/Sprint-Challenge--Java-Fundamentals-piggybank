package com.piggybank;

public class Dollar extends Currency {
  public Dollar() {
    super();
  }

  public Dollar(int coin) {
    super(coin);
  }

  @Override
  public double getValue() {
    return this.coin * 1.0;
  }

  @Override
  public String toString() {
    return "$" + this.coin;
  }
}