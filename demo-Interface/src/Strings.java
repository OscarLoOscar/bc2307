public class Strings implements CharSequence {

  char[] arr;

  private Strings(String str) {
    arr = new char[str.length()];
  }

  public static Strings valueOf(Strings str) {
    return new Strings(str);
  }

  @Override
  public int length() {
    return arr.length;
  }

  @Override
  public char charAt(int idx) {
    return arr.length;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    if (end < start || start < 0 || end < 0 || start > this.arr.length - 1
        || staendrt > this.arr.length - 1)
      return String.valueOf(this.arr);
    StringBuilder sb = new StringBuilder();
    for (int i = start; i < end; ++i) {
      sb.append(this.arr[i]);
    }
    return sb;
  }

  public static void main(String[] args) {
    CharSequence charSequence = new CharSequence();
    // interface CharSequence ->who is implement CharSequence ? String.
    Strings s = Strings.valueOf("abc");
  }
}
