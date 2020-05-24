package PathSumII;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Main {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList();

        if(root == null) return res;
        List<Integer> curList = new ArrayList();

        helper(root, sum, 0, res, curList);

        return res;

    }

    public void helper(TreeNode root, int sum, int sub_total, List<List<Integer>> res, List<Integer> curList){
        if(root == null){
            return;
        }

        sub_total += root.val;
        curList.add(root.val);

        if(root != null && root.left == null && root.right == null && sub_total == sum){
            res.add(new ArrayList(curList));

        }


        helper(root.left, sum, sub_total, res, curList);
        helper(root.right, sum, sub_total, res, curList);

        curList.remove(curList.size()-1);



    }
}
