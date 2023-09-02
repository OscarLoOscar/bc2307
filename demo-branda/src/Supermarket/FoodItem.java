package Supermarket;

import java.util.ArrayList;
import java.util.List;

public class FoodItem extends Food {

  private Foodtype foodtype;
  private Fruit fruit;
  private FrozenMeat frozenMeat;
  private ProcessingMethod processingMethod;
  private double price;

  // public static List<FoodItem> list;

  // public FoodItem() {
  // list = new ArrayList<>();
  // list.add(new FoodItem(Foodtype.MEAT, FrozenMeat.BEEF,
  // ProcessingMethod.BONELESS, 169.9));
  // list.add(new FoodItem(Foodtype.MEAT, FrozenMeat.PORK,
  // ProcessingMethod.BONELESS, 99.9));
  // list.add(new FoodItem(Foodtype.MEAT, FrozenMeat.CHICKEN,
  // ProcessingMethod.PEELED, 99.9));
  // list.add(new FoodItem(Foodtype.MEAT, FrozenMeat.BEEF,
  // ProcessingMethod.BONELESS, 69.9));
  // list.add(new FoodItem(Foodtype.FRUIT, Fruit.APPLE, 69.9));
  // list.add(new FoodItem(Foodtype.MEAT, FrozenMeat.DUCK,
  // ProcessingMethod.BONELESS, 49.9));
  // }

  // public static FoodItem init(int num) {
  // return list.get(num);
  // }

  // public FoodItem(Foodtype foodtype, FrozenMeat FrozenMeat, ProcessingMethod
  // processingMethod, double price) {
  // this.getFoodtype(foodtype);
  // this.getFrozenMeat(FrozenMeat);
  // this.getProcessingMethod(processingMethod);
  // this.getPrice(price);
  // }

  // public FoodItem(Foodtype foodtype, Fruit fruit, double price) {
  // this.getFoodtype(foodtype);
  // this.getFruit(fruit);
  // this.getPrice(price);
  // }
  public FoodItem(Builder builder) {
    this.foodtype = builder.foodtype;
    this.fruit = builder.fruit;
    this.frozenMeat = builder.frozenMeat;
    this.processingMethod = builder.processingMethod;
    this.price = builder.price;
  }

  @Override
  public String toString() {
    return "foodtype : " + foodtype + "\n" + //
        "fruit : " + fruit + "\n" + //
        "frozenMeat : " + frozenMeat + "\n" + //
        "processingMethod : " + processingMethod + "\n" + //
        "price : " + price;
  }

  public static class Builder {
    private Foodtype foodtype;
    private Fruit fruit;
    private FrozenMeat frozenMeat;
    private ProcessingMethod processingMethod;
    private double price;

    public static Builder builder() {
      return new Builder();
    }

    // public Builder Fruit(String str)
    public Builder Fruit(Fruit fruit) {
      this.fruit = fruit;
      return this;
    }

    public Builder Foodtype(Foodtype foodtype) {
      this.foodtype = foodtype;
      return this;
    }

    public Builder FrozenMeat(FrozenMeat frozenMeat) {
      this.frozenMeat = frozenMeat;
      return this;
    }

    public Builder ProcessingMethod(ProcessingMethod processingMethod) {
      this.processingMethod = processingMethod;
      return this;
    }

    public Builder Price(double price) {
      this.price = price;
      return this;
    }

    public FoodItem build() {
      return new FoodItem(this);
    }
    // public static FoodItem get(int num) {

    // new FoodItem();
    // return list.get(num);
    // }

  }
}