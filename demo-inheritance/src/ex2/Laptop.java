package ex2;

import java.util.Objects;

public class Laptop extends Machine {// Laptop is subClass/childClass , machine is parentClass/superClass
  // double weight
  private Keybroad keybroad;
  private Monitor monitor;
  private int vloume;

  // subClass must call superclass constructor
  public Laptop() {
    // implicitly call superclass empty constructor
  }

  public Laptop(Keybroad keybroad, Monitor monitor) {
    this.keybroad = keybroad;
    this.monitor = monitor;
  }

  public Laptop(String buttonType, int noOfButton, double length, double width) {
    this.keybroad = new Keybroad(buttonType, noOfButton);
    this.monitor = new Monitor(length, width);
  }

  public Laptop(double weight, Keybroad keybroad, Monitor monitor) {
    // super(weight);
    super();
    this.setWeight(weight);
    this.keybroad = keybroad;
    this.monitor = monitor;
  }

  public void mute() {
    this.vloume = 0;
  }

  @Override // complier will check superclass 有冇同樣method
  public void start() {
    super.start();
    System.out.println("Laptop is start...");
  }

  @Override
  public void stop() {
    System.out.println("Laptop is stop...");
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;

    if (!(o instanceof Laptop))
      return false;

    Laptop laptop = (Laptop) o;
    return Objects.equals(laptop.keybroad, this.keybroad) &&
        Objects.equals(laptop.monitor, this.monitor);

  }

  // you cannot override the final method in superclass
  public static void main(String[] args) {
    Laptop laptop = new Laptop("abc", 100, 150, 10);
    laptop.setWeight(3.0);
    System.out.println(laptop.getWeight());
    laptop.start();
    laptop.stop();

    Machine machine = new Machine();
    machine.setWeight(5.0);
    System.out.println(machine.getWeight());
    machine.start();
    machine.stop();

    Machine.ststicMethod("abc", "def");
    // laptop.ststicMethod("abc", "null"); 照call到static method，但慢,not recommended

  }
}
