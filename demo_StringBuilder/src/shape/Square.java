package shape;

import java.util.Arrays;

public class Square {
  // private Double length = 3.0;// instance variable
  private final Edge[] edges; // final 呢舊野意思: final address ->
  // create 一個square最重要係：用家可以改埋入面D野？定改用邊個adress裝住入面D野
  // private static int edgeCounter;

  // public Square() {
  // this.edges = new Edge[4];
  // this.edges[0] = new Edge(id, 3.0d, "RED");
  // this.edges[1] = new Edge(id, 3.0d, "YELLOW");
  // this.edges[2] = new Edge(id, 3.0d, "BLACK");
  // this.edges[3] = new Edge(id, 3.0d, "BLUE");
  // Square.resetId();
  // }

  public Square(double length) {
    if (length <= 0.0)
      length = 1.0d;
    int id = 0;
    this.edges = new Edge[4]; // new address
    this.edges[0] = new Edge(++id, length, "RED");// new address
    this.edges[1] = new Edge(++id, length, "RED");// new address
    this.edges[2] = new Edge(++id, length, "RED");// new address
    this.edges[3] = new Edge(++id, length, "RED");// new address
    // Square.resetId();
  }

  public Edge getEdge(int edgeId) {
    return this.edges[edgeId - 1];
  }

  // public static void resetId() {
  // edgeCounter = 0;
  // }

  private Edge[] getEdges() {
    return this.edges;
  }
  // 用家唔需要關心square用緊memory咩object(Edge[])
  // public void setEgde(Edge[] edges) {
  // return this.edges = edges; //除左constructor, this.edges 不能被修改
  // }

  // 用家只需關心點改大小
  public void modify(double length) {
    // Approach 1
    // this.edges[0].setLength(length);
    // this.edges[1].setLength(length);
    // this.edges[2].setLength(length);
    // this.edges[3].setLength(length);

    // Approach 2
    this.getEdges()[0].setLength(length);
    this.getEdges()[1].setLength(length);
    this.getEdges()[2].setLength(length);
    this.getEdges()[3].setLength(length);

  }

  // method overloading , same name, but with different parameters
  public void modify(String color) {
    this.getEdges()[0].setColor(color);
    this.getEdges()[1].setColor(color);
    this.getEdges()[2].setColor(color);
    this.getEdges()[3].setColor(color);
  }

  public void modify(int edgeId, String color) {
    this.getEdges()[edgeId].setColor(color);
  }

  @Override
  public String toString() {
    return Arrays.toString(this.edges);
  }


  // wrong , vecause of final
  // public void testToTryTheDifferentFinal(Edge[] edges) {
  // this.edges = edges;
  // }

  public static void main(String[] args) {
    Square square = new Square(1.0);
    System.out.println(square);

    Edge[] newEdges = new Edge[4];
    newEdges[0] = new Edge(1, 100, "BLUE");
    newEdges[1] = new Edge(2, 100, "BLUE");
    newEdges[2] = new Edge(3, 100, "BLUE");
    newEdges[3] = new Edge(4, 100, "BLUE");

    square.getEdges()[0].setLength(100);
    square.getEdges()[0].setColor("BLUE");
    System.out.println(square);

  }
}