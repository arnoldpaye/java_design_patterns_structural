package bridge_pattern_example;

import java.awt.Graphics;

public abstract class Circle extends Shape {

  public void draw(Graphics graphics) {
    graphics.fillOval(75, 15, 50, 50);
  }



}
