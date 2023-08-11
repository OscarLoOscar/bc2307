import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class demoSorting {
  public static void main(String[] args) {
    int[] arr = new int[] {4, -10, 9, -20, 100};
    Arrays.sort(arr);// n * logn , merge sort
    System.out.println(Arrays.toString(arr));
    // [-20, -10, 4, 9, 100]
    // nlogn + n
    // reverse
    for (int i = 0; i < arr.length; i++) {
      int temp = 0, max = 0;

    }

    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(100);
    arrayList.add(-100);
    arrayList.add(-88);
    arrayList.add(4);
    Collections.sort(arrayList);// nlogn , ascending sorting
    System.out.println(arrayList);

    Collections.sort(arrayList, null);
  }
}
