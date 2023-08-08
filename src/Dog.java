import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Dog extends Actor{

    public Dog(Cell cell) {
        cellIndex = cell;
    }

    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillOval(cellIndex.x, cellIndex.y, Cell.size, Cell.size);
    }
}
