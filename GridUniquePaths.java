package com.company;


public class GridUniquePaths {
    public static void main(String args[]) {
        System.out.println(new GridUniquePaths().uniquePaths(1, 3000));
    }

    public long uniquePaths(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int totalSteps = a + b - 2;
        long ways = 1;
        int i = totalSteps;
        while (i > a - 1) {
            ways *= i;
            i--;
        }
        int j = b - 1;
        while (j > 0) {
            ways /= j;
            j--;
        }
        return ways;
    }
}
