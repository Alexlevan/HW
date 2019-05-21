package hw4;

import java.util.Scanner;

/**
 * Написать программу, преобразующую строку, содержащую число в римском формате, в число в арабском формате.
 * Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ идёт перед большим.
 */

public class HW_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите римское число");
        String src = sc.nextLine();
        System.out.println(checkNum(src));
    }
    public static int checkNum(String src) {
        int number = 0;
        String f = " ";
        src = src + f;
        int t = src.length();
        for (int i = 0; i < t - 1; ++i) {

            if ((findNumber(src.charAt(i)) < findNumber(src.charAt(i + 1)))) {
                number += findNumber(src.charAt(i + 1)) - findNumber(src.charAt(i));
                i++;

            } else {
                number += findNumber(src.charAt(i));
            }
        }
        return number;

    }

    public static int findNumber(char a) {
        int dec = 0;
        switch (a) {
            case 'M':
                dec += 1000;
                break;

            case 'D':
                dec += 500;
                break;

            case 'C':
                dec += 100;
                break;

            case 'L':
                dec += 50;
                break;

            case 'X':
                dec += 10;
                break;

            case 'V':
                dec += 5;
                break;

            case 'I':
                dec += 1;
                break;
            case ' ':
                dec += 0;
        }
        return dec;
    }
}
