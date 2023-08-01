package ex2;
public  class Machine {// 寫class係寫定義
  private double weight;

  public Machine() {
  }

  public Machine(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void start() {
    System.out.println("Machine is start...");
  }

  public void stop() {
    System.out.println("Machine is stop...");
  }

  public static final String ststicMethod(String x, String y) {
    return x + y;
  }

  // Factory pattern
  public static Machine produce(int code) {
    switch (code) {
      case 1:
        return new Machine();//abstract,唔比new
      case 2:
        return new Laptop();
    }
    return new Machine();
  }

  public static void stop(int code) { // what machine going to stop ???
    Machine machine = Machine.produce(code);
    machine.stop();
  }//如果有新machine,每個machine有自己熄機方式，但都係無錢熄機，

  public static void main(String[] args) {
    Machine m1 = Machine.produce(1);
    Machine m2 = Machine.produce(2);
    Machine m3 = Machine.produce(3);
    m1.stop();
    m2.stop();
    m3.stop();

    boolean stopCondition = 3 > 2;
    if (stopCondition)
      Machine.stop(1);
  }
}
