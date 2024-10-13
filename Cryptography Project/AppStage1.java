//implementing Stage 1 in gui
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppStage1 extends Applet {


  public void init() {

        Label myLabel = new Label("Welcome To Shiv's Cryptography");
// Set custom font size
        Font font = new Font("Arial", Font.BOLD, 35);
        myLabel.setFont(font);
// Set custom color
        myLabel.setForeground(Color.ORANGE);


        add(myLabel);

TextField t1 = new TextField("Initial text 1", 30);
        //TextField textField2 = new TextField("Initial text 2", 30);

        // Add text fields to the container
        add(t1,BorderLayout.WEST);

    }




}
//<applet code="AppStage1.class" height="900" width="900">
//</applet>