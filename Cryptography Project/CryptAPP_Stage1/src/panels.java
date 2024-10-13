import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class panels extends JFrame {

        panels(){
            ImageIcon img=new ImageIcon("im2.png");

            JLabel label=new JLabel();
            label.setText("panel1");
            label.setIcon(img);
            label.setVerticalAlignment(JLabel.TOP);
            label.setHorizontalAlignment(JLabel.RIGHT);
            JPanel jpred=new JPanel();
            jpred.setBackground(Color.RED);

            jpred.setBounds(0,0,200,200);

            JPanel jpblue=new JPanel();
            jpblue.setBackground(Color.BLUE);

            jpblue.setBounds(200,0,200,200);

            JPanel jpgreen=new JPanel();
            jpgreen.setBackground(Color.GREEN);

            jpgreen.setBounds(0,200,400,200);
            jpgreen.setLayout(new BorderLayout());
            //frame
            JFrame frame=new JFrame();
            frame.setSize(1000,1000);
            //manual layout
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            jpgreen.add(label);
            frame.add(jpred);
            frame.add(jpblue);
            frame.add(jpgreen);
        }

}
