public class Car {

  int noOfWheel; // 0
  int capacity; // 0
  String color; // null

  // Empty Constructor
  public Car() {

  }

  // All-arguements Constructor (with all attributes)
  public Car(int noOfWheel, int capacity, String color) {
    this.noOfWheel = noOfWheel;
    this.capacity = capacity;
    this.color = color;
  }

  public int getNoOfWheel() {
    return this.noOfWheel;
  }

  public void setNoOfWheel(int noOfWheel) {
    this.noOfWheel = noOfWheel;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

}
