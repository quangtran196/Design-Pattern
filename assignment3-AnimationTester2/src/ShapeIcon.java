import java.awt.*;
import javax.swing.*;

/**
 * The code is reused and adjusted from textbook's code: "Object-Oriented Design and Patterns, 3rd Edition, Cay S. Horstmann"
 */
public class ShapeIcon implements Icon{
    private MovableShape shape;
    private int width;
    private int height;

    public ShapeIcon (MovableShape shape, int width, int height){
        this.shape = shape;
        this.width = width;
        this.height = height;
    }


    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return height;
    }

    public void paintIcon(Component c, Graphics g, int x, int y){
        Graphics2D g2 = (Graphics2D) g;
        shape.draw(g2);
    }

}
