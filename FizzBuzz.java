package com.company;

import java.util.ArrayList;

public class FizzBuzz {

    public static void main(String args[]) {

    }

    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> fin = new ArrayList<>();
        for (int i = 1; i <= A; i++) {
            String op = "";
            if ((i % 3 != 0) && (i % 5 != 0)) {
                op += i;
            }
            if (i % 3 == 0) {
                op += "Fizz";
            }
            if (i % 5 == 0) {
                op += "Buzz";
            }
            fin.add(op);
        }
        return fin;
    }
}
