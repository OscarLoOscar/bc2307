import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {
  public static void main(String[] args) {
    // fixed-length
    // for both primitive and class
    int[] arr = new int[] {1, 3, 2};
    Integer[] integers = new Integer[] {1, 3, 2};
    // resize , create new objects
    integers = new Integer[] {1, 3, 2, 4};
    // integers[2] = "abc" , //compile-line error

    // Declaration
    ArrayList<Integer> numbers;
    // Initialization , create arrayList object
    numbers = new ArrayList<>();

    ArrayList<Integer> numbers2 = new ArrayList<>();
    numbers2.add(1);
    numbers2.add(3);
    numbers2.add(2);
    numbers2.add(4);
    numbers2.add(null);
    // variable-length

    // Convertion , ArrayList -> Array
    Integer[] arr2 = new Integer[numbers2.size()];
    // define output array type for toArray() perform conversion
    arr2 = numbers2.toArray(arr2);
    System.out.println(Arrays.toString(arr2));// [1, 2, 3, 4, null]

    // ArrayList<int> , not support primitive

    // Access elements in ArrayList
    for (int i = 0; i < numbers2.size(); ++i) {
      System.out.println(numbers2.get(i));// possible to have IndexOutOfBond
    }
    int original = numbers2.set(2, 100);
    System.out.println(original);

    ArrayList<Integer> number3 = new ArrayList<>();
    number3.add(1000);
    number3.add(2000);

    numbers2.addAll(number3);// addall items from number3 to number2
    System.out.println(numbers2.size());

    // Remove
    numbers2.remove(2);// remove by index , remove Integer 100
    System.out.println(numbers2.size());

    numbers2.removeAll(number3);// remover Integer 1000,2000
    System.out.println(numbers2.size());


    System.out.println(numbers2.indexOf(1000));// -1
    System.out.println(numbers2.indexOf(3));// 1

    System.out.println(numbers2);// [1, 3, 4, null]

    System.out.println(numbers2.contains(3));
    System.out.println(numbers2.contains(900));// check value , not check index
    System.out.println(numbers2.contains(number3));// false

    numbers2.clear();
  }
}
