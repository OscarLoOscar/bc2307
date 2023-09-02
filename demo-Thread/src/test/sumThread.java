package test;

public class sumThread implements Runnable {
  int sum = 0;

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      sum += i;
    }
  }

  public static void main(String[] args) {
    sumThread sum1 = new sumThread();
    Thread thread = new Thread(sum1);
    thread.start();
    int result = sum1.sum;
    System.out.println("Result is : " + result);
    
  }
}
