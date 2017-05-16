package com.company;

public class ReverseBits {

    public static void main(String args[]) {

        System.out.println(new ReverseBits().reverse(3L));

    }

    public long reverse(long a) {

        long op = 0;

        StringBuilder binNum = new StringBuilder(Long.toBinaryString(a));

        int length = binNum.length();

        for (int i = 31; i >= length; i--) {

            binNum.insert(0, 0);

        }

        StringBuilder i1 = new StringBuilder();

        for (int i = 0; i < binNum.length(); i++) {

            i1 = i1.append(binNum.charAt(binNum.length() - 1 - i));

        }


        for (int i = i1.length() - 1; i >= 0; i--) {
            int power = i1.length() - 1 - i;


            int multiplier = Character.getNumericValue(i1.charAt(i));

            op = op + (long) (Math.pow(2, power) * multiplier);
        }

        return op;
    }
}
