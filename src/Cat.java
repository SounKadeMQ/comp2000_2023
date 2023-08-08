import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
public class Cat extends Actor{

    public Cat() {
        cellIndex = new Cell(220,150,Color.BLUE);
    }

    public void paint(Graphics g, Point mousePos){
        cellIndex.paint(g, mousePos);
    }
}
