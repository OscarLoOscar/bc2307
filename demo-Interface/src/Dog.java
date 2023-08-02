public class Dog extends GameMember implements Move {
  String name;

  @Override
  public void jump() {
    super.addscore(4);
  }

  @Override
  public void up() {
    super.addscore(1);
    // GameMember.up(this);
  }

}
