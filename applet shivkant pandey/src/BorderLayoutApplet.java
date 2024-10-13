import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;

public class BorderLayoutApplet extends Applet {
    public void init() {
        setLayout(new BorderLayout());

        Button buttonNorth = new Button("North");
        Button buttonSouth = new Button("South");
        Button buttonEast = new Button("East");
        Button buttonWest = new Button("West");
        Button buttonCenter = new Button("Center");

        add(buttonNorth, BorderLayout.NORTH);
        add(buttonSouth, BorderLayout.SOUTH);
        add(buttonEast, BorderLayout.EAST);
        add(buttonWest, BorderLayout.WEST);
        add(buttonCenter, BorderLayout.CENTER);
    }
}
//<applet code="BorderLayoutApplet.class" height="600" width="600">
//</applet>