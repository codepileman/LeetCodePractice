package MinimumDepthofBinaryTree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Main {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;


        //no left, check right
        if(root.left == null){
            return minDepth(root.right) + 1;
        }else if (root.right == null){
            //no right, check left
            return minDepth(root.left) + 1;
        }
        //have both, check min
        return Math.min(minDepth(root.right), minDepth(root.left)) + 1;


    }
}
