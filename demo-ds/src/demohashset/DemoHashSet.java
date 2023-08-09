import java.util.HashSet;
import demohashset.Book;

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
    HashSet<Coordinate> coordinate = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1);
    Coordinate c2 = new Coordinate(1, 1);
    System.out.println(coordinate.add(c1));
    System.out.println(coordinate.add(c2));// FALSE
    System.out.println(coordinate.toString());
    System.out.println(coordinate.size()); // 1
    // hashset是否duplicate 取決於你有冇override equals + hashcode
    System.out.println(c1.equals(c2));
    //
    HashSet<Book> books = new HashSet<>();
    System.out.println(books.add(new Book("Eric")));// true
    System.out.println(books.add(new Book("Eric")));// true,diff adress , without override equals
    System.out.println(books.add(new Book("Eric")));// false,diff adress , after override equals & hashCode

    System.out.println(books.add(new Book("Steven")));// true
    // HashSet(add) -> Coordinate c2.equals(any of coordinates in hashset)
    // -> c2.equlas(c1) -> true
    // -> HashSet not allow duplicates
    // ->return false
  }
}
