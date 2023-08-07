public class Demo2 {
  public static void main(String[] args) {
    // Dynamic Polymorphism, run time will affect sth
    Building house = new House();
    // Before the program runs
    // building.getCapacity();// compile error cannot convert from Building to House
    house.print();// compile time check related item only -> strong type
    // compile-time confirm you can call print() method
    // Run-time -> decide which print() is going to call .So , "building" variable call House's mathod
    house.print2();// I am House , why ??

    House test = new House();
    test.print();
    test.print2();
    //
    // House house = new Building();//cannot convert from Building to House
    // 特出黎method call唔到
    Building test1 = new Building();// compile error , abstract class
    // test.print();
    // test.print2();


    // House house2 = new House();
    // house2.setCapacity(10.0d);
    // System.out.println(house2.getCapacity());

    // house.print();
    // house.print2();

    // Static polymorphism( Compile-Time)
    // Method Signature (method name + parameters)
    // Constructor Signatures
  }
}
