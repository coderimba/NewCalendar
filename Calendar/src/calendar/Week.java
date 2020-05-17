package calendar;

import java.util.*;

public class Week {
	//attributes
	private Calendar calendar; 
	private LinkedList<Date> week = new LinkedList<>();
	
	//constructors
	public Week() {
		setCalendar(); 
		for (int i = 0; i < 7; i++) {
			week.offer(calendar.getTime()); //getTime() returns an object resembling the Date represented by this Calendar's time value
			calendar.add(Calendar.DATE, 1);	// 1 day later
		}
	}
	
	//methods	
	/* setter */
	public void setCalendar() {
		calendar = Calendar.getInstance(); //getInstance() returns instance of calendar using current time zone
	}
}
