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
    	switch(month) {
     		case 1: days_31(); break;
     		case 2: feb(); break;
     		case 3: days_31(); break;
     		case 4: days_30(); break;
     		case 5: days_31(); break;
     		case 6: days_30(); break;
     		case 7: days_31(); break;
     		case 8: days_31(); break;
     		case 9: days_30(); break;
     		case 10: days_31(); break;
     		case 11: days_30(); break;
     		case 12: days_31(); break;
     		default: throw new IllegalArgumentException("Month is out of range.");
    	}
    }

    /** Returns whether*/
    public boolean validMonth(int month) {
        // TODO: Current month checker
        return (month >= 1 && month <= 12);
    }
    /* Helper methods */
    /* 31-day helper method */
    public void days_31() {
    	for (int i = 1; i < 32; i++) 
            Day_ls.add(new Day(i));
    }
    /* 30-day helper method */
    public void days_30() {
    	for (int i = 1; i < 31; i++)
            Day_ls.add(new Day(i));
    }
    /* February helper method */
    public void feb() {
    	int year = Calendar.getInstance().get(Calendar.YEAR); //get current year as an int
    	if (year % 4 == 0) {
    		for (int i = 1; i < 30; i++)	//leap years (29 days in Feb)
                Day_ls.add(new Day(i));
    	} else {
    		for (int i = 1; i < 29; i++)	//other years (28 days in Feb)
                Day_ls.add(new Day(i));
    	}
    }
}
