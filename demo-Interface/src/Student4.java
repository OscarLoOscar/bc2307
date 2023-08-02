public class Student4 extends Person implements behaviour, swimable {

  private String name;
  private int score;

  @Override
  public void run() {
    System.out.println();
  }

  @Override
  public void eat() {
    System.out.println();
  }

  @Override
  public void swim() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'swim'");
  }

  @Override
  public void breath() {
  }

  @Override
  public void jump() {
    this.score += 1;
  }

  public static void main(String[] args) {
    System.out.println(Move.MAX_SPEED);

    // Move move = new Student4();
    // move.up();
    // move.down();
    // move.breath();

    // swimable swim = new Student4();
    // swim.swim();

    Person person = new Student4();
    person.breath();
    person.getAge();
  }
}
