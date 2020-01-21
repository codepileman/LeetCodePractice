package RomantoInteger;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }


    public static int romanToInt(String s) {
        int res = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

//        int[] list = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
////        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int i = 0;
        while(i<s.length()) {
            String str = Character.toString(s.charAt(i));
            if(i < s.length()-1){
                String str2 = Character.toString(s.charAt(i)) + Character.toString(s.charAt(i+1));
                if (map.containsKey(str2)){
                    res += map.get(str2);
                    i += 2;
                }else{
                    res += map.get(str);
                    i++;
                }

            }else{
                res += map.get(str);
                i++;
            }
        }


        return res;


    }
}
