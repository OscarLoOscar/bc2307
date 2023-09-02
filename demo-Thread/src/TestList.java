import java.util.LinkedList;
import java.util.List;

public class TestList {
  List<Integer> testList = new LinkedList<>();

  public static void main(String[] args) {
    TestList t = new TestList();

    Runnable increment = () -> {
      for (int i = 0; i < 1000000; i++) {
        t.testList.add(1);
      }
    };
    Thread thread1 = new Thread(increment);
    Thread thread2 = new Thread(increment);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(t.testList.size());

  }

}
