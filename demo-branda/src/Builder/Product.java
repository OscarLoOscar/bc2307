package Builder;

public class Product<T> {
  boolean success;
  int code;
  String name;
  T data;

  public Product() {
  }

  public Product(Builder<T> builder) {
    this.success = builder.success;
    this.code = builder.code;
    this.name = builder.name;
    this.data = builder.data;
  }

  public static <T> Builder<T> builder() {
    return new Builder<>();
  }

  @Override
  public String toString() {
    return "success : " + success + "\n" + //
        "code : " + code + "\n" + //
        "name : " + name + "\n" + //
        "data : " + data; //
  }

  static class Builder<T> {
    boolean success;
    int code;
    String name;
    T data;

    public Builder<T> ok() {
      this.success = Code.SUCCESS.success();
      this.code = Code.SUCCESS.getCode();
      this.name = Code.SUCCESS.getMessage();
      return this;
    }

    public Builder<T> fail(Exception e) {
      this.success = false;
      this.code = Code.SUCCESS.getCode();
      this.name = Code.SUCCESS.getMessage();
      return this;
    }

    public Builder<T> error(Exception e) {
      this.success = Code.FAIL.success();
      this.code = Code.SUCCESS.getCode();
      this.name = Code.SUCCESS.getMessage();
      return this;
    }

    private Builder<T> success(boolean success) {
      this.success = success;
      return this;
    }

    private Builder<T> code(int code) {
      this.code = code;
      return this;
    }

    public Builder<T> message(String message) {
      this.name = message;
      return this;
    }

    public Builder<T> data(T data) {
      this.data = data;
      return this;
    }

    public Product<T> build() {
      return new Product<>(this);
    }
  }

}
