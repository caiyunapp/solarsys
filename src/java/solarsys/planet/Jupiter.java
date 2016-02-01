package solarsys.planet;

import unitsys.angle.Revolution;

public class Jupiter {

    public static double meanAnomalyOfJupiter(double daysFromEpoc) {
        return Revolution.toRadius(.056531 + .00023080893 * daysFromEpoc);
    }

}
