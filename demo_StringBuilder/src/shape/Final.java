package shape;

import java.util.Arrays;

public class Final {
  public static void main(String[] args) {

    final int[] arr1 = new int[] { 2, 6, 12, 4 };
    final int[] arr2 = new int[] { 100, 200, 300, 400 };
    System.out.println("Before : ");
    System.out.println("Arr1 : " + arr1);
    System.out.println(Arrays.toString(arr1));
    System.out.println("Arr2 : " + arr2);
    System.out.println(Arrays.toString(arr2));

    // arr1 = arr2; change the arr1 adress
    // arr2 = arr1;
    // arr1 = arr2;
    /**
     * The final local variable arr1 cannot be assigned. It must be blank and not
     * using a compound assignmentJava(536870970)
     * int[] arr1 - shape.Final.main(String[])
     */
    System.out.println();
    System.out.println("After change the address : ");
    System.out.println("Arr1 : " + arr1);
    System.out.println(Arrays.toString(arr1));
    System.out.println("Arr2 : " + arr2);
    System.out.println(Arrays.toString(arr2));

    // arr1[1] = 100;
    arr2[1] = 100;

    System.out.println();
    System.out.println("Final : ");
    System.out.println("Arr1 : " + arr1);
    System.out.println(Arrays.toString(arr1));
    System.out.println("Arr2 : " + arr2);
    System.out.println(Arrays.toString(arr2));

  }
}
