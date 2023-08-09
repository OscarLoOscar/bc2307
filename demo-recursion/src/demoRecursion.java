public class demoRecursion {
  public static void main(String[] args) {
    // algorithm -> algo
    System.out.println(sum(10));
    System.out.println(sum2(6));
    print(4);
  }

  // Question 1 :
  // k + (k-1) + (k-2)+....+0 , 10+9 +8...+ 0
  // public static int sum(int k) {
  // int sum = 0;
  // for (int i = k; i >0; i--) {
  // sum += i;
  // }
  // return sum;
  // }
  public static int sum(int k) {
    if (k < 1)
      return k;
    return k + sum(k - 1);
  }

  // Question 2 :
  // 1,1,2,3,5,8,13.....k times

  public static int sum2(int k) {
    if (k == 0 || k == 1)
      return k;
    else
      return sum2(k - 1) + sum2(k - 2);
  }

  // 1 1
  // 2 1 1 2
  // 3 2 1 1 2 3
  // 4 3 2 1 1 2 3 4
  //non-tail recursion
  public static void print(int k) {
    // String ans = "";
    // if (k == 1)
    // ans = "1";
    // else
    // ans += ans + String.valueOf(k);
    // System.out.println(ans);
    if (k <1) {
      return;
    }
    System.out.print(k+" ");
    print(k - 1);
    System.out.print( k );
    System.out.print(" ");
  }
}
