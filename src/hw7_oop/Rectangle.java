package hw7_oop;

public class Rectangle extends Shape implements Diagonals {

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public boolean isRectangle() {
        return true;
    }

    @Override
    public double fstDiag() {
        return lenghtS(a, c);
    }

    @Override
    public double secDiag() {
        return lenghtS(b, d);
    }

    @Override
    public double getFigureSpace() {
        return lenghtS(a, b) * lenghtS(c, d);
    }

    @Override
    public double getPerimetr() {
        return (lenghtS(a, b) + lenghtS(c, d)) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle " + "A = " + a + ", B = " + b + ", C = " + c + ", D = " + d;
    }
}
