package map;

import java.util.HashMap;
import java.util.Map;

public class AnimalMap<T> {
  Map<T, String> map;

  public AnimalMap() {
    map = new HashMap<>();
  }

  public void put(T key, String animal) {
    map.put(key, animal);

  }

  public static void main(String[] args) {
    AnimalMap<String> map1 = new AnimalMap<>();
    map1.put("abc", "dog");

    AnimalMap<Integer> map2 = new AnimalMap<>();
    map2.put(1, "dog");

  }
}
