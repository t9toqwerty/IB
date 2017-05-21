package com.company;

public class ReverseTheString {
    public static void main(String args[]) {
        System.out.println(new ReverseTheString().reverseWords("fwbpudnbrozzifml osdt  ulc jsx kxorifrhubk ouhsuhf  sswz qfho dqmy  sn myq igjgip iwfcqq"));
    }

    public String reverseWords(String a) {
        String[] exploded = a.trim().split(" ");

        StringBuilder opStr = new StringBuilder();

        for (int i = exploded.length - 1; i >= 0; i--) {
            if (exploded[i].length() > 0) {
                opStr.append(exploded[i].trim()).append(" ");
            }
        }

        return opStr.toString().trim();
    }
}
