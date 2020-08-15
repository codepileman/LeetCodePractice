package MicrosoftOA.CountOfHoursVariations;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(1,0,0,2));
        System.out.println(solution(2,1,2,1));
        System.out.println(solution(1,4,8,2));
        System.out.println(solution(4,4,4,4));
    }

    public static int solution(int A, int B, int C, int D){
        int[] input = new int[]{A, B, C, D};
        boolean[] used = new boolean[4];
        Arrays.fill(used, false);
        Set<List<Integer>> set = new HashSet<>();
        backtracking(input, new ArrayList(), used, set);
        return set.size();
    }

    public static void backtracking(int[] input, List<Integer> cur, boolean[] used, Set<List<Integer>> set){
        if(cur.size() == 4){
            if(cur.get(0) * 10 + cur.get(1) < 24 && cur.get(2) * 10 + cur.get(3) < 60){
                set.add(new ArrayList<>(cur));
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if(!used[i]){
                cur.add(input[i]);
                used[i] = true;
                backtracking(input, cur, used, set);
                cur.remove(cur.size()-1);
                used[i] = false;
            }
        }
    };
}
