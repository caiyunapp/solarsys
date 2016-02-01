package astro.dynamics;

import astro.coord.EquatorialSystem;

public class Calculator {

    public static EquatorialSystem.Position calculatePosition(double meanLongitude, double U, double V, double W) {
        double S = W / Math.sqrt(U - V * V);
        double rightAscention = meanLongitude + Math.asin(S);
        double declination = Math.asin(V / Math.sqrt(U));
        return new EquatorialSystem.Position(rightAscention, declination);
    }

    public static EquatorialSystem.Position ensureSecondAscentionGreater(EquatorialSystem.Position first, EquatorialSystem.Position second) {
        if (second.rightAscention < first.rightAscention) {
            double ascention = second.rightAscention + 2 * Math.PI;
            second = new EquatorialSystem.Position(ascention, second.declination);
        }

        return second;
    }

}
