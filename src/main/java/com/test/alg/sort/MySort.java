package com.test.alg.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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
//        sort1();
//        bubble();
        insertSort();
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

    public static void insertSort() {
        List<Integer> result = new LinkedList<>();
        int[] source = Source.source;

        for (int item : source) {
            if (result.isEmpty()) {
                result.add(item);
                continue;
            }
            if (item <= result.get(0)) {
                result.add(0, item);
                continue;
            }
            if (item >= result.get(result.size() - 1)) {
                result.add(item);
                continue;
            }
            int index = res(item, result.size() / 2, result);
            result.add(index, item);
        }
        System.out.println(result);
    }

    public static int res(int value, int index, List<Integer> list) {
        int value1 = list.get(index - 1);
        int value2 = list.get(index);
        if (value > value1 && value < value2) {
            return index;
        }
        if (value == value1)
            return index - 1;
        if (value == value2)
            return index;

        if (value < value1) {
            return res(value, index / 2, list);
        }
        if (value > value2) {
            return res(value, index + (list.size() - index) / 2, list);
        } else {
            return -1;
        }
    }
}
