import java.util.Random;

public class Person5 implements Player5 {

  // Pocket leftPocket;
  // Pocket rightPocket;
  Pocket[] pockets;

  public Person5() {
    pockets = new Pocket[2];
    pockets[0] = new Pocket();
    pockets[1] = new Pocket();
  }

  public Pocket getLeftPocket() {
    return this.pockets[0];
  }

  public Pocket getRightPocket() {
    return this.pockets[1];
  }


  @Override
  public int totalScore() {
    return this.getLeftPocket().totalScore()
        + this.getRightPocket().totalScore();
  }



  public static void main(String[] args) {
    Person5 p1 = new Person5();
    Person5 p2 = new Person5();
    Player5.fillThePocket(p1.getLeftPocket());
    Player5.fillThePocket(p1.getRightPocket());
    System.out.println("TEST");
    System.out.println(p1.getLeftPocket());
    System.out.println(p1.getLeftPocket().getSize());//5
    System.out.println(p1.getRightPocket().getSize());//5
    System.out.println("TEST");
    System.out.println(p1.getLeftPocket());
    // System.out.println(p1.getLeftPocket().remove(0););
    p1.getLeftPocket().remove1(1);
    System.out.println("AFTER");
    System.out.println(p1.getLeftPocket());
  }

}
