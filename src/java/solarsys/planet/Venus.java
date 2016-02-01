package solarsys.planet;

import static math.Functions.revolutionToRadian;

public class Venus {

    public static double meanAnomalyOfVenus(double daysFromEpoc) {
        return revolutionToRadian(.140023 + .00445036173 * daysFromEpoc);
    }

    public static double meanLongitudeOfVenus(double daysFromEpoc) {
        return revolutionToRadian(0.505498 + .00445046867 * daysFromEpoc);
    }

}
