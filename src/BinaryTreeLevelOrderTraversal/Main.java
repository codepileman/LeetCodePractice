package BinaryTreeLevelOrderTraversal;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();

        if(root == null){
            return results;
        }

        Queue<TreeNode> container = new LinkedList<>();


        container.add(root);

        while(!container.isEmpty()){
            List<Integer> result = new ArrayList<>();
            int size = container.size();
            for(int i = 0; i < size; i++){
                TreeNode temp = container.poll();
                result.add(temp.val);
                if(temp.left != null) container.add(temp.left);
                if(temp.right != null) container.add(temp.right);
            }

            results.add(result);


        }

        return results;

    }
}
