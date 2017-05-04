package com.company;


public class Gcd {
    public static void main(String args[]) {
        System.out.println(new Gcd().gcd(9, 3));
    }

    public int gcd(int a, int b) {
        if (b < 0) {
            b = -b;
        }
        if (a < 0) {
            a = -a;
        }
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a > b) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }
        if (b % a == 0) {
            return a;
        }
        return gcd(a, b % a);
    }
}
