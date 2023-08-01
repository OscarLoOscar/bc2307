package shape;

public class DemoShape {
  public static void main(String[] args) {
    Square s1 = new Square(10);
    Square s2 = new Square(4);
    Square s3 = new Square(5);

    // s1.modify(1);
    System.out.println("\n" + "s1 : " + s1);

    // //s1 ->edges[0] color ->YELLOW
    s1.getEdge(1).setColor("YELLOW");
    System.out.println(s1.getEdge(1).getColor());
  }

}
