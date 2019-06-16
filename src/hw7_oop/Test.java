package hw7_oop;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(8, 8), new Point(7, 7));
        Square square = new Square(new Point(1, 1), new Point(1, 3), new Point(5, 6), new Point(2, 1));
        Rectangle rectangle = new Rectangle(new Point(1, 1), new Point(1, 3), new Point(4, 3), new Point(4, 1));
        Rhombus rhombus = new Rhombus(new Point(1, 1), new Point(2, 4), new Point(6, 2), new Point(3, 1));
        Triangle triangle = new Triangle(new Point(1, 1), new Point(1, 3), new Point(6, 3));

        System.out.println("Проверка методов для круга");
        System.out.println("Периметр " + circle.getPerimetr());
        System.out.println("Площадь " + circle.getFigureSpace());
        System.out.println("Радиус " + circle.getRadius());
        System.out.println(square);
        System.out.println();

        System.out.println("Проверка методов для квадрата");
        System.out.println("Периметр " + square.getPerimetr());
        System.out.println("Площадь " + square.getFigureSpace());
        System.out.println("Диагональ " + square.fstDiag());
        System.out.println(square);
        System.out.println();

        System.out.println("Проверка методов для прямоугольника");
        System.out.println("Периметр " + rectangle.getPerimetr());
        System.out.println("Площадь " + rectangle.getFigureSpace());
        System.out.println("Диагональ " + rectangle.fstDiag());
        System.out.println(rectangle);
        System.out.println();

        System.out.println("Проверка методов для ромба");
        System.out.println("Периметр " + rhombus.getPerimetr());
        System.out.println("Площадь" + rhombus.getFigureSpace());
        System.out.println("Первая диагональ " + rhombus.fstDiag());
        System.out.println("Вторая диагональ " + rhombus.secDiag());
        System.out.println(rhombus);
        System.out.println();

        System.out.println("Проверка методов для треугольника");
        System.out.println("Периметр " + triangle.getPerimetr());
        System.out.println("Площадь " + triangle.getFigureSpace());
        System.out.println(triangle);
        System.out.println();

        System.out.println("Проверка является ли данная фигура треугольником или прямоугольником");
        System.out.println(triangle.isTreangle());
        System.out.println(circle.isTreangle());
        System.out.println(rectangle.isTreangle());
        System.out.println(rectangle.isRectangle());
        System.out.println();
    }
}
