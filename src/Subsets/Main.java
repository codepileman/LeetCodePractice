package Subsets;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        subsets(nums);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0){
            return res;
        }

        helper(0, nums, res, new ArrayList<>());
        return res;
    }

    private static void helper(int index, int[] nums, List<List<Integer>> res, List<Integer> curList){
        res.add(new ArrayList<>(curList));
        for (int i = index; i < nums.length; i++) {
            curList.add(nums[i]);
            helper(i+1, nums, res, curList);
            curList.remove(curList.size()-1);
        }
    }
}
