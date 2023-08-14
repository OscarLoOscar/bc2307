public class Dog5 extends Animal5 {

  private Dog5(String name) {// 先private it first
    super(name);
  }

  public void setName(String name) {
this.name=name;
  }

  // then make a static constructor
  public static Dog5 of(String name) {
    name = name == null ? "default" : name;
    return new Dog5(name);
  }
}
// public static Dog5 of(String name) {
// if (name.isEmpty() || name == null)
// return new Dog5("default");
// return new Dog5(name);
// }
// }

// public static Dog5 of(String name) {
// if (name == null || name.isEmpty()) {
// return new Dog5("default");
// } else {
// return new Dog5(name);
// }
