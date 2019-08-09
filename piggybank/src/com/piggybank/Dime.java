package com.piggybank;

import javax.lang.model.util.ElementScanner6;

public class Dime extends Currency {
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