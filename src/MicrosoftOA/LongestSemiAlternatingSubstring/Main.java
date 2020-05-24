package MicrosoftOA.LongestSemiAlternatingSubstring;

public class Main {
    public static void main(String[] args) {
        //https://leetcode.com/discuss/interview-question/398037/
        System.out.println(helper("aaaab"));
    }

    public static int helper(String s){
        if(s.length() < 3) return s.length();
        int res = 1;
        int count = 1; //两个都是1，因为从第二个字符开始loop

        for(int i = 1; i<s.length() - 1; i++){
            count++;
            if(s.charAt(i) == s.charAt(i-1) && s.charAt(i) == s.charAt(i+1)){
                res = Math.max(res, count);
                count = 1;
            }
        }

        return Math.max(res, count+1);

    }
}
