package MicrosoftOA.MinCosttoGetStringWithout2IdenticalConsecutiveLetters;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "ababa";
        int[] C= {10,5,10,5,10};
        System.out.println(solution(s, C));
    }

    public static int solution(String s, int[] C){
        int i = 0;
        int res = 0;
        while(i < s.length()-1){
            if(s.charAt(i) == s.charAt(i+1)){
                List<Integer> cost = new ArrayList<>();
                int max = C[i];
                while(i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)){
                    max = Math.max(max, C[i]);
                    max = Math.max(max, C[i+1]);
                    cost.add(C[i]);
                    i++;
                }

                for(int j = 0; j < cost.size(); j++){
//                    System.out.println(cost.get(j));
                    if(cost.get(j) != max) res += cost.get(j);
                }

            }
            i++;
        }

        return res;

    }
}
