import java.util.ArrayList;

public class demoGeneric {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();

    // Animal Example
    Zoo<Dog5> zoo1 = Zoo.of(Dog5.of("xyz"));

    // zoo1.setAnimal(new Cat()); Compile error, strong type check
    zoo1.setAnimal(Dog5.of("def"));

    Zoo<Animal5> zoo2 = Zoo.of(new Cat5());
    zoo2.setAnimal(new Animal5());
    zoo2.setAnimal(Dog5.of("abc")); // ?
    zoo2.setAnimal(new Cat()); // ?

    // Zoo<String> zoo3 = Zoo.of("Abc"); // String is not extending Animal

    // Normal Example
    Box<Integer> box = getBox(Integer.valueOf(100));
    System.out.println(box.getNumbers());
    Box<Double> box2 = getBox(Double.valueOf(100));

    // Special Example
    Object object = getBox(Double.valueOf(1.0d));
    object.toString();
    Box<Double> d1 = (Box<Double>) object; //
    for (double d : d1.getNumbers()) {
      System.out.println(d); // 1.0
    }
  }

  public static <T extends Number> Box<T> getBox(T inputParameter) {
    return new Box<>(inputParameter);
  }

}