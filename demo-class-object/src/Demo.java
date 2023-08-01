public class Demo {
  public static void main(String[] args) {
    Car car1 = new Car();
    Person p1 = new Person();
    Car car2 = new Car(4, 7, "RED");
    System.out.println(car2.getCapacity());
    System.out.println(car2.getColor());
    System.out.println(car2.getNoOfWheel());

    // car2 = new Car(3, 4, "Black");
    Car car3 = new Car(4, 7, "RED");

    System.out.println("car2 equals car3 ? " + car2.equals(car3));
    System.out.println("car2 equals cae3 ? " + (car2 == car3));
    ///
    String hoge = "Hello";
    String fuga = "Hello";
    hoge += "!";
    fuga += "!";

    if (hoge == fuga) {
      System.out.println("hoge same of fuga");
    } else {
      System.out.println("hoge not the same of fuga");// !=
    }

    if (hoge.equals(fuga)) {
      System.out.println("hoge same of fuga");
    } else {
      System.out.println("hoge not the same of fuga");
    }
    /**
     * We can use == operators for reference comparison (address comparison) and
     * .equals() method for content comparison. In simple words, == checks if both
     * objects point to the same memory location whereas .equals() evaluates to the
     * comparison of values in the objects.
     */
    /*
     * Pass-by-reference: When a method is called, the method arguments reference
     * the same variable in memory as the caller.
     * Pass-by-value: When a method is called, the caller passes a copy of the
     * argument variables to the method resulting in two values in memory.
     */
      String s1 = ("HELLO");
      String s2 = ("HELLO");
      String s3 = new String("HELLO");

      System.out.println(s1 == s2); // true
      System.out.println(s1 == s3); // false
      System.out.println(s2 == s3); //false
      System.out.println(s1.equals(s2)); // true
      System.out.println(s1.equals(s3));// true
  }
}
