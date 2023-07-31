import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }

    class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }

        public void paint( Graphics g) {
            for (int j=10; j<710; j+=35) {
                for (int i=10; i<710; i+= 35) {
                  drawCell(g,i,j,35,35,Color.BLACK,Color.WHITE);
                }
            }
        }

        public void drawCell(Graphics g, int x, int y, int width, int height, Color borderColour, Color fillColour) {
            g.setColor(fillColour);
            g.fillRect(x, y, width, height);
            g.setColor(borderColour);
            g.drawRect(x, y, width, height);
        }

    }

    class Cell extends JPanel{
        public Cell() {
        }


        public void drawCell(Graphics g, int x, int y, int width, int height, Color borderColour, Color fillColour) {
            g.setColor(fillColour);
            g.fillRect(x, y, width, height);
            g.setColor(borderColour);
            g.drawRect(x, y, width, height);
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

