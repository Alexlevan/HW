package hw2;
import java.util.Scanner;

/**
 * Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
 * Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
 * Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 * Не использовать массивы!
 */

public class HW_2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число дней");
        while (!scanner.hasNextInt()) {
            System.out.println("введено некорректное значение. Введите число дней N");
            scanner.next();
        }

        int number = scanner.nextInt();

        int b;
        int summ = 0;
        int max = 0;
        for (int a = 0; a < number; a++) {

            System.out.println("Введите количество осадков в " + (a + 1) + " день");

            while (!scanner.hasNextInt()) {
                System.out.println("введено некорректное значение. Введите количество осадков в " + (a + 1) + " день");
                scanner.next();}
            b = scanner.nextInt();
            summ = summ + b;
            if (max < b) max = b;

        }
        System.out.println("Количество дней равно: " + number);
        System.out.println("Сумма осадков за " + number + " дней равно: " + summ);
        System.out.println("Среднее количество осадков за " + number + " дней равно: " + (summ/number));
        System.out.println("Максимальное количество осадков за " + number + " дней равно: " + max);
    }
}
