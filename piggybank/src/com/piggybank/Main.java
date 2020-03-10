package com.piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main {

  public static double total(ArrayList<Double> values) {
    double value = 0;
    for (Double v : values) {
      value += v;
    }
    return value;
  }

  public static void main(String[] args) {
    DecimalFormat fp = new DecimalFormat("$###,###.00");
    ArrayList<Currency> piggyBank = new ArrayList<>();
    piggyBank.add(new Quarter());
    piggyBank.add(new Dime());
    piggyBank.add(new Dollar(5));
    piggyBank.add(new Nickel(3));
    piggyBank.add(new Dime(7));
    piggyBank.add(new Dollar());
    piggyBank.add(new Penny(10));

    piggyBank.forEach(b -> System.out.println(b.toString()));
    ArrayList<Double> valuesList = new ArrayList<>();

    piggyBank.forEach(b -> {
      valuesList.add(b.getValue());
    });
    System.out.println();
    double value = total(valuesList);
    System.out.println("The piggy bank holds " + fp.format(value));

  }
}