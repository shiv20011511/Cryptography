import java.applet.Applet;
import java.awt.*;

public class Cyl extends Applet {
    public void paint(Graphics d) {
        d.setColor(Color.red);
        d.fillOval(85, 5, 25, 10);
        d.setColor(Color.blue);
        d.drawLine(85, 10, 85, 68);
        d.drawLine(108, 10, 108, 68);
        d.fillOval(85, 63, 25, 10);
    }
}
//<applet code="Cyl.class" height="600" width="600">
//</applet>