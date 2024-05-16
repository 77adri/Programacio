package ex6_10;

public class Cercle extends FiguraGeometrica {
    protected double radi;

    public Cercle(double x, double y, double radi) {
        super(x, y);
        this.radi = radi;
    }

    public double area() {
        return Math.PI * radi * radi;
    }

    public double perimetre() {
        return 2 * Math.PI * radi;
    }
}