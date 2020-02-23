package BinaryTreeZigzagLevelOrderTraversal;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();

        if(root == null){
            return results;
        }

        LinkedList<TreeNode> container = new LinkedList<TreeNode>();

        container.add(root);
        boolean leftToRight = true;

        while(!container.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = container.size();


            for(int i = 0; i < size; i++){
                TreeNode cur = container.poll();

                if(leftToRight){
                    temp.add(cur.val);
                }else{
                    temp.add(0, cur.val);
                }

                if(cur.left != null) container.add(cur.left);
                if(cur.right != null) container.add(cur.right);


            }

            leftToRight = !leftToRight;

            results.add(temp);
        }

        return results;


    }
}
