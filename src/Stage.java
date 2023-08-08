import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Stage {
    Grid field;
    Cat cat;
    Dog dog;
    Bird bird;


    public Stage() {
        field = new Grid();
        cat = new Cat(field.cells[8][4]);
        dog = new Dog(field.cells[16][2]);
        bird = new Bird(field.cells[19][3]);
    }

    public void paint(Graphics g, Point mousePos){
        field.paint(g,mousePos);
        cat.paint(g,mousePos);
        dog.paint(g,mousePos);
        bird.paint(g,mousePos);

    }
}
