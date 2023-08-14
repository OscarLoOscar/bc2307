import java.util.Objects;
import java.util.Random;

public class Ball5 {
  private int id;
  private Colour5 colour5;
  private static int idCounter = 0;

  public Ball5(Colour5 colour5) {
    this.id = ++idCounter; // 記，new一個波有自己id
    this.colour5 = colour5;
  }

  public int getScore() {
    return this.colour5.getScore();
  }

  public static Ball5 random() {
    // Get random colour
    int random = new Random().nextInt(3);// 0,1,2
    Colour5 colour5 = Colour5.getColour5(random);
    return new Ball5(colour5);
  }

  public int getId() {
    return this.id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o instanceof Ball5)
      return true;
    Ball5 ball = (Ball5) o;
    return this.id == ball.id && this.colour5 == ball.colour5;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.colour5);
  }

  @Override
  public String toString() {
    return "(" + //
        "id : " + this.id + //
        " colour : " + this.colour5.name()//
        + ")";//
  }
}
