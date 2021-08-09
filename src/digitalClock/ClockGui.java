package digitalClock;

import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockGui extends JFrame {

	// properties/object/instances of clock
	JLabel clockLabel;
	Calendar date;
	SimpleDateFormat timeformat;

	ClockGui(){												// constructor
		this.setTitle("Clock");
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(400, 250);
		this.setLayout(new FlowLayout());					// arranging components from left to right		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);					// launch in center
		
		timeformat = new SimpleDateFormat();
		
	}

}
