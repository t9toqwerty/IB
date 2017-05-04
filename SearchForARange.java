package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchForARange {
    public static void main(String args[]) {
        ArrayList<Integer> a = new SearchForARange().searchRange(Arrays.asList(1,1,1,1,1,1,1),1);
        System.out.println(a.get(0));
        System.out.println(a.get(1));
    }

    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
        return find(a, 0, a.size() - 1, b);
    }

    public ArrayList<Integer> find(final List<Integer> list, int left, int right, int num) {
        int mid = left + (right - left) / 2;
        ArrayList<Integer> out = new ArrayList<>(2);

        if (mid == left || mid == right) {
            if (list.get(mid) == num) {
                out.add(findLeftRange(list, mid));
                out.add(findRightRange(list, mid));
                return out;
            } else {
                out.add(-1);
                out.add(-1);
                return out;
            }
        }

        if (list.get(mid) == num) {
            out.add(findLeftRange(list, mid));
            out.add(findRightRange(list, mid));
            return out;
        } else if (list.get(mid) > num) {
            return find(list, left, mid, num);
        } else {
            return find(list, mid, right, num);
        }
    }

    private int findLeftRange(final List list, int index) {
        if (index == 0) {
            return index;
        }
        if (list.get(index - 1) != list.get(index)) {
            return index;
        } else {
            return findLeftRange(list, index - 1);
        }
    }

    private int findRightRange(final List list, int index) {
        if (index == list.size() - 1) {
            return index;
        }
        if (list.get(index + 1) != list.get(index)) {
            return index;
        } else {
            return findRightRange(list, index + 1);
        }
    }
}
