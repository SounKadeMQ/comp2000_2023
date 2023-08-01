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

        @Override
        public void paint(Graphics g) {
            Grid field = new Grid(35, 720, 10, mousePos);
            field.paint(g);
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

    /*void run() {
        Point mousePos = this.getMousePosition();
        Canvas canvas = new Canvas(mousePos);
        this.setContentPane(canvas);
        this.setVisible(true);
    }
    */
}

