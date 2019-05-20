package hw3;

/**
 * Написать программу, принимающую массив целых чисел, в котором м.б. повторения,
 * и возвращающую новый массив без повторяющихся числел, и печатающую результат.
 * В результирующем массиве не должно быть дубликатов.
 */
import java.util.Arrays;

public class HW_3_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 5, 1, 6, 2};
        boolean[] mask = new boolean[array.length];

        System.out.println(Arrays.toString(cleanArray(array, mask)));
    }

    static int[] cleanArray(int[] array, boolean[] hide) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (!hide[i]) {
                int temp = array[i];
                for (int a = i + 1; a < array.length; a++) {
                    if (temp == array[a]) {
                        hide[a] = true;
                        count++;
                    }
                }
            }
        }
        int[] newArray = new int[array.length - count];
        for (int i = 0, a = 0; i < array.length; i++) {
            if (!hide[i]) {
                newArray[a++] = array[i];
            }
        }
        return newArray;
    }

}
