import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
//game logics done just few game basics and designings left
public class Schulte extends Applet implements ActionListener{
    String s2;
boolean gameActive = false;
    int elapsedTime=0;
    int second=0;
    boolean started =false;
    String secondstring=String.format("%02d",second);
    TextField t3,t4,t5;
    //String s2="Number is not in Sequence ";
    int count=0;
    Button playagain;
    Button EXIT;
    Button[] bt=new Button[36];
    public void init() {
        t3=new TextField(50);
        add(t3);
        t4=new TextField(50);
        add(t4);
//t4.setText();
gameActive = false;
timer.stop();
        t4.setText("Start your game by pressing 1");
        t4.setForeground(Color.GREEN);
        t4.setBackground(Color.black);
        int v[]=Shuffle();
        int[] finalval=new int[36];
        for (int i=0;i<36;i++){
            finalval[i]=v[i];
        }
	String s="RED";
playagain=new Button("playagain");
playagain.addActionListener(this);
add(playagain);
EXIT=new Button("EXIT");
EXIT.addActionListener(this);
add(EXIT);
playagain.setVisible(false);
EXIT.setVisible(false);
        for (int i = 0; i < 36; i++) {
            bt[i] = new Button(Integer.toString(finalval[i]).trim());
            bt[i].addActionListener(this);
            add(bt[i]);
//setRandomBackgroundColor(bt[i]);
bt[i].setBackground(Color.orange);
	    
        }
t3.setVisible(false);
    }
    Timer timer =new Timer(1000,new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ti) {
            elapsedTime+=1000;
            second=(elapsedTime/1000)%60;
            secondstring=String.format("%02d",second);
            t4.setText(secondstring);
	
		if (second==59){
                t4.setText("Time over your Score : "+String.valueOf(count));
		stops();        
for (int i = 0; i < 36; i++) {
                    bt[i].setVisible(false);
                }
		playagain.setVisible(true);
EXIT.setVisible(true);

                }		
        }
    });
public static int[] Shuffle(){
	int[] buttonlabels=new int[36];
        int[] randomNumbers=new int[36];
        Set<Integer> uniqueNumbers = new HashSet<>();
        Random random=new Random();
        int index = 0;
        while (index < 36) {
            int randomNumber = random.nextInt(36) + 1;
            if (uniqueNumbers.add(randomNumber)) { // If the number is unique, add it to the set
                randomNumbers[index] = randomNumber;
                index++;
            }
        }
	return randomNumbers;
}
public void actionPerformed(ActionEvent a) {	
        int v[] = Shuffle();
        int[] finalval = new int[36];
        for (int i = 0; i < 36; i++) {
            finalval[i] = v[i];
        }
        for (int i = 0; i < 36; i++) {
            bt[i].setLabel(Integer.toString(finalval[i]).trim());
            setRandomBackgroundColor(bt[i]);
        }
        String[] strarray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35"};
    String str = a.getActionCommand();    
String z=String.valueOf(count);

            for (int i = 0; i < strarray.length; i++) {
                starts();
                if (str.equals(strarray[count])) {
                    count = count + 1;
                    s2=String.valueOf(count);
                }
           }
 if(!Objects.equals(str,s2)) {	
                stops();	
                t3.setText("game interrupted due to sequence error Your score :" + z);
                t3.setVisible(true);
		t4.setVisible(false);
                for (int i = 0; i < 36; i++) {
                    bt[i].setVisible(false);
                }
		playagain.setVisible(true);
EXIT.setVisible(true);
if (str.equals("playagain")){
playAgain();
}
if (str.equals("EXIT")){
	//stop();
}
     }	
}
void playAgain() {    
    count = 0;
    elapsedTime = 0;
    second = 0;
    secondstring = String.format("%02d", second);
    t4.setText(secondstring);    
    gameActive = false;
    stops();
    t3.setVisible(false);
    playagain.setVisible(false);
    EXIT.setVisible(false);
    for (int i = 0; i < 36; i++) {
        bt[i].setVisible(true);
    }
    int v[] = Shuffle();
    int[] finalval = new int[36];
    for (int i = 0; i < 36; i++) {
        finalval[i] = v[i];
    }
    for (int i = 0; i < 36; i++) {
        bt[i].setLabel(Integer.toString(finalval[i]).trim());
        setRandomBackgroundColor(bt[i]);
    }
    starts();
	t4.setVisible(true);
}
void restart(){
timer.restart();
}
void starts() {
        timer.start();
        repaint();
    }
void stops(){
    timer.stop();
    repaint();
}
private void setRandomBackgroundColor(Button bt) {
Random random=new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        bt.setBackground(new Color(red, green, blue));
setBackground(new Color(red,green,blue));
    }
public void paint(Graphics g) {
    //g.drawString(t4.getText(),100,200);
		
    }
}
//<applet code="Schulte.class" height="600" width="600">
//</applet>
