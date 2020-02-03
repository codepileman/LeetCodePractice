package Combinations;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res = combine(50, 6);
//        for (int i = 0; i < res.size(); i++) {
//            for (int j = 0; j < res.get(i).size(); j++) {
//                System.out.println(res.get(i).get(j));
//            }
//        }
    }
    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res = new ArrayList<>();
        if(n <= 0 || k <= 0){
            return res;
        }
        List<Integer> currentList = new ArrayList<>();
        helper(1, n, k, currentList, res);
        return res;
    }


    private static void helper(int index, int n, int k, List<Integer> currentList, List<List<Integer>> res){
        if(currentList.size() == k){
            res.add(new ArrayList<>(currentList));
        }else{
            for (int i = index; i <= n; i++) {
                currentList.add(i);
                helper(i+1, n, k, currentList, res);
                currentList.remove(currentList.size()-1);
            }
        }
    }
}
