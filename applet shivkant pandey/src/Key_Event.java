import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Key_Event  extends Applet implements KeyListener {
    int x = 150, y = 150;
    String msg = "";

    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
        addKeyListener(this);
        requestFocus();
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("Pressed Key");
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        showStatus(ke.getKeyChar() + "Key Released");
        setBackground(Color.blue);
        setForeground(Color.darkGray);
        repaint();
    }

    public void keyTyped(KeyEvent ke) {
        showStatus(ke.getKeyChar() + "Key Typed");
        setBackground(Color.green);
        setForeground(Color.yellow);
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, y);
    }
}
//<applet code="Key_Event.class" height="600" width="600">
//</applet>