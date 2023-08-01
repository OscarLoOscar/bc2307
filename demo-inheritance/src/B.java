public class B extends A {
  String string;

  public void setString(String str) {
    this.string = str;
  }

  public void print(String anotherStr) {
    System.out.println(this.string + " " + anotherStr);
  }
}
