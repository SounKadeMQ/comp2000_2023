import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
public class Cat extends Actor{

    public Cat(Cell cell) {
        cellIndex = cell;
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        super.paint(g);
    }
}
