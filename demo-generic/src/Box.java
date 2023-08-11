import java.util.ArrayList;

public class Box<T extends Number> {

  private ArrayList<T> numbers;

  public Box() {
    numbers = new ArrayList<>();
  }

  public Box(T number) {
    // numbers = new ArrayList<>();
    this();// call 自己constructor
    numbers.add(number);
  }

  public ArrayList<T> getNumbers() {
    return this.numbers;
  }

  // 有人create Box 先去create ArrayList
  public void add(T number) {
    numbers.add(number);
  }

  // public void setNumbers(T[] numners) {
  // this.numbers = numners;
  // }

  public static void main(String[] args) {
    // Box<String> box1 = new Box<>();
    Box<Integer> box2 = new Box<>();

  }
}
