package com.piggybank;

public abstract class Currency {
  protected int coin;

  public Currency() {
    this.coin = 1;
  }

  public Currency(int coin) {
    this.coin = coin;
  }

  public int getCoin() {
    return this.coin;
  }

  public void setCoin(int coin) {
    this.coin = coin;
  }

  public abstract double getValue();

  public abstract String toString();
}