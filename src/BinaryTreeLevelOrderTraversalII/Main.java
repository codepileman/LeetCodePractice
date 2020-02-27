package BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Main {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> container = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        container.add(root);

        while(!container.isEmpty()){
            List<Integer> curList = new ArrayList<>();
            int size = container.size();
            for(int i = 0; i < size; i++){

                TreeNode temp = container.poll();
                curList.add(temp.val);
                if(temp.left != null) container.add(temp.left);
                if(temp.right != null) container.add(temp.right);
            }
            res.add(0, curList);

        }

        return res;

    }
}
