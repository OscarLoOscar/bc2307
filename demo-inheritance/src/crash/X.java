package crash;

public class X extends Y {
  private String name;

  public X() {

  }

  public X(String name) {
    super("john");
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String getParentName() {
    return super.getName();
  }

  public static void staticMethod() {
    System.out.println("I am X");
  }

  public static void main(String[] args) {
    X x = new X("Peter");
    System.out.println(x.getName());// Peter
    System.out.println(x.getParentName());// john
    System.out.println(((Y) x).getName());// 強行cast : Peter

    // Hiding
    Y y = new X("Tommy");
    y.staticMethod();// hiding : I am Y
    Y.staticMethod();// I am Y
    X.staticMethod();// I am Y
    System.out.println(y.getName());// Tommy
  }
}
