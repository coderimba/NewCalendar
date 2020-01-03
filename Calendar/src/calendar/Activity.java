package calendar;

import java.util.Calendar;
import java.util.Locale;

/**
 * An activity object containing a reminder, start and end time, and priority
 * level. Each reminder is associated with a <code>Day</code>.
 *
 * @author Mitchell Tanbun
 */
public class Activity {
    /** Levels of priority. */
    private enum PRIORITY_LEVELS {NONE, LOW, MED, HIGH}
    
    /** Priority level of the task. */
    private PRIORITY_LEVELS _priority = PRIORITY_LEVELS.NONE;
    
    /** Description of the activity. */
    private String _description;
    
    /**
     * Start and end time of this activity. If any of the fields are
     * unspecified, then take the start and end to be 0000 hrs and 2359 hrs
     * of the Pacific Standard Time (PST) respectively.
     *
     * @see java.util.Calendar
     */
    private Calendar _start, _end;
    
    /**
     * Creates a new reminder with the current time as the start and 23 59
     * on today's date as the end.
     *
     * @param description The activity to be reminded of
     */
    Activity(String description) {
        ;
    }
    
    /**
     * Creates a new reminder with the specified ending time
     *
     * @param description The activity to be reminded of
     * @param endTime     The ending time of the activity
     */
    Activity(String description, Calendar endTime) {
    
    }
    
    /**
     * Creates a new reminder with the corresponding starting and ending time
     *
     * @param description The activity to be reminded of
     * @param start       The starting time
     * @param end         The ending time
     */
    Activity(String description, Calendar start, Calendar end) {
    
    }
    
    /**
     * Creates a new reminder with all member fields filled in.
     *
     * @param description Description of the activity
     * @param start       Starting time
     * @param end         Ending time
     * @param pr          The level of importance of the reminder
     */
    Activity(String description, Calendar start, Calendar end,
             PRIORITY_LEVELS pr) {
        
    }
    
    @Override
    public String toString() {
        StringBuilder data = new StringBuilder();
        // TODO
        return data.toString();
    }
}
