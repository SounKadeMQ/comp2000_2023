import java.awt.Graphics;
import java.awt.Point;

public class Stage {
    Grid field;
    Cat cat;
    Dog dog;
    Bird bird;


    public Stage() {
        field = new Grid();
        cat = new Cat();
        dog = new Dog();
        bird = new Bird();
    }

    public void paint(Graphics g, Point mousePos){
        field.paint(g,mousePos);
        cat.paint(g,mousePos);
        dog.paint(g,mousePos);
        bird.paint(g,mousePos);

    }
}
