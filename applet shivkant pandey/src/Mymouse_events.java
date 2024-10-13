import java.awt.*;

import java.applet.*;

import java.awt.event.*;

public class Mymouse_events extends Applet implements MouseListener,MouseMotionListener{
            
int x=0,y=0;
            
String msg="";

public void init(){
    
setBackground(Color.black);
    
addMouseListener(this);
    
addMouseMotionListener(this);

}

//handle mouse Entered

public void mouseEntered(MouseEvent me){

setBackground(Color.red);

x=100;

y=100;

msg="Mouse Entered ";

repaint();

}

//handle mouse clicked

public void mouseClicked(MouseEvent me){
    
setBackground(Color.white);
    
x=100;
    
y=100;
     
msg="Mouse Clicked";
    
repaint();

}




public void mouseExited(MouseEvent me){

setBackground(Color.magenta);

x=100;

y=100;

msg="Mouse Exited";

repaint();

}

//handle mouse pressed

public void mousePressed(MouseEvent me){

setBackground(Color.cyan);
x=me.getX();

y=me.getY();

msg="Mouse Pressed";

repaint();

}

//handle mouse released

public void mouseReleased(MouseEvent me){

setBackground(Color.orange);

x=me.getX();

y=me.getY();

msg="Mouse Released";

repaint();

}

//handle mouse moved

public void mouseMoved(MouseEvent me){

setBackground(Color.orange);

x=me.getX();

y=me.getY();

msg="Mouse Moved";

showStatus("Moving mouse at"+x+","+y);

repaint();

}

//handle mouse dragged

public void mouseDragged(MouseEvent me){

setBackground(Color.yellow);

x=me.getX();

y=me.getY();

msg="Mouse Dragged";

showStatus("Dragging mouse at"+x+","+y);

repaint();

}

//display msg in the window

public void paint(Graphics g){
g.drawString(msg,x,y);

}

}

//<applet code="Mymouse_events.class" height="600" width="600">

//</applet>