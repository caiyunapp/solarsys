package astro.dynamics;

/**
 *  See https://en.wikipedia.org/wiki/Orbital_elements
 */
public interface KeplerianOrbit {

    /**
     *  Shape of the ellipse, describing how much it is elongated compared to a circle.
     */
    public double eccentricity();

    /**
     *  The sum of the periapsis and apoapsis distances divided by two.
     *  For circular orbits, the semimajor axis is the distance between the centers of the bodies,
     *  not the distance of the bodies from the center of mass.
     */
    public double semimajorAxis();

    /**
     *   Vertical tilt of the ellipse with respect to the reference plane,
     *   measured at the ascending node (where the orbit passes upward through the reference plane)
     */
    public double inclination(double epoch);

    /**
     *  Horizontally orients the ascending node of the ellipse (where the orbit passes upward through the reference plane)
     *  with respect to the reference frame's vernal point
     */
    public double longitudeOfAscendingNode(double epoch);

    /**
     *  The orientation of the ellipse in the orbital plane, as an angle measured from the ascending node to the periapsis
     *  (the closest point the second body comes to the first during an orbit)
     */
    public double argumentOfPeriapsis(double epoch);

    /**
     *  The position of the orbiting body along the ellipse at a specific time
     */
    public double meanAnomaly(double epoch);

}
