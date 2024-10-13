import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class labels extends JFrame{
    labels(){

//label

        JLabel label=new JLabel();
        label.setText("Welcome to cryptography");

//addding img to label
ImageIcon img=new ImageIcon("im2.png");
label.setIcon(img);
Border border=BorderFactory.createLineBorder(Color.green,3);

//setting horizontal text position
        label.setHorizontalTextPosition(JLabel.CENTER);
        //setting vertical text position
        label.setVerticalTextPosition(JLabel.TOP);
//color and fonts
        label.setForeground(Color.RED);
        label.setFont(new Font("MV Boli",Font.PLAIN,60));
//gap bw img and text
        label.setIconTextGap(10);

        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        //manually resize label
        label.setBounds(0,0,1280,250);


        //frame basic need to add before putting label
        JFrame frame=new JFrame();
        frame.setSize(1280,1280);
        //manual layout
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);

//        frame.pack();//resize the size of components automatically

    }

}
