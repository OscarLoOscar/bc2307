public class TestSynchronized {

  // lock method
  int num = 0;

  public synchronized void increment() { // Like an Atomic method
    this.num++; // although it is non-atomic operation ,
  }

  public static void main(String[] args) {
    TestSynchronized test = new TestSynchronized();

    Runnable add = () -> {
      for (int i = 0; i < 1000000; i++) {
        test.increment();
      }
    };
    Thread thread1 = new Thread(add);
    Thread thread2 = new Thread(add);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(test.num);

  }
}
