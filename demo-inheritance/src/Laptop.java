public class Laptop extends Machine {
  // Laptop is subclass (child), Machine is superclass (parent)
  // Inherit Machine attribute ("double weight")
  // Inherit Machine methods (start() and stop())

  private Keyboard keyboard;
  private Monitor monitor;

  // subclass constructor must call one of superclass constructors

  public Laptop() {
    // implicitly call superclass empty constructor
    // new Machine()
  }

  public Laptop(Keyboard keyboard, Monitor monitor) {
    // implicitly call superclass empty constructor
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop(String buttonType, int noOfButton, double length,
      double width) {
    // implicitly call superclass empty constructor
    this.keyboard = new Keyboard(buttonType, noOfButton);
    this.monitor = new Monitor(length, width);
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor) {
    super(weight); // new Machine(5);
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  @Override // Method Overriding
  public void start() {
    System.out.println("Laptop Start ...");
  }

  @Override // Method Overriding
  public void stop() {
    System.out.println("Laptop Stop ...");
  }

  public static void main(String[] args) {
    Laptop laptop = new Laptop("abc", 100, 15, 10);
    laptop.setWeight(3.0d);
    System.out.println(laptop.getWeight()); // 3.0
    laptop.start(); // Laptop Start ...
    laptop.stop(); // Laptop Stop ...

    Machine machine = new Machine();
    machine.setWeight(5.0d);
    System.out.println(machine.getWeight()); // 5.0
    machine.start(); // Machine Start ...
    machine.stop(); // Machine Stop ...
  }

}
