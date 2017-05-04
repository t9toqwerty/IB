package com.company;

import java.util.Arrays;
import java.util.List;

public class MaxSubarray {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList( -163, -20 );
        MaxSubarray m = new MaxSubarray();
        System.out.print(m.maxSubArray(list));
    }

    /**
     * @return Integer
     */
    private Integer maxSubArray(final List<Integer> a) {
        int maxSum = a.get(0);
        int overAllMax = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            int i1 = maxSum + a.get(i);
            if (i1 > a.get(i)) {
                maxSum = i1;
            } else {
                maxSum = a.get(i);
            }

            if (overAllMax < maxSum) {
                overAllMax = maxSum;
            }
        }
        return overAllMax;
    }
}
