public enum Color3 {
  // hexcode
  RED("#FF0001"), //
  PINK("#FFC0CB"), //
  GREEN("#008000"), //
  BLUE("#0000FF"), //
  YELLOW("09000FF"),//
  ;

  private String hexcode;

  private Color3(String hexcode) {
    this.hexcode = hexcode;
  }

  public String getHexcode() {
    return this.hexcode;
  }


}
