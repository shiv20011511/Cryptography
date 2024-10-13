import java.applet.*;
import java.awt.*;
public class Smiley extends Applet{
    public void paint(Graphics e){
        setBackground(Color.black);
        int x=10,y=10;
        for (int i=0;i<5;i++) {
            e.setColor(Color.yellow);
            e.fillOval(x, y, 100, 100);
            e.setColor(Color.white);
            e.fillOval(x+20,y+20,20,20);
            e.setColor(Color.white);
            e.fillOval(x+60,y+20,20,20);
            e.setColor(Color.red);
            e.fillArc(x+15,y+60,70,20,0,-180);
            x=x+110;
        }
    }
}
//<applet code="Smiley.class" height="600" width="600">
//</applet>