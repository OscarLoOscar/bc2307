import java.util.ArrayList;

public class Box<T extends Number> {

  private ArrayList<T> numbers;

  public Box() {
    numbers = new ArrayList<>();
  }

  public Box(T inputNumber) {
    // numbers = new ArrayList<>();
    this();// call 自己constructor ,empty constructort of Class Box
    numbers.add(inputNumber);
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
  public static <T extends Number> Box<T> createBox(T number) {
    return new Box<>(number);
  }

  public static void main(String[] args) {

    // Box<String> box1 = new Box<>();
    Box<Integer> box2 = new Box<>();
    Box<Integer> box3 = createBox(Integer.valueOf(100));
    Object object = createBox(Double.valueOf(1.0d));
    Box<Double> d1 = (Box<Double>) object;//
    for (double d : d1.getNumbers()) {
      System.out.println(d);
    }

  }

}
