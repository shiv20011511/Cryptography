import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonChangeApplet extends Applet implements ActionListener {
    private Button[] buttons;

    public void init() {
        buttons = new Button[5];

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button(Integer.toString(i + 1));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < buttons.length; i++) {
            if (e.getSource() == buttons[i]) {
                // Change the button label to "Clicked" when clicked
                buttons[i].setLabel("Clicked");
            }
        }
    }
}
//<applet code="ButtonChangeApplet.class" height="600" width="600">
//</applet>






