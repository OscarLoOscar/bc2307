import java.util.concurrent.atomic.AtomicInteger;

public class TestAutomic {
  AtomicInteger number = new AtomicInteger(0);

  public static void main(String[] args) {
    TestAutomic i = new TestAutomic();

    Runnable increment = () -> {
      for (int x = 0; x < 1000000; x++) {
        i.number.incrementAndGet();// i.number++; , AUTOMIC OPERATION
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
    System.out.println(i.number);

  }
}
