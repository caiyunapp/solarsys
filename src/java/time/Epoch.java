package time;


import time.calendar.Julian;

public class Epoch {

    public static final int NEW_STANDARD_EPOCH = 2451545; // January 1, 2000 at noon
    public static final int NUM_DAYS_IN_CENTURY = 36525; // 365 days * 100 years + 25 extra days for leap years

    public static double daysFromEpoch(int year, int month, int day) {
        return Julian.julianDays(year, month, day) - NEW_STANDARD_EPOCH + 0.5;
    }

}
