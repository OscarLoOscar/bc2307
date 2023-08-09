package overrides;

import java.util.Objects;

public class Ball4 {
  private String color;

  public Ball4(String color) {
    this.color = color;
  }

  @Override // 記
  public boolean equals(Object o) {// instance method
    // if address same , values inside the object must be same
    if (this == o)
      return true;
    if (!(o instanceof Ball4))
      return false;
    Ball4 ball = (Ball4) o;
    // return ball.color.equals(this.color);
    return Objects.equals(ball.color, this.color);
    // return ball.color.equals(this.color);//ball just a reference , Ball can be null
  }

  public static void main(String[] args) {
    Ball4 b1 = new Ball4("blue");
    Ball4 b2 = new Ball4("blue");
    System.out.println(b1 == b2);
    System.out.println(b1.equals(b2));
  }
}
