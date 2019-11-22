package calendar;

import java.lang.*;
import java.util.*;

/** A day entry in a diary which contains today's date and a reminder, along
 *  with the level of importance of the task.
 *  // TODO: Maybe custom labels could be added to this diary entry.
 *  */
public class Day {
    /** Day of the month. */
    private byte _day;

    /** Reminder for the day. */
    private ArrayList<String> _reminders;

    /** Levels of priority. */
    private enum PRIORITY_LEVELS {NONE, LOW, MED, HIGH};

    /** Priority level of the task. */
    private PRIORITY_LEVELS _priority;

    /** Maximum number for day that could be taken. */
    static final byte MAX_DAY = 31;

    /** Regex for a date item in DD/MM/YYYY. Does not check for invalid dates
     *  such as 31/02/2019. */
    public static final String DATE_REGEX =
            "(" + "([12][0-9]|[0][1-9])|[3][01]" + ")/"
            + "(" + "([0][1-9]|[1][012]" + ")/"
            + "(" + "\\d{4}" + ")";

    public Day(byte day) {
        if (!validDay(day)) {
            throw new IllegalArgumentException("Invalid date: " + day);
        }
        _day = day;

    }

    @Override
    public String toString() {
        return _day + "";
    }

    /** Returns whether DAY is valid. */
    private boolean validDay(byte day) {
        return (1 <= day && day <= MAX_DAY);
    }
}