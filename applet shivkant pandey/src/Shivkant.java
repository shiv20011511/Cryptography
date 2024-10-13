import java.applet.Applet;
import java.awt.*;

public class Shivkant extends Applet{
    public void paint(Graphics d){
////draw a 3d cube
      d.drawRect(5,5,50,50);
        d.drawRect(18,18,50,50);
        d.setColor(Color.blue);
        d.drawLine(5,5,18,18);
        d.drawLine(55,5,68,18);
        d.drawLine(5,55,18,68);
        d.drawLine(55,55,68,68);
//draw a cylinder
        d.setColor(Color.red);
        d.fillOval(85,5,25,10);
        d.setColor(Color.blue);
        d.drawLine(85,10,85,68);
        d.drawLine(108,10,108,68);
        d.fillOval(85,63,25,10);
//draw rectangle with inside oval
        d.setColor(Color.blue);
        d.fillRect(125,5,68,68);
        d.setColor(Color.red);
        d.fillOval(125,5,68,68);

////draw a square inside a circle
        d.setColor(Color.orange);
        d.fillOval(210,5,70,70);
        d.setColor(Color.green);
        d.fillRect(220,15,50,50);

//draw a rectangle with both diagonals
        d.setColor(Color.blue);
        d.fillRect(150,150,200,350);
        d.setColor(Color.white);
        d.drawLine(150,150,350,500);
        d.drawLine(350,150,150,500);
    }
}
//<applet code="Shivkant.class" height="600" width="600">
//</applet>