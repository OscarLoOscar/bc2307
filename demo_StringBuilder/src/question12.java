import java.math.BigDecimal;

// Answer : 25.00 , 110.25
// A : 25.00,110.25
// B : 25,110.25
// C : 25.00,110
// D : 25,110
public class question12 {

  private BigDecimal length;

  public BigDecimal area() {
    return this.length.multiply(length);
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public void setLength(double length) {
    this.length = BigDecimal.valueOf(length);
  }

  public static void main(String[] args) {
    question12 square = new question12();
    question12 square2 = new question12();
    square.setLength(5);
    System.out.println(square.area());
    square2.setLength(10.5);
    System.out.println(square2.area());
  }
}
