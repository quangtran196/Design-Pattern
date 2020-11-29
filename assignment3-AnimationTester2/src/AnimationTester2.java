import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 Duc Tran
 Oct 21, 2020
 version 1.0
*/
 
public class AnimationTester2 {



    public AnimationTester2(){

        JFrame frame = new JFrame();
        ArrayList<MovableShape> carList = new ArrayList<>();

        MovableShape shape = new CarShape(3,3,100);


        ShapeIcon icon = new ShapeIcon(shape, 400, 200);
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
                shape.move();
                label.repaint();
                shape.reDraw();
            });
        t.start();


    }
    public static void main(String[] args){
        new AnimationTester2();


    }
}
