package machines;
public class Keyboard {

  String buttonType;
  int noOfButton;

  public Keyboard(String buttonType, int noOfButton) {
    this.buttonType = buttonType;
    this.noOfButton = noOfButton;
  }

  public String getButtonType(String buttonType) {
    return this.buttonType;
  }

  public int getNoOfButton(int noOfButton) {
    return this.noOfButton;
  }

  public void setButtonType(String buttonType) {
    this.buttonType = buttonType;
  }

  public void setNoOfButton(int noOfButton) {
    this.noOfButton = noOfButton;
  }


}
