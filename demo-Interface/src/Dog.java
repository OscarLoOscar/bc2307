public class Dog extends Animal {


  @Override
  public void up() {
    System.out.println("Moving up");
    super.addScore(2);
    // GameMember.up(this);
  }

  @Override
  public void down() {

  }

  @Override
  public void left() {

  }

  @Override
  public void right() {

  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.print(); // print() from GameMember or Move?
  }

}
