package com.test.alg.sort;


import com.google.common.io.Resources;
import org.apache.commons.lang.StringUtils;

import java.io.*;
import java.util.*;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 2018-4-17 15:05 by 李浩（lihao@cloud-young.com）创建
 */
public class Source {
    public static int[] source;
    public static List<Integer> sourceList = new LinkedList<Integer>();

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(Source.class.getClassLoader().getResource("code.txt").getFile());

        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file))) {
            for (int i = 0; i < 100; i++) {
                Random random = new Random();
                int result = random.nextInt(10000);
                outputStreamWriter.write(String.valueOf(result) + ",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static {
        File file = new File(Source.class.getClassLoader().getResource("code.txt").getFile());
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
                String line = bufferedReader.readLine();
                while (StringUtils.isNotEmpty(line)) {
                    String[] result = line.split(",");
                    for (String item : result) {
                        if (StringUtils.isNotEmpty(item)) {
                            try {
                                int value = Integer.parseInt(item);
                                sourceList.add(value);
                            } catch (Exception err) {

                            }
                        }
                    }
                    line = bufferedReader.readLine();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        source = new int[sourceList.size()];
        for (int i = 0; i < sourceList.size(); i++) {
            source[i] = sourceList.get(i);
        }
    }
}
