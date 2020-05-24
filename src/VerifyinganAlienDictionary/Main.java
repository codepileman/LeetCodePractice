package VerifyinganAlienDictionary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[2];
        words[0] = "word";
        words[1] = "world";
        String order = "worldabcefghijkmnpqstuvxyz";
        System.out.println(isAlienSorted(words, order));

    }


    public static boolean isAlienSorted(String[] words, String order) {
        int[] char_map = new int[26];
        for (int i = 0; i < order.length(); i++) {
            char_map[order.charAt(i) - 'a'] = i;
        }

        for (int i = 1; i < words.length; i++) {
            if (!compare(words[i - 1], words[i], char_map)) return false;
        }

        return true;

    }

    public static boolean compare(String s1, String s2, int[] char_map) {
        int i = 0;

        while (i < s1.length() && i < s2.length()) {

            if (char_map[s1.charAt(i) - 'a'] < char_map[s2.charAt(i) - 'a']) {
                return true;
            }else if(char_map[s1.charAt(i) - 'a'] > char_map[s2.charAt(i) - 'a']){
                return false;
            }
            i++;

        }

        if (s1.length() <= s2.length()) return true;
        if (s1.length() > s2.length()) return false;

        return false;
    }
}