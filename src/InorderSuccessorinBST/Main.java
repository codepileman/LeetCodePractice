package InorderSuccessorinBST;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {this.val = val;};
}


public class Main {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p){
        //https://www.youtube.com/watch?v=kdK_5rl1cVw
        if(p.right != null) return findMin(p.right); //如果有右子树，是右子树的最小值。

        TreeNode successor = null;
        while(root != null){
            if(p.val < root.val){
                successor = root;
                root = root.left;
            }else if(p.val > root.val){ //no need to assign successor = root because if there is an answer, it will come back to this finally.
                root = root.right;
            }else{
                break; //root == p
            }
        }

        return successor;

    }

    public TreeNode findMin(TreeNode node){
        while(node.left != null){
            node = node.left;
        }

        return node;
    }
}
