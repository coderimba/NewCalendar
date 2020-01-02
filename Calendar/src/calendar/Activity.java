package calendar;

import java.util.Calendar;

/**
 * An activity object containing a reminder, start and end time, and priority
 * level.
 *
 * @author Mitchell Tanbun
 */
public class Activity {
    /** Levels of priority. */
    private enum PRIORITY_LEVELS {NONE, LOW, MED, HIGH}
    
    /** Priority level of the task. */
    private PRIORITY_LEVELS _priority;
    
    /**
     * Start and end time of this activity. If any of the fields are
     * unspecified, then take the start and end to be 0000 hrs and 2359 hrs
     * of the Pacific Standard Time (PST) respectively.
     */
    private Calendar _start, _end;
    
    /**
     *
     */
}
