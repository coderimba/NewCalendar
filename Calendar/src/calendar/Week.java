package calendar;

import java.util.Calendar;
import java.util.LinkedList;

/**
 * Week object to hold dates and reminders within those dates in an
 * easily-accessible fashion.
 *
 * @author Ervin Ng Zikai
 */
public class Week {
    //attributes
    
    /**
     * Creates a `LinkedList` of days, modelled as a queue for easily
     * enqueueing and dequeing `Days` object when days elapsed since the last
     * time the app was opened.
     */
    private LinkedList<Day> week = new LinkedList<>();
    
    /**
     * Default constructor which automatically creates a `Week` object for the
     * next 7 days after the current date on the OS.
     */
    public Week() {
        setCalendar();
        for (int i = 0; i < 7; i++) {
            //getTime() returns an object resembling the Date represented by
            // this Calendar's time value
            week.offer(calendar.getTime());
            calendar.add(Calendar.DATE, 1);    // 1 day later
        }
    }
    
    //methods
    
    /**
     * Creates a week of `Day` objects based on current date based on the OS.
     */
    public void setCalendar() {
        //getInstance() returns instance of calendar
        Calendar calendar = Calendar.getInstance();
        // using current time zone
    }
    
    
}
