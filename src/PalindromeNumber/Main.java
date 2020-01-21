package PalindromeNumber;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }


    public static boolean isPalindrome(int x) {
        if (x < 10 && x >= 0){
            return true;
        }

        if (x < 0){
            return false;
        }

        ArrayList<Integer> res = new ArrayList<>();
        int pop;
        while (x != 0){
            pop = x % 10;
            x /= 10;
            res.add(pop);
        }

        int left = 0;
        int right = res.size() - 1;


        while (res.get(left) == res.get(right) && left <= right){
            left++;
            right--;
        }

        if (res.get(left) != res.get(right) ){
            return false;
        }

        return true;
    }
}
