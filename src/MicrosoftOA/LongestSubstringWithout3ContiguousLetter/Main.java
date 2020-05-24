package MicrosoftOA.LongestSubstringWithout3ContiguousLetter;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestSubstr("aabbaa"));
    }

    public static String longestSubstr(String s){
        if(s.length() < 3) return s;

        int max = 0;
        int p1 = 0;
        int p2 = 0;
        int[] pos = {p1, p2};

        while(p2 < s.length() - 2){
            if(s.charAt(p2+2) == s.charAt(p2) && s.charAt(p2+1) == s.charAt(p2)){
                if (p2 + 2 - p1 > max){
                    max = p2 + 2 - p1;
                    pos[0] = p1;
                    pos[1] = p2 + 2;
                }
                p1 = p2 + 1;
                p2 = p2 + 1;
            }else{
                if(p2 - p1 + 1 > max){
                    max = p2 - p1 + 1;
                    pos[0] = p1;
                    pos[1] = p2 + 1;
                }
                p2 += 1;
            }
        }

        if(s.length() - p1 > max){//如果整个string都没有超过2个连续的字母
            max = s.length() - p1;
            pos[0] = p1;
            pos[1] = s.length();
        }

        return s.substring(pos[0], pos[1]);

    }
}
