package hw7_oop;

public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return lenghtS(a, b) + lenghtS(b, c) + lenghtS(c, a);
    }

    @Override
    public double getFigureSpace() {
        double p = getPerimetr() / 2;
        return Math.sqrt(p * (p - lenghtS(a, b)) * (p - lenghtS(b, c)) * (p - lenghtS(c, a)));
    }

    @Override
    public boolean isTreangle() {
        return true;
    }

    @Override
    public String toString() {
        return "Triangle " + "A = " + a + ", B = " + b + ", C = " + c;
    }
}
