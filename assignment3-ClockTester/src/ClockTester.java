import javax.swing.*;

/**
 *  Duc Tran
 *  Oct 21, 2020
 *  version 1.0
 */
public class ClockTester {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(400,400);

        ClockIcon clock = new ClockIcon(200);
        JLabel label = new JLabel(clock);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
