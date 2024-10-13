import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.Double.parseDouble;

public class Calculator extends Applet implements ActionListener{
    TextField display;
    int c;
    double n;
    String s1,s2,s3,s4;
    String[] buttonLabels={"1","2","3","4","5","6","7","8","9","0"};
    String[] button2Labels={"C","+","-","eq","X","/"};

    public void init(){
        display = new TextField(20);
        add(display);
        setBackground(Color.ORANGE);
        setForeground(Color.black);
          for(int i=0;i<buttonLabels.length;i++) {
            Button bi=new Button(buttonLabels[i]);
            bi.addActionListener(this);
            add(bi);

          }
          setForeground(Color.red);
          for(int i=0;i<button2Labels.length;i++){
              Button bti=new Button(button2Labels[i]);
              bti.addActionListener(this);
              add(bti);
          }

    }

    public void actionPerformed(ActionEvent a) {
        String str = a.getActionCommand();

        if (str.equals("1")) {
            s3 = display.getText();
            s4 = s3 + str;
            display.setText(s4);
        }
        if (str.equals("2")) {
            s3 = display.getText();
            s4 = s3 + str;
            display.setText(s4);
        }
        if (str.equals("3")) {
            s3 = display.getText();
            s4 = s3 + str;
            display.setText(s4);
        }
        if (str.equals("4")) {
            s3 = display.getText();
            s4 = s3 + str;
            display.setText(s4);
        }
        if (str.equals("5")) {
            s3 = display.getText();
            s4 = s3 + str;
            display.setText(s4);
        }
        if (str.equals("6")) {
            s3 = display.getText();
            s4 = s3 + str;
            display.setText(s4);
        }
        if (str.equals("7")) {
            s3 = display.getText();
            s4 = s3 + str;
            display.setText(s4);
        }
        if (str.equals("8")) {
            s3 = display.getText();
            s4 = s3 + str;
            display.setText(s4);
        }
        if (str.equals("9")) {
            s3 = display.getText();
            s4 = s3 + str;
            display.setText(s4);
        }
        if (str.equals("0")) {
            s3 = display.getText();
            s4 = s3 + str;
            display.setText(s4);
        }
        if (str.equals("C")) {
            display.setText(" ");
        }
        if (str.equals("+")) {
            s1 = display.getText().trim();
            display.setText(" ");
            c = 1;
        }
        if (str.equals("-")) {
            s1 = display.getText().trim();
            display.setText(" ");
            c = 2;
        }
        if (str.equals("X")) {
            s1 = display.getText().trim();
            display.setText(" ");
            c = 3;
        }
        if (str.equals("/")) {
            s1 = display.getText().trim();
            display.setText(" ");
            c = 4;
        }

        if (str.equals("eq")) {
            s2 = display.getText().trim();//remove leading and trailing spaces
            display.setText(" ");
            try {
                if (c == 1) {
                    n = Double.parseDouble(s1) + Double.parseDouble(s2);
                } else if (c == 2) {
                    n = Double.parseDouble(s1) - Double.parseDouble(s2);
                } else if (c == 3) {
                    n = Double.parseDouble(s1) * Double.parseDouble(s2);
                } else if (c == 4) {
                    if (!s2.equals("0")) {
                        n = Double.parseDouble(s1) / Double.parseDouble(s2);
                    } else {
                        display.setText("Error: Division by zero");
                        return;
                    }
                }
                String strValue = String.valueOf(n);
                display.setText(strValue);
            }catch (Exception e){
                display.setText(e.getMessage()+e.getStackTrace());
            }
        }

    }
    public void paint(Graphics g){
        setForeground(Color.black);
        g.drawString("Shivkant Pandey ",2,80);
    }
}

//<applet code="Calculator.class" height="100" width="300">
//</applet>