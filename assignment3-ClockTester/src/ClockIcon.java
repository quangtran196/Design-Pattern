import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;

/**
 * create clock icon
 */
public class ClockIcon implements Icon {
    private int diameter;

    /**
     * construc clock icon
     * @param diameter get diameter of the circle
     */
    public ClockIcon(int diameter){
        this.diameter = diameter;
    }

    /**
     * draw the clock
     * @param clock get the component
     * @param g the graphic context
     * @param x the X coordinate of the icon's
     * @param y the Y coordinate of the icon's
     */
    public void paintIcon(Component clock, Graphics g, int x, int y){
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 200, 200);
        int centerX = (int)circle.getCenterX();
        int centerY = (int)circle.getCenterY();
        g2.draw(circle);

        GregorianCalendar gCal = new GregorianCalendar();
        int hour = gCal.get(Calendar.HOUR);
        int min = gCal.get(Calendar.MINUTE);
        int sec = gCal.get(Calendar.SECOND);

        double minHand = min*6 +90;
        double hourHand = 0.5 * (60 * hour + min) +90;
        double secHand = sec*6 +90;

        // Draw Minute hand
        g2.drawLine(centerX, centerY,
                centerX - (int)(75*Math.cos(Math.toRadians(minHand))),
                centerY - (int)(70*Math.sin(Math.toRadians(minHand))));
        // Draw hour hand
        g2.drawLine(centerX, centerY,
                centerX - (int)(50*Math.cos(Math.toRadians(hourHand))),
                centerY - (int)(50*Math.sin(Math.toRadians(hourHand))));
        //Draw second hand
        g2.drawLine(centerX, centerY,
                centerX - (int)(90*Math.cos(Math.toRadians(secHand))),
                centerY - (int)(90*Math.sin(Math.toRadians(secHand))));
    }

    /**
     * get icon's height
     * @return diameter of the clock
     */
    public int getIconHeight()
    {
        return diameter;
    }

    /**
     * get icon's width
     * @return diameter of the clock
     */
    public int getIconWidth()
    {
        return diameter;
    }
}
