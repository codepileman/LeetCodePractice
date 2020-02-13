package DecodeWays;

public class Main {
    public static void main(String[] args) {
        String s = "226";
        System.out.println(numDecodings(s));
    }
    //for dynamic programming, usually set up an array with correspondent value
    //for each i rather than cumulative value
    public static int numDecodings(String s) {
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= s.length(); i++) {
            int c = Integer.valueOf(s.substring(i-1, i));
            if(c > 0){
                dp[i] = dp[i] + dp[i-1];
            }

            int c1 = Integer.valueOf(s.substring(i-2, i));

            if (c1 >= 10 && c1 <= 26){
                dp[i] += dp[i-2];
            }

        }

        return dp[s.length()];
    }
}
