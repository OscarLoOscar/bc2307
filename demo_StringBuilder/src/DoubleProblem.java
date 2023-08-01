import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleProblem {
  public static void main(String[] args) {

    BigDecimal b1 = new BigDecimal(0.3);
    BigDecimal b2 = new BigDecimal(0.4);
    System.out.println("output 1 : " + b1.multiply(b2));

    double b3 = 0.35;
    double b4 = 0.45;
    System.out.println("output 2 : " + b3 / b4);

    BigDecimal b5 = new BigDecimal(Double.valueOf(0.3));
    BigDecimal b6 = new BigDecimal(Double.valueOf(0.4));
    System.out.println("output 3 : " + b5.multiply(b6).doubleValue());
    System.out.println("output 4 : " + b5.multiply(b6).setScale(5,RoundingMode.HALF_DOWN).toString());

  }

}