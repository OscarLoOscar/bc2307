package shape;

public class Circle4 extends Shape {

  private double radius;

  public Circle4(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.round(Math.pow(radius, 2) * Math.PI * 1000.00) / 1000.00;
  }

}
