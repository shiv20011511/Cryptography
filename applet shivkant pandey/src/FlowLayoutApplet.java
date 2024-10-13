import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;

public class FlowLayoutApplet extends Applet {
    public void init() {
        setLayout(new FlowLayout());
        for (int i = 1; i <= 5; i++) {
            Button button = new Button("Button " + i);
            add(button);
        }
    }
}
//<applet code="FlowLayoutApplet.class" height="600" width="600">
//</applet>