import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.sound.sampled.Line;
import javax.swing.*;

/**
 * a car that can move around
 * The code is reused and adjusted from textbook's code: "Object-Oriented Design and Patterns, 3rd Edition, Cay S. Horstmann"
 */
public class CarShape {
    private int x;
    private int y;
    private int width;

    public CarShape(int x, int y, int width){
        this.x = x;
        this.y = y;
        this.width = width;
    }
    public void setWidth(int width){
        this.width += width;
    }

    public void draw(Graphics2D g2){
        Rectangle2D.Double body
                = new Rectangle2D.Double(x, y + width /6,
                        width -1, width/6);
        Ellipse2D.Double frontTire
                = new Ellipse2D.Double(x + width /6, y + width /3,
                        width /6, width/6);
        Ellipse2D.Double rearTire
                = new Ellipse2D.Double(x + width *2/3, y + width /3,
                width /6, width/6);

        //The bottom of the front windshield
        Point2D.Double r1
                = new Point2D.Double(x + width /6, y + width /6);
        //The front of the roof
        Point2D.Double r2
                = new Point2D.Double(x + width /3, y);
        //The rear of the roof
        Point2D.Double r3
                = new Point2D.Double(x + width*2 /3, y);
        //The bottom rear windshield
        Point2D.Double r4
                = new Point2D.Double(x + width*5 /6, y + width /6);

        Line2D.Double frontWindShield
                = new Line2D.Double(r1,r2);
        Line2D.Double rootTop
                = new Line2D.Double(r2,r3);
        Line2D rearWindShield
                = new Line2D.Double(r3,r4);

        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        g2.draw(frontWindShield);
        g2.draw(rootTop);
        g2.draw(rearWindShield);
    }


}
