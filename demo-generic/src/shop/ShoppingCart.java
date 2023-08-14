package shop;

import java.util.ArrayList;

public class ShoppingCart<T extends CheckOutItem> { // 分離system，唔extends Item
  // solution 2 :public class ShoppingCart { 唔extends

  private ArrayList<CheckOutItem> items;

  /*
   * solution 1 : The method add(T) in the type ArrayList<T> is not applicable for
   * the arguments (CheckOutItem)
   */
  public ShoppingCart() {
    items = new ArrayList<CheckOutItem>();
  }

  // public void add(T item) {
  // items.add(item);
  // }
  public void add(int quantity, DisplayItem DisplayItem) {
    CheckOutItem checkOutItem = new CheckOutItem(quantity, DisplayItem.getPrice());
    items.add(checkOutItem);
  }

  public int totalAmount() {
    int sum = 0;
    for (CheckOutItem item : this.items) {
      sum += Math.max(0, item.getPrice()) * Math.max(0, item.getQuantity());
    }
    return sum;
  }
  // public void add(T food) {// instance method , 唔洗再描述範圍
  // foods.add(food);
  // }

  // public void addFood(Food food) {// instance method , 唔洗再描述範圍
  // items.add(food);
  // }

  public boolean removed(T item) {
    return items.remove(item);
  }

  public void clear() {
    this.items.clear();
  }

  // public static <T extends CheckOutItem> ShoppingCart<T> of(T t) {
  // return new Food(Meat.values());
  // }

  public static void main(String[] args) {
    ShoppingCart<CheckOutItem> cart1 = new ShoppingCart();
    cart1.add(1, new Rice(59));
    // add(int quantity, DisplayItem DisplayItem) {

    // cart1.add(new Food());// Food is abstract

    // ShoppingCart<Drink> cart2 = new ShoppingCart();
    // ShoppingCart<Food> cart3 = new ShoppingCart();
    // ShoppingCart<Rice> cart4 = new ShoppingCart();

    // ShoppingCart<Food> order1 = ShoppingCart.of(Food.of(Meat.CHICKEN));

    /*
     * Bound mismatch: The type Drink is not a valid substitute for the bounded
     * parameter <T extends CheckOutItem> of the type ShoppingCart<T>
     * Bound mismatch: The type Food is not a valid substitute for the bounded
     * parameter <T extends CheckOutItem> of the type ShoppingCart<T>
     * Bound mismatch: The type Rice is not a valid substitute for the bounded
     * parameter <T extends CheckOutItem> of the type ShoppingCart<T>
     */
  }
}
