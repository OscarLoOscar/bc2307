public class Product {
  // instance variable在對像被創建時初始化，假如有5個對象，那5個對像中該instance variable可以有不同的值。
  private double price;

  public Product(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}

class TaxCalculator {
  public double calculateTax(double price) {
    return price * 0.10;
  }
}

class ProductUpdater {
  public void updatePrice(Product product, double newPrice) {
    product.setPrice(newPrice);
  }
}

class PassByValueAndReference {
  public static void main(String[] args) {
    Product product = new Product(100.00);
    TaxCalculator taxCalculator = new TaxCalculator();
    ProductUpdater productUpdater = new ProductUpdater();

    // Pass by value
    double tax = taxCalculator.calculateTax(product.getPrice());
    System.out.println("The tax for the product is: " + tax);

    // The original price of the product is not affected.
    System.out.println("The price of the product is: " + product.getPrice());

    // Pass by reference
    productUpdater.updatePrice(product, 200.00);

    // The original price of the product is updated.
    System.out.println("The price of the product is: " + product.getPrice());
  }
}
