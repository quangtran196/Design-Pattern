import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 Duc Tran
 Oct 21, 2020
 version 1.0
*/
public class ZoomTester {
    private JLabel label;
    private JButton zoomIn;
    private JButton zoomOut;

    public ZoomTester(){
        label = new JLabel();
        zoomIn = new JButton("Zoom in");
        zoomOut = new JButton("Zoom out");


        JFrame frame = new JFrame();

        CarShape shape = new CarShape(10,10,100);

        ShapeIcon icon = new ShapeIcon(shape, 400, 200);
        JLabel label = new JLabel(icon);
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);


        //add buttons
        JPanel buttons = new JPanel();
        buttons.add(zoomIn);
        buttons.add(zoomOut);

        frame.add(buttons, BorderLayout.SOUTH);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        //add actionListener
        zoomIn.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        shape.setWidth(20);
                        label.repaint();
                    }
                }
        );
        zoomOut.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        shape.setWidth(-20);
                        label.repaint();
                    }
                }
        );

    }
    public static void main(String[] args){
        new ZoomTester();


    }
}
