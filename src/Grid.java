import javax.swing.*;
import java.awt.*;

class Grid{
    int size;
    int display;
    int margin;
    Point mousePos;

    public Grid(int size, int display, int margin,Point mousePos) {
        this.size = size;
        this.display = display;
        this.margin = margin;
        this.mousePos = mousePos;
    }
    
public void paint(Graphics g) {
    for (int j=margin; j<display-margin; j+=size) {
        for (int i=margin; i<display-margin; i+= size) { 
            Cell c = new Cell(i,j,size,Color.BLACK,Color.WHITE);
            
            if(mousePos!=null) {
                if(mousePos.x > i && mousePos.x < i+size && mousePos.y > j && mousePos.y < j+size) {
                    c = new Cell(i,j,size,Color.BLACK,Color.GRAY);
                }
            }                        
            c.paint(g);
        }
    }
}

}