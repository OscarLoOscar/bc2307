public interface Move {
  // Constant
  static final int MAX_SPEED = 10;

  void jump();

  // No method implementions

  // After Java 8 , lambda , stream
  default void print() {// instance method , implicitly public
    System.out.println("I am Java 8 default method");
  }

  static String concat(String a, String b) {
    return a + b;
  }
}
