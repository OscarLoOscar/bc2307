//outer class
//Can Access static nested class

import java.util.List;

public class Student6 {
  String name;

  Bag bag;

  public Student6(String name) {
    this.name = name;
    bag = new Student6.Bag();
  }

  // public int getBagSize() {
  // // return new Student6.Bag().getSize();
  // return this.bag.getSize();
  // }

  public int getBagSize() {
    return new Student.Bag().getSize();
  }

  public String getName() {
    return this.name;
  }

  public Student6() {
  }

  // static nested class
  // inner class (non-static nested class)
  // belongs to 關係
  private static class Bag {
    // constructor
    // getter,setter
    // instance method
    // cannot Access Outer Class Attribute
    int size;
    List<String> strings;

    public Bag() {

    }

    public Bag(int size) {
      this.size = size;
    }

    public void setSize(int size) {
      this.size = size;
    }

    public int getSize() {
      return this.size;
    }

    public static void clear(Bag bag) {
      bag.strings.clear();
    }

    @Override
    public String toString() {
      return "Bag[size = ]" + this.size//
          + " , " + this.strings;
    }
  }

  public class Grade {
    private int score;

    // isMale()
    // isElderly()
    public char getGrade() { // presentation 用method寫
      switch (this.score) {
        case (90):
          return 'A';
        case (80):
          return 'B';
        case (70):
          return 'C';
        default:
          return 'E';

        // break;, 唔return 就break
      }
    }

    public Grade(int score) {
      this.score = score;
    }

    public void printStudentName() {
      System.out.println(Student6.this.getName());
    }

    public static void printHello() {
      Grade.printHello();
    }
  }

  public static void main(String[] args) {
    Student6 student6 = new Student6();// student's constructot
    Student6.Bag bag = new Student6.Bag();// bag's constructot
    Student6.Grade grade = new Student6("Peter").new Grade(70);
    Student6.Grade grade2 = student6.new Grade(70); // 用object 去new 野
    grade2.printStudentName();
    // Student6.Grade.printHello();
  }
}
