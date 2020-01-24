package ComboSum3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> res = combinationSum3(3, 7);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.println(res.get(i).get(j));
            }
            System.out.println("------");
        }
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();

        if (k > 10 || n > 45 || k <= 0 || n <= 0){
            return res;
        }

        dfs(res, 1, k, n, new ArrayList<>());
        return res;

    }

    private static void dfs(List<List<Integer>> res, int index, int k, int target, List<Integer> currList){
        if(target == 0 && currList.size() == k){
            res.add(new ArrayList<>(currList));
            return;
        }

        for (int i = index; i < 10; i++) {
            if(target > 0 && currList.size() < k){
                currList.add(i);
                dfs(res, i+1, k, target - i, currList);
                currList.remove(currList.size() - 1);
            }
        }

    }
}
