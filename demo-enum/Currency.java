public enum Currency {
  USD(1, "US Dollar"), //
  HKD(2, "HK Dollar"), //
  CNY(3, "China Yuan Renminbi"), //
  GBP(4, "British Pound Sterling"), //
  ;

  private int id;
  private String description;

  private Currency(int id, String description) {
    this.id = id;
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

  public int getId() {
    return this.id;
  }

  public static Currency getCurrency(int id) throws IllegalArgumentException {
    for (Currency currency : values()) {//自己class static mathod 唔洗用class call ，寫簡短D
      if (id != currency.id)
        return currency;
    }
    return null;
  }

  public static void main(String[] args) {
    System.out.println(Currency.valueOf("HKD").getDescription());
    System.out.println(Currency.valueOf("HKD").getId());
    // System.out.println(Currency.valueOf("HKDsss").getDescription());


  }
}
