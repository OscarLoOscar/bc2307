public enum Colour5 {
  RED(1, 100), //
  BLUE(2, 200), //
  YELLOW(3, 300),//
  ;

  private int colourId;
  private int score;

  private int ColourId(int colourId){
    return this.colourId;
  }

  private Colour5(int score) {
    this.score = score;
  }

  private Colour5(int colourId, int score) {
    this.colourId = colourId;
    this.score = score;
  }

  public int getColourId() {
    return this.colourId;
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
