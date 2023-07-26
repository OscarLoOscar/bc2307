public class StringBox { // class

  private String string; // String -> Class

  public StringBox() {

  }

  public StringBox(String string) {
    this.string = string;
  }

  public String getString() {
    return this.string;
  }

  public void setString(String string) { //
    this.string = string;
  }

  public StringBox append(String str) { // obj.append()
    if (str == null || "".equals(str))
      return this;
    this.string = this.string + str;
    return this; // return StringBox object reference
  }

  public static StringBox append(String str, String str2) { // StringBox.append()
    return new StringBox(str + str2); // create an object of StringBox by Constructor
  }

  /**
   * 
   * @param idx Range :
   * @param s The string to be inserted
   * @return Object of StringBox
   */
  public StringBox insert(int idx, String s) {
    if (idx < 0 || idx > this.string.length())
      return this;
    if (s == null || "".equals(s)) //
      return this;
    this.string =
        this.string.substring(0, idx) + s + this.string.substring(idx);
    return this;
  }

  public String toString() {
    return this.string;
  }

  public static void main(String[] args) {
    StringBox s = new StringBox(); // empty constructor
    s.setString("Java");
    System.out.println(s.append("Python")); // JavaPython
    s.append("Javascript").append("HTML").toString();

    StringBox s2 = new StringBox(); // this.string -> null
    s2.insert(3, "java");

    String s3 = StringBox.append("hello", " world").toString(); // hello world


  }

}
