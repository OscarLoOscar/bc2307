package ex1;

public class Student extends Adult {
  // must implement abstract method
  // @Override
  public void sleep() {
    System.out.println("I am student , sleeping .");
  }

  public Student() {
    super();
  }

  // @Override
  public void read() {
    System.out.println("I am student , reading");
  }

  public static void main(String[] args) {
    Student student = new Student();
    student.read();
    student.run();
    student.sleep();
    student.eat();
  }
}
