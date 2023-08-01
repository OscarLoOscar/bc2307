package com.example.Moves;

public class Move {
  private int id;
  moveName name;
  moveType type;
  moveCatagory mtype;

  public Move(moveName name, moveType type, moveCatagory mtype) {
    this.name = name;
    this.type = type;
    this.mtype = mtype;
    // this.pp = pp;
    // this.power = power;
    // this.accuracy = accuracy;
  }

  public int getId() {
    return id;
  }

  public moveName getName() {
    return name;
  }

  public moveType getType() {
    return type;
  }

  public moveCatagory getMtype() {
    return mtype;
  }

  public int getPower() {
    return moveName.getPower();
  }

  public moveName getAccuracy() {
    return accuracy;
  }
}
