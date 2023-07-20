import java.util.Random;

public class Game {
  public static void main(String[] args) {
    // 1 - 100
    // bomb = 45 (random number)
    // Next round: Please input a number (1-100):
    // user input: 30
    // Next round: Please input a number (31-100):
    // user input 60
    // Next round: Please input a number (31-59):
    // user input 45
    // exit loop. Bomb!
    int min = 1;
    int max = 100;
    int bomb = new Random().nextInt(100) + 1; // 1 - 100
    // min and max should be modified in each iteration
    // do-while
  }
}
