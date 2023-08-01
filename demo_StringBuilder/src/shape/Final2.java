package shape;

import java.util.Arrays;

public class Final2 {

  // Pass by value
  static void changeValue(int[] arr) {
    arr[1] = 100;
  }

  // Pass by reference
  void changeReference(int[] arr) {
    arr = new int[] { 100, 200, 300, 400 };
  }

  public static void main(String[] args) {
    final int[] arr1 = new int[] { 2, 6, 12, 4 };
    int[] arr2 = new int[5];

    // Call the methods
    Final2.changeValue(arr1);
    Final2 f2 = new Final2();
    f2.changeReference(arr2);

    System.out.println("arr1 address : " + arr1);
    System.out.println("arr2 address : " + arr2);
    System.out.println("Arr1: " + Arrays.toString(arr1));
    System.out.println("Arr2: " + Arrays.toString(arr2));
  }
}
