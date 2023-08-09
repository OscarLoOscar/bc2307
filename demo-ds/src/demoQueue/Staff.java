package demoQueue;

public class Staff implements Walkable {

  @Override
  public void walk() {
    System.out.println("Staff is Walking");
  }

  public static void main(String[] args) {
    Walkable person1 = new Student();
    Walkable person2 = new Staff();
    int a = 20;
    if (a > 10)
      person1.walk();// compile time check
    person2.walk();
  }
}
