package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ip = new ArrayList<>(Arrays.asList(0,0,0,1));
        ArrayList<Integer> op = new Main().plusOne(ip);
        System.out.print(Arrays.toString(op.toArray()));
    }

    public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<>();
        int startZerocount = 0;
        for (int i = a.size() - 1; i >= 0; i--) {
            if (a.get(i) == 0) {
                startZerocount++;
            } else {
                break;
            }
        }
        if (startZerocount == a.size()) {
            b.add(0, 1);
            return b;
        }

        int carry = 0;
        int j = 0;
        for (int i = a.size() - 1; i >= 0; i--) {
            int currentNumber = a.get(i);
            int num;

            if (j == 0) {
                currentNumber += 1;
            }

            if (carry != 0) {
                num = currentNumber + carry;
            } else {
                num = currentNumber;
            }

            int temp = num % 10;
            b.add(temp);
            carry = num / 10;
            j++;
        }
        if (carry != 0) {
            b.add(carry);
        }
        int foo = b.size() - 1;
        while (b.get(foo) == 0) {
            b.remove(foo);
            foo--;
        }
        Collections.reverse(b);
        return b;
    }
}
