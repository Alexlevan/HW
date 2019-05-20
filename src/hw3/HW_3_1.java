package hw3;

/**Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится самым первым его элементом.
 */
import java.util.Arrays;

public class HW_3_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 15, 25, 34, 55, 60, 12, 30};

        for (int i = 0; i < array.length - 1; i++) {

            swap(array, i, i + 1);
        }

        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int fst, int snd) {
        int tmp = array[fst];
        array[fst] = array[snd];
        array[snd] = tmp;
    }
}