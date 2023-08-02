public abstract class GameMember {
  private int score;

  public void setScore(int score) {
    this.score = score;
  }

  public int getScore() {
    return this.score;
  }

  public void addscore(int score) {
    this.score = score;
  }

  public abstract void up();

  public abstract void down();

  public abstract void left();

  public abstract void right();

  public static void upOnce(GameMember... members) {
    for (GameMember member : members) {
      member.up();
    }
  }

  public static void moveOnce(Move[] members) {
    for (Move member : members) {
      member.jump();
    }
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    GameMember.upOnce(dog, cat);
    System.out.println(dog.getScore());
    System.out.println(cat.getScore());
    //
    GameMember.moveOnce(new Move[] { dog, cat });
    System.out.println(dog.getScore());
    System.out.println(cat.getScore());
    // Interface Move default instance method
    dog.print();
    cat.print();
    // static method
    System.out.println(Move.concat("abc", "igf"));
  }
}
