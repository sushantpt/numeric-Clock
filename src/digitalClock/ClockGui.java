package digitalClock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings({"serial" })
public class ClockGui extends JFrame {

	// properties/object/instances of clock
	String time;
	JLabel clockLabel;
	SimpleDateFormat timeformat;
	
	String day;
	JLabel dayLabel;
	SimpleDateFormat dayformat;
	
	Calendar date;

	ClockGui(){												// constructor
		this.setTitle("Time and Date");
		this.setResizable(false);
		this.setSize(720, 230);
		this.setLayout(new FlowLayout());					// arranging components from left to right		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);					// launch in center
		this.getContentPane().setBackground(Color.WHITE);	// background color
		
		timeformat = new SimpleDateFormat("hh:mm:ss a");		// hour:minute:second
		dayformat = new SimpleDateFormat("y:MMMM:dd:EE");		// year:month:date:day
		
		// instantiate clockLabel
		clockLabel = new JLabel();
		clockLabel.setFont(new Font("monospaced", Font.BOLD, 70));		// font style, format and size
		clockLabel.setForeground(Color.black);
		clockLabel.setBackground(Color.ORANGE);
		clockLabel.setOpaque(true); 			// to make background visible
		
		this.add(clockLabel);								// add clock label in gui
		this.setVisible(true);
		
		// instantiate dayLabel
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("monospaced", Font.ITALIC, 60));		// font style, format and size
		dayLabel.setForeground(Color.black);
		dayLabel.setBackground(Color.cyan);
		dayLabel.setOpaque(true); 			// to make background visible
		
		this.add(dayLabel);
		this.setVisible(true);
		
		
		setTime();
	}
	
	public void setTime() {		// method/setter to set time in gui
		while(true) {			// to update second
			time = timeformat.format(Calendar.getInstance().getTime());		// Calendar.getInstance = Gets a calendar using the default time zone and locale. 
			// Calendar.getInstance().getTime = Returns a Date object representing this Calendar's time value
			clockLabel.setText(time);			// set text in clock label and pass time
			
			day = dayformat.format(Calendar.getInstance().getTime());		// Calendar.getInstance = Gets a calendar using the default time zone and locale. 
			// Calendar.getInstance().getTime = Returns a Date object representing this Calendar's time value
			dayLabel.setText(day);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
