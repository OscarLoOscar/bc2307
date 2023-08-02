public class Cat extends GameMember implements Move {
  String name;

  @Override
  public void jump() {
    System.out.println("Moving up");
    super.addscore(5);
  }

  @Override
  public void up() {
    super.addscore(5);
    // GameMember.up(this);
  }
}
