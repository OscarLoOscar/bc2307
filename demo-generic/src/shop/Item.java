package shop;

public abstract class Item {
  // int quantity ; doesnt make sense
  // private String header;
  // private String desc;
  private int price;

  public Item(int price) {
    this.price = price;
  }

  public int getPrice() {
    return this.price;
  }
}
