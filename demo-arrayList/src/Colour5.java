import java.util.Arrays;
import java.util.Random;

public enum Colour5 {
  RED(100, "ABC"), //
  BLUE(200, "DFG"), //
  YELLOW(300, "FGG"),//
  ;

  private int score;
  private String value;

  private Colour5(int score) {
    this.score = score;
  }

  private Colour5(int score, String value) {
    this.score = score;
    this.value = value;
  }

  public int getScore() {
    return this.score;
  }

  // 0,1,2
  public static Colour5 getColour5(int randomNumber) {
    if (randomNumber < 0 || randomNumber > 2)
      return null;
    switch (randomNumber) {
      case 0:
        return Colour5.RED;
      case 1:
        return Colour5.BLUE;
      case 2:
        return Colour5.YELLOW;
    }
    return null;
  }

  public static void main(String[] args) {
    String ans = Integer.toBinaryString(1000);
    System.out.println("String : " + ans);
    int ans2 = Integer.valueOf(ans);
    System.out.println("Int : " + ans2);
  }

  public static Colour5 asf(int score) {
    return Arrays.stream(Colour5.values())
        .filter(e -> e.score == (score))
        .findFirst()//
        .orElseThrow(() -> new IllegalArgumentException(""));
  }
}
