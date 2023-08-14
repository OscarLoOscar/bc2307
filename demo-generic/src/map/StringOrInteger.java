package map;

public final class StringOrInteger {// encapsulation , 封裝所有可能性
  private final Object value;

  private StringOrInteger(Object value) {
    this.value = value;
  }

  public static StringOrInteger of(String value) {// 自動upcast
    return new StringOrInteger(value);
  }

  public static StringOrInteger of(Integer value) {
    return new StringOrInteger(value);
  }

  // public <T> void myMethod(T t) {
  // if (t instanceof String) {
  // new StringOrInteger(value);
  // } else if (t instanceof Integer) {
  // new StringOrInteger(value);
  // }
  // }
}