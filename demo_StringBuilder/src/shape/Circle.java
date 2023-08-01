package shape;

public class Circle {
  // static -> shared variable
  // final -> one time initialization ONLY
  private int id;
  private double radius;
  private static final double pi = 3.14159;
  private static int counter;

  public Circle() {
    AddCounter();
    this.id++;
  }

  public double area() {
    return Math.pow(this.radius, 2) * pi;

  }

  public static void AddCounter() {
    counter++;
  }

  public double circumference() {
    return 2 * radius * pi;
  }

  public void serRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return this.id + " " + this.radius + " " + this.counter;
  }

  public static void main(String[] args) {
    Circle c1 = new Circle();
    System.out.println("c1 : " + c1);
    Circle c2 = new Circle();
    System.out.println("c2 : " + c2);
    Circle c3 = new Circle();
    System.out.println("c3 : " + c3);
    Circle c4 = new Circle();
    System.out.println("c4 : " + c4);
    Circle c5 = new Circle();
    System.out.println("c5 : " + c5);
    Circle c6 = new Circle();
    System.out.println("c6 : " + c6);

  }
}
