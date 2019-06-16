package hw7_oop;

public class Rhombus extends Square{

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rhombus(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Rhombus " + "A = " + a + ", B = " + b + ", C = " + c + ", B = " + d;
    }

    @Override
    public double getFigureSpace() {
        return (fstDiag() * secDiag()) / 2;
    }
}
