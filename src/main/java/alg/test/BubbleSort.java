package alg.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 2018-1-25 18:23 by 李浩（lihao@cloud-young.com）创建
 */
public class BubbleSort {
    public static int[] array = {1, 23, 4, 5, 67, 8, 79, 8, 7, 6, 55, 4, 34, 5, 6, 87, 6, 53};

    public static void sort() {
        int count = 1;
        while (count < array.length) {
            for (int i = 0; i < array.length - count; i++) {
                int temp = array[i + 1];
                if (array[i] > array[i + 1]) {
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            count++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
            System.out.println(i);
        }
    }
}
