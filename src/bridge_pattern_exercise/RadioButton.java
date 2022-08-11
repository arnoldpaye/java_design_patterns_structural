package bridge_pattern_exercise;

public class RadioButton extends Button {
  ButtonSize buttonSize;

  public RadioButton(ButtonSize buttonSize) {
    this.buttonSize = buttonSize;
  }

  public void draw() {
    buttonSize.printSize();
    System.out.println("Drawing a radio button.\n");
  }

}
