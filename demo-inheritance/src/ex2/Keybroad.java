package ex2;

import java.security.Key;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Keybroad))
      return false;
    Keybroad keybroad = (Keybroad) o;
    return Objects.equals(keybroad.buttonType, this.buttonType) &&
        Objects.equals(keybroad.noOfButton, this.noOfButton);

  }
}