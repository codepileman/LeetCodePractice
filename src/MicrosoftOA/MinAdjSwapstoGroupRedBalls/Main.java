package MicrosoftOA.MinAdjSwapstoGroupRedBalls;


public class Main {
    public static void main(String[] args) {

        String a = "WR";

        for(int i = 1; i< 10000; i++){
            a += "WR";
        }

        System.out.println(solution(a));
    }

    public static int solution(String s) {
        int i = 0;
        int j = s.length() - 1;
        int res = 0;
        int redCounts = 0;
        for (int k = 0; k < s.length(); k++) {
            if(s.charAt(k) == 'R') redCounts++;
        }

        while(i < j){
            //两边的R往中间移动，如果遇到R,swap就可以少一次，所以要res计算时要-redCounts
            if(s.charAt(i) == 'R' && s.charAt(j) == 'R'){
                redCounts -= 2;
                res += j - i + 1 - redCounts;
                i++;
                j--;
            }else if(s.charAt(i) != 'R'){
                i++;
            }else{
                j--;
            }
        }

        return res;

    }


}


