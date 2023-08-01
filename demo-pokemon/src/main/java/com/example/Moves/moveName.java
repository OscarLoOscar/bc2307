package com.example.Moves;

public enum moveName {
  POUND(35, 40, 100),
  KARATECHOP(10, 60, 100),
  DOUBLESLAP(5, 100, 50),
  COMETPUNCH(15, 50, 75),
  MEGAPUNCH(20, 60, 100),
  PAYDAY(40, 40, 30),
  FIREPUNCH(5, 100, 90),
  ICEPUNCH(5, 100, 90),
  THUNDERPUNCH(5, 100, 90),
  SCRATCH(40, 0, 40);

  private final int pp, power, accuracy;

  moveName(int pp, int power, int accuracy) {
    this.pp = pp;
    this.power = power;
    this.accuracy = accuracy;
  }

  public int getPP() {
    return this.pp;
  }

  public int getPower() {
    return this.power;
  }

  public int getAccuracy() {
    return this.accuracy;
  }
}
