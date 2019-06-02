package hw5_oop;

public class TestPoint {
    public static void main(String[] args) {

        Point pointA = new Point(5.2, 2.7);
        Point pointB = new Point(3, 7);
        Point pointC = new Point(4, 8);
        Point pointD = new Point(5, 9);

        System.out.println("Distance " + pointA.distance(pointB));

        Point pointE = new Point(4, 2);
        pointE.translate(0.5, 3);
        pointE.scale(1);

        System.out.println(pointE);

        Rectangle rec = new Rectangle(pointA, pointB, pointC, pointD);
        System.out.println(rec.diagonalLength());
        System.out.println(rec.space());


        FigureSpace circle = new Circle (pointC, 20);
            Point C = new Point(6, 6);
            System.out.println(circle.space());

    }
}
