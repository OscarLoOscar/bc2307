package order;

import java.util.Arrays;

public class ItemDescription {
  private String header;
  private String body;

  public ItemDescription(String header, String body) {
    this.header = header;
    this.body = body;
  }

  @Override
  public String toString() {
    return this.header + this.body;
  }

  public static void main(String[] args) {
    ItemDescription item1 = new ItemDescription("Item A", "90% discount just for today");
    ItemDescription item2 = new ItemDescription("Item B", "5% discount for this month");

    Transaction t1 = new Transaction(1, item1, 3, 10.5);
    Transaction t2 = new Transaction(2, item2, 4, 20.0);
    Order order = new Order(new Transaction[] { t1, t2 });

    double subPrice1 = t1.getQuantity() * t1.getUnitPrice();
    double subPrice2 = t2.getQuantity() * t2.getUnitPrice();
    double[] output = order.getSubTotalByArray(subPrice1, subPrice2);
    System.out.println(Arrays.toString(output));
    System.out.println(Order.getTotal(subPrice1, subPrice2));

    double[] test2 = order.getSubTotal2();
    System.out.println(Arrays.toString(test2));
  }
}
/**
 * Yes, it is suitable to use the object reference order to call the method
 * getSubTotal2(), even though the variable is itself. This is because the
 * getSubTotal2() method takes an Order object as its argument, and the variable
 * order is an Order object. So, when you call getSubTotal2() with order as the
 * argument, the method will be able to access the transactions field of the
 * Order object, which is the data that the method needs to calculate the
 * subtotal.
 * 
 * Here is a breakdown of what happens when you call getSubTotal2() with order
 * as the argument:
 * 
 * The getSubTotal2() method is called.
 * The Order object that is referenced by order is passed to the getSubTotal2()
 * method as the argument.
 * The getSubTotal2() method uses the transactions field of the Order object to
 * calculate the subtotal.
 * The getSubTotal2() method returns the subtotal.
 * So, as you can see, it is perfectly fine to use the object reference order to
 * call the method getSubTotal2(), even though the variable is itself.
 */

/**
 * In Java, all objects are passed by reference. This means that when you pass
 * an object to a method, the method gets a reference to the object, not a copy
 * of the object. This means that any changes that the method makes to the
 * object will be reflected in the original object.
 * 
 * In the code you provided, the getSubTotal2() method takes an Order object as
 * its argument. The Order object is passed by reference, so the method gets a
 * reference to the Order object that is referenced by the order variable. This
 * means that any changes that the getSubTotal2() method makes to the Order
 * object will be reflected in the order variable.
 * 
 * For example, if the getSubTotal2() method changes the value of the
 * transactions field of the Order object, the value of the transactions field
 * in the order variable will also be changed.
 * 
 * So, in terms of pass by value or pass by reference, using object reference
 * order does not affect the way that objects are passed to methods. Objects are
 * always passed by reference in Java, regardless of whether you use object
 * reference order or not.
 * 
 * Here is a table that summarizes the differences between pass by value and
 * pass by reference:
 * 
 * Pass by value Pass by reference
 * A copy of the value is passed to the method. A reference to the object is
 * passed to the method.
 * Any changes that the method makes to the value will not be reflected in the
 * original value. Any changes that the method makes to the object will be
 * reflected in the original object.
 */