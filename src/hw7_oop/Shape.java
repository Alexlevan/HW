package hw7_oop;


public abstract class Shape {

    public double lenghtS(Point point2, Point point1) {
        return Math.sqrt((Math.pow(point2.getX() - point1.getX(), 2)) + ((Math.pow(point2.getY() - point1.getY(), 2))));
    }

    public boolean isRectangle() {
        return false;
    }

    public boolean isTreangle() {
        return false;
    }

    public abstract double getPerimetr();

    public abstract double getFigureSpace();
}
