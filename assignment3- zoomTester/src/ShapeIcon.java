import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.sound.sampled.Line;
import javax.swing.*;


/**
 * The code is reused and adjusted from textbook's code: "Object-Oriented Design and Patterns, 3rd Edition, Cay S. Horstmann"
 */

public class ShapeIcon implements Icon{
    private CarShape shape;
    private int width;
    private int height;

    public ShapeIcon (CarShape shape, int width, int height){
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
