public class TestString {
  String str = "";

  public static void main(String[] args) {
    TestString strings = new TestString();

    Runnable increment = () -> {
      for (int i = 0; i < 1000000; i++) {
        // strings.str += "s";
        strings.str = strings.str.concat("s"); // concat()->non-atomic operation
      }//String is immutable , 
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
    System.out.println(strings.str.length());

  }
}
