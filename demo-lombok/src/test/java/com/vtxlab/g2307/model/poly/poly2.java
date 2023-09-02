package com.vtxlab.g2307.model.poly;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class poly2 {
  // stati cpolymorphism (overloading) -> methods
  // get(int x) is different to get(String x)
  // compile0time check

  // dynamic polymorphism (Parent class,Interface)
  // Customer extend Human implements Orderable
  public static void main(String[] args) {
    // implementation 睇右邊    

    //human + 2 , Customer ++ , Driver + 3
    
    Human customer = new Customer();
    customer.order();
    // customer.testtest();
    System.out.println(Customer.counter);// 1 , 1,2,4,6,11
    // if we do not override  , will call back Human.order() -> +2 , 2,3,6,8,15

    Customer customer2 = new Customer();
    customer2.order();
    customer2.testtest();
    System.out.println(Customer.counter);// 2(+1)

    Human human = new Human();
    human.order();
    System.out.println(Customer.counter);// 4 (+2)
    // Customer human = new Human();
    // Cannot assign Parent class
    customer2.humanOrder();
    System.out.println(Customer.counter);

    // Interface
    Orderable customer3 = new Customer("Eric");// 合約行為
    customer3.order();// 7(+1)

    Orderable[] orderList = //
        new Orderable[] { new Customer("Peter"), new Driver() };

    Orderable order = getByName(orderList, "Peter");
    order.order();// +1
    Orderable order2 = getByName(orderList, "Vin");
    order2.order();// +3

    System.out.println(Customer.counter);// 11

  }

  public static Orderable getByName(Orderable[] orders, String name) {
    for (Orderable order : orders) {
      if (order instanceof Customer) {// make sure order is Customer
        Customer customer = (Customer) order;
        if (name.equals(customer.getName()))
          return customer;
      }
    }
    return new Driver();
  }
  // Optional Version
  // public static Optional<Orderable> getByName(Orderable[] orders, String name)
  // {
  // for (Orderable order : orders) {
  // if (order instanceof Customer) {// make sure order is Customer
  // Customer customer = (Customer) order;
  // if (name.equals(customer.getName()))
  // return Optional.of(customer);
  // }
  // }
  // return Optional.empty();
  // }

}