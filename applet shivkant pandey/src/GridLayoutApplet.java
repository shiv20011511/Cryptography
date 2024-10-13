import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
public class GridLayoutApplet extends Applet {
    public void init() {
        int rows = 3; // Number of rows in the grid
        int columns = 3; // Number of columns in the grid
        setLayout(new GridLayout(rows, columns));
        for (int i = 1; i <= rows * columns; i++) {
            Button button = new Button("Button " + i);
            add(button);
        }
    }
}
//<applet code="GridLayoutApplet.class" height="600" width="600">
//</applet>
