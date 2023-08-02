import java.util.Objects;

public class Point {
  public static void main(String[] args) {

    Long l = 1L; // 1 , unbox -> primitive long
    int i = 1; // 1, auto-box -> Integer
    // Point.print(10L);// long -> autobox -> Long
    // Point.print(Long.valueOf("10")); // Long object
    // Point.print(10); // cannot convert int to long , compile error
    // Point.print((long) 10);// int -> long ->autobox ->Long

    if (Long.valueOf("100") < 101) {// 優先downcast
      // convert Long 100 -> long 1000
      // 101 -> int
      // long vs int
    }
    // if (Long.valueOf("100").compareTo(101)) {
    // }
    if (Boolean.valueOf(false) == false) {
      // right : false -> boolean
      // left : object -> downcast -> Boolean false -> boolean false
      // boolean VS boolen
    }
    if (Boolean.valueOf(false).equals(false)) {// trust the equals()
    }

    // unbox Long ,and upcast int
    System.out.println(l == i);// true , finally long vs int
    // Big bug here
    System.out.println(Objects.equals(l, i));// false , check object reference , so it false , big bug，無人叫你放primitive
    System.out.println(Objects.equals(Long.valueOf(1L), Integer.valueOf(1))); //false
    System.out.println(l == i);
  }
}