package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegSubArray {

    public static void main(String args[]) {

        ArrayList<Integer> ip = new ArrayList<>(Arrays.asList(0, 0, -1, 0));
        MaxNonNegSubArray mna = new MaxNonNegSubArray();
        System.out.print(Arrays.toString(mna.maxset(ip).toArray()));
    }

    public ArrayList<Integer> maxset(ArrayList<Integer> a) {

        ArrayList<Integer> last = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();

        long last_sum = 0;
        long current_sum = 0;
        boolean _break = false;

        for (int i = 0; i < a.size(); i++) {

            if (current.size() == 0 && a.get(i) < 0) {
                continue;
            }
            if (_break) {

                if (last_sum == current_sum) {
                    if (last.size() < current.size()) {
                        last = (ArrayList<Integer>) current.clone();
                        last_sum = current_sum;
                    }
                }

                if (last_sum < current_sum) {
                    last = (ArrayList<Integer>) current.clone();
                    last_sum = current_sum;
                }
                current.clear();
                current_sum = 0;
                _break = false;
            }
            if (a.get(i) >= 0) {

                current.add(a.get(i));
                current_sum = current_sum + a.get(i);

            } else {
                while (i < a.size() && a.get(i) < 0) {
                    i++;
                    _break = true;
                }
                i--;
            }

        }

        if (last_sum == current_sum) {
            if (last.size() > current.size()) {
                return last;
            }
            return current;
        }

        if (last_sum < current_sum) {
            last_sum = current_sum;
            last = (ArrayList<Integer>) current.clone();
        }

        return last;
    }

}
