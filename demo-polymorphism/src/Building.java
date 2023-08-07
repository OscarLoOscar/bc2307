public abstract class Building {
  double height;

  public void print() {
    System.out.println("I am Building");
  }

  public void print2() {
    this.print();//this 指run time時既this
  }
}
