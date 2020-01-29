package PermutationSequence;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getPermutation(12, 622702));
    }
    public static String getPermutation(int n, int k) {

        String res = "";

        // set factorial of n
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }


        // initialize all numbers
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        // change k to be index
        k--;

        for (int i = 0; i < n; i++) {
            factorial = factorial/(n-i);
            int index = k/factorial;
            k = k % factorial;
            res += nums.get(index);
            nums.remove(index);

        }

        return res;


    }
}
