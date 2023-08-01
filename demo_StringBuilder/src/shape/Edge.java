package shape;

public class Edge {
  private double length;
  private String color;
  private int id;

  @Override
  public String toString() {
    return this.color + " " + this.length;
  }


  // the problem is resetId() is public , you dont know the user when ,where, use
  // resetId() , MUST controll by Edge

  public Edge() {
    // this.id = ++counter;
  }

  public Edge(int id, double length, String color) {
    this.id = id;
    this.length = length;
    this.color = color;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public double getLength() {
    return this.length;
  }

}