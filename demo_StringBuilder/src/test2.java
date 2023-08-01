import java.util.Arrays;

public class test2 {
  public static void main(String[] args) {
    // for practice 1
    int tom = 25000;
    int van = 30000;
    int ray = 40000;
    // System.out.println("Before swap: ");
    // System.out.println("tom = " + tom);
    // System.out.println("van = " + van);
    int temp = tom;// temp is a temporary variable(avoid losing the original tom)
    System.out.println("Tom : " + tom);
    System.out.println("temp : " + temp);
    System.out.println();
    tom = van;
    System.out.println("Tom : " + tom);
    System.out.println("van : " + van);
    System.out.println();
    van = temp;
    System.out.println("temp : " + temp);
    System.out.println("van : " + van);
    System.out.println("tom : " + tom);

    // copy of tom, not override
    // System.out.println("After swap: ");
    // System.out.println("tom = " + tom);
    // System.out.println("van = " + van);

  }
}