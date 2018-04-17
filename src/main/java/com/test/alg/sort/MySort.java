package com.test.alg.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 2018-4-17 15:04 by 李浩（lihao@cloud-young.com）创建
 */
public class MySort {
    public static void main(String[] args) {
        sort1();
        bubble();
    }

    public static void sort1() {
        List<Integer> source = Source.sourceList;
        List<Integer> result = new ArrayList<Integer>();

        while (source.size() > 0) {
            int mini = source.get(0);
            int index = 0;
            for (int i = 1; i < source.size(); i++) {
                if (source.get(i) < mini) {
                    mini = source.get(i);
                    index = i;
                }
            }
            source.remove(index);
            result.add(mini);
        }
        System.out.println(result);
    }

    public static void bubble() {
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
