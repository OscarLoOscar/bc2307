
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball> {

  int id;
  Color color;

  public Ball(int id, Color color) {
    this.id = id;
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  @Override
  public int compareTo(Ball ball) { // Comparable , 記
    return ball.id > this.id ? 1 : -1;
  }
  // compareTo this concept
  // compare ,
  // public int compare(Ball b1, Ball b2) { // Comparator , 記
  // return b1.id > b2.id ? 1:-1;
  // }

  // yellow come first , if color same , id ascending order
  // if not yellow , id descending orderF
  @Override
  public String toString() {
    return "id : " + this.id + " " + "color " + this.color;
  }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(4, Color.BLUE));
    balls.add(new Ball(1, Color.RED));
    balls.add(new Ball(5, Color.YELLOW));
    balls.add(new Ball(100, Color.YELLOW));
    Collections.sort(balls, new SortByColor());
    System.out.println(balls);
  }
}
