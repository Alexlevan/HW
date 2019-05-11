package hw2;

import java.util.Scanner;

public class HW_2_1 {
    public static void main(String[] args) {
        int n;
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        n = sc.nextInt();
        while (n > 0) {
            a += n % 10;
            n /= 10;
        }
        System.out.println("Сумма цифр числа равна " + a);
    }
}
