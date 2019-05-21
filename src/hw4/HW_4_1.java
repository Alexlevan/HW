package hw4;

import java.util.Scanner;

/**
 * Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
 */

public class HW_4_1 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите строку");
            String src = sc.nextLine();
            System.out.println(isPolindrom(src));
        }
        private static boolean isPolindrom(String src) {
            int n = src.length();
            boolean result = true;
            for (int i = 0; i < (n / 2); i++) {
                if (src.charAt(i) != src.charAt(n - i - 1)) {
                    result = false;
                    break;
                }
            }
            return result;
    }
}
