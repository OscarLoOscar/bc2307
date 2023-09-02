package demoHashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class demoHashMap<K, V> extends HashMap<K, V> {
  public static void main(String[] args) {
    // Backgrounf : String[int]
    // Limitation : you can only access the element by int index
    // Solution : HashMap<>()
    HashMap<String, String> hmap = new HashMap<>();

    // <String , Stirng > -> <Key,Value>
    hmap.put("abc", "Hello World");
    hmap.put("bcd", "I am Developer");
    String[] keys = hmap.keySet().stream().toArray(String[]::new);
    System.out.println("TEST" + Arrays.toString(keys));

    
    System.out.println(hmap.size());// 2 entries ,
    System.out.println(hmap.get("abc"));// Hello World
    // Map.Entry -> Key + value

    // if Duplicated() , will override the entry
    hmap.put("abc", "  hello !!");
    System.out.println(hmap.get("abc"));// hello !!
    System.out.println(hmap.size()); // 2 entries
    //
    System.out.println(hmap.isEmpty());// false
    System.out.println(hmap.toString());// {bcd=I am Developer, abc= hello !!}
    System.out.println(hmap);// {bcd=I am Developer, abc= hello !!}

    System.out.println(hmap.containsKey("abc"));
    System.out.println(hmap.containsValue("I am Developer"));

    if (!hmap.containsKey("abc"))
      return;

    // Loop Entries
    for (Map.Entry<String, String> s : hmap.entrySet()) { // 記
      System.out.println(s.getKey() + " : " + s.getValue());
    }
    // bcd : I am Developer
    // abc : hello !!

    // Loop Keys only
    for (String key : hmap.keySet()) {
      System.out.println(key);
    }
    // Loop values only
    for (String value : hmap.values()) {
      System.out.println(value);
    }
    System.out.println(hmap.remove("abc"));// hello !!
    System.out.println(hmap.remove("bcd", "i am not developer"));// false
    System.out.println(hmap.remove("bcd", "I am Developer"));// true

    // @Override
    // public V put(K key, V value) {
    // // Check if the key already exists in the map.
    // V oldValue = super.get(key);
    // if (oldValue != null) {
    // // If the key already exists, update the value.
    // super.put(key, value);
    // return oldValue;
    // } else {
    // // If the key does not exist, add it to the map.
    // super.put(key, value);
    // return null;
    // }
    // }
  }
}
