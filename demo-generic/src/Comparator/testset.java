package Comparator;

import java.util.ArrayList;
import java.util.List;

public class testset<T extends Number> {
  testset<T> test = null;

  List<? extends Number> numbers = new ArrayList<>();

  // List<T extends Number>numbers2=new ArrayList<>();

  public static void main(String[] args) {

    List<?> numbers = new ArrayList<Integer>();
    numbers.add(1,""); // Integer is a subtype of Number
    numbers.add(2.0, null); // Double is a subtype of Number
    //
    List<Integer> numbers2 = new ArrayList<>();
    numbers2.add(1); // Integer is a subtype of Number
    numbers2.add(2.0); // Double is a subtype of Number
    numbers2.add("3"); // String is not a subtype of Number }
  }
}