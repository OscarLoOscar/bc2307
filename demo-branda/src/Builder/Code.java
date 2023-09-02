package Builder;

public enum Code {

  SUCCESS(20000, true, "SUCCESS"),
  FAIL(40000, false, "Build Fail"),
  UNKNOWN(99999, false, "Please check your problem");

  private int code;
  private boolean success;
  private String message;

  private Code(int code, boolean success, String message) {
    this.code = code;
    this.success = success;
    this.message = message;
  }

  public int getCode() {
    return this.code;
  }

  public boolean success() {
    return this.success;
  }

  public String getMessage() {
    return this.message;
  }
}
