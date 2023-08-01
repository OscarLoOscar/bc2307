import java.util.Arrays;

public class StringBox {
  private String string;

  public StringBox() {

  }

  public StringBox(String string) {
    this.string = string;
  }

  public String getString() {
    return this.string;
  }

  public void setString(String string) {
    this.string = string;
  }

  // public StringBuilder append(String str) {
  // this.string = this.string + str;
  // return new StringBuilder(str);
  // }

  public String appendString(String str) {
    // this.string = this.string + str;
    return this.string;
  }

  public StringBox append(String str) {
    if (str == null || "".equals(str))// null value can not use method , but String is ok
      return this;
    this.string = this.string + str;
    return this;
  }

  /**
   * 
   * @param idx Range
   * @param s   The string to be inserted
   * @returnObject of StringBox
   */
  public StringBox insert(int idx, String s) {
    if (idx < 0 && idx > this.string.length())
      return this;
    if (s == null || "".equals(s))// null.empty String; String. empty
      return this;
    this.string = this.string.substring(0, idx) + this.string + this.string.substring(idx);
    return this;
  }

  public char[] toCharArray() {
    char[] change = new char[this.string.length()];
    for (int i = 0; i < this.string.length(); i++) {
      change[i] = this.string.charAt(i);
    }
    return change;
  }

  @Override
  public String toString() {
    return this.string;
  }

  public static void main(String[] args) {
    StringBox s = new StringBox();
    s.append("");

    StringBox angus = new StringBox();
    angus.appendString(null);

    s.setString("Java");
    // System.out.println(s.append("python"));
    System.out.println(s);

    String s2 = s.append("null").appendString("null");

    s.append("null").append(null).append(null).append(null);

    System.out.println("tochararray : " + Arrays.toString(s.toCharArray()));
    // s.append("Javascript").append("HTML");
    System.out.println(s.toString());
    // StringBox@7344699f
    // StringBox@7344699f
    // StringBox@7344699f
    // after override toString
    // Javapython
    // Javapython
    // JavapythonJavascriptHTML

    StringBuilder s3 = new StringBuilder();
  }
}
