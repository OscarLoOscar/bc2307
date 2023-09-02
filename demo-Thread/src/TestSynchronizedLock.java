public class TestSynchronizedLock {
  int x;
  Object lock1 = new Object();
  Object lock2 = new Object();

  public int calculate(int amount) {
    int total = amount;
    synchronized (lock1) {
      this.x++;
    } // 重點：有幾多thread，就搵幾多人守
    // this.increment();// x++
    return total + this.x;
  }

  // public synchronized void increment() {
  // this.x++;
  // }

  public static void main(String[] args) {
    TestSynchronizedLock obj = new TestSynchronizedLock();

    Runnable increment = () -> {
      for (int i = 0; i < 100000; i++) {
        // strings.str += "s";
        obj.calculate(0); // concat()->non-atomic operation
      } // String is immutable ,
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
    System.out.println(obj.x);

  }
}
