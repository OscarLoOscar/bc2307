package hashset;

import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("abc");
    strings.add("def");
    System.out.println(strings.size());// 2
    // HashSet
    boolean result = strings.add("abc");
    System.out.println(strings.size());// 2
    System.err.println(result);// false

    if (strings.add("def")) {
      System.out.println("def is added");
    } else {
      System.out.println("def is not added");
    }

    //
    // Example 2
    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1);
    Coordinate c2 = new Coordinate(1, 1);
    System.out.println("c1 : " + coordinates.add(c1));
    System.out.println("c2 : " + coordinates.add(c2));// FALSE
    System.out.println(coordinates.size()); // 1
    // hashset是否duplicate 取決於你有冇override equals + hashcode
    System.out.println(c1.equals(c2));
  }
}
