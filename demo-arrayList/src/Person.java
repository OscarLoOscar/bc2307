import java.util.Random;

public class Person implements Player5 {

  // Pocket leftPocket;
  // Pocket rightPocket;
  Pocket[] pockets;

  public Person() {
    pockets = new Pocket[2];
  }

  public Pocket getLeftPocket() {
    return this.pockets[0];
  }

  public Pocket getRightPocket() {
    return this.pockets[1];
  }

  public int calculateScore() {

  }

  public void fillThePocket(Pocket pocket) {
    while (!pocket.isFull()) {
      // Random a ball with a random colour
      pocket.add(Ball.random());
    }
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person();
    Person.fillThePocket(p1.getLeftPocket());
    Person.fillThePocket(p1.getRightPocket());
    System.out.println(p1.getLeftPocket().getSize());
    System.out.println(p1.getRightPocket().getSize());

  }
}
