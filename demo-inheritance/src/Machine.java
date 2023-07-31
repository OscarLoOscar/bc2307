public class Machine {

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
    System.out.println("Machine Start ...");
  }

  public void stop() {
    System.out.println("Machine Stop ...");
  }

}
