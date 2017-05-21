package com.company;

import java.util.ArrayList;

public class PowerOfTwo {

    public static void main(String args[]) {

        Character[] number = {'4', '2', '0', '0', '0', '5'};

        System.out.println(new PowerOfTwo().divide(number, 2));

    }

    public int charArrayListToNum(Character[] quotient) {
        int num = 0;

        for (Character aQuotient : quotient) {
            num = num * 10 + Character.getNumericValue(aQuotient);
        }

        return num;

    }

    public int power(String a) {

        Character[] numArray = charToCharacterArray(a.toCharArray());

        int op = 0;

        if ((a.charAt(a.length() - 1) == 0) || ((a.charAt(a.length() - 1)) / 2 != 0)) {
            return 0;
        }

        Dividor dividor = divide(numArray, 1024);

        if (!dividor.isCompletelyDivisible) {

            return 0;

        }

        Character[] quotient = dividor.quotient;

        if ((((quotient[quotient.length - 1])) == 0) ||
                (((quotient[quotient.length - 1]) / 2 != 0))) {
            return 0;
        }

        while (quotient.length > 4 && this.charArrayListToNum(quotient) > 1024) {


            Dividor divided = this.divide(numArray, 1024);

            numArray = divided.quotient;

        }

        return op;
    }

    public Dividor divide(Character[] a, int b) {

        ArrayList<ArrayList<Integer>> output = new ArrayList<>(2);

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

    public Character[] charToCharacterArray(char[] arr) {

        Character[] characters = new Character[arr.length];

        for (int i = 0; i < arr.length; i++) {
            characters[i] = arr[i];
        }

        return characters;
    }

    class Dividor

    {

        boolean isCompletelyDivisible = true;

        int reminder = 0;

        Character[] quotient;

    }
}
