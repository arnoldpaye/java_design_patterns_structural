package bridge_pattern_exercise;

public class CheckboxButton extends Button {
  ButtonSize buttonSize;

  public CheckboxButton(ButtonSize buttonSize) {
    this.buttonSize = buttonSize;
  }

  public void draw() {
    buttonSize.printSize();
    System.out.println("Drawing a checkbox button.\n");
  }

}
