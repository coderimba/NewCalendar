package calendar;

import calendar.Activity;

import java.io.Serializable;
import java.io.File;

import java.lang.String;

import java.util.LinkedList;
import java.util.Calendar;
import java.util.regex.Pattern;

/** A day entry in a diary which contains today's date and a reminder, along
 *  with the level of importance of the task.
 *  // TODO: Maybe custom labels could be added to this diary entry.
 *  */
public class Day {
    /** Day of the month. */
    private int _day;

    /** Reminder for the day. */
    private LinkedList<Activity> _reminders;

// TODO: Maybe custom labels could be added to this diary entry.
/**
 * A day entry in a diary which contains today's date and a reminder, along
 * with the level of importance of the task.
 *
 * @author Mitchell Tanbun
 */
public class Day implements Serializable {
    /** Day of the month. */
    private byte _day;
    
    /**
     * A list of reminders for the day hashed according to their start time .
     */
    private HashMap<Calendar, Activity> _activities;
    
    /** Maximum number for day that could be taken. */
    static final int MAX_DAY = 31;
    
    /**
     * Regex for a date item in DD/MM/YYYY. Does not check for invalid dates
     * such as 31/02/2019.
     */
    public static final Pattern DATE_REGEX = Pattern.compile(
        "(" + "([12][0-9]|[0][1-9])|[3][01]" + ")/"
        + "(" + "[0][1-9]|[1][012]" + ")/"
        + "(" + "\\d{4}" + ")");
    
    /** Constructor of a day object. */
    public Day(int day) {
        if (!validDay(day)) {
            throw new IllegalArgumentException("Invalid date: " + day);
        }
        _day = day;
        _activities = new HashMap<>();
    }
    
    @Override
    public String toString() {
        return _day + "";
    }
    
    /** Returns whether DAY is valid. */
    private boolean validDay(int day) {
        return (1 <= day && day <= MAX_DAY);
    }
    
    /**
     * Adds a REMINDER to today's date.
     */
    private void addActivity(Activity reminder) {
    
    }
}
