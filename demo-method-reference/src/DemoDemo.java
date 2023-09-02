import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoDemo {
  public static void main(String[] args) {
    Consumer<String> sysout = s -> System.out.println(s);
    Consumer<String> sysout2 = System.out::println;// static method 要consum String

    Arrays.asList("abc", "def").forEach(sysout2);

    String name = "john";
    Supplier<Integer> strLength = () -> name.length();
    Supplier<Integer> serLength2 = name::length;

    List<String> words = Arrays.asList("apple", "banana", "orange");
    Comparator<String> comapre = (s1, s2) -> s1.compareTo(s2);
    Comparator<String> compare2 = String::compareTo;

    Function<String, Integer> strToInteger = str -> Integer.valueOf(str);
    Function<String, Integer> strToInteger2 = Integer::valueOf;

  }
}
