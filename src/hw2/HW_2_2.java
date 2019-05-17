package hw2;

import java.util.Scanner;

/**
 *Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
 * Решить двумя способами:
 * с помощью цикла
 * с помощью рекурсии.
 */

public class HW_2_2 {
    public static void main(String[] args) {
        long first = 0;
        long next = 1;
        long stream;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();


        for (int i = 0; first < a; i++) {
            stream = first;
            first =  first + next;
            next = stream;
            System.out.println(stream);
        }
    }
}
