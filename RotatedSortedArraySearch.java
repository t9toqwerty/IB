package com.company;

import java.util.Arrays;
import java.util.List;

class RotatedSortedArraySearch {

    public static void main(String args[]) {

        System.out.println(new RotatedSortedArraySearch().search(Arrays.asList(5, 6, 7, 8, 1, 2, 3, 4), 9));

    }

    public int search(final List<Integer> a, int b) {

        return findPosition(a, 0, a.size() - 1, b);
    }

    private int findPosition(final List<Integer> a, int low, int high, int b) {

        if (high < low) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (a.get(mid) == b) {

            return mid;
        }

        if (a.get(mid) <= a.get(high)) {

            if ((b > a.get(mid) && b <= a.get(high))) {

                return findPosition(a, mid + 1, high, b);

            } else {
                return findPosition(a, low, mid - 1, b);
            }

        } else {

            if ((b >= a.get(low) && b < a.get(mid))) {

                return findPosition(a, low, mid - 1, b);

            } else {

                return findPosition(a, mid + 1, high, b);
            }
        }

    }

}
