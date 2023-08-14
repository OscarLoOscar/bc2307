public class Zoo<T> {

  T aminal;

  T getAnimal() {
    return this.aminal;
  }

  public void setAnimal(T animal) {
    this.aminal = animal;
  }

  public Zoo() {
  }

  public Zoo(T t) {
    this.aminal = t;
  }

  public static <T extends Dog5> Zoo<T> of(T t) { // return tupe AND/OR input parameter 放T,要描述T範圍
    return new Zoo<>(t);
  }
  /*
   * static 同return type 中間要放範圍
   * 
   * Zoo<T> is return type T -> input parameter <T> range of T
   * 
   * if <T> not T : <T extends Dog>
   */

  public static void main(String[] args) {
    // Zoo<Dog> zoo1 = new Zoo<>();
    Zoo<Dog5> zoo1 = Zoo.of(Dog5.of("abc"));
    // zoo1.setAnimal(new Cat()); Compile error -> strongm type check
    zoo1.setAnimal(Dog5.of("def"));

    Zoo<Animal5> zoo2 = Zoo.of(new Cat5());// error
    zoo2.setAnimal(new Animal5());
    zoo2.setAnimal(new Dog5("abc"));
    zoo2.setAnimal(new Cat5("abc"));

    Dog5 dog = Dog5.of("abc");

    Zoo<String> zoo3 = Zoo.of("Abc");
  }
}
