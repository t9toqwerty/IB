package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class PowerOfTwo {

    public static void main(String args[]) {

        String number = "2147483648";

        System.out.println(new PowerOfTwo().power(number));

    }

    private int charArrayListToNum(Character[] quotient) {
        int num = 0;

        for (Character aQuotient : quotient) {
            num = num * 10 + Character.getNumericValue(aQuotient);
        }

        return num;

    }

    public int power(String a) {

        Character[] numArray = charToCharacterArray(a.toCharArray());

        int op = 0;


        if ((Character.getNumericValue(a.charAt(a.length() - 1)) == 0) ||
                (Character.getNumericValue(a.charAt(a.length() - 1)) % 2 != 0)) {
            return 0;
        }

        while (numArray.length > 4) {

            Dividor dividor = this.divide(numArray, 1024);

            Character[] quotient = dividor.quotient;

            if (!dividor.isCompletelyDivisible) {

                return 0;

            }

            if (((quotient[quotient.length - 1]) == 0) ||
                    ((quotient[quotient.length - 1]) / 2 != 0)) {
                return 0;
            }

            numArray = dividor.quotient;

        }

        if (this.hasAnyPowerOfTwo(charArrayListToNum(numArray))) {
            return 1;
        }

        return op;
    }

    private Dividor divide(Character[] a, int b) {

        ArrayList<Character> quotient = new ArrayList<>();

        int reminder = 0;

        for (Character anA : a) {

            reminder = reminder * 10 + Character.getNumericValue(anA);

            quotient.add(Character.forDigit((reminder / b), 10));

            reminder = reminder % b;

        }

        Dividor dividor = new Dividor();

        dividor.quotient = quotient.toArray(new Character[quotient.size()]);

        if (reminder != 0) {

            dividor.isCompletelyDivisible = false;

        }

        dividor.reminder = reminder;

        return dividor;
    }

    private Character[] charToCharacterArray(char[] arr) {

        Character[] characters = new Character[arr.length];

        for (int i = 0; i < arr.length; i++) {
            characters[i] = arr[i];
        }

        return characters;
    }

    private boolean hasAnyPowerOfTwo(int power) {

        ArrayList<Integer> powers = new ArrayList<>(Arrays.asList(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192));

        if (powers.contains(power)) {

            return true;

        }

        return false;

    }

    class Dividor

    {

        boolean isCompletelyDivisible = true;

        int reminder = 0;

        Character[] quotient;

    }
}
