package com.company;

import java.util.Arrays;
import java.util.List;


public class SingleNumberII {

    public static void main(String args[]) {

        System.out.println(new SingleNumberII().singleNumber(Arrays.asList(890, 992, 890, 172, 890, 479, 992, 172, 992, 172)));
    }

    public int singleNumber(final List<Integer> a) {

        if (a.size() == 1) {
            return a.get(0);
        }
        int sum = 0;

        for (int j = 0; j < Integer.BYTES * 8; j++) {
            int ones = 0;

            int x = 1 << j;
            for (Integer num : a) {
                if ((x & num) != 0) {
                    ones++;
                }
            }

            if (ones % 3 == 1) {
                sum |= x;
            }

        }

        return sum;
    }
}
