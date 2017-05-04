package com.company;


public class ReverseInt {
    public static void main(String args[]) {
        System.out.println(new ReverseInt().reverse(-1146467285));
    }

    public int reverse(int a) {
        long b = 0;
        while (a / 10 != 0) {
            b = b * 10 + (a % 10);
            if(b>2147483647 || b< -2147483648){
                return 0;
            }
            a = a / 10;
        }
        b = b * 10 + (a % 10);
        if(b>2147483647 || b< -2147483648){
            return 0;
        }
        return (int) b;
    }
}
