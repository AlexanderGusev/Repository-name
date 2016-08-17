/**
 * Created by Stas on 6/22/2016.
 */
public class Circle implements Figure {
    private static final String printVar = "This is circle, please enter radius";

    private double radius;

    public static String getPrintVar() {
        return printVar;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
