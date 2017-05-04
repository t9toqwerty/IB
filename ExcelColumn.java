package com.company;


public class ExcelColumn {
    public static void main(String args[]) {
        System.out.println(new ExcelColumn().titleToNumber("AAAA"));
    }

    public int titleToNumber(String a) {
        int i, op = 0;
        for (i = a.length() - 1; i >= 0; i--) {
            op += Math.pow(26, i) * getNumericValue(a.charAt(a.length() - 1 - i));
        }
        return op;
    }

    public int getNumericValue(char A) {
        return Character.getNumericValue(A) - 9;
    }
}
