public class test {
  // Vscode is mutli-thread system
  public static void main(String[] args) {
    
    // Approach 1 : Runnable(Lambda) to implement Thread
    // Task Logic
    Runnable printout = () -> {
      for (int i = 0; i < 10000; i++) {
        System.out.println("i++" + i);
      }
    };// step4
    // Task
    Thread thread = new Thread(printout);// Thread = Task Mangament

    System.out.println("Strat Thread"); // step 1
    thread.start(); // step 2 -> 分離
    System.out.println("end Thread"); // step 3

    // Approach 2: Create PrintOut Class implement Runnable
    Thread thread2 = new Thread(new PrintOut());
    System.out.println("Start thread 2");
    thread2.start();
    System.out.println("end thread 2");

    // Approach 3 : Create PrintOut2 Class extends Thread
    PrintOut2 thread3 = new PrintOut2();
    thread3.start();

    try {
      thread.join();
      thread2.join();
      thread3.join();
    } catch (InterruptedException e) {

    }
    System.out.println("Main Thread Ends");
  }
}
