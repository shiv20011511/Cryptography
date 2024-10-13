import java.applet.Applet;
import java.awt.*;

public class Prog2 extends Applet{

    public void paint(Graphics d){
            d.setColor(Color.red);
            d.fillRect(5, 10, 120, 120);
            d.setColor(Color.blue);
            d.fillRect(125, 130, 120, 120);
            d.setColor(Color.yellow);
            d.fillRect(245, 250, 120, 120);
            d.setColor(Color.green);
            d.fillRect(365, 370, 120, 120);
            d.setColor(Color.orange);
            d.fillRect(480, 490, 120, 120);

    }
}
//<applet code="Prog2.class" height="600" width="600">
//</applet>