
public record PersonRe1(String name, int age) implements TestInterface { // 自帶final
  // Immutable Objects
  // final class , support Generic
  // support interface ,but cannot further extends (extends Object.class)
  // private final String name;
  // private final int age;
  // No empty constructor.
  // All-args constructors ONLY.
  // All Getters
  // No Setters ( final instance variable)
  // custom static methods , static variables
  // custom constant
  // custom instance methods
  // No other instance variables
  // Already @Override equals() , hashCode() . toString()
  static int count = 1;

  static final int MAX_VALUE = 100; // constant

  public boolean isElderly(int age) {
    return age >= 65;
  }

public static add(int x,int y){
  return x+y;
}
}
