import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class SortByColor implements Comparator<Ball> {

  @Override
  public String test() {
    return "123";
  }

  @Override
  public int compare(Ball b1, Ball b2) {
    return b2.color.id < b1.color.id ? 1 : -1;
    // return b2.id < b1.id ? 1 : -1;

    Queue<Integer> test = new Queue<>();
  }
}
