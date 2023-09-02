import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoT {
    public static void main(String[] args) throws Exception {
        var s = "Hello";
        // s=3 //error , compile-check -> String
        var i = 2;
        var c = 'a';

        // Loop
        List<String> strings = Arrays.asList("abc", "def");
        for (var str : strings) {
            System.out.println(str);
        }

        Map<String, Integer> hmap = new HashMap<>();
        hmap.put("a", 1);
        hmap.put("b", 2);
        for (var entry : hmap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        var result = getString();
        result.add(Arrays.asList("dev", "wyz"));
        result.add(Arrays.asList("ijk"));
    }

    public static List<List<String>> getString() {
        return Arrays.asList(Arrays.asList("abc"));
    }
}
