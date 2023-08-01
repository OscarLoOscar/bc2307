package shape;

import java.math.BigDecimal;

public abstract class Shape {// 有abstract一定係abstract class
  public abstract double area();

  // 放野入去自動生成，factory pattern
  public static double area(Shape[] shapes) {
    BigDecimal total = BigDecimal.valueOf(0);
    for (Shape s : shapes) {
      total = total.add(BigDecimal.valueOf(s.area()));
    }
    return total.doubleValue();
  }

  // 唔好return BigDecimal，你責任係計算正確，return double唔洗煩
  public static void main(String[] args) {
    double total = 0.0d;
    BigDecimal b = BigDecimal.valueOf(total);
    b= b.add(BigDecimal.valueOf(5));// pass by value , 所以要放返落自己
    System.out.println(b.doubleValue());

    Circle4 circle = new Circle4(10.0d);
    Square4 square = new Square4(3.0d);
    Shape[] shapes = new Shape[] { circle, square };
    System.out.println(Shape.area(shapes));
    //

  }
}
