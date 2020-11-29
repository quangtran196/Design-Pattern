import java.awt.event.*;
import javax.swing.*;

public class Controller {

    /**
     * Construct controller
     * @param btn add button
     * @param textarea text area
     * @param txt text
     */
    public Controller(JButton btn, JTextArea textarea, Model txt) {
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textarea.append(txt.getData()+"\n");
            }
        });
    }
}