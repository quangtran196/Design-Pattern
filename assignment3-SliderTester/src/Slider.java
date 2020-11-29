import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Create Slider
 */
public class Slider extends JFrame {
    JFrame frame;
    JSlider slider;
    JLabel label;
    int curSize = 20;

    /**
     * construct slider
     */
    public Slider(){
        frame = new JFrame();
        MovableShape shape = new CarShape(3,3,200);


        ShapeIcon icon = new ShapeIcon(shape, 400, 200);
        label = new JLabel(icon);

        frame.setLayout(new BorderLayout());

        slider = new JSlider(JSlider.HORIZONTAL,0,40,20);
        slider.setMajorTickSpacing(8);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        frame.add(label, BorderLayout.NORTH);
        frame.add(slider, BorderLayout.SOUTH);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                shape.setWidth((slider.getValue() - curSize)*5);
                curSize = slider.getValue();
                label.repaint();
            }
        });

    }
}
