import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Duc Tran
 * The code from CarShape.java, MovableShape.java, ShapeIcon.java
 * are reused and adjusted from textbook's code: "Object-Oriented Design and Patterns, 3rd Edition, Cay S. Horstmann"
 */
public class AnimationTester1 {

    public AnimationTester1(){

        JFrame frame = new JFrame();
        ArrayList<MovableShape> carList = new ArrayList<>();

        MovableShape car1 = new CarShape(3,3,100);
        MovableShape car2 = new CarShape(0,60,100);

        carList.add(car1);
        carList.add(car2);

        ShapeIcon icon = new ShapeIcon(carList, 300, 150);
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // move the cars
        final int DELAY = 10;
        Timer  t = new Timer(DELAY, event ->
        {
            for(MovableShape car : carList){
                car.move();
                car.redraw();
            }

            label.repaint();

        });

        t.start();


    }
    public static void main(String[] args){
        new AnimationTester1();


    }
}
