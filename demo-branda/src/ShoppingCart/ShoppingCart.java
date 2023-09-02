package ShoppingCart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Supermarket.FoodItem;

public class ShoppingCart<T extends ProductList> implements Iterable<T> {
  double price;
  List<T> shoppingCar;

  public ShoppingCart() {

  }

  public ShoppingCart(T t) {
    shoppingCar = new ArrayList<>();
    shoppingCar.add(t);
  }

  public static <T extends ProductList> ShoppingCart addItem(T t) {
    ShoppingCart<T> car = new ShoppingCart<>();
    car.shoppingCar.add(t);
    return car;
  }

  public static <T extends ProductList> double getTotalPrice(T t) {
    double totalPrice = 0;
    for (ProductList p : t) {
      totalPrice += p.getPrice();
    }
    return totalPrice;
  }

  @Override
  public Iterator<T> iterator() {
    return shoppingCar.iterator();
  }

  public static void main(String[] args) {
    ShoppingCart<ProductList> car1 = new ShoppingCart<>();
    car1 = ShoppingCart.addItem(FoodItem.init(1));
    System.out.println(car1);
  }

}
