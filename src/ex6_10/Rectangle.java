package ex6_10;

public class Rectangle extends FiguraGeometrica {
    protected double base;
    protected double altura;

    public Rectangle(double x, double y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    
    public double area() {
        return base * altura;
    }
    
    public double perimetre() {
        return 2 * (base + altura);
    }
}