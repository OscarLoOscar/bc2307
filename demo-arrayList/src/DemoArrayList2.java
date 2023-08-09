import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList2 {
  public static void main(String[] args) {
    // ArrayList String
    ArrayList<String> strs = new ArrayList<>();
    strs.add("abc");
    strs.add("def");
    strs.add("xyz");
    strs.add("def");

    System.out.println(strs.subList(1, 2));// from indexm 1 to index 1
    strs.remove("def");// remove the first of current by Object
    System.out.println(strs);

    strs.remove(1);
    System.out.println(strs);

    Iterator<String> iterator = strs.iterator();
    while (iterator.hasNext()) {// loop 所有野 : 是否有下一個，唔係跳落下一個
      System.out.println(iterator.next());// .next->去下一個F
    }

    for (String s : strs) { // for-each support Array and ArrayList
      System.out.println(s);
    }

    Object[] objects = strs.toArray(); // ArrayList<String> -> Object[]
    for (Object o : objects) {
      if (o instanceof String) {
        String str = (String) o;
        System.out.println(str);
      }
    }

    // Array -> ArrayList
    String[] string = new String[] {"hello", "world", "!"};

    List<String> s2 = Arrays.asList(string);// List is interface
    // Move m = new Student4();

    // Read Only -> big bug , 致命

    // ArrayList<String> stringList2354 = Arrays.asList(string);
    List<String> stringList = Arrays.asList(string);
    //UnsupportedOperationException
    stringList.add("ijk");// compile到 , run-time error
    stringList.remove(2);
    System.out.println(stringList);

    // Read & Write
    List<String> stringList2 = new ArrayList<>(Arrays.asList(string));
    stringList2.add("ijk");
    System.out.println(stringList2);
  }
}
