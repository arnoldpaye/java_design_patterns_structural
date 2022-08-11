package bridge_pattern_exercise;

public class LargeCheckboxButton extends CheckboxButton {

  public void draw() {
    System.out.println("Setting size to large...");
    super.draw();
  }

}
