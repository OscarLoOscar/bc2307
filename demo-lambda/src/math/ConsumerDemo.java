package math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
  public static void main(String[] args) {
    Consumer<String> consumer = str -> System.out.println(str);
    consumer.accept("I love java");

    BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + s2);
    biConsumer.accept("ABC", "DEF");
    // Example
    List<String> strings = new ArrayList<>();
    strings.add("dog");
    strings.add("cat");
    strings.add("cow");
    // for-loop 4th example
    strings.forEach(s -> System.out.println(s));// 重點：右手void , 記
    strings.forEach(s -> {
      int i = 0;
      if (i < 1)
        System.out.println(s);
    });

    Map<String, Integer> map = new HashMap<>();
    map.put("orange", 3);
    map.put("apple", 2);
    map.put("waterlemon", 10);
    map.forEach((key, value) -> {
      if ("lemon".equals(key))
        System.out.println(value);
    });
    //
    List<String> strings2 = new ArrayList<>();
    strings2.add("dog");
    strings2.add("cat");
    strings2.add("cow");
    // for-loop 4th example
    strings2.forEach(s -> System.out.println(s));// 重點：右手void , 記
    int f = 8;
    strings2.forEach(s -> {
      int i = 0;
      int a = 0;
      int total = f + a + i; //Loval variable
      System.out.println(s);
    });

  }
}
