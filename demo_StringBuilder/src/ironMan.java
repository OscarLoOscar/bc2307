public class ironMan {

  String name;
  int age;

  public ironMan() {

  }

  public ironMan(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String iAmCaptinAmerica(String name) {
    this.name = this.name + name;
    return this.name;
  }

  public ironMan iAmIronMan(String name) {
    return this;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static void main(String[] args) {
    ironMan tonyStark = new ironMan();

    ironMan abd = new ironMan("", 50);
    abd.setAge(100);

   // tonyStark.iAmCaptinAmerica("").iAmIronMan("");

    tonyStark.iAmIronMan("").iAmIronMan("");
  }
}
