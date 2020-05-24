package PalindromePermutation;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(canPermutatePalindrome("carerac"));
    }
    public static boolean canPermutatePalindrome(String s){
        if(s == null || s.length() == 0) return true;

        HashSet<Character> set = new HashSet();
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
            }else{
                set.add(c);
            }
        }

        if(s.length() % 2 == 0){
            return set.size() == 0;
        }else{
            return set.size() == 1;
        }

    }
}
