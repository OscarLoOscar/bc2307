package Builder;

import Supermarket.FoodItem;
import Supermarket.Foodtype;
import Supermarket.FrozenMeat;
import Supermarket.Fruit;
import Supermarket.ProcessingMethod;

/*    FoodItem f3 = new FoodItem.Builder()
        .Foodtype(Foodtype.FRUIT)
        .Fruit(Fruit.BANANA)
        .Price(69.9)
        .build();
 */
public class testB {

  public FoodItem get() {
    FoodItem f2 = new FoodItem.Builder()
        .Foodtype(Foodtype.MEAT)
        .FrozenMeat(FrozenMeat.CHICKEN)
        .ProcessingMethod(ProcessingMethod.BONELESS)
        .Price(69.9)
        .build();
    return f2;
    // return Product.<FoodItem>builder()
    // .ok()//
    // .data(f2)
    // .build();
  }

  // 用到lambda <-> @FunctionalInterface <-> interface得一個method
  public static void main(String[] args) {
    System.out.println(new testB().get());
    // Product<FoodItem> test1 = new Product<FoodItem>().builder()
    // .ok()
    // .success(Code.SUCCESS.success())//
    // .data();
    // return Product.<FoodItem>builder()
    // .ok()
    // .data(Product)
    // .build();
  }
}
