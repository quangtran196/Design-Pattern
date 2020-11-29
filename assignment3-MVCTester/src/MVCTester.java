/**
 *  Duc Tran
 *  Oct 21, 2020
 *  version 1.0
 */
public class MVCTester {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model(view.getTextField());
        Controller control = new Controller(view.getAddBtn(), view.getTextArea(), model);
    }
}