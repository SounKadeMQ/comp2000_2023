import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
public class Bird extends Actor{

    public Bird() {
        cellIndex = new Cell(640,115,Color.YELLOW);
    }

    public void paint(Graphics g,Point mousePos){
        g.setColor(Color.YELLOW);
        cellIndex.paint(g, mousePos);
    }
}
