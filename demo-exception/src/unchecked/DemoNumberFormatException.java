public class DemoNumberFormatException {
  public static void main(String[] args) {
    try {
      Integer.valueOf("abc");// NumberFormatException

    } catch (NumberFormatException e) {
      System.out.println("Number Format Issue");
    }
  }
}
