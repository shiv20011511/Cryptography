import javax.swing.*;
import java.awt.*;

public class frame2 extends JFrame{
frame2(){
    //frame methods
//    JFrame f=new JFrame(); extends thatswhy comment
    this.setTitle("Shiv's Cryptography");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(false);
    this.setSize(1080,1000);
    this.setVisible(true);
    ImageIcon img=new ImageIcon("im1.png");
    this.setIconImage(img.getImage());
    this.getContentPane().setBackground(new Color(159,92,80));
}

}
