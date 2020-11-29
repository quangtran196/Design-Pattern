import javax.swing.event.ChangeListener;
import java.util.ArrayList;

/**
 * Duc Tran
 * Oct 21, 2020
 * Version 1.0
 * A class for testing an implementation of the Observer pattern.
 * The code is reused and adjusted from website: "https://horstmann.com/design_and_patterns.html"
 */
public class ObserverTester
{
    
    public static void main(String[] args)
    {
        ArrayList<Double> data = new ArrayList<Double>();

        data.add(new Double(33.0));
        data.add(new Double(44.0));
        data.add(new Double(22.0));
        data.add(new Double(22.0));

        DataModel model = new DataModel(data);

        TextFrame frame = new TextFrame(model);

        BarFrame barFrame = new BarFrame(model);

        model.attach(barFrame);
        model.attach(frame);
    }
}