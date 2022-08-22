package proxy_pattern_example;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageFile implements DisplayObject {

  BufferedImage image;

  public ImageFile(String path) {
    image = load(path);
  }

  @Override
  public void display() {
    ImageIcon icon = new ImageIcon(image);
    JLabel label = new JLabel(icon);
    JOptionPane.showMessageDialog(null, label);
  }

  BufferedImage load(String path) {
    BufferedImage image = null;
    try {
      image = ImageIO.read(new File(path));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return image;
  }
}
