package com.company;


import java.util.ArrayList;

public class PrettyPrint {
    public static void main(String args[]) {

        ArrayList<ArrayList<Integer>> out = new PrettyPrint().prettyPrint(5);

    }

    public ArrayList<ArrayList<Integer>> prettyPrint(int n) {
        int size = 2 * n - 1;
        ArrayList<ArrayList<Integer>> out = new ArrayList<>(size);
        for (int j = 0; j < size; j++) {
            ArrayList<Integer> temp = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                temp.add(i, 0);
            }
            out.add(temp);
        }

        for (int i = 0; i < size; i++) {
            for (int p = i; p <= (2 * (n - i - 1) + i); p++) {
                out.get(i).set(p, n - i);
                out.get(p).set(i, n - i);
            }

            int limit = 2 * (n - i - 1) + i;

            for (int p = (2 * (n - i - 1) + i); p >= i; p--) {
                out.get(p).set(limit, n - i);
                out.get(limit).set(p, n - i);
            }
        }
        return out;
    }
}
