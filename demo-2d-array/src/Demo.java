import java.uDemo2Arrays;
import java.util.Random;

public class Demo6 {
  public static void main(String[] args) {
    int[] nums = new int[3];
    // int[] nums -> declaration
    // new int[3] -> initialization
    nums = new int[10]; // re-assigment
    nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int[][] matrix = new int[3][4];// rows and columns

    // random a numnber and assign to an 2D array (0-12)
    for (int i = 0; i < matrix.length; ++i) {
      for (int j = 0; j < matrix[i].length; ++j) {
        matrix[i][j] = new Random().nextInt(13);
      }
    }
    System.out.println(Arrays.deepToString(matrix));

    // for (int i = 0; i < matrix.length; ++i) {
    // for (int j = 0; j < matrix[i].length; ++j) {
    // System.out.print(matrix[i][j] + " ");
    // }
    // System.out.println();
    // }

    // convert 2D array to 1D array
    int[] arr = new int[matrix.length * matrix[0].length];
    int idx = 0;
    String str = "";
    for (int i = 0; i < matrix.length; ++i) {
      for (int j = 0; j < matrix[0].length; ++j) {
        arr[idx++] = matrix[i][j];
        str += matrix[i][j];
      }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(str);
    //
    Demo6[][] demo = new Demo6[2][2];
    demo[0][0] = new Demo6();
    demo[0][1] = new Demo6();
    demo[1][0] = new Demo6();
    demo[1][1] = new Demo6();
    for (int i = 0; i < demo.length; ++i) {
      for (int j = 0; j < demo[0].length; ++j) {
        System.out.println(demo[i][j]);
      }
    }
    //
    String[][] strings = new String[][] {{"abc", "def"}, {"rtg", "tujy"}};
    for (int i = 0; i < strings.length; ++i) {
      for (int j = 0; j < strings[0].length; ++j) {
        System.out.println(strings[i][j]);
      }
    }
    //
  }
}

