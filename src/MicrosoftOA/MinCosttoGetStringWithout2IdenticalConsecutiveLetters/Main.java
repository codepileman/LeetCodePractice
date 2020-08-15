package MicrosoftOA.MinCosttoGetStringWithout2IdenticalConsecutiveLetters;


public class Main  {
    public static void main(String[] args) {
        String s = "ababa";
        int[] C= {10,5,10,5,10};
        System.out.println(solution(s, C));
    }
    public static int solution(String S, int[] C){
        int total = 0;
        int len = S.length();
        int max = 0;
        int i = 0;

        while(i < len - 1){
            while(i < len - 1 && S.charAt(i) == S.charAt(i+1)){
                max = Math.max(max, C[i]);
                total += C[i];
                i++;
            }
            //if aaaa, need to consider this situation.
            if(i > 0 && S.charAt(i) == S.charAt(i-1)){
                max = Math.max(max, C[i]);
                total  += C[i];
                total -= max;
            }


            i++;
        }

        return total;

    }
}
