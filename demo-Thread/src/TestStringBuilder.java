public class TestStringBuilder {
  StringBuilder sb1 = new StringBuilder("");
  //sbilder (refence) -> object (StringBuilder Object)->object (array)

  public static void main(String[] args) {
    TestStringBuilder strings = new TestStringBuilder();

    Runnable increment = () -> {
      for (int i = 0; i < 1000000; i++) {
        // strings.str += "s";
        strings.sb1 = strings.sb1.append("s"); // concat()->non-atomic operation
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
    System.out.println(strings.sb1.length());

  }
}