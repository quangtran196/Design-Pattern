import javax.swing.JTextField;

public class Model {
    JTextField textField;

    /**
     * construc model
     * @param textField text field
     */
    public Model(JTextField textField) {
        this.textField = textField;
    }

    /**
     * get data from text field
     * @return text
     */
    public String getData() {
        return textField.getText();
    }

}