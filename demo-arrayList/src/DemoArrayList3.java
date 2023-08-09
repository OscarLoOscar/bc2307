public class DemoArrayList3 {
  public static void main(String[] args) {
    Person5 p1 = new Person5();

    Player5.fillThePocket(p1.getLeftPocket());
    System.out.println(p1.getLeftPocket().getSize()); // 5

    Player5.fillThePocket(p1.getRightPocket());
    System.out.println(p1.getRightPocket().getSize()); // 5

    System.out.println("p1 Total Score:" + p1.totalScore());
    System.out.println(
        "p1 Left Pocket Ball Details:" + p1.getLeftPocket().toString());
    System.out.println(
        "p1 Right Pocket Ball Details:" + p1.getRightPocket().toString());

    Person5 p2 = new Person5();
    Player5.fillThePocket(p2.getLeftPocket());
    Player5.fillThePocket(p2.getRightPocket());

  }
}
