package bridge_pattern_example;

import java.awt.*;

public class Square extends Shape {
  ColorShape colorShape;

  public Square(ColorShape colorShape) {
    this.colorShape = colorShape;
  }

  public void draw(Graphics graphics) {
    colorShape.setColor(graphics);
    graphics.fillRect(5, 15, 50, 50);
  }
}
