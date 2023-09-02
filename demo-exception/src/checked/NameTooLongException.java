package checked;

public class NameTooLongException extends Exception {

    public NameTooLongException( ) {
  }

  public NameTooLongException(String message) {
    super(message);
  }
}
