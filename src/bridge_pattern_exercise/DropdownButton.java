package bridge_pattern_exercise;

public class DropdownButton extends Button {
  ButtonSize buttonSize;

  public DropdownButton(ButtonSize buttonSize) {
    this.buttonSize = buttonSize;
  }

  public void draw() {
    buttonSize.printSize();
    System.out.println("Drawing a dropdown button.\n");
  }

}
