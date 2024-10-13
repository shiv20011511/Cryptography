import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class MyClockFrame extends JFrame{
    Calendar Calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    MyClockFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MyClockProgram");
        this.setLayout(new FlowLayout());
        this.setSize(550,400);
        this.setResizable(true);
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMM,dd,yyyy");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Segoe Print",Font.BOLD,35));
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Comic",Font.BOLD,25));
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);
        setTime();
    }
    public void setTime(){
        while(true){
            time =  timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);
            dayLabel.setBackground(Color.black);
            dayLabel.setForeground(Color.magenta);
            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
            dateLabel.setBackground(Color.lightGray);
            dateLabel.setForeground(Color.orange);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
