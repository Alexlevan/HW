package hw11_exceptions;

/**
 * 1.Напишите метод public List<Double> readValues() throws ..., читающий числа с плавающей точкой из ввода консоли,
 * через Scanner. Сгенерируйте подходящие исключения, если ввод если введены данные,
 * не относящиеся к числам с плавающей точкой. Ввод:
 * 1 2 3 4 aaaa
 * 2.Напишите метод public double sumOfValues() throws ..., вызывающий метод из предыдущего упражнения и
 * возвращающий сумму введеных значений в разных строках.
 * Организуйте распространение любых исключений вызывающему коду. Ввод:
 * 1 2 3 4
 * 2 3 4 aaa
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DotReader {

    public static List<Double> readValues() throws NumberFormatException{
        List<Double> listDoubls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try {
            while ((i < 2) && (sc.hasNext())) {
                listDoubls.add(sc.nextDouble());
                i++;
            }
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

        return listDoubls;
    }

    public static double sumOfValues(List<Double> listDoubls) throws NumberFormatException {
        double sum = 0;
        for (Double number  : listDoubls) {
            sum += number;
        }

        return sum;
    }
}
