package time.calendar;

import math.Functions;

public class Julian {

    public static int julianDays(int year, int month, int day) {
        int jd = -1 * (int) (7 * (((month + 9) / 12) + year) / 4);

        int offset = 0;
        boolean after1583 = year >= 1583;
        if (after1583) {
            int S = Functions.sgn(month - 9);
            int A = Math.abs(month - 9);

            offset = year + S * (A / 7);
            offset = -1 * ((offset / 100) + 1) * 3 / 4;
        }

        jd = jd + (275 * month / 9) + day + offset;
        jd = jd + 1721027 + (after1583 ? 2 : 0) + 367 * year;

        jd--; // truncate

        return jd;
    }

}
