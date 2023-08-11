package shop;

import java.util.ArrayList;

public class ShoppingCart<T extends Item> {

  private ArrayList<T> items;

  public ShoppingCart() {
    items = new ArrayList<>();
  }

  // formal
  public void add(T item) {
    items.add(item);
  }

  // public void add(T food) {// instance method , 唔洗再描述範圍
  //   foods.add(food);
  // }

  public void addFood(Food food) {// instance method , 唔洗再描述範圍
    items.add(food);
  }

  public boolean removed(T item) {
    return items.remove(item);
  }

  public static void main(String[] args) {
    ShoppingCart<Item> cart1 = new ShoppingCart();
    cart1.add(new Rice());
    // cart1.add(new Food());// Food is abstract
    ShoppingCart<Drink> cart2 = new ShoppingCart();
    ShoppingCart<Food> cart3 = new ShoppingCart();
    ShoppingCart<Rice> cart4 = new ShoppingCart();

  }
}
