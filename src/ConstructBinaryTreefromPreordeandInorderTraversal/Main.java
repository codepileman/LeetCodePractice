package ConstructBinaryTreefromPreordeandInorderTraversal;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Main {


    //根据preorder的root的index， 通过inorder来构建tree
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, 0, preorder.length-1);
    }

    private static TreeNode helper(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd){
        if(inStart > inEnd || preStart > preorder.length - 1){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);

        int idx = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if(inorder[i] == root.val){
                idx = i;
                break;
            }
        }

        root.left = helper(preorder, inorder, preStart+1, inStart, idx - 1);
        root.right = helper(preorder, inorder, preStart + idx - inStart + 1, idx + 1, inEnd);

        return root;
    }
}
