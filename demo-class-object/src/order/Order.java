package order;

public class Order {

  private Transaction[] transactions;

  public Order(Transaction[] transactions) {
    // Pass by reference
    this.transactions = transactions;
  }

  // getTotal() -> sum up subtotal

}
