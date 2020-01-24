package ComboSum4;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4, 5};
        int res = combinationSum4(nums, 4);
        System.out.println(res);

    }
    public static int combinationSum4(int[] candidates, int target) {
        if(target == 0){
            return 1;
        }
        Arrays.sort(candidates);

        //use an array to cache the result
        int[] cache = new int[target+1];
        Arrays.fill(cache, -1); // prefill it with -1;

        return dp(candidates, target, cache);

    }


    private static int dp(int[] candidates, int target, int[] cache){

        //check cache first to see if the result has been already calculated
        if(cache[target] != -1){
            return cache[target];
        }

        if(target == 0){
            cache[0] = 1;
            return 1;
        }

        int count = 0;
        for(int num : candidates){
            if(num > target){
                break;
            }
            count += dp(candidates, target - num, cache);
        }

        cache[target] = count;

        return count;

    }

}
