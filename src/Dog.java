import java.awt.Color;
import java.awt.Graphics;

public class Dog extends Actor{

    public Dog() {
        cellIndex = new Cell(465,80);
    }

    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.drawRect(cellIndex.x,cellIndex.y,Cell.size,Cell.size);
    }
}
