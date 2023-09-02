package com.vtxlab.g2307.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.vtxlab.g2307.model.poly.polyStreamDemo;

public class StreamDemo {
  public static List<Person> getAgeUnder(int age) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan", 25, List.of("MK")));
    persons.add(new Person("Eric Lau", 35, List.of("TST")));
    persons.add(new Person("Peter Lau", 45, List.of("CWB")));

    return persons.stream()//
        .filter(e -> e.getAge() < age)
        .collect(Collectors.toList());
  }

  public static List<Person> getLastName(String name) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan", 25, List.of("MK")));
    persons.add(new Person("Eric Lau", 35, List.of("TST")));
    persons.add(new Person("Peter Lau", 45, List.of("CWB")));

    return persons.stream()//
        .filter(e -> e.getName().toLowerCase().contains(name.toLowerCase()))
        .collect(Collectors.toList());
  }

  public static List<String> getFullName(String name) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan", 25, List.of("MK")));
    persons.add(new Person("Eric Lau", 35, List.of("TST")));
    persons.add(new Person("Peter Lau", 45, List.of("CWB")));

    return persons.stream()//
        .filter(person -> person.getName().toLowerCase().endsWith(name.toLowerCase()))//
        .map(person -> {
          return person.getName();
        }).collect(Collectors.toList());
  }

  // flatMap()
  // [[A,A,A],[[B,B,B],[C,C,C]]
  // [A,A,A,B,B,B,C,C,C]
  // 變成一條list
  //
  public static List<String> getFullNames(String lastName) {
    // Call Database, and returned a List of Person8
    // SQL -> filter by lastname (where last_name = lastName)
    List<Person2> persons = new ArrayList<>();
    persons.add(new Person2("John Chan"));
    persons.add(new Person2("Eric Lau"));
    persons.add(new Person2("Peter Lau"));
    // Stream, last name = Lau
    return persons.stream() //
        .filter(person -> person.getName().endsWith(lastName)) // p means T (T -> Person8)
        .map(person -> {
          return person.getName(); // Conversion: from List<Person8> to List<String>
        }).collect(Collectors.toList());
  }

  public static List<Person2> getFromDb(String lastName) {
    // Call Database, and returned a List of Person8
    // SQL -> filter by lastname (where last_name = lastName)
    List<Person2> persons = new ArrayList<>();
    persons.add(new Person2("John Chan"));
    persons.add(new Person2("Eric Lau"));
    persons.add(new Person2("Peter Lau"));
    // Stream, last name = Lau
    return persons.stream() //
        .filter(e -> e.getName().endsWith(lastName)) //
        .collect(Collectors.toList());

  }

  public static void main(String[] args) {
    List<Person> pp1 = new ArrayList<>();
    pp1.add(new Person("John Chan", 25, List.of("MK")));
    pp1.add(new Person("Eric Lau", 35, List.of("TST")));
    pp1.add(new Person("Peter Lau", 45, List.of("CWB")));

    StreamDemo.getAgeUnder(50).stream().forEach(System.out::println);
    System.out.println();
    StreamDemo.getLastName("Chan").stream().forEach(System.out::println);
    System.out.println();
    System.out.println("getFullName");
    StreamDemo.getFullName("Chan").stream().forEach(System.out::println);
    System.out.println();
    Person.getAllName(pp1).forEach(System.out::println);
    //
    List<Person> pp2 = new ArrayList<>();
    Person p1 = new Person("Ann", 24, Person.getAddress1());
    Person p2 = new Person("Betty", 30, Person.getAddress2());
    pp2.add(p1);
    pp2.add(p2);
    pp2.add(pp1.get(0));
    pp2.add(pp1.get(1));
    pp2.add(pp1.get(2));

    System.out.println();
    // Person.getAllName(pp2).forEach(System.out::println);
    System.out.println(Person.getAllName(pp2));
    System.out.println();
    System.out.println(Person.getAllAddresses(pp2));
    // Person.getAllAddresses(pp2).forEach(System.out::println);

    System.out.println(polyStreamDemo.getFromDb2("Lau"));
  }
}
