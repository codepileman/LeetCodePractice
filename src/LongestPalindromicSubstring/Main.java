package LongestPalindromicSubstring;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("wrabcdedcbaapo"));
    }

    public static String longestPalindrome(String s){

        if (s == null || s.length() < 1) return "";
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int l1 = sizeFromMiddle(s, i, i);
            int l2 = sizeFromMiddle(s, i, i+1);
            int max = l1 > l2 ? l1 : l2;
            //if one axis, (max - 1) / 2 equals to max /2
            //if two axis,
            if (max > end - start){
                start = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }

        return s.substring(start, end + 1);
    }


    public static int sizeFromMiddle(String s, int goLeft, int goRight){
        if (s == null || goLeft > goRight){
            return 0;
        }

        while(goLeft >= 0 && goRight < s.length() && s.charAt(goLeft) == s.charAt(goRight)){
            goLeft--;
            goRight++;
        }


        return goRight - goLeft - 1;
    }
}
