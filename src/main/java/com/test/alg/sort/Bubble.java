package com.test.alg.sort;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 2018-4-17 14:59 by 李浩（lihao@cloud-young.com）创建
 */
public class Bubble {
    public static void main(String[] args) {
        sort();
    }

    public static void sort() {

        int[] source = Source.source;

        int count = 1;
        while (Source.source.length - count > 0) {
            for (int i = 0; i < Source.source.length - count; i++) {
                if (source[i] > source[i + 1]) {
                    int temp = source[i];
                    source[i] = source[i + 1];
                    source[i + 1] = temp;

                }
            }
            count++;
        }
        for (int i : source) {
            System.out.println(i);
        }

    }
}
