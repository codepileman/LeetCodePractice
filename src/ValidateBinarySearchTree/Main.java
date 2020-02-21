package ValidateBinarySearchTree;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

public class Main {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean helper(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }

        if (root.val >= max || root.val <= min){
            return false;
        }


        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}
