package Permutations;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = permute(nums);

        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size() ; j++) {
                System.out.println(res.get(i).get(j));
            }

            System.out.println("-----------");
        }
        System.out.println();
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if(nums.length == 0 || nums == null){
            return res;
        }
        boolean[] used = new boolean[nums.length];

        backtracking(nums, res, new ArrayList<>(), used);

        return res;
    }

    private static void backtracking(int[] nums, List<List<Integer>> res, List<Integer> curSeq, boolean[] used){

        if(curSeq.size() == nums.length){
            res.add(new ArrayList<>(curSeq));
            return;
        }


        for (int i = 0; i< nums.length; i++) {
            if(!used[i]){
                curSeq.add(nums[i]);
                used[i] = true;
                backtracking(nums, res, curSeq, used);
                curSeq.remove(curSeq.size() - 1);
                used[i] = false;
            }

        }

    }
}
