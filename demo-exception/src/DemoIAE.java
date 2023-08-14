public class DemoIAE {

  public static int add(int a, int b) {
    if (a < 0 || b < 0)
      throw new IllegalArgumentException();
    return a + b;
  }

  public static void main(String[] args) {
    add(1, 4);
    add(-1, 5);
  }
}
