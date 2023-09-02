package math;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
  public static void main(String[] args) {

    Function<String, Integer> lengthFunc = str -> str.length();
    Function<String, Character> firstCharFunc = str -> str.charAt(0);

    System.out.println(lengthFunc.apply("abc"));
    System.out.println(firstCharFunc.apply("month"));

    Map<String, String> map = new HashMap<>();
    map.put("abc", "Mary");
    Function<String, String> formula = str -> "dfault";
    String result = map.computeIfAbsent("abc", formula); // <? super String , ? extends String>
    System.out.println(result);
    String result2 = map.computeIfAbsent("def", formula); // <? super String , ? extends String>
    System.out.println(result2);
    System.out.println(map.size());// 2 , "abc" + "def"

    // BiFunction
    BiFunction<Integer, Integer, BigDecimal> addition = (x, y) -> BigDecimal.valueOf(x + y);
    System.out.println(addition.apply(-7, -9).abs());

    Map<String, Integer> stock = new HashMap<>();
    stock.put("clothes", 100);

    stock.compute("clothes", (item, oldPrice) -> (int) (oldPrice - oldPrice * 0.1));
    // find the value , then refresh the oldValue
    System.out.println(stock.get("clothes"));

    // new value : null , remove item
    stock.compute("clothes", (item, oldPrice) -> null);
    System.out.println(stock.get("clothes"));
    //
    stock.compute("shoes", (item, oldPrice) -> 120);
    System.out.println(stock.get("shoes"));
  }
}
