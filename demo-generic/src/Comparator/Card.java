package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Card extends Paper {
  int number;

  public Card(int size, int number) {
    super(size);
    this.number = number;
  }

  @Override
  public String toString() {
    return "size : " + super.size + " " + //
        "number : " + this.number;
  }

  public static void main(String[] args) {
    List<Card> cards = Arrays.asList(new Card(1, 2), new Card(1, 5));
    Collections.sort(cards, new SortByCard());
    System.out.println(cards);

    List<? extends Number> numbers = new ArrayList<>(); // 右手無寫死,左手邊有範圍去寫
    numbers = new ArrayList<Integer>();
    numbers = new ArrayList<Double>();
    //
    List<Number> numbers1 = new ArrayList<>(); // 右手無寫死,左手邊有範圍去寫
    numbers1 = new ArrayList<Integer>();
    numbers1 = new ArrayList<Double>();

    Number number = new Integer(10);// polymorphism
    number = Integer.valueOf(10);// IntegerCache
    number = new Double(10.0); // polymorphism
  }
}
