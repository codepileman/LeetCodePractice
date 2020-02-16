package BinaryTreeTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Main {
    public List<Integer> inorderRecursiveTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        inorderdfs(res, root);
        return res;

    }

    private static void inorderdfs(List<Integer> res, TreeNode root){
        //in order :left, middle, right
        //pre order: middle, left, right
        //post order: left, right , middle
        if(root == null) return;
        inorderdfs(res, root.left);
        res.add(root.val);
        inorderdfs(res, root.right);
    }


    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Stack<TreeNode> tree = new Stack<>();
        while(root != null || !tree.isEmpty()){
            while (root != null){
                tree.push(root);
                root = root.left;
            }

            root = tree.pop();
            res.add(root.val);
            root = root.right;
        }

        return res;

    }






}
