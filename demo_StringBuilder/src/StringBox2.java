import java.util.Arrays;

public class StringBox2 {
  private char[] string;

  public StringBox2() {
  }

  public StringBox2(char[] source) {
    // app 1

    // this.string = new char[source.length];
    // for (int i = 0; i < source.length; i++) {
    // string[i] = source[i];
    // }
    // app 2
    // copyOf -> new array object , and with the copy of the original array
    this.string = Arrays.copyOf(source, source.length);

  }

  public StringBox2 append(String s) {
    char[] newArr = Arrays.copyOf(this.string, this.string.length + s.length());

    int k = 0;
    for (int i = this.string.length; i < newArr.length; i++) {
      newArr[i] = s.charAt(k++);
    }
    this.string = newArr;
    return this;
  }

  public void setCharArray(char[] string) {
    this.string = string;
  }

  public char[] getCharArray(char[] string) {
    return this.string = string;
  }

  public String toString() {
    return Arrays.toString(this.string);
  }

  public static void main(String[] args) {
    char[] chars = new char[] { 'a', 'd', 'c' };
    StringBox2 box2 = new StringBox2(chars);
    System.out.println("first : " + box2.toString());

    chars[1] = 'k';
    System.out.println("before : " + Arrays.toString(chars));
    System.out.println("after : " + box2.toString());

    char[] char2 = new char[] { 'd', 'e', 'f' };
    System.out.println("append : " + box2.append("def"));

    StringBuilder s1 = new StringBuilder();
    s1.append("");

    String str = "test1";
  }
}