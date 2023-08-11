public class NumberPrinter {

  int number;
  Stirng str;

  // approach 1
  public static void print(int num) {
    System.out.println(num); // print 外面入黎num
  }

  // approach 2
  public void print() {
    System.out.println(this.number);
  }

  // over loading
  public static void print(String str) {
    System.out.println(str); // print 外面入黎num
  }

  // 撞名
  // public void printStirng() {
  //   System.out.println(this.str);
  // }

}
