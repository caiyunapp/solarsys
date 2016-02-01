package unitsys.angle;


public class EarthHour {

    public static double PI            = Math.PI;
    public static double rightAngle    = 6d;
    public static double straightAngle = 12d;
    public static double perigonAngle  = 24d;

    public static double fromRadius(double radius) {
        return radius / PI * 12;
    }

    public static double toRadius(double hour) {
        return hour * PI / 12;
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

    public static double sin(double hour) {
        return Math.sin(toRadius(hour));
    }

    public static double cos(double hour) {
        return Math.cos(toRadius(hour));
    }

    public static double tan(double hour) {
        return Math.tan(toRadius(hour));
    }

    public static double sinh(double hour) {
        return Math.sinh(toRadius(hour));
    }

    public static double cosh(double hour) {
        return Math.cosh(toRadius(hour));
    }

    public static double tanh(double hour) {
        return Math.tanh(toRadius(hour));
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
