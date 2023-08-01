package ex1;

public abstract class Person {// abstract class 特點：May contain instance method with implementation
  // The class Person can be either abstract or final, not both
  private int age;
  private int height;

  // final 無extands
  // abstract 唔比人 new

  public Person() {

  }

  public int getAge() {
    return this.age;
  }

  public void run() {
    System.out.println("I am Person , running.");
  }

  // May contain abstract method( without implementation)
  public abstract void sleep();
}
