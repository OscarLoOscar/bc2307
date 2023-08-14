public class NullPointException {
  public static void main(String[] args) {
    String[] strs = new String[4];
    try {
      for (String str : strs) {
        if (str.charAt(0) == 'a') {
          System.out.println("first char is a");
        }
      }
    } catch (NullPointerException e) {
      System.out.println("Null Pointer Exception");
    }
  }
}
