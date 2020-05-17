package calendar;

import calendar.Day;

import java.util.Arraylist;

/** A collection of dates in the month. */
public class Month {
    /** Possible months. */
    private enum PossibleMonths {
        JAN, FEB, MAR, APR, MAY, JUN,
        JUL, AUG, SEP, OCT, NOV, DEC
    };
    
    /** Number of dates in each month. */
    private static int NumDays[] = {31, 28, 31, 30, 31, 30,
                                    31, 31, 30, 31, 30, 31};
    
    /** Current month. */
    private PossibleMonths _currentMonth;
    
    /** ArrayList of Days */
    protected ArrayList<Day> dayLst;
    
    /**
     * Takes in current month's number.
     *
     * @param month The one-indexed month in which the constructor is called
     */
    public Month(int month) {
        // TODO: Constructs an object with all days in the month initialized.
        if (!validMonth(month)) {
            throw new IllegalArgumentException("Month is out of range.");
        }
        dayLst = new ArrayList<Day>(NumDays[month - 1]);
        _currentMonth = PossibleMonths.values()[month - 1];
    }
    
    /** Returns whether the month is valid */
    private boolean validMonth(int month) {
        // TODO: Current month checker
        return (month >= 1 && month <= 12);
    }
}
