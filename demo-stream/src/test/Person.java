package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public boolean isElderly() {
    return this.age >= 65;
  }

  public static void main(String[] args) {

    List<Person> persons = Arrays.asList(new Person("John", 30), new Person("Mary", 25));
    List<Person> persons2 = new ArrayList<>(Arrays.asList(new Person("abc", 30), new Person("null", 20)));

    // persons.add(new Person(null, 0));

    List<String> name = persons.stream()//
        // .filter()//
        .map(e -> e.name)
        .collect(Collectors.toList());
    // .forEach(e -> System.out.println(e));

    System.out.println(name.stream()//
        // .filter()//
        .filter(e -> e.startsWith("John"))
        .count());
    // .forEach(e -> System.out.println(e));

    // Stream static method
    Stream.of("abc", "dghf", "hijhk", "abc")
        .filter(e -> e.length() == 3)
        .distinct()
        .count();

    Stream.of(1, 2, 3, 4)//
        .filter(e -> e == 2)//
        .map(e -> {
          System.out.println(e);
          return e;
        })//
        .count();

    List<Integer> integers = Stream.of(1, 2, 3, 4)//
        .map(e -> {
          System.out.println("map = " + e);
          return 2;
        })//
        .collect(Collectors.toList());
    System.out.println(integers);// [2, 2, 2, 2]

    int setSize = Stream.of(1, 2, 3, 3)//
        .collect(Collectors.toSet())//
        .size();
    System.out.println(setSize);

  }

}
