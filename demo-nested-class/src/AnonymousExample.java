interface Reading {

  void read();

}

public class AnonymousExample {
  public static void main(String[] args) {
    // lambda寫法
    Reading read1 = () -> {
      System.out.println("I am reading ...");
    };
    read1.read();

    // non-lambda寫法
    Reading read2 = new Reading() {
      int x;

      @Override
      public void read() {
        this.x++;
        System.out.println("I am read2ing ... x = " + x);
      }
    };
    read2.read();
    read2.read();
    read2.read();

  }
}
