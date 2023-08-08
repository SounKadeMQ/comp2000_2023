import java.awt.Color;
import java.awt.Graphics;

public class Cat extends Actor{

    public Cat() {
        cellIndex = new Cell(220,150);
    }

    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.drawRect(cellIndex.x,cellIndex.y,Cell.size,Cell.size);
    }
}
