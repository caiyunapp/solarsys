package unitsys.angle;


public class Revolution {

    public static double PI            = Math.PI;
    public static double rightAngle    = 0.25d;
    public static double straightAngle = 0.5d;
    public static double perigonAngle  = 1d;

    public static double fromRadius(double radius) {
        return radius / PI / 2;
    }

    public static double toRadius(double revol) {
        return revol * PI * 2;
    }

    public static double compl(double angle) {
        return rightAngle - angle;
    }

    public static double suppl(double angle) {
        return straightAngle - angle;
    }

    public static double expl(double angle) {
        return perigonAngle - angle;
    }

    public static double principle(double angle) {
        return (straightAngle + angle) % perigonAngle - straightAngle;
    }

    public static double remainder(double angle) {
        return angle % perigonAngle;
    }

    public static double sin(double revol) {
        return Math.sin(toRadius(revol));
    }

    public static double cos(double revol) {
        return Math.cos(toRadius(revol));
    }

    public static double tan(double revol) {
        return Math.tan(toRadius(revol));
    }

    public static double sinh(double revol) {
        return Math.sinh(toRadius(revol));
    }

    public static double cosh(double revol) {
        return Math.cosh(toRadius(revol));
    }

    public static double tanh(double revol) {
        return Math.tanh(toRadius(revol));
    }

    public static double asin(double value) {
        return fromRadius(Math.asin(value));
    }

    public static double acos(double value) {
        return fromRadius(Math.acos(value));
    }

    public static double atan(double value) {
        return fromRadius(Math.atan(value));
    }

    public static String show(String kind) {
        return "";
    }

}
