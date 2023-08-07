public enum Color {
  // hexcode
  RED("#FF0001"), //
  PINK("#FFC0CB"), //
  GREEN("#008000"), //
  BLUE("#0000FF");//
  ;

  private String hexcode;

  private Color(String hexcode) {
    this.hexcode = hexcode;
  }

  public String getHexcode() {
    return this.hexcode;
  }


}
