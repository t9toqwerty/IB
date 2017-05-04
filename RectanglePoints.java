package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class RectanglePoints {
    public static void main(String args[]) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 6, 6, 0));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(0, 0, 8, 8));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(1, 2, 0, -1, 4));
        ArrayList<Integer> D = new ArrayList<>(Arrays.asList(1, 4, 2, 5, 10));
        System.out.println(new RectanglePoints().solve(A, B, C, D));
    }

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D) {
        int op = 0;

        Integer[] P = {A.get(0), B.get(0)};
        Integer[] Q = {A.get(1), B.get(1)};
        Integer[] R = {A.get(2), B.get(2)};
        Integer[] S = {A.get(3), B.get(3)};
        int i = 0;
        while (i < C.size()) {

            Integer[] M = {C.get(i), D.get(i)};
            double Area1 = area(P, Q, R) + area(P, S, R);
            double Area2 = area(P, M, S) + area(S, M, R) + area(R, M, Q) + area(Q, M, P);
            System.out.println(Area1);
            System.out.println(Area2);
            if (Math.rint(Area1) == Math.rint(Area2)) {
                if ((area(P, M, S) != 0) && (area(S, M, R) != 0) && (area(R, M, Q) != 0) && area(Q, M, P) != 0) {
                    op++;
                }
            }
            i++;
        }
        return op;
    }

    double area(Integer[] P, Integer[] Q, Integer[] R) {
        double area;

        double a = this.distancebetween(P, Q);
        double b = this.distancebetween(Q, R);
        double c = this.distancebetween(R, P);

        double s = (a + b + c) / 2;

        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return area;
    }

    double distancebetween(Integer[] P, Integer[] Q) {
        return Math.sqrt(Math.pow((P[0] - Q[0]), 2) + Math.pow((P[1] - Q[1]), 2));
    }
}
