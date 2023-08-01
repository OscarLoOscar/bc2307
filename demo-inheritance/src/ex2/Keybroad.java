package ex2;
import java.security.Key;

public class Keybroad {
  String buttonType;
  int noOfButton;

  public Keybroad() {

  }

  public Keybroad(String buttonType, int noOfButton) {
    this.buttonType = buttonType;
    this.noOfButton = noOfButton;
  }

  public String getButtonType() {
    return this.buttonType;
  }

  public int getNoOfButton() {
    return this.noOfButton;
  }

  public void setNoOfButton(String buttonType) {
    this.buttonType = buttonType;
  }

  public void setNoOfButton(int noOfButton) {
    this.noOfButton = noOfButton;
  }
}