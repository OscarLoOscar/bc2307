public interface Player5 {
  int totalScore();
  
  public static void fillThePocket(Pocket pocket) {
    while (!pocket.isFull()) {
      // Random a ball with a random colour
      pocket.add(Ball5.random());
    }
  }
}
