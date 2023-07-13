public class Loops {
  public static void main(String[] args) {
    // For Loop
    int a = 0;
    ++a;
    a++;

    for (int i = 0; i < 4; ++i) {
      System.out.println("i=" + i + ", Hello");
      // Logic Flow:
      // i = 0 -> 0 < 4, print 1st Hello
      // ++i -> i = 1 -> 1 < 4, print 2nd Hello
      // ++i -> i = 2 -> 2 < 4, print 3rd Hello
      // ++i -> i = 3 -> 3 < 4, print 4th Hello
      // ++i -> i = 4 -> 4 is NOT smaller than 4, exit loop
    }

    for (int j = 6; j > 0; j--) {
      System.out.println("j=" + j); // 6 times
    }
    // endless loop
    // for (int i = 0; i >= 0; i++) {
    // System.out.println("hello");
    // }

    int max = 10;
    int total = 0;
    for (int i = 0; i < max; ++i) {
      total += i; // 0, 1 ... 9
    }
    // total=45

    // 1. Sum up all odd numbers
    // 2. Sum up all odd numbers, except 5
    int sum = 0;
    int sumOddNumWithout5 = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1) {
        sum += i;
      }
      if (i % 2 == 1 && i != 5) {
        sumOddNumWithout5 += i;
      }
    }
    // sum=25
    // sumOddNumWithout5=20

    for (int i = 0; i < 5; ++i) {
      System.out.println("hello");
      if (i > 2) {
        break;
      }
    }
    // i = 0, hello
    // i = 1, hello
    // i = 2, hello
    // i = 3, hello
    // break;

  }
}
