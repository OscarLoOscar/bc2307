import java.math.BigDecimal;


public class question10 {

  int x;
  double y;
  String z;

  void add(int a, int b) {
    x = a + b;
  }

  void add(double c, double d) {
    y = c + d;
  }

  void add(String e, String f) {
    z = e + f;
  }

  void overload() {
    this.x = 0;
    this.y = 0;
  }
}

// Answer : 4 , 6.4, 53.2

// A : 4 , 6.4 , 53.2
// B : 4.0 , 6 , 53.2
// C : 4.0 , 6.4 , 8.2
// D : 4 , 6.4 , 8.2
class Overload_methods {
  public static void main(String args[]) {
    question10 obj = new question10();
    int a = 2;
    double b = 3.2;
    String c = "5";
    obj.add(a, a);
    obj.add(b, b);
    obj.add("5", "3.2");
    System.out.println(obj.x + " , " + obj.y + " , " + obj.z);
  }
}