package ConstructBinaryTreefromInorderandPostorderTraversal;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Main {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, postorder, postorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode helper(int[] inorder, int[] postorder, int posStart, int inStart, int inEnd){
        if (posStart < 0 || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(postorder[posStart]);

        int index = 0;

        for(int i = inStart; i <= inEnd; i++){
            if(inorder[i] == postorder[posStart]){
                index = i;
                break;
            }
        }

        root.left = helper(inorder, postorder, posStart - (inEnd - index + 1), inStart, index - 1 );
        root.right = helper(inorder, postorder, posStart -1, index + 1, inEnd);

        return root;

    }

}
