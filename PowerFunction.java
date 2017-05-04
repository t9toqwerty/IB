package com.company;


public class PowerFunction {
    public static void main(String args[]) {
        System.out.println(new PowerFunction().pow(79161127, 99046373, 57263970));
    }

    public int pow(int x, int n, int d) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (x < 0) {
            while (x < 0) {
                x += d;
            }
            return calculate(x, n, d);
        }
        return calculate(x, n, d);
    }

    private int calculate(int x, int n, int d) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x % d;
        }
        long temp = ((x % d) * (x % d)) % d;
        if (n % 2 == 0) {
            return pow((int)temp, n / 2, d);
        } else {
            return pow((int)temp, n / 2, d) * x;
        }
    }
}
