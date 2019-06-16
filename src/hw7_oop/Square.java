package hw7_oop;

public class Square extends Rectangle{

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Square " + "A = " + a + ", B = " + b + ", C = " + c + ", D = " + d;
    }

    @Override
    public double getPerimetr() {
        return lenghtS(a, b) * 4;
    }

    @Override
    public double fstDiag() {
        return lenghtS(a, c);
    }

    @Override
    public double secDiag() {
        return lenghtS(b, d);
    }
}
