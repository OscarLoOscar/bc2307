package math;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryDemo {
  public static void main(String[] args) {
    UnaryOperator<String> uppercase = str -> str.toUpperCase();
    System.out.println(uppercase.apply("hello"));
    //
    BinaryOperator<String> concat = (s1, s2) -> s1.concat(s2);
    System.out.println(concat.apply("Hello ", "World"));

    SuperUnaryOperator<String> concat = (s1,s2,s3)->s1.concat(s2).concat(s3);
  }
}
