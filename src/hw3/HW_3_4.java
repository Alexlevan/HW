package hw3;

/**
 * Написать функцию linearize, которая принимает в качестве параметра двумерный массив и возвращает
 * одномерный массив со всеми элементами двумерного.
 */
import java.util.Arrays;

public class HW_3_4 {
        public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.toString(linearize(arr)));
    }

    static int count = 0;
    static int nextCount = 0;
    static int[] linearize(int[][] a) {
        int size = a.length;
        for(int i = 0; i < size; i++){
            count += a[i].length;
        }

        int[] newArr = new int[count];
        for(int b = 0; b < size; b++) {
            if(b == 0) {
                System.arraycopy(a[0], 0, newArr, 0, a[0].length);
                nextCount = a[0].length;
                continue;
            }

            System.arraycopy(a[b], 0, newArr, nextCount, a[b].length);
            nextCount += a[b].length;
        }

        return newArr;
    }

}
