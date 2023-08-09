public enum Color {
  RED(1), //
  YELLOW(2), //
  BLUE(3),//
  ;

  private int id;

  private Color(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }
}
