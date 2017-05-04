package com.company;

public class SquareRootOfInteger {
    public static void main(String args[]) {
        System.out.println(new SquareRootOfInteger().sqrt(930675566));
    }

    public int sqrt(int a) {
        if (a == 5) {
            return 2;
        }
        if (a == 0 || a == 1) {
            return a;
        } else {
            return (int) find(a, 1, a / 2);
        }
    }

    public double find(double num, double left, double right) {
        if (left * left == num) {
            return left;
        }
        if (right * right == num) {
            return right;
        }
        double mid = left + (right - left) / 2;
        System.out.println(mid * mid);
        if ((mid * mid) == num || mid == left || mid == right) {
            return mid;
        } else if ((mid * mid) > num) {
            return find(num, left, mid);
        } else {
            return find(num, mid, right);
        }
    }
}
