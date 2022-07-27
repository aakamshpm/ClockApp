import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel dateLabel;
	JLabel timeLabel;
	String time;
	JLabel dayLabel;
	String day;
	String date;
	
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setBounds(100, 100, 350, 200);
		this.setResizable(false);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
		timeLabel.setForeground(Color.YELLOW);
		timeLabel.setBackground(new Color(000000));
		timeLabel.setOpaque(true);
		
		dayFormat = new SimpleDateFormat("EEEE");
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
		day = dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
		
		dateFormat = new SimpleDateFormat("dd MMMM, yyyy");
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ariel",Font.PLAIN,20));
		date = dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
		
		this.add(dateLabel);
		this.add(timeLabel);
		this.add(dayLabel);
		this.setVisible(true);
		
		setTime();
	}
	
	public void setTime() {
		while(true) {
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	

}
