package hw5_oop;

/**
 * Методы в классе Circle:
 * - Высчитывающий длину окружности. У обоих классов должен быть метод нахождения площади.
 */

public class Circle implements FigureSpace {

    private Point a;
    private double b;

    public Circle(Point a, double b) {
        this.a = a;
        this.b = b;
    }

    public double circleRadius() {
        return 2 * b * Math.PI;
    }

    public Point getA() {
        return a;

    }

    public void setA(Point a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double space() {
        return Math.pow(b, 2) * Math.PI;
    }
}
