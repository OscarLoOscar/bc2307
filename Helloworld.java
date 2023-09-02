import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class Helloworld {
  public static void main(String[] args) {
    int a = 10;
    int b = 98235;
    int c = 12;

    System.out.println(Integer.toBinaryString(a));
    System.out.println(Integer.toBinaryString(b));
    System.out.println(Integer.toBinaryString(c));

    List<String> strings = Arrays.asList("apple", "banana", "cherry", "pear");

    Map<Boolean, List<String>> partitionedStrings = strings.stream()
        .collect(Collectors.partitioningBy(s -> s.length() > 5));

    System.out.println(partitionedStrings);
    //

    List<String> strings2 = Arrays.asList("apple", "banana", "cherry", "pear");

    Map<String, List<String>> groupedStrings = strings2.stream()
        .collect(Collectors.groupingBy(s -> s.substring(0, 1)));

    System.out.println(groupedStrings);
    //
    Queue<String> customers = new PriorityQueue<>(new SortByDescending());
    customers.add("Mary Choi");
    customers.add("Peter Wan");
    customers.add("David Ng");
    customers.add("Kathy Ma");
    customers.add("Zoe Cheung");
    System.out.println(customers.poll()); // Zoe Cheung
    System.out.println(customers); // [Peter Wan, Mary Choi, David Ng, Kathy Ma]

    Queue<String> customers2 = new PriorityQueue<>(new SortByDescending());
    customers2.add("Kathy Ma");
    customers2.add("Peter Wan");
    customers2.add("Zoe Cheung");
    customers2.add("Mary Choi");
    customers2.add("David Ng");
    System.out.println(customers2.poll()); // Zoe Cheung
    System.out.println(customers2); // [Peter Wan, Mary Choi, David Ng, Kathy Ma]

    Queue<String> customers3 = new PriorityQueue<>(new SortByDescending());
    customers3.add("qqq");
    customers3.add("aaa");
    customers3.add("fff");
    customers3.add("mmm");
    customers3.add("bbb");
    customers2.poll();
    // System.out.println(customers3.poll()); // qqq
    System.out.println(customers3); // [mmm, bbb, fff, aaa]

    int testest = 10;
    double ans1 = (double) testest;
    double ans2 = Double.valueOf(testest);

    String ans3 = null;
    // double ans4 = (double) ans3;
    double ans5 = Double.valueOf(ans3);

    BigDecimal ansans = BigDecimal.valueOf(999999999909999999D);
    // double ansansans = (double) ansans;

    double ansansans2 = BigDecimal.valueOf(999999999909999999D).doubleValue();

    List<String> strings22 = new LinkedList<>();
    strings22.add("aesf");
    strings22.add("2");
    strings22.add("3");
    strings22.add("4");
    strings22.iterator().next();

    Set<String> set1 = new HashSet<>();
    set1.iterator().hasNext();
    List<String> strings222 = set1.stream().collect(Collectors.toList());
    strings222.get(1);
    Map<String, String> hmap = new HashMap<>();
    hmap.get(2).valueOf(testest);
  }
}