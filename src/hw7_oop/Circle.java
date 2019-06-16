package hw7_oop;

public class Circle extends Shape {

    private Point a;
    private Point b;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getFigureSpace() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }
    @Override
    public double getPerimetr() {
        return 2 * Math.PI * getRadius();
    }

    public double getRadius() {
        return lenghtS(a, b);
    }

    @Override
    public String toString() {
        return "Circle " + "A = " + a + ", B = " + b;
    }
}
