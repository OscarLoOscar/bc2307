public class DemoIAE {

  public static int add(int a, int b) {
    if (a < 0 || b < 0)
      throw new IllegalArgumentException();
    return a + b;
  }

  public static void main(String[] args) {
    try {
      add(1, 4);// ok
      add(-1, 5); // throw exception , line 12->13->14
      add(10, 10);// un-reachable
    } catch (IllegalArgumentException e) {
      System.out.println("Skip the process");
    }
  }
}
