package shop;

public class CheckOutItem extends Item {
  public CheckOutItem(int price, int quantity) {
    super(price);
    this.quantity = quantity;
  }

  private int quantity;

  public int getQuantity() {
    return this.quantity;
  }

}
