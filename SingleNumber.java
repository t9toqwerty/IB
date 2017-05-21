/**
 * Problem Statement :
 */

package com.company;

import java.util.Arrays;
import java.util.List;

public class SingleNumber {
    public static void main(String args[]) {
        System.out.println(new SingleNumber().singleNumber(Arrays.asList(1)));
    }

    public int singleNumber(final List<Integer> a) {
        int result = 0;
        if (a.size()==1){
            return a.get(0);
        }
        for (int i = 0; i < a.size() - 1; i++) {
            if (i == 0) {
                result = a.get(i) ^ a.get(i + 1);
            } else {
                result = result ^ a.get(i + 1);
            }
        }
        return result;
    }
}
