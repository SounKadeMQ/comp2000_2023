import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }

    public class Canvas extends JPanel {
        Point mousePos;

        public Canvas(Point mousePos) {
            setPreferredSize(new Dimension(720, 720));
            this.mousePos = mousePos;
        }

        public void paint(Graphics g) {
            Grid field = new Grid(35, 720, 10, mousePos);
            field.paint(g);

        }

        class Grid extends JPanel{
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
                    Cell c = new Cell(i,j,35,Color.BLACK,Color.WHITE);
                    
                    if(mousePos!=null) {
                        if(mousePos.x > i & mousePos.x < i+size && mousePos.y > j && mousePos.y < j+size) {
                            c = new Cell(i,j,35,Color.BLACK,Color.GRAY);
                        }
                    }                        
                    c.paint(g);
                }
            }
        }

        }
        class Cell extends JPanel{
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
                g.drawRect(x, y, size, size);
                g.setColor(fillColour);
                g.fillRect(x, y, size, size);
                g.setColor(borderColour);
                g.drawRect(x, y, size, size);
            }
        }

    }


    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Point mousePos = this.getMousePosition();
        Canvas canvas = new Canvas(mousePos);
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
        for (int i = 2; i>1; i++) {
            mousePos = this.getMousePosition();
            canvas = new Canvas(mousePos);
            this.setContentPane(canvas);
            this.setVisible(true);
        }

    }
}

