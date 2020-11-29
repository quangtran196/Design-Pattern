import javax.swing.*;


public class View extends JFrame {

    JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JButton addButton;
    private JTextArea textArea;

    /**
     * construct view
     */
    public View() {
        frame = new JFrame();
        frame.setSize(200,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);

        addButton = new JButton("add");
        addButton.setBounds(0, 0, 200, 20);
        panel.add(addButton);

        textArea = new JTextArea();
        textArea.setBounds(0, 21, 199, 230);
        textArea.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        panel.add(textArea);

        textField = new JTextField("Please text here");
        textField.setBounds(0, 249, 200, 30);
        panel.add(textField);
        textField.setColumns(10);

        frame.add(panel);
        frame.setVisible(true);
    }

    /**
     * @return text field
     */
    public JTextField getTextField() {
        return textField;
    }

    /**
     *
     * @return add button
     */
    public JButton getAddBtn() {
        return addButton;
    }

    /**
     *
     * @return text area
     */
    public JTextArea getTextArea() {
        return textArea;
    }

}