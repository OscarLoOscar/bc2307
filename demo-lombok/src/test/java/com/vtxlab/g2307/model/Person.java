package com.vtxlab.g2307.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
  private String name;
  private int age;
  private List<String> address;

  public Person(String name) {
    this.name = name;
  }

  public static List<String> getAddress1() {
    List<String> address1 = new ArrayList<>();
    address1.add("Hong Kong");
    address1.add("MainLand");
    address1.add("Japan");
    return address1;
  }

  public static List<String> getAddress2() {
    List<String> address2 = new ArrayList<>();
    address2.add("Hong Kong"); // String Literal Pool , 兩個address指住同一個Hong Kong
    address2.add("US");
    return address2;
  }

  // flatMap都係map既一種，拎完出黎轉番做stream
  // return all address (List<String) from List<Person>
  public static List<String> getAllAddresses(List<Person> person) {
    return person.stream() // Stream<List<Person>>
        .flatMap(p -> p.getAddress()
            .stream())// Stream<String>
        .collect(Collectors.toList()); // List<String>>
  }

  public static List<String> getAllAddresses2(List<Person> person) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan", 25, List.of("MK")));
    persons.add(new Person("Eric Lau", 35, List.of("TST")));
    persons.add(new Person("Peter Lau", 45, List.of("CWB")));

    List<String> address = new ArrayList<>();
    for (Person p : persons) {
      for (String addr : p.getAddress()) {
        address.add(addr);
      }
    }
    return address;
  }
  // p.getAddress().stream()
  // <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>>
  // mapper);

  // p.getName()
  // <R> Stream<R> map(Function<? super T, ? extends R> mapper);

  // *****
  // map : 不斷.add datax 入去 , list入面單個element,不改變數量
  // flatmap ： 拆箱 ，list of list

  public static List<String> getAllName(List<Person> person) {
    return person.stream() // Stream<List<Person>>
        .map(p -> p.getName()) // Stream<String>
        .collect(Collectors.toList());// List<String>
  }

  public static long countAllAddresses(List<Person> persons) {
    return persons.stream()//
        .flatMap(p -> p.getAddress() // List<String>
            .stream())//
        .distinct()//
        .count();
  }
  // public static List<String> getAllName(List<Person> person) {
  // return person.stream()//
  // .map(Person::getName)
  // .collect(Collectors.toList());
  // }

  public static List<String> getAllName2(String lastName) {
    List<Person2> persons = new ArrayList<>();
    persons.add(new Person2("John Chan"));
    persons.add(new Person2("Eric Lau"));
    persons.add(new Person2("Peter Lau"));

    List<String> name = new ArrayList<>();
    for (Person2 p : persons) {
      if (p.getName().endsWith(lastName)) {
        name.add(p.getName());
      }
    }
    return name;
  }

  @Override
  public String toString() {
    return "Name : " + this.name + //
        " , Age : " + this.age + //
        " , Address : " + this.address;
  }
}
