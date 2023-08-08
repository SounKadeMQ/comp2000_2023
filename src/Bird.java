import java.awt.Color;
import java.awt.Graphics;

public class Bird extends Actor{

    public Bird() {
        cellIndex = new Cell(220,150);
    }

    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.drawRect(cellIndex.x,cellIndex.y,Cell.size,Cell.size);
    }
}
