public class Person implements Swimable {
  String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public void swim() {
  }

  @Override
  public String toString() {
    return "name : " + this.name;
  }
}
