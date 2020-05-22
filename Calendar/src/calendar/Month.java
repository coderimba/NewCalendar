package calendar;

import java.util.ArrayList;

/** A collection of dates in the month. */
public class Month {
    /** Possible months. */
    private enum PossibleMonths {
        JAN, FEB, MAR, APR, MAY, JUN,
        JUL, AUG, SEP, OCT, NOV, DEC
    }
    
    /** Number of dates in each month. */
    private static int numDays[] = {31, 28, 31, 30, 31, 30,
                                    31, 31, 30, 31, 30, 31};
    
    /** Current month. */
    private PossibleMonths _currentMonth;
    
    /**
     * ArrayList of <code>Day</code> objects much like a physical calendar.
     */
    protected ArrayList<Day> dayLst;
    
    /**
     * Constructor which takes in the month number to initialize the Month
     * object.
     *
     * @param month The one-indexed month in which the constructor is called
     * @throws IllegalArgumentException if 1-indexed month is out of range
     */
    public Month(int month) throws IllegalArgumentException {
        // TODO: Constructs an object with all days in the month initialized.
        if (!validMonth(month)) {
            throw new IllegalArgumentException("Month is out of range.");
        }
        dayLst = new ArrayList<Day>(numDays[month - 1]);
        _currentMonth = PossibleMonths.values()[month - 1];
    }
    
    /** Returns whether the 1-indexed MONTH is valid */
    private boolean validMonth(int month) {
        return (month >= 1 && month <= numDays.length);
    }
    
    @Override
    public String toString() {
        // TODO: Find out best format for expressing month as a string, if
        //       at all needed.
        return "";
    }
}
