package cosmetic;

public enum Brand {
  DIOR(1),
  CHANEL(2),
  MAC(3),
  ;

  private int brandNum;

  public int getBrandNum() {
    return this.brandNum;
  }

  private Brand(int brandNum) {
    this.brandNum = brandNum;
  }
}
