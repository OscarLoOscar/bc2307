package math;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
  public static void main(String[] args) throws Exception {
    Supplier<LocalDate> now = () -> LocalDate.now();
    System.out.println(now.get());

    test(now, LocalDate.of(2023, 8, 16));

    Supplier<Integer> random = () -> new Random().nextInt(3);
    test(random, 2);//拎唔到確定答案
  }

  public static <T> void test(Supplier<T> testCase, T result) throws Exception {
    if (testCase.get().equals(result))
      return;
    throw new Exception();
  }
}
