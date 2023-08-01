package order;

import java.util.Arrays;

public class Order {
  private Transaction[] transactions;

  public Order(Transaction[] transactions) {
    // pass by reference
    this.transactions = Arrays.copyOf(transactions, transactions.length);
  }

  // get total() -> sum up subtotal
  public double[] getSubTotalByArray(double quantity, double unitPrice) {
    double[] saveTotal = new double[this.transactions.length];
    for (int i = 0; i < saveTotal.length; i++) {
      saveTotal[i] = this.transactions[i].getQuantity() * this.transactions[i].getUnitPrice();
    }
    return saveTotal;
  }

  public double[] getSubTotal2() {
    double[] saveTotal = new double[this.transactions.length];
    for (int i = 0; i < saveTotal.length; i++) {
      saveTotal[i] = this.transactions[i].getQuantity() * this.transactions[i].getUnitPrice();
    }
    return saveTotal;
  }

  public static double getTotal(double subPrice1, double subPrice2) {
    return subPrice1 + subPrice2;
  }
}