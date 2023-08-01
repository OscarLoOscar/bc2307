package ex1;

public abstract class Adult extends Person {
  // abstract class extends abstract class
  // implicitly extends" abstract method

  public Adult() {
    super();
  }

  public abstract void read();

  public void eat() {
    System.out.println("I am Adult m andeating.");
  }
}
