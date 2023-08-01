public class test {
  public static void addOne(int[] arr) { // pass by reference
    for (int i = 0; i < arr.length; ++i) {
      arr[i] += arr[i] + 1;
    }
  }

  public static String sum(String s1, String s2) {// pass by value
    s1 = "hello";
    return s1 + s2;// pass by value
  }

  public static void main(String[] args) {
    int[] nums = new int[] { 3, 4, 8 }; // array 一定係地址
    // all wrapper class + String is pass by value
    addOne(nums);
    for (int i = 0; i < nums.length; ++i) {
      System.out.println(nums[i]);
    }
    // call concat
    String a = "abc";
    String b = "def";
    System.out.println(sum(a, b)); // hellodef
    System.out.println(sum("abc", b));

  }
}
