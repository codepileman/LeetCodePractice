package MaxDepthBinaryTree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Main {
    public int maxDepth(TreeNode root) {
        return helper(root, 0, 0);
    }

    private int helper(TreeNode root, int depth, int max){

        if(root == null) return depth;

        int left = helper(root.left, depth+1, max);
        int right = helper(root.right, depth+1, max);

        return left > right ? left : right;

    }
}
