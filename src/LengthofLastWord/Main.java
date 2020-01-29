package LengthofLastWord;

public class Main {
    public static int lengthOfLastWord(String s) {

        int i = s.length()-1;
        boolean nonSpace = false;
        int res = 0;
        while(i >= 0) {
            char c =  s.charAt(i);
            if(nonSpace && c == ' ') {
                return res;
            }
            if(c != ' ') {
                nonSpace = true;
                res++;
            }
            i--;

        }

        return res;
    }
}
