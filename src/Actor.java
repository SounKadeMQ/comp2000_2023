import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Actor {
    Cell cellIndex;

    public Actor() {

    }

    public Actor(Cell cell) {
        cellIndex = cell;
    }

    public void paint(Graphics g){
        g.fillOval(cellIndex.x, cellIndex.y, Cell.size, Cell.size);
    }
}
