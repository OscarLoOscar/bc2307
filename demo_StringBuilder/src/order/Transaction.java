package order;

public class Transaction {
  private int itemNo;
  private ItemDescription itemDesc;
  private int quantity;
  private double unitPrice;

  public Transaction() {

  }

  public Transaction(int itemNo, ItemDescription itemDesc, int quantity, double unitPrice) {
    this.itemNo = itemNo;
    this.itemDesc = itemDesc;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public int getItemNo() {
    return this.itemNo;
  }

  public ItemDescription getItemDesc() {
    return this.itemDesc;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public double getUnitPrice() {
    return this.unitPrice;
  }

  public void setItemNo(int itemNo) {
    this.itemNo = itemNo;
  }

  public void setItemDesc(ItemDescription itemDesc) {
    this.itemDesc = itemDesc;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public double getSubTotalByDoble() {
    return this.quantity * this.unitPrice;
  }

}
