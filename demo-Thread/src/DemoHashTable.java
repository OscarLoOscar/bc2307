import java.util.Hashtable;
import java.util.Map;

public class DemoHashTable {
  Map<String, Integer> hTable = new Hashtable<>(); // synchronized

  public static void main(String[] args) {
    DemoHashTable h = new DemoHashTable();
    Runnable putOne = () -> {
      for (int i = 0; i < 10000; ++i) {
        h.hTable.compute("abc", (key, old) -> old == null ? 1 : old + 1);
      }
    };

    Thread thread1 = new Thread(putOne);
    Thread thread2 = new Thread(putOne);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(h.hTable.get("abc"));

  }
}
