package test;

public class sumThread2 implements Runnable {
  int sum = 0;

  @Override
  public void run() {
    synchronized (this) {
      for (int i = 0; i < 100; i++) {
        sum += i;
      }
      notify();
    }
  }
  public static void main(String[] args) {
    sumThread2 sum1 = new sumThread2();
    Thread thread = new Thread(sum1);
    thread.start();
    try {
      synchronized (thread) {
        thread.wait();
      }
    } catch (InterruptedException e) {

    }
    int result = sum1.sum;
    System.out.println("Result is : " + result);

  }
}
