package ComboSum2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,2,5};
        List<List<Integer>> res = combinationSum2(nums, 5);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.println(res.get(i).get(j));
            }
            System.out.println("------");
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);

        if(candidates.length == 0 || candidates == null){
            return res;
        }

        dfs(candidates, target, 0, res, new ArrayList<>());

        return res;

    }

    private static void dfs(int[] candidates, int target, int index, List<List<Integer>> res, List<Integer> curSeq){
        if(target == 0){
            res.add(new ArrayList<>(curSeq));
            return;
        }

        if(target > 0){
            for (int i = index; i < candidates.length; i++) {
                if(i != index && candidates[i] == candidates[i-1]) {
                    continue;
                }
                curSeq.add(candidates[i]);
                dfs(candidates, target - candidates[i], i+1, res, curSeq);
                curSeq.remove(curSeq.size() - 1);
            }
        }


    }
}

