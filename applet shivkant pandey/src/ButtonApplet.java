import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonApplet extends Applet implements ActionListener {
	Button b1,b2;
	TextField t1;
		public void init () {
			t1=new TextField(20);
			add(t1);
			b1 = new Button("Name");
			b1.addActionListener(this);
			add(b1);
			b2 = new Button("Enrollment");
			b2.addActionListener(this);
			add(b2);
		}
		public void actionPerformed (ActionEvent e){
			String str = e.getActionCommand();
			if (str.equals("Name")) {
				t1.setForeground(Color.red);
				t1.setText("Shivkant Pandey");
				setBackground(Color.green);

			}
			if (str.equals("Enrollment")) {
				t1.setForeground(Color.blue);
				t1.setText("A010145023040");
				setBackground(Color.red);
			}
		}
}
//<applet code="ButtonApplet.class" width="600" height="600">
//</applet>
