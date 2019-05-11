package hw1;

import java.util.Scanner;
import java.lang.Math;

public class HW_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Введите a исходя из того, что ax^2 + bx + c = 0 : ");
        a = sc.nextDouble();
        System.out.println("Введите b исходя из того, что ax^2 + bx + c = 0 : ");
        b = sc.nextDouble();
        System.out.println("Введите c исходя из того, что ax^2 + bx + c = 0 : ");
        c = sc.nextDouble();

        double discriminant = discriminant(a, b, c);

        if (!isPositive(discriminant)) {
            System.out.println("Дискриминант отрицательный, корней нет");
        } else if (isZero(discriminant)) {
            System.out.println("Дискриминант равен 0, корень уравнения равен " + -b / 2 * a);
        } else if (isPositive(discriminant) && !isZero(discriminant)){
            System.out.println("Дискриминант больше 0, корень x1 равен " + (-b - Math.sqrt(discriminant)) / 2 * a
                    + ", корень x2 равен " + (-b + Math.sqrt(discriminant)) / 2 * a);
        }

    }

    private static boolean isPositive(double number) {
        return number >= 0;
    }

    private static boolean isZero (double number) {
        return number == 0;
    }

    private static double discriminant (double numberA, double numberB, double numberC) {
        return numberB * numberB - (4 * numberA * numberC);
    }
}
