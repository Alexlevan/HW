package hw2;

import java.util.Scanner;

public class HW_2_2 {
    public static void main(String[] args) {
        long first = 1;
        long next = 1;
        long stream;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();

        System.out.println(first);
        System.out.println(next);

        for (int i = 2; i <= a; i++) {
            stream = first + next;
            first = next;
            next = stream;
            System.out.println(stream);
        }
    }
}
