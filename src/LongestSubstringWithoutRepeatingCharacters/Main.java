package LongestSubstringWithoutRepeatingCharacters;


import java.util.HashSet;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        int begin = 0;
        int end = 0;
        int max = 0;

        HashSet<Character> table = new HashSet<>();

        while(end < s.length()){
            char curr = s.charAt(end);
            if (!table.contains(curr)){
                table.add(curr);
                max = max > table.size() ? max : table.size();
                end++;
            }else {
                table.remove(s.charAt(begin));
                begin++;
            }
        }

        return max;
    }
}
