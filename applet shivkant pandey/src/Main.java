import java.applet.Applet;
import java.awt.*;
public class Main extends Applet{
//    program to print welcome to applet diagonally using 600X600
public void init()
{
setBackground(Color.red);
setForeground(Color.white);
}
public void paint(Graphics g){
for(int i=5;i<=557;i++) {
int x=0,y=10;
String text="Welcome To Applet  ";
g.drawString(text,x+i,y+i);
i=i+20;
}
}
}
//<applet code="Main.class" width="600" height="600">
//</applet>