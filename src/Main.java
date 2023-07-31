import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }

    public class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }

        public void paint(Graphics g) {
            Grid field = new Grid(35, 720, 10);
            field.paint(g);

        }

        class Grid{
            int size;
            int display;
            int margin;

            public Grid(int size, int display, int margin) {
                this.size = size;
                this.display = display;
                this.margin = margin;
            }
            
        public void paint(Graphics g) {
            for (int j=margin; j<display-margin; j+=size) {
                for (int i=margin; i<display-margin; i+= size) {
                    Cell c = new Cell(i,j,35,Color.BLACK,Color.WHITE);
                    c.paint(g);
                }
            }
        }

        }
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

    }


    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);

    }
}

