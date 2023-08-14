package example;

import javax.swing.Box;

import shop.Rice;

public class AnimalHospital<T extends Animal> {
  T animalType;

  public AnimalHospital() {

  }

  public AnimalHospital(T t) {
    this.animalType = t;
  }

  public static <T extends Animal> AnimalHospital<T> seeDoctor(T t) {
    return new AnimalHospital<>(t);
  }

  public static void main(String[] args) {
    // AnimalHospital<Animal> a1 = new AnimalHospital<>();
    AnimalHospital<Dog> d1 = new AnimalHospital<>();
    AnimalHospital<Cat> c1 = new AnimalHospital<>();
    // AnimalHospital<Lion> l1 = new AnimalHospital<>();

    AnimalHospital.seeDoctor((new Dog()));





    
    AnimalHospital.seeDoctor((new Rice()));

  }


}
