public class question11 {
  //Answer : Complier Error

  //A : Run time error
  //B : Compiler Error
  //C : nullnull
  //D : nullnullhello
  public static void main(String[] args) {
    StringBuilder testcase1 = new StringBuilder("null");
    testcase1.append("null");
    testcase1.concat("hello");
    System.out.println(testcase1);
  }
}
