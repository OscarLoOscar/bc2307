package shape;

import java.math.BigDecimal;
import java.util.List;

public abstract class Shape {

  abstract double area();// implicity public

  // public static <T extends Shape> double area(List<T> shapres) {
  public static double area(List<? extends Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;

    // shapes.add(new Circle());// compile-error check , List 中不能操作polymorphism
    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
      // .area()由child class實踐，
    }
    return total.doubleValue();
  }

}