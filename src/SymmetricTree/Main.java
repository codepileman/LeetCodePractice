package SymmetricTree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Main {
    public boolean isSymmetric(TreeNode root) {
        return helper(root, root);
    }

    private static boolean helper(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }

        return (p.val == q.val) && helper(p.left, q.right) && helper(p.right, q.left);

    }
}
