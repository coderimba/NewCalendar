package calendar;

import java.io.Serializable;
import java.io.File;

import java.util.Calendar;
import java.util.LinkedList;

/**
 * Week object to hold dates and reminders within those dates in an
 * easily-accessible fashion. This object uses the {@link Calendar} object to
 * obtain the local time from the current device accessing the app.
 *
 * @author Ervin Ng Zikai
 * @see    Calendar
 * @see    File
 */
public class Week implements Serializable {
    /** Number of days in a week */
    private static final int NUM_DAYS_IN_WEEK = 7;
    
    /**
     * Creates a `LinkedList` of days, modelled as a queue for easily
     * enqueueing and dequeing `Days` object when days elapsed since the last
     * time the app was opened.
     */
    private LinkedList<Day> week = new LinkedList<>();
    
    /**
     * Default constructor which automatically creates a {@link Week} object
     * for tracking the next 7 days after the current date on the OS.
     *
     * @see Calendar#add(int, int)
     * @see Calendar#get(int)
     */
    public Week() {
        setCalendar();
        Calendar curr = Calendar.getInstance();
        for (int i = 0; i < NUM_DAYS_IN_WEEK; i++) {
            //getTime() returns an object resembling the Date represented by
            // this Calendar's time value
            week.offer(new Day(curr));
            curr.add(Calendar.DATE, 1);    // 1 day later
        }
    }
    
    
    // class methods
    
    /**
     * Creates a week of {@link Day} objects based on current date based on the
     * OS.
     */
    public void setCalendar() {
        //getInstance() returns instance of calendar
        Calendar calendar = Calendar.getInstance();
        // using current time zone
    }
    
    /**
     * Checks whether days have elapsed since the app was last launched so that
     * the next few numbers of {@link Day} objects could be enqueued in the
     * {@link LinkedList}. Returns false if no updates to the queue of days
     * were needed.
     */
    protected boolean requeue() {
        // TODO
        return false;
    }
    
    /**
     * Saves the current week as a file containing metadata to the memory of
     * the device of the app.
     *
     * @return whether the save was done successfully.
     */
    protected boolean saveWeek() {
        // TODO
        return false;
    }
}
