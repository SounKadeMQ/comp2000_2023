import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics;
import java.util.ArrayList;
public abstract class Actor {
  Color color;
  Cell loc;
  ArrayList<Polygon> shapes = new ArrayList<>();

  public void paint(Graphics g) {
    for(int i = 0;i < shapes.size();i++) {
      g.setColor(color);
      g.fillPolygon(shapes.get(i));
      g.setColor(Color.GRAY);
      g.drawPolygon(shapes.get(i));
    }
  }
}
