package ex6_10;

public class Rombe extends FiguraGeometrica {
    protected double diagonalMajor;
    protected double diagonalMenor;

    public Rombe(double x, double y, double diagonalMajor, double diagonalMinor) {
        super(x, y);
        this.diagonalMajor = diagonalMajor;
        this.diagonalMenor = diagonalMinor;
    }

    public double area() {
        return (diagonalMajor * diagonalMenor) / 2;
    }

    public double perimetre() {
        return 4 * Math.sqrt((Math.pow(diagonalMajor / 2, 2) + Math.pow(diagonalMenor / 2, 2)));
    }
}