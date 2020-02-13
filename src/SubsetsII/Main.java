package SubsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);

        backtracking(nums, res, 0, new ArrayList<>());

        return res;


    }

    public static void backtracking(int[] nums, List<List<Integer>> res, int index, List<Integer> curList) {

        res.add(new ArrayList<>(curList));

        for(int i = index; i < nums.length; i++) {
            if(i > index && nums[i] == nums[i-1]) {
                continue;
            }
            curList.add(nums[i]);
            backtracking(nums, res, i+1, curList);
            curList.remove(curList.size()-1);
        }
    }
}
