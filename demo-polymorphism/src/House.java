public class House extends Building {
  private double capacity;

  public void setCapacity(double capacity) {
    this.capacity = capacity;
  }

  public double getCapacity() {
    return this.capacity;
  }

  @Override
  public void print() {
    System.out.println("I am nothing");
  }

  // method overloading
  public void print(String str){

  }

}
