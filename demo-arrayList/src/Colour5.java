public enum Colour5 {
  RED(100), //
  BLUE(200), //
  YELLOW(300),//
  ;

  private int score;

  private Colour5(int score) {
    this.score = score;
  }


  public int getScore() {
    return this.score;
  }

  public static Colour5 getColour5(int id) {
    if (id < 0 || id > 2)
      return null;
    switch (id) {
      case 0:
        return Colour5.RED;
      case 1:
        return Colour5.BLUE;
      case 2:
        return Colour5.YELLOW;
    }
    return null;
  }
}
