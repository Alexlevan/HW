package hw5_oop;

/**
 * Методы в классе Rectangle:
 * - Высчитывающий длину диагонали.
 */

public class Rectangle implements FigureSpace {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    public double diagonalLength(){
        return lenghtS(getPointA(), getPointC());
    }

    private double lenghtS (Point point1, Point point2){
        return Math.sqrt((Math.pow(point1.getX() - point2.getX(), 2)) + ((Math.pow(point1.getY() - point2.getY(), 2))));
    }

    @Override
    public double space() {
        return lenghtS(getPointA(), getPointB()) * lenghtS(getPointB(), getPointC());
    }
}
