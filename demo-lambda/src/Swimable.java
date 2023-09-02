import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
public interface Swimable {
  void swim();

  public static void main(String[] args) {
    // Lambda 落括號一定要return , beacaue code block {} 
    Comparator<Person> sortBy1 = (Person p1, Person p2) -> {
      return p2.name.charAt(0) > p1.name.charAt(0) ? 1 : -1;
    };

    Comparator<Person> sortBy = (Person p1, Person p2) -> p2.name.charAt(0) > p1.name.charAt(0) ? 1 : -1;
    List<Person> persons = Arrays.asList(new Person("John"), new Person("Dog"));
    Collections.sort(persons, sortBy);
    System.out.println("persons : " + persons);

    Swimable p1 = () -> System.out.println("p1 is swimming");
    p1.swim();

    Swimable p2 = () -> {
      System.out.println("p2 is swimming");
      System.out.println("p2 is stop swimming");
    };

    p2.swim();

    Swimable p3 = () -> {
      System.out.println("p3 is swimming");
    };

    p3.swim();
  }
}