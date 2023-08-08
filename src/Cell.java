import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Cell extends java.awt.Rectangle{
  static int size = 35;
  Color colour;

  // constructors
  public Cell(int inX, int inY, Color color) {
    super.x = inX;
    super.y = inY;
    super.height = size;
    super.width = size;
    colour = color;
  }

  // methods
  public void paint(Graphics g, Point mousePos) {
    if(mousePos == null) {
      mousePos = new Point (-1,-1);
    }
    if(super.contains(mousePos)) {
      g.setColor(Color.GRAY);
    } else {
      g.setColor(colour);
    }
    g.fillRect(x, y, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);
  }
}
