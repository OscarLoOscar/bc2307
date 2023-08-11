public class Dog5 extends Animal5 {

  private Dog5(String name) {// 先private it first
    super(name);
  }

  // then make a static constructor
  public static Dog5(String name) {
    // if ("".equals(name) == null)
    // this.name = name;
    name = name == null ? "default" : name;
    return new Dog5(name);
  }

}


