import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
public class Bird extends Actor{

    public Bird(Cell cell) {
        cellIndex = cell;
    }

    @Override
    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        super.paint(g);
    }
}
