package shape;

public class Square4 extends Shape {
  private double length;

  public Square4(double length) {
    this.length = length;
  }

  @Override
  public double area() {
    return Math.pow(this.length, 2);
  }
}
