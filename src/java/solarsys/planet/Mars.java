package solarsys.planet;

import unitsys.angle.Revolution;

public class Mars {

    public static double meanAnomalyOfMars(double daysFromEpoc) {
        return Revolution.toRadius(.053856 + .00145561327 * daysFromEpoc);
    }

}
