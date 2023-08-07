public class DemoArrayList3 {
  public static void main(String[] args) {
    Ball b1 = new Ball(Colour5.RED);
    Ball b2 = new Ball(Colour5.BLUE);
    Ball b3 = new Ball(Colour5.YELLOW);
    Ball b4 = new Ball(Colour5.RED);
    Ball b5 = new Ball(Colour5.RED);
    Ball b6 = new Ball(Colour5.YELLOW);
    Ball b7 = new Ball(Colour5.BLUE);
    Ball b8 = new Ball(Colour5.RED);
    Pocket p1 = new Pocket();
    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    p1.add(b4);
    p1.add(b5);
    System.out.println(p1);
    // p1.remove(b1);

  }
}
