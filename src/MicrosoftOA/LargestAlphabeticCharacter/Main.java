package MicrosoftOA.LargestAlphabeticCharacter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println( solution("admeDCAB"));
    }

    public static String solution(String s){
        int[] lower = new int[26];
        int[] upper = new int[26];

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) - 'a' >= 0){
                lower[s.charAt(i) - 'a']++;
            }else{
                upper[s.charAt(i) - 'A']++;
            }

        }

        for(int i =25; i>=0; i--){
            if(upper[i] > 0 && lower[i] > 0) return (char)(i+'A')+"";
        }

        return "No";
    }
}
