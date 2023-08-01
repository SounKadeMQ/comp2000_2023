import javax.swing.*;
import java.awt.*;

class Cell{
    int x; 
    int y;
    int size;
    Color borderColour;
    Color fillColour;

    public Cell(int x, int y, int size, Color borderColour, Color fillColour) {
        this.x = x; 
        this.y = y;
        this.size = size;
        this.borderColour = borderColour;
        this.fillColour = fillColour;
    }
    

    public void paint(Graphics g) {
        g.setColor(fillColour);
        g.fillRect(x, y, size, size);
        g.setColor(borderColour);
        g.drawRect(x, y, size, size);
    }
}