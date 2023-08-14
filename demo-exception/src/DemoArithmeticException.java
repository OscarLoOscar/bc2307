public class DemoArithmeticException {
  public static void main(String[] args) {
    int i = 0;
    int n = 100;
    int result = 0;
    try {
      // 有可能有事code inside try
      result = n / i;
    } catch (ArithmeticException e) {
      result = 0;
    } // try-catch -> 己知有問題

    System.out.println(result);
  }
}
