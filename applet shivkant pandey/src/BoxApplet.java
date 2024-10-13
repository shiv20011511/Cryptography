import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class BoxApplet extends Applet {
    public void paint(Graphics g) {
        // Set the color for the first box
        g.setColor(Color.red);

        // Draw a filled red rectangle (box) at (50, 50) with width 100 and height 50
        g.fillRect(50, 50, 100, 50);

        // Set the color for the second box
        g.setColor(Color.blue);

        // Draw a filled blue rectangle (box) at (200, 50) with width 80 and height 80
        g.fillRect(200, 50, 80, 80);

        // Set the color for the third box
        g.setColor(Color.green);

        // Draw a filled green rectangle (box) at (100, 150) with width 120 and height 60
        g.fillRect(100, 150, 120, 60);
    }
}
//<applet code="BoxApplet.class" width="600" height="600">
//</applet>
