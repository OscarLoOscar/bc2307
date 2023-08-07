public class Student {
<<<<<<< HEAD
=======
  // State / Instance Variables
>>>>>>> refs/remotes/origin/main
  private String firstName;
  private String lastName;
  private int age;

<<<<<<< HEAD
=======
  // All-arguments constructor -> new object (instance)
>>>>>>> refs/remotes/origin/main
  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

<<<<<<< HEAD
  // public Student() {

  // }

  // public void setFirstName(String firstName) {
  // this.firstName = firstName;
  // }

  // public void setLastNAme(String lastName) {
  // this.lastName = lastName;
  // }
  public String fullName() {
    return this.firstName.concat(" ").concat(lastName);
  }

  public boolean isAdult() {
    return this.age >= 18;
    // return this.age >= 18 ? true : false; //多餘
=======
  public String fullName() {
    return this.firstName.concat(" ").concat(this.lastName);
  }

  // Behaviors / Methods
  // public String getFirstName() {
  // return this.firstName;
  // }

  // public String getLastName() {
  // return this.lastName;
  // }

  public boolean isAdult() {
    // if (this.age >= 18)
    // return true;
    // return false;
    // return this.age >= 18 ? true : false;
    return this.age >= 18;
>>>>>>> refs/remotes/origin/main
  }

  public static boolean isAdult(int age) {
    return age >= 18;
  }

<<<<<<< HEAD
=======
  public int getAge() {
    return this.age;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

>>>>>>> refs/remotes/origin/main
  public void setAge(int age) {
    this.age = age;
  }

<<<<<<< HEAD
  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public int getAge() {
    return this.age;
  }
=======

>>>>>>> refs/remotes/origin/main
}
