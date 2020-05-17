package calendar;

import java.util.*;
import java.lang.*;

/** A collection of dates in the month. */
public class Month {
    /** Possible months. */
    private enum PossibleMonths {JAN, FEB, MAR, APR, MAY, JUN,
        JUL, AUG, SEP, OCT, NOV, DEC};

    /** Current month. */
    private PossibleMonths _currentMonth;

    /** ArrayList of Days */
    private ArrayList<Day> Day_ls;

    /** Takes in current month's NUMBER. */
    public Month(int month) {
        // TODO: Constructs an object with all days in the month initialized.
     if (!validMonth(month)) {
         throw new IllegalArgumentException("Month is out of range.");
     } else if (month % 2 == 0) {
         for (int i = 1; i < 32; i++) {
            Day_ls.add(new Day(i));
         }
     } else {
         for (int i = 1; i< 31; i++) {
            Day_ls.add(new Day(i));
         }
     } 
    }

    /** Returns whether*/
    private boolean validMonth(int month) {
        // TODO: Current month checker
        return (month >= 1 && month <= 12);
    }
}
