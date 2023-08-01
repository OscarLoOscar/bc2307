package overrides;

public class Ball {
  private String color;

  public Ball(String color) {
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {// instance method
    // if address same , values inside the object must be same
    if (this == o)
      return true;
    if (!(o instanceof Ball))
      return false;
    Ball ball = (Ball) o;
    return ball.color.equals(this.color);
  }

  public static void main(String[] args) {
    Ball b1 = new Ball("blue");
    Ball b2 = new Ball("blue");
    System.out.println(b1 == b2);
    System.out.println(b1.equals(b2));
  }
}
