package math;

import java.util.function.Predicate;

public class CombineDemo {
  public static void main(String[] args) {
    Predicate<String> startsWithV = s -> s.startsWith("V");
    Predicate<String> ensWithE = s -> s.endsWith("E");

    Predicate<String> combined = startsWithV.and(ensWithE);
    System.out.println(combined.test("VE"));// T
    System.out.println(combined.test("AE"));// F
    System.out.println(combined.test("VA"));// F
    System.out.println(combined.test("VwhjrugE"));// T
    //
    Predicate<String> combined2 = startsWithV.or(ensWithE);
    System.out.println(combined2.test("VE"));// T
    System.out.println(combined2.test("AE"));// T
    System.out.println(combined2.test("VA"));// T
    System.out.println(combined2.test("VwhjrugE"));// T

  }
}
