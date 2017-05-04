package com.company;

import java.util.Arrays;
import java.util.List;

public class HammingCode {

    public static void main(String args[]) {
        List<Integer> ip = Arrays.asList(2, 4, 6);
        HammingCode hc = new HammingCode();
        System.out.print(hc.hammingDistance(ip));
    }

    public int hammingDistance(final List<Integer> A) {
        int op = 0;
        for (int i = 0; i < 32; i++) {
            int one;
            for (int j = 0; j < A.size(); j++) {

            }
        }
        return 2 * op;
    }

    public int getSetBits(int num) {
        int sb = 0;
        while (num != 0) {
            num = num & (num - 1);
            sb++;
        }
        return sb;
    }

}
