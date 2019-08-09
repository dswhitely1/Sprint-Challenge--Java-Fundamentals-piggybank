package com.piggybank;

import javax.lang.model.util.ElementScanner6;

public class Dime extends Currency {
  public Dime() {
    super();
  }

  public Dime(int coin) {
    super(coin);
  }

  @Override
  public double getValue() {
    return this.coin * 0.1;
  }

  @Override
  public String toString() {
    if (this.coin > 1) {
      return this.coin + " Dimes";
    } else {
      return this.coin + " Dime";
    }

  }
}