public class Demo {
  public static void main(String[] args) {
<<<<<<< HEAD
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
=======
    Car car = new Car(); // empty constructor
    Car car2 = new Car(4, 7, "RED");
    // print car2
    System.out.println(car2.getCapacity()); // sysout
    System.out.println(car2.getColor()); // RED
    System.out.println(car2.getNoOfWheel());

    car2.setColor("YELLOW"); // car2 -> object reference, storing the object address
    car.setColor("BLUE");
    // car2 -> YELLOW
    // car -> BLUE
    System.out.println(car2); // Car@6b95977 -> Object reference storing object address

    car2 = new Car(3, 4, "Black"); // ????
    car2 = null;
    car2 = new Car(10, 3, "PINK");

    
    //
    int[] arr = new int[] {1, 3, 2};
    Integer sum = 0; // sum -> reference, an object contains 0
    for (int i = 0; i < arr.length; ++i) {
      sum = sum + arr[i]; //
    }

    CarFactory carFactory = new CarFactory();
    carFactory.changeColor(car2, "WHITE");
    System.out.println(car2.getColor()); // white

    Person person = new Person(); // Constructor
    Computer computer = new Computer();
    String str = new String("Hello"); // str -> object reference
    System.out.println(str); // Hello

    person.setAge(15);
    person.getAge(); // 15

    Student student = new Student("Eric", "Lau", 30);
    System.out.println(student.fullName()); // Eric Lau
    
>>>>>>> refs/remotes/origin/main
  }
}
