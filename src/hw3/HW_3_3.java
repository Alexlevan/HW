package hw3;

/**
 * аданы 2 массива целых чисел произвольной длины.
 * Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных.
 */

public class HW_3_3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8};
        int j = 0, k = 0;
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < c.length; i++) {

            if (j < a.length && k < b.length) {

                if (b[k] < a[j]) {
                    c[i] = b[k];
                    k++;
                } else {
                    c[i] = a[j];
                    j++;
                }
            } else if (k < b.length) {
                c[i] = b[k];
                k++;
            } else {
                c[i] = a[j];
                j++;
            }
        }

        for (int i = 0; i < c.length; i++)
            System.out.print(c[i]);
    }
}
