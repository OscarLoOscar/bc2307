package objects;

import java.util.Arrays;

public class ObjectDemo {
  // Rule 1 : All class extends Object implicitly
  // Example 1 : ObecjtDemo extends Object

  String name;

  @Override
  public String toString() {
    return this.name = "hello";
  }

  public static void main(String[] args) {
    ObjectDemo objectDemo = new ObjectDemo();

    // hashcode , memory地址既一個repersentation ->當int
    objectDemo.hashCode();// another presentation of object reference
    // Because hash code has a short range of value storage
    // so,it cannot store all memory address (object reference) in your maching
    int[] arr = new int[] { 1, 2, 3 };
    System.out.println(Arrays.toString(arr));
    String str = "name";
    System.out.println(str);
    System.out.println(objectDemo);
    System.out.println(objectDemo.toString());
  }
}
