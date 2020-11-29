import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * The code is reused and adjusted from textbook's code: "Object-Oriented Design and Patterns, 3rd Edition, Cay S. Horstmann"
 */
public class ShapeIcon implements Icon{
    private MovableShape shape;
    private int width;
    private int height;
    private ArrayList<MovableShape> shapeList;

    /**
     * construc shapeicon
     * @param shapeList an array to store moveable shape
     * @param width shape's width
     * @param height shape's height
     */
    public ShapeIcon (ArrayList<MovableShape> shapeList, int width, int height){
        this.shapeList = shapeList;
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

    /**
     * draw the shape
     * @param c shape conponent
     * @param g the graphics context
     * @param x the left of the bounding rectangle
     * @param y the top of the bounding rectangle
     */
    public void paintIcon(Component c, Graphics g, int x, int y){
        Graphics2D g2 = (Graphics2D) g;
        for (MovableShape s: shapeList){
            s.draw(g2);
        }
    }
}
