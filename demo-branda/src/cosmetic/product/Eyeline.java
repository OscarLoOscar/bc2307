package cosmetic.product;

import java.util.ArrayList;
import java.util.List;

import cosmetic.Brand;
import cosmetic.Cosmetic;

public class Eyeline extends Cosmetic {
  public static List<Eyeline> list;

  public Eyeline() {
    list = new ArrayList<Eyeline>();
    list.add(new Eyeline(Brand.CHANEL, 359.9));
    list.add(new Eyeline(Brand.DIOR, 259.9));
    list.add(new Eyeline(Brand.DIOR, 220.5));
    list.add(new Eyeline(Brand.MAC, 59.9));
    list.add(new Eyeline(Brand.MAC, 79.9));

  }

  public Eyeline(Brand brand, double price) {
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
