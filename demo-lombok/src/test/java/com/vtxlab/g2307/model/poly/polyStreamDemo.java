package com.vtxlab.g2307.model.poly;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.vtxlab.g2307.model.Person;
import com.vtxlab.g2307.model.Person2;

public class polyStreamDemo {
  public static void main(String[] args) {
    // One Table (Persons) -> Many Records (where age > 60)
    // Test getFromDb
    System.out.println(getFromDb("Lau").toString());
    // result: [Person(name=Eric Lau), Person(name=Peter Lau)]
    System.out.println(getFromDb("Chan").toString());
    // result: [Person(name=John Chan)]

    // flatMap()
    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("Mainland");
    addresses.add("Japan");
    Person2 p1 = new Person2("Ann", addresses);

    List<String> addresses2 = new ArrayList<>();
    addresses2.add("Taiwan");
    addresses2.add("US");
    Person2 p2 = new Person2("Betty", addresses2);

    List<Person2> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    System.out.println(getAllAddresses(persons));
    // [Hong Kong, Mainland, Japan, Taiwan, US]
    // return all addresses (List<String>) from List<Person>
  }

  public static List<String> getAllAddresses(List<Person2> persons) {
    return persons.stream() // List<Person2> to Stream<Person2>
        .flatMap(person -> person.getAddress().stream()) // Stream<Person2> to Stream<String>
        .collect(Collectors.toList()); // Stream<String> to List<String>
  }

  public static List<String> getAllAddresses2(List<Person2> persons) {
    // flatMap
    List<String> addresses = new ArrayList<>();
    for (Person2 p : persons) {
      for (String address : p.getAddress()) {
        addresses.add(address);
      }
    }
    // map
    // List<List<String>> addressLists = new ArrayList<>();
    // for (Person2 p : persons) {
    // addressLists.add(p.getAddresses());
    // }
    return addresses;
  }

  public static List<String> getFullNames(String lastName) {
    // Call Database, and returned a List of Person
    // SQL -> filter by lastname (where last_name = lastName)
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));
    // Stream, last name = Lau
    return persons.stream() //
        .filter(p -> p.getName().endsWith(lastName)) // p means T (T -> Person)
        .map(p -> {
          return p.getName(); // Conversion: from List<Person> to List<String>
        }).collect(Collectors.toList()); // List<String>
  }

  public static List<String> getFullNames2(String lastName) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));

    // filter + map
    List<String> names = new ArrayList<>();
    for (Person p : persons) {
      if (p.getName().endsWith(lastName)) {
        names.add(p.getName());
      }
    }
    return names;
  }

  public static List<Person> getFromDb(String lastName) {
    // Call Database, and returned a List of Person
    // SQL -> filter by lastname (where last_name = lastName)
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));
    // Stream, last name = Lau
    return persons.stream() //
        .filter(p -> p.getName().endsWith(lastName)) //
        .collect(Collectors.toList()); // List<Person>
  }

  public static List<Person> getFromDb2(String lastName) {
    // Call Database, and return a List of Person
    // SQL -> filter by lastname (where last_name = lastName)
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));

    return persons.stream()
        .map(Person::getName) // Transform to a stream of last names (Strings)
        .filter(name -> name.endsWith(lastName))
        .map(lastNameFound -> persons.stream()
            .filter(person -> person.getName().equals(lastNameFound))
            .findFirst()
            .orElse(null)) // Transform back to a stream of Person objects
        .collect(Collectors.toList()); // Collect the filtered Person objects into a List
  }

  public static void print() {
    List<Person> persons = List.of(new Person("John"), new Person("Peter"));
    // Stream forEach()
    persons.stream() //
        .forEach(e -> {
          System.out.println(e.getName());
        });
    // for loop
    for (Person e : persons) {
      System.out.println(e.getName());
    }
  }
}