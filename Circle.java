package Figs;

public class Circle {
    private static final double pi = Math.PI;
    private final double d;

    //CONSTRUCTOR
    public Circle(double d) {
        this.d = d;
    }

    public double area() {
        double r = d / 2;
        return pi * r * r;
    }
}
