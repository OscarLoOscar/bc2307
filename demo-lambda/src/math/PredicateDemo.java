package math;

import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) throws Exception {
    Predicate<Character> isMale = c -> c == 'M';
    Predicate<String> isUpperCase = s -> {
      for (int i = 0; i < s.length(); ++i) {
        if (s.charAt(i) < 'A' || s.charAt(i) > 'Z') // 65-90
          return false;
      }
      return true;
    };
    // tester
    test(isMale, 'F', false);
    test(isMale, 'M', true);
    test(isUpperCase, "ABCd", false);
    test(isUpperCase, "ABCDE", true);
    // test(isUpperCase, "", false);
    test(isUpperCase, " ", false);
    // test(isUpperCase, null, false);

    //
    BiPredicate<String, String> equals = (s1, s2) -> s1 != null && s1.equals(s2);
    test(equals, "abc", "abc", true);
    test(equals, "", "", true);
    test(equals, "", " ", false);

    Predicate<LocalDate> isCoolingOff = effDate -> effDate.plusMonths(1).isAfter(LocalDate.now());
    test(isCoolingOff, LocalDate.of(2023, 7, 16), false);
    test(isCoolingOff, LocalDate.of(2023, 7, 17), true);

  }

  public static <T> void test(Predicate<T> testCase, T data, boolean expectedResult)// 記
      throws Exception { // static method 描述範圍
    if (testCase.test(data) == expectedResult)
      return;
    throw new Exception();
  }

  //
  public static <T, U> void test(BiPredicate<T, U> testCase, T data1, U data2, boolean expectedResult)// 記
      throws Exception { // static method 描述範圍
    if (testCase.test(data1, data2) == expectedResult)
      return;
    throw new Exception();
  }

}
