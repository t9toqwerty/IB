package com.company;


public class PowerFunction {
    public static void main(String args[]) {
        System.out.println(new PowerFunction().pow(-1, 1, 20));
    }

    public long pow(long x, int n, int d) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
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

    private long calculate(long x, int n, int d) {

        if (n == 1) {
            return x;
        }

        long i = x % d;

        long temp = (i * i) % d;

        if (n % 2 == 0) {

            return pow(temp, n / 2, d);

        } else {

            return (pow(temp, n / 2, d) * x) % d;
        }

    }
}
