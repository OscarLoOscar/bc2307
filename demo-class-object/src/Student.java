public class Student {
  private String firstName;
  private String lastName;
  private int age;

  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

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
  }

  public static boolean isAdult(int age) {
    return age >= 18;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public int getAge() {
    return this.age;
  }
}
