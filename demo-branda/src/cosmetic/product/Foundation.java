package cosmetic.product;

import java.util.ArrayList;
import java.util.List;

import cosmetic.Brand;
import cosmetic.Cosmetic;

public class Foundation extends Cosmetic {
  public static List<Foundation> list;

  public Foundation() {
    list = new ArrayList<Foundation>();
    list.add(new Foundation(Brand.CHANEL, 330));
    list.add(new Foundation(Brand.DIOR, 349.9));
    list.add(new Foundation(Brand.DIOR, 450.5));
    list.add(new Foundation(Brand.MAC, 239.9));
    list.add(new Foundation(Brand.MAC, 299.9));

  }

  public Foundation(Brand brand, double price) {
    this.getBrand(brand);
    this.getPrice(price);
  }

  public Brand getBrand(Brand brand) {
    return this.getBrand(brand);
  }

  public double getPrice(double price) {
    return this.getPrice(price);
  }

}
