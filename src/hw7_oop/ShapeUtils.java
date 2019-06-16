package hw7_oop;

final public class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isRectangle(Shape shape) {
        return shape instanceof Rectangle;
    }

    public static boolean isTriangle(Shape shape) {
        return shape instanceof Triangle;
    }
}
