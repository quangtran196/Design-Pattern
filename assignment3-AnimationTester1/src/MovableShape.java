import java.awt.*;

/**
 * A shape can move around
 * The code is reused and adjusted from textbook's code: "Object-Oriented Design and Patterns, 3rd Edition, Cay S. Horstmann"
 */
public interface MovableShape {
    /**
     * Draws the shape.
     * @param g2 the graphics context
     */
    void draw(Graphics2D g2);

    /**
     * Moves the shape
     * It is up to the shape to move itself
     */
    void move();
    void redraw();
}
