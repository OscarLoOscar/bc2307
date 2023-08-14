import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SortByColor implements Comparator<Ball> {

  // @Override
  // public String test() {
  // return "123";
  // }

  @Override
  public int compare(Ball b1, Ball b2) {
    return b2.color.id < b1.color.id ? 1 : -1;
    // return b2.id < b1.id ? 1 : -1;

  }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(4, Color.YELLOW));
    balls.add(new Ball(1, Color.BLUE));
    balls.add(new Ball(5, Color.YELLOW));
    balls.add(new Ball(100, Color.RED));
    Collections.sort(balls, new SortByColor());
    System.out.println(balls);
    // [id : 100 color RED, id : 5 color YELLOW, id : 4 color YELLOW, id : 1 color
    // BLUE]
  }
}
