package cosmetic.product;

import java.util.ArrayList;
import java.util.List;

import cosmetic.Brand;
import cosmetic.Cosmetic;

public class Mascara extends Cosmetic {
  public static List<Mascara> list;

  public Mascara() {
    list = new ArrayList<Mascara>();
    list.add(new Mascara(Brand.CHANEL, 156.9));
    list.add(new Mascara(Brand.DIOR, 149.9));
    list.add(new Mascara(Brand.DIOR, 250.5));
    list.add(new Mascara(Brand.MAC, 129.9));
    list.add(new Mascara(Brand.MAC, 159.9));

  }

  public Mascara(Brand brand, double price) {
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
