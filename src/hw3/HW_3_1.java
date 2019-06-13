package hw3;

/**Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится самым первым его элементом.
 */
import java.util.Arrays;

public class HW_3_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 15, 25, 34, 55, 60, 12, 30};
        trade(array);
        System.out.println(Arrays.toString(array));
        }

    public static void trade(int[] array) {
        int a = array.length;
        if (a <= 1) {
            return;
        }
        int lastItem= array[a - 1];
        for (int i = a - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastItem;
    }
}