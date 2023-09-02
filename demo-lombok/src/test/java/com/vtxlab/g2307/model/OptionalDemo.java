package com.vtxlab.g2307.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {

    List<String> address1 = new ArrayList<>();
    address1.add("Hong Kong");
    address1.add("MainLand");
    address1.add("Japan");
    Person2 p1 = new Person2("Betty", address1);

    List<String> address2 = new ArrayList<>();
    address2.add("Hong Kong"); // String Literal Pool , 兩個address指住同一個Hong Kong
    address2.add("US");
    Person2 p2 = new Person2("Ann", address2);

    List<Person2> pp2 = new ArrayList<>();
    pp2.add(p1);
    pp2.add(p2);

    System.out.println(getFromDb(pp2, "Betty"));// true
    System.out.println(getFromDb(pp2, "Chan"));// false
    //
    Optional<Person2> result = getFromDb2(pp2, "Chan");
    result.ifPresent(e -> {
      // System.out.println(e.getName());
      e.getAddress().stream()//
          .forEach(add -> { //address
            System.out.println(add);
          });
    });
  }

  public static boolean getFromDb(List<Person2> persons, //
      String lastName) {
    return persons.stream()//
        .filter(p -> p.getName().endsWith(lastName))
        .findFirst()// Optional<Person2>
        .isPresent()// boolean
    ;
  }

  public static Optional<Person2> getFromDb2(List<Person2> persons, //
      String lastName) {
    return persons.stream()//
        .filter(p -> p.getName().endsWith(lastName))
        .findAny();// Optional<Person2>

  }
}
