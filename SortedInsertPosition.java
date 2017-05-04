package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedInsertPosition {
    public static void main(String args[]) {
        ArrayList<Integer> in = new ArrayList<>(Arrays.asList(1, 3, 5, 6));
        int a = new SortedInsertPosition().searchInsert(in, 4);
        System.out.println(a);
    }

    public int searchInsert(ArrayList<Integer> a, int b) {
        return find(a, 0, a.size() - 1, b);
    }

    public int find(final List<Integer> list, int left, int right, int num) {
        int mid = left + (right - left) / 2;
        int out;
        if (mid == left || mid == right) {
            if (list.get(mid) == num) {
                return mid;
            } else {
                out = findAppropriatePosition(list, mid, num);
                return out;
            }
        }

        if (list.get(mid) == num) {
            return mid;
        } else if (list.get(mid) > num) {
            return find(list, left, mid, num);
        } else {
            return find(list, mid, right, num);
        }
    }

    private int findAppropriatePosition(List<Integer> list, int index, int num) {
        if (index == list.size()) {
            return index;
        }
        if (list.get(index) < num) {
            return findAppropriatePosition(list, index + 1, num);
        }
        return index;
    }
}
