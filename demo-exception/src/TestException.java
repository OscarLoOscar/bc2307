public class TestException {
  public static int method(int amount) throws BussinessExcetion {
    if (amount >= 0)
      return amount * 100;
    throw new BussinessExcetion("amount<0");
  }

  public static void main(String[] args) throws BussinessExcetion {
    // Exception //checked exception
    // Approach 1 : handled by try & catch
    // 1.自己handle，2.將個波拋比人
    try {
      int result = method(-2);
    } catch (BussinessExcetion e) {
      System.out.println(e.getMessage());// amount<0
    }
  }
}
