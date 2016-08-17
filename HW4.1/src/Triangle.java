/**
 * Created by Stas on 6/22/2016.
 */
public class Triangle implements Figure {
    private static final String printVar = "This is triangle, please enter height and width";
    private double hight;
    private double width;

    public static String getPrintVar() {
        return printVar;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
