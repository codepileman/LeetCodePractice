package Permutations2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1};
        List<List<Integer>> res = permuteUnique(nums);

        System.out.println("@@@@@@@@@@@@" + res.size());

//        for (int i = 0; i < res.size(); i++) {
//            for (int j = 0; j < res.get(i).size() ; j++) {
//                System.out.println(res.get(i).get(j));
//            }
//
//            System.out.println("-----------");
//        }
//        System.out.println();
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

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

            System.out.println(i);
            System.out.println("----------");

            if(!used[i]){
                curSeq.add(nums[i]);
                used[i] = true;
                backtracking(nums, res, curSeq, used);
                curSeq.remove(curSeq.size() - 1);
                used[i] = false;
                while(i + 1 < nums.length && nums[i] == nums[i+1]){
                    i++;
                }
            }

        }

    }
}
