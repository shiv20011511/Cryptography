import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

public class Prog3 extends Applet {
    public void paint(Graphics g) {
        // Define the coordinates of the octagon's vertices
        int[] xPoints = {100, 150, 200, 200, 150, 100, 50, 50};
        int[] yPoints = {50, 50, 100, 150, 200, 200, 150, 100};

        // Create a Polygon object with the defined vertices
        Polygon octagon = new Polygon(xPoints, yPoints, 8);

        // Draw the octagon
        g.setColor(Color.green);
        g.fillPolygon(octagon);
    }
}
//<applet code="Prog3.class" height="600" width="600">
//</applet>