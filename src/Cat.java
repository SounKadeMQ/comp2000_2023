import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
public class Cat extends Actor{

    public Cat(Cell cell) {
        cellIndex = cell;
    }

    public void paint(Graphics g, Point mousePos){
        cellIndex.paint(g, mousePos,Color.BLUE);
    }
}
