package com.example.Moves;

import java.util.ArrayList;
import java.util.List;

public class MovesDB {
  static List<Move> list;

  public MovesDB() {
    list = new ArrayList<>();
    // Move(String name, moveType type, moveCatagory mtype, int pp, int power, int
    // accuracy)
    list.add(new Move(moveName.POUND, moveType.NORMAL, moveCatagory.PHYSICAL));
    list.add(new Move(moveName.KARATECHOP, moveType.FIGHTING, moveCatagory.PHYSICAL));
    list.add(new Move(moveName.DOUBLESLAP, moveType.FIRE, moveCatagory.SPECIAL));
    list.add(new Move(moveName.COMETPUNCH, moveType.GRASS, moveCatagory.PHYSICAL));
    list.add(new Move(moveName.MEGAPUNCH, moveType.GRASS, moveCatagory.SPECIAL));
    list.add(new Move(moveName.PAYDAY, moveType.POISON, moveCatagory.SPECIAL));
    list.add(new Move(moveName.FIREPUNCH, moveType.FIRE, moveCatagory.SPECIAL));
    list.add(new Move(moveName.ICEPUNCH, moveType.ICE, moveCatagory.SPECIAL));
    list.add(new Move(moveName.THUNDERPUNCH, moveType.ELECTRIC, moveCatagory.SPECIAL));
    list.add(new Move(moveName.SCRATCH, moveType.GHOST, moveCatagory.SPECIAL));
  }

  /**
   * public Square(double length) {
   * if (length <= 0.0)
   * length = 1.0d;
   * int id = 0;
   * this.edges = new Edge[4]; // new address
   * this.edges[0] = new Edge(++id, length, "RED");// new address
   * this.edges[1] = new Edge(++id, length, "RED");// new address
   * this.edges[2] = new Edge(++id, length, "RED");// new address
   * this.edges[3] = new Edge(++id, length, "RED");// new address
   * // Square.resetId();
   * }
   */
  public List<Move> getMoves(int i, int j, int k, int l) {
    List<Move> movesList = new ArrayList<>();
    movesList.add(MovesDB.list.get(i));
    movesList.add(MovesDB.list.get(j));
    movesList.add(MovesDB.list.get(j));
    movesList.add(MovesDB.list.get(l));
    return movesList;
  }
}
