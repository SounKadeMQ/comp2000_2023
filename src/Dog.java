import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Dog extends Actor{

    public Dog() {
        cellIndex = new Cell(465,80,Color.GREEN);
    }

    public void paint(Graphics g, Point mousePos){
        cellIndex.paint(g, mousePos);
    }
}
